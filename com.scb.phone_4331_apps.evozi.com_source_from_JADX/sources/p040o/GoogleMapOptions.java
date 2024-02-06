package p040o;

import java.util.List;

/* renamed from: o.GoogleMapOptions */
public final class GoogleMapOptions {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final Integer read;
    public final List<compassEnabled> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleMapOptions)) {
            return false;
        }
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) obj;
        return this.MediaBrowserCompat$ItemReceiver == googleMapOptions.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == googleMapOptions.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) googleMapOptions.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) googleMapOptions.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) googleMapOptions.write);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Integer num = this.read;
        int hashCode2 = num != null ? num.hashCode() : 0;
        List<compassEnabled> list = this.write;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((i * 31) + (z ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HistoryResponse(totalCount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", endOfListFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", pagingOffset=");
        sb.append(this.read);
        sb.append(", transactions=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public GoogleMapOptions(int i, boolean z, String str, Integer num, List<compassEnabled> list) {
        onGetStartedClick.write((Object) str, "remark");
        onGetStartedClick.write((Object) list, "transactions");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = num;
        this.write = list;
    }
}
