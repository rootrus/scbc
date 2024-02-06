package com.scb.phone.view.activity.prepaid;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class AddNewCurrencyActivity_ViewBinding extends BaseActivity_ViewBinding {
    private AddNewCurrencyActivity write;

    public AddNewCurrencyActivity_ViewBinding(AddNewCurrencyActivity addNewCurrencyActivity, View view) {
        super(addNewCurrencyActivity, view);
        this.write = addNewCurrencyActivity;
        addNewCurrencyActivity.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_currency_list, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        AddNewCurrencyActivity addNewCurrencyActivity = this.write;
        if (addNewCurrencyActivity != null) {
            this.write = null;
            addNewCurrencyActivity.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
