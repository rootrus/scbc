package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BilledTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BilledTabFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public BilledTabFragment_ViewBinding(final BilledTabFragment billedTabFragment, View view) {
        super(billedTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = billedTabFragment;
        billedTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        billedTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_billed_error, "field 'mShowMessages'", TextView.class);
        billedTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        billedTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.empty_button_image_view, "field 'mEmptyImage' and method 'onClick'");
        billedTabFragment.mEmptyImage = (ImageView) onStart.write(IconCompatParcelizer, R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BilledTabFragment.this.onClick();
            }
        });
        billedTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
        billedTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
    }

    public final void read() {
        BilledTabFragment billedTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (billedTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            billedTabFragment.mRecyclerView = null;
            billedTabFragment.mShowMessages = null;
            billedTabFragment.mEmptyTitle = null;
            billedTabFragment.mEmptyDescription = null;
            billedTabFragment.mEmptyImage = null;
            billedTabFragment.mContainerRelativeLayout = null;
            billedTabFragment.mEmptyCenterTitle = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
