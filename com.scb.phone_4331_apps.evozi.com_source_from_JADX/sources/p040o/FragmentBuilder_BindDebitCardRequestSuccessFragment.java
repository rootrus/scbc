package p040o;

import android.content.Context;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: o.FragmentBuilder_BindDebitCardRequestSuccessFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitCardRequestSuccessFragment implements BondDeepLinkActivity {
    private final /* synthetic */ Image MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Context MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ BoundingTetragon read;
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindDebitCardRequestSuccessFragment(BoundingTetragon boundingTetragon, Context context, String str, Image image) {
        this.read = boundingTetragon;
        this.MediaBrowserCompat$ItemReceiver = context;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = image;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(this.read, this.MediaBrowserCompat$ItemReceiver, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, addAccountConsentDeepLinkActivity);
    }
}
