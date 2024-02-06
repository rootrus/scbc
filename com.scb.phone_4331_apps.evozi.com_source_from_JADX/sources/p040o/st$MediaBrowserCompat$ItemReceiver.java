package p040o;

import p040o.access$2300;

/* renamed from: o.st$MediaBrowserCompat$ItemReceiver */
public class st$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setStreetNamesEnabled> {
    private /* synthetic */ C7475st IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final closePinLocation$MediaBrowserCompat$ItemReceiver write;

    public final void onComplete() {
    }

    public final /* synthetic */ void onNext(Object obj) {
        C7475st.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer);
        setUuidFromUtf8Bytes IconCompatParcelizer2 = this.IconCompatParcelizer.PlaybackStateCompat$CustomAction.IconCompatParcelizer((setStreetNamesEnabled) obj, this.IconCompatParcelizer.write, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.AppCompatActivity(), this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.IconCompatParcelizer.MediaBrowserCompat$MediaItem.IconCompatParcelizer.setCheckable(), this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setItemInvoker());
        C7475st stVar = this.IconCompatParcelizer;
        onProviderDisabled onproviderdisabled = new onProviderDisabled(IconCompatParcelizer2);
        if (stVar.RatingCompat != null) {
            onproviderdisabled.IconCompatParcelizer(stVar.RatingCompat);
        }
    }

    public st$MediaBrowserCompat$ItemReceiver(C7475st stVar, closePinLocation$MediaBrowserCompat$ItemReceiver closepinlocation_mediabrowsercompat_itemreceiver, String str) {
        this.IconCompatParcelizer = stVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = closepinlocation_mediabrowsercompat_itemreceiver;
    }

    public final void onError(Throwable th) {
        C7475st.MediaMetadataCompat(this.IconCompatParcelizer);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
