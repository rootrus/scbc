package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class UnlinkAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private UnlinkAccountFragment MediaBrowserCompat$ItemReceiver;

    public UnlinkAccountFragment_ViewBinding(UnlinkAccountFragment unlinkAccountFragment, View view) {
        super(unlinkAccountFragment, view);
        this.MediaBrowserCompat$ItemReceiver = unlinkAccountFragment;
        unlinkAccountFragment.accountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_icon, "field 'accountIcon'", ImageView.class);
        unlinkAccountFragment.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number, "field 'accountNumber'", TextView.class);
        unlinkAccountFragment.linkedAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linked_account_text, "field 'linkedAccount'", TextView.class);
        unlinkAccountFragment.linkedAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linked_account_type_text, "field 'linkedAccountType'", TextView.class);
        unlinkAccountFragment.linkedAccountNickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linked_account_nickname_text, "field 'linkedAccountNickname'", TextView.class);
        unlinkAccountFragment.unlinkButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unlink_button, "field 'unlinkButton'", Button.class);
        unlinkAccountFragment.payAlertToggle = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pay_alert_toggle, "field 'payAlertToggle'", CheckBox.class);
    }

    public final void read() {
        UnlinkAccountFragment unlinkAccountFragment = this.MediaBrowserCompat$ItemReceiver;
        if (unlinkAccountFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            unlinkAccountFragment.accountIcon = null;
            unlinkAccountFragment.accountNumber = null;
            unlinkAccountFragment.linkedAccount = null;
            unlinkAccountFragment.linkedAccountType = null;
            unlinkAccountFragment.linkedAccountNickname = null;
            unlinkAccountFragment.unlinkButton = null;
            unlinkAccountFragment.payAlertToggle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
