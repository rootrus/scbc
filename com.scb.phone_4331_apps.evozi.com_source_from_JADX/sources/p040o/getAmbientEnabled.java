package p040o;

import p040o.GoogleMap;

/* renamed from: o.getAmbientEnabled */
public final class getAmbientEnabled {
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final GoogleMap.OnMarkerDragListener MediaBrowserCompat$ItemReceiver;
    public final boolean read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAmbientEnabled)) {
            return false;
        }
        getAmbientEnabled getambientenabled = (getAmbientEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getambientenabled.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == getambientenabled.MediaBrowserCompat$CustomActionResultReceiver && this.read == getambientenabled.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getambientenabled.write);
    }

    public final int hashCode() {
        GoogleMap.OnMarkerDragListener onMarkerDragListener = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = onMarkerDragListener != null ? onMarkerDragListener.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.read;
        if (!z3) {
            z2 = z3;
        }
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((hashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registration(userProfile=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isPinLocked=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isCCActivation=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getAmbientEnabled(GoogleMap.OnMarkerDragListener onMarkerDragListener, boolean z, boolean z2, String str) {
        this.MediaBrowserCompat$ItemReceiver = onMarkerDragListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.read = z2;
        this.write = str;
    }
}
