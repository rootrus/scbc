package p040o;

/* renamed from: o.FragmentBuilder_BindReceiveFragment$MediaSessionCompat$Token */
final class FragmentBuilder_BindReceiveFragment$MediaSessionCompat$Token extends CheckEligibilityActivity implements FundFactSheetActivity<OnBoardingTutorialActivity, FragmentBuilder_BindRegalQuestionnaireFragment> {
    public static final FragmentBuilder_BindReceiveFragment$MediaSessionCompat$Token write = new FragmentBuilder_BindReceiveFragment$MediaSessionCompat$Token();

    FragmentBuilder_BindReceiveFragment$MediaSessionCompat$Token() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        if (onBoardingTutorialActivity != null) {
            return onBoardingTutorialActivity.MediaBrowserCompat$ItemReceiver;
        }
        return null;
    }
}
