package p040o;

import java.util.List;
import p040o.access$2300;

/* renamed from: o.cj$MediaBrowserCompat$ItemReceiver */
public final class cj$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzwg> {
    final /* synthetic */ C4192cj MediaBrowserCompat$ItemReceiver;

    private cj$MediaBrowserCompat$ItemReceiver(C4192cj cjVar) {
        this.MediaBrowserCompat$ItemReceiver = cjVar;
    }

    public /* synthetic */ cj$MediaBrowserCompat$ItemReceiver(C4192cj cjVar, byte b) {
        this(cjVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4192cj cjVar = this.MediaBrowserCompat$ItemReceiver;
        List unused = cjVar.f2807x50fd9e4a = cjVar.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver((zzwg) obj);
        C4192cj cjVar2 = this.MediaBrowserCompat$ItemReceiver;
        C4084bY bYVar = new C4084bY(this);
        if (cjVar2.RatingCompat != null) {
            bYVar.IconCompatParcelizer(cjVar2.RatingCompat);
        }
    }

    public final void onComplete() {
        C4192cj.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        C4192cj.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
