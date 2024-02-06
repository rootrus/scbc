package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseBillersFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseBillersFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public BaseBillersFragment_ViewBinding(final BaseBillersFragment baseBillersFragment, View view) {
        super(baseBillersFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseBillersFragment;
        baseBillersFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billers_grid_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.empty_container_relative_layout, "field 'mEmptyCard' and method 'onEmptyLayoutClick'");
        baseBillersFragment.mEmptyCard = (RelativeLayout) onStart.write(IconCompatParcelizer, R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseBillersFragment.this.onEmptyLayoutClick();
            }
        });
        baseBillersFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        baseBillersFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        baseBillersFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        baseBillersFragment.mFooterView = onStart.IconCompatParcelizer(view, R.id.footer_view, "field 'mFooterView'");
        baseBillersFragment.mDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'mDividerView'");
    }

    public void read() {
        BaseBillersFragment baseBillersFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseBillersFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseBillersFragment.mRecyclerView = null;
            baseBillersFragment.mEmptyCard = null;
            baseBillersFragment.mEmptyTitle = null;
            baseBillersFragment.mEmptyDescription = null;
            baseBillersFragment.mEmptyImage = null;
            baseBillersFragment.mFooterView = null;
            baseBillersFragment.mDividerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
