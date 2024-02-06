package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.MaskKeyframeAnimation */
public final class MaskKeyframeAnimation {
    @SerializedName("duration")
    public final String IconCompatParcelizer;
    @SerializedName("annualInterest")
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("principal")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("repaymentStartDate")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("productCatalogue")
    public final getEndPoint MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tierRateList")
    public final List<lerp> MediaMetadataCompat;
    @SerializedName("dutyStampFee")
    public final IconCompatParcelizer read;
    @SerializedName("installment")
    public final MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver write;

    /* renamed from: o.MaskKeyframeAnimation$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("rate")
        public final String read;
        @SerializedName("maxAmount")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DutyStamp(rate=");
            sb.append(this.read);
            sb.append(", maxAmount=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskKeyframeAnimation)) {
            return false;
        }
        MaskKeyframeAnimation maskKeyframeAnimation = (MaskKeyframeAnimation) obj;
        return Double.compare(this.MediaBrowserCompat$ItemReceiver, maskKeyframeAnimation.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) maskKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) maskKeyframeAnimation.write) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, maskKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) maskKeyframeAnimation.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) maskKeyframeAnimation.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) maskKeyframeAnimation.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) maskKeyframeAnimation.read);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver = this.write;
        int hashCode2 = maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver != null ? maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        List<lerp> list = this.MediaMetadataCompat;
        int hashCode4 = list != null ? list.hashCode() : 0;
        getEndPoint getendpoint = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = getendpoint != null ? getendpoint.hashCode() : 0;
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            i2 = iconCompatParcelizer.hashCode();
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCalculateLoanEntity(principal=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", duration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", installment=");
        sb.append(this.write);
        sb.append(", annualInterest=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", tierRateList=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", productCatalogue=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", dutyStampFee=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
