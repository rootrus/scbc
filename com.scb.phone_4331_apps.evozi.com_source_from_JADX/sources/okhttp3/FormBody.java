package okhttp3;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p040o.NsipPartnerPaymentReviewActivity;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.SCBUniversalWebViewActivity;
import p040o.onGetStartedClick;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    public FormBody(List<String> list, List<String> list2) {
        onGetStartedClick.write((Object) list, "encodedNames");
        onGetStartedClick.write((Object) list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m6361deprecated_size() {
        return size();
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, (Object) null);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, (Object) null);
    }

    public final MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final long contentLength() {
        return writeOrCountBytes((NsipPartnerPaymentReviewActivity) null, true);
    }

    public final void writeTo(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity) throws IOException {
        onGetStartedClick.write((Object) nsipPartnerPaymentReviewActivity, "sink");
        writeOrCountBytes(nsipPartnerPaymentReviewActivity, false);
    }

    private final long writeOrCountBytes(NsipPartnerPaymentReviewActivity nsipPartnerPaymentReviewActivity, boolean z) {
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity;
        if (z) {
            sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
        } else {
            if (nsipPartnerPaymentReviewActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            sCBUniversalWebViewActivity = nsipPartnerPaymentReviewActivity.MediaMetadataCompat();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(38);
            }
            String str = this.encodedNames.get(i);
            onGetStartedClick.write((Object) str, "string");
            sCBUniversalWebViewActivity.write(str, 0, str.length());
            sCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(61);
            String str2 = this.encodedValues.get(i);
            onGetStartedClick.write((Object) str2, "string");
            sCBUniversalWebViewActivity.write(str2, 0, str2.length());
        }
        if (!z) {
            return 0;
        }
        long j = sCBUniversalWebViewActivity.read;
        sCBUniversalWebViewActivity.MediaBrowserCompat$MediaItem(sCBUniversalWebViewActivity.read);
        return j;
    }

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this((Charset) null, 1, (NtbDiscoverFundFilterActivity) null);
        }

        public Builder(Charset charset2) {
            this.charset = charset2;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Charset charset2, int i, NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this((i & 1) != 0 ? null : charset2);
        }

        public final Builder add(String str, String str2) {
            String str3 = str;
            onGetStartedClick.write((Object) str3, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, builder.charset, 91, (Object) null));
            builder.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, builder.charset, 91, (Object) null));
            return builder;
        }

        public final Builder addEncoded(String str, String str2) {
            String str3 = str;
            onGetStartedClick.write((Object) str3, "name");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Builder builder = this;
            builder.names.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, builder.charset, 83, (Object) null));
            builder.values.add(HttpUrl.Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, builder.charset, 83, (Object) null));
            return builder;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }
}
