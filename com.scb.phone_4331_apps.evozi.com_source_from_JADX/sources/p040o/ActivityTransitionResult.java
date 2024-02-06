package p040o;

import p040o.zzcz;
import p040o.zzjx;

/* renamed from: o.ActivityTransitionResult */
public final class ActivityTransitionResult {
    public final zzjx.zza.zzb MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final zzcz.zzc read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionResult)) {
            return false;
        }
        ActivityTransitionResult activityTransitionResult = (ActivityTransitionResult) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) activityTransitionResult.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) activityTransitionResult.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) activityTransitionResult.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        zzjx.zza.zzb zzb = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = zzb != null ? zzb.hashCode() : 0;
        zzcz.zzc zzc = this.read;
        int hashCode2 = zzc != null ? zzc.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerStatus(productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", applicationStatus=");
        sb.append(this.read);
        sb.append(", applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ActivityTransitionResult(zzjx.zza.zzb zzb, zzcz.zzc zzc, String str) {
        onGetStartedClick.write((Object) zzb, "productType");
        onGetStartedClick.write((Object) zzc, "applicationStatus");
        this.MediaBrowserCompat$CustomActionResultReceiver = zzb;
        this.read = zzc;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
