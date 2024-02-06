package p040o;

/* renamed from: o.getNativeSessionFilesDir */
public final class getNativeSessionFilesDir {
    public final int MediaBrowserCompat$ItemReceiver;
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeSessionFilesDir)) {
            return false;
        }
        getNativeSessionFilesDir getnativesessionfilesdir = (getNativeSessionFilesDir) obj;
        return this.MediaBrowserCompat$ItemReceiver == getnativesessionfilesdir.MediaBrowserCompat$ItemReceiver && this.write == getnativesessionfilesdir.write;
    }

    public final int hashCode() {
        return (this.MediaBrowserCompat$ItemReceiver * 31) + this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccountDisplay(minAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxAmount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getNativeSessionFilesDir(int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = i2;
    }
}
