package p040o;

import p040o.ServerProjectProvider;

/* renamed from: o.ss */
public final class C7474ss extends writeUInt64NoTag<ServerProjectProvider.C70695.write> {
    public final /* synthetic */ C7490sz MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ss$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ServerProjectProvider.C70695.write, HmlVerifyPhoneValidateOtpActivity> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final String getName() {
            return "navigateToMyQRCoachMarks";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(ServerProjectProvider.C70695.write.class);
        }

        public final String getSignature() {
            return "navigateToMyQRCoachMarks()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ServerProjectProvider.C70695.write write2 = (ServerProjectProvider.C70695.write) obj;
            onGetStartedClick.write((Object) write2, "p1");
            write2.MediaBrowserCompat$ItemReceiver();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C7474ss(C7490sz szVar, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) szVar, "coachMarkPresenter");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = szVar;
    }
}
