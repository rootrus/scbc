package p040o;

import p040o.LinkedListMultimap;
import p040o.writeUInt64NoTag;

/* renamed from: o.FixedAspectRatioCaptureExperience_MembersInjector */
public final class FixedAspectRatioCaptureExperience_MembersInjector extends writeUInt64NoTag<C7142hw> {
    public final LinkedListMultimap.DistinctKeyIterator MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public boolean write;

    /* renamed from: o.FixedAspectRatioCaptureExperience_MembersInjector$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7142hw> {
        private /* synthetic */ FixedAspectRatioCaptureExperience_MembersInjector MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector) {
            this.MediaBrowserCompat$ItemReceiver = fixedAspectRatioCaptureExperience_MembersInjector;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7142hw) obj).IconCompatParcelizer(!this.MediaBrowserCompat$ItemReceiver.write);
        }
    }

    /* renamed from: o.FixedAspectRatioCaptureExperience_MembersInjector$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7142hw> {
        private /* synthetic */ FixedAspectRatioCaptureExperience_MembersInjector read;

        public write(FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector) {
            this.read = fixedAspectRatioCaptureExperience_MembersInjector;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7142hw) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.read && this.read.write);
        }
    }

    /* renamed from: o.FixedAspectRatioCaptureExperience_MembersInjector$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        public read(FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector) {
            super(1, fixedAspectRatioCaptureExperience_MembersInjector);
        }

        public final String getName() {
            return "onRequestFormSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(FixedAspectRatioCaptureExperience_MembersInjector.class);
        }

        public final String getSignature() {
            return "onRequestFormSuccess(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            FixedAspectRatioCaptureExperience_MembersInjector.IconCompatParcelizer((FixedAspectRatioCaptureExperience_MembersInjector) this.receiver, str);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FixedAspectRatioCaptureExperience_MembersInjector(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.DistinctKeyIterator distinctKeyIterator) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) distinctKeyIterator, "juristicVerifyPinController");
        this.MediaBrowserCompat$ItemReceiver = distinctKeyIterator;
    }

    public static final /* synthetic */ void IconCompatParcelizer(FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector, String str) {
        boolean z = true;
        if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
            fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$MediaItem = new C9744xcdf4503e(str);
        if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat == null) {
            z = false;
        }
        if (z) {
            fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$MediaItem.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat);
        }
    }
}
