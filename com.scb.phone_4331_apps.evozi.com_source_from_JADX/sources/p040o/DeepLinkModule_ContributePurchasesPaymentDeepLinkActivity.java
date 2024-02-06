package p040o;

import android.content.DialogInterface;

/* renamed from: o.DeepLinkModule_ContributePurchasesPaymentDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributePurchasesPaymentDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ DeepLinkModule_ContributePurchasesPaymentDeepLinkActivity(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }
}
