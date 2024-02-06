package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwReviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public MwReviewActivity_ViewBinding(final MwReviewActivity mwReviewActivity, View view) {
        super(mwReviewActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mwReviewActivity;
        mwReviewActivity.imgShopPhoto = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.img_mw_review_shop_photo, "field 'imgShopPhoto'", ImageView.class);
        mwReviewActivity.tvReceivingAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_review_receiving_account, "field 'tvReceivingAccount'", TextView.class);
        mwReviewActivity.tvAcountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_review_account_number, "field 'tvAcountNumber'", TextView.class);
        mwReviewActivity.tvShopOwner = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_review_shop_owner, "field 'tvShopOwner'", TextView.class);
        mwReviewActivity.tvShopName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_review_shop_name, "field 'tvShopName'", TextView.class);
        mwReviewActivity.tvShopType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_review_shop_type, "field 'tvShopType'", TextView.class);
        mwReviewActivity.imgBankLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.img_mw_review_bank_icon, "field 'imgBankLogo'", ImageView.class);
        mwReviewActivity.shopCoverEmpty = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_add_shop_cover_container, "field 'shopCoverEmpty'", ConstraintLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_review_confirm, "method 'onClickConfirm'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwReviewActivity.this.onClickConfirm();
            }
        });
    }

    public final void read() {
        MwReviewActivity mwReviewActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mwReviewActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mwReviewActivity.imgShopPhoto = null;
            mwReviewActivity.tvReceivingAccount = null;
            mwReviewActivity.tvAcountNumber = null;
            mwReviewActivity.tvShopOwner = null;
            mwReviewActivity.tvShopName = null;
            mwReviewActivity.tvShopType = null;
            mwReviewActivity.imgBankLogo = null;
            mwReviewActivity.shopCoverEmpty = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
