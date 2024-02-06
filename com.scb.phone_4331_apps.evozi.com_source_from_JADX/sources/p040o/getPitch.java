package p040o;

import android.content.Context;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPitch */
public final class getPitch extends writeUInt64NoTag<PassportParameters> {

    /* renamed from: o.getPitch$MediaDescriptionCompat */
    public static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<PassportParameters, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaDescriptionCompat read = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(1);
        }

        public final String getName() {
            return "showRoboAdvisorOpenSingleAppAccount";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(PassportParameters.class);
        }

        public final String getSignature() {
            return "showRoboAdvisorOpenSingleAppAccount()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            PassportParameters passportParameters = (PassportParameters) obj;
            onGetStartedClick.write((Object) passportParameters, "p1");
            passportParameters.write();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getPitch$MediaMetadataCompat */
    public static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<PassportParameters, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaMetadataCompat write = new MediaMetadataCompat();

        MediaMetadataCompat() {
            super(1);
        }

        public final String getName() {
            return "showSCBSOpenSingleAppAccount";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(PassportParameters.class);
        }

        public final String getSignature() {
            return "showSCBSOpenSingleAppAccount()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            PassportParameters passportParameters = (PassportParameters) obj;
            onGetStartedClick.write((Object) passportParameters, "p1");
            passportParameters.MediaBrowserCompat$MediaItem();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getPitch$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportParameters> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportParameters) obj).write("roboadvisor_open_add_acc");
        }
    }

    /* renamed from: o.getPitch$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportParameters> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportParameters) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.getPitch$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportParameters> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportParameters) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getPitch(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    public static String IconCompatParcelizer(Context context, int i) {
        onGetStartedClick.write((Object) context, "context");
        if (i == 2 || i == 3) {
            String string = context.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_scbs_investment_select_function_robo_advisor);
            onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…ct_function_robo_advisor)");
            return string;
        }
        String string2 = context.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_account_info_title);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.string.add_account_info_title)");
        return string2;
    }
}
