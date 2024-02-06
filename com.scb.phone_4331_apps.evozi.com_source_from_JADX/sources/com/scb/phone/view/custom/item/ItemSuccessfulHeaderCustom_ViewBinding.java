package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.MultiLineNoPaddingTextView;
import p040o.onStart;

public class ItemSuccessfulHeaderCustom_ViewBinding implements Unbinder {
    private ItemSuccessfulHeaderCustom MediaBrowserCompat$CustomActionResultReceiver;

    public ItemSuccessfulHeaderCustom_ViewBinding(ItemSuccessfulHeaderCustom itemSuccessfulHeaderCustom, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = itemSuccessfulHeaderCustom;
        itemSuccessfulHeaderCustom.componentTitle = (MultiLineNoPaddingTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.component_title, "field 'componentTitle'", MultiLineNoPaddingTextView.class);
        itemSuccessfulHeaderCustom.componentSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.component_subtitle, "field 'componentSubtitle'", TextView.class);
        itemSuccessfulHeaderCustom.componentExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.component_extra, "field 'componentExtra'", TextView.class);
        itemSuccessfulHeaderCustom.componentMoreExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.component_more_extra, "field 'componentMoreExtra'", TextView.class);
        itemSuccessfulHeaderCustom.componentIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.component_icon, "field 'componentIcon'", ImageView.class);
    }

    public void read() {
        ItemSuccessfulHeaderCustom itemSuccessfulHeaderCustom = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (itemSuccessfulHeaderCustom != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            itemSuccessfulHeaderCustom.componentTitle = null;
            itemSuccessfulHeaderCustom.componentSubtitle = null;
            itemSuccessfulHeaderCustom.componentExtra = null;
            itemSuccessfulHeaderCustom.componentMoreExtra = null;
            itemSuccessfulHeaderCustom.componentIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
