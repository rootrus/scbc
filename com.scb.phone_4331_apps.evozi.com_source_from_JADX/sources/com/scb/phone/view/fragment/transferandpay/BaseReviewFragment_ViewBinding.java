package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayStatus;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BaseReviewFragment MediaBrowserCompat$ItemReceiver;

    public BaseReviewFragment_ViewBinding(final BaseReviewFragment baseReviewFragment, View view) {
        super(baseReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseReviewFragment;
        baseReviewFragment.customStatus = (CustomTransferAndPayStatus) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_status, "field 'customStatus'", CustomTransferAndPayStatus.class);
        baseReviewFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'customSource'", CustomTransferAndPaySource.class);
        baseReviewFragment.customTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_target, "field 'customTarget'", CustomTransferAndPayTarget.class);
        baseReviewFragment.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_amount, "field 'customAmount'", CustomTransferAndPayItem.class);
        baseReviewFragment.customDue = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_due, "field 'customDue'", CustomTransferAndPayItem.class);
        baseReviewFragment.customFees = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_fees, "field 'customFees'", CustomTransferAndPayItem.class);
        baseReviewFragment.billerNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_biller_note, "field 'billerNote'", CustomNoteItem.class);
        baseReviewFragment.userNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_user_note, "field 'userNote'", CustomNoteItem.class);
        baseReviewFragment.fullDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'fullDivider'");
        baseReviewFragment.quickTopUpTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.review_quick_top_up_text_view, "field 'quickTopUpTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.modify_quick_top_up_text_view, "field 'modifyQuickTopUpButton' and method 'onModifyButtonClick'");
        baseReviewFragment.modifyQuickTopUpButton = (TextView) onStart.write(IconCompatParcelizer, R.id.modify_quick_top_up_text_view, "field 'modifyQuickTopUpButton'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseReviewFragment.this.onModifyButtonClick();
            }
        });
        baseReviewFragment.scheduleContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_section, "field 'scheduleContainer'", LinearLayout.class);
        baseReviewFragment.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
        baseReviewFragment.customAdditionalFeeLayout = onStart.IconCompatParcelizer(view, R.id.custom_additional_fee_layout, "field 'customAdditionalFeeLayout'");
        baseReviewFragment.fixedTransferInterest = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fixed_transfer_and_pay_interest, "field 'fixedTransferInterest'", CustomTransferAndPayItem.class);
        baseReviewFragment.fixedTransferWithholdingTax = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fixed_transfer_and_pay_withholding_tax, "field 'fixedTransferWithholdingTax'", CustomTransferAndPayItem.class);
    }

    public void read() {
        BaseReviewFragment baseReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseReviewFragment.customStatus = null;
            baseReviewFragment.customSource = null;
            baseReviewFragment.customTarget = null;
            baseReviewFragment.customAmount = null;
            baseReviewFragment.customDue = null;
            baseReviewFragment.customFees = null;
            baseReviewFragment.billerNote = null;
            baseReviewFragment.userNote = null;
            baseReviewFragment.fullDivider = null;
            baseReviewFragment.quickTopUpTextView = null;
            baseReviewFragment.modifyQuickTopUpButton = null;
            baseReviewFragment.scheduleContainer = null;
            baseReviewFragment.customScheduleView = null;
            baseReviewFragment.customAdditionalFeeLayout = null;
            baseReviewFragment.fixedTransferInterest = null;
            baseReviewFragment.fixedTransferWithholdingTax = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
