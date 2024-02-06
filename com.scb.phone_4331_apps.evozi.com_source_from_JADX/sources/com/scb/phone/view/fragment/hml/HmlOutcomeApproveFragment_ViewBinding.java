package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOutcomeApproveFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlOutcomeApproveFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View write;

    public HmlOutcomeApproveFragment_ViewBinding(final HmlOutcomeApproveFragment hmlOutcomeApproveFragment, View view) {
        super(hmlOutcomeApproveFragment, view);
        this.IconCompatParcelizer = hmlOutcomeApproveFragment;
        hmlOutcomeApproveFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date, "field 'dateText'", TextView.class);
        hmlOutcomeApproveFragment.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_details_container, "field 'container'", LinearLayout.class);
        hmlOutcomeApproveFragment.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amount'", TextView.class);
        hmlOutcomeApproveFragment.repaymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_amount, "field 'repaymentAmount'", TextView.class);
        hmlOutcomeApproveFragment.approveHeader = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_outcome_approve_header, "field 'approveHeader'", ImageView.class);
        hmlOutcomeApproveFragment.amountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_amount_icon, "field 'amountIcon'", ImageView.class);
        hmlOutcomeApproveFragment.acceptSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_accept_subtitle, "field 'acceptSubtitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.MediaDescriptionCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeApproveFragment.this.onButtonReturnHomeClicked(view);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_button_decline, "method 'onButtonDeclineClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeApproveFragment.this.onButtonDeclineClicked(view);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_button_accept, "method 'onButtonAcceptClicked'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeApproveFragment.this.onButtonAcceptClicked(view);
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeApproveFragment.this.onContactCallCenter(view);
            }
        });
    }

    public final void read() {
        HmlOutcomeApproveFragment hmlOutcomeApproveFragment = this.IconCompatParcelizer;
        if (hmlOutcomeApproveFragment != null) {
            this.IconCompatParcelizer = null;
            hmlOutcomeApproveFragment.dateText = null;
            hmlOutcomeApproveFragment.container = null;
            hmlOutcomeApproveFragment.amount = null;
            hmlOutcomeApproveFragment.repaymentAmount = null;
            hmlOutcomeApproveFragment.approveHeader = null;
            hmlOutcomeApproveFragment.amountIcon = null;
            hmlOutcomeApproveFragment.acceptSubtitle = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
