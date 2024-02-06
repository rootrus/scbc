package p040o;

/* renamed from: o.nullsLast$MediaBrowserCompat$ItemReceiver */
final class nullsLast$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ nullsLast read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    nullsLast$MediaBrowserCompat$ItemReceiver(nullsLast nullslast) {
        super(1);
        this.read = nullslast;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        return nullsLast.MediaBrowserCompat$ItemReceiver(this.read, setdatacollectionenabled);
    }
}
