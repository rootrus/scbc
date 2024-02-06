package p040o;

import android.content.Context;

/* renamed from: o.FragmentBuilder_BindDebitCardRequestInputFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardRequestInputFragment implements BondDeepLinkActivity {
    private final /* synthetic */ Context IconCompatParcelizer;
    private final /* synthetic */ boolean read;
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindDebitCardRequestInputFragment(boolean z, String str, Context context) {
        this.read = z;
        this.write = str;
        this.IconCompatParcelizer = context;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.write, this.IconCompatParcelizer, addAccountConsentDeepLinkActivity);
    }
}
