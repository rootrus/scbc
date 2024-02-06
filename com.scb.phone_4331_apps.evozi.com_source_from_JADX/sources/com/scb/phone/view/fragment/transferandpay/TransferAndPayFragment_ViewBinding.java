package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TransferAndPayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferAndPayFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public TransferAndPayFragment_ViewBinding(final TransferAndPayFragment transferAndPayFragment, View view) {
        super(transferAndPayFragment, view);
        this.IconCompatParcelizer = transferAndPayFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_new, "method 'onNewTransactionClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferAndPayFragment.this.onNewTransactionClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_scan, "method 'onBarcodeScanClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferAndPayFragment.this.onBarcodeScanClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
