package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DirectDebitInputMainFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DirectDebitInputMainFragment write;

    public DirectDebitInputMainFragment_ViewBinding(DirectDebitInputMainFragment directDebitInputMainFragment, View view) {
        super(directDebitInputMainFragment, view);
        this.write = directDebitInputMainFragment;
        directDebitInputMainFragment.billPaymentTabNestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_tab_nested_scrollview, "field 'billPaymentTabNestedScrollView'", NestedScrollView.class);
    }

    public final void read() {
        DirectDebitInputMainFragment directDebitInputMainFragment = this.write;
        if (directDebitInputMainFragment != null) {
            this.write = null;
            directDebitInputMainFragment.billPaymentTabNestedScrollView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
