package p040o;

import android.content.DialogInterface;

/* renamed from: o.ActivityBuilder_BindGroupBillerActivity */
public final /* synthetic */ class ActivityBuilder_BindGroupBillerActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindGroupBillerActivity(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }
}
