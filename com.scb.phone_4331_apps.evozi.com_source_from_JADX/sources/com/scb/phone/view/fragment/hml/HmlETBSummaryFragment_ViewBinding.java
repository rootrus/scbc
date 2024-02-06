package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public final class HmlETBSummaryFragment_ViewBinding extends HmlSummaryFragment_ViewBinding {
    private HmlETBSummaryFragment IconCompatParcelizer;

    public HmlETBSummaryFragment_ViewBinding(HmlETBSummaryFragment hmlETBSummaryFragment, View view) {
        super(hmlETBSummaryFragment, view);
        this.IconCompatParcelizer = hmlETBSummaryFragment;
        hmlETBSummaryFragment.step1Image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_step1, "field 'step1Image'", ImageView.class);
        hmlETBSummaryFragment.step1Text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step, "field 'step1Text'", TextView.class);
        hmlETBSummaryFragment.step1Description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step_1_desc, "field 'step1Description'", TextView.class);
        hmlETBSummaryFragment.step2Desc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step_2_desc, "field 'step2Desc'", TextView.class);
        hmlETBSummaryFragment.step3Text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step3, "field 'step3Text'", TextView.class);
        hmlETBSummaryFragment.step3Description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step_3_desc, "field 'step3Description'", TextView.class);
        hmlETBSummaryFragment.step4Text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_step4, "field 'step4Text'", TextView.class);
    }

    public final void read() {
        HmlETBSummaryFragment hmlETBSummaryFragment = this.IconCompatParcelizer;
        if (hmlETBSummaryFragment != null) {
            this.IconCompatParcelizer = null;
            hmlETBSummaryFragment.step1Image = null;
            hmlETBSummaryFragment.step1Text = null;
            hmlETBSummaryFragment.step1Description = null;
            hmlETBSummaryFragment.step2Desc = null;
            hmlETBSummaryFragment.step3Text = null;
            hmlETBSummaryFragment.step3Description = null;
            hmlETBSummaryFragment.step4Text = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
