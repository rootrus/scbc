package p040o;

import p040o.ConstructorConstructor;

/* renamed from: o.ConstructorConstructor$9$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3212x29c7ec22 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLastLocation> {
    private /* synthetic */ ConstructorConstructor.C32099 MediaBrowserCompat$ItemReceiver;
    private final boolean read;

    public final /* synthetic */ void onNext(Object obj) {
        ConstructorConstructor.C32099.write(this.MediaBrowserCompat$ItemReceiver);
        ConstructorConstructor.C32099.write(this.MediaBrowserCompat$ItemReceiver, this.read, (getLastLocation) obj);
    }

    C3212x29c7ec22(ConstructorConstructor.C32099 r1, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.read = z;
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            ConstructorConstructor.C32099 r3 = this.MediaBrowserCompat$ItemReceiver;
            Excluder excluder = Excluder.MediaBrowserCompat$CustomActionResultReceiver;
            if (r3.RatingCompat != null) {
                excluder.IconCompatParcelizer(r3.RatingCompat);
            }
        }
    }
}
