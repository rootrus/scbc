package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ECouponDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ECouponDetailFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public ECouponDetailFragment_ViewBinding(final ECouponDetailFragment eCouponDetailFragment, View view) {
        super(eCouponDetailFragment, view);
        this.IconCompatParcelizer = eCouponDetailFragment;
        eCouponDetailFragment.imageCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_e_coupon_detail_cover, "field 'imageCover'", ImageView.class);
        eCouponDetailFragment.txvAvailability = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_availability, "field 'txvAvailability'", TextView.class);
        eCouponDetailFragment.txvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_name, "field 'txvName'", TextView.class);
        eCouponDetailFragment.txvDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_description, "field 'txvDescription'", TextView.class);
        eCouponDetailFragment.txvValidityDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_validity_date, "field 'txvValidityDate'", TextView.class);
        eCouponDetailFragment.txvPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_point, "field 'txvPoint'", TextView.class);
        eCouponDetailFragment.txvPointWarning = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_point_warning, "field 'txvPointWarning'", TextView.class);
        eCouponDetailFragment.txvCondition = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_condition, "field 'txvCondition'", TextView.class);
        eCouponDetailFragment.txvWarningTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_warning_time, "field 'txvWarningTime'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_e_coupon_detail_next, "field 'btnNext' and method 'onNextClick'");
        eCouponDetailFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_e_coupon_detail_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ECouponDetailFragment.this.onNextClick();
            }
        });
        eCouponDetailFragment.conditionLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_e_coupon_detail_condition_layout, "field 'conditionLayout'", LinearLayout.class);
        eCouponDetailFragment.warningTimeSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_e_coupon_detail_warning_time_section, "field 'warningTimeSection'", LinearLayout.class);
    }

    public final void read() {
        ECouponDetailFragment eCouponDetailFragment = this.IconCompatParcelizer;
        if (eCouponDetailFragment != null) {
            this.IconCompatParcelizer = null;
            eCouponDetailFragment.imageCover = null;
            eCouponDetailFragment.txvAvailability = null;
            eCouponDetailFragment.txvName = null;
            eCouponDetailFragment.txvDescription = null;
            eCouponDetailFragment.txvValidityDate = null;
            eCouponDetailFragment.txvPoint = null;
            eCouponDetailFragment.txvPointWarning = null;
            eCouponDetailFragment.txvCondition = null;
            eCouponDetailFragment.txvWarningTime = null;
            eCouponDetailFragment.btnNext = null;
            eCouponDetailFragment.conditionLayout = null;
            eCouponDetailFragment.warningTimeSection = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
