package com.scb.phone.view.custom.ntb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomInformationPanel_ViewBinding implements Unbinder {
    private CustomInformationPanel write;

    public CustomInformationPanel_ViewBinding(CustomInformationPanel customInformationPanel, View view) {
        this.write = customInformationPanel;
        customInformationPanel.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        customInformationPanel.labelTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'labelTitle'", TextView.class);
    }

    public final void read() {
        CustomInformationPanel customInformationPanel = this.write;
        if (customInformationPanel != null) {
            this.write = null;
            customInformationPanel.recyclerView = null;
            customInformationPanel.labelTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
