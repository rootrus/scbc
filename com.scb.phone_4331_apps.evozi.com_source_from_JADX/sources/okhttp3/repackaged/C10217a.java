package okhttp3.repackaged;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.repackaged.Interceptor;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.internal.NamedRunnable;
import okhttp3.repackaged.internal.http.HttpEngine;
import okhttp3.repackaged.internal.http.RequestException;
import okhttp3.repackaged.internal.http.RetryableSink;
import okhttp3.repackaged.internal.http.RouteException;
import okhttp3.repackaged.internal.http.StreamAllocation;
import p040o.QuickPromptPayActivity;

/* renamed from: okhttp3.repackaged.a */
final class C10217a implements Call {
    private boolean ait;
    volatile boolean aiu;
    Request aiv;
    HttpEngine aiw;
    /* access modifiers changed from: private */
    public final OkHttpClient client;

    protected C10217a(OkHttpClient okHttpClient, Request request) {
        this.client = okHttpClient;
        this.aiv = request;
    }

    public final Request request() {
        return this.aiv;
    }

    public final Response execute() throws IOException {
        synchronized (this) {
            if (!this.ait) {
                this.ait = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.client.dispatcher().mo58330a(this);
            Response y = m5910y(false);
            if (y != null) {
                return y;
            }
            throw new IOException("Canceled");
        } finally {
            this.client.dispatcher().mo58328a((Call) this);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object tag() {
        return this.aiv.tag();
    }

    public final void enqueue(Callback callback) {
        mo58614a(callback, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58614a(Callback callback, boolean z) {
        synchronized (this) {
            if (!this.ait) {
                this.ait = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.client.dispatcher().mo58329a(new C10220b(callback, z));
    }

    public final void cancel() {
        this.aiu = true;
        HttpEngine httpEngine = this.aiw;
        if (httpEngine != null) {
            httpEngine.cancel();
        }
    }

    public final boolean isExecuted() {
        boolean z;
        synchronized (this) {
            z = this.ait;
        }
        return z;
    }

    public final boolean isCanceled() {
        return this.aiu;
    }

    /* renamed from: okhttp3.repackaged.a$b */
    final class C10220b extends NamedRunnable {
        private final Callback aiz;
        private final boolean forWebSocket;

        private C10220b(Callback callback, boolean z) {
            super("OkHttp %s", C10217a.this.aiv.url().toString());
            this.aiz = callback;
            this.forWebSocket = z;
        }

        /* access modifiers changed from: package-private */
        public final String host() {
            return C10217a.this.aiv.url().host();
        }

        /* access modifiers changed from: package-private */
        public final Request request() {
            return C10217a.this.aiv;
        }

        /* access modifiers changed from: package-private */
        public final Object tag() {
            return C10217a.this.aiv.tag();
        }

        /* access modifiers changed from: package-private */
        public final void cancel() {
            C10217a.this.cancel();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: us */
        public final C10217a mo58621us() {
            return C10217a.this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e A[SYNTHETIC, Splitter:B:12:0x002e] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[Catch:{ all -> 0x0028 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void execute() {
            /*
                r5 = this;
                okhttp3.repackaged.a r0 = okhttp3.repackaged.C10217a.this     // Catch:{ IOException -> 0x002a }
                boolean r1 = r5.forWebSocket     // Catch:{ IOException -> 0x002a }
                okhttp3.repackaged.Response r0 = r0.m5910y(r1)     // Catch:{ IOException -> 0x002a }
                okhttp3.repackaged.a r1 = okhttp3.repackaged.C10217a.this     // Catch:{ IOException -> 0x002a }
                boolean r1 = r1.aiu     // Catch:{ IOException -> 0x002a }
                if (r1 == 0) goto L_0x001d
                okhttp3.repackaged.Callback r0 = r5.aiz     // Catch:{ IOException -> 0x0025 }
                okhttp3.repackaged.a r1 = okhttp3.repackaged.C10217a.this     // Catch:{ IOException -> 0x0025 }
                java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0025 }
                java.lang.String r3 = "Canceled"
                r2.<init>(r3)     // Catch:{ IOException -> 0x0025 }
                r0.onFailure(r1, r2)     // Catch:{ IOException -> 0x0025 }
                goto L_0x0054
            L_0x001d:
                okhttp3.repackaged.Callback r1 = r5.aiz     // Catch:{ IOException -> 0x0025 }
                okhttp3.repackaged.a r2 = okhttp3.repackaged.C10217a.this     // Catch:{ IOException -> 0x0025 }
                r1.onResponse(r2, r0)     // Catch:{ IOException -> 0x0025 }
                goto L_0x0054
            L_0x0025:
                r0 = move-exception
                r1 = 1
                goto L_0x002c
            L_0x0028:
                r0 = move-exception
                goto L_0x0062
            L_0x002a:
                r0 = move-exception
                r1 = 0
            L_0x002c:
                if (r1 == 0) goto L_0x004d
                java.util.logging.Logger r1 = okhttp3.repackaged.internal.Internal.logger     // Catch:{ all -> 0x0028 }
                java.util.logging.Level r2 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0028 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
                r3.<init>()     // Catch:{ all -> 0x0028 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0028 }
                okhttp3.repackaged.a r4 = okhttp3.repackaged.C10217a.this     // Catch:{ all -> 0x0028 }
                java.lang.String r4 = r4.toLoggableString()     // Catch:{ all -> 0x0028 }
                r3.append(r4)     // Catch:{ all -> 0x0028 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0028 }
                r1.log(r2, r3, r0)     // Catch:{ all -> 0x0028 }
                goto L_0x0054
            L_0x004d:
                okhttp3.repackaged.Callback r1 = r5.aiz     // Catch:{ all -> 0x0028 }
                okhttp3.repackaged.a r2 = okhttp3.repackaged.C10217a.this     // Catch:{ all -> 0x0028 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0028 }
            L_0x0054:
                okhttp3.repackaged.a r0 = okhttp3.repackaged.C10217a.this
                okhttp3.repackaged.OkHttpClient r0 = r0.client
                okhttp3.repackaged.Dispatcher r0 = r0.dispatcher()
                r0.mo58331b(r5)
                return
            L_0x0062:
                okhttp3.repackaged.a r1 = okhttp3.repackaged.C10217a.this
                okhttp3.repackaged.OkHttpClient r1 = r1.client
                okhttp3.repackaged.Dispatcher r1 = r1.dispatcher()
                r1.mo58331b(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.C10217a.C10220b.execute():void");
        }
    }

    /* access modifiers changed from: private */
    public String toLoggableString() {
        String str = this.aiu ? "canceled call" : "call";
        HttpUrl resolve = this.aiv.url().resolve("/...");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" to ");
        sb.append(resolve);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public Response m5910y(boolean z) throws IOException {
        return new C10219a(0, this.aiv, z).proceed(this.aiv);
    }

    /* renamed from: okhttp3.repackaged.a$a */
    class C10219a implements Interceptor.Chain {
        private final Request aix;
        private final boolean forWebSocket;
        private final int index;

        public Connection connection() {
            return null;
        }

        C10219a(int i, Request request, boolean z) {
            this.index = i;
            this.aix = request;
            this.forWebSocket = z;
        }

        public Request request() {
            return this.aix;
        }

        public Response proceed(Request request) throws IOException {
            if (this.index >= C10217a.this.client.interceptors().size()) {
                return C10217a.this.mo58613a(request, this.forWebSocket);
            }
            C10219a aVar = new C10219a(this.index + 1, request, this.forWebSocket);
            Interceptor interceptor = C10217a.this.client.interceptors().get(this.index);
            Response intercept = interceptor.intercept(aVar);
            if (intercept != null) {
                return intercept;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("application interceptor ");
            sb.append(interceptor);
            sb.append(" returned null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Response mo58613a(Request request, boolean z) throws IOException {
        StreamAllocation streamAllocation;
        RequestBody body = request.body();
        if (body != null) {
            Request.Builder newBuilder = request.newBuilder();
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
            request = newBuilder.build();
        }
        this.aiw = new HttpEngine(this.client, request, false, false, z, (StreamAllocation) null, (RetryableSink) null, (Response) null);
        boolean z2 = false;
        int i = 0;
        while (!this.aiu) {
            try {
                this.aiw.sendRequest();
                this.aiw.readResponse();
                Response response = this.aiw.getResponse();
                Request followUpRequest = this.aiw.followUpRequest();
                if (followUpRequest == null) {
                    if (!z) {
                        this.aiw.releaseStreamAllocation();
                    }
                    return response;
                }
                StreamAllocation close = this.aiw.close();
                i++;
                if (i <= 20) {
                    if (!this.aiw.sameConnection(followUpRequest.url())) {
                        close.release();
                        streamAllocation = null;
                    } else {
                        streamAllocation = close;
                    }
                    this.aiw = new HttpEngine(this.client, followUpRequest, false, false, z, streamAllocation, (RetryableSink) null, response);
                } else {
                    close.release();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Too many follow-up requests: ");
                    sb.append(i);
                    throw new ProtocolException(sb.toString());
                }
            } catch (RequestException e) {
                throw e.getCause();
            } catch (RouteException e2) {
                HttpEngine recover = this.aiw.recover(e2.getLastConnectException(), (QuickPromptPayActivity) null);
                if (recover != null) {
                    this.aiw = recover;
                } else {
                    throw e2.getLastConnectException();
                }
            } catch (IOException e3) {
                HttpEngine recover2 = this.aiw.recover(e3, (QuickPromptPayActivity) null);
                if (recover2 != null) {
                    this.aiw = recover2;
                } else {
                    throw e3;
                }
            } catch (Throwable th) {
                th = th;
            }
        }
        this.aiw.releaseStreamAllocation();
        throw new IOException("Canceled");
        if (z2) {
            this.aiw.close().release();
        }
        throw th;
    }
}
