package p040o;

import p040o.access$2300;

/* renamed from: o.getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver */
public final class getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<SettingsApi> {
    final String IconCompatParcelizer;
    final getOsBuildVersionString MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ getGlobalBitmap read;

    public final /* synthetic */ void onNext(Object obj) {
        getGlobalBitmap.write(this.read);
        getGlobalBitmap getglobalbitmap = this.read;
        inject_surface inject_surface = new inject_surface(this, (SettingsApi) obj);
        if (getglobalbitmap.RatingCompat != null) {
            inject_surface.IconCompatParcelizer(getglobalbitmap.RatingCompat);
        }
    }

    public getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver(getGlobalBitmap getglobalbitmap, getOsBuildVersionString getosbuildversionstring, String str) {
        this.read = getglobalbitmap;
        this.MediaBrowserCompat$ItemReceiver = getosbuildversionstring;
        this.IconCompatParcelizer = str;
    }

    public final void onComplete() {
        getGlobalBitmap.MediaBrowserCompat$ItemReceiver(this.read);
    }

    public final void onError(Throwable th) {
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            getGlobalBitmap getglobalbitmap = this.read;
            getglobalbitmap.MediaBrowserCompat$ItemReceiver(getglobalbitmap.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }
}
