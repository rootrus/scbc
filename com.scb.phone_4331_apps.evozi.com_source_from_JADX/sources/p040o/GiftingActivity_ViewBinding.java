package p040o;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLInitializationException;

@Deprecated
/* renamed from: o.GiftingActivity_ViewBinding */
public class GiftingActivity_ViewBinding {
    public List<getAction> read;

    public GiftingActivity_ViewBinding() {
    }

    public static SSLContext write() throws SSLInitializationException {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new SSLInitializationException(e.getMessage(), e);
        } catch (KeyManagementException e2) {
            throw new SSLInitializationException(e2.getMessage(), e2);
        }
    }

    public GiftingActivity_ViewBinding(List<getAction> list) {
        this.read = list;
    }
}
