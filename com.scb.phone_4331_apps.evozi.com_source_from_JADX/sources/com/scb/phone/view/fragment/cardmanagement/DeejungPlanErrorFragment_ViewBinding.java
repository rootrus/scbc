package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungPlanErrorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungPlanErrorFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DeejungPlanErrorFragment_ViewBinding(DeejungPlanErrorFragment deejungPlanErrorFragment, View view) {
        super(deejungPlanErrorFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungPlanErrorFragment;
        deejungPlanErrorFragment.txvPlanErrorHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_plan_error_header, "field 'txvPlanErrorHeader'", TextView.class);
        deejungPlanErrorFragment.txvPlanErrorBody = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_plan_error_body, "field 'txvPlanErrorBody'", TextView.class);
        deejungPlanErrorFragment.btnDeejungReview = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_deejung_review, "field 'btnDeejungReview'", Button.class);
    }

    public final void read() {
        DeejungPlanErrorFragment deejungPlanErrorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (deejungPlanErrorFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            deejungPlanErrorFragment.txvPlanErrorHeader = null;
            deejungPlanErrorFragment.txvPlanErrorBody = null;
            deejungPlanErrorFragment.btnDeejungReview = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
