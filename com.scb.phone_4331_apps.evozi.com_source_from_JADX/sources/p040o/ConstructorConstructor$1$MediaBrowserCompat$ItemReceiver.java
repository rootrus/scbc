package p040o;

import java.util.List;
import p040o.ConstructorConstructor;
import p040o.StreetViewPanorama;

/* renamed from: o.ConstructorConstructor$1$MediaBrowserCompat$ItemReceiver */
public final class ConstructorConstructor$1$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
    private /* synthetic */ ConstructorConstructor.C31971 MediaBrowserCompat$ItemReceiver;

    private ConstructorConstructor$1$MediaBrowserCompat$ItemReceiver(ConstructorConstructor.C31971 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        ConstructorConstructor.C31971 r0 = this.MediaBrowserCompat$ItemReceiver;
        newDefaultConstructor newdefaultconstructor = new newDefaultConstructor((List) obj);
        if (r0.RatingCompat != null) {
            newdefaultconstructor.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        ConstructorConstructor.C31971.write(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onComplete() {
        ConstructorConstructor.C31971.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        ConstructorConstructor.C31971.read(this.MediaBrowserCompat$ItemReceiver);
        ConstructorConstructor.C31971 r3 = this.MediaBrowserCompat$ItemReceiver;
        newUnsafeAllocator newunsafeallocator = newUnsafeAllocator.read;
        if (r3.RatingCompat != null) {
            newunsafeallocator.IconCompatParcelizer(r3.RatingCompat);
        }
    }
}
