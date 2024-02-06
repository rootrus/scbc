package com.scb.phone.view.custom.ntb;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class NTBAdsDialog_ViewBinding implements Unbinder {
    private NTBAdsDialog write;

    public NTBAdsDialog_ViewBinding(NTBAdsDialog nTBAdsDialog, View view) {
        this.write = nTBAdsDialog;
        nTBAdsDialog.ivClose = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_close_ads, "field 'ivClose'", ImageView.class);
        nTBAdsDialog.doNotShowTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.do_not_show_text_view, "field 'doNotShowTextView'", TextView.class);
        nTBAdsDialog.lightCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.light_checkbox, "field 'lightCheckBox'", CheckBox.class);
        nTBAdsDialog.darkCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dark_checkbox, "field 'darkCheckBox'", CheckBox.class);
        nTBAdsDialog.ivAdsImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_ads, "field 'ivAdsImage'", ImageView.class);
    }

    public final void read() {
        NTBAdsDialog nTBAdsDialog = this.write;
        if (nTBAdsDialog != null) {
            this.write = null;
            nTBAdsDialog.ivClose = null;
            nTBAdsDialog.doNotShowTextView = null;
            nTBAdsDialog.lightCheckBox = null;
            nTBAdsDialog.darkCheckBox = null;
            nTBAdsDialog.ivAdsImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
