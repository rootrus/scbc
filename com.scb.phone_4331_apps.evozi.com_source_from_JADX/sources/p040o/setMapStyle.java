package p040o;

/* renamed from: o.setMapStyle */
public final class setMapStyle {
    private final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMapStyle)) {
            return false;
        }
        setMapStyle setmapstyle = (setMapStyle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmapstyle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmapstyle.MediaBrowserCompat$ItemReceiver);
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
        sb.append("SourceOfIncome(countryCode=");
        sb.append(this.write);
        sb.append(", countryName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setMapStyle(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public /* synthetic */ setMapStyle(String str) {
        this(str, (String) null);
    }
}
