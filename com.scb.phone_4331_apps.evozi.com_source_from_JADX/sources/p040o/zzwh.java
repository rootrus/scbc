package p040o;

/* renamed from: o.zzwh */
public final class zzwh {
    public final zzui<String> IconCompatParcelizer;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwh)) {
            return false;
        }
        zzwh zzwh = (zzwh) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzwh.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzwh.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        zzui<String> zzui = this.IconCompatParcelizer;
        if (zzui != null) {
            i = zzui.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country(code=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzwh(String str, zzui<String> zzui) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) zzui, "name");
        this.read = str;
        this.IconCompatParcelizer = zzui;
    }
}
