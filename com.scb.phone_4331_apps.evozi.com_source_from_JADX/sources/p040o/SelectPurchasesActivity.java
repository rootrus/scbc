package p040o;

/* renamed from: o.SelectPurchasesActivity */
public final /* synthetic */ class SelectPurchasesActivity implements C6560xb325287a {
    private final /* synthetic */ ECouponDetailActivity_ViewBinding IconCompatParcelizer;

    public /* synthetic */ SelectPurchasesActivity(ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding) {
        this.IconCompatParcelizer = eCouponDetailActivity_ViewBinding;
    }

    public final void onStateChange(Object obj) {
        ECouponDetailActivity_ViewBinding eCouponDetailActivity_ViewBinding = this.IconCompatParcelizer;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        eCouponDetailActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindOnboardingInputAddressFragment.IconCompatParcelizer(onBoardingTutorialActivity);
        eCouponDetailActivity_ViewBinding.write = FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat(onBoardingTutorialActivity);
    }
}
