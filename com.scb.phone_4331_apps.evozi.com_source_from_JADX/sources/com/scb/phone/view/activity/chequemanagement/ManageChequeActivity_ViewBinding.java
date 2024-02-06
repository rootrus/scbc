package com.scb.phone.view.activity.chequemanagement;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class ManageChequeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ManageChequeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ManageChequeActivity_ViewBinding(ManageChequeActivity manageChequeActivity, View view) {
        super(manageChequeActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageChequeActivity;
        manageChequeActivity.menuRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cheque_menu_recycler_view, "field 'menuRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        ManageChequeActivity manageChequeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageChequeActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageChequeActivity.menuRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
