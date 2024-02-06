package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomCheckBoxLayout_ViewBinding implements Unbinder {
    private CustomCheckBoxLayout write;

    public CustomCheckBoxLayout_ViewBinding(CustomCheckBoxLayout customCheckBoxLayout, View view) {
        this.write = customCheckBoxLayout;
        customCheckBoxLayout.rvCustomCheckBox = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_button_checkbox, "field 'rvCustomCheckBox'", RecyclerView.class);
        customCheckBoxLayout.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_message, "field 'errorMessage'", TextView.class);
    }

    public final void read() {
        CustomCheckBoxLayout customCheckBoxLayout = this.write;
        if (customCheckBoxLayout != null) {
            this.write = null;
            customCheckBoxLayout.rvCustomCheckBox = null;
            customCheckBoxLayout.errorMessage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
