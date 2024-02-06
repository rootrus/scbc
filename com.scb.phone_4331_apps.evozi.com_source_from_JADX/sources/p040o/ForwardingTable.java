package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingTable */
public final class ForwardingTable {
    @SerializedName("maxIal")
    private final String IconCompatParcelizer;
    @SerializedName("marketingNameEN")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("marketingNameTH")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("nodeId")
    private final String MediaMetadataCompat;
    @SerializedName("companyCode")
    private final String read;
    @SerializedName("maxAal")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingTable)) {
            return false;
        }
        ForwardingTable forwardingTable = (ForwardingTable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) forwardingTable.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forwardingTable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forwardingTable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forwardingTable.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forwardingTable.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forwardingTable.write);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NdidRpConfirmationRequest(nodeId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", companyCode=");
        sb.append(this.read);
        sb.append(", marketingNameTH=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", marketingNameEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", maxIal=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", maxAal=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingTable(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "nodeId");
        onGetStartedClick.write((Object) str2, "companyCode");
        onGetStartedClick.write((Object) str3, "marketingNameTH");
        onGetStartedClick.write((Object) str4, "marketingNameEN");
        onGetStartedClick.write((Object) str5, "maxIal");
        onGetStartedClick.write((Object) str6, "maxAal");
        this.MediaMetadataCompat = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
        this.write = str6;
    }
}
