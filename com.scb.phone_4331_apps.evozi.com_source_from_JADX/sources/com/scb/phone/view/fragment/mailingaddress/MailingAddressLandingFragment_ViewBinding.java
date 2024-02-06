package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MailingAddressLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MailingAddressLandingFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public MailingAddressLandingFragment_ViewBinding(final MailingAddressLandingFragment mailingAddressLandingFragment, View view) {
        super(mailingAddressLandingFragment, view);
        this.MediaBrowserCompat$ItemReceiver = mailingAddressLandingFragment;
        mailingAddressLandingFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        mailingAddressLandingFragment.layoutEmptyAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_empty_accounts, "field 'layoutEmptyAccount'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.action_button, "field 'changeAddressButton' and method 'changeMailingAddress'");
        mailingAddressLandingFragment.changeAddressButton = (Button) onStart.write(IconCompatParcelizer, R.id.action_button, "field 'changeAddressButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressLandingFragment.this.changeMailingAddress();
            }
        });
        mailingAddressLandingFragment.layoutAccountList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_account_list, "field 'layoutAccountList'", LinearLayout.class);
    }

    public final void read() {
        MailingAddressLandingFragment mailingAddressLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        if (mailingAddressLandingFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mailingAddressLandingFragment.recyclerView = null;
            mailingAddressLandingFragment.layoutEmptyAccount = null;
            mailingAddressLandingFragment.changeAddressButton = null;
            mailingAddressLandingFragment.layoutAccountList = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
