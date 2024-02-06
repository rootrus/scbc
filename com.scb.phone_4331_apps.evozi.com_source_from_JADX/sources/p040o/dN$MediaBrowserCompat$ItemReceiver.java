package p040o;

import p040o.access$2300;

/* renamed from: o.dN$MediaBrowserCompat$ItemReceiver */
final class dN$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setLocationSource> {
    final /* synthetic */ C4261dN read;

    private dN$MediaBrowserCompat$ItemReceiver(C4261dN dNVar) {
        this.read = dNVar;
    }

    /* synthetic */ dN$MediaBrowserCompat$ItemReceiver(C4261dN dNVar, byte b) {
        this(dNVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        setLocationSource setlocationsource = (setLocationSource) obj;
        boolean z = true;
        if (this.read.RatingCompat != null) {
            C4261dN.IconCompatParcelizer(this.read);
            C4261dN dNVar = this.read;
            C4260dL dLVar = new C4260dL(setlocationsource);
            if (dNVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dLVar.IconCompatParcelizer(dNVar.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.read.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return;
        }
        C4261dN.RatingCompat(this.read);
        C4261dN dNVar = this.read;
        C4259dK dKVar = new C4259dK(this, th);
        if (dNVar.RatingCompat != null) {
            dKVar.IconCompatParcelizer(dNVar.RatingCompat);
        }
    }
}
