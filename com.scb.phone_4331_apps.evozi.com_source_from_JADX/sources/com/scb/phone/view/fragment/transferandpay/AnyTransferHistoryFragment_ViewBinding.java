package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class AnyTransferHistoryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AnyTransferHistoryFragment write;

    public AnyTransferHistoryFragment_ViewBinding(AnyTransferHistoryFragment anyTransferHistoryFragment, View view) {
        super(anyTransferHistoryFragment, view);
        this.write = anyTransferHistoryFragment;
        anyTransferHistoryFragment.emptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'emptyCard'", RelativeLayout.class);
        anyTransferHistoryFragment.emptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'emptyTitle'", TextView.class);
        anyTransferHistoryFragment.emptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'emptyDescription'", TextView.class);
        anyTransferHistoryFragment.emptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'emptyImage'", ImageView.class);
        anyTransferHistoryFragment.noHistoryDescriptionView = onStart.IconCompatParcelizer(view, R.id.no_history_description_view, "field 'noHistoryDescriptionView'");
        anyTransferHistoryFragment.noHistoryDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_history_description_text_view, "field 'noHistoryDescriptionTextView'", TextView.class);
        anyTransferHistoryFragment.loadingView = onStart.IconCompatParcelizer(view, R.id.loading_view, "field 'loadingView'");
        anyTransferHistoryFragment.historyView = onStart.IconCompatParcelizer(view, R.id.view_history, "field 'historyView'");
        anyTransferHistoryFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_history, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        AnyTransferHistoryFragment anyTransferHistoryFragment = this.write;
        if (anyTransferHistoryFragment != null) {
            this.write = null;
            anyTransferHistoryFragment.emptyCard = null;
            anyTransferHistoryFragment.emptyTitle = null;
            anyTransferHistoryFragment.emptyDescription = null;
            anyTransferHistoryFragment.emptyImage = null;
            anyTransferHistoryFragment.noHistoryDescriptionView = null;
            anyTransferHistoryFragment.noHistoryDescriptionTextView = null;
            anyTransferHistoryFragment.loadingView = null;
            anyTransferHistoryFragment.historyView = null;
            anyTransferHistoryFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
