package p040o;

import android.content.DialogInterface;

/* renamed from: o.ActivityBuilder_ContributePrepaidSuccessfulActivationActivity */
public final /* synthetic */ class ActivityBuilder_ContributePrepaidSuccessfulActivationActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributePrepaidSuccessfulActivationActivity(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }
}
