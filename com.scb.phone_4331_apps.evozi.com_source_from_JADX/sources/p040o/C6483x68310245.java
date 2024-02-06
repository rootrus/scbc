package p040o;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.security.ProviderInstaller;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FatcaQuestionnaireCase$FatcaVerificationCodeException$MediaBrowserCompat$CustomActionResultReceiver */
class C6483x68310245 implements Runnable, ProviderInstaller.ProviderInstallListener {
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindIpoTabFragment MediaBrowserCompat$ItemReceiver;
    private FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindMerchantWalletSelectorFragment> read;

    C6483x68310245(Context context, FragmentBuilder_BindIpoTabFragment fragmentBuilder_BindIpoTabFragment, FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindMerchantWalletSelectorFragment> fragmentBuilder_BindHowToAddFavouriteTopUpFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindIpoTabFragment;
        this.read = fragmentBuilder_BindHowToAddFavouriteTopUpFragment;
    }

    public final void run() {
        try {
            ProviderInstaller.installIfNeededAsync(this.MediaBrowserCompat$CustomActionResultReceiver, this);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            this.read.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_FAILURE);
        }
    }

    public final void onProviderInstallFailed(int i, Intent intent) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("ProviderInstaller error code: ");
        sb.append(i);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        this.read.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_PROVIDER_FAILURE);
    }

    public final void onProviderInstalled() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }
}
