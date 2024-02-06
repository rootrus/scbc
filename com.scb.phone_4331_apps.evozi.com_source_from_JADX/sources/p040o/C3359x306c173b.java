package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingStrategy$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C3359x306c173b<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
    private /* synthetic */ FieldNamingStrategy IconCompatParcelizer;
    private /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    C3359x306c173b(FieldNamingStrategy fieldNamingStrategy, Throwable th) {
        this.IconCompatParcelizer = fieldNamingStrategy;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.MediaDescriptionCompat mediaDescriptionCompat = (getFirstName.MediaDescriptionCompat) obj;
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (th instanceof RetrofitException) {
            FieldNamingStrategy.read(this.IconCompatParcelizer, (RetrofitException) th);
        } else {
            mediaDescriptionCompat.MediaMetadataCompat();
        }
    }
}
