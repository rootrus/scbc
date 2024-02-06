package com.scb.phone.view.activity.bulktransfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.bulktransfer.CustomRecipientsList;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class BulkTransferInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BulkTransferInputActivity IconCompatParcelizer;
    private View write;

    public BulkTransferInputActivity_ViewBinding(final BulkTransferInputActivity bulkTransferInputActivity, View view) {
        super(bulkTransferInputActivity, view);
        this.IconCompatParcelizer = bulkTransferInputActivity;
        bulkTransferInputActivity.groupHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_header_text_view, "field 'groupHeader'", TextView.class);
        bulkTransferInputActivity.noRecipents = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_recipients_error, "field 'noRecipents'", ViewGroup.class);
        bulkTransferInputActivity.ownRecipientList = (CustomRecipientsList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.own_recipient_list, "field 'ownRecipientList'", CustomRecipientsList.class);
        bulkTransferInputActivity.scbRecipientList = (CustomRecipientsList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scb_recipient_list, "field 'scbRecipientList'", CustomRecipientsList.class);
        bulkTransferInputActivity.otherRecipientList = (CustomRecipientsList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.other_recipient_list, "field 'otherRecipientList'", CustomRecipientsList.class);
        bulkTransferInputActivity.totalAmountViewGroup = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount_view_group, "field 'totalAmountViewGroup'", ViewGroup.class);
        bulkTransferInputActivity.totalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount_text_view, "field 'totalAmount'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.review_button, "field 'reviewButton' and method 'onReviewButtonClicked'");
        bulkTransferInputActivity.reviewButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.review_button, "field 'reviewButton'", DefaultButton.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferInputActivity.this.onReviewButtonClicked();
            }
        });
        bulkTransferInputActivity.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
        bulkTransferInputActivity.layoutMoreOptions = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_more_options, "field 'layoutMoreOptions'", LinearLayout.class);
    }

    public final void read() {
        BulkTransferInputActivity bulkTransferInputActivity = this.IconCompatParcelizer;
        if (bulkTransferInputActivity != null) {
            this.IconCompatParcelizer = null;
            bulkTransferInputActivity.groupHeader = null;
            bulkTransferInputActivity.noRecipents = null;
            bulkTransferInputActivity.ownRecipientList = null;
            bulkTransferInputActivity.scbRecipientList = null;
            bulkTransferInputActivity.otherRecipientList = null;
            bulkTransferInputActivity.totalAmountViewGroup = null;
            bulkTransferInputActivity.totalAmount = null;
            bulkTransferInputActivity.reviewButton = null;
            bulkTransferInputActivity.customScheduleView = null;
            bulkTransferInputActivity.layoutMoreOptions = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
