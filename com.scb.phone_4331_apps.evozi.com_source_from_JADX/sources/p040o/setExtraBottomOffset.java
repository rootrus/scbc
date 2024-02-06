package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setExtraBottomOffset */
public final class setExtraBottomOffset extends setCurrentItemInternal {
    @SerializedName("securitiesList")
    public final setDrawMarkerViews read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setExtraBottomOffset) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setExtraBottomOffset) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        setDrawMarkerViews setdrawmarkerviews = this.read;
        if (setdrawmarkerviews != null) {
            return setdrawmarkerviews.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredSecuritiesListEntity(securitiesList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
