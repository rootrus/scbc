package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import p040o.onStart;

public class BaseSuccessFragment_ViewBinding extends BaseReviewFragment_ViewBinding {
    private BaseSuccessFragment MediaBrowserCompat$ItemReceiver;

    public BaseSuccessFragment_ViewBinding(BaseSuccessFragment baseSuccessFragment, View view) {
        super(baseSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseSuccessFragment;
        baseSuccessFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        baseSuccessFragment.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
        baseSuccessFragment.textReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'textReferenceId'", TextView.class);
        baseSuccessFragment.successIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_icon, "field 'successIcon'", ImageView.class);
        baseSuccessFragment.giftDetails = (CustomPhotoLeftDetails) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_details, "field 'giftDetails'", CustomPhotoLeftDetails.class);
        baseSuccessFragment.messageDetails = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.message_note, "field 'messageDetails'", CustomNoteItem.class);
        baseSuccessFragment.slipQRSection = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slip_qr_section, "field 'slipQRSection'", RelativeLayout.class);
        baseSuccessFragment.slipQRCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slip_qr_code_image, "field 'slipQRCodeImageView'", ImageView.class);
        baseSuccessFragment.slipQRCodeDescriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slip_qr_code_description_text_view, "field 'slipQRCodeDescriptionTextView'", TextView.class);
        baseSuccessFragment.edonationRemark = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edonation_remark, "field 'edonationRemark'", CustomNoteItem.class);
    }

    public void read() {
        BaseSuccessFragment baseSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseSuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseSuccessFragment.textTitle = null;
            baseSuccessFragment.textDateTime = null;
            baseSuccessFragment.textReferenceId = null;
            baseSuccessFragment.successIcon = null;
            baseSuccessFragment.giftDetails = null;
            baseSuccessFragment.messageDetails = null;
            baseSuccessFragment.slipQRSection = null;
            baseSuccessFragment.slipQRCodeImageView = null;
            baseSuccessFragment.slipQRCodeDescriptionTextView = null;
            baseSuccessFragment.edonationRemark = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
