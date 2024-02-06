package p040o;

/* renamed from: o.FragmentBuilder_BindFundSourceListFragment */
public final /* synthetic */ class FragmentBuilder_BindFundSourceListFragment implements C6560xb325287a {
    private final /* synthetic */ FragmentBuilder_BindHmlBusinessInformationFragment write;

    public /* synthetic */ FragmentBuilder_BindFundSourceListFragment(FragmentBuilder_BindHmlBusinessInformationFragment fragmentBuilder_BindHmlBusinessInformationFragment) {
        this.write = fragmentBuilder_BindHmlBusinessInformationFragment;
    }

    public final void onStateChange(Object obj) {
        this.write.write = FragmentBuilder_BindPrepaidWalletTabFragment.write((OnBoardingTutorialActivity) obj).booleanValue();
    }
}
