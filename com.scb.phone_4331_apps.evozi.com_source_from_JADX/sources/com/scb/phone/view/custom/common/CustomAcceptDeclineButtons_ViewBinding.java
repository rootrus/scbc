package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class CustomAcceptDeclineButtons_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private CustomAcceptDeclineButtons write;

    public CustomAcceptDeclineButtons_ViewBinding(final CustomAcceptDeclineButtons customAcceptDeclineButtons, View view) {
        this.write = customAcceptDeclineButtons;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_accept, "field 'btAccept' and method 'onAcceptClicked'");
        customAcceptDeclineButtons.btAccept = (Button) onStart.write(IconCompatParcelizer, R.id.bt_accept, "field 'btAccept'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomAcceptDeclineButtons.this.onAcceptClicked();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_decline, "field 'btDecline' and method 'onDeclineClicked'");
        customAcceptDeclineButtons.btDecline = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_decline, "field 'btDecline'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomAcceptDeclineButtons.this.onDeclineClicked();
            }
        });
        customAcceptDeclineButtons.tvLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_label, "field 'tvLabel'", TextView.class);
    }

    public final void read() {
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.write;
        if (customAcceptDeclineButtons != null) {
            this.write = null;
            customAcceptDeclineButtons.btAccept = null;
            customAcceptDeclineButtons.btDecline = null;
            customAcceptDeclineButtons.tvLabel = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
