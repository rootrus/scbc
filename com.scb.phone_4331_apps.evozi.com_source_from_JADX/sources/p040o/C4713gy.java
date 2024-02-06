package p040o;

/* renamed from: o.gy */
public final /* synthetic */ class C4713gy implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4767hi MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4713gy(C4767hi hiVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hiVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4767hi hiVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        C4714gz gzVar = new C4714gz(hiVar, (Throwable) obj);
        if (hiVar.RatingCompat != null) {
            gzVar.IconCompatParcelizer(hiVar.RatingCompat);
        }
    }
}
