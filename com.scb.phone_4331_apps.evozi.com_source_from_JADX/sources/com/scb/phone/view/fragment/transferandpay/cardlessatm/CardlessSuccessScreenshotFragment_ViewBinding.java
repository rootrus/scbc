package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomCardlessWithdrawCodeItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import p040o.onStart;

public class CardlessSuccessScreenshotFragment_ViewBinding implements Unbinder {
    private CardlessSuccessScreenshotFragment IconCompatParcelizer;

    public CardlessSuccessScreenshotFragment_ViewBinding(CardlessSuccessScreenshotFragment cardlessSuccessScreenshotFragment, View view) {
        this.IconCompatParcelizer = cardlessSuccessScreenshotFragment;
        cardlessSuccessScreenshotFragment.customWithdrawCode = (CustomCardlessWithdrawCodeItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.withdraw_code_screenshot, "field 'customWithdrawCode'", CustomCardlessWithdrawCodeItem.class);
        cardlessSuccessScreenshotFragment.mobileNo = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_no_screenshot, "field 'mobileNo'", CustomTransferAndPayItem.class);
        cardlessSuccessScreenshotFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_source_screenshot, "field 'customSource'", CustomTransferAndPaySource.class);
        cardlessSuccessScreenshotFragment.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_amount_screenshot, "field 'customAmount'", CustomTransferAndPayItem.class);
        cardlessSuccessScreenshotFragment.requestTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_text_view, "field 'requestTime'", TextView.class);
    }

    public final void read() {
        CardlessSuccessScreenshotFragment cardlessSuccessScreenshotFragment = this.IconCompatParcelizer;
        if (cardlessSuccessScreenshotFragment != null) {
            this.IconCompatParcelizer = null;
            cardlessSuccessScreenshotFragment.customWithdrawCode = null;
            cardlessSuccessScreenshotFragment.mobileNo = null;
            cardlessSuccessScreenshotFragment.customSource = null;
            cardlessSuccessScreenshotFragment.customAmount = null;
            cardlessSuccessScreenshotFragment.requestTime = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
