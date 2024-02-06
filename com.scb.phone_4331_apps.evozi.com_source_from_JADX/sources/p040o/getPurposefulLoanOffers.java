package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToOthersStep1Adapter;

/* renamed from: o.getPurposefulLoanOffers */
public final /* synthetic */ class getPurposefulLoanOffers implements View.OnClickListener {
    private final /* synthetic */ TransferToOthersStep1Adapter.LocalViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ parseFile MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getPurposefulLoanOffers(TransferToOthersStep1Adapter.LocalViewHolder localViewHolder, parseFile parsefile) {
        this.MediaBrowserCompat$CustomActionResultReceiver = localViewHolder;
        this.MediaBrowserCompat$ItemReceiver = parsefile;
    }

    public final void onClick(View view) {
        TransferToOthersStep1Adapter.LocalViewHolder localViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        parseFile parsefile = this.MediaBrowserCompat$ItemReceiver;
        if (TransferToOthersStep1Adapter.this.read != null) {
            TransferToOthersStep1Adapter.this.read.IconCompatParcelizer(parsefile);
        }
    }
}
