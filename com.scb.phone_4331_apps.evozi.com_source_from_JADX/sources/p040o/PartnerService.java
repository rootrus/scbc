package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.bond.BondInputFragment;

/* renamed from: o.PartnerService */
public final /* synthetic */ class PartnerService implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ BondInputFragment IconCompatParcelizer;

    public /* synthetic */ PartnerService(BondInputFragment bondInputFragment) {
        this.IconCompatParcelizer = bondInputFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Service service = this.IconCompatParcelizer.presenter.MediaBrowserCompat$ItemReceiver;
        service.MediaBrowserCompat$ItemReceiver = service.MediaBrowserCompat$MediaItem.get(i);
    }
}
