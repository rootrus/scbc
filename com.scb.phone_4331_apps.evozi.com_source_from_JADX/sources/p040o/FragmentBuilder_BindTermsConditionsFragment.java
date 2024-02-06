package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindTermsConditionsFragment */
public final class FragmentBuilder_BindTermsConditionsFragment implements onFlashLightClicked {
    private static FragmentBuilder_BindTempLimitReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    public static final FragmentBuilder_BindTermsConditionsFragment read = new FragmentBuilder_BindTermsConditionsFragment();

    private FragmentBuilder_BindTermsConditionsFragment() {
    }

    public final void IconCompatParcelizer(Activity activity) {
        onGetStartedClick.write((Object) activity, "activity");
        try {
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.setTitle();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.CREATE_ERROR);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            FragmentBuilder_BindTempLimitReviewFragment fragmentBuilder_BindTempLimitReviewFragment = MediaBrowserCompat$CustomActionResultReceiver;
            if (fragmentBuilder_BindTempLimitReviewFragment != null) {
                fragmentBuilder_BindTempLimitReviewFragment.read();
            }
            MediaBrowserCompat$CustomActionResultReceiver = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.DESTROY_ERROR);
        }
    }
}
