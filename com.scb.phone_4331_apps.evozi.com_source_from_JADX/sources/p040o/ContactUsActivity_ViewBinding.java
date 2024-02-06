package p040o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.ContactUsActivity_ViewBinding */
public final class ContactUsActivity_ViewBinding extends ContextWrapper {
    private final HmlVerifyEmailActivity MediaBrowserCompat$CustomActionResultReceiver;

    static {
        clickNext[] clicknextArr = new clickNext[1];
        clickNext write2 = FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(ContactUsActivity_ViewBinding.class), "inflater", "getInflater()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;"));
    }

    private ContactUsActivity_ViewBinding(Context context) {
        super(context);
        HmlVerifyEmailActivity hmlVerifyEmailActivity;
        HmlVerifyPhoneLoanReviewActivity hmlVerifyPhoneLoanReviewActivity = HmlVerifyPhoneLoanReviewActivity.NONE;
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) hmlVerifyPhoneLoanReviewActivity, "mode");
        onGetStartedClick.write((Object) write2, "initializer");
        int i = HmlVerifyPhoneActivity.write[hmlVerifyPhoneLoanReviewActivity.ordinal()];
        if (i == 1) {
            hmlVerifyEmailActivity = new HmlVerifyPhoneTermsConditionsActivity(write2);
        } else if (i == 2) {
            hmlVerifyEmailActivity = new HmlWorkAddressActivity(write2);
        } else if (i == 3) {
            hmlVerifyEmailActivity = new HmlBusinessOwnerAccountSetupActivity(write2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlVerifyEmailActivity;
    }

    private /* synthetic */ ContactUsActivity_ViewBinding(Context context, byte b) {
        this(context);
    }

    public final Object getSystemService(String str) {
        onGetStartedClick.write((Object) str, "name");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "layout_inflater", (Object) str) ? (MarketingCSentWebViewActivity) this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver() : super.getSystemService(str);
    }

    /* renamed from: o.ContactUsActivity_ViewBinding$read */
    public static final class read implements dump {
        private final /* synthetic */ MapStyleOptions IconCompatParcelizer;
        private final /* synthetic */ List read;

        private read() {
        }

        public /* synthetic */ read(MapStyleOptions mapStyleOptions, List list) {
            this.IconCompatParcelizer = mapStyleOptions;
            this.read = list;
        }

        public void MediaBrowserCompat$ItemReceiver(Object obj) {
            MapStyleOptions.read((FundSwitchLandingActivity) obj, this.read);
        }
    }

    /* renamed from: o.ContactUsActivity_ViewBinding$write */
    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<MarketingCSentWebViewActivity> {
        private /* synthetic */ ContactUsActivity_ViewBinding write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(ContactUsActivity_ViewBinding contactUsActivity_ViewBinding) {
            super(0);
            this.write = contactUsActivity_ViewBinding;
        }

        public final /* synthetic */ Object invoke() {
            LayoutInflater from = LayoutInflater.from(this.write.getBaseContext());
            onGetStartedClick.IconCompatParcelizer((Object) from, "LayoutInflater.from(baseContext)");
            return new MarketingCSentWebViewActivity(from, this.write, false);
        }
    }

    public static final ContextWrapper MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "base");
        return new ContactUsActivity_ViewBinding(context, (byte) 0);
    }
}
