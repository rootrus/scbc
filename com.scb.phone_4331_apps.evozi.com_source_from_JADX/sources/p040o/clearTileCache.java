package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.clearTileCache */
public final class clearTileCache {
    public String IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public OffsetDateTime MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearTileCache)) {
            return false;
        }
        clearTileCache cleartilecache = (clearTileCache) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) cleartilecache.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) cleartilecache.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, cleartilecache.MediaBrowserCompat$CustomActionResultReceiver) == 0;
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        return (((hashCode * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardConfirmation(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remainingBalance=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public clearTileCache(OffsetDateTime offsetDateTime, String str, double d) {
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }
}
