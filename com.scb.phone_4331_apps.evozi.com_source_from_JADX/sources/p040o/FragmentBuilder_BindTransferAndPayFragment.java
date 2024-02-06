package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindTransferAndPayFragment */
public final class FragmentBuilder_BindTransferAndPayFragment implements onFlashLightClicked {
    public static final FragmentBuilder_BindTransferAndPayFragment MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindTransferAndPayFragment();
    private static FragmentBuilder_BindTouchPointInputCidFragment MediaBrowserCompat$ItemReceiver;

    private FragmentBuilder_BindTransferAndPayFragment() {
    }

    public final void IconCompatParcelizer(Activity activity) {
        onGetStartedClick.write((Object) activity, "activity");
        try {
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.MenuItemImpl();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.PANEL_INIT_ERROR);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            FragmentBuilder_BindTouchPointInputCidFragment fragmentBuilder_BindTouchPointInputCidFragment = MediaBrowserCompat$ItemReceiver;
            if (fragmentBuilder_BindTouchPointInputCidFragment != null) {
                fragmentBuilder_BindTouchPointInputCidFragment.MediaBrowserCompat$CustomActionResultReceiver();
            }
            MediaBrowserCompat$ItemReceiver = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment.DESTROY_ERROR);
        }
    }
}
