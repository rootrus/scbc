package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingStrategy$MediaSessionCompat$QueueItem */
final class FieldNamingStrategy$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
    private /* synthetic */ FieldNamingStrategy IconCompatParcelizer;
    private /* synthetic */ RetrofitException write;

    FieldNamingStrategy$MediaSessionCompat$QueueItem(FieldNamingStrategy fieldNamingStrategy, RetrofitException retrofitException) {
        this.IconCompatParcelizer = fieldNamingStrategy;
        this.write = retrofitException;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.MediaDescriptionCompat mediaDescriptionCompat = (getFirstName.MediaDescriptionCompat) obj;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FieldNamingStrategy.MediaDescriptionCompat((Throwable) this.write), (Object) "3006")) {
            mediaDescriptionCompat.RatingCompat();
        } else if (this.write.write != RetrofitException.read.SESSION_EXPIRED) {
            mediaDescriptionCompat.MediaMetadataCompat();
        }
    }
}
