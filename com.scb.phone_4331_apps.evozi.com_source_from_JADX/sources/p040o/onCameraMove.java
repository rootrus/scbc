package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onCameraMove */
public final class onCameraMove extends zzuk {
    @SerializedName("cardRefNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("conversionRate")
    public final write MediaBrowserCompat$ItemReceiver;
    @SerializedName("toCurrency")
    public final IconCompatParcelizer MediaBrowserCompat$MediaItem;
    @SerializedName("isRateChangedFlag")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("toAmount")
    public final double MediaDescriptionCompat;
    @SerializedName("transactionToken")
    public final String MediaMetadataCompat;
    @SerializedName("fromCurrency")
    public final IconCompatParcelizer read;
    @SerializedName("fromAmount")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCameraMove)) {
            return false;
        }
        onCameraMove oncameramove = (onCameraMove) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) oncameramove.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) oncameramove.MediaMetadataCompat) && Double.compare(this.write, oncameramove.write) == 0 && Double.compare(this.MediaDescriptionCompat, oncameramove.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) oncameramove.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) oncameramove.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) oncameramove.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) oncameramove.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
        IconCompatParcelizer iconCompatParcelizer = this.read;
        int hashCode3 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
        IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = iconCompatParcelizer2 != null ? iconCompatParcelizer2.hashCode() : 0;
        write write2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = write2 != null ? write2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelConversionVerification(cardRefNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", fromAmount=");
        sb.append(this.write);
        sb.append(", toAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fromCurrency=");
        sb.append(this.read);
        sb.append(", toCurrency=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", conversionRate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isRateChangedFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onCameraMove(String str, String str2, double d, double d2, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2, write write2, String str3) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "transactionToken");
        onGetStartedClick.write((Object) iconCompatParcelizer, "fromCurrency");
        onGetStartedClick.write((Object) iconCompatParcelizer2, "toCurrency");
        onGetStartedClick.write((Object) write2, "conversionRate");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaMetadataCompat = str2;
        this.write = d;
        this.MediaDescriptionCompat = d2;
        this.read = iconCompatParcelizer;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer2;
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
    }

    /* renamed from: o.onCameraMove$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("currencyName")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("currency")
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
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
            sb.append("Currency(currency=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", currencyName=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str, String str2) {
            onGetStartedClick.write((Object) str, "currency");
            onGetStartedClick.write((Object) str2, "currencyName");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    /* renamed from: o.onCameraMove$write */
    public static final class write {
        @SerializedName("description")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("rate")
        public final double write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return Double.compare(this.write, write2.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.write);
            int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            return (i * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConversionRate(rate=");
            sb.append(this.write);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public write(double d, String str) {
            onGetStartedClick.write((Object) str, "description");
            this.write = d;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }
}
