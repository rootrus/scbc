package p040o;

import java.util.List;
import java.util.Objects;
import p040o.AbstractMultimap;

/* renamed from: o.getPlace */
public final class getPlace extends zzuk {
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public List<PlaceLikelihoodBuffer> MediaDescriptionCompat;
    public int read;
    public AbstractMultimap.AsMap.AsMapEntries write;

    public static getPlace read() {
        return new getPlace();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandingPageData{rootMaxNumberOfTiles=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", groupMaxNumberOfTiles=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", predictiveMaxNumberOfTiles=");
        sb.append(this.read);
        sb.append(", tiles=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", staticTileState=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getPlace getplace = (getPlace) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == getplace.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == getplace.MediaBrowserCompat$ItemReceiver && this.read == getplace.read && Objects.equals(this.MediaDescriptionCompat, getplace.MediaDescriptionCompat) && this.write == getplace.write) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver), Integer.valueOf(this.read), this.MediaDescriptionCompat, this.write});
    }
}
