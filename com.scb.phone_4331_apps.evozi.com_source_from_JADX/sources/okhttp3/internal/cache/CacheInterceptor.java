package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import p040o.GoodToKnowActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeActivity;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final Cache cache;

    public CacheInterceptor(Cache cache2) {
        this.cache = cache2;
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody body;
        ResponseBody body2;
        onGetStartedClick.write((Object) chain, "chain");
        Cache cache2 = this.cache;
        Response response = cache2 != null ? cache2.get$okhttp(chain.request()) : null;
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache3 = this.cache;
        if (cache3 != null) {
            cache3.trackResponse$okhttp(compute);
        }
        if (!(response == null || cacheResponse != null || (body2 = response.body()) == null)) {
            Util.closeQuietly((Closeable) body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (networkRequest == null) {
            if (cacheResponse == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
        }
        try {
            Response proceed = chain.proceed(networkRequest);
            if (!(proceed != null || response == null || body == null)) {
            }
            if (cacheResponse != null) {
                if (proceed == null || proceed.code() != 304) {
                    ResponseBody body3 = cacheResponse.body();
                    if (body3 != null) {
                        Util.closeQuietly((Closeable) body3);
                    }
                } else {
                    Response build = cacheResponse.newBuilder().headers(Companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(Companion.stripBody(cacheResponse)).networkResponse(Companion.stripBody(proceed)).build();
                    ResponseBody body4 = proceed.body();
                    if (body4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    body4.close();
                    Cache cache4 = this.cache;
                    if (cache4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    cache4.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, build);
                    return build;
                }
            }
            if (proceed == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Response build2 = proceed.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).networkResponse(Companion.stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(build2) && CacheStrategy.Companion.isCacheable(build2, networkRequest)) {
                    return cacheWritingResponse(this.cache.put$okhttp(build2), build2);
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return build2;
        } finally {
            if (!(response == null || (body = response.body()) == null)) {
                Util.closeQuietly((Closeable) body);
            }
        }
    }

    private final Response cacheWritingResponse(CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        PinChangeActivity body = cacheRequest.body();
        ResponseBody body2 = response.body();
        if (body2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 cacheInterceptor$cacheWritingResponse$cacheWritingSource$1 = new CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(body2.source(), cacheRequest, onSubmit.read(body));
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", (String) null, 2, (Object) null), response.body().contentLength(), onSubmit.read((HowToAddAccountStep2Activity) cacheInterceptor$cacheWritingResponse$cacheWritingSource$1))).build();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        /* access modifiers changed from: private */
        public final Response stripBody(Response response) {
            return (response != null ? response.body() : null) != null ? response.newBuilder().body((ResponseBody) null).build() : response;
        }

        /* access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Warning", name, true) || !GoodToKnowActivity.read(value, DiskLruCache.VERSION_1, false)) {
                    Companion companion = this;
                    if (companion.isContentSpecificHeader(name) || !companion.isEndToEnd(name) || headers2.get(name) == null) {
                        builder.addLenient$okhttp(name, value);
                    }
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                Companion companion2 = this;
                if (!companion2.isContentSpecificHeader(name2) && companion2.isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isEndToEnd(String str) {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Connection", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Keep-Alive", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Proxy-Authenticate", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Proxy-Authorization", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("TE", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Trailers", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Transfer-Encoding", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        private final boolean isContentSpecificHeader(String str) {
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Length", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Encoding", str, true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Type", str, true)) {
                return true;
            }
            return false;
        }
    }
}
