package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomInfoArrow_ViewBinding implements Unbinder {
    private CustomInfoArrow MediaBrowserCompat$CustomActionResultReceiver;

    public CustomInfoArrow_ViewBinding(CustomInfoArrow customInfoArrow, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customInfoArrow;
        customInfoArrow.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'titleTextView'", TextView.class);
        customInfoArrow.infoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.subtitle, "field 'infoTextView'", TextView.class);
        customInfoArrow.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description, "field 'descriptionTextView'", TextView.class);
        customInfoArrow.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
    }

    public final void read() {
        CustomInfoArrow customInfoArrow = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customInfoArrow != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customInfoArrow.titleTextView = null;
            customInfoArrow.infoTextView = null;
            customInfoArrow.descriptionTextView = null;
            customInfoArrow.divider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
