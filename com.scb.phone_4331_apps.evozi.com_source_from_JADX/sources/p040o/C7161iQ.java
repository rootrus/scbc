package p040o;

import android.content.DialogInterface;

/* renamed from: o.iQ */
public final /* synthetic */ class C7161iQ implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

    public /* synthetic */ C7161iQ(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }
}
