package p040o;

import java.util.List;

/* renamed from: o.setIndoorLevelPickerEnabled */
public final class setIndoorLevelPickerEnabled {
    public final setRotateGesturesEnabled IconCompatParcelizer;
    public final paddedPartition<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<setMyLocationButtonEnabled> MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    private final double MediaDescriptionCompat;
    public final double MediaMetadataCompat;
    public final double RatingCompat;
    public final setRotateGesturesEnabled read;
    public final double write;

    public setIndoorLevelPickerEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIndoorLevelPickerEnabled)) {
            return false;
        }
        setIndoorLevelPickerEnabled setindoorlevelpickerenabled = (setIndoorLevelPickerEnabled) obj;
        return Double.compare(this.write, setindoorlevelpickerenabled.write) == 0 && Double.compare(this.MediaDescriptionCompat, setindoorlevelpickerenabled.MediaDescriptionCompat) == 0 && Double.compare(this.MediaMetadataCompat, setindoorlevelpickerenabled.MediaMetadataCompat) == 0 && Double.compare(this.RatingCompat, setindoorlevelpickerenabled.RatingCompat) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, setindoorlevelpickerenabled.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setindoorlevelpickerenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setindoorlevelpickerenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setindoorlevelpickerenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setindoorlevelpickerenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setindoorlevelpickerenabled.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i3 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.RatingCompat);
        int i4 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i5 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        setRotateGesturesEnabled setrotategesturesenabled = this.read;
        int i6 = 0;
        int hashCode = setrotategesturesenabled != null ? setrotategesturesenabled.hashCode() : 0;
        setRotateGesturesEnabled setrotategesturesenabled2 = this.IconCompatParcelizer;
        int hashCode2 = setrotategesturesenabled2 != null ? setrotategesturesenabled2.hashCode() : 0;
        List<setMyLocationButtonEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list != null ? list.hashCode() : 0;
        paddedPartition<String> paddedpartition = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = paddedpartition != null ? paddedpartition.hashCode() : 0;
        String str = this.MediaBrowserCompat$MediaItem;
        if (str != null) {
            i6 = str.hashCode();
        }
        return (((((((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FixedTransferVerification(netAmount=");
        sb.append(this.write);
        sb.append(", totalAmount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", totalInterest=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", totalTax=");
        sb.append(this.RatingCompat);
        sb.append(", totalFee=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", accountFrom=");
        sb.append(this.read);
        sb.append(", accountTo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subdeposit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", annotation=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public setIndoorLevelPickerEnabled(double d, double d2, double d3, double d4, double d5, setRotateGesturesEnabled setrotategesturesenabled, setRotateGesturesEnabled setrotategesturesenabled2, List<setMyLocationButtonEnabled> list, paddedPartition<String> paddedpartition, String str) {
        this.write = d;
        this.MediaDescriptionCompat = d2;
        this.MediaMetadataCompat = d3;
        this.RatingCompat = d4;
        this.MediaBrowserCompat$SearchResultReceiver = d5;
        this.read = setrotategesturesenabled;
        this.IconCompatParcelizer = setrotategesturesenabled2;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = paddedpartition;
        this.MediaBrowserCompat$MediaItem = str;
    }

    private /* synthetic */ setIndoorLevelPickerEnabled(byte b) {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (setRotateGesturesEnabled) null, (setRotateGesturesEnabled) null, (List<setMyLocationButtonEnabled>) null, (paddedPartition<String>) null, (String) null);
    }
}
