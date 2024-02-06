package p040o;

import android.util.Log;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: o.CustomStatementChannelViewComponent */
public class CustomStatementChannelViewComponent implements X509TrustManager {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = CustomStatementChannelViewComponent.class.getName();
    private static final X509Certificate[] MediaBrowserCompat$ItemReceiver = new X509Certificate[0];

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static KeyStore IconCompatParcelizer() {
        InputStream inputStream;
        KeyStore keyStore = null;
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            inputStream = setRecipients.MediaMetadataCompat().PlaybackStateCompat;
            Certificate generateCertificate = instance.generateCertificate(inputStream);
            StringBuilder sb = new StringBuilder();
            sb.append(((X509Certificate) generateCertificate).getSubjectDN());
            Log.d("ca={}", sb.toString());
            inputStream.close();
            KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                instance2.load((InputStream) null, (char[]) null);
                instance2.setCertificateEntry("ca", generateCertificate);
                return instance2;
            } catch (Exception unused) {
                keyStore = instance2;
            }
        } catch (Exception unused2) {
            Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Error during getting keystore");
            return keyStore;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
