package com.scb.phone.view.fragment.ntb.fatca;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FatcaLandingQuestionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FatcaLandingQuestionFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public FatcaLandingQuestionFragment_ViewBinding(final FatcaLandingQuestionFragment fatcaLandingQuestionFragment, View view) {
        super(fatcaLandingQuestionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fatcaLandingQuestionFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FatcaLandingQuestionFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
