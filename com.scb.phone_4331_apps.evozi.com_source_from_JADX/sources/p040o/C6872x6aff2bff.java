package p040o;

/* renamed from: o.FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6872x6aff2bff extends CheckEligibilityActivity implements BaseDiscoverDisclaimerActivity<Boolean, Boolean, Boolean, Boolean> {
    public static final C6872x6aff2bff MediaBrowserCompat$CustomActionResultReceiver = new C6872x6aff2bff();

    C6872x6aff2bff() {
        super(3);
    }

    public final /* synthetic */ Object write(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = Boolean.TRUE;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) bool3) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) bool3) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) bool3)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
