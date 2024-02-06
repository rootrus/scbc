package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ECouponReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ECouponReviewFragment write;

    public ECouponReviewFragment_ViewBinding(final ECouponReviewFragment eCouponReviewFragment, View view) {
        super(eCouponReviewFragment, view);
        this.write = eCouponReviewFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_confirm, "field 'btnConfirm' and method 'onNextClick'");
        eCouponReviewFragment.btnConfirm = (Button) onStart.write(IconCompatParcelizer, R.id.bt_confirm, "field 'btnConfirm'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ECouponReviewFragment.this.onNextClick();
            }
        });
        eCouponReviewFragment.cardView = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctps_card, "field 'cardView'", CustomTransferAndPaySource.class);
        eCouponReviewFragment.itemView = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctps_item, "field 'itemView'", CustomTransferAndPaySource.class);
        eCouponReviewFragment.tcView = (TermsAndConditionsView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'tcView'", TermsAndConditionsView.class);
        eCouponReviewFragment.txtRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'txtRemark'", TextView.class);
        eCouponReviewFragment.tvPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point, "field 'tvPoint'", TextView.class);
    }

    public final void read() {
        ECouponReviewFragment eCouponReviewFragment = this.write;
        if (eCouponReviewFragment != null) {
            this.write = null;
            eCouponReviewFragment.btnConfirm = null;
            eCouponReviewFragment.cardView = null;
            eCouponReviewFragment.itemView = null;
            eCouponReviewFragment.tcView = null;
            eCouponReviewFragment.txtRemark = null;
            eCouponReviewFragment.tvPoint = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
