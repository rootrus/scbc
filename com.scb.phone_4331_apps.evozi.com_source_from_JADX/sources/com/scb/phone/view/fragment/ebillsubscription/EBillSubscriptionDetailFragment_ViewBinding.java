package com.scb.phone.view.fragment.ebillsubscription;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EBillSubscriptionDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EBillSubscriptionDetailFragment write;

    public EBillSubscriptionDetailFragment_ViewBinding(final EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment, View view) {
        super(eBillSubscriptionDetailFragment, view);
        this.write = eBillSubscriptionDetailFragment;
        eBillSubscriptionDetailFragment.sourceDetail = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_detail, "field 'sourceDetail'", CustomTransferAndPaySource.class);
        eBillSubscriptionDetailFragment.targetDetail = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_detail, "field 'targetDetail'", CustomTransferAndPayTarget.class);
        eBillSubscriptionDetailFragment.status = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status, "field 'status'", CustomTransferAndPaySource.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.unsubscribe_button, "method 'onUnsubscribeClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSubscriptionDetailFragment.this.onUnsubscribeClick();
            }
        });
    }

    public final void read() {
        EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment = this.write;
        if (eBillSubscriptionDetailFragment != null) {
            this.write = null;
            eBillSubscriptionDetailFragment.sourceDetail = null;
            eBillSubscriptionDetailFragment.targetDetail = null;
            eBillSubscriptionDetailFragment.status = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
