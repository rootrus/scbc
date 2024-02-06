package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getAscent */
public final class getAscent {
    @SerializedName("dutyStampFee")
    public final read IconCompatParcelizer;
    @SerializedName("duration")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("annualInterest")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("repaymentStartDate")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("repaymentDate")
    public final String MediaDescriptionCompat;
    @SerializedName("principal")
    public final String MediaMetadataCompat;
    @SerializedName("tierRateList")
    public final List<lerp> RatingCompat;
    @SerializedName("installmentFrequency")
    public final IconCompatParcelizer read;
    @SerializedName("installmentAmount")
    public final String write;

    /* renamed from: o.getAscent$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("perUnit")
        public final String IconCompatParcelizer;
        @SerializedName("unit")
        public final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InstallmentFrequency(perUnit=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", unit=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.getAscent$read */
    public static final class read {
        @SerializedName("maxAmount")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("rate")
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read2.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MaxDutyStampFee(rate=");
            sb.append(this.read);
            sb.append(", amount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAscent)) {
            return false;
        }
        getAscent getascent = (getAscent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getascent.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getascent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getascent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getascent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getascent.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getascent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getascent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getascent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getascent.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        IconCompatParcelizer iconCompatParcelizer = this.read;
        int hashCode4 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        List<lerp> list = this.RatingCompat;
        int hashCode8 = list != null ? list.hashCode() : 0;
        read read2 = this.IconCompatParcelizer;
        if (read2 != null) {
            i = read2.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlRequestedProductEntity(principal=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", installmentAmount=");
        sb.append(this.write);
        sb.append(", installmentFrequencyEntity=");
        sb.append(this.read);
        sb.append(", repaymentDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", annualInterest=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", tierRateList=");
        sb.append(this.RatingCompat);
        sb.append(", dutyStampFee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
