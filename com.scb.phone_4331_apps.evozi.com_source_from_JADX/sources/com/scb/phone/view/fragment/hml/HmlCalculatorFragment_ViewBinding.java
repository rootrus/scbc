package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import com.scb.phone.view.custom.common.CustomImageWithText;
import com.scb.phone.view.custom.common.CustomRibbonStatus;
import com.scb.phone.view.custom.common.CustomSchedulePayment;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlCalculatorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlCalculatorFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlCalculatorFragment_ViewBinding(final HmlCalculatorFragment hmlCalculatorFragment, View view) {
        super(hmlCalculatorFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlCalculatorFragment;
        hmlCalculatorFragment.rootView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_root, "field 'rootView'", ConstraintLayout.class);
        hmlCalculatorFragment.ribbonStatus = (CustomRibbonStatus) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rb_status, "field 'ribbonStatus'", CustomRibbonStatus.class);
        hmlCalculatorFragment.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
        hmlCalculatorFragment.tvSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle, "field 'tvSubtitle'", TextView.class);
        hmlCalculatorFragment.background = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_background, "field 'background'", ImageView.class);
        hmlCalculatorFragment.loanAmount = (CustomDeltaInputPressed) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_amount, "field 'loanAmount'", CustomDeltaInputPressed.class);
        hmlCalculatorFragment.schedulePayment = (CustomSchedulePayment) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_payment, "field 'schedulePayment'", CustomSchedulePayment.class);
        hmlCalculatorFragment.paymentDay = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_payment_day, "field 'paymentDay'", CustomSpinnerWithTitle.class);
        hmlCalculatorFragment.startPayment = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.start_payment, "field 'startPayment'", CustomSpinnerWithTitle.class);
        hmlCalculatorFragment.calculatorResult = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.calculatorResult, "field 'calculatorResult'", CustomTransferAndPayItem.class);
        hmlCalculatorFragment.promotionsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_promotions_container, "field 'promotionsContainer'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_apply, "field 'btnApply' and method 'onApply'");
        hmlCalculatorFragment.btnApply = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_apply, "field 'btnApply'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlCalculatorFragment.this.onApply();
            }
        });
        hmlCalculatorFragment.productCatalogueContent = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_productcatalogue_content, "field 'productCatalogueContent'", LinearLayout.class);
        hmlCalculatorFragment.productCatalogueArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_productcatalogue_arrow, "field 'productCatalogueArrow'", ImageView.class);
        hmlCalculatorFragment.productCatalogueValidUntil = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_landing_loandetails_valid_until, "field 'productCatalogueValidUntil'", TextView.class);
        hmlCalculatorFragment.interestOptionsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_landing_loandetails_interests, "field 'interestOptionsContainer'", LinearLayout.class);
        hmlCalculatorFragment.productCataloguePromo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_product_catalogue_promo, "field 'productCataloguePromo'", TextView.class);
        hmlCalculatorFragment.consumerInfoItem2ImageText = (CustomImageWithText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_text_info_item_2, "field 'consumerInfoItem2ImageText'", CustomImageWithText.class);
        hmlCalculatorFragment.businessOwnerInfoItem2ImageText = (CustomImageWithText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_text_info_item_2_business_owner, "field 'businessOwnerInfoItem2ImageText'", CustomImageWithText.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cl_productcatalogue_button, "method 'onProductCatalogueClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlCalculatorFragment.this.onProductCatalogueClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_product_details, "method 'onProductDetails'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlCalculatorFragment.this.onProductDetails();
            }
        });
    }

    public final void read() {
        HmlCalculatorFragment hmlCalculatorFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlCalculatorFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlCalculatorFragment.rootView = null;
            hmlCalculatorFragment.ribbonStatus = null;
            hmlCalculatorFragment.tvTitle = null;
            hmlCalculatorFragment.tvSubtitle = null;
            hmlCalculatorFragment.background = null;
            hmlCalculatorFragment.loanAmount = null;
            hmlCalculatorFragment.schedulePayment = null;
            hmlCalculatorFragment.paymentDay = null;
            hmlCalculatorFragment.startPayment = null;
            hmlCalculatorFragment.calculatorResult = null;
            hmlCalculatorFragment.promotionsContainer = null;
            hmlCalculatorFragment.btnApply = null;
            hmlCalculatorFragment.productCatalogueContent = null;
            hmlCalculatorFragment.productCatalogueArrow = null;
            hmlCalculatorFragment.productCatalogueValidUntil = null;
            hmlCalculatorFragment.interestOptionsContainer = null;
            hmlCalculatorFragment.productCataloguePromo = null;
            hmlCalculatorFragment.consumerInfoItem2ImageText = null;
            hmlCalculatorFragment.businessOwnerInfoItem2ImageText = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
