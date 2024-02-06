package p040o;

import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: o.FragmentBuilder_BindDebitCardTransactionTabFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardTransactionTabFragment implements ImageProcessor.ImageOutListener {
    private final /* synthetic */ Image MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AddAccountConsentDeepLinkActivity write;

    public /* synthetic */ FragmentBuilder_BindDebitCardTransactionTabFragment(Image image, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = image;
        this.write = addAccountConsentDeepLinkActivity;
    }

    public final void imageOut(ImageProcessor.ImageOutEvent imageOutEvent) {
        FragmentBuilder_BindDepositSelectorFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, imageOutEvent);
    }
}
