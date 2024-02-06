package p040o;

/* renamed from: o.dc */
public final /* synthetic */ class C4275dc implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4336eE MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4275dc(C4336eE eEVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eEVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4336eE eEVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        C4285dj djVar = new C4285dj(eEVar, (String) obj);
        if (eEVar.RatingCompat != null) {
            djVar.IconCompatParcelizer(eEVar.RatingCompat);
        }
    }
}
