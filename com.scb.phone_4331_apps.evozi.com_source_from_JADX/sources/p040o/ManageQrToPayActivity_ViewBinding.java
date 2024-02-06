package p040o;

import android.app.Activity;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.ManageQrToPayActivity_ViewBinding */
public final class ManageQrToPayActivity_ViewBinding implements OnBoardingTutorialActivity_ViewBinding {
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaBrowserCompat$MediaItem;
    private DeejungTransferLandingActivity MediaDescriptionCompat;
    onClickNextAction read;
    private int[] write;

    public ManageQrToPayActivity_ViewBinding() {
        this(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView());
    }

    private ManageQrToPayActivity_ViewBinding(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = false;
        this.MediaBrowserCompat$MediaItem = HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new ServiceAtBankingAgentCoachMarkActivity(this));
    }

    /* access modifiers changed from: package-private */
    public final HmlVerifyPhoneValidateOtpActivity MediaBrowserCompat$CustomActionResultReceiver(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        try {
            boolean MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindTopHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindPurchaseCreditCardInputFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
            this.write = new int[]{EasycashNcbCaseModule.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity), EasycashNcbCaseModule.read(onBoardingTutorialActivity)};
            if (MediaBrowserCompat$CustomActionResultReceiver2 && this.read == null && !this.MediaBrowserCompat$ItemReceiver && !this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.MediaDescriptionCompat = FragmentBuilder_BindTopHistoryFragment.IconCompatParcelizer(onBoardingTutorialActivity);
                Activity MediaBrowserCompat$CustomActionResultReceiver3 = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
                onClickNextAction onclicknextaction = new onClickNextAction(MediaBrowserCompat$CustomActionResultReceiver3);
                this.read = onclicknextaction;
                try {
                    onclicknextaction.IconCompatParcelizer = this.write[0];
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                }
                this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat.IconCompatParcelizer, false, this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
                read(MediaBrowserCompat$CustomActionResultReceiver3);
            } else if (MediaBrowserCompat$CustomActionResultReceiver2 && z && !this.MediaBrowserCompat$CustomActionResultReceiver) {
                Activity MediaBrowserCompat$CustomActionResultReceiver4 = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
                int i = this.write[1];
                this.read.write = this.MediaDescriptionCompat;
                this.read.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver4, this.MediaDescriptionCompat.IconCompatParcelizer, this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver, i);
                read(MediaBrowserCompat$CustomActionResultReceiver4);
            } else if (!MediaBrowserCompat$CustomActionResultReceiver2 && this.read != null && !this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.MediaDescriptionCompat = null;
                this.read.write = null;
                this.read.MediaBrowserCompat$ItemReceiver();
                this.read.disconnect();
                this.read = null;
            }
            this.MediaBrowserCompat$ItemReceiver = false;
            this.IconCompatParcelizer = false;
        } catch (Exception e2) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e2);
        }
        return null;
    }

    private void read(Activity activity) {
        if (this.read.MediaBrowserCompat$ItemReceiver != null) {
            this.read.MediaBrowserCompat$ItemReceiver.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name_container).setOnClickListener(new BondSelectionActivity_ViewBinding(this, activity));
        }
    }

    public final void disconnect() {
        try {
            if (this.read != null) {
                this.read.disconnect();
                this.read.MediaBrowserCompat$ItemReceiver();
            }
            if (this.MediaBrowserCompat$MediaItem != null) {
                this.MediaBrowserCompat$MediaItem.read();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        } catch (Throwable th) {
            this.read = null;
            this.MediaBrowserCompat$MediaItem = null;
            throw th;
        }
        this.read = null;
        this.MediaBrowserCompat$MediaItem = null;
    }
}
