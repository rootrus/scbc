package p040o;

/* renamed from: o.zzsh */
public final class zzsh {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsh)) {
            return false;
        }
        zzsh zzsh = (zzsh) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzsh.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzsh.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositLabel(labelName=");
        sb.append(this.read);
        sb.append(", colorCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzsh(String str, String str2) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
