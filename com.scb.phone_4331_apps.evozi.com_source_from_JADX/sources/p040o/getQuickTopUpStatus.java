package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferEmptyFragment;

/* renamed from: o.getQuickTopUpStatus */
public final /* synthetic */ class getQuickTopUpStatus implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BulkTransferEmptyFragment write;

    public /* synthetic */ getQuickTopUpStatus(BulkTransferEmptyFragment bulkTransferEmptyFragment) {
        this.write = bulkTransferEmptyFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        BulkTransferEmptyFragment bulkTransferEmptyFragment = this.write;
        bulkTransferEmptyFragment.overlayImageView.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(bulkTransferEmptyFragment.IconCompatParcelizer);
        bulkTransferEmptyFragment.relativeTutorial.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(bulkTransferEmptyFragment.IconCompatParcelizer);
    }
}
