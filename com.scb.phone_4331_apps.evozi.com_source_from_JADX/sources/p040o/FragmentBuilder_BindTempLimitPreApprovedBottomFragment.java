package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindTempLimitPreApprovedBottomFragment */
public final class FragmentBuilder_BindTempLimitPreApprovedBottomFragment implements onFlashLightClicked {
    private static ManageQrToPayActivity_ViewBinding read;
    public static final FragmentBuilder_BindTempLimitPreApprovedBottomFragment write = new FragmentBuilder_BindTempLimitPreApprovedBottomFragment();

    private FragmentBuilder_BindTempLimitPreApprovedBottomFragment() {
    }

    public final void IconCompatParcelizer(Activity activity) {
        onGetStartedClick.write((Object) activity, "activity");
        if (read == null) {
            read = new ManageQrToPayActivity_ViewBinding();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ManageQrToPayActivity_ViewBinding manageQrToPayActivity_ViewBinding = read;
        if (manageQrToPayActivity_ViewBinding != null) {
            if (!(manageQrToPayActivity_ViewBinding instanceof OnBoardingTutorialActivity_ViewBinding)) {
                manageQrToPayActivity_ViewBinding = null;
            }
            OnBoardingTutorialActivity_ViewBinding onBoardingTutorialActivity_ViewBinding = manageQrToPayActivity_ViewBinding;
            if (onBoardingTutorialActivity_ViewBinding != null) {
                onBoardingTutorialActivity_ViewBinding.disconnect();
            }
        }
        read = null;
    }
}
