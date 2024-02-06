package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwOnBoardSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwOnBoardSuccessActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public MwOnBoardSuccessActivity_ViewBinding(final MwOnBoardSuccessActivity mwOnBoardSuccessActivity, View view) {
        super(mwOnBoardSuccessActivity, view);
        this.IconCompatParcelizer = mwOnBoardSuccessActivity;
        mwOnBoardSuccessActivity.tvSuccessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvSuccessTitle'", TextView.class);
        mwOnBoardSuccessActivity.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time, "field 'tvDateTime'", TextView.class);
        mwOnBoardSuccessActivity.imgMerchantWallet = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_shop_cover, "field 'imgMerchantWallet'", ImageView.class);
        mwOnBoardSuccessActivity.shopCoverEmpty = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_add_shop_cover_container, "field 'shopCoverEmpty'", ConstraintLayout.class);
        mwOnBoardSuccessActivity.tvWalletNickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_wallet_nickname, "field 'tvWalletNickname'", TextView.class);
        mwOnBoardSuccessActivity.editTextNickname = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nickname_edit_text, "field 'editTextNickname'", EditText.class);
        mwOnBoardSuccessActivity.tvWalletNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wallet_number_text, "field 'tvWalletNumber'", TextView.class);
        mwOnBoardSuccessActivity.tvLinkedAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linked_account_text, "field 'tvLinkedAccount'", TextView.class);
        mwOnBoardSuccessActivity.tvAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number_text, "field 'tvAccountNumber'", TextView.class);
        mwOnBoardSuccessActivity.tvOwnerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.owner_name_text, "field 'tvOwnerName'", TextView.class);
        mwOnBoardSuccessActivity.tvShopName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_name_text, "field 'tvShopName'", TextView.class);
        mwOnBoardSuccessActivity.tvShopType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_type_text, "field 'tvShopType'", TextView.class);
        mwOnBoardSuccessActivity.layoutHaveNickname = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_have_nickname, "field 'layoutHaveNickname'", ViewGroup.class);
        mwOnBoardSuccessActivity.layoutEditNickname = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_edit_nickname, "field 'layoutEditNickname'", ViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.create_nickname_button, "field 'buttonCreateNickname' and method 'onCreateNicknameClick'");
        mwOnBoardSuccessActivity.buttonCreateNickname = (Button) onStart.write(IconCompatParcelizer2, R.id.create_nickname_button, "field 'buttonCreateNickname'", Button.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onCreateNicknameClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.iv_gmb_banner, "field 'ivGmbBanner' and method 'onGMBClick'");
        mwOnBoardSuccessActivity.ivGmbBanner = (ImageView) onStart.write(IconCompatParcelizer3, R.id.iv_gmb_banner, "field 'ivGmbBanner'", ImageView.class);
        this.RatingCompat = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onGMBClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_gmb_activate_account, "field 'btnGmbAccount' and method 'onGMBClick'");
        mwOnBoardSuccessActivity.btnGmbAccount = (Button) onStart.write(IconCompatParcelizer4, R.id.btn_gmb_activate_account, "field 'btnGmbAccount'", Button.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onGMBClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_gmb_get_started, "field 'btnGmbGetStarted' and method 'onNextClick'");
        mwOnBoardSuccessActivity.btnGmbGetStarted = (Button) onStart.write(IconCompatParcelizer5, R.id.btn_gmb_get_started, "field 'btnGmbGetStarted'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onNextClick();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.btn_get_started, "field 'btnGetStarted' and method 'onNextClick'");
        mwOnBoardSuccessActivity.btnGetStarted = (Button) onStart.write(IconCompatParcelizer6, R.id.btn_get_started, "field 'btnGetStarted'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onNextClick();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.edit_nickname_button, "method 'onEditNicknameClick'");
        this.MediaMetadataCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onEditNicknameClick();
            }
        });
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.done_nickname_button, "method 'onDoneNicknameClick'");
        this.MediaDescriptionCompat = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onDoneNicknameClick();
            }
        });
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.nickname_edit_clear, "method 'onClearNicknameClick'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnBoardSuccessActivity.this.onClearNicknameClick();
            }
        });
    }

    public final void read() {
        MwOnBoardSuccessActivity mwOnBoardSuccessActivity = this.IconCompatParcelizer;
        if (mwOnBoardSuccessActivity != null) {
            this.IconCompatParcelizer = null;
            mwOnBoardSuccessActivity.tvSuccessTitle = null;
            mwOnBoardSuccessActivity.tvDateTime = null;
            mwOnBoardSuccessActivity.imgMerchantWallet = null;
            mwOnBoardSuccessActivity.shopCoverEmpty = null;
            mwOnBoardSuccessActivity.tvWalletNickname = null;
            mwOnBoardSuccessActivity.editTextNickname = null;
            mwOnBoardSuccessActivity.tvWalletNumber = null;
            mwOnBoardSuccessActivity.tvLinkedAccount = null;
            mwOnBoardSuccessActivity.tvAccountNumber = null;
            mwOnBoardSuccessActivity.tvOwnerName = null;
            mwOnBoardSuccessActivity.tvShopName = null;
            mwOnBoardSuccessActivity.tvShopType = null;
            mwOnBoardSuccessActivity.layoutHaveNickname = null;
            mwOnBoardSuccessActivity.layoutEditNickname = null;
            mwOnBoardSuccessActivity.buttonCreateNickname = null;
            mwOnBoardSuccessActivity.ivGmbBanner = null;
            mwOnBoardSuccessActivity.btnGmbAccount = null;
            mwOnBoardSuccessActivity.btnGmbGetStarted = null;
            mwOnBoardSuccessActivity.btnGetStarted = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
