package p040o;

/* renamed from: o.FileLogStore */
public final class FileLogStore {
    public final boolean IconCompatParcelizer;
    public final boolean read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileLogStore)) {
            return false;
        }
        FileLogStore fileLogStore = (FileLogStore) obj;
        return this.read == fileLogStore.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fileLogStore.write) && this.IconCompatParcelizer == fileLogStore.IconCompatParcelizer;
    }

    public final int hashCode() {
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str = this.write;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JustForYouInsightHeaderResponseDisplay(newInsightFlag=");
        sb.append(this.read);
        sb.append(", insightHeader=");
        sb.append(this.write);
        sb.append(", isCaching=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public FileLogStore(boolean z, String str, boolean z2) {
        this.read = z;
        this.write = str;
        this.IconCompatParcelizer = z2;
    }
}
