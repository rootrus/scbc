package p040o;

/* renamed from: o.nullsLast$MediaBrowserCompat$CustomActionResultReceiver */
final class nullsLast$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, Boolean> {
    public static final nullsLast$MediaBrowserCompat$CustomActionResultReceiver write = new nullsLast$MediaBrowserCompat$CustomActionResultReceiver();

    nullsLast$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        return Boolean.valueOf((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "COLLATERAL", (Object) setdatacollectionenabled.read) || setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) ? false : true);
    }
}
