package com.scb.phone.view.fragment.scheduledtransaction;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.bulktransfer.CustomEffectiveDate;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScheduleBulkTransferFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ScheduleBulkTransferFragment IconCompatParcelizer;
    private View write;

    public ScheduleBulkTransferFragment_ViewBinding(final ScheduleBulkTransferFragment scheduleBulkTransferFragment, View view) {
        super(scheduleBulkTransferFragment, view);
        this.IconCompatParcelizer = scheduleBulkTransferFragment;
        scheduleBulkTransferFragment.groupHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_group_name_text, "field 'groupHeader'", TextView.class);
        scheduleBulkTransferFragment.groupId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_group_id_text, "field 'groupId'", TextView.class);
        scheduleBulkTransferFragment.refId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_ref_id_text, "field 'refId'", TextView.class);
        scheduleBulkTransferFragment.effectiveDate = (CustomEffectiveDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bulk_transfer_effective_date, "field 'effectiveDate'", CustomEffectiveDate.class);
        scheduleBulkTransferFragment.source = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'source'", CustomTransferAndPaySource.class);
        scheduleBulkTransferFragment.recipients = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipients_recycler_view, "field 'recipients'", RecyclerView.class);
        scheduleBulkTransferFragment.amount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amount'", CustomTransferAndPayItem.class);
        scheduleBulkTransferFragment.totalFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_fee, "field 'totalFee'", CustomTransferAndPayItem.class);
        scheduleBulkTransferFragment.totalAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'totalAmount'", CustomTransferAndPayItem.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.delete_button, "method 'onConfirmButtonClicked'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleBulkTransferFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        ScheduleBulkTransferFragment scheduleBulkTransferFragment = this.IconCompatParcelizer;
        if (scheduleBulkTransferFragment != null) {
            this.IconCompatParcelizer = null;
            scheduleBulkTransferFragment.groupHeader = null;
            scheduleBulkTransferFragment.groupId = null;
            scheduleBulkTransferFragment.refId = null;
            scheduleBulkTransferFragment.effectiveDate = null;
            scheduleBulkTransferFragment.source = null;
            scheduleBulkTransferFragment.recipients = null;
            scheduleBulkTransferFragment.amount = null;
            scheduleBulkTransferFragment.totalFee = null;
            scheduleBulkTransferFragment.totalAmount = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
