package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieImageAsset */
public final class LottieImageAsset {
    @SerializedName("insuranceCreditLife")
    public final String IconCompatParcelizer;
    @SerializedName("collateralCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("collateralLocation")
    public final zzwk MediaBrowserCompat$ItemReceiver;
    @SerializedName("residentialStatus")
    public final String MediaDescriptionCompat;
    @SerializedName("insuranceFire")
    public final String RatingCompat;
    @SerializedName("collateralPrice")
    public final String read;
    @SerializedName("collateralOwnership")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieImageAsset)) {
            return false;
        }
        LottieImageAsset lottieImageAsset = (LottieImageAsset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieImageAsset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieImageAsset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) lottieImageAsset.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lottieImageAsset.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lottieImageAsset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) lottieImageAsset.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieImageAsset.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        zzwk zzwk = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = zzwk != null ? zzwk.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreFillEntity(collateralCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", collateralOwnership=");
        sb.append(this.write);
        sb.append(", residentialStatus=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", collateralPrice=");
        sb.append(this.read);
        sb.append(", collateralLocation=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", insuranceFire=");
        sb.append(this.RatingCompat);
        sb.append(", insuranceCreditLife=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
