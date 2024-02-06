package com.scb.phone.view.custom;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomInformationList_ViewBinding implements Unbinder {
    private CustomInformationList MediaBrowserCompat$CustomActionResultReceiver;

    public CustomInformationList_ViewBinding(CustomInformationList customInformationList, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customInformationList;
        customInformationList.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        customInformationList.vRecycler = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'vRecycler'", RecyclerView.class);
        customInformationList.vBottom = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_bottom_detail, "field 'vBottom'", RelativeLayout.class);
        customInformationList.tvBottomTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bottom_title, "field 'tvBottomTitle'", TextView.class);
        customInformationList.tvBottomDetail1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bottom_detail_1, "field 'tvBottomDetail1'", TextView.class);
        customInformationList.tvBottomDetail2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bottom_detail_2, "field 'tvBottomDetail2'", TextView.class);
    }

    public final void read() {
        CustomInformationList customInformationList = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInformationList != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customInformationList.tvTitle = null;
            customInformationList.vRecycler = null;
            customInformationList.vBottom = null;
            customInformationList.tvBottomTitle = null;
            customInformationList.tvBottomDetail1 = null;
            customInformationList.tvBottomDetail2 = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
