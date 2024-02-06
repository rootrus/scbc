package p040o;

import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: o.FragmentBuilder_BindDealsBuySuccessFragment */
public final /* synthetic */ class FragmentBuilder_BindDealsBuySuccessFragment implements ImageProcessor.AnalysisCompleteListener {
    private final /* synthetic */ Image read;
    private final /* synthetic */ AddAccountConsentDeepLinkActivity write;

    public /* synthetic */ FragmentBuilder_BindDealsBuySuccessFragment(Image image, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        this.read = image;
        this.write = addAccountConsentDeepLinkActivity;
    }

    public final void analysisComplete(ImageProcessor.AnalysisCompleteEvent analysisCompleteEvent) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.write, analysisCompleteEvent);
    }
}
