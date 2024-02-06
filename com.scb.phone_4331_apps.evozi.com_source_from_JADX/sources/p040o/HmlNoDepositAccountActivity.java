package p040o;

import p040o.HmlNTBCaptureDocumentActivity;
import p040o.Keep;

/* renamed from: o.HmlNoDepositAccountActivity */
public final class HmlNoDepositAccountActivity<E extends HmlNTBCaptureDocumentActivity> {
    private final E IconCompatParcelizer;
    private final Keep.read MediaBrowserCompat$CustomActionResultReceiver = null;

    public HmlNoDepositAccountActivity(E e, Keep.read read) {
        this.IconCompatParcelizer = e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmlNoDepositAccountActivity hmlNoDepositAccountActivity = (HmlNoDepositAccountActivity) obj;
        if (!this.IconCompatParcelizer.equals(hmlNoDepositAccountActivity.IconCompatParcelizer)) {
            return false;
        }
        Keep.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        Keep.read read2 = hmlNoDepositAccountActivity.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            return read.equals(read2);
        }
        if (read2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.IconCompatParcelizer.hashCode();
        Keep.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (hashCode * 31) + (read != null ? read.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectChange{object=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", changeset=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
