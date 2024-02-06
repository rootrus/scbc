package okhttp3.internal.platform;

import javax.net.ssl.SSLSession;
import org.conscrypt.ConscryptHostnameVerifier;

final class ConscryptPlatform$configureTrustManager$1 implements ConscryptHostnameVerifier {
    public static final ConscryptPlatform$configureTrustManager$1 INSTANCE = new ConscryptPlatform$configureTrustManager$1();

    ConscryptPlatform$configureTrustManager$1() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return true;
    }
}
