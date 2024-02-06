package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomEasyCashSectionLabel_ViewBinding implements Unbinder {
    private CustomEasyCashSectionLabel IconCompatParcelizer;

    public CustomEasyCashSectionLabel_ViewBinding(CustomEasyCashSectionLabel customEasyCashSectionLabel, View view) {
        this.IconCompatParcelizer = customEasyCashSectionLabel;
        customEasyCashSectionLabel.topDivider = onStart.IconCompatParcelizer(view, R.id.top_divider, "field 'topDivider'");
        customEasyCashSectionLabel.textView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_view, "field 'textView'", TextView.class);
        customEasyCashSectionLabel.bottomDivider = onStart.IconCompatParcelizer(view, R.id.bottom_divider, "field 'bottomDivider'");
    }

    public final void read() {
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.IconCompatParcelizer;
        if (customEasyCashSectionLabel != null) {
            this.IconCompatParcelizer = null;
            customEasyCashSectionLabel.topDivider = null;
            customEasyCashSectionLabel.textView = null;
            customEasyCashSectionLabel.bottomDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
