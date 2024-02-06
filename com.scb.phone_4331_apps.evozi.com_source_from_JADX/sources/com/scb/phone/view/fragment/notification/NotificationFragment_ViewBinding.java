package com.scb.phone.view.fragment.notification;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class NotificationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NotificationFragment IconCompatParcelizer;

    public NotificationFragment_ViewBinding(NotificationFragment notificationFragment, View view) {
        super(notificationFragment, view);
        this.IconCompatParcelizer = notificationFragment;
        notificationFragment.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        notificationFragment.notificationRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.notification_recycler_view, "field 'notificationRecyclerView'", RecyclerView.class);
        notificationFragment.noMessageView = onStart.IconCompatParcelizer(view, R.id.no_message_layout, "field 'noMessageView'");
    }

    public final void read() {
        NotificationFragment notificationFragment = this.IconCompatParcelizer;
        if (notificationFragment != null) {
            this.IconCompatParcelizer = null;
            notificationFragment.scrollView = null;
            notificationFragment.notificationRecyclerView = null;
            notificationFragment.noMessageView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
