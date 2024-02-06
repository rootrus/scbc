package p040o;

/* renamed from: o.DeejungTermsAndConditionsActivity */
public final /* synthetic */ class DeejungTermsAndConditionsActivity implements Runnable {
    private final /* synthetic */ FragmentBuilder_BindHowToAddFavouriteTopUpFragment IconCompatParcelizer;
    private final /* synthetic */ ECouponDetailActivity_ViewBinding read;

    public /* synthetic */ DeejungTermsAndConditionsActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding, FragmentBuilder_BindHowToAddFavouriteTopUpFragment fragmentBuilder_BindHowToAddFavouriteTopUpFragment) {
        this.read = eCouponDetailActivity_ViewBinding;
        this.IconCompatParcelizer = fragmentBuilder_BindHowToAddFavouriteTopUpFragment;
    }

    public final void run() {
        ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding = this.read;
        FragmentBuilder_BindHowToAddFavouriteTopUpFragment fragmentBuilder_BindHowToAddFavouriteTopUpFragment = this.IconCompatParcelizer;
        try {
            eCouponDetailActivity_ViewBinding.write();
            eCouponDetailActivity_ViewBinding.IconCompatParcelizer();
            if (fragmentBuilder_BindHowToAddFavouriteTopUpFragment != null) {
                fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(Boolean.TRUE);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMerchantWalletMoreInfoFragment.LOAD_ERROR);
            if (fragmentBuilder_BindHowToAddFavouriteTopUpFragment != null) {
                fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(Boolean.FALSE);
            }
        }
    }
}
