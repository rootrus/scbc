package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwCreateQrActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View RatingCompat;
    private MwCreateQrActivity write;

    public MwCreateQrActivity_ViewBinding(final MwCreateQrActivity mwCreateQrActivity, View view) {
        super(mwCreateQrActivity, view);
        this.write = mwCreateQrActivity;
        mwCreateQrActivity.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr_code, "field 'qrCodeImageView'", ImageView.class);
        mwCreateQrActivity.imageShopCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_shop_cover, "field 'imageShopCover'", ImageView.class);
        mwCreateQrActivity.layoutEmptyShopCover = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_add_shop_cover_container, "field 'layoutEmptyShopCover'", ConstraintLayout.class);
        mwCreateQrActivity.layoutDynamicAmount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_dynamic_amount, "field 'layoutDynamicAmount'", LinearLayout.class);
        mwCreateQrActivity.tvPayWalletId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pay_wallet_id, "field 'tvPayWalletId'", TextView.class);
        mwCreateQrActivity.layoutShopRefence = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_shop_reference, "field 'layoutShopRefence'", LinearLayout.class);
        mwCreateQrActivity.shopReferenceValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_reference_value, "field 'shopReferenceValue'", TextView.class);
        mwCreateQrActivity.amountItem = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amountItem'", CustomTransferAndPayItem.class);
        mwCreateQrActivity.tvNameTH = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_name_th, "field 'tvNameTH'", TextView.class);
        mwCreateQrActivity.tvNameEN = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_name_en, "field 'tvNameEN'", TextView.class);
        mwCreateQrActivity.tvDailyLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_daily_limit_link, "field 'tvDailyLimit'", TextView.class);
        mwCreateQrActivity.tvAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'tvAmount'", TextView.class);
        mwCreateQrActivity.tvAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_account_name, "field 'tvAccountName'", TextView.class);
        mwCreateQrActivity.separator1 = onStart.IconCompatParcelizer(view, R.id.separator1, "field 'separator1'");
        mwCreateQrActivity.separator2 = onStart.IconCompatParcelizer(view, R.id.separator2, "field 'separator2'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_qr_button, "method 'saveSlipButton'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwCreateQrActivity.this.saveSlipButton();
            }
        });
        View findViewById = view.findViewById(R.id.share_button);
        if (findViewById != null) {
            this.RatingCompat = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    MwCreateQrActivity.this.onShareButtonClick();
                }
            });
        }
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.create_qr_code_button, "method 'onCreateQRCodeButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwCreateQrActivity.this.onCreateQRCodeButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnHomeClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwCreateQrActivity.this.onReturnHomeClick();
            }
        });
    }

    public final void read() {
        MwCreateQrActivity mwCreateQrActivity = this.write;
        if (mwCreateQrActivity != null) {
            this.write = null;
            mwCreateQrActivity.qrCodeImageView = null;
            mwCreateQrActivity.imageShopCover = null;
            mwCreateQrActivity.layoutEmptyShopCover = null;
            mwCreateQrActivity.layoutDynamicAmount = null;
            mwCreateQrActivity.tvPayWalletId = null;
            mwCreateQrActivity.layoutShopRefence = null;
            mwCreateQrActivity.shopReferenceValue = null;
            mwCreateQrActivity.amountItem = null;
            mwCreateQrActivity.tvNameTH = null;
            mwCreateQrActivity.tvNameEN = null;
            mwCreateQrActivity.tvDailyLimit = null;
            mwCreateQrActivity.tvAmount = null;
            mwCreateQrActivity.tvAccountName = null;
            mwCreateQrActivity.separator1 = null;
            mwCreateQrActivity.separator2 = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            View view = this.RatingCompat;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.RatingCompat = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
