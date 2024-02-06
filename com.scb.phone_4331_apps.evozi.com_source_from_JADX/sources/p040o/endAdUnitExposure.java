package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.endAdUnitExposure */
public final class endAdUnitExposure {
    public final String IconCompatParcelizer;
    public final List<initForTests> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<setDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endAdUnitExposure)) {
            return false;
        }
        endAdUnitExposure endadunitexposure = (endAdUnitExposure) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) endadunitexposure.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) endadunitexposure.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) endadunitexposure.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<initForTests> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode2 = str != null ? str.hashCode() : 0;
        List<setDataCollectionEnabled> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashMortgageLoan(offers=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", applicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public endAdUnitExposure(List<? extends initForTests> list, String str, List<? extends setDataCollectionEnabled> list2) {
        onGetStartedClick.write((Object) list, "offers");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) list2, ErrorBundle.DETAIL_ENTRY);
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = list2;
    }
}
