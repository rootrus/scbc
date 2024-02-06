package com.scb.phone.view.custom.bulktransfer;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomEffectiveDate_ViewBinding implements Unbinder {
    private CustomEffectiveDate MediaBrowserCompat$ItemReceiver;

    public CustomEffectiveDate_ViewBinding(CustomEffectiveDate customEffectiveDate, View view) {
        this.MediaBrowserCompat$ItemReceiver = customEffectiveDate;
        customEffectiveDate.effectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_effective_date_text, "field 'effectiveDate'", TextView.class);
    }

    public final void read() {
        CustomEffectiveDate customEffectiveDate = this.MediaBrowserCompat$ItemReceiver;
        if (customEffectiveDate != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customEffectiveDate.effectiveDate = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
