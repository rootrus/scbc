package p040o;

/* renamed from: o.FragmentBuilder_BindTopHistoryFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6832x946186d extends CheckEligibilityActivity implements FundFactSheetActivity<DeejungTransferLandingActivity, Boolean> {
    public static final C6832x946186d MediaBrowserCompat$ItemReceiver = new C6832x946186d();

    C6832x946186d() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        DeejungTransferLandingActivity deejungTransferLandingActivity = (DeejungTransferLandingActivity) obj;
        boolean z = true;
        if (deejungTransferLandingActivity == null || !deejungTransferLandingActivity.RatingCompat) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
