package p040o;

import p040o.getTopLeftCornerWidth;

/* renamed from: o.sI$MediaBrowserCompat$CustomActionResultReceiver */
public class sI$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
    final /* synthetic */ C7434sI write;

    private sI$MediaBrowserCompat$CustomActionResultReceiver(C7434sI sIVar) {
        this.write = sIVar;
    }

    public /* synthetic */ sI$MediaBrowserCompat$CustomActionResultReceiver(C7434sI sIVar, byte b) {
        this(sIVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C7434sI sIVar = this.write;
        C7518td tdVar = new C7518td(this, (setBoundsBias) obj);
        if (sIVar.RatingCompat != null) {
            tdVar.IconCompatParcelizer(sIVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            C7434sI sIVar = this.write;
            C7520tg tgVar = C7520tg.MediaBrowserCompat$CustomActionResultReceiver;
            if (sIVar.RatingCompat != null) {
                tgVar.IconCompatParcelizer(sIVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getTopLeftCornerWidth.setExpandedFormat setexpandedformat) {
        setexpandedformat.ay_();
        setexpandedformat.write();
    }
}
