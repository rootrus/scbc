package okhttp3.internal.http2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.C7043xa484e06c;
import p040o.NtbDiscoverFundFilterActivity;
import p040o.PinChangeSuccessActivity;
import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public final class Header {
    public static final Companion Companion = new Companion((NtbDiscoverFundFilterActivity) null);
    public static final SCBUniversalWebViewActivity_ViewBinding PSEUDO_PREFIX = PinChangeSuccessActivity.read(":");
    public static final SCBUniversalWebViewActivity_ViewBinding RESPONSE_STATUS = PinChangeSuccessActivity.read(RESPONSE_STATUS_UTF8);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final SCBUniversalWebViewActivity_ViewBinding TARGET_AUTHORITY = PinChangeSuccessActivity.read(TARGET_AUTHORITY_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final SCBUniversalWebViewActivity_ViewBinding TARGET_METHOD = PinChangeSuccessActivity.read(TARGET_METHOD_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final SCBUniversalWebViewActivity_ViewBinding TARGET_PATH = PinChangeSuccessActivity.read(TARGET_PATH_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final SCBUniversalWebViewActivity_ViewBinding TARGET_SCHEME = PinChangeSuccessActivity.read(TARGET_SCHEME_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final SCBUniversalWebViewActivity_ViewBinding name;
    public final SCBUniversalWebViewActivity_ViewBinding value;

    public static /* synthetic */ Header copy$default(Header header, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2, int i, Object obj) {
        if ((i & 1) != 0) {
            sCBUniversalWebViewActivity_ViewBinding = header.name;
        }
        if ((i & 2) != 0) {
            sCBUniversalWebViewActivity_ViewBinding2 = header.value;
        }
        return header.copy(sCBUniversalWebViewActivity_ViewBinding, sCBUniversalWebViewActivity_ViewBinding2);
    }

    public final SCBUniversalWebViewActivity_ViewBinding component1() {
        return this.name;
    }

    public final SCBUniversalWebViewActivity_ViewBinding component2() {
        return this.value;
    }

    public final Header copy(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "name");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new Header(sCBUniversalWebViewActivity_ViewBinding, sCBUniversalWebViewActivity_ViewBinding2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.name, (Object) header.name) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.value, (Object) header.value);
    }

    public final int hashCode() {
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = this.name;
        int i = 0;
        int hashCode = sCBUniversalWebViewActivity_ViewBinding != null ? sCBUniversalWebViewActivity_ViewBinding.hashCode() : 0;
        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = this.value;
        if (sCBUniversalWebViewActivity_ViewBinding2 != null) {
            i = sCBUniversalWebViewActivity_ViewBinding2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public Header(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "name");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.name = sCBUniversalWebViewActivity_ViewBinding;
        this.value = sCBUniversalWebViewActivity_ViewBinding2;
        this.hpackSize = sCBUniversalWebViewActivity_ViewBinding.write() + 32 + this.value.write();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Header(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "name"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.String r0 = "value"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            o.SCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver r0 = p040o.SCBUniversalWebViewActivity_ViewBinding.write
            java.lang.String r0 = "$receiver"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            o.SCBUniversalWebViewActivity_ViewBinding r3 = p040o.PinChangeSuccessActivity.read((java.lang.String) r3)
            o.SCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver r1 = p040o.SCBUniversalWebViewActivity_ViewBinding.write
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            o.SCBUniversalWebViewActivity_ViewBinding r4 = p040o.PinChangeSuccessActivity.read((java.lang.String) r4)
            r2.<init>((p040o.SCBUniversalWebViewActivity_ViewBinding) r3, (p040o.SCBUniversalWebViewActivity_ViewBinding) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding, String str) {
        this(sCBUniversalWebViewActivity_ViewBinding, PinChangeSuccessActivity.read(str));
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "name");
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) str, "$receiver");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PinChangeSuccessActivity.MediaMetadataCompat(this.name));
        sb.append(": ");
        sb.append(PinChangeSuccessActivity.MediaMetadataCompat(this.value));
        return sb.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(NtbDiscoverFundFilterActivity ntbDiscoverFundFilterActivity) {
            this();
        }
    }

    static {
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) ":", "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) RESPONSE_STATUS_UTF8, "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver3 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) TARGET_METHOD_UTF8, "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver4 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) TARGET_PATH_UTF8, "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver5 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) TARGET_SCHEME_UTF8, "$receiver");
        C7043xa484e06c sCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver6 = SCBUniversalWebViewActivity_ViewBinding.write;
        onGetStartedClick.write((Object) TARGET_AUTHORITY_UTF8, "$receiver");
    }
}
