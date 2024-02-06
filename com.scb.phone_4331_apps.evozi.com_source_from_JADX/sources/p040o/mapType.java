package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.mapType */
public final class mapType {
    private final double IconCompatParcelizer;
    public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mapType)) {
            return false;
        }
        mapType maptype = (mapType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) maptype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) maptype.read) && Double.compare(this.IconCompatParcelizer, maptype.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        return (((hashCode * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceConfirmResponse(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionId=");
        sb.append(this.read);
        sb.append(", remainingBalance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public mapType(OffsetDateTime offsetDateTime, String str, double d) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
        this.read = str;
        this.IconCompatParcelizer = d;
    }
}
