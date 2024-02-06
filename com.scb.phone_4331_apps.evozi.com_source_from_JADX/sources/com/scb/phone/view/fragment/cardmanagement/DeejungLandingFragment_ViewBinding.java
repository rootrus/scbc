package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DeejungLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DeejungLandingFragment write;

    public DeejungLandingFragment_ViewBinding(final DeejungLandingFragment deejungLandingFragment, View view) {
        super(deejungLandingFragment, view);
        this.write = deejungLandingFragment;
        deejungLandingFragment.btnDeejungReview = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_deejung_review, "field 'btnDeejungReview'", DefaultButton.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.layout_installment_plan, "method 'onClickOfSelectPurchases'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DeejungLandingFragment.this.onClickOfSelectPurchases();
            }
        });
    }

    public final void read() {
        DeejungLandingFragment deejungLandingFragment = this.write;
        if (deejungLandingFragment != null) {
            this.write = null;
            deejungLandingFragment.btnDeejungReview = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
