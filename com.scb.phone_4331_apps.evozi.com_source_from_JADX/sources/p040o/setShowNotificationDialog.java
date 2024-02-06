package p040o;

import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setShowNotificationDialog */
public final class setShowNotificationDialog extends writeUInt64NoTag<C6983xe0e73acb> {
    public final LinkedListMultimap.C35754 IconCompatParcelizer;

    /* renamed from: o.setShowNotificationDialog$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<C6983xe0e73acb, HmlVerifyPhoneValidateOtpActivity> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final String getName() {
            return "hideMyInsuranceCard";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C6983xe0e73acb.class);
        }

        public final String getSignature() {
            return "hideMyInsuranceCard()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C6983xe0e73acb passportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver = (C6983xe0e73acb) obj;
            onGetStartedClick.write((Object) passportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver, "p1");
            passportCaptureModule_PassportOnDeviceExtractionServer_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.write();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setShowNotificationDialog$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C6983xe0e73acb> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6983xe0e73acb) obj).write(Iterables$3$MediaBrowserCompat$MediaItem.chubb_setting_alert_message);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setShowNotificationDialog(LinkedListMultimap.C35754 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = r2;
    }
}
