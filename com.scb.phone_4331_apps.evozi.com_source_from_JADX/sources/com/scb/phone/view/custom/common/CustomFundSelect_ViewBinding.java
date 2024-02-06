package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomFundSelect_ViewBinding implements Unbinder {
    private CustomFundSelect MediaBrowserCompat$CustomActionResultReceiver;

    public CustomFundSelect_ViewBinding(CustomFundSelect customFundSelect, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customFundSelect;
        customFundSelect.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_container, "field 'container'", RelativeLayout.class);
        customFundSelect.fundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_subtitle, "field 'fundCode'", TextView.class);
        customFundSelect.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_select_fund, "field 'icon'", ImageView.class);
        customFundSelect.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_description, "field 'description'", TextView.class);
        customFundSelect.fundInfo = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_info, "field 'fundInfo'", LinearLayout.class);
        customFundSelect.fundAvailableAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_available_amount, "field 'fundAvailableAmount'", TextView.class);
        customFundSelect.fundAvailableUnits = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_available_units, "field 'fundAvailableUnits'", TextView.class);
        customFundSelect.topDivider = onStart.IconCompatParcelizer(view, R.id.top_divider, "field 'topDivider'");
        customFundSelect.fundTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_fund_title_label, "field 'fundTitle'", TextView.class);
    }

    public final void read() {
        CustomFundSelect customFundSelect = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customFundSelect != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customFundSelect.container = null;
            customFundSelect.fundCode = null;
            customFundSelect.icon = null;
            customFundSelect.description = null;
            customFundSelect.fundInfo = null;
            customFundSelect.fundAvailableAmount = null;
            customFundSelect.fundAvailableUnits = null;
            customFundSelect.topDivider = null;
            customFundSelect.fundTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
