package p040o;

/* renamed from: o.onPolygonClick */
public final class onPolygonClick {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final double MediaDescriptionCompat;
    public final int RatingCompat;
    public final double read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPolygonClick)) {
            return false;
        }
        onPolygonClick onpolygonclick = (onPolygonClick) obj;
        return this.MediaBrowserCompat$ItemReceiver == onpolygonclick.MediaBrowserCompat$ItemReceiver && this.RatingCompat == onpolygonclick.RatingCompat && Double.compare(this.IconCompatParcelizer, onpolygonclick.IconCompatParcelizer) == 0 && Double.compare(this.read, onpolygonclick.read) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, onpolygonclick.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, onpolygonclick.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.MediaDescriptionCompat, onpolygonclick.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onpolygonclick.write);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = this.RatingCompat;
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i4 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i5 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i6 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i7 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        String str = this.write;
        return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentPlans(ippType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tenure=");
        sb.append(this.RatingCompat);
        sb.append(", cardInterestRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardInterestAmount=");
        sb.append(this.read);
        sb.append(", monthlyInstallmentAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", yearlyCardInterestRate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", totalAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", productCode=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public onPolygonClick(int i, int i2, double d, double d2, double d3, double d4, double d5, String str) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.RatingCompat = i2;
        this.IconCompatParcelizer = d;
        this.read = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = d3;
        this.MediaBrowserCompat$SearchResultReceiver = d4;
        this.MediaDescriptionCompat = d5;
        this.write = str;
    }
}
