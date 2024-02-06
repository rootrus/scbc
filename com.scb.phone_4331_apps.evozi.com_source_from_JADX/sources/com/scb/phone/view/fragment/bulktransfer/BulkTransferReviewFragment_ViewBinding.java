package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.bulktransfer.CustomEffectiveDate;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BulkTransferReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private BulkTransferReviewFragment write;

    public BulkTransferReviewFragment_ViewBinding(final BulkTransferReviewFragment bulkTransferReviewFragment, View view) {
        super(bulkTransferReviewFragment, view);
        this.write = bulkTransferReviewFragment;
        bulkTransferReviewFragment.groupHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_header_text_view, "field 'groupHeader'", TextView.class);
        bulkTransferReviewFragment.source = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'source'", CustomTransferAndPaySource.class);
        bulkTransferReviewFragment.recipients = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipients_recycler_view, "field 'recipients'", RecyclerView.class);
        bulkTransferReviewFragment.amount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amount'", CustomTransferAndPayItem.class);
        bulkTransferReviewFragment.totalFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_fee, "field 'totalFee'", CustomTransferAndPayItem.class);
        bulkTransferReviewFragment.totalAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'totalAmount'", CustomTransferAndPayItem.class);
        bulkTransferReviewFragment.scheduleLayoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_effective_date_container, "field 'scheduleLayoutContainer'", LinearLayout.class);
        bulkTransferReviewFragment.scheduleEffectiveDate = (CustomEffectiveDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_effective_date, "field 'scheduleEffectiveDate'", CustomEffectiveDate.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onConfirmButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferReviewFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        BulkTransferReviewFragment bulkTransferReviewFragment = this.write;
        if (bulkTransferReviewFragment != null) {
            this.write = null;
            bulkTransferReviewFragment.groupHeader = null;
            bulkTransferReviewFragment.source = null;
            bulkTransferReviewFragment.recipients = null;
            bulkTransferReviewFragment.amount = null;
            bulkTransferReviewFragment.totalFee = null;
            bulkTransferReviewFragment.totalAmount = null;
            bulkTransferReviewFragment.scheduleLayoutContainer = null;
            bulkTransferReviewFragment.scheduleEffectiveDate = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
