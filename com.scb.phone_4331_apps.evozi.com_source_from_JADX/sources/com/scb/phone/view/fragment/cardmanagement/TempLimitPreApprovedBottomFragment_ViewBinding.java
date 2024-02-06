package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TempLimitPreApprovedBottomFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private TempLimitPreApprovedBottomFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public TempLimitPreApprovedBottomFragment_ViewBinding(final TempLimitPreApprovedBottomFragment tempLimitPreApprovedBottomFragment, View view) {
        super(tempLimitPreApprovedBottomFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = tempLimitPreApprovedBottomFragment;
        tempLimitPreApprovedBottomFragment.vgAdditionalAmount = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_spinner_additional_amount, "field 'vgAdditionalAmount'", ViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_spinner_end_date, "field 'txvEndDate' and method 'onEndDateClick'");
        tempLimitPreApprovedBottomFragment.txvEndDate = (TextView) onStart.write(IconCompatParcelizer2, R.id.layout_spinner_end_date, "field 'txvEndDate'", TextView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TempLimitPreApprovedBottomFragment.this.onEndDateClick();
            }
        });
        tempLimitPreApprovedBottomFragment.vgReason = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_spinner_reason, "field 'vgReason'", ViewGroup.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_review, "field 'btnReview' and method 'navigateToReviewPage'");
        tempLimitPreApprovedBottomFragment.btnReview = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.btn_review, "field 'btnReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TempLimitPreApprovedBottomFragment.this.navigateToReviewPage();
            }
        });
    }

    public final void read() {
        TempLimitPreApprovedBottomFragment tempLimitPreApprovedBottomFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tempLimitPreApprovedBottomFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            tempLimitPreApprovedBottomFragment.vgAdditionalAmount = null;
            tempLimitPreApprovedBottomFragment.txvEndDate = null;
            tempLimitPreApprovedBottomFragment.vgReason = null;
            tempLimitPreApprovedBottomFragment.btnReview = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
