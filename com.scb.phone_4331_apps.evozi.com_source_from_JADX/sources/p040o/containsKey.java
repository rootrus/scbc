package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.containsKey */
public final class containsKey {
    @SerializedName("id")
    public final String IconCompatParcelizer;
    @SerializedName("descriptionEN")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("riskFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final Integer RatingCompat;
    @SerializedName("code")
    public final String read;
    @SerializedName("descriptionTH")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof containsKey)) {
            return false;
        }
        containsKey containskey = (containsKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) containskey.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) containskey.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) containskey.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) containskey.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) containskey.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) containskey.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        Integer num = this.RatingCompat;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubCategoryInfoEntity(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", code=");
        sb.append(this.read);
        sb.append(", id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", descriptionTH=");
        sb.append(this.write);
        sb.append(", descriptionEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", riskFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
