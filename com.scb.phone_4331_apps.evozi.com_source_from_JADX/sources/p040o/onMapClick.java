package p040o;

import p040o.GoogleMap;

/* renamed from: o.onMapClick */
public final class onMapClick {
    public final GoogleMap.OnIndoorStateChangeListener MediaBrowserCompat$ItemReceiver;

    public onMapClick() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onMapClick) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((onMapClick) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.MediaBrowserCompat$ItemReceiver;
        if (onIndoorStateChangeListener != null) {
            return onIndoorStateChangeListener.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserAddress(currentAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ onMapClick(byte b) {
        this(new GoogleMap.OnIndoorStateChangeListener((byte) 0));
    }

    public onMapClick(GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        onGetStartedClick.write((Object) onIndoorStateChangeListener, "currentAddress");
        this.MediaBrowserCompat$ItemReceiver = onIndoorStateChangeListener;
    }
}
