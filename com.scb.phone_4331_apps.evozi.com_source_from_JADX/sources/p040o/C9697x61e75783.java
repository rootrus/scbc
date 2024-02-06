package p040o;

import p040o.access$2300;

/* renamed from: o.ColorPassThroughShader$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9697x61e75783 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setHeight> {
    private /* synthetic */ ColorPassThroughShader MediaBrowserCompat$ItemReceiver;
    private access$1900 read;

    public final /* synthetic */ void onNext(Object obj) {
        ColorPassThroughShader.read(this.MediaBrowserCompat$ItemReceiver);
        defaultReportUploader MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.f2688x50fd9e4a.MediaBrowserCompat$ItemReceiver((setHeight) obj, this.read);
        ColorPassThroughShader colorPassThroughShader = this.MediaBrowserCompat$ItemReceiver;
        setSettings setsettings = new setSettings(MediaBrowserCompat$ItemReceiver2);
        if (colorPassThroughShader.RatingCompat != null) {
            setsettings.IconCompatParcelizer(colorPassThroughShader.RatingCompat);
        }
        boolean unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = true;
    }

    public C9697x61e75783(ColorPassThroughShader colorPassThroughShader, access$1900 access_1900) {
        this.MediaBrowserCompat$ItemReceiver = colorPassThroughShader;
        this.read = access_1900;
    }

    public final void onComplete() {
        ColorPassThroughShader.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        ColorPassThroughShader.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        boolean unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = true;
    }
}
