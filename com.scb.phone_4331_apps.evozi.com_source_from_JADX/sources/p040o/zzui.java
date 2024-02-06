package p040o;

/* renamed from: o.zzui */
public final class zzui<T> {
    public final T read;
    public final T write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzui)) {
            return false;
        }
        zzui zzui = (zzui) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzui.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzui.write);
    }

    public final int hashCode() {
        T t = this.read;
        int i = 0;
        int hashCode = t != null ? t.hashCode() : 0;
        T t2 = this.write;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bilingual(en=");
        sb.append(this.read);
        sb.append(", th=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public zzui(T t, T t2) {
        this.read = t;
        this.write = t2;
    }
}
