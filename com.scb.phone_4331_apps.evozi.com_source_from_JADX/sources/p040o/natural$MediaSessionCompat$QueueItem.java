package p040o;

/* renamed from: o.natural$MediaSessionCompat$QueueItem */
final class natural$MediaSessionCompat$QueueItem extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    natural$MediaSessionCompat$QueueItem(natural natural) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        return natural.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setdatacollectionenabled);
    }
}
