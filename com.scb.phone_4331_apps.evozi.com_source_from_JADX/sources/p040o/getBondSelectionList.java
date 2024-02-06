package p040o;

import android.view.View;
import com.scb.phone.view.adapter.etb.ETBSaleSheetSubAccountAdapter;
import com.scb.phone.view.adapter.etb.ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getBondSelectionList */
public final /* synthetic */ class getBondSelectionList implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ETBSaleSheetSubAccountAdapter read;

    public /* synthetic */ getBondSelectionList(ETBSaleSheetSubAccountAdapter eTBSaleSheetSubAccountAdapter, int i) {
        this.read = eTBSaleSheetSubAccountAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        ETBSaleSheetSubAccountAdapter eTBSaleSheetSubAccountAdapter = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        ETBSaleSheetSubAccountAdapter.read read2 = eTBSaleSheetSubAccountAdapter.read;
        if (read2 != null) {
            read2.write((ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver) eTBSaleSheetSubAccountAdapter.write.get(i));
        }
    }
}
