package p040o;

import p040o.access$2300;

/* renamed from: o.cY$MediaBrowserCompat$ItemReceiver  reason: case insensitive filesystem */
public class C10893cY$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ C4162cY read;

    public C10893cY$MediaBrowserCompat$ItemReceiver(C4162cY cYVar) {
        this.read = cYVar;
    }

    public final void onError(Throwable th) {
        C4162cY.write(this.read);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4162cY.IconCompatParcelizer(this.read);
        this.read.read();
        C4162cY cYVar = this.read;
        C9864bF bFVar = C9864bF.IconCompatParcelizer;
        if (cYVar.RatingCompat != null) {
            bFVar.IconCompatParcelizer(cYVar.RatingCompat);
        }
    }
}
