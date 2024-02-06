package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bulktransfer.BulkTransferGroupAdapter;
import com.scb.phone.view.adapter.bulktransfer.BulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver;
import p040o.Service;

/* renamed from: o.getCreditCardCategory */
public final /* synthetic */ class getCreditCardCategory implements View.OnClickListener {
    private final /* synthetic */ BulkTransferGroupAdapter IconCompatParcelizer;
    private final /* synthetic */ Service.State MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCreditCardCategory(BulkTransferGroupAdapter bulkTransferGroupAdapter, Service.State state) {
        this.IconCompatParcelizer = bulkTransferGroupAdapter;
        this.MediaBrowserCompat$ItemReceiver = state;
    }

    public final void onClick(View view) {
        BulkTransferGroupAdapter bulkTransferGroupAdapter = this.IconCompatParcelizer;
        Service.State state = this.MediaBrowserCompat$ItemReceiver;
        BulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver bulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver = bulkTransferGroupAdapter.write;
        if (bulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver != null) {
            bulkTransferGroupAdapter$MediaBrowserCompat$ItemReceiver.read(state.MediaBrowserCompat$ItemReceiver);
        }
    }
}
