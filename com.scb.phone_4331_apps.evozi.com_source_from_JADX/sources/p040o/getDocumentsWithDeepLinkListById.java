package p040o;

import android.content.DialogInterface;

/* renamed from: o.getDocumentsWithDeepLinkListById */
public final /* synthetic */ class getDocumentsWithDeepLinkListById implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding read;

    public /* synthetic */ getDocumentsWithDeepLinkListById(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.read = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.write();
    }
}
