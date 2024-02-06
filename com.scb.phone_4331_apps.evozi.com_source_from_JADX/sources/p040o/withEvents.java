package p040o;

/* renamed from: o.withEvents */
public final class withEvents {
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem = false;
    public String read;
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        withEvents withevents = (withEvents) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != withevents.MediaBrowserCompat$CustomActionResultReceiver || this.MediaBrowserCompat$ItemReceiver != withevents.MediaBrowserCompat$ItemReceiver || this.MediaBrowserCompat$MediaItem != withevents.MediaBrowserCompat$MediaItem) {
            return false;
        }
        String str = this.write;
        if (str == null ? withevents.write != null : !str.equals(withevents.write)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? withevents.IconCompatParcelizer != null : !str2.equals(withevents.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.read;
        String str4 = withevents.read;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = this.MediaBrowserCompat$MediaItem;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }
}
