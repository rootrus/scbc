package p040o;

import java.util.List;

/* renamed from: o.getSecondaryText */
public final class getSecondaryText {
    public final List<String> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getSecondaryText) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((getSecondaryText) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegisteredAddress(registeredAddress=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getSecondaryText(List<String> list) {
        onGetStartedClick.write((Object) list, "registeredAddress");
        this.IconCompatParcelizer = list;
    }
}
