package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomCustomizePageItem_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CustomCustomizePageItem MediaBrowserCompat$ItemReceiver;

    public CustomCustomizePageItem_ViewBinding(final CustomCustomizePageItem customCustomizePageItem, View view) {
        this.MediaBrowserCompat$ItemReceiver = customCustomizePageItem;
        customCustomizePageItem.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'title'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.checkbox, "field 'checkBox' and method 'onToggleCheckedChanged'");
        customCustomizePageItem.checkBox = (CheckBox) onStart.write(IconCompatParcelizer, R.id.checkbox, "field 'checkBox'", CheckBox.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomCustomizePageItem.this.onToggleCheckedChanged();
            }
        });
        customCustomizePageItem.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description, "field 'description'", TextView.class);
        customCustomizePageItem.divider = onStart.IconCompatParcelizer(view, R.id.custom_cell_divider, "field 'divider'");
    }

    public final void read() {
        CustomCustomizePageItem customCustomizePageItem = this.MediaBrowserCompat$ItemReceiver;
        if (customCustomizePageItem != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customCustomizePageItem.title = null;
            customCustomizePageItem.checkBox = null;
            customCustomizePageItem.description = null;
            customCustomizePageItem.divider = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
