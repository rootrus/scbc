package p040o;

import p040o.access$2300;

/* renamed from: o.nativeWritePngImage$MediaBrowserCompat$CustomActionResultReceiver */
final class C10077x68f725e7 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaLongClick> {
    final /* synthetic */ nativeWritePngImage IconCompatParcelizer;

    private C10077x68f725e7(nativeWritePngImage nativewritepngimage) {
        this.IconCompatParcelizer = nativewritepngimage;
    }

    /* synthetic */ C10077x68f725e7(nativeWritePngImage nativewritepngimage, byte b) {
        this(nativewritepngimage);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        onStreetViewPanoramaLongClick onstreetviewpanoramalongclick = (onStreetViewPanoramaLongClick) obj;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            putInstance IconCompatParcelizer2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer();
            if (this.IconCompatParcelizer.IconCompatParcelizer.read.write() == null || this.IconCompatParcelizer.IconCompatParcelizer.read.write().MediaBrowserCompat$ItemReceiver == null) {
                str = null;
            } else {
                str = this.IconCompatParcelizer.IconCompatParcelizer.read.write().MediaBrowserCompat$ItemReceiver.write;
            }
            nativeWritePngImage nativewritepngimage = this.IconCompatParcelizer;
            getScaleFactorUniform getscalefactoruniform = new getScaleFactorUniform(this, onstreetviewpanoramalongclick, IconCompatParcelizer2, str);
            if (nativewritepngimage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getscalefactoruniform.IconCompatParcelizer(nativewritepngimage.RatingCompat);
            }
        }
        boolean unused = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
    }

    public final void onError(Throwable th) {
        nativeWritePngImage nativewritepngimage = this.IconCompatParcelizer;
        nativewritepngimage.MediaBrowserCompat$ItemReceiver(nativewritepngimage.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        boolean unused = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
        nativeWritePngImage nativewritepngimage2 = this.IconCompatParcelizer;
        nativeShutdown nativeshutdown = nativeShutdown.read;
        if (nativewritepngimage2.RatingCompat != null) {
            nativeshutdown.IconCompatParcelizer(nativewritepngimage2.RatingCompat);
        }
    }
}
