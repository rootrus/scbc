package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.getLocationAvailability */
public final class getLocationAvailability {
    public final OffsetDateTime IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLocationAvailability)) {
            return false;
        }
        getLocationAvailability getlocationavailability = (getLocationAvailability) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlocationavailability.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlocationavailability.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountConfirmation(transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getLocationAvailability(OffsetDateTime offsetDateTime, String str) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        this.IconCompatParcelizer = offsetDateTime;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
