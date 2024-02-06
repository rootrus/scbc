package com.scb.phone.view.fragment.chequemanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseChequeReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseChequeReviewFragment write;

    public BaseChequeReviewFragment_ViewBinding(BaseChequeReviewFragment baseChequeReviewFragment, View view) {
        super(baseChequeReviewFragment, view);
        this.write = baseChequeReviewFragment;
        baseChequeReviewFragment.sourceDetail = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_detail, "field 'sourceDetail'", CustomTransferAndPaySource.class);
        baseChequeReviewFragment.targetDetail = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_detail, "field 'targetDetail'", CustomTransferAndPayTarget.class);
        baseChequeReviewFragment.quantityDetail = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.quantity_detail, "field 'quantityDetail'", CustomTransferAndPayTarget.class);
        baseChequeReviewFragment.feeDetail = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee_detail, "field 'feeDetail'", CustomTransferAndPayTarget.class);
        baseChequeReviewFragment.mailingAddressDetail = (CustomAddressItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mailing_address_detail, "field 'mailingAddressDetail'", CustomAddressItem.class);
        baseChequeReviewFragment.detailText = (TextView) onStart.IconCompatParcelizer(view, R.id.detail_text, "field 'detailText'", TextView.class);
    }

    public void read() {
        BaseChequeReviewFragment baseChequeReviewFragment = this.write;
        if (baseChequeReviewFragment != null) {
            this.write = null;
            baseChequeReviewFragment.sourceDetail = null;
            baseChequeReviewFragment.targetDetail = null;
            baseChequeReviewFragment.quantityDetail = null;
            baseChequeReviewFragment.feeDetail = null;
            baseChequeReviewFragment.mailingAddressDetail = null;
            baseChequeReviewFragment.detailText = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
