package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.PartnerLandingActivity */
public interface PartnerLandingActivity {
    String getContentType();

    String getHeader(String str);

    InputStream getMessagePayload() throws IOException;

    String getMethod();

    String getRequestUrl();

    void setHeader(String str, String str2);

    void setRequestUrl(String str);

    Object unwrap();
}
