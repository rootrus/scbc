package com.scb.phone.view.fragment.profilemanagement.accounts;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class AddAccountsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AddAccountsFragment write;

    public AddAccountsFragment_ViewBinding(AddAccountsFragment addAccountsFragment, View view) {
        super(addAccountsFragment, view);
        this.write = addAccountsFragment;
        addAccountsFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        addAccountsFragment.emptyContainer = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container, "field 'emptyContainer'", ViewGroup.class);
    }

    public final void read() {
        AddAccountsFragment addAccountsFragment = this.write;
        if (addAccountsFragment != null) {
            this.write = null;
            addAccountsFragment.recyclerView = null;
            addAccountsFragment.emptyContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
