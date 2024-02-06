package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isRunning */
public final class isRunning {
    @SerializedName("accounts")
    public final List<setColorFilter> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("debitCardHeader")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isRunning)) {
            return false;
        }
        isRunning isrunning = (isRunning) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isrunning.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isrunning.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<setColorFilter> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashReceivingAccountEntity(accounts=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", debitCardHeader=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
