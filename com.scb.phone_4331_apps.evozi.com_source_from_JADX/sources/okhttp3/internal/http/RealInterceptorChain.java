package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.Transmitter;
import p040o.onGetStartedClick;

public final class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final Transmitter transmitter;
    private final int writeTimeout;

    public RealInterceptorChain(List<? extends Interceptor> list, Transmitter transmitter2, Exchange exchange2, int i, Request request2, Call call2, int i2, int i3, int i4) {
        onGetStartedClick.write((Object) list, "interceptors");
        onGetStartedClick.write((Object) transmitter2, "transmitter");
        onGetStartedClick.write((Object) request2, "request");
        onGetStartedClick.write((Object) call2, "call");
        this.interceptors = list;
        this.transmitter = transmitter2;
        this.exchange = exchange2;
        this.index = i;
        this.request = request2;
        this.call = call2;
        this.connectTimeout = i2;
        this.readTimeout = i3;
        this.writeTimeout = i4;
    }

    public final Connection connection() {
        Exchange exchange2 = this.exchange;
        return exchange2 != null ? exchange2.connection() : null;
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    public final Interceptor.Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, Util.checkDuration("timeout", (long) i, timeUnit), this.readTimeout, this.writeTimeout);
    }

    public final int readTimeoutMillis() {
        return this.readTimeout;
    }

    public final Interceptor.Chain withReadTimeout(int i, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, this.connectTimeout, Util.checkDuration("timeout", (long) i, timeUnit), this.writeTimeout);
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public final Interceptor.Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        onGetStartedClick.write((Object) timeUnit, "unit");
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, this.connectTimeout, this.readTimeout, Util.checkDuration("timeout", (long) i, timeUnit));
    }

    public final Transmitter transmitter() {
        return this.transmitter;
    }

    public final Exchange exchange() {
        Exchange exchange2 = this.exchange;
        if (exchange2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return exchange2;
    }

    public final Call call() {
        return this.call;
    }

    public final Request request() {
        return this.request;
    }

    public final Response proceed(Request request2) {
        onGetStartedClick.write((Object) request2, "request");
        return proceed(request2, this.transmitter, this.exchange);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response proceed(okhttp3.Request r17, okhttp3.internal.connection.Transmitter r18, okhttp3.internal.connection.Exchange r19) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "request"
            r7 = r17
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
            java.lang.String r1 = "transmitter"
            r4 = r18
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r1)
            int r1 = r0.index
            java.util.List<okhttp3.Interceptor> r2 = r0.interceptors
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x014c
            int r1 = r0.calls
            r12 = 1
            int r1 = r1 + r12
            r0.calls = r1
            okhttp3.internal.connection.Exchange r1 = r0.exchange
            if (r1 == 0) goto L_0x0039
            okhttp3.internal.connection.RealConnection r1 = r1.connection()
            if (r1 != 0) goto L_0x002d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x002d:
            okhttp3.HttpUrl r2 = r17.url()
            boolean r1 = r1.supportsUrl(r2)
            if (r1 != 0) goto L_0x0039
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = r12
        L_0x003a:
            java.lang.String r14 = "network interceptor "
            if (r1 == 0) goto L_0x0121
            okhttp3.internal.connection.Exchange r1 = r0.exchange
            if (r1 == 0) goto L_0x0048
            int r1 = r0.calls
            if (r1 <= r12) goto L_0x0048
            r1 = 0
            goto L_0x0049
        L_0x0048:
            r1 = r12
        L_0x0049:
            java.lang.String r15 = " must call proceed() exactly once"
            if (r1 == 0) goto L_0x00f8
            java.util.List<okhttp3.Interceptor> r3 = r0.interceptors
            int r1 = r0.index
            okhttp3.Call r8 = r0.call
            int r9 = r0.connectTimeout
            int r10 = r0.readTimeout
            int r11 = r0.writeTimeout
            okhttp3.internal.http.RealInterceptorChain r6 = new okhttp3.internal.http.RealInterceptorChain
            int r1 = r1 + r12
            r2 = r6
            r4 = r18
            r5 = r19
            r13 = r6
            r6 = r1
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List<okhttp3.Interceptor> r1 = r0.interceptors
            int r2 = r0.index
            java.lang.Object r1 = r1.get(r2)
            okhttp3.Interceptor r1 = (okhttp3.Interceptor) r1
            r6 = r13
            okhttp3.Interceptor$Chain r6 = (okhttp3.Interceptor.Chain) r6
            okhttp3.Response r2 = r1.intercept(r6)
            java.lang.String r3 = "interceptor "
            if (r2 == 0) goto L_0x00dc
            if (r19 == 0) goto L_0x0090
            int r4 = r0.index
            int r4 = r4 + r12
            java.util.List<okhttp3.Interceptor> r5 = r0.interceptors
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0090
            int r4 = r13.calls
            if (r4 == r12) goto L_0x0090
            r4 = 0
            goto L_0x0091
        L_0x0090:
            r4 = r12
        L_0x0091:
            if (r4 == 0) goto L_0x00be
            okhttp3.ResponseBody r4 = r2.body()
            if (r4 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r12 = 0
        L_0x009b:
            if (r12 == 0) goto L_0x009e
            return r2
        L_0x009e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " returned a response with no body"
            r2.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r2.append(r1)
            r2.append(r15)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " returned null"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x00f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.util.List<okhttp3.Interceptor> r2 = r0.interceptors
            int r3 = r0.index
            int r3 = r3 - r12
            java.lang.Object r2 = r2.get(r3)
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0121:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.util.List<okhttp3.Interceptor> r2 = r0.interceptors
            int r3 = r0.index
            int r3 = r3 - r12
            java.lang.Object r2 = r2.get(r3)
            okhttp3.Interceptor r2 = (okhttp3.Interceptor) r2
            r1.append(r2)
            java.lang.String r2 = " must retain the same host and port"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x014c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RealInterceptorChain.proceed(okhttp3.Request, okhttp3.internal.connection.Transmitter, okhttp3.internal.connection.Exchange):okhttp3.Response");
    }
}
