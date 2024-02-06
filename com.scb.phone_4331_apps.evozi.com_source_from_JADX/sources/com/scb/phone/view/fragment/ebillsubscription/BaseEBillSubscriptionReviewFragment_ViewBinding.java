package com.scb.phone.view.fragment.ebillsubscription;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseEBillSubscriptionReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseEBillSubscriptionReviewFragment MediaBrowserCompat$ItemReceiver;

    public BaseEBillSubscriptionReviewFragment_ViewBinding(BaseEBillSubscriptionReviewFragment baseEBillSubscriptionReviewFragment, View view) {
        super(baseEBillSubscriptionReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseEBillSubscriptionReviewFragment;
        baseEBillSubscriptionReviewFragment.sourceDetail = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_detail, "field 'sourceDetail'", CustomTransferAndPaySource.class);
        baseEBillSubscriptionReviewFragment.targetDetail = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_detail, "field 'targetDetail'", CustomTransferAndPayTarget.class);
    }

    public void read() {
        BaseEBillSubscriptionReviewFragment baseEBillSubscriptionReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseEBillSubscriptionReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseEBillSubscriptionReviewFragment.sourceDetail = null;
            baseEBillSubscriptionReviewFragment.targetDetail = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
