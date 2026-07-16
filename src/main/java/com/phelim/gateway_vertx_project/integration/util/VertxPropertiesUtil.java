package com.phelim.gateway_vertx_project.integration.util;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.phelim.gateway_vertx_project.exception.CommonExceptions;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;

@Slf4j
public class VertxPropertiesUtil {

    public static Object loadProperties(String config, Object moduleConfig) {
        try {
            log.info("[VertxPropertiesUtil][loadProperties] Loading properties");
            moduleConfig = new Gson().fromJson(config, moduleConfig.getClass());
            checkValidationAllProperty(moduleConfig, "config file");
            log.info("[VertxPropertiesUtil][loadProperties] Properties loaded successfully");
            return moduleConfig;
        } catch (JsonSyntaxException e) {
            log.error("[VertxPropertiesUtil][loadProperties] Invalid config cause {}, Properties loaded failed", e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        } catch (CommonExceptions.InvalidConfig e) {
            log.error("Properties loaded failed {}", e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        } catch (Exception e) {
            log.error("[VertxPropertiesUtil][loadProperties] Unknown error cause by {}, Properties loaded failed", e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        }
    }

    public static void checkValidation(Object obj) {
        try {
            if (obj == null) {
                throw new CommonExceptions.InvalidConfig("Object is null");
            }
            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (f.get(obj) == null) {
                    throw new CommonExceptions.InvalidConfig("config " + f.getName() + " is null");
                }
            }
        } catch (IllegalAccessException e) {
            log.error("[VertxPropertiesUtil][loadProperties] Error with accessible object cause by {}, Properties loaded failed ", e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        }
    }

    private static void checkValidationAllProperty(Object obj, String configName) {
        try {
            if (obj == null) {
                throw new CommonExceptions.InvalidConfig("Object is null");
            }
            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (f.get(obj) == null) {
                    throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is null");
                }
//                log.debug("type: {}",f.get(obj).getClass().getSimpleName().toLowerCase());
                switch (f.get(obj).getClass().getSimpleName().toLowerCase()) {
                    case "string":
                        break;
                    case "integer":
                        if ((Integer) f.get(obj) < 0)
                            throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is is negative");
                        break;
                    case "boolean":
                        break;
                    case "long":
                        if ((Long) f.get(obj) < 0)
                            throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is is negative");
                        break;
                    case "double":
                        if ((Double) f.get(obj) < 0)
                            throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is is negative");
                        break;
                    case "bigdecimal":
                        if (((BigDecimal) f.get(obj)).compareTo(new BigDecimal(0)) < 0)
                            throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is is negative");
                        break;
                    case "biginteger":
                        if (((BigInteger) f.get(obj)).compareTo(BigInteger.valueOf(0)) < 0)
                            throw new CommonExceptions.InvalidConfig("config " + f.getName() + " in " + configName + " is is negative");
                        break;
                    default:
                        checkValidationAllProperty(f.get(obj), f.getName());
                        break;
                }
            }
        } catch (CommonExceptions.InvalidConfig e) {
            log.error("[VertxPropertiesUtil][loadProperties] Invalid config: {} - {}", configName, e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        } catch (IllegalAccessException e) {
            log.error("[VertxPropertiesUtil][loadProperties] Error with accessible object cause by {}, Properties loaded failed", e.getMessage());
            throw new CommonExceptions.InvalidConfig(e.getMessage());
        }

    }

    public static String decodeStringFile(String fileName) throws Exception {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder result = new StringBuilder();
        String sCurrentLine;

        while ((sCurrentLine = br.readLine()) != null) {
            result.append(sCurrentLine);
        }
        return result.toString();
    }

    public static byte[] decodeByteFile(String fileName) throws Exception {
        File f = new File(fileName);
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[fis.available()];
        dis.readFully(keyBytes);
        dis.close();
        return keyBytes;
    }
}

