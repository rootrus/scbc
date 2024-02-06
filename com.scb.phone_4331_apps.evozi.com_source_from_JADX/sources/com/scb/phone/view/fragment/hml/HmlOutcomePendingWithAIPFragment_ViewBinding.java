package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlOutcomePendingWithAIPFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private HmlOutcomePendingWithAIPFragment write;

    public HmlOutcomePendingWithAIPFragment_ViewBinding(final HmlOutcomePendingWithAIPFragment hmlOutcomePendingWithAIPFragment, View view) {
        super(hmlOutcomePendingWithAIPFragment, view);
        this.write = hmlOutcomePendingWithAIPFragment;
        hmlOutcomePendingWithAIPFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_pending_date, "field 'dateText'", TextView.class);
        hmlOutcomePendingWithAIPFragment.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amount'", TextView.class);
        hmlOutcomePendingWithAIPFragment.repaymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_amount, "field 'repaymentAmount'", TextView.class);
        hmlOutcomePendingWithAIPFragment.repaymentTerm = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_term, "field 'repaymentTerm'", TextView.class);
        hmlOutcomePendingWithAIPFragment.installmentsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_installments, "field 'installmentsContainer'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomePendingWithAIPFragment.this.onButtonReturnHomeClicked(view);
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomePendingWithAIPFragment.this.onContactCallCenter(view);
            }
        });
    }

    public final void read() {
        HmlOutcomePendingWithAIPFragment hmlOutcomePendingWithAIPFragment = this.write;
        if (hmlOutcomePendingWithAIPFragment != null) {
            this.write = null;
            hmlOutcomePendingWithAIPFragment.dateText = null;
            hmlOutcomePendingWithAIPFragment.amount = null;
            hmlOutcomePendingWithAIPFragment.repaymentAmount = null;
            hmlOutcomePendingWithAIPFragment.repaymentTerm = null;
            hmlOutcomePendingWithAIPFragment.installmentsContainer = null;
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
