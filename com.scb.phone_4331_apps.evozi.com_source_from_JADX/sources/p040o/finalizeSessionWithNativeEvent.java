package p040o;

import java.util.List;

/* renamed from: o.finalizeSessionWithNativeEvent */
public final class finalizeSessionWithNativeEvent {
    public final List<persistNonFatalEvent> MediaBrowserCompat$ItemReceiver;
    public boolean read = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof finalizeSessionWithNativeEvent)) {
            return false;
        }
        finalizeSessionWithNativeEvent finalizesessionwithnativeevent = (finalizeSessionWithNativeEvent) obj;
        return this.read == finalizesessionwithnativeevent.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) finalizesessionwithnativeevent.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.read;
        if (z) {
            z = true;
        }
        List<persistNonFatalEvent> list = this.MediaBrowserCompat$ItemReceiver;
        return ((z ? 1 : 0) * true) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilityAssessmentDisplay(nextEnable=");
        sb.append(this.read);
        sb.append(", sections=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public finalizeSessionWithNativeEvent(List<persistNonFatalEvent> list) {
        onGetStartedClick.write((Object) list, "sections");
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
