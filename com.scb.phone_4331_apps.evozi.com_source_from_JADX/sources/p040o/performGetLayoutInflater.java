package p040o;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: o.performGetLayoutInflater */
public final class performGetLayoutInflater implements isStateSaved {
    private final onActivityResult IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private final isStateSaved MediaBrowserCompat$MediaItem;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final Class<?> MediaDescriptionCompat;
    private final Class<?> MediaMetadataCompat;
    private final Map<Class<?>, onCreateAnimation<?>> RatingCompat;
    private final Object read;

    public performGetLayoutInflater(Object obj, isStateSaved isstatesaved, int i, int i2, Map<Class<?>, onCreateAnimation<?>> map, Class<?> cls, Class<?> cls2, onActivityResult onactivityresult) {
        if (obj != null) {
            this.read = obj;
            if (isstatesaved != null) {
                this.MediaBrowserCompat$MediaItem = isstatesaved;
                this.MediaBrowserCompat$SearchResultReceiver = i;
                this.MediaBrowserCompat$CustomActionResultReceiver = i2;
                if (map != null) {
                    this.RatingCompat = map;
                    if (cls != null) {
                        this.MediaDescriptionCompat = cls;
                        if (cls2 != null) {
                            this.MediaMetadataCompat = cls2;
                            if (onactivityresult != null) {
                                this.IconCompatParcelizer = onactivityresult;
                                return;
                            }
                            throw new NullPointerException("Argument must not be null");
                        }
                        throw new NullPointerException("Transcode class must not be null");
                    }
                    throw new NullPointerException("Resource class must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Signature must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof performGetLayoutInflater)) {
            return false;
        }
        performGetLayoutInflater performgetlayoutinflater = (performGetLayoutInflater) obj;
        if (!this.read.equals(performgetlayoutinflater.read) || !this.MediaBrowserCompat$MediaItem.equals(performgetlayoutinflater.MediaBrowserCompat$MediaItem) || this.MediaBrowserCompat$CustomActionResultReceiver != performgetlayoutinflater.MediaBrowserCompat$CustomActionResultReceiver || this.MediaBrowserCompat$SearchResultReceiver != performgetlayoutinflater.MediaBrowserCompat$SearchResultReceiver || !this.RatingCompat.equals(performgetlayoutinflater.RatingCompat) || !this.MediaDescriptionCompat.equals(performgetlayoutinflater.MediaDescriptionCompat) || !this.MediaMetadataCompat.equals(performgetlayoutinflater.MediaMetadataCompat) || !this.IconCompatParcelizer.equals(performgetlayoutinflater.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            int hashCode = this.read.hashCode();
            this.MediaBrowserCompat$ItemReceiver = hashCode;
            int hashCode2 = (hashCode * 31) + this.MediaBrowserCompat$MediaItem.hashCode();
            this.MediaBrowserCompat$ItemReceiver = hashCode2;
            int i = (hashCode2 * 31) + this.MediaBrowserCompat$SearchResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = i;
            int i2 = (i * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = i2;
            int hashCode3 = (i2 * 31) + this.RatingCompat.hashCode();
            this.MediaBrowserCompat$ItemReceiver = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.MediaDescriptionCompat.hashCode();
            this.MediaBrowserCompat$ItemReceiver = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.MediaMetadataCompat.hashCode();
            this.MediaBrowserCompat$ItemReceiver = hashCode5;
            this.MediaBrowserCompat$ItemReceiver = (hashCode5 * 31) + this.IconCompatParcelizer.hashCode();
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.read);
        sb.append(", width=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", height=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", resourceClass=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", transcodeClass=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", signature=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", hashCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transformations=");
        sb.append(this.RatingCompat);
        sb.append(", options=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
