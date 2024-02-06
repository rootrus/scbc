package p040o;

import java.util.List;

/* renamed from: o.persistNonFatalEvent */
public final class persistNonFatalEvent {
    public final int MediaBrowserCompat$ItemReceiver;
    public final List<getSortedCustomAttributes> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof persistNonFatalEvent)) {
            return false;
        }
        persistNonFatalEvent persistnonfatalevent = (persistNonFatalEvent) obj;
        return this.MediaBrowserCompat$ItemReceiver == persistnonfatalevent.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) persistnonfatalevent.write);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        List<getSortedCustomAttributes> list = this.write;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilityAssessmentSectionDisplay(sectionNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", questions=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public persistNonFatalEvent(int i, List<getSortedCustomAttributes> list) {
        onGetStartedClick.write((Object) list, "questions");
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = list;
    }
}
