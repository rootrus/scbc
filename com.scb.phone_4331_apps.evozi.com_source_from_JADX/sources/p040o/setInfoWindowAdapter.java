package p040o;

/* renamed from: o.setInfoWindowAdapter */
public final class setInfoWindowAdapter {
    public final Integer IconCompatParcelizer;
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setInfoWindowAdapter)) {
            return false;
        }
        setInfoWindowAdapter setinfowindowadapter = (setInfoWindowAdapter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setinfowindowadapter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setinfowindowadapter.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.IconCompatParcelizer;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Experience(year=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", month=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setInfoWindowAdapter(Integer num, Integer num2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.IconCompatParcelizer = num2;
    }
}
