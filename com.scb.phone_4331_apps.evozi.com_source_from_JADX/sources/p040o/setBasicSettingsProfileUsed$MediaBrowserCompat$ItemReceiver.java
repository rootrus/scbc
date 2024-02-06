package p040o;

import p040o.access$2300;

/* renamed from: o.setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver */
public class setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setEventInterceptor> {
    final /* synthetic */ setBasicSettingsProfileUsed read;

    private setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver(setBasicSettingsProfileUsed setbasicsettingsprofileused) {
        this.read = setbasicsettingsprofileused;
    }

    public /* synthetic */ setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver(setBasicSettingsProfileUsed setbasicsettingsprofileused, byte b) {
        this(setbasicsettingsprofileused);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        setEventInterceptor seteventinterceptor = (setEventInterceptor) obj;
        setBasicSettingsProfileUsed.read(this.read);
        sha1 MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(seteventinterceptor);
        this.read.write.write = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        isEmulator MediaBrowserCompat$ItemReceiver = this.read.write;
        if (seteventinterceptor.MediaMetadataCompat != null) {
            str = seteventinterceptor.MediaMetadataCompat.read;
        } else {
            str = "";
        }
        MediaBrowserCompat$ItemReceiver.Keep = str;
        if (seteventinterceptor.MediaMetadataCompat != null) {
            setBasicSettingsProfileUsed setbasicsettingsprofileused = this.read;
            getImageBitmapHeight getimagebitmapheight = new getImageBitmapHeight(this, MediaBrowserCompat$CustomActionResultReceiver, seteventinterceptor);
            if (setbasicsettingsprofileused.RatingCompat != null) {
                getimagebitmapheight.IconCompatParcelizer(setbasicsettingsprofileused.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
