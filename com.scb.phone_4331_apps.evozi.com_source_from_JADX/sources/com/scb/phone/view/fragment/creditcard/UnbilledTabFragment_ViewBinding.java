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

public class UnbilledTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private UnbilledTabFragment MediaBrowserCompat$ItemReceiver;

    public UnbilledTabFragment_ViewBinding(final UnbilledTabFragment unbilledTabFragment, View view) {
        super(unbilledTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = unbilledTabFragment;
        unbilledTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_unbilled_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        unbilledTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_unbilled_error, "field 'mShowMessages'", TextView.class);
        unbilledTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        unbilledTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        unbilledTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.empty_button_image_view, "field 'mEmptyImage' and method 'onClick'");
        unbilledTabFragment.mEmptyImage = (ImageView) onStart.write(IconCompatParcelizer, R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                UnbilledTabFragment.this.onClick();
            }
        });
        unbilledTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        UnbilledTabFragment unbilledTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (unbilledTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            unbilledTabFragment.mRecyclerView = null;
            unbilledTabFragment.mShowMessages = null;
            unbilledTabFragment.mEmptyTitle = null;
            unbilledTabFragment.mEmptyCenterTitle = null;
            unbilledTabFragment.mEmptyDescription = null;
            unbilledTabFragment.mEmptyImage = null;
            unbilledTabFragment.mContainerRelativeLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
