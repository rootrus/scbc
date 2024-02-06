package p040o;

import android.content.Context;

/* renamed from: o.FragmentBuilder_BindDeejungLandingFragment */
public final /* synthetic */ class FragmentBuilder_BindDeejungLandingFragment implements BondDeepLinkActivity {
    private final /* synthetic */ String read;
    private final /* synthetic */ Context write;

    public /* synthetic */ FragmentBuilder_BindDeejungLandingFragment(String str, Context context) {
        this.read = str;
        this.write = context;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.read(this.read, this.write, addAccountConsentDeepLinkActivity);
    }
}
