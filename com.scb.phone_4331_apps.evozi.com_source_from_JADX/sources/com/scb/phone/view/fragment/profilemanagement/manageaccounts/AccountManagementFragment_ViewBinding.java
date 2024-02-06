package com.scb.phone.view.fragment.profilemanagement.manageaccounts;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class AccountManagementFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AccountManagementFragment write;

    public AccountManagementFragment_ViewBinding(AccountManagementFragment accountManagementFragment, View view) {
        super(accountManagementFragment, view);
        this.write = accountManagementFragment;
        accountManagementFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        accountManagementFragment.layoutEmptyAccount = onStart.IconCompatParcelizer(view, R.id.layout_empty_account, "field 'layoutEmptyAccount'");
    }

    public final void read() {
        AccountManagementFragment accountManagementFragment = this.write;
        if (accountManagementFragment != null) {
            this.write = null;
            accountManagementFragment.recyclerView = null;
            accountManagementFragment.layoutEmptyAccount = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
