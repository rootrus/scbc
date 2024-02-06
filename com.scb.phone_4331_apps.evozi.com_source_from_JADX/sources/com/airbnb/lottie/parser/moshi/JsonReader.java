package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p040o.NsipPartnerPaymentOtpActivity;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onAlienCardTabClicked;

public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    boolean failOnUnknown;
    boolean lenient;
    int[] pathIndices = new int[32];
    String[] pathNames = new String[32];
    int[] scopes = new int[32];
    int stackSize;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public abstract boolean hasNext() throws IOException;

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public abstract int selectName(Options options) throws IOException;

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: of */
    public static JsonReader m32of(NsipPartnerPaymentOtpActivity nsipPartnerPaymentOtpActivity) {
        return new JsonUtf8Reader(nsipPartnerPaymentOtpActivity);
    }

    JsonReader() {
    }

    /* access modifiers changed from: package-private */
    public final void pushScope(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.scopes;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.scopes = Arrays.copyOf(iArr, iArr.length << 1);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length << 1);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(getPath());
                throw new JsonDataException(sb.toString());
            }
        }
        int[] iArr3 = this.scopes;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: package-private */
    public final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(getPath());
        throw new JsonEncodingException(sb.toString());
    }

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public static final class Options {
        final onAlienCardTabClicked doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, onAlienCardTabClicked onaliencardtabclicked) {
            this.strings = strArr;
            this.doubleQuoteSuffix = onaliencardtabclicked;
        }

        /* renamed from: of */
        public static Options m33of(String... strArr) {
            try {
                SCBUniversalWebViewActivity_ViewBinding[] sCBUniversalWebViewActivity_ViewBindingArr = new SCBUniversalWebViewActivity_ViewBinding[strArr.length];
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.string(sCBUniversalWebViewActivity, strArr[i]);
                    sCBUniversalWebViewActivity.MediaBrowserCompat$SearchResultReceiver();
                    sCBUniversalWebViewActivity_ViewBindingArr[i] = new SCBUniversalWebViewActivity_ViewBinding(sCBUniversalWebViewActivity.RatingCompat());
                }
                return new Options((String[]) strArr.clone(), onAlienCardTabClicked.read(sCBUniversalWebViewActivity_ViewBindingArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void string(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, String str) throws IOException {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                nsipPartnerPaymentReviewActivity.write(str, i, i2);
            }
            nsipPartnerPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(str2);
            i = i2 + 1;
        }
        if (i < length) {
            nsipPartnerPaymentReviewActivity.write(str, i, length);
        }
        nsipPartnerPaymentReviewActivity.MediaBrowserCompat$ItemReceiver(34);
    }
}
