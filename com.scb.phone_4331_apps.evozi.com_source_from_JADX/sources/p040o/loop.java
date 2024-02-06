package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.loop */
public final class loop {
    @SerializedName("email")
    public final String IconCompatParcelizer;
    @SerializedName("remarks")
    public final List<isMergePathsEnabledForKitKatAndAbove> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("mainAccountFlag")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionToken")
    public final String MediaMetadataCompat;
    @SerializedName("subDeposit")
    public final List<IconCompatParcelizer> RatingCompat;
    @SerializedName("closingAccount")
    public final loop$MediaBrowserCompat$ItemReceiver read;
    @SerializedName("receivingAccount")
    public final isAnimating write;

    /* renamed from: o.loop$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("maturityDate")
        public final String IconCompatParcelizer;
        @SerializedName("deposit")
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("date")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("number")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("tax")
        public final double MediaDescriptionCompat;
        @SerializedName("totalAmount")
        public final double RatingCompat;
        @SerializedName("interestRate")
        public final double read;
        @SerializedName("interest")
        public final double write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) iconCompatParcelizer.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.write, iconCompatParcelizer.write) == 0 && Double.compare(this.read, iconCompatParcelizer.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && Double.compare(this.MediaDescriptionCompat, iconCompatParcelizer.MediaDescriptionCompat) == 0 && Double.compare(this.RatingCompat, iconCompatParcelizer.RatingCompat) == 0;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.write);
            int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.read);
            int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
            String str3 = this.IconCompatParcelizer;
            if (str3 != null) {
                i = str3.hashCode();
            }
            long doubleToLongBits4 = Double.doubleToLongBits(this.MediaDescriptionCompat);
            long doubleToLongBits5 = Double.doubleToLongBits(this.RatingCompat);
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SubDepositEntity(number=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", date=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", deposit=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", interest=");
            sb.append(this.write);
            sb.append(", interestRate=");
            sb.append(this.read);
            sb.append(", maturityDate=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", tax=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", totalAmount=");
            sb.append(this.RatingCompat);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loop)) {
            return false;
        }
        loop loop = (loop) obj;
        return this.MediaBrowserCompat$ItemReceiver == loop.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) loop.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) loop.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) loop.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) loop.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) loop.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) loop.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        loop$MediaBrowserCompat$ItemReceiver loop_mediabrowsercompat_itemreceiver = this.read;
        int i2 = 0;
        int hashCode = loop_mediabrowsercompat_itemreceiver != null ? loop_mediabrowsercompat_itemreceiver.hashCode() : 0;
        isAnimating isanimating = this.write;
        int hashCode2 = isanimating != null ? isanimating.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode3 = str != null ? str.hashCode() : 0;
        List<IconCompatParcelizer> list = this.RatingCompat;
        int hashCode4 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        List<isMergePathsEnabledForKitKatAndAbove> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountEligibilityValidationEntity(mainAccountFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", closingAccount=");
        sb.append(this.read);
        sb.append(", receivingAccount=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subDeposit=");
        sb.append(this.RatingCompat);
        sb.append(", transactionToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", remarks=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
