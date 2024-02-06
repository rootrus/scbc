package com.scb.phone.view.fragment.profilemanagement.manageaccounts;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.profilemanagement.AddedAccountManagementSuccessFooterCustomView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class AccountManagementSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AccountManagementSuccessFragment MediaBrowserCompat$ItemReceiver;

    public AccountManagementSuccessFragment_ViewBinding(AccountManagementSuccessFragment accountManagementSuccessFragment, View view) {
        super(accountManagementSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = accountManagementSuccessFragment;
        accountManagementSuccessFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        accountManagementSuccessFragment.footer = (AddedAccountManagementSuccessFooterCustomView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.footer, "field 'footer'", AddedAccountManagementSuccessFooterCustomView.class);
    }

    public final void read() {
        AccountManagementSuccessFragment accountManagementSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (accountManagementSuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            accountManagementSuccessFragment.recyclerView = null;
            accountManagementSuccessFragment.footer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
