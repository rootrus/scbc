package com.scb.phone.view.fragment.parntner.nsip;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class NsipPaymentAddAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NsipPaymentAddAccountFragment IconCompatParcelizer;
    private View write;

    public NsipPaymentAddAccountFragment_ViewBinding(final NsipPaymentAddAccountFragment nsipPaymentAddAccountFragment, View view) {
        super(nsipPaymentAddAccountFragment, view);
        this.IconCompatParcelizer = nsipPaymentAddAccountFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btnAddAccount, "method 'navigateToAddAccountPage'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NsipPaymentAddAccountFragment.this.navigateToAddAccountPage();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
