package p040o;

import android.content.DialogInterface;

/* renamed from: o.setMaritalStatus */
public final /* synthetic */ class setMaritalStatus implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setMaritalStatus(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.write();
    }
}
