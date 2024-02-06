package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieInterpolatedValue */
public final class LottieInterpolatedValue {
    @SerializedName("remark")
    public final String IconCompatParcelizer;
    @SerializedName("prepaidCardTypeList")
    public final List<getStartValueFloat> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("mailingAddress")
    public final LottieInterpolatedValue$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    @SerializedName("existingPrepaidCardList")
    public final List<IconCompatParcelizer> write;

    /* renamed from: o.LottieInterpolatedValue$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("cardRefNo")
        public final String IconCompatParcelizer;
        @SerializedName("cardMask")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("prepaidCardType")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("productType")
        public final getStartValueInt MediaMetadataCompat;
        @SerializedName("allowTag")
        public final List<String> read;
        @SerializedName("cardStatus")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) iconCompatParcelizer.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            getStartValueInt getstartvalueint = this.MediaMetadataCompat;
            int hashCode4 = getstartvalueint != null ? getstartvalueint.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            List<String> list = this.read;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidCardEntity(cardRefNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", cardMask=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", cardStatus=");
            sb.append(this.write);
            sb.append(", productType=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", prepaidCardType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", allowTag=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieInterpolatedValue)) {
            return false;
        }
        LottieInterpolatedValue lottieInterpolatedValue = (LottieInterpolatedValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieInterpolatedValue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieInterpolatedValue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieInterpolatedValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lottieInterpolatedValue.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<IconCompatParcelizer> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<getStartValueFloat> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode3 = str != null ? str.hashCode() : 0;
        LottieInterpolatedValue$MediaBrowserCompat$ItemReceiver lottieInterpolatedValue$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (lottieInterpolatedValue$MediaBrowserCompat$ItemReceiver != null) {
            i = lottieInterpolatedValue$MediaBrowserCompat$ItemReceiver.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestLandingEntity(existingPrepaidCardList=");
        sb.append(this.write);
        sb.append(", prepaidCardTypeList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
