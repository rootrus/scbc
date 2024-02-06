package com.scb.phone.view.fragment.profilemanagement.accounts;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.profilemanagement.ReviewAccountFooterCustomView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ReviewAccountsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ReviewAccountsFragment write;

    public ReviewAccountsFragment_ViewBinding(ReviewAccountsFragment reviewAccountsFragment, View view) {
        super(reviewAccountsFragment, view);
        this.write = reviewAccountsFragment;
        reviewAccountsFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        reviewAccountsFragment.footer = (ReviewAccountFooterCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.footer, "field 'footer'", ReviewAccountFooterCustomView.class);
    }

    public final void read() {
        ReviewAccountsFragment reviewAccountsFragment = this.write;
        if (reviewAccountsFragment != null) {
            this.write = null;
            reviewAccountsFragment.recyclerView = null;
            reviewAccountsFragment.footer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
