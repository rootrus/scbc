package p040o;

/* renamed from: o.setOnMapClickListener */
public final class setOnMapClickListener {
    public final setOnMapLoadedCallback MediaBrowserCompat$CustomActionResultReceiver;
    public final setOnInfoWindowLongClickListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnMapClickListener)) {
            return false;
        }
        setOnMapClickListener setonmapclicklistener = (setOnMapClickListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setonmapclicklistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonmapclicklistener.write);
    }

    public final int hashCode() {
        setOnMapLoadedCallback setonmaploadedcallback = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = setonmaploadedcallback != null ? setonmaploadedcallback.hashCode() : 0;
        setOnInfoWindowLongClickListener setoninfowindowlongclicklistener = this.write;
        if (setoninfowindowlongclicklistener != null) {
            i = setoninfowindowlongclicklistener.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowTransaction(payNowConfirmation=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", payNowVerification=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setOnMapClickListener(setOnMapLoadedCallback setonmaploadedcallback, setOnInfoWindowLongClickListener setoninfowindowlongclicklistener) {
        onGetStartedClick.write((Object) setonmaploadedcallback, "payNowConfirmation");
        onGetStartedClick.write((Object) setoninfowindowlongclicklistener, "payNowVerification");
        this.MediaBrowserCompat$CustomActionResultReceiver = setonmaploadedcallback;
        this.write = setoninfowindowlongclicklistener;
    }
}
