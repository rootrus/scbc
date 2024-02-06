package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DebitCardSuccessfulActivationFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private DebitCardSuccessfulActivationFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public DebitCardSuccessfulActivationFragment_ViewBinding(final DebitCardSuccessfulActivationFragment debitCardSuccessfulActivationFragment, View view) {
        super(debitCardSuccessfulActivationFragment, view);
        this.IconCompatParcelizer = debitCardSuccessfulActivationFragment;
        debitCardSuccessfulActivationFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardSuccessfulActivationFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        DebitCardSuccessfulActivationFragment debitCardSuccessfulActivationFragment = this.IconCompatParcelizer;
        if (debitCardSuccessfulActivationFragment != null) {
            this.IconCompatParcelizer = null;
            debitCardSuccessfulActivationFragment.tvRemark = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
