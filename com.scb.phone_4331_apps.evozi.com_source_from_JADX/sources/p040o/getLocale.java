package p040o;

import java.util.List;

/* renamed from: o.getLocale */
public final class getLocale {
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final List<getViewport> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLocale)) {
            return false;
        }
        getLocale getlocale = (getLocale) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getlocale.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlocale.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<getViewport> list = this.MediaBrowserCompat$ItemReceiver;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SectionsItem(sectionNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", questions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getLocale(int i, List<getViewport> list) {
        onGetStartedClick.write((Object) list, "questions");
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
