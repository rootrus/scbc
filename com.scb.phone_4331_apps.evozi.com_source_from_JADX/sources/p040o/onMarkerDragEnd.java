package p040o;

/* renamed from: o.onMarkerDragEnd */
public final class onMarkerDragEnd {
    public final Boolean IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean read;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMarkerDragEnd)) {
            return false;
        }
        onMarkerDragEnd onmarkerdragend = (onMarkerDragEnd) obj;
        return this.read == onmarkerdragend.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onmarkerdragend.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onmarkerdragend.IconCompatParcelizer) && this.write == onmarkerdragend.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onmarkerdragend.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        int hashCode2 = bool != null ? bool.hashCode() : 0;
        boolean z3 = this.write;
        if (!z3) {
            z2 = z3;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedUser(tcAcceptRequired=");
        sb.append(this.read);
        sb.append(", tcAcceptDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", etbActiveCasa=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", registerVerifyUser=");
        sb.append(this.write);
        sb.append(", statusCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public onMarkerDragEnd(boolean z, String str, Boolean bool, boolean z2, String str2) {
        onGetStartedClick.write((Object) str, "tcAcceptDate");
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = bool;
        this.write = z2;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
