package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Method getAlpnSelectedProtocol = this.sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
    private final Method setAlpnProtocols = this.sslSocketClass.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    private final Method setHostname = this.sslSocketClass.getMethod("setHostname", new Class[]{String.class});
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) {
        onGetStartedClick.write((Object) cls, "sslSocketClass");
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        onGetStartedClick.IconCompatParcelizer((Object) declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
    }

    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        if (matchesSocket(sSLSocket)) {
            if (str != null) {
                try {
                    this.setUseSessionTickets.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.setHostname.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.setAlpnProtocols.invoke(sSLSocket, new Object[]{Platform.Companion.concatLengthPrefixed(list)});
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        if (!matchesSocket(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            onGetStartedClick.IconCompatParcelizer((Object) charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final SocketAdapter buildIfSupported(String str) {
            AndroidSocketAdapter androidSocketAdapter;
            onGetStartedClick.write((Object) str, "packageName");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                Class<?> cls = Class.forName(sb.toString());
                if (cls != null) {
                    androidSocketAdapter = new AndroidSocketAdapter(cls);
                    return androidSocketAdapter;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            } catch (Exception e) {
                UtilKt.androidLog(5, "unable to load android socket classes", e);
                androidSocketAdapter = null;
            }
        }
    }
}
