package com.scb.phone.view.custom.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomPreLoginMenuItem_ViewBinding implements Unbinder {
    private CustomPreLoginMenuItem IconCompatParcelizer;

    public CustomPreLoginMenuItem_ViewBinding(CustomPreLoginMenuItem customPreLoginMenuItem, View view) {
        this.IconCompatParcelizer = customPreLoginMenuItem;
        customPreLoginMenuItem.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        customPreLoginMenuItem.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
    }

    public final void read() {
        CustomPreLoginMenuItem customPreLoginMenuItem = this.IconCompatParcelizer;
        if (customPreLoginMenuItem != null) {
            this.IconCompatParcelizer = null;
            customPreLoginMenuItem.imageIcon = null;
            customPreLoginMenuItem.textTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
