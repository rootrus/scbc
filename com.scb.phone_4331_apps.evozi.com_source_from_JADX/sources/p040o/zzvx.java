package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzvx */
public final class zzvx extends zzuk {
    public isFlat MediaBrowserCompat$CustomActionResultReceiver;
    public Double MediaBrowserCompat$ItemReceiver;
    public OffsetDateTime read;
    public String write;

    public static zzvx write() {
        return new zzvx();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzvx zzvx = (zzvx) obj;
        OffsetDateTime offsetDateTime = this.read;
        if (offsetDateTime == null ? zzvx.read != null : !offsetDateTime.equals(zzvx.read)) {
            return false;
        }
        Double d = this.MediaBrowserCompat$ItemReceiver;
        if (d == null ? zzvx.MediaBrowserCompat$ItemReceiver != null : !d.equals(zzvx.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str = this.write;
        if (str == null ? zzvx.write != null : !str.equals(zzvx.write)) {
            return false;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != zzvx.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        OffsetDateTime offsetDateTime = this.read;
        int i = 0;
        int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        Double d = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = d != null ? d.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        isFlat isflat = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (isflat != null) {
            i = isflat.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }
}
