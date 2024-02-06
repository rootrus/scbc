package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MileageReviewRedemptionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MileageReviewRedemptionFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public MileageReviewRedemptionFragment_ViewBinding(final MileageReviewRedemptionFragment mileageReviewRedemptionFragment, View view) {
        super(mileageReviewRedemptionFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mileageReviewRedemptionFragment;
        mileageReviewRedemptionFragment.txvCardType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardType'", TextView.class);
        mileageReviewRedemptionFragment.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
        mileageReviewRedemptionFragment.txvItemName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_name, "field 'txvItemName'", TextView.class);
        mileageReviewRedemptionFragment.txvItemDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_description, "field 'txvItemDescription'", TextView.class);
        mileageReviewRedemptionFragment.txvAirlineNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_airline_number, "field 'txvAirlineNumber'", TextView.class);
        mileageReviewRedemptionFragment.txvLastName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_last_name, "field 'txvLastName'", TextView.class);
        mileageReviewRedemptionFragment.txvTotalMiles = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_miles, "field 'txvTotalMiles'", TextView.class);
        mileageReviewRedemptionFragment.txvPointsToRedeem = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_points_to_redeem, "field 'txvPointsToRedeem'", TextView.class);
        mileageReviewRedemptionFragment.milesDeliveryEtaText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.miles_delivery_eta, "field 'milesDeliveryEtaText'", TextView.class);
        mileageReviewRedemptionFragment.termsAndConditionsView = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'termsAndConditionsView'", TermsAndConditionsView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "field 'btnConfirm' and method 'onConfirmClick'");
        mileageReviewRedemptionFragment.btnConfirm = (Button) onStart.write(IconCompatParcelizer, R.id.btn_confirm, "field 'btnConfirm'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MileageReviewRedemptionFragment.this.onConfirmClick();
            }
        });
        mileageReviewRedemptionFragment.txvPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_pts, "field 'txvPoints'", TextView.class);
    }

    public final void read() {
        MileageReviewRedemptionFragment mileageReviewRedemptionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mileageReviewRedemptionFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mileageReviewRedemptionFragment.txvCardType = null;
            mileageReviewRedemptionFragment.txvCardNumber = null;
            mileageReviewRedemptionFragment.txvItemName = null;
            mileageReviewRedemptionFragment.txvItemDescription = null;
            mileageReviewRedemptionFragment.txvAirlineNumber = null;
            mileageReviewRedemptionFragment.txvLastName = null;
            mileageReviewRedemptionFragment.txvTotalMiles = null;
            mileageReviewRedemptionFragment.txvPointsToRedeem = null;
            mileageReviewRedemptionFragment.milesDeliveryEtaText = null;
            mileageReviewRedemptionFragment.termsAndConditionsView = null;
            mileageReviewRedemptionFragment.btnConfirm = null;
            mileageReviewRedemptionFragment.txvPoints = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
