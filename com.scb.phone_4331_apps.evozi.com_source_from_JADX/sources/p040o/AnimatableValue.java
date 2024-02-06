package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.AnimatableValue */
public final class AnimatableValue {
    @SerializedName("installment")
    public final propagateToChildren IconCompatParcelizer;
    @SerializedName("principal")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("duration")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tierRateList")
    public final List<lerp> MediaBrowserCompat$MediaItem;
    @SerializedName("repaymentDate")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("repaymentStartDate")
    public final String MediaDescriptionCompat;
    @SerializedName("promoCode")
    public final String MediaMetadataCompat;
    @SerializedName("productType")
    public final String RatingCompat;
    @SerializedName("dutyStampFee")
    public final getOffset read;
    @SerializedName("annualInterest")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatableValue)) {
            return false;
        }
        AnimatableValue animatableValue = (AnimatableValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatableValue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableValue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatableValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatableValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatableValue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) animatableValue.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) animatableValue.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) animatableValue.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) animatableValue.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) animatableValue.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getOffset getoffset = this.read;
        int hashCode3 = getoffset != null ? getoffset.hashCode() : 0;
        propagateToChildren propagatetochildren = this.IconCompatParcelizer;
        int hashCode4 = propagatetochildren != null ? propagatetochildren.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode9 = str7 != null ? str7.hashCode() : 0;
        List<lerp> list = this.MediaBrowserCompat$MediaItem;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerSummaryEntity(annualInterest=");
        sb.append(this.write);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", dutyStampFee=");
        sb.append(this.read);
        sb.append(", installment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", principal=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productType=");
        sb.append(this.RatingCompat);
        sb.append(", promoCode=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", repaymentDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", tierRateList=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}
