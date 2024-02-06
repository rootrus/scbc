package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public final class HmlNTBSummaryFragment_ViewBinding extends HmlSummaryFragment_ViewBinding {
    private HmlNTBSummaryFragment MediaBrowserCompat$ItemReceiver;

    public HmlNTBSummaryFragment_ViewBinding(HmlNTBSummaryFragment hmlNTBSummaryFragment, View view) {
        super(hmlNTBSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlNTBSummaryFragment;
        hmlNTBSummaryFragment.step2Desc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step_2_desc, "field 'step2Desc'", TextView.class);
    }

    public final void read() {
        HmlNTBSummaryFragment hmlNTBSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlNTBSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlNTBSummaryFragment.step2Desc = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
