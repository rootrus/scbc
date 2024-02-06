package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.setMyLocationButtonEnabled */
public final class setMyLocationButtonEnabled {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public final double MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final setScrollGesturesEnabled MediaMetadataCompat;
    public final String RatingCompat;
    public final double read;
    public final OffsetDateTime write;

    public setMyLocationButtonEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMyLocationButtonEnabled)) {
            return false;
        }
        setMyLocationButtonEnabled setmylocationbuttonenabled = (setMyLocationButtonEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setmylocationbuttonenabled.RatingCompat) && Double.compare(this.MediaBrowserCompat$MediaItem, setmylocationbuttonenabled.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.IconCompatParcelizer, setmylocationbuttonenabled.IconCompatParcelizer) == 0 && Double.compare(this.read, setmylocationbuttonenabled.read) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, setmylocationbuttonenabled.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, setmylocationbuttonenabled.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmylocationbuttonenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmylocationbuttonenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setmylocationbuttonenabled.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.read);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i5 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i6 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.write;
        int hashCode3 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
        setScrollGesturesEnabled setscrollgesturesenabled = this.MediaMetadataCompat;
        if (setscrollgesturesenabled != null) {
            i = setscrollgesturesenabled.hashCode();
        }
        return (((((((((((((((hashCode * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SubDeposit(number=");
        sb.append(this.RatingCompat);
        sb.append(", netAmount=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", interestRate=");
        sb.append(this.read);
        sb.append(", interestAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tax=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", depositDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maturityDate=");
        sb.append(this.write);
        sb.append(", status=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public setMyLocationButtonEnabled(String str, double d, double d2, double d3, double d4, double d5, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, setScrollGesturesEnabled setscrollgesturesenabled) {
        this.RatingCompat = str;
        this.MediaBrowserCompat$MediaItem = d;
        this.IconCompatParcelizer = d2;
        this.read = d3;
        this.MediaBrowserCompat$CustomActionResultReceiver = d4;
        this.MediaBrowserCompat$SearchResultReceiver = d5;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
        this.write = offsetDateTime2;
        this.MediaMetadataCompat = setscrollgesturesenabled;
    }

    private /* synthetic */ setMyLocationButtonEnabled(byte b) {
        this((String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (OffsetDateTime) null, (OffsetDateTime) null, (setScrollGesturesEnabled) null);
    }
}
