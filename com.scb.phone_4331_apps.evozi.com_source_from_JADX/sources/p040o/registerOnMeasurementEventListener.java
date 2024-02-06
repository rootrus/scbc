package p040o;

import p040o.zzfo;

/* renamed from: o.registerOnMeasurementEventListener */
public final class registerOnMeasurementEventListener {
    private final zzfo.zzd MediaBrowserCompat$ItemReceiver;
    public final resetAnalyticsData read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerOnMeasurementEventListener)) {
            return false;
        }
        registerOnMeasurementEventListener registeronmeasurementeventlistener = (registerOnMeasurementEventListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) registeronmeasurementeventlistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) registeronmeasurementeventlistener.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        resetAnalyticsData resetanalyticsdata = this.read;
        int i = 0;
        int hashCode = resetanalyticsdata != null ? resetanalyticsdata.hashCode() : 0;
        zzfo.zzd zzd = this.MediaBrowserCompat$ItemReceiver;
        if (zzd != null) {
            i = zzd.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashReferralDFWYN(dataInformation=");
        sb.append(this.read);
        sb.append(", tile=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public registerOnMeasurementEventListener(resetAnalyticsData resetanalyticsdata, zzfo.zzd zzd) {
        onGetStartedClick.write((Object) resetanalyticsdata, "dataInformation");
        onGetStartedClick.write((Object) zzd, "tile");
        this.read = resetanalyticsdata;
        this.MediaBrowserCompat$ItemReceiver = zzd;
    }
}
