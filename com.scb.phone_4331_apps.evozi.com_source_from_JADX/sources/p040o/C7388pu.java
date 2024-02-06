package p040o;

import android.content.DialogInterface;

/* renamed from: o.pu */
public final /* synthetic */ class C7388pu implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding write;

    public /* synthetic */ C7388pu(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.write = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.write();
    }
}
