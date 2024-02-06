package p040o;

import p040o.FragmentBuilder_BindOccupationListFragment;

/* renamed from: o.FragmentBuilder_BindOthersTabFragment */
public final class FragmentBuilder_BindOthersTabFragment {
    public int AlertController$RecycleListView;
    public int AppCompatActivity;
    public int AppCompatDelegateImpl$ListMenuDecorView;
    public int AppCompatDialogFragment;
    public boolean IconCompatParcelizer;
    public int Keep;
    public int MediaBrowserCompat$CustomActionResultReceiver = 3;
    public long MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public long MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f3149x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public SSYR2 MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public STBMV PlaybackStateCompat$CustomAction;
    public int RatingCompat;
    public boolean read;
    public int setBackgroundResource = -1;
    public int setCheckable;
    public int setContentView;
    public float setHasDecor;
    public DTRMM write;

    /* renamed from: o.FragmentBuilder_BindOthersTabFragment$write */
    public static final class write<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
        private /* synthetic */ FragmentBuilder_BindHmlNoDepositAccountFragment IconCompatParcelizer;

        public write(FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment) {
            this.IconCompatParcelizer = fragmentBuilder_BindHmlNoDepositAccountFragment;
        }

        public final Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity<OnBoardingTutorialActivity> fundActionsSuccessActivity) {
            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
            try {
                FragmentBuilder_BindHmlNoDepositAccountFragment fragmentBuilder_BindHmlNoDepositAccountFragment = this.IconCompatParcelizer;
                if (fragmentBuilder_BindHmlNoDepositAccountFragment == null) {
                    fragmentBuilder_BindHmlNoDepositAccountFragment = new FragmentBuilder_BindHmlNoDepositAccountFragment((FragmentBuilder_BindHmlNTBAccountConsentFragment) null, (FragmentBuilder_BindHmlOccupationInfoFragment) null, 255);
                }
                Object MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindOccupationListFragment.MediaMetadataCompat(fragmentBuilder_BindHmlNoDepositAccountFragment));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, "dispatcher\n            .…tion ?: Configuration()))");
                OnBoardingTutorialActivity invoke = fundActionsSuccessActivity.invoke();
                if (invoke == null) {
                    invoke = new OnBoardingTutorialActivity((byte) 0);
                }
                FragmentBuilder_BindHmlNTBAccountConsentFragment invoke2 = FragmentBuilder_BindOnboardingInputAddressFragment.MediaMetadataCompat().invoke(invoke);
                boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$ResultReceiverWrapper().invoke(invoke), (Object) Boolean.TRUE);
                if (invoke2 != FragmentBuilder_BindHmlNTBAccountConsentFragment.ADMIN_MODE) {
                    onGetStartedClick.IconCompatParcelizer(fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new C6865x419be8c4(FragmentBuilder_BindVerifyIdentityFragment.RUNTIME)), "dispatcher.dispatch(SdkM…ngeMode(SdkMode.RUNTIME))");
                    return MediaBrowserCompat$ItemReceiver;
                } else if (FragmentBuilder_BindTransferToOthersStep1Fragment.write().invoke(invoke) != FragmentBuilder_BindVerifyIdentityFragment.RUNTIME && MediaBrowserCompat$ItemReceiver2) {
                    return MediaBrowserCompat$ItemReceiver;
                } else {
                    fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(new C6865x419be8c4(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF));
                    return MediaBrowserCompat$ItemReceiver;
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressDetailsFragment.ERROR_UPDATING_CONFIGURATION);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
    }
}
