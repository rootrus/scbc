package p040o;

import android.text.Editable;
import android.widget.TextView;

/* renamed from: o.validateSYR2K */
public final class validateSYR2K {
    public final Editable MediaBrowserCompat$CustomActionResultReceiver;
    private final TextView write;

    validateSYR2K() {
    }

    validateSYR2K(TextView textView, Editable editable) {
        this();
        if (textView != null) {
            this.write = textView;
            this.MediaBrowserCompat$CustomActionResultReceiver = editable;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof validateSYR2K)) {
            return false;
        }
        validateSYR2K validatesyr2k = (validateSYR2K) obj;
        if (this.write.equals(validatesyr2k.write)) {
            Editable editable = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (editable == null) {
                if (validatesyr2k.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return true;
                }
            } else if (editable.equals(validatesyr2k.MediaBrowserCompat$CustomActionResultReceiver)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.write.hashCode();
        Editable editable = this.MediaBrowserCompat$CustomActionResultReceiver;
        return ((hashCode ^ 1000003) * 1000003) ^ (editable == null ? 0 : editable.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextViewAfterTextChangeEvent{view=");
        sb.append(this.write);
        sb.append(", editable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }
}
