package p040o;

import p040o.Utils;
import p040o.writeUInt64NoTag;

/* renamed from: o.FixedAspectRatioCaptureExperience */
public final class FixedAspectRatioCaptureExperience extends writeUInt64NoTag<C7137hr> {
    public final notNull read;

    /* renamed from: o.FixedAspectRatioCaptureExperience$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<C7137hr, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final String getName() {
            return "navigateToLifestyleLanding";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C7137hr.class);
        }

        public final String getSignature() {
            return "navigateToLifestyleLanding()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C7137hr hrVar = (C7137hr) obj;
            onGetStartedClick.write((Object) hrVar, "p1");
            hrVar.IconCompatParcelizer();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FixedAspectRatioCaptureExperience$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<C7137hr, HmlVerifyPhoneValidateOtpActivity> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final String getName() {
            return "navigateToJuristicLifestyleLanding";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C7137hr.class);
        }

        public final String getSignature() {
            return "navigateToJuristicLifestyleLanding()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C7137hr hrVar = (C7137hr) obj;
            onGetStartedClick.write((Object) hrVar, "p1");
            hrVar.MediaBrowserCompat$ItemReceiver();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FixedAspectRatioCaptureExperience$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7137hr> {
        private /* synthetic */ Utils.C39312 read;

        public write(Utils.C39312 r1) {
            this.read = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7137hr hrVar = (C7137hr) obj;
            hrVar.MediaBrowserCompat$CustomActionResultReceiver();
            hrVar.read(this.read.read);
            String str = this.read.write;
            if (str != null && (!GoodToKnowActivity.read(str))) {
                hrVar.IconCompatParcelizer(this.read.write);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FixedAspectRatioCaptureExperience(notNull notnull, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) notnull, "getUserModeCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = notnull;
    }
}
