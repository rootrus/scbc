package com.scb.phone.view.custom.cardmanagement;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CustomStatementChannelViewComponent_ViewBinding implements Unbinder {
    private CustomStatementChannelViewComponent IconCompatParcelizer;

    public CustomStatementChannelViewComponent_ViewBinding(CustomStatementChannelViewComponent customStatementChannelViewComponent, View view) {
        this.IconCompatParcelizer = customStatementChannelViewComponent;
        customStatementChannelViewComponent.cbSelect = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_button, "field 'cbSelect'", RadioButton.class);
        customStatementChannelViewComponent.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        customStatementChannelViewComponent.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        customStatementChannelViewComponent.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        customStatementChannelViewComponent.fullDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'fullDivider'");
    }

    public final void read() {
        CustomStatementChannelViewComponent customStatementChannelViewComponent = this.IconCompatParcelizer;
        if (customStatementChannelViewComponent != null) {
            this.IconCompatParcelizer = null;
            customStatementChannelViewComponent.cbSelect = null;
            customStatementChannelViewComponent.tvTitle = null;
            customStatementChannelViewComponent.tvRemark = null;
            customStatementChannelViewComponent.divider = null;
            customStatementChannelViewComponent.fullDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
