package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.LottieDrawable;

/* renamed from: o.notifyFailureListeners */
public final class notifyFailureListeners {
    @SerializedName("data")
    public final notifyListeners MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tiles")
    public final LottieDrawable.C36131 write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof notifyFailureListeners)) {
            return false;
        }
        notifyFailureListeners notifyfailurelisteners = (notifyFailureListeners) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) notifyfailurelisteners.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) notifyfailurelisteners.write);
    }

    public final int hashCode() {
        notifyListeners notifylisteners = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = notifylisteners != null ? notifylisteners.hashCode() : 0;
        LottieDrawable.C36131 r2 = this.write;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashReferralDFWYNEntity(dataInformation=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tiles=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
