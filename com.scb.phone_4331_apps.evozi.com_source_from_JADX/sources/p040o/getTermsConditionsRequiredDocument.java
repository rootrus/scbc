package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToOthersStep1Adapter;

/* renamed from: o.getTermsConditionsRequiredDocument */
public final /* synthetic */ class getTermsConditionsRequiredDocument implements View.OnClickListener {
    private final /* synthetic */ parseFile MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ TransferToOthersStep1Adapter.LocalViewHolder write;

    public /* synthetic */ getTermsConditionsRequiredDocument(TransferToOthersStep1Adapter.LocalViewHolder localViewHolder, parseFile parsefile) {
        this.write = localViewHolder;
        this.MediaBrowserCompat$ItemReceiver = parsefile;
    }

    public final void onClick(View view) {
        TransferToOthersStep1Adapter.LocalViewHolder localViewHolder = this.write;
        parseFile parsefile = this.MediaBrowserCompat$ItemReceiver;
        if (TransferToOthersStep1Adapter.this.MediaBrowserCompat$ItemReceiver != null) {
            TransferToOthersStep1Adapter.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(parsefile);
        }
    }
}
