package com.scb.phone.view.fragment.moreoptions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MoreOptionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MoreOptionsFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public MoreOptionsFragment_ViewBinding(final MoreOptionsFragment moreOptionsFragment, View view) {
        super(moreOptionsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = moreOptionsFragment;
        moreOptionsFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_options_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.logout_button, "method 'onLogoutButton'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MoreOptionsFragment.this.onLogoutButton();
            }
        });
    }

    public final void read() {
        MoreOptionsFragment moreOptionsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (moreOptionsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            moreOptionsFragment.mRecyclerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
