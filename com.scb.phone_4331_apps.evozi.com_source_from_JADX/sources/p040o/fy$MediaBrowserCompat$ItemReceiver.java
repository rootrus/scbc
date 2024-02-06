package p040o;

import p040o.getCompressedFrontImageSize;

/* renamed from: o.fy$MediaBrowserCompat$ItemReceiver */
public final class fy$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
    final /* synthetic */ C4442fy IconCompatParcelizer;

    private fy$MediaBrowserCompat$ItemReceiver(C4442fy fyVar) {
        this.IconCompatParcelizer = fyVar;
    }

    public /* synthetic */ fy$MediaBrowserCompat$ItemReceiver(C4442fy fyVar, byte b) {
        this(fyVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4442fy fyVar = this.IconCompatParcelizer;
        C4439fu fuVar = new C4439fu(this, (setBoundsBias) obj);
        if (fyVar.RatingCompat != null) {
            fuVar.IconCompatParcelizer(fyVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            C4442fy fyVar = this.IconCompatParcelizer;
            C4437fr frVar = C4437fr.MediaBrowserCompat$CustomActionResultReceiver;
            if (fyVar.RatingCompat != null) {
                frVar.IconCompatParcelizer(fyVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getCompressedFrontImageSize.write write) {
        write.ay_();
        write.write();
    }
}
