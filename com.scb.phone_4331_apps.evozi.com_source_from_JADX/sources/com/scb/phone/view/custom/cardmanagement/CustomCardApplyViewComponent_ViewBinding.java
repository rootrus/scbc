package com.scb.phone.view.custom.cardmanagement;

import android.view.View;
import android.widget.CheckBox;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomCardApplyViewComponent_ViewBinding implements Unbinder {
    private CustomCardApplyViewComponent MediaBrowserCompat$ItemReceiver;

    public CustomCardApplyViewComponent_ViewBinding(CustomCardApplyViewComponent customCardApplyViewComponent, View view) {
        this.MediaBrowserCompat$ItemReceiver = customCardApplyViewComponent;
        customCardApplyViewComponent.ckbCardName = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ckb_card_name, "field 'ckbCardName'", CheckBox.class);
        customCardApplyViewComponent.fullDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'fullDivider'");
        customCardApplyViewComponent.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
    }

    public final void read() {
        CustomCardApplyViewComponent customCardApplyViewComponent = this.MediaBrowserCompat$ItemReceiver;
        if (customCardApplyViewComponent != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customCardApplyViewComponent.ckbCardName = null;
            customCardApplyViewComponent.fullDivider = null;
            customCardApplyViewComponent.divider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
