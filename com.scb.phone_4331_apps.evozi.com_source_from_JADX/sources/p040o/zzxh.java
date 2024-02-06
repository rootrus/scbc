package p040o;

/* renamed from: o.zzxh */
public final class zzxh {
    public final Double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxh)) {
            return false;
        }
        zzxh zzxh = (zzxh) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzxh.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzxh.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzxh.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzxh.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzxh.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Double d = this.IconCompatParcelizer;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BScanCEntryPoint(function=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", expiryDateTime=");
        sb.append(this.read);
        sb.append(", validDuration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", qrCode=");
        sb.append(this.write);
        sb.append(", remainingLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzxh(String str, String str2, String str3, String str4, Double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.IconCompatParcelizer = d;
    }
}
