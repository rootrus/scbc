package com.scb.phone.view.custom.bulktransfer;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomLimit;
import p040o.onStart;

public class CustomRecipientsList_ViewBinding implements Unbinder {
    private CustomRecipientsList MediaBrowserCompat$CustomActionResultReceiver;

    public CustomRecipientsList_ViewBinding(CustomRecipientsList customRecipientsList, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customRecipientsList;
        customRecipientsList.targetLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_label, "field 'targetLabel'", TextView.class);
        customRecipientsList.recipientsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipients_recycler_view, "field 'recipientsRecyclerView'", RecyclerView.class);
        customRecipientsList.customLimit = (CustomLimit) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_limit, "field 'customLimit'", CustomLimit.class);
    }

    public final void read() {
        CustomRecipientsList customRecipientsList = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customRecipientsList != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customRecipientsList.targetLabel = null;
            customRecipientsList.recipientsRecyclerView = null;
            customRecipientsList.customLimit = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
