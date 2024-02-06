package okhttp3.logging;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import p040o.AlertController$RecycleListView;
import p040o.FundOnboardingSuccessActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.HowToAddAccountStep2Activity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPaymentLandingActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public HttpLoggingInterceptor() {
        this((Logger) null, 1, (NtbDiscoverFundFilterActivity) null);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        onGetStartedClick.write((Object) logger2, "logger");
        this.logger = logger2;
        this.headersToRedact = HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        this.level = Level.NONE;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpLoggingInterceptor(Logger logger2, int i, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger2);
    }

    public final Level getLevel() {
        return this.level;
    }

    public final void level(Level level2) {
        onGetStartedClick.write((Object) level2, "<set-?>");
        this.level = level2;
    }

    public interface Logger {
        public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
        public static final Logger DEFAULT = new HttpLoggingInterceptor$Logger$Companion$DEFAULT$1();

        void log(String str);

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            private Companion() {
            }

            public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
                this();
            }
        }
    }

    public final void redactHeader(String str) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) FundOnboardingSuccessActivity.IconCompatParcelizer, "$this$CASE_INSENSITIVE_ORDER");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        onGetStartedClick.IconCompatParcelizer((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        Collection collection = treeSet;
        HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(collection, this.headersToRedact);
        collection.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        onGetStartedClick.write((Object) level2, "level");
        HttpLoggingInterceptor httpLoggingInterceptor = this;
        httpLoggingInterceptor.level = level2;
        return httpLoggingInterceptor;
    }

    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m6426deprecated_level() {
        return this.level;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        Charset charset;
        Throwable th;
        Charset charset2;
        Interceptor.Chain chain2 = chain;
        onGetStartedClick.write((Object) chain2, "chain");
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain2.proceed(request);
        }
        boolean z2 = level2 == Level.BODY;
        boolean z3 = z2 || level2 == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        if (connection != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(connection.protocol());
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        String obj = sb.toString();
        if (!z3 && body != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" (");
            sb3.append(body.contentLength());
            sb3.append("-byte body)");
            obj = sb3.toString();
        }
        this.logger.log(obj);
        if (z3) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType == null || headers.get("Content-Type") != null) {
                    z = z3;
                } else {
                    Logger logger2 = this.logger;
                    StringBuilder sb4 = new StringBuilder();
                    z = z3;
                    sb4.append("Content-Type: ");
                    sb4.append(contentType);
                    logger2.log(sb4.toString());
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    Logger logger3 = this.logger;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Content-Length: ");
                    sb5.append(body.contentLength());
                    logger3.log(sb5.toString());
                }
            } else {
                z = z3;
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!z2 || body == null) {
                Logger logger4 = this.logger;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("--> END ");
                sb6.append(request.method());
                logger4.log(sb6.toString());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                Logger logger5 = this.logger;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("--> END ");
                sb7.append(request.method());
                sb7.append(" (encoded body omitted)");
                logger5.log(sb7.toString());
            } else if (body.isDuplex()) {
                Logger logger6 = this.logger;
                StringBuilder sb8 = new StringBuilder();
                sb8.append("--> END ");
                sb8.append(request.method());
                sb8.append(" (duplex request body omitted)");
                logger6.log(sb8.toString());
            } else {
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                body.writeTo(sCBUniversalWebViewActivity);
                MediaType contentType2 = body.contentType();
                if (contentType2 == null || (charset2 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    onGetStartedClick.IconCompatParcelizer((Object) charset2, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(sCBUniversalWebViewActivity)) {
                    this.logger.log(sCBUniversalWebViewActivity.write(charset2));
                    Logger logger7 = this.logger;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("--> END ");
                    sb9.append(request.method());
                    sb9.append(" (");
                    sb9.append(body.contentLength());
                    sb9.append("-byte body)");
                    logger7.log(sb9.toString());
                } else {
                    Logger logger8 = this.logger;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("--> END ");
                    sb10.append(request.method());
                    sb10.append(" (binary ");
                    sb10.append(body.contentLength());
                    sb10.append("-byte body omitted)");
                    logger8.log(sb10.toString());
                }
            }
        } else {
            z = z3;
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            if (body2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(contentLength);
                sb11.append("-byte");
                str2 = sb11.toString();
            } else {
                str2 = "unknown-length";
            }
            Logger logger9 = this.logger;
            String str5 = "-byte body)";
            StringBuilder sb12 = new StringBuilder();
            long j = contentLength;
            sb12.append("<-- ");
            sb12.append(proceed.code());
            if (proceed.message().length() == 0) {
                str3 = "";
            } else {
                String message = proceed.message();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(" ");
                sb13.append(message);
                str3 = sb13.toString();
            }
            sb12.append(str3);
            sb12.append(' ');
            sb12.append(proceed.request().url());
            sb12.append(" (");
            sb12.append(millis);
            sb12.append("ms");
            if (!z) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(", ");
                sb14.append(str2);
                sb14.append(" body");
                str4 = sb14.toString();
            } else {
                str4 = "";
            }
            sb12.append(str4);
            sb12.append(')');
            logger9.log(sb12.toString());
            if (z) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z2 || !HttpHeaders.promisesBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    NsipPartnerPaymentOtpActivity source = body2.source();
                    source.MediaBrowserCompat$SearchResultReceiver(Long.MAX_VALUE);
                    SCBUniversalWebViewActivity MediaMetadataCompat = source.MediaMetadataCompat();
                    Long l = null;
                    if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("gzip", headers2.get("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(MediaMetadataCompat.read);
                        Closeable nsipPaymentLandingActivity = new NsipPaymentLandingActivity(MediaMetadataCompat.clone());
                        try {
                            SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = new SCBUniversalWebViewActivity();
                            sCBUniversalWebViewActivity2.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) (NsipPaymentLandingActivity) nsipPaymentLandingActivity);
                            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(nsipPaymentLandingActivity, (Throwable) null);
                            l = valueOf;
                            MediaMetadataCompat = sCBUniversalWebViewActivity2;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(nsipPaymentLandingActivity, th);
                            throw th3;
                        }
                    }
                    MediaType contentType3 = body2.contentType();
                    if (contentType3 == null || (charset = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        onGetStartedClick.IconCompatParcelizer((Object) charset, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(MediaMetadataCompat)) {
                        this.logger.log("");
                        Logger logger10 = this.logger;
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append("<-- END HTTP (binary ");
                        sb15.append(MediaMetadataCompat.read);
                        sb15.append("-byte body omitted)");
                        logger10.log(sb15.toString());
                        return proceed;
                    }
                    if (j != 0) {
                        this.logger.log("");
                        this.logger.log(MediaMetadataCompat.clone().write(charset));
                    }
                    if (l != null) {
                        Logger logger11 = this.logger;
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("<-- END HTTP (");
                        sb16.append(MediaMetadataCompat.read);
                        sb16.append("-byte, ");
                        sb16.append(l);
                        sb16.append("-gzipped-byte body)");
                        logger11.log(sb16.toString());
                    } else {
                        Logger logger12 = this.logger;
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("<-- END HTTP (");
                        sb17.append(MediaMetadataCompat.read);
                        sb17.append(str5);
                        logger12.log(sb17.toString());
                    }
                }
            }
            return proceed;
        } catch (Exception e) {
            Exception exc = e;
            Logger logger13 = this.logger;
            StringBuilder sb18 = new StringBuilder();
            sb18.append("<-- HTTP FAILED: ");
            sb18.append(exc);
            logger13.log(sb18.toString());
            throw exc;
        }
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        Logger logger2 = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append(headers.name(i));
        sb.append(": ");
        sb.append(value);
        logger2.log(sb.toString());
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str == null || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "identity", true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "gzip", true)) {
            return false;
        }
        return true;
    }
}
