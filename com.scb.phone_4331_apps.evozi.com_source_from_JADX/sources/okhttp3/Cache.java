package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.TypeCastException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p060io.FileSystem;
import okhttp3.internal.platform.Platform;
import p040o.C7043xa484e06c;
import p040o.FundOnboardingSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.HmlNationalIdActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PartnerLoginActivity;
import p040o.PayNowSuccessActivity;
import p040o.PinChangeActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.onSubmit;

public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        onGetStartedClick.write((Object) file, "directory");
        onGetStartedClick.write((Object) fileSystem, "fileSystem");
        this.cache = DiskLruCache.Companion.create(fileSystem, file, VERSION, 2, j);
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        onGetStartedClick.write((Object) file, "directory");
    }

    public final Response get$okhttp(Request request) {
        onGetStartedClick.write((Object) request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot != null) {
                try {
                    Entry entry = new Entry(snapshot.getSource(0));
                    Response response = entry.response(snapshot);
                    if (entry.matches(request, response)) {
                        return response;
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly((Closeable) body);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly((Closeable) snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        onGetStartedClick.write((Object) response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) method, (Object) "GET")) || Companion.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, Companion.key(response.request().url()), 0, 2, (Object) null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        onGetStartedClick.write((Object) request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final void update$okhttp(Response response, Response response2) {
        onGetStartedClick.write((Object) response, "cached");
        onGetStartedClick.write((Object) response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                DiskLruCache.Editor edit = ((CacheResponseBody) body).getSnapshot$okhttp().edit();
                if (edit != null) {
                    entry.writeTo(edit);
                    edit.commit();
                }
            } catch (IOException unused) {
                abortQuietly((DiskLruCache.Editor) null);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final int writeAbortCount() {
        int i;
        synchronized (this) {
            i = this.writeAbortCount;
        }
        return i;
    }

    public final int writeSuccessCount() {
        int i;
        synchronized (this) {
            i = this.writeSuccessCount;
        }
        return i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final void flush() throws IOException {
        this.cache.flush();
    }

    public final void close() throws IOException {
        this.cache.close();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m6339deprecated_directory() {
        return this.cache.getDirectory();
    }

    public final void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        synchronized (this) {
            onGetStartedClick.write((Object) cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        }
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    public final int networkCount() {
        int i;
        synchronized (this) {
            i = this.networkCount;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int requestCount() {
        int i;
        synchronized (this) {
            i = this.requestCount;
        }
        return i;
    }

    final class RealCacheRequest implements CacheRequest {
        private final PinChangeActivity body;
        private final PinChangeActivity cacheOut;
        private boolean done;
        /* access modifiers changed from: private */
        public final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(Cache cache, DiskLruCache.Editor editor2) {
            onGetStartedClick.write((Object) editor2, "editor");
            this.this$0 = cache;
            this.editor = editor2;
            PinChangeActivity newSink = editor2.newSink(1);
            this.cacheOut = newSink;
            this.body = new PartnerLoginActivity(this, newSink) {
                final /* synthetic */ RealCacheRequest this$0;

                {
                    this.this$0 = r1;
                }

                public final void close() throws IOException {
                    synchronized (this.this$0.this$0) {
                        if (!this.this$0.getDone$okhttp()) {
                            this.this$0.setDone$okhttp(true);
                            Cache cache = this.this$0.this$0;
                            cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                            super.close();
                            this.this$0.editor.commit();
                        }
                    }
                }
            };
        }

        public final boolean getDone$okhttp() {
            return this.done;
        }

        public final void setDone$okhttp(boolean z) {
            this.done = z;
        }

        public final void abort() {
            synchronized (this.this$0) {
                if (!this.done) {
                    this.done = true;
                    Cache cache = this.this$0;
                    cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                    Util.closeQuietly((Closeable) this.cacheOut);
                    try {
                        this.editor.abort();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public final PinChangeActivity body() {
            return this.body;
        }
    }

    static final class Entry {
        public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        private final boolean isHttps() {
            return GoodToKnowActivity.read(this.url, "https://", false);
        }

        public Entry(HowToAddAccountStep2Activity howToAddAccountStep2Activity) throws IOException {
            TlsVersion tlsVersion;
            onGetStartedClick.write((Object) howToAddAccountStep2Activity, "rawSource");
            try {
                NsipPartnerPaymentOtpActivity read = onSubmit.read(howToAddAccountStep2Activity);
                this.url = read.Keep();
                this.requestMethod = read.Keep();
                Headers.Builder builder = new Headers.Builder();
                int readInt$okhttp = Cache.Companion.readInt$okhttp(read);
                boolean z = false;
                for (int i = 0; i < readInt$okhttp; i++) {
                    builder.addLenient$okhttp(read.Keep());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.Companion.parse(read.Keep());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt$okhttp2 = Cache.Companion.readInt$okhttp(read);
                for (int i2 = 0; i2 < readInt$okhttp2; i2++) {
                    builder2.addLenient$okhttp(read.Keep());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String Keep = read.Keep();
                    if (!(Keep.length() > 0 ? true : z)) {
                        CipherSuite forJavaName = CipherSuite.Companion.forJavaName(read.Keep());
                        List<Certificate> readCertificateList = readCertificateList(read);
                        List<Certificate> readCertificateList2 = readCertificateList(read);
                        if (!read.MediaBrowserCompat$CustomActionResultReceiver()) {
                            tlsVersion = TlsVersion.Companion.forJavaName(read.Keep());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(Keep);
                        sb.append('\"');
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                howToAddAccountStep2Activity.close();
            }
        }

        public Entry(Response response) {
            onGetStartedClick.write((Object) response, "response");
            this.url = response.request().url().toString();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            onGetStartedClick.write((Object) editor, "editor");
            NsipPartnerPaymentReviewActivity read = onSubmit.read(editor.newSink(0));
            read.MediaBrowserCompat$CustomActionResultReceiver(this.url).MediaBrowserCompat$ItemReceiver(10);
            read.MediaBrowserCompat$CustomActionResultReceiver(this.requestMethod).MediaBrowserCompat$ItemReceiver(10);
            read.RatingCompat((long) this.varyHeaders.size()).MediaBrowserCompat$ItemReceiver(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                read.MediaBrowserCompat$CustomActionResultReceiver(this.varyHeaders.name(i)).MediaBrowserCompat$CustomActionResultReceiver(": ").MediaBrowserCompat$CustomActionResultReceiver(this.varyHeaders.value(i)).MediaBrowserCompat$ItemReceiver(10);
            }
            read.MediaBrowserCompat$CustomActionResultReceiver(new StatusLine(this.protocol, this.code, this.message).toString()).MediaBrowserCompat$ItemReceiver(10);
            read.RatingCompat((long) (this.responseHeaders.size() + 2)).MediaBrowserCompat$ItemReceiver(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                read.MediaBrowserCompat$CustomActionResultReceiver(this.responseHeaders.name(i2)).MediaBrowserCompat$CustomActionResultReceiver(": ").MediaBrowserCompat$CustomActionResultReceiver(this.responseHeaders.value(i2)).MediaBrowserCompat$ItemReceiver(10);
            }
            read.MediaBrowserCompat$CustomActionResultReceiver(SENT_MILLIS).MediaBrowserCompat$CustomActionResultReceiver(": ").RatingCompat(this.sentRequestMillis).MediaBrowserCompat$ItemReceiver(10);
            read.MediaBrowserCompat$CustomActionResultReceiver(RECEIVED_MILLIS).MediaBrowserCompat$CustomActionResultReceiver(": ").RatingCompat(this.receivedResponseMillis).MediaBrowserCompat$ItemReceiver(10);
            if (isHttps()) {
                read.MediaBrowserCompat$ItemReceiver(10);
                Handshake handshake2 = this.handshake;
                if (handshake2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                read.MediaBrowserCompat$CustomActionResultReceiver(handshake2.cipherSuite().javaName()).MediaBrowserCompat$ItemReceiver(10);
                writeCertList(read, this.handshake.peerCertificates());
                writeCertList(read, this.handshake.localCertificates());
                read.MediaBrowserCompat$CustomActionResultReceiver(this.handshake.tlsVersion().javaName()).MediaBrowserCompat$ItemReceiver(10);
            }
            read.close();
        }

        private final List<Certificate> readCertificateList(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(nsipPartnerPaymentOtpActivity);
            if (readInt$okhttp == -1) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i = 0; i < readInt$okhttp; i++) {
                    String Keep = nsipPartnerPaymentOtpActivity.Keep();
                    SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                    C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
                    onGetStartedClick.write((Object) Keep, "$receiver");
                    SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$ItemReceiver = PinChangeSuccessActivity.MediaBrowserCompat$ItemReceiver(Keep);
                    if (MediaBrowserCompat$ItemReceiver == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "byteString");
                    MediaBrowserCompat$ItemReceiver.write(sCBUniversalWebViewActivity);
                    arrayList.add(instance.generateCertificate(new SCBUniversalWebViewActivity.read(sCBUniversalWebViewActivity)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, List<? extends Certificate> list) throws IOException {
            try {
                nsipPartnerPaymentReviewActivity.RatingCompat((long) list.size()).MediaBrowserCompat$ItemReceiver(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = ((Certificate) list.get(i)).getEncoded();
                    C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
                    onGetStartedClick.IconCompatParcelizer((Object) encoded, "bytes");
                    nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(C7043xa484e06c.MediaBrowserCompat$CustomActionResultReceiver(encoded, 0, encoded.length).MediaBrowserCompat$ItemReceiver()).MediaBrowserCompat$ItemReceiver(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            onGetStartedClick.write((Object) request, "request");
            onGetStartedClick.write((Object) response, "response");
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.url, (Object) request.url().toString()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.requestMethod, (Object) request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request);
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            onGetStartedClick.write((Object) snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, (RequestBody) null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(Platform.Companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Platform.Companion.get().getPrefix());
            sb2.append("-Received-Millis");
            RECEIVED_MILLIS = sb2.toString();
        }
    }

    static final class CacheResponseBody extends ResponseBody {
        private final NsipPartnerPaymentOtpActivity bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public final DiskLruCache.Snapshot getSnapshot$okhttp() {
            return this.snapshot;
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot2, String str, String str2) {
            onGetStartedClick.write((Object) snapshot2, "snapshot");
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            HowToAddAccountStep2Activity source = snapshot2.getSource(1);
            this.bodySource = onSubmit.read((HowToAddAccountStep2Activity) new PayNowSuccessActivity(this, source, source) {
                final /* synthetic */ HowToAddAccountStep2Activity $source;
                final /* synthetic */ CacheResponseBody this$0;

                {
                    this.this$0 = r1;
                    this.$source = r2;
                }

                public final void close() throws IOException {
                    this.this$0.getSnapshot$okhttp().close();
                    super.close();
                }
            });
        }

        public final MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        public final long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1);
            }
            return -1;
        }

        public final NsipPartnerPaymentOtpActivity source() {
            return this.bodySource;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public final String key(HttpUrl httpUrl) {
            onGetStartedClick.write((Object) httpUrl, ImagesContract.URL);
            C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
            String obj = httpUrl.toString();
            onGetStartedClick.write((Object) obj, "$receiver");
            return PinChangeSuccessActivity.read(obj).IconCompatParcelizer("MD5").read();
        }

        public final int readInt$okhttp(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) throws IOException {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            try {
                long MediaSessionCompat$Token = nsipPartnerPaymentOtpActivity.MediaSessionCompat$Token();
                String Keep = nsipPartnerPaymentOtpActivity.Keep();
                if (MediaSessionCompat$Token >= 0 && MediaSessionCompat$Token <= 2147483647L) {
                    if (!(Keep.length() > 0)) {
                        return (int) MediaSessionCompat$Token;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected an int but was \"");
                sb.append(MediaSessionCompat$Token);
                sb.append(Keep);
                sb.append('\"');
                throw new IOException(sb.toString());
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            onGetStartedClick.write((Object) response, "cachedResponse");
            onGetStartedClick.write((Object) headers, "cachedRequest");
            onGetStartedClick.write((Object) request, "newRequest");
            Iterable<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && ((Collection) varyFields).isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) headers.values(str), (Object) request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean hasVaryAll(Response response) {
            onGetStartedClick.write((Object) response, "$this$hasVaryAll");
            return varyFields(response.headers()).contains("*");
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            Set<String> set = null;
            for (int i = 0; i < size; i++) {
                if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("Vary", headers.name(i), true)) {
                    String value = headers.value(i);
                    if (set == null) {
                        onGetStartedClick.write((Object) FundOnboardingSuccessActivity.IconCompatParcelizer, "$this$CASE_INSENSITIVE_ORDER");
                        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                        onGetStartedClick.IconCompatParcelizer((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
                        set = new TreeSet<>(comparator);
                    }
                    for (String str : GoodToKnowActivity.read((CharSequence) value, new char[]{','}, false, 0)) {
                        if (str != null) {
                            set.add(GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString());
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    }
                    continue;
                }
            }
            return set == null ? HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver : set;
        }

        public final Headers varyHeaders(Response response) {
            onGetStartedClick.write((Object) response, "$this$varyHeaders");
            Response networkResponse = response.networkResponse();
            if (networkResponse == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
            }
            return builder.build();
        }
    }
}
