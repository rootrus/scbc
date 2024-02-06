package p040o;

/* renamed from: o.setEvents */
public final class setEvents {
    String MediaBrowserCompat$CustomActionResultReceiver;
    String read;

    public /* synthetic */ setEvents() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEvents)) {
            return false;
        }
        setEvents setevents = (setEvents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setevents.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setevents.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Status(code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", type=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setEvents(String str, String str2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "type");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }
}
