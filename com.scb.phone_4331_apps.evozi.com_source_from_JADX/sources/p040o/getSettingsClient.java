package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getSettingsClient */
public final class getSettingsClient {
    public final String IconCompatParcelizer;
    public final List<getNumUpdates> MediaBrowserCompat$CustomActionResultReceiver;
    public final OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public final OffsetDateTime MediaMetadataCompat;
    public final List<setNumUpdates> read;
    public final List<getMaxWaitTime> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSettingsClient)) {
            return false;
        }
        getSettingsClient getsettingsclient = (getSettingsClient) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getsettingsclient.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getsettingsclient.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsettingsclient.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getsettingsclient.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getsettingsclient.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getsettingsclient.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getMaxWaitTime> list = this.write;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<getNumUpdates> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = list2 != null ? list2.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaMetadataCompat;
        int hashCode4 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        List<setNumUpdates> list3 = this.read;
        int hashCode5 = list3 != null ? list3.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.MediaBrowserCompat$ItemReceiver;
        if (offsetDateTime2 != null) {
            i = offsetDateTime2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentDiscoverLanding(fundfactsheetApplicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", highlights=");
        sb.append(this.write);
        sb.append(", recommends=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", topListDate=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", discoverTops=");
        sb.append(this.read);
        sb.append(", recommendDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getSettingsClient(String str, List<getMaxWaitTime> list, List<getNumUpdates> list2, OffsetDateTime offsetDateTime, List<setNumUpdates> list3, OffsetDateTime offsetDateTime2) {
        this.IconCompatParcelizer = str;
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        this.MediaMetadataCompat = offsetDateTime;
        this.read = list3;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime2;
    }
}
