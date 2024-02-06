package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.PartnerConsentActivity */
public final class PartnerConsentActivity implements PartnerLandingActivity {
    private String write;

    public final String getContentType() {
        return null;
    }

    public final String getHeader(String str) {
        return null;
    }

    public final InputStream getMessagePayload() throws IOException {
        return null;
    }

    public final String getMethod() {
        return "GET";
    }

    public final void setHeader(String str, String str2) {
    }

    public PartnerConsentActivity(String str) {
        this.write = str;
    }

    public final String getRequestUrl() {
        return this.write;
    }

    public final void setRequestUrl(String str) {
        this.write = str;
    }

    public final Object unwrap() {
        return this.write;
    }
}
