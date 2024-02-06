package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GoogleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3422xa9494867 {
    @SerializedName("status")
    public final zzvl IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C3422xa9494867) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((C3422xa9494867) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        zzvl zzvl = this.IconCompatParcelizer;
        if (zzvl != null) {
            return zzvl.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionalInfo(status=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public C3422xa9494867(zzvl zzvl) {
        onGetStartedClick.write((Object) zzvl, "status");
        this.IconCompatParcelizer = zzvl;
    }
}
