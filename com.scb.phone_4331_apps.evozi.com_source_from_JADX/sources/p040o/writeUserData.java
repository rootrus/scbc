package p040o;

import java.util.List;

/* renamed from: o.writeUserData */
public final class writeUserData {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<NativeSessionFile> MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final List<getUserDataFileForSession> MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean RatingCompat;
    public final int read;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeUserData)) {
            return false;
        }
        writeUserData writeuserdata = (writeUserData) obj;
        return this.read == writeuserdata.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) writeuserdata.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) writeuserdata.MediaMetadataCompat) && this.MediaBrowserCompat$MediaItem == writeuserdata.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writeuserdata.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) writeuserdata.MediaDescriptionCompat) && this.write == writeuserdata.write && this.RatingCompat == writeuserdata.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writeuserdata.MediaBrowserCompat$ItemReceiver) && this.IconCompatParcelizer == writeuserdata.IconCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$MediaItem;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<getUserDataFileForSession> list = this.MediaDescriptionCompat;
        int hashCode4 = list != null ? list.hashCode() : 0;
        boolean z = this.write;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.RatingCompat;
        if (z3) {
            z3 = true;
        }
        List<NativeSessionFile> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        boolean z4 = this.IconCompatParcelizer;
        if (!z4) {
            z2 = z4;
        }
        return (((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i2) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScbsLandingDisplay(arrowImage=");
        sb.append(this.read);
        sb.append(", marketValue=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", netGain=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", netGainColor=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", asOfDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", pieChart=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isPieChartVisible=");
        sb.append(this.write);
        sb.append(", isTradeNowVisible=");
        sb.append(this.RatingCompat);
        sb.append(", accounts=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isSingleApp=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public writeUserData(int i, String str, String str2, int i2, String str3, List<getUserDataFileForSession> list, boolean z, boolean z2, List<NativeSessionFile> list2, boolean z3) {
        onGetStartedClick.write((Object) str, "marketValue");
        onGetStartedClick.write((Object) str2, "netGain");
        onGetStartedClick.write((Object) list, "pieChart");
        onGetStartedClick.write((Object) list2, "accounts");
        this.read = i;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompat$MediaItem = i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaDescriptionCompat = list;
        this.write = z;
        this.RatingCompat = z2;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.IconCompatParcelizer = z3;
    }
}
