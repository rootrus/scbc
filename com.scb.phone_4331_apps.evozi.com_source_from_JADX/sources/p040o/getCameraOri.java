package p040o;

import android.content.DialogInterface;

/* renamed from: o.getCameraOri */
public final /* synthetic */ class getCameraOri implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

    public /* synthetic */ getCameraOri(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.read();
    }
}
