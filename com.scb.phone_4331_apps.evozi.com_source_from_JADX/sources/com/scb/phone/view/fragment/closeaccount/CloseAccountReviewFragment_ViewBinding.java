package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.closeaccount.AccountAmountCustomComponent;
import com.scb.phone.view.custom.common.MultilineDataComponent;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CloseAccountReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountReviewFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public CloseAccountReviewFragment_ViewBinding(final CloseAccountReviewFragment closeAccountReviewFragment, View view) {
        super(closeAccountReviewFragment, view);
        this.IconCompatParcelizer = closeAccountReviewFragment;
        closeAccountReviewFragment.closingAccountDataComponent = (MultilineDataComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.closing_account_data, "field 'closingAccountDataComponent'", MultilineDataComponent.class);
        closeAccountReviewFragment.depositTypeDataComponent = (MultilineDataComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_type_data, "field 'depositTypeDataComponent'", MultilineDataComponent.class);
        closeAccountReviewFragment.receivingAccountDataComponent = (MultilineDataComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.receiving_account_data, "field 'receivingAccountDataComponent'", MultilineDataComponent.class);
        closeAccountReviewFragment.closingAccountAmountDataComponent = (AccountAmountCustomComponent) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.closing_account_amount_data, "field 'closingAccountAmountDataComponent'", AccountAmountCustomComponent.class);
        closeAccountReviewFragment.extraInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_extra_info, "field 'extraInfo'", TextView.class);
        closeAccountReviewFragment.contactInformationTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_contact_information, "field 'contactInformationTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_confirm, "method 'onConfirmClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountReviewFragment.this.onConfirmClicked();
            }
        });
    }

    public final void read() {
        CloseAccountReviewFragment closeAccountReviewFragment = this.IconCompatParcelizer;
        if (closeAccountReviewFragment != null) {
            this.IconCompatParcelizer = null;
            closeAccountReviewFragment.closingAccountDataComponent = null;
            closeAccountReviewFragment.depositTypeDataComponent = null;
            closeAccountReviewFragment.receivingAccountDataComponent = null;
            closeAccountReviewFragment.closingAccountAmountDataComponent = null;
            closeAccountReviewFragment.extraInfo = null;
            closeAccountReviewFragment.contactInformationTextView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
