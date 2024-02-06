package p040o;

import java.util.List;

/* renamed from: o.access$1000 */
public final class access$1000 {
    public final List<RestrictedComponentContainer> IconCompatParcelizer;
    public final List<RestrictedComponentContainer> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<RestrictedComponentContainer> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$1000)) {
            return false;
        }
        access$1000 access_1000 = (access$1000) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) access_1000.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) access_1000.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) access_1000.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<RestrictedComponentContainer> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<RestrictedComponentContainer> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<RestrictedComponentContainer> list3 = this.IconCompatParcelizer;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MCMCCalculationSummaryDisplay(collateralInformation=");
        sb.append(this.read);
        sb.append(", loanInformation=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", carRegistrationInformation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public access$1000(List<? extends RestrictedComponentContainer> list, List<? extends RestrictedComponentContainer> list2, List<? extends RestrictedComponentContainer> list3) {
        onGetStartedClick.write((Object) list, "collateralInformation");
        onGetStartedClick.write((Object) list2, "loanInformation");
        onGetStartedClick.write((Object) list3, "carRegistrationInformation");
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        this.IconCompatParcelizer = list3;
    }
}
