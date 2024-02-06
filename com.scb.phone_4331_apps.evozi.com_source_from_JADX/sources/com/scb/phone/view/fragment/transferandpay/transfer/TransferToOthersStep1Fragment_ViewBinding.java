package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TransferToOthersStep1Fragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferToOthersStep1Fragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public TransferToOthersStep1Fragment_ViewBinding(final TransferToOthersStep1Fragment transferToOthersStep1Fragment, View view) {
        super(transferToOthersStep1Fragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = transferToOthersStep1Fragment;
        transferToOthersStep1Fragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        transferToOthersStep1Fragment.layoutError = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_error, "field 'layoutError'", ConstraintLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.iv_reload, "method 'onReloadClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferToOthersStep1Fragment.this.onReloadClick();
            }
        });
    }

    public final void read() {
        TransferToOthersStep1Fragment transferToOthersStep1Fragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferToOthersStep1Fragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            transferToOthersStep1Fragment.recyclerView = null;
            transferToOthersStep1Fragment.layoutError = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
