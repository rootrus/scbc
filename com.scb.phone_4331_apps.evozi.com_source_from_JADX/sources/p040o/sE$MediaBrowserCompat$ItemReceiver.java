package p040o;

/* renamed from: o.sE$MediaBrowserCompat$ItemReceiver */
public class sE$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ C7430sE MediaBrowserCompat$ItemReceiver;

    private sE$MediaBrowserCompat$ItemReceiver(C7430sE sEVar) {
        this.MediaBrowserCompat$ItemReceiver = sEVar;
    }

    public /* synthetic */ sE$MediaBrowserCompat$ItemReceiver(C7430sE sEVar, byte b) {
        this(sEVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C7430sE.write(this.MediaBrowserCompat$ItemReceiver);
        C7430sE sEVar = this.MediaBrowserCompat$ItemReceiver;
        C7443sT sTVar = new C7443sT(this, (String) obj);
        if (sEVar.RatingCompat != null) {
            sTVar.IconCompatParcelizer(sEVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new C7445sV(this)));
    }
}
