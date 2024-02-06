package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class DirectDebitSuccessFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private DirectDebitSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public DirectDebitSuccessFragment_ViewBinding(final DirectDebitSuccessFragment directDebitSuccessFragment, View view) {
        super(directDebitSuccessFragment, view);
        this.IconCompatParcelizer = directDebitSuccessFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DirectDebitSuccessFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
