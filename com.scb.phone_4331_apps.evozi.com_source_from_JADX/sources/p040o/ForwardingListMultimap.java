package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingListMultimap */
public final class ForwardingListMultimap {
    @SerializedName("applicationId")
    private final String IconCompatParcelizer;
    @SerializedName("cardRefNo")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productCode")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productName")
    private final String MediaDescriptionCompat;
    @SerializedName("accountNo")
    private final String read;
    @SerializedName("cardMask")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingListMultimap)) {
            return false;
        }
        ForwardingListMultimap forwardingListMultimap = (ForwardingListMultimap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forwardingListMultimap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forwardingListMultimap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forwardingListMultimap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forwardingListMultimap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) forwardingListMultimap.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forwardingListMultimap.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardList(applicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardMask=");
        sb.append(this.write);
        sb.append(", productName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", productCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingListMultimap(String str, String str2, String str3, String str4, String str5, String str6) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
    }
}
