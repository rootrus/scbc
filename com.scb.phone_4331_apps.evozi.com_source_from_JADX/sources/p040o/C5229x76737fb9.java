package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.requestActivityUpdates$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5229x76737fb9 {
    public final double IconCompatParcelizer;
    public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final double RatingCompat;
    public final double read;
    public final OffsetDateTime write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5229x76737fb9)) {
            return false;
        }
        C5229x76737fb9 requestactivityupdates_mediabrowsercompat_customactionresultreceiver = (C5229x76737fb9) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.read, requestactivityupdates_mediabrowsercompat_customactionresultreceiver.read) == 0 && Double.compare(this.IconCompatParcelizer, requestactivityupdates_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) requestactivityupdates_mediabrowsercompat_customactionresultreceiver.write) && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, requestactivityupdates_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.RatingCompat, requestactivityupdates_mediabrowsercompat_customactionresultreceiver.RatingCompat) == 0;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        OffsetDateTime offsetDateTime2 = this.write;
        if (offsetDateTime2 != null) {
            i = offsetDateTime2.hashCode();
        }
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        long doubleToLongBits5 = Double.doubleToLongBits(this.RatingCompat);
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubDeposit(number=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", date=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deposit=");
        sb.append(this.read);
        sb.append(", interest=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", interestRate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maturityDate=");
        sb.append(this.write);
        sb.append(", tax=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", totalAmount=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public C5229x76737fb9(String str, OffsetDateTime offsetDateTime, double d, double d2, double d3, OffsetDateTime offsetDateTime2, double d4, double d5) {
        onGetStartedClick.write((Object) str, "number");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
        this.read = d;
        this.IconCompatParcelizer = d2;
        this.MediaBrowserCompat$ItemReceiver = d3;
        this.write = offsetDateTime2;
        this.MediaBrowserCompat$SearchResultReceiver = d4;
        this.RatingCompat = d5;
    }
}
