package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.getResourcesIdentifier */
public final class getResourcesIdentifier {
    public final List<getSharedPrefs> MediaBrowserCompat$CustomActionResultReceiver;
    public final access$1400 MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getResourcesIdentifier)) {
            return false;
        }
        getResourcesIdentifier getresourcesidentifier = (getResourcesIdentifier) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getresourcesidentifier.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getresourcesidentifier.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<getSharedPrefs> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        access$1400 access_1400 = this.MediaBrowserCompat$ItemReceiver;
        if (access_1400 != null) {
            i = access_1400.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashMortgageLoanDisplay(offers=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getResourcesIdentifier(List<? extends getSharedPrefs> list, access$1400 access_1400) {
        onGetStartedClick.write((Object) list, "offers");
        onGetStartedClick.write((Object) access_1400, ErrorBundle.DETAIL_ENTRY);
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = access_1400;
    }
}
