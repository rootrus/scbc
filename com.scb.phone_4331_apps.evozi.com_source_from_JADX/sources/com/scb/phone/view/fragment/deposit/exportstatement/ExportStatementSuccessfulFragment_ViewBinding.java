package com.scb.phone.view.fragment.deposit.exportstatement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ExportStatementSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ExportStatementSuccessfulFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public ExportStatementSuccessfulFragment_ViewBinding(final ExportStatementSuccessfulFragment exportStatementSuccessfulFragment, View view) {
        super(exportStatementSuccessfulFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = exportStatementSuccessfulFragment;
        exportStatementSuccessfulFragment.customAccount = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account, "field 'customAccount'", CustomTransferAndPaySource.class);
        exportStatementSuccessfulFragment.customDateRange = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_range, "field 'customDateRange'", CustomTransferAndPayItem.class);
        exportStatementSuccessfulFragment.customSentTo = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sent_to, "field 'customSentTo'", CustomTransferAndPayItem.class);
        exportStatementSuccessfulFragment.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_description, "field 'textDescription'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnHomeClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ExportStatementSuccessfulFragment.this.onReturnHomeClick();
            }
        });
    }

    public final void read() {
        ExportStatementSuccessfulFragment exportStatementSuccessfulFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (exportStatementSuccessfulFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            exportStatementSuccessfulFragment.customAccount = null;
            exportStatementSuccessfulFragment.customDateRange = null;
            exportStatementSuccessfulFragment.customSentTo = null;
            exportStatementSuccessfulFragment.textDescription = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
