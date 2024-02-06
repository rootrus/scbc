package p040o;

import p040o.access$2300;

/* renamed from: o.registerNewObjectListener$MediaBrowserCompat$ItemReceiver */
public class registerNewObjectListener$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ registerNewObjectListener IconCompatParcelizer;

    private registerNewObjectListener$MediaBrowserCompat$ItemReceiver(registerNewObjectListener registernewobjectlistener) {
        this.IconCompatParcelizer = registernewobjectlistener;
    }

    public /* synthetic */ registerNewObjectListener$MediaBrowserCompat$ItemReceiver(registerNewObjectListener registernewobjectlistener, byte b) {
        this(registernewobjectlistener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((Boolean) obj);
        registerNewObjectListener registernewobjectlistener = this.IconCompatParcelizer;
        containsPoint containspoint = containsPoint.IconCompatParcelizer;
        if (registernewobjectlistener.RatingCompat != null) {
            containspoint.IconCompatParcelizer(registernewobjectlistener.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
        registerNewObjectListener.read(this.IconCompatParcelizer);
    }
}
