package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.EBillAdapter;

/* renamed from: o.getEasycashInstitutionsList */
public final /* synthetic */ class getEasycashInstitutionsList implements View.OnClickListener {
    private final /* synthetic */ EBillAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getEasycashInstitutionsList(EBillAdapter eBillAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = eBillAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        EBillAdapter eBillAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        eBillAdapter.write.read(this.MediaBrowserCompat$ItemReceiver);
    }
}
