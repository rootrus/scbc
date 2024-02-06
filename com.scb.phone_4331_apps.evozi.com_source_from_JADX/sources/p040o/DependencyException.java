package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.DependencyException */
public final class DependencyException {
    @SerializedName("payload")
    public isSet MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DependencyException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((DependencyException) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        isSet isset = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (isset != null) {
            return isset.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeneralCSentDisplay(payload=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
