package p040o;

import android.content.DialogInterface;

/* renamed from: o.registerMobileNumber */
public final /* synthetic */ class registerMobileNumber implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

    public /* synthetic */ registerMobileNumber(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.read();
    }
}
