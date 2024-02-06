package p040o;

import android.content.DialogInterface;

/* renamed from: o.setInteractiveAnimation */
public final /* synthetic */ class setInteractiveAnimation implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding write;

    public /* synthetic */ setInteractiveAnimation(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.write = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.read();
    }
}
