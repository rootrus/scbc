package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BillPaymentBillerSelectedFragment_ViewBinding extends BaseTargetSelectedFragment_ViewBinding {
    private View IconCompatParcelizer;
    private BillPaymentBillerSelectedFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BillPaymentBillerSelectedFragment_ViewBinding(final BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment, View view) {
        super(billPaymentBillerSelectedFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentBillerSelectedFragment;
        billPaymentBillerSelectedFragment.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
        billPaymentBillerSelectedFragment.scheduleLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_layout, "field 'scheduleLinearLayout'", LinearLayout.class);
        billPaymentBillerSelectedFragment.noteLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_layout, "field 'noteLayout'", LinearLayout.class);
        billPaymentBillerSelectedFragment.moreOptionsText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.more_options_text_view, "field 'moreOptionsText'", TextView.class);
        billPaymentBillerSelectedFragment.moreOptionsDividerTop = onStart.IconCompatParcelizer(view, R.id.more_options_divider_view, "field 'moreOptionsDividerTop'");
        billPaymentBillerSelectedFragment.moreOptionsDividerBottom = onStart.IconCompatParcelizer(view, R.id.more_options_devider_bottom, "field 'moreOptionsDividerBottom'");
        billPaymentBillerSelectedFragment.toTextView = onStart.IconCompatParcelizer(view, R.id.to_text_view, "field 'toTextView'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onAdditionalInfoButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentBillerSelectedFragment.this.onAdditionalInfoButtonClicked();
            }
        });
    }

    public final void read() {
        BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (billPaymentBillerSelectedFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            billPaymentBillerSelectedFragment.customScheduleView = null;
            billPaymentBillerSelectedFragment.scheduleLinearLayout = null;
            billPaymentBillerSelectedFragment.noteLayout = null;
            billPaymentBillerSelectedFragment.moreOptionsText = null;
            billPaymentBillerSelectedFragment.moreOptionsDividerTop = null;
            billPaymentBillerSelectedFragment.moreOptionsDividerBottom = null;
            billPaymentBillerSelectedFragment.toTextView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
