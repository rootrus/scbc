package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setMaxHighlightDistance */
public final class setMaxHighlightDistance {
    @SerializedName("monthlyInstallmentAmount")
    public final double IconCompatParcelizer;
    @SerializedName("productCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardInterestAmount")
    public final double MediaBrowserCompat$ItemReceiver;
    @SerializedName("totalAmount")
    public final double MediaDescriptionCompat;
    @SerializedName("tenure")
    public final int MediaMetadataCompat;
    @SerializedName("yearlyCardInterestRate")
    public final double RatingCompat;
    @SerializedName("ippType")
    public final int read;
    @SerializedName("cardInterestRate")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMaxHighlightDistance)) {
            return false;
        }
        setMaxHighlightDistance setmaxhighlightdistance = (setMaxHighlightDistance) obj;
        return this.read == setmaxhighlightdistance.read && this.MediaMetadataCompat == setmaxhighlightdistance.MediaMetadataCompat && Double.compare(this.write, setmaxhighlightdistance.write) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, setmaxhighlightdistance.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.IconCompatParcelizer, setmaxhighlightdistance.IconCompatParcelizer) == 0 && Double.compare(this.RatingCompat, setmaxhighlightdistance.RatingCompat) == 0 && Double.compare(this.MediaDescriptionCompat, setmaxhighlightdistance.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmaxhighlightdistance.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.read;
        int i2 = this.MediaMetadataCompat;
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i4 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i5 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.RatingCompat);
        int i6 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i7 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentPlansEntity(ippType=");
        sb.append(this.read);
        sb.append(", tenure=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardInterestRate=");
        sb.append(this.write);
        sb.append(", cardInterestAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", monthlyInstallmentAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", yearlyCardInterestRate=");
        sb.append(this.RatingCompat);
        sb.append(", totalAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", productCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
