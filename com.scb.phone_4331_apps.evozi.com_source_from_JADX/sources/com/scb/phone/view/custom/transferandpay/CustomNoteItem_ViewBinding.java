package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomNoteItem_ViewBinding implements Unbinder {
    private CustomNoteItem write;

    public CustomNoteItem_ViewBinding(CustomNoteItem customNoteItem, View view) {
        this.write = customNoteItem;
        customNoteItem.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
        customNoteItem.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
        customNoteItem.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        customNoteItem.topSpace = onStart.IconCompatParcelizer(view, R.id.sp_space_top, "field 'topSpace'");
        customNoteItem.bottomSpace = onStart.IconCompatParcelizer(view, R.id.sp_space_bottom, "field 'bottomSpace'");
        customNoteItem.dividerSpace = onStart.IconCompatParcelizer(view, R.id.divider_space, "field 'dividerSpace'");
    }

    public final void read() {
        CustomNoteItem customNoteItem = this.write;
        if (customNoteItem != null) {
            this.write = null;
            customNoteItem.titleTextView = null;
            customNoteItem.descriptionTextView = null;
            customNoteItem.divider = null;
            customNoteItem.topSpace = null;
            customNoteItem.bottomSpace = null;
            customNoteItem.dividerSpace = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
