package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CloseAccountAmountDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountAmountDetailsFragment write;

    public CloseAccountAmountDetailsFragment_ViewBinding(CloseAccountAmountDetailsFragment closeAccountAmountDetailsFragment, View view) {
        super(closeAccountAmountDetailsFragment, view);
        this.write = closeAccountAmountDetailsFragment;
        closeAccountAmountDetailsFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        CloseAccountAmountDetailsFragment closeAccountAmountDetailsFragment = this.write;
        if (closeAccountAmountDetailsFragment != null) {
            this.write = null;
            closeAccountAmountDetailsFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
