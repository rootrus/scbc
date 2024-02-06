package com.scb.phone.view.fragment.dji;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DeejungInstallmentTransactionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungInstallmentTransactionFragment write;

    public DeejungInstallmentTransactionFragment_ViewBinding(DeejungInstallmentTransactionFragment deejungInstallmentTransactionFragment, View view) {
        super(deejungInstallmentTransactionFragment, view);
        this.write = deejungInstallmentTransactionFragment;
        deejungInstallmentTransactionFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rvTransactions, "field 'mRecyclerView'", RecyclerView.class);
        deejungInstallmentTransactionFragment.mErrorImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivError, "field 'mErrorImageView'", ImageView.class);
        deejungInstallmentTransactionFragment.mErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorTitle, "field 'mErrorTitle'", TextView.class);
        deejungInstallmentTransactionFragment.mErrorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorDescription, "field 'mErrorDescription'", TextView.class);
        deejungInstallmentTransactionFragment.mErrorHolder = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.clError, "field 'mErrorHolder'", ConstraintLayout.class);
        deejungInstallmentTransactionFragment.mEligibleMoreHolder = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.llMore, "field 'mEligibleMoreHolder'", LinearLayout.class);
    }

    public final void read() {
        DeejungInstallmentTransactionFragment deejungInstallmentTransactionFragment = this.write;
        if (deejungInstallmentTransactionFragment != null) {
            this.write = null;
            deejungInstallmentTransactionFragment.mRecyclerView = null;
            deejungInstallmentTransactionFragment.mErrorImageView = null;
            deejungInstallmentTransactionFragment.mErrorTitle = null;
            deejungInstallmentTransactionFragment.mErrorDescription = null;
            deejungInstallmentTransactionFragment.mErrorHolder = null;
            deejungInstallmentTransactionFragment.mEligibleMoreHolder = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
