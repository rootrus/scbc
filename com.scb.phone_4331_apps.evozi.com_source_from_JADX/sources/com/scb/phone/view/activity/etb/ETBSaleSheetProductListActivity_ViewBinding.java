package com.scb.phone.view.activity.etb;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class ETBSaleSheetProductListActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ETBSaleSheetProductListActivity MediaBrowserCompat$ItemReceiver;

    public ETBSaleSheetProductListActivity_ViewBinding(ETBSaleSheetProductListActivity eTBSaleSheetProductListActivity, View view) {
        super(eTBSaleSheetProductListActivity, view);
        this.MediaBrowserCompat$ItemReceiver = eTBSaleSheetProductListActivity;
        eTBSaleSheetProductListActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        eTBSaleSheetProductListActivity.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvTitle'", TextView.class);
    }

    public final void read() {
        ETBSaleSheetProductListActivity eTBSaleSheetProductListActivity = this.MediaBrowserCompat$ItemReceiver;
        if (eTBSaleSheetProductListActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            eTBSaleSheetProductListActivity.recyclerView = null;
            eTBSaleSheetProductListActivity.tvTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
