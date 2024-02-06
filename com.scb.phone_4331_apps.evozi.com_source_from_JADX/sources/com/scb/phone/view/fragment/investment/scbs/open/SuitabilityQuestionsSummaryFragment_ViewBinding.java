package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class SuitabilityQuestionsSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SuitabilityQuestionsSummaryFragment MediaBrowserCompat$ItemReceiver;

    public SuitabilityQuestionsSummaryFragment_ViewBinding(SuitabilityQuestionsSummaryFragment suitabilityQuestionsSummaryFragment, View view) {
        super(suitabilityQuestionsSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = suitabilityQuestionsSummaryFragment;
        suitabilityQuestionsSummaryFragment.rvSuitabilitySummary = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_suitability, "field 'rvSuitabilitySummary'", RecyclerView.class);
    }

    public final void read() {
        SuitabilityQuestionsSummaryFragment suitabilityQuestionsSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (suitabilityQuestionsSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            suitabilityQuestionsSummaryFragment.rvSuitabilitySummary = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
