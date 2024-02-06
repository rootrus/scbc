package okhttp3.internal.platform;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.TypeCastException;
import okhttp3.Protocol;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.onGetStartedClick;

public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        onGetStartedClick.write((Object) method, "putMethod");
        onGetStartedClick.write((Object) method2, "getMethod");
        onGetStartedClick.write((Object) method3, "removeMethod");
        onGetStartedClick.write((Object) cls, "clientProviderClass");
        onGetStartedClick.write((Object) cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        onGetStartedClick.write((Object) list, "protocols");
        List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(alpnProtocolNames));
            this.putMethod.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    public final void afterHandshake(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        onGetStartedClick.write((Object) sSLSocket, "socket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
                if (!alpnProvider.getUnsupported$okhttp() && alpnProvider.getSelected$okhttp() == null) {
                    Platform.Companion.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                    return null;
                } else if (alpnProvider.getUnsupported$okhttp()) {
                    return null;
                } else {
                    return alpnProvider.getSelected$okhttp();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            onGetStartedClick.write((Object) list, "protocols");
            this.protocols = list;
        }

        public final boolean getUnsupported$okhttp() {
            return this.unsupported;
        }

        public final void setUnsupported$okhttp(boolean z) {
            this.unsupported = z;
        }

        public final String getSelected$okhttp() {
            return this.selected;
        }

        public final void setSelected$okhttp(String str) {
            this.selected = str;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            onGetStartedClick.write(obj, "proxy");
            onGetStartedClick.write((Object) method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "supports") && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Boolean.TYPE, (Object) returnType)) {
                return Boolean.TRUE;
            }
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "unsupported") || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) Void.TYPE, (Object) returnType)) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "protocols")) {
                    if (objArr.length == 0) {
                        return this.protocols;
                    }
                }
                if ((onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "selectProtocol") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "select")) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) String.class, (Object) returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (!this.protocols.contains(str)) {
                                        if (i == size) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        this.selected = str;
                                        return str;
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.protocols.get(0);
                        this.selected = str2;
                        return str2;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "protocolSelected") && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) name, (Object) "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.selected = (String) obj4;
                        return null;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.unsupported = true;
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

        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                onGetStartedClick.IconCompatParcelizer((Object) property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                StringBuilder sb = new StringBuilder();
                sb.append("org.eclipse.jetty.alpn.ALPN");
                sb.append("$Provider");
                Class<?> cls2 = Class.forName(sb.toString(), true, (ClassLoader) null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("org.eclipse.jetty.alpn.ALPN");
                sb2.append("$ClientProvider");
                Class<?> cls3 = Class.forName(sb2.toString(), true, (ClassLoader) null);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("org.eclipse.jetty.alpn.ALPN");
                sb3.append("$ServerProvider");
                Class<?> cls4 = Class.forName(sb3.toString(), true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod(ProductAction.ACTION_REMOVE, new Class[]{SSLSocket.class});
                onGetStartedClick.IconCompatParcelizer((Object) method, "putMethod");
                onGetStartedClick.IconCompatParcelizer((Object) method2, "getMethod");
                onGetStartedClick.IconCompatParcelizer((Object) method3, "removeMethod");
                onGetStartedClick.IconCompatParcelizer((Object) cls3, "clientProviderClass");
                onGetStartedClick.IconCompatParcelizer((Object) cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }
}
