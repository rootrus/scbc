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

public final class ECouponBarCodeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ECouponBarCodeFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public ECouponBarCodeFragment_ViewBinding(final ECouponBarCodeFragment eCouponBarCodeFragment, View view) {
        super(eCouponBarCodeFragment, view);
        this.IconCompatParcelizer = eCouponBarCodeFragment;
        eCouponBarCodeFragment.tvTimeExpiredTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_time_expired_title, "field 'tvTimeExpiredTitle'", TextView.class);
        eCouponBarCodeFragment.tvTitleCoupon = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_name, "field 'tvTitleCoupon'", TextView.class);
        eCouponBarCodeFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_remark, "field 'tvRemark'", TextView.class);
        eCouponBarCodeFragment.tvDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_e_coupon_detail_description, "field 'tvDesc'", TextView.class);
        eCouponBarCodeFragment.tvValidityValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_validity_value, "field 'tvValidityValue'", TextView.class);
        eCouponBarCodeFragment.tvRefIdValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id_value, "field 'tvRefIdValue'", TextView.class);
        eCouponBarCodeFragment.tvTimeCountDown = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_time_count_down, "field 'tvTimeCountDown'", TextView.class);
        eCouponBarCodeFragment.ivECouponDetail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_e_coupon_detail, "field 'ivECouponDetail'", ImageView.class);
        eCouponBarCodeFragment.ivBarcode = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_barcode, "field 'ivBarcode'", ImageView.class);
        eCouponBarCodeFragment.ivQRCode = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr_code, "field 'ivQRCode'", ImageView.class);
        eCouponBarCodeFragment.tvBarcodeResult = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_barcode_result, "field 'tvBarcodeResult'", TextView.class);
        eCouponBarCodeFragment.tvQRCodeResult = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_qr_code_result, "field 'tvQRCodeResult'", TextView.class);
        eCouponBarCodeFragment.timeCountDownLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_time_count_down_layout, "field 'timeCountDownLayout'", LinearLayout.class);
        eCouponBarCodeFragment.barCodeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_bar_code_layout, "field 'barCodeLayout'", LinearLayout.class);
        eCouponBarCodeFragment.rootLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root_layout, "field 'rootLayout'", LinearLayout.class);
        eCouponBarCodeFragment.ivTimerActive = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_e_coupon_timer_active, "field 'ivTimerActive'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_deactivate, "field 'buttonDeactivate' and method 'onClickDeactivate'");
        eCouponBarCodeFragment.buttonDeactivate = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_deactivate, "field 'buttonDeactivate'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ECouponBarCodeFragment.this.onClickDeactivate();
            }
        });
        eCouponBarCodeFragment.lineAboveTimeCountDownLayout = onStart.IconCompatParcelizer(view, R.id.vw_line_above_time_count_down_layout, "field 'lineAboveTimeCountDownLayout'");
    }

    public final void read() {
        ECouponBarCodeFragment eCouponBarCodeFragment = this.IconCompatParcelizer;
        if (eCouponBarCodeFragment != null) {
            this.IconCompatParcelizer = null;
            eCouponBarCodeFragment.tvTimeExpiredTitle = null;
            eCouponBarCodeFragment.tvTitleCoupon = null;
            eCouponBarCodeFragment.tvRemark = null;
            eCouponBarCodeFragment.tvDesc = null;
            eCouponBarCodeFragment.tvValidityValue = null;
            eCouponBarCodeFragment.tvRefIdValue = null;
            eCouponBarCodeFragment.tvTimeCountDown = null;
            eCouponBarCodeFragment.ivECouponDetail = null;
            eCouponBarCodeFragment.ivBarcode = null;
            eCouponBarCodeFragment.ivQRCode = null;
            eCouponBarCodeFragment.tvBarcodeResult = null;
            eCouponBarCodeFragment.tvQRCodeResult = null;
            eCouponBarCodeFragment.timeCountDownLayout = null;
            eCouponBarCodeFragment.barCodeLayout = null;
            eCouponBarCodeFragment.rootLayout = null;
            eCouponBarCodeFragment.ivTimerActive = null;
            eCouponBarCodeFragment.buttonDeactivate = null;
            eCouponBarCodeFragment.lineAboveTimeCountDownLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
