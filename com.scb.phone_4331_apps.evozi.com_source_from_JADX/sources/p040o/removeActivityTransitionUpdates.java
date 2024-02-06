package p040o;

import java.util.List;
import p040o.zzcz;

/* renamed from: o.removeActivityTransitionUpdates */
public final class removeActivityTransitionUpdates {
    private final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final List<String> MediaMetadataCompat;
    public final zzcz.zzi.zza read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeActivityTransitionUpdates)) {
            return false;
        }
        removeActivityTransitionUpdates removeactivitytransitionupdates = (removeActivityTransitionUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) removeactivitytransitionupdates.MediaBrowserCompat$MediaItem) && this.MediaBrowserCompat$CustomActionResultReceiver == removeactivitytransitionupdates.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeactivitytransitionupdates.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeactivitytransitionupdates.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) removeactivitytransitionupdates.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeactivitytransitionupdates.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeactivitytransitionupdates.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        int hashCode4 = list != null ? list.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        zzcz.zzi.zza zza = this.read;
        if (zza != null) {
            i = zza.hashCode();
        }
        return (((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlVerifyKycStatus(transactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", verifyKycFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", stage=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nationality=");
        sb.append(this.write);
        sb.append(", remark=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", applicationExpiryDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", customerContactInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public removeActivityTransitionUpdates(String str, boolean z, String str2, String str3, List<String> list, String str4, zzcz.zzi.zza zza) {
        onGetStartedClick.write((Object) str3, "nationality");
        onGetStartedClick.write((Object) str4, "applicationExpiryDate");
        onGetStartedClick.write((Object) zza, "customerContactInfo");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.MediaMetadataCompat = list;
        this.IconCompatParcelizer = str4;
        this.read = zza;
    }
}
