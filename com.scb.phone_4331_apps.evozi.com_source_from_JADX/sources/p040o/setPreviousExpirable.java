package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setPreviousExpirable */
public class setPreviousExpirable {
    @SerializedName("productType")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tilesVersion")
    public String write;

    public /* synthetic */ setPreviousExpirable(setPreviousExpirable$MediaBrowserCompat$ItemReceiver setpreviousexpirable_mediabrowsercompat_itemreceiver, byte b) {
        this(setpreviousexpirable_mediabrowsercompat_itemreceiver);
    }

    private setPreviousExpirable(setPreviousExpirable$MediaBrowserCompat$ItemReceiver setpreviousexpirable_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setpreviousexpirable_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = ((setPreviousExpirable) obj).MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReferralVerificationRequest{productType='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
