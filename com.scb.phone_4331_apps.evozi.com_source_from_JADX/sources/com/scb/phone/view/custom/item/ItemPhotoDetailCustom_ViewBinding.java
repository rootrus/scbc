package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemPhotoDetailCustom_ViewBinding implements Unbinder {
    private ItemPhotoDetailCustom MediaBrowserCompat$CustomActionResultReceiver;

    public ItemPhotoDetailCustom_ViewBinding(ItemPhotoDetailCustom itemPhotoDetailCustom, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = itemPhotoDetailCustom;
        itemPhotoDetailCustom.componentLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_header_text_view, "field 'componentLabel'", TextView.class);
        itemPhotoDetailCustom.componentExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_title_text_view, "field 'componentExtra'", TextView.class);
        itemPhotoDetailCustom.componentExtraDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.second_text_view, "field 'componentExtraDetails'", TextView.class);
        itemPhotoDetailCustom.photo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.photo_left_image_view, "field 'photo'", ImageView.class);
    }

    public final void read() {
        ItemPhotoDetailCustom itemPhotoDetailCustom = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (itemPhotoDetailCustom != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            itemPhotoDetailCustom.componentLabel = null;
            itemPhotoDetailCustom.componentExtra = null;
            itemPhotoDetailCustom.componentExtraDetails = null;
            itemPhotoDetailCustom.photo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
