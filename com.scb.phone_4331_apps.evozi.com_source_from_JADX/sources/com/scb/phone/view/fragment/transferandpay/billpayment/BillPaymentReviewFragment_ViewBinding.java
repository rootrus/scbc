package com.scb.phone.view.fragment.transferandpay.billpayment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomPhotoLeftDetails;
import com.scb.phone.view.fragment.transferandpay.BaseReviewFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BillPaymentReviewFragment_ViewBinding extends BaseReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private BillPaymentReviewFragment write;

    public BillPaymentReviewFragment_ViewBinding(final BillPaymentReviewFragment billPaymentReviewFragment, View view) {
        super(billPaymentReviewFragment, view);
        this.write = billPaymentReviewFragment;
        billPaymentReviewFragment.banner = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banner_text_view, "field 'banner'", TextView.class);
        billPaymentReviewFragment.reviewLayout = onStart.IconCompatParcelizer(view, R.id.chubb_common_transfer_and_pay_review, "field 'reviewLayout'");
        billPaymentReviewFragment.movieDetails = (CustomPhotoLeftDetails) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.movie_details, "field 'movieDetails'", CustomPhotoLeftDetails.class);
        billPaymentReviewFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        billPaymentReviewFragment.unexpectedDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'unexpectedDivider'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'btnContinue' and method 'onClickConfirm'");
        billPaymentReviewFragment.btnContinue = (Button) onStart.write(IconCompatParcelizer2, R.id.button_continue, "field 'btnContinue'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BillPaymentReviewFragment.this.onClickConfirm();
            }
        });
        billPaymentReviewFragment.paymentLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payment_info_view, "field 'paymentLayout'", LinearLayout.class);
    }

    public final void read() {
        BillPaymentReviewFragment billPaymentReviewFragment = this.write;
        if (billPaymentReviewFragment != null) {
            this.write = null;
            billPaymentReviewFragment.banner = null;
            billPaymentReviewFragment.reviewLayout = null;
            billPaymentReviewFragment.movieDetails = null;
            billPaymentReviewFragment.recyclerView = null;
            billPaymentReviewFragment.unexpectedDivider = null;
            billPaymentReviewFragment.btnContinue = null;
            billPaymentReviewFragment.paymentLayout = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
