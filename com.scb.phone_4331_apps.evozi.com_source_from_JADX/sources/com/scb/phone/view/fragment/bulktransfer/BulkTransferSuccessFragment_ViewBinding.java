package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.bulktransfer.CustomEffectiveDate;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BulkTransferSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferSuccessFragment MediaBrowserCompat$ItemReceiver;

    public BulkTransferSuccessFragment_ViewBinding(final BulkTransferSuccessFragment bulkTransferSuccessFragment, View view) {
        super(bulkTransferSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = bulkTransferSuccessFragment;
        bulkTransferSuccessFragment.groupName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_name, "field 'groupName'", TextView.class);
        bulkTransferSuccessFragment.groupId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_id, "field 'groupId'", TextView.class);
        bulkTransferSuccessFragment.successfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.successful_transfer, "field 'successfulTransfer'", TextView.class);
        bulkTransferSuccessFragment.unsuccessfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.unsuccessful_transfer, "field 'unsuccessfulTransfer'", TextView.class);
        bulkTransferSuccessFragment.paymentDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payment_date, "field 'paymentDate'", TextView.class);
        bulkTransferSuccessFragment.scheduleIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_icon, "field 'scheduleIcon'", ImageView.class);
        bulkTransferSuccessFragment.scheduleSuccessfullText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_successful_text, "field 'scheduleSuccessfullText'", TextView.class);
        bulkTransferSuccessFragment.schedulePaymentDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_payment_date, "field 'schedulePaymentDate'", TextView.class);
        bulkTransferSuccessFragment.scheduleGroupId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_group_id, "field 'scheduleGroupId'", TextView.class);
        bulkTransferSuccessFragment.scheduleEffectiveDate = (CustomEffectiveDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_effective_date, "field 'scheduleEffectiveDate'", CustomEffectiveDate.class);
        bulkTransferSuccessFragment.fullDisclaimerViewSeparator = onStart.IconCompatParcelizer(view, R.id.full_disclaimer_view_separator, "field 'fullDisclaimerViewSeparator'");
        bulkTransferSuccessFragment.scheduleDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_disclaimer, "field 'scheduleDisclaimer'", TextView.class);
        bulkTransferSuccessFragment.fullFromViewSeparator = onStart.IconCompatParcelizer(view, R.id.full_from_view_separator, "field 'fullFromViewSeparator'");
        bulkTransferSuccessFragment.fromViewSeparator = onStart.IconCompatParcelizer(view, R.id.from_view_separator, "field 'fromViewSeparator'");
        bulkTransferSuccessFragment.from = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'from'", CustomTransferAndPaySource.class);
        bulkTransferSuccessFragment.conclusionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.succes_title, "field 'conclusionTitle'", TextView.class);
        bulkTransferSuccessFragment.successAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_amount, "field 'successAmount'", CustomTransferAndPayItem.class);
        bulkTransferSuccessFragment.totalAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'totalAmount'", CustomTransferAndPayItem.class);
        bulkTransferSuccessFragment.totalFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_fee, "field 'totalFee'", CustomTransferAndPayItem.class);
        bulkTransferSuccessFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_separate_slips, "field 'saveSeparateSlips' and method 'saveSeparateSlipsClick'");
        bulkTransferSuccessFragment.saveSeparateSlips = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.save_separate_slips, "field 'saveSeparateSlips'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferSuccessFragment.this.saveSeparateSlipsClick();
            }
        });
        bulkTransferSuccessFragment.remainingBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'remainingBalance'", TextView.class);
        bulkTransferSuccessFragment.buttonsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.buttons_container, "field 'buttonsContainer'", LinearLayout.class);
        bulkTransferSuccessFragment.scheduleNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_note, "field 'scheduleNote'", TextView.class);
        View findViewById = view.findViewById(R.id.return_button);
        if (findViewById != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    BulkTransferSuccessFragment.this.onReturnHomeClick();
                }
            });
        }
    }

    public final void read() {
        BulkTransferSuccessFragment bulkTransferSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (bulkTransferSuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            bulkTransferSuccessFragment.groupName = null;
            bulkTransferSuccessFragment.groupId = null;
            bulkTransferSuccessFragment.successfulTransfer = null;
            bulkTransferSuccessFragment.unsuccessfulTransfer = null;
            bulkTransferSuccessFragment.paymentDate = null;
            bulkTransferSuccessFragment.scheduleIcon = null;
            bulkTransferSuccessFragment.scheduleSuccessfullText = null;
            bulkTransferSuccessFragment.schedulePaymentDate = null;
            bulkTransferSuccessFragment.scheduleGroupId = null;
            bulkTransferSuccessFragment.scheduleEffectiveDate = null;
            bulkTransferSuccessFragment.fullDisclaimerViewSeparator = null;
            bulkTransferSuccessFragment.scheduleDisclaimer = null;
            bulkTransferSuccessFragment.fullFromViewSeparator = null;
            bulkTransferSuccessFragment.fromViewSeparator = null;
            bulkTransferSuccessFragment.from = null;
            bulkTransferSuccessFragment.conclusionTitle = null;
            bulkTransferSuccessFragment.successAmount = null;
            bulkTransferSuccessFragment.totalAmount = null;
            bulkTransferSuccessFragment.totalFee = null;
            bulkTransferSuccessFragment.recyclerView = null;
            bulkTransferSuccessFragment.saveSeparateSlips = null;
            bulkTransferSuccessFragment.remainingBalance = null;
            bulkTransferSuccessFragment.buttonsContainer = null;
            bulkTransferSuccessFragment.scheduleNote = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            View view = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
