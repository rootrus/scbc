package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.GoogleAnalytics;

/* renamed from: o.evictsBySize */
public final class evictsBySize {
    @SerializedName("accountFrom")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountTo")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productSubAttribute")
    private final String read;
    @SerializedName("transferType")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evictsBySize)) {
            return false;
        }
        evictsBySize evictsbysize = (evictsBySize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) evictsbysize.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) evictsbysize.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) evictsbysize.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) evictsbysize.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountVerificationRequest(accountFrom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountTo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transferType=");
        sb.append(this.write);
        sb.append(", productSubAttribute=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public evictsBySize(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "accountFrom");
        onGetStartedClick.write((Object) str2, "accountTo");
        onGetStartedClick.write((Object) str3, "transferType");
        onGetStartedClick.write((Object) str4, "productSubAttribute");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.read = str4;
    }

    /* renamed from: o.evictsBySize$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ GoogleAnalytics.zzb read;

        private write() {
        }

        public /* synthetic */ write(GoogleAnalytics.zzb zzb) {
            this.read = zzb;
        }

        public final Object IconCompatParcelizer(Object obj) {
            DeepLinkModule deepLinkModule = (DeepLinkModule) obj;
            return new SupportStreetViewPanoramaFragment(deepLinkModule.MediaBrowserCompat$ItemReceiver, deepLinkModule.write, deepLinkModule.MediaBrowserCompat$CustomActionResultReceiver, deepLinkModule.RatingCompat, deepLinkModule.read, deepLinkModule.IconCompatParcelizer);
        }
    }
}
