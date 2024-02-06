package p040o;

import java.util.List;

/* renamed from: o.maxZoomPreference */
public final class maxZoomPreference {
    private final List<getZOrderOnTop> IconCompatParcelizer;
    public final int read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maxZoomPreference)) {
            return false;
        }
        maxZoomPreference maxzoompreference = (maxZoomPreference) obj;
        return this.read == maxzoompreference.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) maxzoompreference.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.read;
        List<getZOrderOnTop> list = this.IconCompatParcelizer;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceLandingResponse(tcAcceptRequired=");
        sb.append(this.read);
        sb.append(", countryList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public maxZoomPreference(int i, List<getZOrderOnTop> list) {
        this.read = i;
        this.IconCompatParcelizer = list;
    }
}
