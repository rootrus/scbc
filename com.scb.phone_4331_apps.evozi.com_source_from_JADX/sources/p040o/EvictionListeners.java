package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.EvictionListeners */
public final class EvictionListeners {
    @SerializedName("dividendWithholdingTaxFlag")
    private final String IconCompatParcelizer;
    @SerializedName("creditLimit")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("aumValue")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountSegmentCode")
    private final String read;
    @SerializedName("accountSegmentDesc")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvictionListeners)) {
            return false;
        }
        EvictionListeners evictionListeners = (EvictionListeners) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) evictionListeners.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) evictionListeners.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) evictionListeners.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) evictionListeners.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) evictionListeners.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSCreditLimitRequest(aumValue=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountSegmentCode=");
        sb.append(this.read);
        sb.append(", accountSegmentDesc=");
        sb.append(this.write);
        sb.append(", creditLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", dividendWithholdingTaxFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public EvictionListeners(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "aumValue");
        onGetStartedClick.write((Object) str2, "accountSegmentCode");
        onGetStartedClick.write((Object) str3, "accountSegmentDesc");
        onGetStartedClick.write((Object) str5, "dividendWithholdingTaxFlag");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
    }
}
