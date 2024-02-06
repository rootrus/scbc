package p040o;

/* renamed from: o.newCameraPosition */
public final class newCameraPosition {
    public final String IconCompatParcelizer;
    public final zzui<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final double read;
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newCameraPosition)) {
            return false;
        }
        newCameraPosition newcameraposition = (newCameraPosition) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) newcameraposition.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) newcameraposition.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) newcameraposition.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.write, newcameraposition.write) == 0 && Double.compare(this.read, newcameraposition.read) == 0;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        zzui<String> zzui = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (zzui != null) {
            i = zzui.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        return (((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Idp(nodeId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", companyCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", marketingName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", maxIal=");
        sb.append(this.write);
        sb.append(", maxAal=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public newCameraPosition(String str, String str2, zzui<String> zzui, double d, double d2) {
        onGetStartedClick.write((Object) str, "nodeId");
        onGetStartedClick.write((Object) str2, "companyCode");
        onGetStartedClick.write((Object) zzui, "marketingName");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzui;
        this.write = d;
        this.read = d2;
    }
}
