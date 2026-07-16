package com.phelim.gateway_vertx_project.integration.module;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import lombok.extern.slf4j.Slf4j;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.core.MultivaluedMap;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

@Slf4j
public class CallApiModule {
    public String callAPI(String api, String body, String contentType, String method) {
        log.info("[CallApiModule][callAPI] {} Da vao ham ", method);
        String output;
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Client client = hostIgnoringClient();
        log.info("[CallApiModule][callAPI] {} Client.create()", method);
        WebResource webResource = client.resource(api);
        client.setConnectTimeout(60000);
        client.setReadTimeout(60000);
        ClientResponse response = webResource.type(contentType)
                .post(ClientResponse.class, body);
        log.info("[CallApiModule][callAPI] {} response  {}", method, response);
        output = response.getEntity(String.class);
        log.info("[CallApiModule][callAPI] {} output {}", method, output);
        return output;
    }

    public String callAPI(String api, String body, String contentType, String method, String appkey) {
        log.info("[CallApiModule][callAPI] {} Da vao ham ", method);
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, new TrustManager[]{new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Client client = hostIgnoringClient();
        log.info("[CallApiModule][callAPI] {} Client.create()", method);
        WebResource webResource = client.resource(api);
        client.setConnectTimeout(30000);
        client.setReadTimeout(30000);
        ClientResponse response = webResource.queryParams(new MultivaluedMapImpl())
                .header("Content-Type", contentType)
//                .header("SOAPAction","\"#POST\"")
                .header("Authorization", "Bearer " + appkey)// appKey is unique number
                .post(ClientResponse.class, body);

        log.info("[CallApiModule][callAPI] {} response  {}", method, response);
        String output = response.getEntity(String.class);
        log.info("[CallApiModule][callAPI] {} output {}", method, output);
        return output;
    }

    public Client hostIgnoringClient() {
        try {
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, null, null);
            DefaultClientConfig config = new DefaultClientConfig();
            config.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
                    new HTTPSProperties(
                            (s, sslSession) -> true, sslcontext
                    ));
            return Client.create(config);
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String callhttpAPI(String api, String body, String contentType, String method) {
        log.info("[CallApiModule][callAPI] {} Da vao ham ", method);
        String output;
        Client client = Client.create();
        log.info("[CallApiModule][callAPI] {} Client.create()", method);
        WebResource webResource = client.resource(api);
        client.setConnectTimeout(60000);
        client.setReadTimeout(60000);
        ClientResponse response = webResource.type(contentType)
                .post(ClientResponse.class, body);
        log.info("[CallApiModule][callAPI] {} response  {}", method, response);
        output = response.getEntity(String.class);
        log.info("[CallApiModule][callAPI] {} output {}", method, output);
        return output;
    }

    public String callAPI2(String api, String body, String contentType, String method, String appkey) {
        log.info("[CallApiModule][callAPI] {} Da vao ham ", method);
        String output;
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Client client = hostIgnoringClient();
        log.info("[CallApiModule][callAPI] {} Client.create()", method);
        WebResource webResource = client.resource(api);
        client.setConnectTimeout(60000);
        client.setReadTimeout(60000);
        MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
        String appKey = "Bearer " + appkey; // appKey is unique number

        ClientResponse response = webResource.queryParams(queryParams)
                .header("Content-Type", contentType)
//                .header("SOAPAction","\"#POST\"")
                .header("Authorization", appKey)
                .post(ClientResponse.class, body);

        log.info("[CallApiModule][callAPI] {} response  {}", method, response);
        output = response.getEntity(String.class);
        log.info("[CallApiModule][callAPI] {} output {}", method, output);
        return output;
    }
}

