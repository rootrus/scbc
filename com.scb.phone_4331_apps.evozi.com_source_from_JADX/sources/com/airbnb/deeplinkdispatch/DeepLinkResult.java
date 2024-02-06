package com.airbnb.deeplinkdispatch;

public final class DeepLinkResult {
    private final String error;
    private final boolean successful;
    private final String uriString;

    public DeepLinkResult(boolean z, String str, String str2) {
        this.successful = z;
        this.uriString = str;
        this.error = str2;
    }

    public final boolean isSuccessful() {
        return this.successful;
    }

    public final String uriString() {
        return this.uriString;
    }

    public final String error() {
        return this.error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
        if (this.successful != deepLinkResult.successful) {
            return false;
        }
        String str = this.uriString;
        if (str == null ? deepLinkResult.uriString != null : !str.equals(deepLinkResult.uriString)) {
            return false;
        }
        String str2 = this.error;
        String str3 = deepLinkResult.error;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.successful;
        String str = this.uriString;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.error;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeepLinkResult{successful=");
        sb.append(this.successful);
        sb.append(", uriString=");
        sb.append(this.uriString);
        sb.append(", error='");
        sb.append(this.error);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
