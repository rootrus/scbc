package p040o;

import android.content.Context;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: o.FragmentBuilder_BindDebitCardMarketConductFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardMarketConductFragment implements ImageProcessor.ImageOutListener {
    private final /* synthetic */ AddAccountConsentDeepLinkActivity IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Context MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Image write;

    public /* synthetic */ FragmentBuilder_BindDebitCardMarketConductFragment(Context context, String str, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity, Image image) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = addAccountConsentDeepLinkActivity;
        this.write = image;
    }

    public final void imageOut(ImageProcessor.ImageOutEvent imageOutEvent) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.write, imageOutEvent);
    }
}
