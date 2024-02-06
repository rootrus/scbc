package p040o;

/* renamed from: o.FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment$MediaBrowserCompat$ItemReceiver */
final class C6873x55b450e extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<Boolean, Boolean, Boolean> {
    public static final C6873x55b450e IconCompatParcelizer = new C6873x55b450e();

    C6873x55b450e() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool2) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
