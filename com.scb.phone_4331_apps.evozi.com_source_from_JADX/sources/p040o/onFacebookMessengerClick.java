package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ContactUsActivity;

/* renamed from: o.onFacebookMessengerClick */
public final class onFacebookMessengerClick {
    /* access modifiers changed from: private */
    public static onFacebookMessengerClick MediaMetadataCompat;
    public static final IconCompatParcelizer write = new IconCompatParcelizer((byte) 0);
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ContactUsActivity.CustomActionBar_ViewBinding> MediaBrowserCompat$ItemReceiver;
    public final boolean read;

    public static final write MediaBrowserCompat$ItemReceiver() {
        return IconCompatParcelizer.write();
    }

    public static final void MediaBrowserCompat$ItemReceiver(onFacebookMessengerClick onfacebookmessengerclick) {
        IconCompatParcelizer.IconCompatParcelizer(onfacebookmessengerclick);
    }

    private onFacebookMessengerClick(List<? extends ContactUsActivity.CustomActionBar_ViewBinding> list, boolean z, boolean z2, boolean z3) {
        this.IconCompatParcelizer = z;
        this.read = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z3;
        Collection MediaBrowserCompat$ItemReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list, new onTwitterClick());
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver2, "$this$toMutableList");
        this.MediaBrowserCompat$ItemReceiver = new ArrayList(MediaBrowserCompat$ItemReceiver2);
    }

    public /* synthetic */ onFacebookMessengerClick(List list, boolean z, boolean z2, boolean z3, byte b) {
        this(list, z, z2, false);
    }

    /* renamed from: o.onFacebookMessengerClick$write */
    public static final class write {
        private boolean IconCompatParcelizer = true;
        private boolean MediaBrowserCompat$ItemReceiver = true;
        public final List<ContactUsActivity.CustomActionBar_ViewBinding> write = new ArrayList();

        public final onFacebookMessengerClick MediaBrowserCompat$CustomActionResultReceiver() {
            return new onFacebookMessengerClick(HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write), this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, false, (byte) 0);
        }
    }

    /* renamed from: o.onFacebookMessengerClick$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        static {
            clickNext write = FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(IconCompatParcelizer.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"));
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static void IconCompatParcelizer(onFacebookMessengerClick onfacebookmessengerclick) {
            onFacebookMessengerClick.MediaMetadataCompat = onfacebookmessengerclick;
        }

        public static write write() {
            return new write();
        }
    }

    static {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    /* renamed from: o.onFacebookMessengerClick$read */
    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<CreditCardBilledDetailActivity> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new CreditCardBilledDetailActivity();
        }
    }
}
