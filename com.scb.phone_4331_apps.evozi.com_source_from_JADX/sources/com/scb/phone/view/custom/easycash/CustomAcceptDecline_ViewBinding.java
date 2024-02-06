package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomAcceptDecline_ViewBinding implements Unbinder {
    private CustomAcceptDecline IconCompatParcelizer;

    public CustomAcceptDecline_ViewBinding(CustomAcceptDecline customAcceptDecline, View view) {
        this.IconCompatParcelizer = customAcceptDecline;
        customAcceptDecline.radioGroup = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group, "field 'radioGroup'", RadioGroup.class);
        customAcceptDecline.radioAccept = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_accept, "field 'radioAccept'", RadioButton.class);
        customAcceptDecline.radioDecline = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_decline, "field 'radioDecline'", RadioButton.class);
        customAcceptDecline.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'titleTextView'", TextView.class);
        customAcceptDecline.navigationView = onStart.IconCompatParcelizer(view, R.id.navigation_view, "field 'navigationView'");
        customAcceptDecline.linkText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.link_text_view, "field 'linkText'", TextView.class);
    }

    public final void read() {
        CustomAcceptDecline customAcceptDecline = this.IconCompatParcelizer;
        if (customAcceptDecline != null) {
            this.IconCompatParcelizer = null;
            customAcceptDecline.radioGroup = null;
            customAcceptDecline.radioAccept = null;
            customAcceptDecline.radioDecline = null;
            customAcceptDecline.titleTextView = null;
            customAcceptDecline.navigationView = null;
            customAcceptDecline.linkText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
