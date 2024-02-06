package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieRelativeIntegerValueCallback */
public final class LottieRelativeIntegerValueCallback {
    @SerializedName("displayForBuyCurrencyFlag")
    public final int IconCompatParcelizer;
    @SerializedName("currency")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("allowTag")
    public final List<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("flagImage")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("displayWalletFlag")
    public final int MediaDescriptionCompat;
    @SerializedName("thbEquivalentAmount")
    public final double MediaMetadataCompat;
    @SerializedName("sortSequence")
    public final int RatingCompat;
    @SerializedName("amount")
    public final double read;
    @SerializedName("currencyName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieRelativeIntegerValueCallback)) {
            return false;
        }
        LottieRelativeIntegerValueCallback lottieRelativeIntegerValueCallback = (LottieRelativeIntegerValueCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieRelativeIntegerValueCallback.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieRelativeIntegerValueCallback.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) lottieRelativeIntegerValueCallback.MediaBrowserCompat$SearchResultReceiver) && Double.compare(this.read, lottieRelativeIntegerValueCallback.read) == 0 && Double.compare(this.MediaMetadataCompat, lottieRelativeIntegerValueCallback.MediaMetadataCompat) == 0 && this.RatingCompat == lottieRelativeIntegerValueCallback.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lottieRelativeIntegerValueCallback.MediaBrowserCompat$ItemReceiver) && this.MediaDescriptionCompat == lottieRelativeIntegerValueCallback.MediaDescriptionCompat && this.IconCompatParcelizer == lottieRelativeIntegerValueCallback.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        int i4 = this.RatingCompat;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i) * 31) + this.MediaDescriptionCompat) * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TravelWalletEntity(currency=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", currencyName=");
        sb.append(this.write);
        sb.append(", flagImage=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", amount=");
        sb.append(this.read);
        sb.append(", thbEquivalentAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", allowTag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", displayWalletFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", displayForBuyCurrencyFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
