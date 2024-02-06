package p040o;

import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

@Deprecated
/* renamed from: o.GiftingPresentReviewActivity */
public interface GiftingPresentReviewActivity extends HostnameVerifier {
    void read(String str, SSLSocket sSLSocket) throws IOException;

    void write(String str, String[] strArr, String[] strArr2) throws SSLException;
}
