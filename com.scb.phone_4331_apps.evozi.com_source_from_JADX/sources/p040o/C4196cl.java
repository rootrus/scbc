package p040o;

import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.KtaJsonCheck;

/* renamed from: o.cl */
public class C4196cl extends writeUInt64NoTag<KtaJsonCheck.MediaDescriptionCompat> {
    private final getInput IconCompatParcelizer;
    private final onUnbind MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public C4196cl(RegularImmutableBiMap regularImmutableBiMap, onUnbind onunbind, getInput getinput) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = onunbind;
        this.IconCompatParcelizer = getinput;
    }

    public final void IconCompatParcelizer() {
        String str;
        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write(), this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setCheckable());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            str = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
        } else {
            str = null;
        }
        C4074bO bOVar = new C4074bO(str, MediaBrowserCompat$CustomActionResultReceiver);
        if (this.RatingCompat != null) {
            bOVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void onDestroy() {
        onUnbind onunbind = this.MediaBrowserCompat$ItemReceiver;
        if (!onunbind.MediaBrowserCompat$MediaItem.isDisposed()) {
            onunbind.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
