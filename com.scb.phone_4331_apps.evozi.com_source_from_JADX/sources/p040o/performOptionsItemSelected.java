package p040o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p040o.CheckParameters;

/* renamed from: o.performOptionsItemSelected */
final class performOptionsItemSelected implements isStateSaved {
    private static final AudioAttributesCompat<Class<?>, byte[]> IconCompatParcelizer = new AudioAttributesCompat<>(50);
    private final CheckParameters.CheckCountry MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final isStateSaved MediaBrowserCompat$MediaItem;
    private final isStateSaved MediaBrowserCompat$SearchResultReceiver;
    private final onCreateAnimation<?> MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final onActivityResult RatingCompat;
    private final Class<?> read;

    performOptionsItemSelected(CheckParameters.CheckCountry checkCountry, isStateSaved isstatesaved, isStateSaved isstatesaved2, int i, int i2, onCreateAnimation<?> oncreateanimation, Class<?> cls, onActivityResult onactivityresult) {
        this.MediaBrowserCompat$CustomActionResultReceiver = checkCountry;
        this.MediaBrowserCompat$SearchResultReceiver = isstatesaved;
        this.MediaBrowserCompat$MediaItem = isstatesaved2;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.MediaDescriptionCompat = oncreateanimation;
        this.read = cls;
        this.RatingCompat = onactivityresult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof performOptionsItemSelected)) {
            return false;
        }
        performOptionsItemSelected performoptionsitemselected = (performOptionsItemSelected) obj;
        if (this.MediaBrowserCompat$ItemReceiver != performoptionsitemselected.MediaBrowserCompat$ItemReceiver || this.MediaMetadataCompat != performoptionsitemselected.MediaMetadataCompat || !LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver((Object) this.MediaDescriptionCompat, (Object) performoptionsitemselected.MediaDescriptionCompat) || !this.read.equals(performoptionsitemselected.read) || !this.MediaBrowserCompat$SearchResultReceiver.equals(performoptionsitemselected.MediaBrowserCompat$SearchResultReceiver) || !this.MediaBrowserCompat$MediaItem.equals(performoptionsitemselected.MediaBrowserCompat$MediaItem) || !this.RatingCompat.equals(performoptionsitemselected.RatingCompat)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$SearchResultReceiver.hashCode();
        int hashCode2 = (((((hashCode * 31) + this.MediaBrowserCompat$MediaItem.hashCode()) * 31) + this.MediaMetadataCompat) * 31) + this.MediaBrowserCompat$ItemReceiver;
        onCreateAnimation<?> oncreateanimation = this.MediaDescriptionCompat;
        if (oncreateanimation != null) {
            hashCode2 = (hashCode2 * 31) + oncreateanimation.hashCode();
        }
        return (((hashCode2 * 31) + this.read.hashCode()) * 31) + this.RatingCompat.hashCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.MediaBrowserCompat$CustomActionResultReceiver.read(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.MediaMetadataCompat).putInt(this.MediaBrowserCompat$ItemReceiver).array();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        messageDigest.update(bArr);
        onCreateAnimation<?> oncreateanimation = this.MediaDescriptionCompat;
        if (oncreateanimation != null) {
            oncreateanimation.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        }
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        byte[] IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(this.read);
        if (IconCompatParcelizer2 == null) {
            IconCompatParcelizer2 = this.read.getName().getBytes(write);
            IconCompatParcelizer.read(this.read, IconCompatParcelizer2);
        }
        messageDigest.update(IconCompatParcelizer2);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", signature=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", width=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", height=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", decodedResourceClass=");
        sb.append(this.read);
        sb.append(", transformation='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.RatingCompat);
        sb.append('}');
        return sb.toString();
    }
}
