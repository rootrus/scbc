package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemSimpleRightFocusCustom_ViewBinding implements Unbinder {
    private ItemSimpleRightFocusCustom IconCompatParcelizer;

    public ItemSimpleRightFocusCustom_ViewBinding(ItemSimpleRightFocusCustom itemSimpleRightFocusCustom, View view) {
        this.IconCompatParcelizer = itemSimpleRightFocusCustom;
        itemSimpleRightFocusCustom.componentLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_left, "field 'componentLabel'", TextView.class);
        itemSimpleRightFocusCustom.componentExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right, "field 'componentExtra'", TextView.class);
    }

    public final void read() {
        ItemSimpleRightFocusCustom itemSimpleRightFocusCustom = this.IconCompatParcelizer;
        if (itemSimpleRightFocusCustom != null) {
            this.IconCompatParcelizer = null;
            itemSimpleRightFocusCustom.componentLabel = null;
            itemSimpleRightFocusCustom.componentExtra = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
