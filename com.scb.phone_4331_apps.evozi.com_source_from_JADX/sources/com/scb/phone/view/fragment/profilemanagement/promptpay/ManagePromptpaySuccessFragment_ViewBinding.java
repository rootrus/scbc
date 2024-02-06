package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManagePromptpaySuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ManagePromptpaySuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public ManagePromptpaySuccessFragment_ViewBinding(final ManagePromptpaySuccessFragment managePromptpaySuccessFragment, View view) {
        super(managePromptpaySuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = managePromptpaySuccessFragment;
        managePromptpaySuccessFragment.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_title, "field 'titleText'", TextView.class);
        managePromptpaySuccessFragment.informationText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_information_text, "field 'informationText'", TextView.class);
        managePromptpaySuccessFragment.citizenNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_citizen_number, "field 'citizenNumber'", TextView.class);
        managePromptpaySuccessFragment.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_account_number, "field 'accountNumber'", TextView.class);
        managePromptpaySuccessFragment.accountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_account_name, "field 'accountName'", TextView.class);
        managePromptpaySuccessFragment.accountDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.manage_promptpay_account_details, "field 'accountDetails'", TextView.class);
        managePromptpaySuccessFragment.arrowIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.arrow_icon, "field 'arrowIcon'", ImageView.class);
        managePromptpaySuccessFragment.citizenIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.citizen_id_icon, "field 'citizenIcon'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.done_button, "method 'onReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManagePromptpaySuccessFragment.this.onReturnButton();
            }
        });
    }

    public final void read() {
        ManagePromptpaySuccessFragment managePromptpaySuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (managePromptpaySuccessFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            managePromptpaySuccessFragment.titleText = null;
            managePromptpaySuccessFragment.informationText = null;
            managePromptpaySuccessFragment.citizenNumber = null;
            managePromptpaySuccessFragment.accountNumber = null;
            managePromptpaySuccessFragment.accountName = null;
            managePromptpaySuccessFragment.accountDetails = null;
            managePromptpaySuccessFragment.arrowIcon = null;
            managePromptpaySuccessFragment.citizenIcon = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
