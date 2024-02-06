package p040o;

import java.io.File;

/* renamed from: o.FragmentBuilder_BindDeejungInstallmentsConfirmationFragment */
public final /* synthetic */ class FragmentBuilder_BindDeejungInstallmentsConfirmationFragment implements BondDeepLinkActivity {
    private final /* synthetic */ File IconCompatParcelizer;
    private final /* synthetic */ byte[] write;

    public /* synthetic */ FragmentBuilder_BindDeejungInstallmentsConfirmationFragment(byte[] bArr, File file) {
        this.write = bArr;
        this.IconCompatParcelizer = file;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.IconCompatParcelizer, addAccountConsentDeepLinkActivity);
    }
}
