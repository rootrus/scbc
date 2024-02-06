package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getAnchorPoint */
public final class getAnchorPoint {
    @SerializedName("acceptanceFlag")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("offerId")
    private final String read;
    @SerializedName("applicationUuid")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAnchorPoint)) {
            return false;
        }
        getAnchorPoint getanchorpoint = (getAnchorPoint) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getanchorpoint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getanchorpoint.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getanchorpoint.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateOfferAcceptanceRequest(applicationUuid=");
        sb.append(this.write);
        sb.append(", acceptanceFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", offerId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getAnchorPoint(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "acceptanceFlag");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
    }
}
