package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.typefaceForStyle */
public final class typefaceForStyle {
    @SerializedName("descriptionTH")
    public final String IconCompatParcelizer;
    @SerializedName("iconPath")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("titleEN")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("titleTH")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("descriptionEN")
    public final String read;
    @SerializedName("buttons")
    public final List<ImageAssetManager> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof typefaceForStyle)) {
            return false;
        }
        typefaceForStyle typefaceforstyle = (typefaceForStyle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) typefaceforstyle.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) typefaceforstyle.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) typefaceforstyle.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) typefaceforstyle.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) typefaceforstyle.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) typefaceforstyle.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<ImageAssetManager> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlNTBApplyLoanEntryEntity(titleEN=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", titleTH=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", iconPath=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", descriptionEN=");
        sb.append(this.read);
        sb.append(", descriptionTH=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", buttons=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
