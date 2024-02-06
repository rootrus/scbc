package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class TransferTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferTabFragment write;

    public TransferTabFragment_ViewBinding(TransferTabFragment transferTabFragment, View view) {
        super(transferTabFragment, view);
        this.write = transferTabFragment;
        transferTabFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'scrollView'", NestedScrollView.class);
    }

    public final void read() {
        TransferTabFragment transferTabFragment = this.write;
        if (transferTabFragment != null) {
            this.write = null;
            transferTabFragment.scrollView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
