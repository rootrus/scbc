package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeFromChain */
public class removeFromChain {
    @SerializedName("accountType")
    private String IconCompatParcelizer;
    @SerializedName("productName")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productCode")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productSubAttribute")
    private String RatingCompat;
    @SerializedName("objectiveId")
    private String read;
    @SerializedName("productDescription")
    private String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeFromChain)) {
            return false;
        }
        removeFromChain removefromchain = (removeFromChain) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? removefromchain.IconCompatParcelizer != null : !str.equals(removefromchain.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? removefromchain.MediaBrowserCompat$ItemReceiver != null : !str2.equals(removefromchain.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 == null ? removefromchain.MediaBrowserCompat$CustomActionResultReceiver != null : !str3.equals(removefromchain.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str4 = this.RatingCompat;
        if (str4 == null ? removefromchain.RatingCompat != null : !str4.equals(removefromchain.RatingCompat)) {
            return false;
        }
        String str5 = this.write;
        if (str5 == null ? removefromchain.write != null : !str5.equals(removefromchain.write)) {
            return false;
        }
        String str6 = this.read;
        String str7 = removefromchain.read;
        if (str6 != null) {
            return str6.equals(str7);
        }
        if (str7 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }
}
