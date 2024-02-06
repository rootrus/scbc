package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindPrepaidActivationInputFragment */
public final class FragmentBuilder_BindPrepaidActivationInputFragment implements onFlashLightClicked {
    public static final FragmentBuilder_BindPrepaidActivationInputFragment IconCompatParcelizer = new FragmentBuilder_BindPrepaidActivationInputFragment();
    private static BondErrorNoAccountsActivity write;

    private FragmentBuilder_BindPrepaidActivationInputFragment() {
    }

    public static BondErrorNoAccountsActivity IconCompatParcelizer() {
        return write;
    }

    public final void IconCompatParcelizer(Activity activity) {
        onGetStartedClick.write((Object) activity, "activity");
        try {
            if (write == null) {
                write = new BondErrorNoAccountsActivity(new BondPurchaseReviewActivity(), FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView());
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindPrepaidCashOutInputFragment.ERROR_CREATING_HIGHLIGHTER);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            BondErrorNoAccountsActivity bondErrorNoAccountsActivity = write;
            if (bondErrorNoAccountsActivity != null) {
                if (!(bondErrorNoAccountsActivity instanceof OnBoardingTutorialActivity_ViewBinding)) {
                    bondErrorNoAccountsActivity = null;
                }
                OnBoardingTutorialActivity_ViewBinding onBoardingTutorialActivity_ViewBinding = bondErrorNoAccountsActivity;
                if (onBoardingTutorialActivity_ViewBinding != null) {
                    onBoardingTutorialActivity_ViewBinding.disconnect();
                }
            }
            write = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindPrepaidCashOutInputFragment.ERROR_DESTROYING_HIGHLIGHTER);
        }
    }
}
