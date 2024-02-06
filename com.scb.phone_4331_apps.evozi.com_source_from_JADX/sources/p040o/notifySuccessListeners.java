package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.notifySuccessListeners */
public final class notifySuccessListeners {
    @SerializedName("consentDocuments")
    public final List<LottieTask> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof notifySuccessListeners) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((notifySuccessListeners) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<LottieTask> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashReferralLandingEntity(consentDocuments=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
