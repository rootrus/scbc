package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.dispatchBreadcrumbEvent */
public final class dispatchBreadcrumbEvent {
    public final List<dropBreadcrumb> IconCompatParcelizer;
    public final List<dropBreadcrumb> MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchBreadcrumbEvent)) {
            return false;
        }
        dispatchBreadcrumbEvent dispatchbreadcrumbevent = (dispatchBreadcrumbEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) dispatchbreadcrumbevent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dispatchbreadcrumbevent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) dispatchbreadcrumbevent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) dispatchbreadcrumbevent.read);
    }

    public final int hashCode() {
        List<dropBreadcrumb> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<dropBreadcrumb> list2 = this.IconCompatParcelizer;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSummaryDisplay(summary=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", successful=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", disclaimerHeader=");
        sb.append(this.write);
        sb.append(", disclaimerDescription=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public dispatchBreadcrumbEvent(List<? extends dropBreadcrumb> list, List<? extends dropBreadcrumb> list2, String str, String str2) {
        onGetStartedClick.write((Object) list, ErrorBundle.SUMMARY_ENTRY);
        onGetStartedClick.write((Object) str, "disclaimerHeader");
        onGetStartedClick.write((Object) str2, "disclaimerDescription");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = list2;
        this.write = str;
        this.read = str2;
    }
}
