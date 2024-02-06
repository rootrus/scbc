package p040o;

/* renamed from: o.natural$MediaSessionCompat$ResultReceiverWrapper */
final class natural$MediaSessionCompat$ResultReceiverWrapper extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    natural$MediaSessionCompat$ResultReceiverWrapper(natural natural) {
        super(1);
        this.IconCompatParcelizer = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        return natural.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, setdatacollectionenabled);
    }
}
