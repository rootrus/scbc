package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import p040o.GroupFavoriteActivity;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private Reader reader;

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, MediaType mediaType, long j) {
        return Companion.create(nsipPartnerPaymentOtpActivity, mediaType, j);
    }

    public static final ResponseBody create(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType) {
        return Companion.create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
        return Companion.create(mediaType, j, nsipPartnerPaymentOtpActivity);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        return Companion.create(mediaType, sCBUniversalWebViewActivity_ViewBinding);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract NsipPartnerPaymentOtpActivity source();

    public final InputStream byteStream() {
        return source().MediaDescriptionCompat();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <T> T consumeSource(p040o.FundFactSheetActivity<? super p040o.NsipPartnerPaymentOtpActivity, ? extends T> r5, p040o.FundFactSheetActivity<? super T, java.lang.Integer> r6) {
        /*
            r4 = this;
            long r0 = r4.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x005d
            o.NsipPartnerPaymentOtpActivity r2 = r4.source()
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r5 = r5.invoke(r2)     // Catch:{ all -> 0x0056 }
            r3 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r3)
            java.lang.Object r6 = r6.invoke(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            long r2 = (long) r6
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            goto L_0x0055
        L_0x002f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "Content-Length ("
            r5.append(r2)
            r5.append(r0)
            java.lang.String r0 = ") and stream length ("
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = ") disagree"
            r5.append(r6)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0055:
            return r5
        L_0x0056:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r6 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r5)
            throw r6
        L_0x005d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Cannot buffer entire body for content length: "
            r5.append(r6)
            r5.append(r0)
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.consumeSource(o.FundFactSheetActivity, o.FundFactSheetActivity):java.lang.Object");
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        Reader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r3 = this;
            o.NsipPartnerPaymentOtpActivity r0 = r3.source()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            o.NsipPartnerPaymentOtpActivity r1 = (p040o.NsipPartnerPaymentOtpActivity) r1     // Catch:{ all -> 0x001a }
            java.nio.charset.Charset r2 = r3.charset()     // Catch:{ all -> 0x001a }
            java.nio.charset.Charset r2 = okhttp3.internal.Util.readBomAsCharset(r1, r2)     // Catch:{ all -> 0x001a }
            java.lang.String r1 = r1.write((java.nio.charset.Charset) r2)     // Catch:{ all -> 0x001a }
            r2 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r2)
            return r1
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r2 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.string():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.charset(p040o.GroupFavoriteActivity.IconCompatParcelizer);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.nio.charset.Charset charset() {
        /*
            r2 = this;
            okhttp3.MediaType r0 = r2.contentType()
            if (r0 == 0) goto L_0x000e
            java.nio.charset.Charset r1 = p040o.GroupFavoriteActivity.IconCompatParcelizer
            java.nio.charset.Charset r0 = r0.charset(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.nio.charset.Charset r0 = p040o.GroupFavoriteActivity.IconCompatParcelizer
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.charset():java.nio.charset.Charset");
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final NsipPartnerPaymentOtpActivity source;

        public BomAwareReader(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, Charset charset2) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "source");
            onGetStartedClick.write((Object) charset2, "charset");
            this.source = nsipPartnerPaymentOtpActivity;
            this.charset = charset2;
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            onGetStartedClick.write((Object) cArr, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.MediaDescriptionCompat(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }

        public final void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            onGetStartedClick.write((Object) str, "$this$toResponseBody");
            Charset charset = GroupFavoriteActivity.IconCompatParcelizer;
            if (mediaType != null && (charset = MediaType.charset$default(mediaType, (Charset) null, 1, (Object) null)) == null) {
                charset = GroupFavoriteActivity.IconCompatParcelizer;
                MediaType.Companion companion = MediaType.Companion;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = companion.parse(sb.toString());
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            onGetStartedClick.write((Object) str, "string");
            onGetStartedClick.write((Object) charset, "charset");
            SCBUniversalWebViewActivity IconCompatParcelizer = sCBUniversalWebViewActivity.IconCompatParcelizer(str, 0, str.length(), charset);
            return create((NsipPartnerPaymentOtpActivity) IconCompatParcelizer, mediaType, IconCompatParcelizer.read);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            onGetStartedClick.write((Object) bArr, "$this$toResponseBody");
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            onGetStartedClick.write((Object) bArr, "source");
            return create((NsipPartnerPaymentOtpActivity) sCBUniversalWebViewActivity.IconCompatParcelizer(bArr, 0, bArr.length), mediaType, (long) bArr.length);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
        }

        public final ResponseBody create(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, MediaType mediaType) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "$this$toResponseBody");
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "byteString");
            sCBUniversalWebViewActivity_ViewBinding.write(sCBUniversalWebViewActivity);
            return create((NsipPartnerPaymentOtpActivity) sCBUniversalWebViewActivity, mediaType, (long) sCBUniversalWebViewActivity_ViewBinding.write());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(nsipPartnerPaymentOtpActivity, mediaType, j);
        }

        public final ResponseBody create(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity, MediaType mediaType, long j) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "$this$asResponseBody");
            return new ResponseBody$Companion$asResponseBody$1(nsipPartnerPaymentOtpActivity, mediaType, j);
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            onGetStartedClick.write((Object) str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            onGetStartedClick.write((Object) bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "content");
            return create(sCBUniversalWebViewActivity_ViewBinding, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
            onGetStartedClick.write((Object) nsipPartnerPaymentOtpActivity, "content");
            return create(nsipPartnerPaymentOtpActivity, mediaType, j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0057
            o.NsipPartnerPaymentOtpActivity r2 = r6.source()
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = r2
            o.NsipPartnerPaymentOtpActivity r3 = (p040o.NsipPartnerPaymentOtpActivity) r3     // Catch:{ all -> 0x0050 }
            byte[] r3 = r3.RatingCompat()     // Catch:{ all -> 0x0050 }
            r4 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r4)
            int r2 = r3.length
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x004f
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
            goto L_0x004f
        L_0x0029:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Content-Length ("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x004f:
            return r3
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x0057:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            r2.append(r3)
            r2.append(r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.bytes():byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.SCBUniversalWebViewActivity_ViewBinding byteString() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.contentLength()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x005a
            o.NsipPartnerPaymentOtpActivity r2 = r6.source()
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = r2
            o.NsipPartnerPaymentOtpActivity r3 = (p040o.NsipPartnerPaymentOtpActivity) r3     // Catch:{ all -> 0x0053 }
            o.SCBUniversalWebViewActivity_ViewBinding r3 = r3.ParcelableVolumeInfo()     // Catch:{ all -> 0x0053 }
            r4 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r4)
            int r2 = r3.write()
            r4 = -1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            long r4 = (long) r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x002c
            goto L_0x0052
        L_0x002c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Content-Length ("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0052:
            return r3
        L_0x0053:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x005a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            r2.append(r3)
            r2.append(r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.ResponseBody.byteString():o.SCBUniversalWebViewActivity_ViewBinding");
    }
}
