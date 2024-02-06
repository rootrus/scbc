package com.scb.phone.view.fragment.easycash.creditpower;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashCreditPowerInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private EasycashCreditPowerInformationFragment write;

    public EasycashCreditPowerInformationFragment_ViewBinding(final EasycashCreditPowerInformationFragment easycashCreditPowerInformationFragment, View view) {
        super(easycashCreditPowerInformationFragment, view);
        this.write = easycashCreditPowerInformationFragment;
        easycashCreditPowerInformationFragment.loanInfoRecycleView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_information_recycleview, "field 'loanInfoRecycleView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'onApplyLoan'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCreditPowerInformationFragment.this.onApplyLoan();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_reset, "method 'onReset'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCreditPowerInformationFragment.this.onReset();
            }
        });
    }

    public final void read() {
        EasycashCreditPowerInformationFragment easycashCreditPowerInformationFragment = this.write;
        if (easycashCreditPowerInformationFragment != null) {
            this.write = null;
            easycashCreditPowerInformationFragment.loanInfoRecycleView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
