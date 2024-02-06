package com.scb.phone.view.fragment.ccrredemption.review;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class MileageRedemptionSlipFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MileageRedemptionSlipFragment write;

    public MileageRedemptionSlipFragment_ViewBinding(MileageRedemptionSlipFragment mileageRedemptionSlipFragment, View view) {
        super(mileageRedemptionSlipFragment, view);
        this.write = mileageRedemptionSlipFragment;
        mileageRedemptionSlipFragment.txvSuccessfulText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textView, "field 'txvSuccessfulText'", TextView.class);
        mileageRedemptionSlipFragment.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
        mileageRedemptionSlipFragment.txvCardType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardType'", TextView.class);
        mileageRedemptionSlipFragment.txvMembershipId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_membership_id, "field 'txvMembershipId'", TextView.class);
        mileageRedemptionSlipFragment.txvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_reference_id, "field 'txvReferenceId'", TextView.class);
        mileageRedemptionSlipFragment.txvRedemptionDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_redemption_date_time, "field 'txvRedemptionDateTime'", TextView.class);
        mileageRedemptionSlipFragment.txvLastName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_last_name, "field 'txvLastName'", TextView.class);
        mileageRedemptionSlipFragment.txvTotalMiles = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_miles, "field 'txvTotalMiles'", TextView.class);
        mileageRedemptionSlipFragment.txvPointsToRedeem = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_points, "field 'txvPointsToRedeem'", TextView.class);
        mileageRedemptionSlipFragment.txvItemDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_description, "field 'txvItemDescription'", TextView.class);
        mileageRedemptionSlipFragment.txvProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_name, "field 'txvProductName'", TextView.class);
        mileageRedemptionSlipFragment.txvPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_pts, "field 'txvPoints'", TextView.class);
    }

    public final void read() {
        MileageRedemptionSlipFragment mileageRedemptionSlipFragment = this.write;
        if (mileageRedemptionSlipFragment != null) {
            this.write = null;
            mileageRedemptionSlipFragment.txvSuccessfulText = null;
            mileageRedemptionSlipFragment.txvCardNumber = null;
            mileageRedemptionSlipFragment.txvCardType = null;
            mileageRedemptionSlipFragment.txvMembershipId = null;
            mileageRedemptionSlipFragment.txvReferenceId = null;
            mileageRedemptionSlipFragment.txvRedemptionDateTime = null;
            mileageRedemptionSlipFragment.txvLastName = null;
            mileageRedemptionSlipFragment.txvTotalMiles = null;
            mileageRedemptionSlipFragment.txvPointsToRedeem = null;
            mileageRedemptionSlipFragment.txvItemDescription = null;
            mileageRedemptionSlipFragment.txvProductName = null;
            mileageRedemptionSlipFragment.txvPoints = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
