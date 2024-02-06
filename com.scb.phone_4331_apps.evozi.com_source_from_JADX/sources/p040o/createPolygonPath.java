package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createPolygonPath */
public final class createPolygonPath {
    @SerializedName("laserCode")
    public final String IconCompatParcelizer;
    @SerializedName("expiryDate")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createPolygonPath)) {
            return false;
        }
        createPolygonPath createpolygonpath = (createPolygonPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createpolygonpath.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) createpolygonpath.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CitizenIdEntity(expiryDate=");
        sb.append(this.write);
        sb.append(", laserCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
