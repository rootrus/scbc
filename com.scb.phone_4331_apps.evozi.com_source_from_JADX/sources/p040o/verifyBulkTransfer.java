package p040o;

import android.view.View;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;
import com.scb.phone.view.fragment.hml.C6009x7f2cab88;

/* renamed from: o.verifyBulkTransfer */
public final /* synthetic */ class verifyBulkTransfer implements View.OnClickListener {
    private final /* synthetic */ HmlOutcomeCounterAdapter.UpsellOfferViewHolder IconCompatParcelizer;
    private final /* synthetic */ C6009x7f2cab88 write;

    public /* synthetic */ verifyBulkTransfer(HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder, C6009x7f2cab88 hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.IconCompatParcelizer = upsellOfferViewHolder;
        this.write = hmlOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void onClick(View view) {
        this.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.loanAmount.IconCompatParcelizer);
    }
}
