package p040o;

import java.util.List;

/* renamed from: o.isUserNavigationEnabled */
public final class isUserNavigationEnabled {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<isZoomGesturesEnabled> MediaBrowserCompat$MediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String read;
    public final List<StreetViewPanorama> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isUserNavigationEnabled)) {
            return false;
        }
        isUserNavigationEnabled isusernavigationenabled = (isUserNavigationEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaMetadataCompat == isusernavigationenabled.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) isusernavigationenabled.MediaDescriptionCompat) && this.IconCompatParcelizer == isusernavigationenabled.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isusernavigationenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isusernavigationenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isusernavigationenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) isusernavigationenabled.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.MediaMetadataCompat;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<StreetViewPanorama> list = this.write;
        int hashCode5 = list != null ? list.hashCode() : 0;
        List<isZoomGesturesEnabled> list2 = this.MediaBrowserCompat$MediaItem;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((((((hashCode * 31) + (z ? 1 : 0)) * 31) + hashCode2) * 31) + (z2 ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesAccountDetails(asOfDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", hasLiquidation=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", liquidationValue=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", hasCashBalance=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cashBalance=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", currency=");
        sb.append(this.read);
        sb.append(", cashOffshore=");
        sb.append(this.write);
        sb.append(", products=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public isUserNavigationEnabled(String str, boolean z, String str2, boolean z2, String str3, String str4, List<StreetViewPanorama> list, List<isZoomGesturesEnabled> list2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaMetadataCompat = z;
        this.MediaDescriptionCompat = str2;
        this.IconCompatParcelizer = z2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.read = str4;
        this.write = list;
        this.MediaBrowserCompat$MediaItem = list2;
    }
}
