package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomTileToggle_ViewBinding implements Unbinder {
    private CustomTileToggle write;

    public CustomTileToggle_ViewBinding(CustomTileToggle customTileToggle, View view) {
        this.write = customTileToggle;
        customTileToggle.leftTile = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.left_tile, "field 'leftTile'", LinearLayout.class);
        customTileToggle.rightTile = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.right_tile, "field 'rightTile'", LinearLayout.class);
        customTileToggle.leftTileTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.left_tile_title, "field 'leftTileTitle'", TextView.class);
        customTileToggle.leftTileIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.left_tile_icon, "field 'leftTileIcon'", ImageView.class);
        customTileToggle.rightTileTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.right_tile_title, "field 'rightTileTitle'", TextView.class);
        customTileToggle.rightTileIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.right_tile_icon, "field 'rightTileIcon'", ImageView.class);
    }

    public final void read() {
        CustomTileToggle customTileToggle = this.write;
        if (customTileToggle != null) {
            this.write = null;
            customTileToggle.leftTile = null;
            customTileToggle.rightTile = null;
            customTileToggle.leftTileTitle = null;
            customTileToggle.leftTileIcon = null;
            customTileToggle.rightTileTitle = null;
            customTileToggle.rightTileIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
