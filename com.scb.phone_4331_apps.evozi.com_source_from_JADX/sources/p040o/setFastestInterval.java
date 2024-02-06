package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.setFastestInterval */
public final class setFastestInterval {
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final OffsetDateTime MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String read;
    public final List<setSmallestDisplacement> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFastestInterval)) {
            return false;
        }
        setFastestInterval setfastestinterval = (setFastestInterval) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setfastestinterval.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setfastestinterval.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setfastestinterval.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setfastestinterval.MediaBrowserCompat$SearchResultReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == setfastestinterval.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setfastestinterval.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setfastestinterval.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        String str4 = this.IconCompatParcelizer;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        List<setSmallestDisplacement> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z ? 1 : 0)) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverTopItem(fundCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", shortBrokerName=");
        sb.append(this.read);
        sb.append(", yield=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", yieldDate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", otherChannelFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", assetType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tags=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setFastestInterval(String str, String str2, String str3, OffsetDateTime offsetDateTime, boolean z, String str4, List<setSmallestDisplacement> list) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$SearchResultReceiver = offsetDateTime;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.IconCompatParcelizer = str4;
        this.write = list;
    }
}
