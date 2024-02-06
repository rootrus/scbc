package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungInstallmentsReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungInstallmentsReviewFragment IconCompatParcelizer;

    public DeejungInstallmentsReviewFragment_ViewBinding(DeejungInstallmentsReviewFragment deejungInstallmentsReviewFragment, View view) {
        super(deejungInstallmentsReviewFragment, view);
        this.IconCompatParcelizer = deejungInstallmentsReviewFragment;
        deejungInstallmentsReviewFragment.reviewRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_deejung_review, "field 'reviewRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        DeejungInstallmentsReviewFragment deejungInstallmentsReviewFragment = this.IconCompatParcelizer;
        if (deejungInstallmentsReviewFragment != null) {
            this.IconCompatParcelizer = null;
            deejungInstallmentsReviewFragment.reviewRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
