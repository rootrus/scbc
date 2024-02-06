package p040o;

import android.content.Context;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: o.FragmentBuilder_BindDeejungAboutFragment */
public final /* synthetic */ class FragmentBuilder_BindDeejungAboutFragment implements ImageProcessor.ImageOutListener {
    private final /* synthetic */ Image IconCompatParcelizer;
    private final /* synthetic */ Context MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AddAccountConsentDeepLinkActivity read;

    public /* synthetic */ FragmentBuilder_BindDeejungAboutFragment(Context context, String str, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity, Image image) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = addAccountConsentDeepLinkActivity;
        this.IconCompatParcelizer = image;
    }

    public final void imageOut(ImageProcessor.ImageOutEvent imageOutEvent) {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read, this.IconCompatParcelizer, imageOutEvent);
    }
}
