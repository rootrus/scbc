package p040o;

import java.util.List;

/* renamed from: o.getZoomGesturesEnabled */
public final class getZoomGesturesEnabled {
    public final List<String> IconCompatParcelizer;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getZoomGesturesEnabled)) {
            return false;
        }
        getZoomGesturesEnabled getzoomgesturesenabled = (getZoomGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getzoomgesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getzoomgesturesenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FieldList(fieldFlag=");
        sb.append(this.write);
        sb.append(", listOfValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getZoomGesturesEnabled(String str, List<String> list) {
        onGetStartedClick.write((Object) str, "fieldFlag");
        this.write = str;
        this.IconCompatParcelizer = list;
    }
}
