package p040o;

import p040o.FragmentBuilder_BindRiskSummaryFragment;

/* renamed from: o.FragmentBuilder_BindRequirePromptPayFragment */
public final /* synthetic */ class FragmentBuilder_BindRequirePromptPayFragment implements C6560xb325287a {
    private final /* synthetic */ FragmentBuilder_BindRiskReviewFragment read;

    public /* synthetic */ FragmentBuilder_BindRequirePromptPayFragment(FragmentBuilder_BindRiskReviewFragment fragmentBuilder_BindRiskReviewFragment) {
        this.read = fragmentBuilder_BindRiskReviewFragment;
    }

    public final void onStateChange(Object obj) {
        FragmentBuilder_BindRiskReviewFragment fragmentBuilder_BindRiskReviewFragment = this.read;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        boolean write = FragmentBuilder_BindStopChequeInputFragment.write(onBoardingTutorialActivity);
        if (write != fragmentBuilder_BindRiskReviewFragment.IconCompatParcelizer.booleanValue()) {
            fragmentBuilder_BindRiskReviewFragment.IconCompatParcelizer = Boolean.valueOf(write);
            if (Boolean.TRUE.equals(fragmentBuilder_BindRiskReviewFragment.IconCompatParcelizer)) {
                FragmentBuilder_BindSCBSLandingFragment fragmentBuilder_BindSCBSLandingFragment = fragmentBuilder_BindRiskReviewFragment.read;
                FragmentBuilder_BindReviewCommonFragment fragmentBuilder_BindReviewCommonFragment = FragmentBuilder_BindReviewCommonFragment.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) fragmentBuilder_BindSCBSLandingFragment, "$this$deleteAllRequests");
                onGetStartedClick.write((Object) fragmentBuilder_BindReviewCommonFragment, "callback");
                AlertController$RecycleListView.read(AlertController$RecycleListView.write((HmlPromptPayVerificationActivity) FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$CustomActionResultReceiver()), (HmlPromptPayVerificationActivity) null, new FragmentBuilder_BindRiskSummaryFragment.read(fragmentBuilder_BindSCBSLandingFragment, fragmentBuilder_BindReviewCommonFragment, (HmlNTBPromptPayNotFoundActivity) null), 3);
            }
        }
        fragmentBuilder_BindRiskReviewFragment.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindReceiveFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        fragmentBuilder_BindRiskReviewFragment.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindReceiveFragment.IconCompatParcelizer(onBoardingTutorialActivity);
    }
}
