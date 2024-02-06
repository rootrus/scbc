package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class TopUpTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TopUpTabFragment IconCompatParcelizer;

    public TopUpTabFragment_ViewBinding(TopUpTabFragment topUpTabFragment, View view) {
        super(topUpTabFragment, view);
        this.IconCompatParcelizer = topUpTabFragment;
        topUpTabFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'scrollView'", NestedScrollView.class);
    }

    public final void read() {
        TopUpTabFragment topUpTabFragment = this.IconCompatParcelizer;
        if (topUpTabFragment != null) {
            this.IconCompatParcelizer = null;
            topUpTabFragment.scrollView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
