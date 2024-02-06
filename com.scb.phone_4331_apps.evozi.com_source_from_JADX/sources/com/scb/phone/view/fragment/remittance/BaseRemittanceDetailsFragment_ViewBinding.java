package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseRemittanceDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseRemittanceDetailsFragment IconCompatParcelizer;

    public BaseRemittanceDetailsFragment_ViewBinding(BaseRemittanceDetailsFragment baseRemittanceDetailsFragment, View view) {
        super(baseRemittanceDetailsFragment, view);
        this.IconCompatParcelizer = baseRemittanceDetailsFragment;
        baseRemittanceDetailsFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_review_source, "field 'customSource'", CustomTransferAndPaySource.class);
        baseRemittanceDetailsFragment.customTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_review_target, "field 'customTarget'", CustomTransferAndPayTarget.class);
        baseRemittanceDetailsFragment.customConversionRate = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_conversion_rate, "field 'customConversionRate'", CustomTransferAndPayItem.class);
        baseRemittanceDetailsFragment.customAmountToSendLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_amount_to_send, "field 'customAmountToSendLayout'", LinearLayout.class);
        baseRemittanceDetailsFragment.customAmountToSend = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_amount_to_send_value, "field 'customAmountToSend'", TextView.class);
        baseRemittanceDetailsFragment.customAmountToGetLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_amount_to_get, "field 'customAmountToGetLayout'", LinearLayout.class);
        baseRemittanceDetailsFragment.customAmountToGet = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_amount_to_get_value, "field 'customAmountToGet'", TextView.class);
        baseRemittanceDetailsFragment.customFeeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_fee, "field 'customFeeLayout'", LinearLayout.class);
        baseRemittanceDetailsFragment.customFee = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_fee_value, "field 'customFee'", TextView.class);
        baseRemittanceDetailsFragment.customPersonalDetail = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_personal_details, "field 'customPersonalDetail'", CustomNoteItem.class);
        baseRemittanceDetailsFragment.customRecipientAddress = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_address, "field 'customRecipientAddress'", CustomNoteItem.class);
        baseRemittanceDetailsFragment.customRecipientContacts = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_recipient_contact_details, "field 'customRecipientContacts'", CustomNoteItem.class);
        baseRemittanceDetailsFragment.customTransactionDetails = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_transaction_details, "field 'customTransactionDetails'", CustomNoteItem.class);
        baseRemittanceDetailsFragment.customNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_note, "field 'customNote'", CustomNoteItem.class);
        baseRemittanceDetailsFragment.remittanceLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remittance_logo, "field 'remittanceLogo'", ImageView.class);
        baseRemittanceDetailsFragment.separatorAmountToSend = onStart.IconCompatParcelizer(view, R.id.separator_remittance_amount_to_send, "field 'separatorAmountToSend'");
        baseRemittanceDetailsFragment.separatorAmountToGet = onStart.IconCompatParcelizer(view, R.id.separator_remittance_amount_to_get, "field 'separatorAmountToGet'");
    }

    public void read() {
        BaseRemittanceDetailsFragment baseRemittanceDetailsFragment = this.IconCompatParcelizer;
        if (baseRemittanceDetailsFragment != null) {
            this.IconCompatParcelizer = null;
            baseRemittanceDetailsFragment.customSource = null;
            baseRemittanceDetailsFragment.customTarget = null;
            baseRemittanceDetailsFragment.customConversionRate = null;
            baseRemittanceDetailsFragment.customAmountToSendLayout = null;
            baseRemittanceDetailsFragment.customAmountToSend = null;
            baseRemittanceDetailsFragment.customAmountToGetLayout = null;
            baseRemittanceDetailsFragment.customAmountToGet = null;
            baseRemittanceDetailsFragment.customFeeLayout = null;
            baseRemittanceDetailsFragment.customFee = null;
            baseRemittanceDetailsFragment.customPersonalDetail = null;
            baseRemittanceDetailsFragment.customRecipientAddress = null;
            baseRemittanceDetailsFragment.customRecipientContacts = null;
            baseRemittanceDetailsFragment.customTransactionDetails = null;
            baseRemittanceDetailsFragment.customNote = null;
            baseRemittanceDetailsFragment.remittanceLogo = null;
            baseRemittanceDetailsFragment.separatorAmountToSend = null;
            baseRemittanceDetailsFragment.separatorAmountToGet = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
