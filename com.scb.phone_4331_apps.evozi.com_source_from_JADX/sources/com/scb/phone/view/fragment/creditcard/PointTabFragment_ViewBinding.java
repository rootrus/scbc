package com.scb.phone.view.fragment.creditcard;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PointTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PointTabFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public PointTabFragment_ViewBinding(final PointTabFragment pointTabFragment, View view) {
        super(pointTabFragment, view);
        this.IconCompatParcelizer = pointTabFragment;
        pointTabFragment.rootView = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'rootView'", ViewGroup.class);
        pointTabFragment.viewHavePoints = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_have_points, "field 'viewHavePoints'", LinearLayout.class);
        pointTabFragment.viewUnablePoints = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_unable_points, "field 'viewUnablePoints'", LinearLayout.class);
        pointTabFragment.tvCreditCardDetailPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_credit_card_detail_points, "field 'tvCreditCardDetailPoints'", TextView.class);
        pointTabFragment.tvPointUnit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_label_point_unit, "field 'tvPointUnit'", TextView.class);
        pointTabFragment.remarksLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remarks_layout, "field 'remarksLayout'", LinearLayout.class);
        pointTabFragment.tvExpireRemarks = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_expire_remarks, "field 'tvExpireRemarks'", TextView.class);
        pointTabFragment.tvMCardRemarks = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_m_card_remarks, "field 'tvMCardRemarks'", TextView.class);
        pointTabFragment.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_message, "field 'errorMessage'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.cs_layout_e_coupon, "field 'myECouponLayout' and method 'onClickMyECoupon'");
        pointTabFragment.myECouponLayout = (ConstraintLayout) onStart.write(IconCompatParcelizer2, R.id.cs_layout_e_coupon, "field 'myECouponLayout'", ConstraintLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PointTabFragment.this.onClickMyECoupon();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cs_layout_redeem_point, "field 'redeemPointLayout' and method 'onClickRedeemPoint'");
        pointTabFragment.redeemPointLayout = (ConstraintLayout) onStart.write(IconCompatParcelizer3, R.id.cs_layout_redeem_point, "field 'redeemPointLayout'", ConstraintLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PointTabFragment.this.onClickRedeemPoint();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cs_layout_pay_with_point, "field 'payWithPointLayout' and method 'onClickPayWithPoint'");
        pointTabFragment.payWithPointLayout = (ConstraintLayout) onStart.write(IconCompatParcelizer4, R.id.cs_layout_pay_with_point, "field 'payWithPointLayout'", ConstraintLayout.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PointTabFragment.this.onClickPayWithPoint();
            }
        });
        pointTabFragment.lineAboveGroupMenu = onStart.IconCompatParcelizer(view, R.id.vw_divider_above_group_menu, "field 'lineAboveGroupMenu'");
        pointTabFragment.llContentViewLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_content_view_layout, "field 'llContentViewLayout'", LinearLayout.class);
        pointTabFragment.llErrorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root_error_layout, "field 'llErrorLayout'", LinearLayout.class);
        pointTabFragment.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_error_title, "field 'tvErrorTitle'", TextView.class);
        pointTabFragment.tvErrorDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_generic_error, "field 'tvErrorDesc'", TextView.class);
        pointTabFragment.ivErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_error_icon, "field 'ivErrorIcon'", ImageView.class);
    }

    public final void read() {
        PointTabFragment pointTabFragment = this.IconCompatParcelizer;
        if (pointTabFragment != null) {
            this.IconCompatParcelizer = null;
            pointTabFragment.rootView = null;
            pointTabFragment.viewHavePoints = null;
            pointTabFragment.viewUnablePoints = null;
            pointTabFragment.tvCreditCardDetailPoints = null;
            pointTabFragment.tvPointUnit = null;
            pointTabFragment.remarksLayout = null;
            pointTabFragment.tvExpireRemarks = null;
            pointTabFragment.tvMCardRemarks = null;
            pointTabFragment.errorMessage = null;
            pointTabFragment.myECouponLayout = null;
            pointTabFragment.redeemPointLayout = null;
            pointTabFragment.payWithPointLayout = null;
            pointTabFragment.lineAboveGroupMenu = null;
            pointTabFragment.llContentViewLayout = null;
            pointTabFragment.llErrorLayout = null;
            pointTabFragment.tvErrorTitle = null;
            pointTabFragment.tvErrorDesc = null;
            pointTabFragment.ivErrorIcon = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
