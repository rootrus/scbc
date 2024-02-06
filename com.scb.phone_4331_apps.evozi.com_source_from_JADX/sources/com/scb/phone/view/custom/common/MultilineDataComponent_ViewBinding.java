package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class MultilineDataComponent_ViewBinding implements Unbinder {
    private MultilineDataComponent MediaBrowserCompat$CustomActionResultReceiver;

    public MultilineDataComponent_ViewBinding(MultilineDataComponent multilineDataComponent, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = multilineDataComponent;
        multilineDataComponent.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
        multilineDataComponent.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_icon, "field 'icon'", ImageView.class);
        multilineDataComponent.firstLine = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_first_line, "field 'firstLine'", TextView.class);
        multilineDataComponent.secondLine = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_second_line, "field 'secondLine'", TextView.class);
    }

    public final void read() {
        MultilineDataComponent multilineDataComponent = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (multilineDataComponent != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            multilineDataComponent.title = null;
            multilineDataComponent.icon = null;
            multilineDataComponent.firstLine = null;
            multilineDataComponent.secondLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
