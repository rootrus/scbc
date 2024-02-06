package okhttp3.repackaged.internal;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.internal.tls.AndroidTrustRootIndex;
import okhttp3.repackaged.internal.tls.RealTrustRootIndex;
import okhttp3.repackaged.internal.tls.TrustRootIndex;
import p040o.onMenuPromptPayClick;

public class Platform {
    private static final Platform ajm = m5959uA();

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public static Platform get() {
        return ajm;
    }

    public void logW(String str) {
        System.out.println(str);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        try {
            Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public TrustRootIndex trustRootIndex(X509TrustManager x509TrustManager) {
        return new RealTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void log(String str) {
        System.out.println(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN");
        r4 = new java.lang.StringBuilder();
        r4.append("org.eclipse.jetty.alpn.ALPN");
        r4.append("$Provider");
        r4 = java.lang.Class.forName(r4.toString());
        r5 = new java.lang.StringBuilder();
        r5.append("org.eclipse.jetty.alpn.ALPN");
        r5.append("$ClientProvider");
        r10 = java.lang.Class.forName(r5.toString());
        r5 = new java.lang.StringBuilder();
        r5.append("org.eclipse.jetty.alpn.ALPN");
        r5.append("$ServerProvider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c7, code lost:
        return new okhttp3.repackaged.internal.Platform.C10229b(r0.getMethod("put", new java.lang.Class[]{javax.net.ssl.SSLSocket.class, r4}), r0.getMethod("get", new java.lang.Class[]{javax.net.ssl.SSLSocket.class}), r0.getMethod(com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_REMOVE, new java.lang.Class[]{javax.net.ssl.SSLSocket.class}), r10, java.lang.Class.forName(r5.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        return new okhttp3.repackaged.internal.Platform();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0057 */
    /* renamed from: uA */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static okhttp3.repackaged.internal.Platform m5959uA() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x000e }
        L_0x000c:
            r6 = r4
            goto L_0x0015
        L_0x000e:
            java.lang.String r4 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0057 }
            goto L_0x000c
        L_0x0015:
            okhttp3.repackaged.internal.b r7 = new okhttp3.repackaged.internal.b     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0057 }
            r4[r3] = r5     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.String r5 = "setUseSessionTickets"
            r8 = 0
            r7.<init>(r8, r5, r4)     // Catch:{ ClassNotFoundException -> 0x0057 }
            okhttp3.repackaged.internal.b r4 = new okhttp3.repackaged.internal.b     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r5[r3] = r9     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.String r9 = "setHostname"
            r4.<init>(r8, r9, r5)     // Catch:{ ClassNotFoundException -> 0x0057 }
            java.lang.String r5 = "android.net.Network"
            java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x004c }
            okhttp3.repackaged.internal.b r5 = new okhttp3.repackaged.internal.b     // Catch:{ ClassNotFoundException -> 0x004c }
            java.lang.String r9 = "getAlpnSelectedProtocol"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x004c }
            r5.<init>(r0, r9, r10)     // Catch:{ ClassNotFoundException -> 0x004c }
            okhttp3.repackaged.internal.b r9 = new okhttp3.repackaged.internal.b     // Catch:{ ClassNotFoundException -> 0x004d }
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x004d }
            r10[r3] = r0     // Catch:{ ClassNotFoundException -> 0x004d }
            java.lang.String r0 = "setAlpnProtocols"
            r9.<init>(r8, r0, r10)     // Catch:{ ClassNotFoundException -> 0x004d }
            r10 = r9
            r9 = r5
            goto L_0x004f
        L_0x004c:
            r5 = r8
        L_0x004d:
            r9 = r5
            r10 = r8
        L_0x004f:
            okhttp3.repackaged.internal.Platform$a r0 = new okhttp3.repackaged.internal.Platform$a     // Catch:{ ClassNotFoundException -> 0x0057 }
            r5 = r0
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException -> 0x0057 }
            return r0
        L_0x0057:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r4.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r4.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r5 = "$Provider"
            r4.append(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r5.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r6 = "$ClientProvider"
            r5.append(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class r10 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r5.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r5.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r1 = "$ServerProvider"
            r5.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r1 = r5.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r1[r3] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r1[r2] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r4 = "put"
            java.lang.reflect.Method r7 = r0.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class<javax.net.ssl.SSLSocket> r4 = javax.net.ssl.SSLSocket.class
            r1[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r4 = "get"
            java.lang.reflect.Method r8 = r0.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            r1[r3] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            java.lang.String r2 = "remove"
            java.lang.reflect.Method r9 = r0.getMethod(r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            okhttp3.repackaged.internal.Platform$b r0 = new okhttp3.repackaged.internal.Platform$b     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c8 }
            return r0
        L_0x00c8:
            okhttp3.repackaged.internal.Platform r0 = new okhttp3.repackaged.internal.Platform
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.Platform.m5959uA():okhttp3.repackaged.internal.Platform");
    }

    /* renamed from: okhttp3.repackaged.internal.Platform$a */
    static class C10228a extends Platform {
        private static final int ajn = 4000;
        private final Class<?> ajo;
        private final C10233b<Socket> ajp;
        private final C10233b<Socket> ajq;
        private final C10233b<Socket> ajr;
        private final C10233b<Socket> ajs;

        public C10228a(Class<?> cls, C10233b<Socket> bVar, C10233b<Socket> bVar2, C10233b<Socket> bVar3, C10233b<Socket> bVar4) {
            this.ajo = cls;
            this.ajp = bVar;
            this.ajq = bVar2;
            this.ajr = bVar3;
            this.ajs = bVar4;
        }

        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (Util.isAndroidGetsocknameError(e)) {
                    throw new IOException(e);
                }
                throw e;
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
            Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, this.ajo, "sslParameters");
            if (readFieldOrNull == null) {
                try {
                    readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return Platform.super.trustManager(sSLSocketFactory);
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
            return (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        }

        public TrustRootIndex trustRootIndex(X509TrustManager x509TrustManager) {
            TrustRootIndex trustRootIndex = AndroidTrustRootIndex.get(x509TrustManager);
            if (trustRootIndex != null) {
                return trustRootIndex;
            }
            return Platform.super.trustRootIndex(x509TrustManager);
        }

        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.ajp.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.ajq.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            C10233b<Socket> bVar = this.ajs;
            if (bVar != null && bVar.isSupported(sSLSocket)) {
                this.ajs.invokeWithoutCheckedException(sSLSocket, concatLengthPrefixed(list));
            }
        }

        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            C10233b<Socket> bVar = this.ajr;
            if (bVar == null || !bVar.isSupported(sSLSocket) || (bArr = (byte[]) this.ajr.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, Util.UTF_8);
        }

        public void log(String str) {
            int min;
            int length = str.length();
            int i = 0;
            while (i < length) {
                int indexOf = str.indexOf(10, i);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i + ajn);
                    Log.d("OkHttp", str.substring(i, min));
                    if (min >= indexOf) {
                        break;
                    }
                    i = min;
                }
                i = min + 1;
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.Platform$b */
    static class C10229b extends Platform {
        private final Method ajt;
        private final Method aju;
        private final Method ajv;
        private final Class<?> ajw;
        private final Class<?> ajx;

        public C10229b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.ajt = method;
            this.aju = method2;
            this.ajv = method3;
            this.ajw = cls;
            this.ajx = cls2;
        }

        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.ajt.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.ajw, this.ajx}, new C10230c(arrayList))});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        public void afterHandshake(SSLSocket sSLSocket) {
            try {
                this.ajv.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                C10230c cVar = (C10230c) Proxy.getInvocationHandler(this.aju.invoke((Object) null, new Object[]{sSLSocket}));
                if (!cVar.unsupported && cVar.selected == null) {
                    Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (cVar.unsupported) {
                    return null;
                } else {
                    return cVar.selected;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: okhttp3.repackaged.internal.Platform$c */
    static class C10230c implements InvocationHandler {
        private final List<String> protocols;
        /* access modifiers changed from: private */
        public String selected;
        /* access modifiers changed from: private */
        public boolean unsupported;

        public C10230c(List<String> list) {
            this.protocols = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.unsupported = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.protocols;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.protocols.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.selected = str;
                            return str;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.selected = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    static byte[] concatLengthPrefixed(List<Protocol> list) {
        onMenuPromptPayClick onmenupromptpayclick = new onMenuPromptPayClick();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                onmenupromptpayclick.MediaBrowserCompat$ItemReceiver(protocol.toString().length());
                String obj = protocol.toString();
                onmenupromptpayclick.read(obj, 0, obj.length());
            }
        }
        return onmenupromptpayclick.MediaDescriptionCompat();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v2 java.lang.Object) binds: [B:0:0x0000, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T readFieldOrNull(java.lang.Object r4, java.lang.Class<T> r5, java.lang.String r6) {
        /*
        L_0x0000:
            java.lang.Class r0 = r4.getClass()
        L_0x0004:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 == r1) goto L_0x002f
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r1 == 0) goto L_0x0023
            boolean r3 = r5.isInstance(r1)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            java.lang.Object r4 = r5.cast(r1)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            return r4
        L_0x0023:
            return r2
        L_0x0024:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x002a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x0004
        L_0x002f:
            java.lang.String r0 = "delegate"
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r4 = readFieldOrNull(r4, r1, r0)
            if (r4 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.Platform.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }
}
