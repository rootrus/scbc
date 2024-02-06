package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.getDeviceState */
public final class getDeviceState {
    public final access$1000 MediaBrowserCompat$CustomActionResultReceiver;
    public final List<getSharedPrefs> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDeviceState)) {
            return false;
        }
        getDeviceState getdevicestate = (getDeviceState) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getdevicestate.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getdevicestate.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<getSharedPrefs> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        access$1000 access_1000 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (access_1000 != null) {
            i = access_1000.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashMCMCLoanDisplay(offers=");
        sb.append(this.read);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getDeviceState(List<? extends getSharedPrefs> list, access$1000 access_1000) {
        onGetStartedClick.write((Object) list, "offers");
        onGetStartedClick.write((Object) access_1000, ErrorBundle.DETAIL_ENTRY);
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = access_1000;
    }
}
