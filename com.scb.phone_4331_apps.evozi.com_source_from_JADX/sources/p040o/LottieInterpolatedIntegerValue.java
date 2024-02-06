package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieInterpolatedIntegerValue */
public final class LottieInterpolatedIntegerValue extends setCurrentItemInternal {
    @SerializedName("cardRefNo")
    public final String IconCompatParcelizer;
    @SerializedName("fromCurrency")
    public final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("isRateChangedFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionToken")
    public final String MediaDescriptionCompat;
    @SerializedName("toAmount")
    public final double MediaMetadataCompat;
    @SerializedName("toCurrency")
    public final IconCompatParcelizer RatingCompat;
    @SerializedName("fromAmount")
    public final double read;
    @SerializedName("conversionRate")
    public final write write;

    /* renamed from: o.LottieInterpolatedIntegerValue$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("currencyName")
        public final String IconCompatParcelizer;
        @SerializedName("currency")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Currency(currency=");
            sb.append(this.write);
            sb.append(", currencyName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieInterpolatedIntegerValue$write */
    public static final class write {
        @SerializedName("description")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("rate")
        public final double read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return Double.compare(this.read, write.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.read);
            int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            return (i * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConversionRate(rate=");
            sb.append(this.read);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieInterpolatedIntegerValue)) {
            return false;
        }
        LottieInterpolatedIntegerValue lottieInterpolatedIntegerValue = (LottieInterpolatedIntegerValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieInterpolatedIntegerValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) lottieInterpolatedIntegerValue.MediaDescriptionCompat) && Double.compare(this.read, lottieInterpolatedIntegerValue.read) == 0 && Double.compare(this.MediaMetadataCompat, lottieInterpolatedIntegerValue.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieInterpolatedIntegerValue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) lottieInterpolatedIntegerValue.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieInterpolatedIntegerValue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lottieInterpolatedIntegerValue.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
        IconCompatParcelizer iconCompatParcelizer2 = this.RatingCompat;
        int hashCode4 = iconCompatParcelizer2 != null ? iconCompatParcelizer2.hashCode() : 0;
        write write2 = this.write;
        int hashCode5 = write2 != null ? write2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelConversionVerificationEntity(cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionToken=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fromAmount=");
        sb.append(this.read);
        sb.append(", toAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", fromCurrency=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", toCurrency=");
        sb.append(this.RatingCompat);
        sb.append(", conversionRate=");
        sb.append(this.write);
        sb.append(", isRateChangedFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
