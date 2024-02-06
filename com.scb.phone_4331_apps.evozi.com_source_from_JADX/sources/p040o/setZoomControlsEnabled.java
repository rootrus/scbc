package p040o;

import java.util.Objects;

/* renamed from: o.setZoomControlsEnabled */
public final class setZoomControlsEnabled {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public Double MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public ICameraUpdateFactoryDelegate MediaDescriptionCompat;
    public String RatingCompat;
    public Integer read;
    public String write;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpBiller{id=");
        sb.append(this.read);
        sb.append(", accountNumber='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", serviceType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", limitPerDay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", billerLogoUrl='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", referenceLabel='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", billerName='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
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
        setZoomControlsEnabled setzoomcontrolsenabled = (setZoomControlsEnabled) obj;
        if (!Objects.equals(this.read, setzoomcontrolsenabled.read) || !Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, setzoomcontrolsenabled.MediaBrowserCompat$CustomActionResultReceiver) || this.MediaDescriptionCompat != setzoomcontrolsenabled.MediaDescriptionCompat || !Objects.equals(this.MediaBrowserCompat$ItemReceiver, setzoomcontrolsenabled.MediaBrowserCompat$ItemReceiver) || !Objects.equals(this.write, setzoomcontrolsenabled.write) || !Objects.equals(this.RatingCompat, setzoomcontrolsenabled.RatingCompat) || !Objects.equals(this.IconCompatParcelizer, setzoomcontrolsenabled.IconCompatParcelizer) || !Objects.equals(this.MediaBrowserCompat$MediaItem, setzoomcontrolsenabled.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompat$ItemReceiver, this.write, this.RatingCompat, this.IconCompatParcelizer, this.MediaBrowserCompat$MediaItem});
    }
}
