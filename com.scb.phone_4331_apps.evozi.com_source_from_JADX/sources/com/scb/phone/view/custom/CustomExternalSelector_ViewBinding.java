package com.scb.phone.view.custom;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomExternalSelector_ViewBinding implements Unbinder {
    private CustomExternalSelector MediaBrowserCompat$ItemReceiver;

    public CustomExternalSelector_ViewBinding(CustomExternalSelector customExternalSelector, View view) {
        this.MediaBrowserCompat$ItemReceiver = customExternalSelector;
        customExternalSelector.labelTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'labelTitle'", TextView.class);
        customExternalSelector.selectedTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view_description, "field 'selectedTextView'", TextView.class);
        customExternalSelector.iconArrow = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_spinner_arrow, "field 'iconArrow'", TextView.class);
        customExternalSelector.container = onStart.IconCompatParcelizer(view, R.id.spinner_container, "field 'container'");
        customExternalSelector.mErrorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorTextView'", TextView.class);
    }

    public final void read() {
        CustomExternalSelector customExternalSelector = this.MediaBrowserCompat$ItemReceiver;
        if (customExternalSelector != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customExternalSelector.labelTitle = null;
            customExternalSelector.selectedTextView = null;
            customExternalSelector.iconArrow = null;
            customExternalSelector.container = null;
            customExternalSelector.mErrorTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
