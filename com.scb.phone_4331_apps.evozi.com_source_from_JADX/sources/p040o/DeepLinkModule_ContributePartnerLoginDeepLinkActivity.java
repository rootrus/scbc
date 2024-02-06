package p040o;

import android.content.DialogInterface;

/* renamed from: o.DeepLinkModule_ContributePartnerLoginDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributePartnerLoginDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_ContributePartnerLoginDeepLinkActivity(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.write();
    }
}
