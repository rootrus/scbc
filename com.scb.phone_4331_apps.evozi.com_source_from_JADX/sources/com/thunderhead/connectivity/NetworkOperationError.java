package com.thunderhead.connectivity;

public abstract class NetworkOperationError {
    public Body body;

    /* renamed from: ex */
    public Throwable f3121ex;
    public int httpStatusCode = -1;
    public Kind kind;
    public String message;

    public enum Kind {
        HTTP,
        INTERNAL
    }

    public Throwable getException() {
        return this.f3121ex;
    }

    public String getMessage() {
        return this.message;
    }

    public Kind getKind() {
        return this.kind;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public static class Body {
        String mimeType;
        String rawBody;

        public String getMimeType() {
            return this.mimeType;
        }

        public void setMimeType(String str) {
            this.mimeType = str;
        }

        public String getRawBody() {
            return this.rawBody;
        }

        public void setRawBody(String str) {
            this.rawBody = str;
        }
    }

    public Body getBody() {
        return this.body;
    }
}
