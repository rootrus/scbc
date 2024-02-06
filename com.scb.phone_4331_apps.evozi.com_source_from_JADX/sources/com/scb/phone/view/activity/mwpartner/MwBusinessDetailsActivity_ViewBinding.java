package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.EditTextDecorator;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwBusinessDetailsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private MwBusinessDetailsActivity write;

    public MwBusinessDetailsActivity_ViewBinding(final MwBusinessDetailsActivity mwBusinessDetailsActivity, View view) {
        super(mwBusinessDetailsActivity, view);
        this.write = mwBusinessDetailsActivity;
        mwBusinessDetailsActivity.ivShopCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_shop_cover, "field 'ivShopCover'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_delete_icon, "field 'ivDeleteIcon' and method 'onDeleteClick'");
        mwBusinessDetailsActivity.ivDeleteIcon = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_delete_icon, "field 'ivDeleteIcon'", ImageView.class);
        this.MediaDescriptionCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBusinessDetailsActivity.this.onDeleteClick();
            }
        });
        mwBusinessDetailsActivity.llShopPhotoContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_shop_photo_container, "field 'llShopPhotoContainer'", LinearLayout.class);
        mwBusinessDetailsActivity.tvShopCategoryLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_shop_category_label, "field 'tvShopCategoryLabel'", TextView.class);
        mwBusinessDetailsActivity.tvShopSubCategoryLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_shop_sub_category_label, "field 'tvShopSubCategoryLabel'", TextView.class);
        mwBusinessDetailsActivity.tvShopEstimatedSalesLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_shop_estimated_sales_label, "field 'tvShopEstimatedSalesLabel'", TextView.class);
        mwBusinessDetailsActivity.tvKymNotice = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_kym_notice, "field 'tvKymNotice'", TextView.class);
        mwBusinessDetailsActivity.tvUploadPhotoError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_upload_photo_error, "field 'tvUploadPhotoError'", TextView.class);
        mwBusinessDetailsActivity.tvShopPhoto = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_shop_photo, "field 'tvShopPhoto'", TextView.class);
        mwBusinessDetailsActivity.ivAddShopCover = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_add_shop_cover, "field 'ivAddShopCover'", ImageView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_choose_photo, "field 'btnChoosePhoto' and method 'onChoosePhotoClick'");
        mwBusinessDetailsActivity.btnChoosePhoto = (Button) onStart.write(IconCompatParcelizer3, R.id.btn_choose_photo, "field 'btnChoosePhoto'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBusinessDetailsActivity.this.onChoosePhotoClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_take_photo, "field 'btnTakePhoto' and method 'onTakePhotoClickBeforeCheck'");
        mwBusinessDetailsActivity.btnTakePhoto = (Button) onStart.write(IconCompatParcelizer4, R.id.btn_take_photo, "field 'btnTakePhoto'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBusinessDetailsActivity.this.onTakePhotoClickBeforeCheck();
            }
        });
        mwBusinessDetailsActivity.llAddShopPhotoContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_add_shop_photo_container, "field 'llAddShopPhotoContainer'", LinearLayout.class);
        mwBusinessDetailsActivity.tvPersonalInformation1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_personal_information_1, "field 'tvPersonalInformation1'", TextView.class);
        mwBusinessDetailsActivity.tvNameLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name_label, "field 'tvNameLabel'", TextView.class);
        mwBusinessDetailsActivity.tvNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name_value, "field 'tvNameValue'", TextView.class);
        mwBusinessDetailsActivity.etLineId = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_line_id, "field 'etLineId'", EditText.class);
        mwBusinessDetailsActivity.etdLineId = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_line_id, "field 'etdLineId'", EditTextDecorator.class);
        mwBusinessDetailsActivity.tvBusinessInformation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_business_information, "field 'tvBusinessInformation'", TextView.class);
        mwBusinessDetailsActivity.etThaiShopName = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_thai_shop_name, "field 'etThaiShopName'", EditText.class);
        mwBusinessDetailsActivity.etdThaiShopName = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_thai_shop_name, "field 'etdThaiShopName'", EditTextDecorator.class);
        mwBusinessDetailsActivity.etEnglishShopName = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_english_shop_name, "field 'etEnglishShopName'", EditText.class);
        mwBusinessDetailsActivity.etdEnglishShopName = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_english_shop_name, "field 'etdEnglishShopName'", EditTextDecorator.class);
        mwBusinessDetailsActivity.etShopPhoneNumber = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_shop_phone_number, "field 'etShopPhoneNumber'", EditText.class);
        mwBusinessDetailsActivity.etdShopPhoneNumber = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_shop_phone_number, "field 'etdShopPhoneNumber'", EditTextDecorator.class);
        mwBusinessDetailsActivity.etShopEmail = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_shop_email, "field 'etShopEmail'", EditText.class);
        mwBusinessDetailsActivity.etdShopEmail = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_shop_email, "field 'etdShopEmail'", EditTextDecorator.class);
        mwBusinessDetailsActivity.tvPersonalInformation2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_personal_information_2, "field 'tvPersonalInformation2'", TextView.class);
        mwBusinessDetailsActivity.etReferralCode = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_referral_code, "field 'etReferralCode'", EditText.class);
        mwBusinessDetailsActivity.etdReferralCode = (EditTextDecorator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etd_referral_code, "field 'etdReferralCode'", EditTextDecorator.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'btnNext' and method 'onNextClick'");
        mwBusinessDetailsActivity.btnNext = (Button) onStart.write(IconCompatParcelizer5, R.id.btn_next, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwBusinessDetailsActivity.this.onNextClick();
            }
        });
        mwBusinessDetailsActivity.spinnerCategory = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_category, "field 'spinnerCategory'", Spinner.class);
        mwBusinessDetailsActivity.spinnerSubCategory = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_sub_category, "field 'spinnerSubCategory'", Spinner.class);
        mwBusinessDetailsActivity.spinnerEstimatedSales = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_estimated_sales, "field 'spinnerEstimatedSales'", Spinner.class);
    }

    public final void read() {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.write;
        if (mwBusinessDetailsActivity != null) {
            this.write = null;
            mwBusinessDetailsActivity.ivShopCover = null;
            mwBusinessDetailsActivity.ivDeleteIcon = null;
            mwBusinessDetailsActivity.llShopPhotoContainer = null;
            mwBusinessDetailsActivity.tvShopCategoryLabel = null;
            mwBusinessDetailsActivity.tvShopSubCategoryLabel = null;
            mwBusinessDetailsActivity.tvShopEstimatedSalesLabel = null;
            mwBusinessDetailsActivity.tvKymNotice = null;
            mwBusinessDetailsActivity.tvUploadPhotoError = null;
            mwBusinessDetailsActivity.tvShopPhoto = null;
            mwBusinessDetailsActivity.ivAddShopCover = null;
            mwBusinessDetailsActivity.btnChoosePhoto = null;
            mwBusinessDetailsActivity.btnTakePhoto = null;
            mwBusinessDetailsActivity.llAddShopPhotoContainer = null;
            mwBusinessDetailsActivity.tvPersonalInformation1 = null;
            mwBusinessDetailsActivity.tvNameLabel = null;
            mwBusinessDetailsActivity.tvNameValue = null;
            mwBusinessDetailsActivity.etLineId = null;
            mwBusinessDetailsActivity.etdLineId = null;
            mwBusinessDetailsActivity.tvBusinessInformation = null;
            mwBusinessDetailsActivity.etThaiShopName = null;
            mwBusinessDetailsActivity.etdThaiShopName = null;
            mwBusinessDetailsActivity.etEnglishShopName = null;
            mwBusinessDetailsActivity.etdEnglishShopName = null;
            mwBusinessDetailsActivity.etShopPhoneNumber = null;
            mwBusinessDetailsActivity.etdShopPhoneNumber = null;
            mwBusinessDetailsActivity.etShopEmail = null;
            mwBusinessDetailsActivity.etdShopEmail = null;
            mwBusinessDetailsActivity.tvPersonalInformation2 = null;
            mwBusinessDetailsActivity.etReferralCode = null;
            mwBusinessDetailsActivity.etdReferralCode = null;
            mwBusinessDetailsActivity.btnNext = null;
            mwBusinessDetailsActivity.spinnerCategory = null;
            mwBusinessDetailsActivity.spinnerSubCategory = null;
            mwBusinessDetailsActivity.spinnerEstimatedSales = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
