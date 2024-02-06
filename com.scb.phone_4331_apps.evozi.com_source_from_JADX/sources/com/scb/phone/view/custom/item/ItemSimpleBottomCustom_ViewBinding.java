package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemSimpleBottomCustom_ViewBinding implements Unbinder {
    private ItemSimpleBottomCustom MediaBrowserCompat$ItemReceiver;

    public ItemSimpleBottomCustom_ViewBinding(ItemSimpleBottomCustom itemSimpleBottomCustom, View view) {
        this.MediaBrowserCompat$ItemReceiver = itemSimpleBottomCustom;
        itemSimpleBottomCustom.componentLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_left, "field 'componentLabel'", TextView.class);
        itemSimpleBottomCustom.componentBottom = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_bottom, "field 'componentBottom'", TextView.class);
        itemSimpleBottomCustom.componentBottomExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_bottom_extra, "field 'componentBottomExtra'", TextView.class);
        itemSimpleBottomCustom.componentBottomExtraPSL = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_bottom_extra_PSL, "field 'componentBottomExtraPSL'", TextView.class);
        itemSimpleBottomCustom.componentBottomLong = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.list_label_bottom, "field 'componentBottomLong'", TextView.class);
        itemSimpleBottomCustom.iconAndLabelLayout = onStart.IconCompatParcelizer(view, R.id.ll_icon_and_label, "field 'iconAndLabelLayout'");
        itemSimpleBottomCustom.iconImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_icon_image, "field 'iconImage'", ImageView.class);
        itemSimpleBottomCustom.iconLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_icon_label, "field 'iconLabel'", TextView.class);
        itemSimpleBottomCustom.componentBottomPSL = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.list_label_bottom_PSL, "field 'componentBottomPSL'", TextView.class);
        itemSimpleBottomCustom.spaceBottom = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sp_space_bottom, "field 'spaceBottom'", Space.class);
        itemSimpleBottomCustom.spaceTop = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sp_space_top, "field 'spaceTop'", Space.class);
    }

    public final void read() {
        ItemSimpleBottomCustom itemSimpleBottomCustom = this.MediaBrowserCompat$ItemReceiver;
        if (itemSimpleBottomCustom != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            itemSimpleBottomCustom.componentLabel = null;
            itemSimpleBottomCustom.componentBottom = null;
            itemSimpleBottomCustom.componentBottomExtra = null;
            itemSimpleBottomCustom.componentBottomExtraPSL = null;
            itemSimpleBottomCustom.componentBottomLong = null;
            itemSimpleBottomCustom.iconAndLabelLayout = null;
            itemSimpleBottomCustom.iconImage = null;
            itemSimpleBottomCustom.iconLabel = null;
            itemSimpleBottomCustom.componentBottomPSL = null;
            itemSimpleBottomCustom.spaceBottom = null;
            itemSimpleBottomCustom.spaceTop = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
