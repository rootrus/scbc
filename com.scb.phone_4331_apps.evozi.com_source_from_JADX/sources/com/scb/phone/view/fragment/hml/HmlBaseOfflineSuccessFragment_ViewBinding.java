package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBaseOfflineSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private HmlBaseOfflineSuccessFragment write;

    public HmlBaseOfflineSuccessFragment_ViewBinding(final HmlBaseOfflineSuccessFragment hmlBaseOfflineSuccessFragment, View view) {
        super(hmlBaseOfflineSuccessFragment, view);
        this.write = hmlBaseOfflineSuccessFragment;
        hmlBaseOfflineSuccessFragment.successTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_success_title, "field 'successTitle'", TextView.class);
        hmlBaseOfflineSuccessFragment.confirmDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'confirmDateTime'", TextView.class);
        hmlBaseOfflineSuccessFragment.remarkInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark_info, "field 'remarkInfo'", TextView.class);
        hmlBaseOfflineSuccessFragment.loanInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_info, "field 'loanInfo'", TextView.class);
        hmlBaseOfflineSuccessFragment.registerRemarks = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_continue_to_register, "field 'registerRemarks'", TextView.class);
        hmlBaseOfflineSuccessFragment.registerBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_register_scbs, "field 'registerBtn'", Button.class);
        hmlBaseOfflineSuccessFragment.homeBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_home, "field 'homeBtn'", Button.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_contact_call, "method 'onContactCallClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseOfflineSuccessFragment.this.onContactCallClick();
            }
        });
    }

    public void read() {
        HmlBaseOfflineSuccessFragment hmlBaseOfflineSuccessFragment = this.write;
        if (hmlBaseOfflineSuccessFragment != null) {
            this.write = null;
            hmlBaseOfflineSuccessFragment.successTitle = null;
            hmlBaseOfflineSuccessFragment.confirmDateTime = null;
            hmlBaseOfflineSuccessFragment.remarkInfo = null;
            hmlBaseOfflineSuccessFragment.loanInfo = null;
            hmlBaseOfflineSuccessFragment.registerRemarks = null;
            hmlBaseOfflineSuccessFragment.registerBtn = null;
            hmlBaseOfflineSuccessFragment.homeBtn = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
