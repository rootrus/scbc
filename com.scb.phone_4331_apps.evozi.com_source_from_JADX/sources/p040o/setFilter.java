package p040o;

/* renamed from: o.setFilter */
public final class setFilter {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFilter)) {
            return false;
        }
        setFilter setfilter = (setFilter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setfilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setfilter.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressGoodToKnow(imageUrl=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setFilter(String str, String str2) {
        onGetStartedClick.write((Object) str, "imageUrl");
        onGetStartedClick.write((Object) str2, "description");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
