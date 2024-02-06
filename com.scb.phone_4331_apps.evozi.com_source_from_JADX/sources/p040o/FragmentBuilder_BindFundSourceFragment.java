package p040o;

/* renamed from: o.FragmentBuilder_BindFundSourceFragment */
public final /* synthetic */ class FragmentBuilder_BindFundSourceFragment implements Runnable {
    private final /* synthetic */ FragmentBuilder_BindHmlETBSummaryFragment IconCompatParcelizer;
    private final /* synthetic */ FragmentBuilder_BindHmlETBSuccessFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FragmentBuilder_BindFundSourceFragment(FragmentBuilder_BindHmlETBSuccessFragment fragmentBuilder_BindHmlETBSuccessFragment, FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlETBSuccessFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlETBSummaryFragment;
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
