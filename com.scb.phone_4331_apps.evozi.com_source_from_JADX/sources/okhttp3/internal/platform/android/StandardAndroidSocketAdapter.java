package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.internal.Util;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        onGetStartedClick.write((Object) cls, "sslSocketClass");
        onGetStartedClick.write((Object) cls2, "sslSocketFactoryClass");
        onGetStartedClick.write((Object) cls3, "paramClass");
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    public final boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        Object readFieldOrNull = Util.readFieldOrNull(sSLSocketFactory, this.paramClass, "sslParameters");
        if (readFieldOrNull == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        X509TrustManager x509TrustManager = (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) Util.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(str);
        }

        public final SocketAdapter buildIfSupported(String str) {
            StandardAndroidSocketAdapter standardAndroidSocketAdapter;
            onGetStartedClick.write((Object) str, "packageName");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                Class<?> cls = Class.forName(sb.toString());
                if (cls != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".OpenSSLSocketFactoryImpl");
                    Class<?> cls2 = Class.forName(sb2.toString());
                    if (cls2 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(".SSLParametersImpl");
                        Class<?> cls3 = Class.forName(sb3.toString());
                        onGetStartedClick.IconCompatParcelizer((Object) cls3, "paramsClass");
                        standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls, cls2, cls3);
                        return standardAndroidSocketAdapter;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            } catch (Exception e) {
                UtilKt.androidLog(5, "unable to load android socket classes", e);
                standardAndroidSocketAdapter = null;
            }
        }
    }
}
