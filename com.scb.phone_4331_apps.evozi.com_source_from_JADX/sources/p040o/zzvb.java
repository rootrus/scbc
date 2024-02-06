package p040o;

/* renamed from: o.zzvb */
public final class zzvb {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvb)) {
            return false;
        }
        zzvb zzvb = (zzvb) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzvb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzvb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzvb.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessedImage(path=");
        sb.append(this.read);
        sb.append(", creationDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", latitude=");
        sb.append(this.write);
        sb.append(", longitude=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzvb(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "path");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
    }

    public /* synthetic */ zzvb(String str) {
        this(str, (String) null, (String) null, (String) null);
    }
}
