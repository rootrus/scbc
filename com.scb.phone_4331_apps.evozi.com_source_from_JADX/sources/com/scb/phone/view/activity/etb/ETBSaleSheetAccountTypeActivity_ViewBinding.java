package com.scb.phone.view.activity.etb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class ETBSaleSheetAccountTypeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ETBSaleSheetAccountTypeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ETBSaleSheetAccountTypeActivity_ViewBinding(ETBSaleSheetAccountTypeActivity eTBSaleSheetAccountTypeActivity, View view) {
        super(eTBSaleSheetAccountTypeActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = eTBSaleSheetAccountTypeActivity;
        eTBSaleSheetAccountTypeActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        ETBSaleSheetAccountTypeActivity eTBSaleSheetAccountTypeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (eTBSaleSheetAccountTypeActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            eTBSaleSheetAccountTypeActivity.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
