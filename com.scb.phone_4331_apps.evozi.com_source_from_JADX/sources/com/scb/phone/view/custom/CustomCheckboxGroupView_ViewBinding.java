package com.scb.phone.view.custom;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomCheckboxGroupView_ViewBinding implements Unbinder {
    private CustomCheckboxGroupView MediaBrowserCompat$CustomActionResultReceiver;

    public CustomCheckboxGroupView_ViewBinding(CustomCheckboxGroupView customCheckboxGroupView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCheckboxGroupView;
        customCheckboxGroupView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
        customCheckboxGroupView.mainCheckbox = (CustomCheckboxView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.main_checkbox, "field 'mainCheckbox'", CustomCheckboxView.class);
        customCheckboxGroupView.childrenContainer = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_children_container, "field 'childrenContainer'", RecyclerView.class);
        customCheckboxGroupView.childrenGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.children_group, "field 'childrenGroup'", Group.class);
    }

    public final void read() {
        CustomCheckboxGroupView customCheckboxGroupView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customCheckboxGroupView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customCheckboxGroupView.title = null;
            customCheckboxGroupView.mainCheckbox = null;
            customCheckboxGroupView.childrenContainer = null;
            customCheckboxGroupView.childrenGroup = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
