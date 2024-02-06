package p040o;

import p040o.access$2300;

/* renamed from: o.cn$MediaBrowserCompat$CustomActionResultReceiver */
public class cn$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ C4199cn write;

    protected cn$MediaBrowserCompat$CustomActionResultReceiver(C4199cn cnVar) {
        this.write = cnVar;
    }

    public final void onError(Throwable th) {
        C4199cn.write(this.write);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4199cn.MediaDescriptionCompat(this.write);
        C4199cn cnVar = this.write;
        destroyInjector destroyinjector = destroyInjector.read;
        if (cnVar.RatingCompat != null) {
            destroyinjector.IconCompatParcelizer(cnVar.RatingCompat);
        }
    }
}
