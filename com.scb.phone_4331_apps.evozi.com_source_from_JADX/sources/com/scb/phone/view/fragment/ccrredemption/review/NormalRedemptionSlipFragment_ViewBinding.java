package com.scb.phone.view.fragment.ccrredemption.review;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class NormalRedemptionSlipFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NormalRedemptionSlipFragment IconCompatParcelizer;

    public NormalRedemptionSlipFragment_ViewBinding(NormalRedemptionSlipFragment normalRedemptionSlipFragment, View view) {
        super(normalRedemptionSlipFragment, view);
        this.IconCompatParcelizer = normalRedemptionSlipFragment;
        normalRedemptionSlipFragment.txvRedemptionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_redemption_date_time, "field 'txvRedemptionDate'", TextView.class);
        normalRedemptionSlipFragment.successfulText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textView, "field 'successfulText'", TextView.class);
        normalRedemptionSlipFragment.txvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reference_id, "field 'txvReferenceId'", TextView.class);
        normalRedemptionSlipFragment.effectiveDateLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effective_date, "field 'effectiveDateLayout'", ConstraintLayout.class);
        normalRedemptionSlipFragment.txvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_effective_date, "field 'txvEffectiveDate'", TextView.class);
        normalRedemptionSlipFragment.txvCardName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardName'", TextView.class);
        normalRedemptionSlipFragment.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
        normalRedemptionSlipFragment.txvProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_name, "field 'txvProductName'", TextView.class);
        normalRedemptionSlipFragment.txvItemDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_description, "field 'txvItemDescription'", TextView.class);
        normalRedemptionSlipFragment.txvTotalPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_points, "field 'txvTotalPoints'", TextView.class);
        normalRedemptionSlipFragment.txvTotalPaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_paid, "field 'txvTotalPaid'", TextView.class);
        normalRedemptionSlipFragment.txvCurrency = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_currency, "field 'txvCurrency'", TextView.class);
        normalRedemptionSlipFragment.totalPaidSection = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_paid_section, "field 'totalPaidSection'", ViewGroup.class);
        normalRedemptionSlipFragment.txvPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_pts, "field 'txvPoints'", TextView.class);
    }

    public final void read() {
        NormalRedemptionSlipFragment normalRedemptionSlipFragment = this.IconCompatParcelizer;
        if (normalRedemptionSlipFragment != null) {
            this.IconCompatParcelizer = null;
            normalRedemptionSlipFragment.txvRedemptionDate = null;
            normalRedemptionSlipFragment.successfulText = null;
            normalRedemptionSlipFragment.txvReferenceId = null;
            normalRedemptionSlipFragment.effectiveDateLayout = null;
            normalRedemptionSlipFragment.txvEffectiveDate = null;
            normalRedemptionSlipFragment.txvCardName = null;
            normalRedemptionSlipFragment.txvCardNumber = null;
            normalRedemptionSlipFragment.txvProductName = null;
            normalRedemptionSlipFragment.txvItemDescription = null;
            normalRedemptionSlipFragment.txvTotalPoints = null;
            normalRedemptionSlipFragment.txvTotalPaid = null;
            normalRedemptionSlipFragment.txvCurrency = null;
            normalRedemptionSlipFragment.totalPaidSection = null;
            normalRedemptionSlipFragment.txvPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
