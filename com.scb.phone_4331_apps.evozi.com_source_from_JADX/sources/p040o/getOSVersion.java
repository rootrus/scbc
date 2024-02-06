package p040o;

/* renamed from: o.getOSVersion */
public final /* synthetic */ class getOSVersion implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getTaskReturnValue MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getOSVersion(getTaskReturnValue gettaskreturnvalue, String str) {
        this.MediaBrowserCompat$ItemReceiver = gettaskreturnvalue;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTaskReturnValue gettaskreturnvalue = this.MediaBrowserCompat$ItemReceiver;
        setOSVersion setosversion = new setOSVersion(this.read);
        if (gettaskreturnvalue.RatingCompat != null) {
            setosversion.IconCompatParcelizer(gettaskreturnvalue.RatingCompat);
        }
    }
}
