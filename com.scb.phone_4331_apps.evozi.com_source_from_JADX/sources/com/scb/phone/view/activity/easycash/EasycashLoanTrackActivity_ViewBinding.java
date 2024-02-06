package com.scb.phone.view.activity.easycash;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class EasycashLoanTrackActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasycashLoanTrackActivity IconCompatParcelizer;

    public EasycashLoanTrackActivity_ViewBinding(EasycashLoanTrackActivity easycashLoanTrackActivity, View view) {
        super(easycashLoanTrackActivity, view);
        this.IconCompatParcelizer = easycashLoanTrackActivity;
        easycashLoanTrackActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_loan_track, "field 'recyclerView'", RecyclerView.class);
        easycashLoanTrackActivity.viewNoLoan = onStart.IconCompatParcelizer(view, R.id.view_no_loan, "field 'viewNoLoan'");
        easycashLoanTrackActivity.textNoLoan = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_loan_empty, "field 'textNoLoan'", TextView.class);
    }

    public final void read() {
        EasycashLoanTrackActivity easycashLoanTrackActivity = this.IconCompatParcelizer;
        if (easycashLoanTrackActivity != null) {
            this.IconCompatParcelizer = null;
            easycashLoanTrackActivity.recyclerView = null;
            easycashLoanTrackActivity.viewNoLoan = null;
            easycashLoanTrackActivity.textNoLoan = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
