package p040o;

/* renamed from: o.DeejungTransferInstallmentOtpActivity */
public final /* synthetic */ class DeejungTransferInstallmentOtpActivity implements C6560xb325287a {
    private final /* synthetic */ ECouponCommonActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeejungTransferInstallmentOtpActivity(ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = eCouponCommonActivity_ViewBinding;
    }

    public final void onStateChange(Object obj) {
        ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        eCouponCommonActivity_ViewBinding.MediaSessionCompat$ResultReceiverWrapper = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$SearchResultReceiver(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.AlertController$RecycleListView = FragmentBuilder_BindOnboardingInputAddressFragment.RatingCompat(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.read = FragmentBuilder_BindReceiveFragment.IconCompatParcelizer(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindReceiveFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindPurchaseCreditCardFragment.read(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.MediaBrowserCompat$SearchResultReceiver = FragmentBuilder_BindSequentialSearchFragment.read(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.RatingCompat = FragmentBuilder_BindSequentialSearchFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.MediaSessionCompat$QueueItem = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$MediaItem(onBoardingTutorialActivity);
        String IconCompatParcelizer = FragmentBuilder_BindPrepaidTravelConversionSuccessFragment.IconCompatParcelizer(onBoardingTutorialActivity);
        eCouponCommonActivity_ViewBinding.Keep = IconCompatParcelizer;
        eCouponCommonActivity_ViewBinding.Keep = IconCompatParcelizer.isEmpty() ? null : eCouponCommonActivity_ViewBinding.Keep;
        eCouponCommonActivity_ViewBinding.MediaSessionCompat$Token = FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat(onBoardingTutorialActivity);
        boolean MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindPrepaidTravelConversionSuccessFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        boolean write = FragmentBuilder_BindReceiveFragment.write(onBoardingTutorialActivity);
        if (!(MediaBrowserCompat$ItemReceiver2 == eCouponCommonActivity_ViewBinding.IconCompatParcelizer && write == eCouponCommonActivity_ViewBinding.write) && !MediaBrowserCompat$ItemReceiver2 && !write && !eCouponCommonActivity_ViewBinding.f3133x50fd9e4a && !eCouponCommonActivity_ViewBinding.MediaBrowserCompat$MediaItem.isEmpty()) {
            eCouponCommonActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(eCouponCommonActivity_ViewBinding.MediaBrowserCompat$MediaItem.get(0));
        }
        eCouponCommonActivity_ViewBinding.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
        eCouponCommonActivity_ViewBinding.write = write;
        boolean write2 = FragmentBuilder_BindStopChequeInputFragment.write(onBoardingTutorialActivity);
        if (write2 != eCouponCommonActivity_ViewBinding.MediaDescriptionCompat.booleanValue()) {
            eCouponCommonActivity_ViewBinding.MediaDescriptionCompat = Boolean.valueOf(write2);
            if (Boolean.TRUE.equals(eCouponCommonActivity_ViewBinding.MediaDescriptionCompat)) {
                eCouponCommonActivity_ViewBinding.MediaMetadataCompat.clear();
                eCouponCommonActivity_ViewBinding.MediaBrowserCompat$MediaItem.clear();
            }
        }
    }
}
