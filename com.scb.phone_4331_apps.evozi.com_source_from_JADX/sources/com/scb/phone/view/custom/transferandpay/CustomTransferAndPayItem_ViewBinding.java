package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.onStart;

public class CustomTransferAndPayItem_ViewBinding implements Unbinder {
    private CustomTransferAndPayItem IconCompatParcelizer;

    public CustomTransferAndPayItem_ViewBinding(CustomTransferAndPayItem customTransferAndPayItem, View view) {
        this.IconCompatParcelizer = customTransferAndPayItem;
        customTransferAndPayItem.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_item_title_text_view, "field 'mTitleTextView'", TextView.class);
        customTransferAndPayItem.mValueTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_item_value_text_view, "field 'mValueTextView'", TextView.class);
        customTransferAndPayItem.mDividerSpaceView = onStart.IconCompatParcelizer(view, R.id.transfer_and_pay_item_divider_full, "field 'mDividerSpaceView'");
        customTransferAndPayItem.mDividerView = onStart.IconCompatParcelizer(view, R.id.transfer_and_pay_item_divider, "field 'mDividerView'");
        customTransferAndPayItem.mTopSpace = onStart.IconCompatParcelizer(view, R.id.transfer_and_pay_item_top_space, "field 'mTopSpace'");
        customTransferAndPayItem.mBottomSpace = onStart.IconCompatParcelizer(view, R.id.transfer_and_pay_item_bottom_space, "field 'mBottomSpace'");
        customTransferAndPayItem.amountInfo = (CustomAmountInfo) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_info, "field 'amountInfo'", CustomAmountInfo.class);
        customTransferAndPayItem.scheduleFeeText = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_fee_text, "field 'scheduleFeeText'", ThaiTextView.class);
        customTransferAndPayItem.lineView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_lineDivider, "field 'lineView'", LinearLayout.class);
        customTransferAndPayItem.tvDateTimeRateChange = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time_rate_change, "field 'tvDateTimeRateChange'", TextView.class);
    }

    public final void read() {
        CustomTransferAndPayItem customTransferAndPayItem = this.IconCompatParcelizer;
        if (customTransferAndPayItem != null) {
            this.IconCompatParcelizer = null;
            customTransferAndPayItem.mTitleTextView = null;
            customTransferAndPayItem.mValueTextView = null;
            customTransferAndPayItem.mDividerSpaceView = null;
            customTransferAndPayItem.mDividerView = null;
            customTransferAndPayItem.mTopSpace = null;
            customTransferAndPayItem.mBottomSpace = null;
            customTransferAndPayItem.amountInfo = null;
            customTransferAndPayItem.scheduleFeeText = null;
            customTransferAndPayItem.lineView = null;
            customTransferAndPayItem.tvDateTimeRateChange = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
