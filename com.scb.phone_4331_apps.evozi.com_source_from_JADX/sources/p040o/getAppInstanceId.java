package p040o;

import java.util.List;

/* renamed from: o.getAppInstanceId */
public final class getAppInstanceId {
    public final getCurrentScreenClass MediaBrowserCompat$CustomActionResultReceiver;
    public final List<generateEventId> MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAppInstanceId)) {
            return false;
        }
        getAppInstanceId getappinstanceid = (getAppInstanceId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getappinstanceid.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getappinstanceid.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getappinstanceid.read);
    }

    public final int hashCode() {
        getCurrentScreenClass getcurrentscreenclass = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = getcurrentscreenclass != null ? getcurrentscreenclass.hashCode() : 0;
        List<generateEventId> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollateralList(prefill=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", collateral=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minimumAmount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getAppInstanceId(getCurrentScreenClass getcurrentscreenclass, List<generateEventId> list, String str) {
        onGetStartedClick.write((Object) list, "collateral");
        onGetStartedClick.write((Object) str, "minimumAmount");
        this.MediaBrowserCompat$CustomActionResultReceiver = getcurrentscreenclass;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = str;
    }
}
