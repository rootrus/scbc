package com.scb.phone.view.activity.bankingagent;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ServiceAtBankingAgentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ServiceAtBankingAgentActivity write;

    public ServiceAtBankingAgentActivity_ViewBinding(final ServiceAtBankingAgentActivity serviceAtBankingAgentActivity, View view) {
        super(serviceAtBankingAgentActivity, view);
        this.write = serviceAtBankingAgentActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ll_qr_for_deposit, "method 'clickQRForDeposit'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ServiceAtBankingAgentActivity.this.clickQRForDeposit();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ll_qr_for_withdrawal, "method 'clickQRForWithdrawal'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ServiceAtBankingAgentActivity.this.clickQRForWithdrawal();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
