package p040o;

/* renamed from: o.ScriptIntrinsic */
public class ScriptIntrinsic {
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public String write() {
        return "ItemDraggableRange";
    }

    public ScriptIntrinsic(int i, int i2) {
        if (i <= i2) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("end position (= ");
        sb.append(i2);
        sb.append(") is smaller than start position (=");
        sb.append(i);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(write());
        sb.append("{mStart=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mEnd=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
