package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class LinkAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private LinkAccountFragment MediaBrowserCompat$ItemReceiver;

    public LinkAccountFragment_ViewBinding(LinkAccountFragment linkAccountFragment, View view) {
        super(linkAccountFragment, view);
        this.MediaBrowserCompat$ItemReceiver = linkAccountFragment;
        linkAccountFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.accounts_recycler_view, "field 'recyclerView'", RecyclerView.class);
        linkAccountFragment.accountNumberText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number, "field 'accountNumberText'", TextView.class);
        linkAccountFragment.accountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_icon, "field 'accountIcon'", ImageView.class);
        linkAccountFragment.linkButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.link_button, "field 'linkButton'", Button.class);
        linkAccountFragment.requestMoneyToggle = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.request_money_toggle, "field 'requestMoneyToggle'", CheckBox.class);
    }

    public final void read() {
        LinkAccountFragment linkAccountFragment = this.MediaBrowserCompat$ItemReceiver;
        if (linkAccountFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            linkAccountFragment.recyclerView = null;
            linkAccountFragment.accountNumberText = null;
            linkAccountFragment.accountIcon = null;
            linkAccountFragment.linkButton = null;
            linkAccountFragment.requestMoneyToggle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
