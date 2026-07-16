package com.phelim.gateway_vertx_project.exception;

public class CommonExceptions {

    public static class InvalidConfig extends BaseException {

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        public InvalidConfig(String msg) {
            super(msg);
        }

        public InvalidConfig(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class BadRequest extends BaseException {
        public BadRequest(String msg) {
            super(msg);
        }

        public BadRequest(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class Unsupported extends BaseException {
        public Unsupported(String msg) {
            super(msg);
        }

        public Unsupported(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class FailureStartup extends BaseException {
        public FailureStartup(String msg) {
            super(msg);
        }

        public FailureStartup(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class ConnectionError extends BaseException {

        public ConnectionError(String msg) {
            super(msg);
        }

        public ConnectionError(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class ValidationError extends BaseException {

        public ValidationError(String msg) {
            super(msg);
        }

        public ValidationError(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class TimeoutException extends BaseException {

        public TimeoutException(String msg) {
            super(msg);
        }

        public TimeoutException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class GenerateException extends BaseException {

        public GenerateException(String msg) {
            super(msg);
        }

        public GenerateException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class UpdateExceptionDenied extends BaseException {

        public UpdateExceptionDenied(String msg) {
            super(msg);
        }

        public UpdateExceptionDenied(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class UpdateExceptionOTP extends BaseException {

        public UpdateExceptionOTP(String msg) {
            super(msg);
        }

        public UpdateExceptionOTP(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class UpdateExceptionApprove extends BaseException {

        public UpdateExceptionApprove(String msg) {
            super(msg);
        }

        public UpdateExceptionApprove(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class MappingObjectException extends BaseException {

        public MappingObjectException(String msg) {
            super(msg);
        }

        public MappingObjectException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class DtoError extends BaseException {

        public DtoError(String msg) {
            super(msg);
        }

        public DtoError(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class ForbiddenError extends BaseException {

        public ForbiddenError(String msg) {
            super(msg);
        }

        public ForbiddenError(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class NumberConvertException extends BaseException {

        public NumberConvertException(String msg) {
            super(msg);
        }

        public NumberConvertException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class XMLConvertException extends BaseException {
        public XMLConvertException(String msg) {
            super(msg);
        }

        public XMLConvertException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class MqRPCError extends BaseException {

        public MqRPCError(String msg) {
            super(msg);
        }

        public MqRPCError(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public static class BranchNotMatchException extends BaseException {

        public BranchNotMatchException(String msg) {
            super(msg);
        }

        public BranchNotMatchException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }
}


