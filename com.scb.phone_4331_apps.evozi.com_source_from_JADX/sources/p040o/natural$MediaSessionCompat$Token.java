package p040o;

/* renamed from: o.natural$MediaSessionCompat$Token */
final class natural$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    natural$MediaSessionCompat$Token(natural natural) {
        super(1);
        this.read = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        return natural.MediaBrowserCompat$ItemReceiver(this.read, setdatacollectionenabled);
    }
}
