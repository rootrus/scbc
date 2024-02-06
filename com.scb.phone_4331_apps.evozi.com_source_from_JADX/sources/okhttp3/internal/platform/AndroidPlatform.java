package okhttp3.internal.platform;

import android.os.Build;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.platform.android.UtilKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class AndroidPlatform extends Platform {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    /* access modifiers changed from: private */
    public static final boolean isSupported;
    private final CloseGuard closeGuard;
    private final List<SocketAdapter> socketAdapters;

    public AndroidPlatform() {
        SocketAdapter[] socketAdapterArr = {StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, (String) null, 1, (Object) null), ConscryptSocketAdapter.INSTANCE.buildIfSupported(), new DeferredSocketAdapter("com.google.android.gms.org.conscrypt")};
        onGetStartedClick.write((Object) socketAdapterArr, "elements");
        onGetStartedClick.write((Object) socketAdapterArr, "$this$filterNotNull");
        Collection arrayList = new ArrayList();
        for (Object next : (List) HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver((T[]) socketAdapterArr, new ArrayList())) {
            if (((SocketAdapter) next).isSupported()) {
                arrayList.add(next);
            }
        }
        this.socketAdapters = (List) arrayList;
        this.closeGuard = CloseGuard.Companion.get();
    }

    public final void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        onGetStartedClick.write((Object) socket, "socket");
        onGetStartedClick.write((Object) inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object obj;
        onGetStartedClick.write((Object) sSLSocketFactory, "sslSocketFactory");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.trustManager(sSLSocketFactory);
        }
        return null;
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object obj;
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        Object obj;
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        Iterator it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).matchesSocket(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    public final void log(int i, String str, Throwable th) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        UtilKt.androidLog(i, str, th);
    }

    public final Object getStackTraceForCloseable(String str) {
        onGetStartedClick.write((Object) str, "closer");
        return this.closeGuard.createAndOpen(str);
    }

    public final void logCloseableLeak(String str, Object obj) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        if (!this.closeGuard.warnIfOpen(obj)) {
            log(5, str, (Throwable) null);
        }
    }

    public final boolean isCleartextTrafficPermitted(String str) {
        onGetStartedClick.write((Object) str, "hostname");
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            onGetStartedClick.IconCompatParcelizer((Object) cls, "networkPolicyClass");
            onGetStartedClick.IconCompatParcelizer(invoke, "networkSecurityPolicy");
            return api24IsCleartextTrafficPermitted(str, cls, invoke);
        } catch (ClassNotFoundException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (NoSuchMethodException unused2) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            throw new AssertionError("unable to determine cleartext support", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("unable to determine cleartext support", e3);
        }
    }

    private final boolean api24IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            Object invoke = cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str});
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (NoSuchMethodException unused) {
            return api23IsCleartextTrafficPermitted(str, cls, obj);
        }
    }

    private final boolean api23IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            Object invoke = cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    public final CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        onGetStartedClick.write((Object) x509TrustManager, "trustManager");
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            Object newInstance = cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager});
            Method method = cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class});
            onGetStartedClick.IconCompatParcelizer((Object) newInstance, "extensions");
            onGetStartedClick.IconCompatParcelizer((Object) method, "checkServerTrusted");
            return new AndroidCertificateChainCleaner(newInstance, method);
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    public final TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        onGetStartedClick.write((Object) x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            onGetStartedClick.IconCompatParcelizer((Object) declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        public final int hashCode() {
            return 0;
        }

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            onGetStartedClick.write(obj, "x509TrustManagerExtensions");
            onGetStartedClick.write((Object) method, "checkServerTrusted");
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        public final List<Certificate> clean(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
            onGetStartedClick.write((Object) list, "chain");
            onGetStartedClick.write((Object) str, "hostname");
            try {
                Object array = list.toArray(new X509Certificate[0]);
                if (array != null) {
                    Object invoke = this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, new Object[]{(X509Certificate[]) array, "RSA", str});
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (InvocationTargetException e) {
                Throwable sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((i & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        public final CustomTrustRootIndex copy(X509TrustManager x509TrustManager, Method method) {
            onGetStartedClick.write((Object) x509TrustManager, "trustManager");
            onGetStartedClick.write((Object) method, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager, method);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.trustManager, (Object) customTrustRootIndex.trustManager) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.findByIssuerAndSignatureMethod, (Object) customTrustRootIndex.findByIssuerAndSignatureMethod);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.trustManager;
            int i = 0;
            int hashCode = x509TrustManager != null ? x509TrustManager.hashCode() : 0;
            Method method = this.findByIssuerAndSignatureMethod;
            if (method != null) {
                i = method.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CustomTrustRootIndex(trustManager=");
            sb.append(this.trustManager);
            sb.append(", findByIssuerAndSignatureMethod=");
            sb.append(this.findByIssuerAndSignatureMethod);
            sb.append(")");
            return sb.toString();
        }

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            onGetStartedClick.write((Object) x509TrustManager, "trustManager");
            onGetStartedClick.write((Object) method, "findByIssuerAndSignatureMethod");
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            onGetStartedClick.write((Object) x509Certificate, "cert");
            try {
                Object invoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final boolean isSupported() {
            return AndroidPlatform.isSupported;
        }

        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
                isSupported = z;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected Android API level 21+ but was ");
            sb.append(Build.VERSION.SDK_INT);
            throw new IllegalStateException(sb.toString().toString());
        } catch (ClassNotFoundException unused) {
        }
    }
}
