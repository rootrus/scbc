package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class Jdk9Platform extends Platform {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public final Method getProtocolMethod;
    public final Method setProtocolMethod;

    public Jdk9Platform(Method method, Method method2) {
        onGetStartedClick.write((Object) method, "setProtocolMethod");
        onGetStartedClick.write((Object) method2, "getProtocolMethod");
        this.setProtocolMethod = method;
        this.getProtocolMethod = method2;
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
            Method method = this.setProtocolMethod;
            Object[] objArr = new Object[1];
            Object[] array = alpnProtocolNames.toArray(new String[0]);
            if (array != null) {
                objArr[0] = array;
                method.invoke(sSLParameters, objArr);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set SSL parameters", e2);
        }
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "socket");
        try {
            String str = (String) this.getProtocolMethod.invoke(sSLSocket, new Object[0]);
            if (str == null || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            try {
                Method method = SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
                Method method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                onGetStartedClick.IconCompatParcelizer((Object) method, "setProtocolMethod");
                onGetStartedClick.IconCompatParcelizer((Object) method2, "getProtocolMethod");
                return new Jdk9Platform(method, method2);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }
}
