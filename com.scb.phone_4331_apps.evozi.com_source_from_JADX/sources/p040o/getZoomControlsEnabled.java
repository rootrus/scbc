package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getZoomControlsEnabled */
public final class getZoomControlsEnabled {
    public final String MediaBrowserCompat$ItemReceiver;
    public final double read;
    public final OffsetDateTime write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getZoomControlsEnabled)) {
            return false;
        }
        getZoomControlsEnabled getzoomcontrolsenabled = (getZoomControlsEnabled) obj;
        return Double.compare(this.read, getzoomcontrolsenabled.read) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getzoomcontrolsenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getzoomcontrolsenabled.write);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.write;
        if (offsetDateTime != null) {
            i2 = offsetDateTime.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxRate(rate=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tranDateTime=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getZoomControlsEnabled(double d, String str, OffsetDateTime offsetDateTime) {
        onGetStartedClick.write((Object) str, "description");
        this.read = d;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = offsetDateTime;
    }
}
