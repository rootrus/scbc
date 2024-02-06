package p040o;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: o.FatcaQuestionnaireCase$FatcaVerificationCodeException */
public final class FatcaQuestionnaireCase$FatcaVerificationCodeException implements DocumentInstructionsActivity {
    private final WeakReference<Context> MediaBrowserCompat$CustomActionResultReceiver;

    public FatcaQuestionnaireCase$FatcaVerificationCodeException(Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(context);
    }

    public final void read(FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindMerchantWalletSelectorFragment> fragmentBuilder_BindHowToAddFavouriteTopUpFragment, FragmentBuilder_BindIpoTabFragment fragmentBuilder_BindIpoTabFragment) {
        try {
            Class.forName("com.google.android.gms.security.ProviderInstaller");
            Context context = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (context == null || context.getMainLooper() == null) {
                fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_FAILURE_NO_CONTEXT);
            } else if (!new Handler(context.getMainLooper()).post(new C6483x68310245(context, fragmentBuilder_BindIpoTabFragment, fragmentBuilder_BindHowToAddFavouriteTopUpFragment))) {
                fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_THREAD_FAILURE);
            }
        } catch (ClassNotFoundException e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_NO_PROVIDER);
        } catch (Exception e2) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e2);
            fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletTransactionFragment.SECURITY_UPDATE_SSL_FAILURE);
        }
    }
}
