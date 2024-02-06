package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.accountdetail.ScbsProductAdapter;

/* renamed from: o.getCardTransactions */
public final /* synthetic */ class getCardTransactions implements View.OnClickListener {
    private final /* synthetic */ ScbsProductAdapter.ScbsProductViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getMarkerFile write;

    public /* synthetic */ getCardTransactions(ScbsProductAdapter.ScbsProductViewHolder scbsProductViewHolder, getMarkerFile getmarkerfile) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scbsProductViewHolder;
        this.write = getmarkerfile;
    }

    public final void onClick(View view) {
        ScbsProductAdapter.ScbsProductViewHolder scbsProductViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        ScbsProductAdapter.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.write);
    }
}
