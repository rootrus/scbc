package p040o;

/* renamed from: o.resetMinMaxZoomPreference */
public final class resetMinMaxZoomPreference extends zzuk {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final Boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resetMinMaxZoomPreference)) {
            return false;
        }
        resetMinMaxZoomPreference resetminmaxzoompreference = (resetMinMaxZoomPreference) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) resetminmaxzoompreference.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) resetminmaxzoompreference.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.write;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointValidate(fatcaStatus=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", registerVerifyUser=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public resetMinMaxZoomPreference(String str, Boolean bool) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = bool;
    }
}
