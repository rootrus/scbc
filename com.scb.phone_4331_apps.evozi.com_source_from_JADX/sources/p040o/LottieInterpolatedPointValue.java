package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieInterpolatedPointValue */
public final class LottieInterpolatedPointValue extends setCurrentItemInternal {
    @SerializedName("cardRefNo")
    public final String IconCompatParcelizer;
    @SerializedName("fxRate")
    public final List<write> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fromWallet")
    public final List<IconCompatParcelizer> MediaBrowserCompat$ItemReceiver;
    @SerializedName("toWallet")
    public final List<read> read;

    /* renamed from: o.LottieInterpolatedPointValue$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("amount")
        public final double IconCompatParcelizer;
        @SerializedName("currency")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("flagImage")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sortSequence")
        public final int MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("thbEquivalentAmount")
        public final double MediaDescriptionCompat;
        @SerializedName("currencyName")
        public final String read;
        @SerializedName("allowTag")
        public final List<String> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && Double.compare(this.IconCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer) == 0 && Double.compare(this.MediaDescriptionCompat, iconCompatParcelizer.MediaDescriptionCompat) == 0 && this.MediaBrowserCompat$SearchResultReceiver == iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
            int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
            int i4 = this.MediaBrowserCompat$SearchResultReceiver;
            List<String> list = this.write;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FromWallet(currency=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", currencyName=");
            sb.append(this.read);
            sb.append(", flagImage=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", amount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", thbEquivalentAmount=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", sortSequence=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", allowTag=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieInterpolatedPointValue$read */
    public static final class read {
        @SerializedName("allowTag")
        public final List<String> IconCompatParcelizer;
        @SerializedName("amount")
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("flagImage")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sortSequence")
        public final int MediaBrowserCompat$MediaItem;
        @SerializedName("thbEquivalentAmount")
        public final double MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("currencyName")
        public final String read;
        @SerializedName("currency")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read2.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, read2.MediaBrowserCompat$SearchResultReceiver) == 0 && this.MediaBrowserCompat$MediaItem == read2.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read2.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
            int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
            int i4 = this.MediaBrowserCompat$MediaItem;
            List<String> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ToWallet(currency=");
            sb.append(this.write);
            sb.append(", currencyName=");
            sb.append(this.read);
            sb.append(", flagImage=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", amount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", thbEquivalentAmount=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", sortSequence=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", allowTag=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieInterpolatedPointValue$write */
    public static final class write {
        @SerializedName("toCurrency")
        public final String IconCompatParcelizer;
        @SerializedName("rate")
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("description")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("fromCurrency")
        public final String read;
        @SerializedName("conversionType")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write2.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, write2.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write2.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FxRate(conversionType=");
            sb.append(this.write);
            sb.append(", fromCurrency=");
            sb.append(this.read);
            sb.append(", toCurrency=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", rate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieInterpolatedPointValue)) {
            return false;
        }
        LottieInterpolatedPointValue lottieInterpolatedPointValue = (LottieInterpolatedPointValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieInterpolatedPointValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lottieInterpolatedPointValue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lottieInterpolatedPointValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieInterpolatedPointValue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<read> list2 = this.read;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        List<write> list3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelConversionLandingEntity(cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fromWallet=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", toWallet=");
        sb.append(this.read);
        sb.append(", fxRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
