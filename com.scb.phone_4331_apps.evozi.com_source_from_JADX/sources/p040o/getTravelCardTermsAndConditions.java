package p040o;

import android.content.DialogInterface;

/* renamed from: o.getTravelCardTermsAndConditions */
public final /* synthetic */ class getTravelCardTermsAndConditions implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding write;

    public /* synthetic */ getTravelCardTermsAndConditions(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.write = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.read();
    }
}
