package com.scb.phone.view.custom;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomCheckboxView_ViewBinding implements Unbinder {
    private CustomCheckboxView MediaBrowserCompat$ItemReceiver;

    public CustomCheckboxView_ViewBinding(CustomCheckboxView customCheckboxView, View view) {
        this.MediaBrowserCompat$ItemReceiver = customCheckboxView;
        customCheckboxView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
        customCheckboxView.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle, "field 'subtitle'", TextView.class);
        customCheckboxView.toggleView = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_toggle_view, "field 'toggleView'", CheckBox.class);
    }

    public final void read() {
        CustomCheckboxView customCheckboxView = this.MediaBrowserCompat$ItemReceiver;
        if (customCheckboxView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customCheckboxView.title = null;
            customCheckboxView.subtitle = null;
            customCheckboxView.toggleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
