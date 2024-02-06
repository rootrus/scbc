package p040o;

/* renamed from: o.setImeOptions */
public class setImeOptions<F, S> {
    public final F MediaBrowserCompat$ItemReceiver;
    public final S read;

    public setImeOptions(F f, S s) {
        this.MediaBrowserCompat$ItemReceiver = f;
        this.read = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setImeOptions)) {
            return false;
        }
        setImeOptions setimeoptions = (setImeOptions) obj;
        if (!setIconified.MediaBrowserCompat$CustomActionResultReceiver(setimeoptions.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver) || !setIconified.MediaBrowserCompat$CustomActionResultReceiver(setimeoptions.read, this.read)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.read;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.MediaBrowserCompat$ItemReceiver));
        sb.append(" ");
        sb.append(String.valueOf(this.read));
        sb.append("}");
        return sb.toString();
    }
}
