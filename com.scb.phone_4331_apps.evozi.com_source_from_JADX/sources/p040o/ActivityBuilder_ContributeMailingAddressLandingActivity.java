package p040o;

import com.scb.phone.view.fragment.profilemanagement.promptpay.LinkAccountFragment;

/* renamed from: o.ActivityBuilder_ContributeMailingAddressLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMailingAddressLandingActivity implements FragmentBuilder_BindCategoriesListFragment {
    private final /* synthetic */ LinkAccountFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeMailingAddressLandingActivity(LinkAccountFragment linkAccountFragment) {
        this.IconCompatParcelizer = linkAccountFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        LinkAccountFragment linkAccountFragment = this.IconCompatParcelizer;
        linkAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((getBaseAddress) obj);
        linkAccountFragment.linkButton.setEnabled(true);
    }
}
