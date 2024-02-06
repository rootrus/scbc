package p040o;

import com.google.android.gms.analytics.ecommerce.ProductAction;

/* renamed from: o.setTag$MediaBrowserCompat$CustomActionResultReceiver */
public class setTag$MediaBrowserCompat$CustomActionResultReceiver {
    public Object IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public int write;

    setTag$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, Object obj) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.write = i3;
        this.IconCompatParcelizer = obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.MediaBrowserCompat$ItemReceiver;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : ProductAction.ACTION_ADD);
        sb.append(",s:");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("c:");
        sb.append(this.write);
        sb.append(",p:");
        sb.append(this.IconCompatParcelizer);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setTag$MediaBrowserCompat$CustomActionResultReceiver settag_mediabrowsercompat_customactionresultreceiver = (setTag$MediaBrowserCompat$CustomActionResultReceiver) obj;
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (i != settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        if (i == 8 && Math.abs(this.write - this.MediaBrowserCompat$CustomActionResultReceiver) == 1 && this.write == settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == settag_mediabrowsercompat_customactionresultreceiver.write) {
            return true;
        }
        if (this.write != settag_mediabrowsercompat_customactionresultreceiver.write || this.MediaBrowserCompat$CustomActionResultReceiver != settag_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            return false;
        }
        Object obj2 = this.IconCompatParcelizer;
        if (obj2 != null) {
            if (!obj2.equals(settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer)) {
                return false;
            }
        } else if (settag_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.MediaBrowserCompat$ItemReceiver * 31) + this.MediaBrowserCompat$CustomActionResultReceiver) * 31) + this.write;
    }
}
