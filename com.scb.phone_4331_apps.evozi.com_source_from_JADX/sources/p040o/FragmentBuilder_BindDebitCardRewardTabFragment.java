package p040o;

import android.content.Context;

/* renamed from: o.FragmentBuilder_BindDebitCardRewardTabFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardRewardTabFragment implements BondDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context read;

    public /* synthetic */ FragmentBuilder_BindDebitCardRewardTabFragment(String str, String str2, Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = context;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read, addAccountConsentDeepLinkActivity);
    }
}
