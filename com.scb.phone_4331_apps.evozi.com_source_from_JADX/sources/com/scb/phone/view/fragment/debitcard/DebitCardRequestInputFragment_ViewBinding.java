package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class DebitCardRequestInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardRequestInputFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public DebitCardRequestInputFragment_ViewBinding(final DebitCardRequestInputFragment debitCardRequestInputFragment, View view) {
        super(debitCardRequestInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = debitCardRequestInputFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.new_card_button, "field 'newCardButton' and method 'onNewCardButtonClick'");
        debitCardRequestInputFragment.newCardButton = (Button) onStart.write(IconCompatParcelizer2, R.id.new_card_button, "field 'newCardButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardRequestInputFragment.this.onNewCardButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.replace_card_button, "field 'replaceCardButton' and method 'onReplaceCardButtonClick'");
        debitCardRequestInputFragment.replaceCardButton = (Button) onStart.write(IconCompatParcelizer3, R.id.replace_card_button, "field 'replaceCardButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardRequestInputFragment.this.onReplaceCardButtonClick();
            }
        });
        debitCardRequestInputFragment.existingDebitCardsGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.existing_debit_cards_group, "field 'existingDebitCardsGroup'", Group.class);
        debitCardRequestInputFragment.debitCardSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.debit_card_spinner, "field 'debitCardSpinner'", CustomSpinnerWithTitle.class);
        debitCardRequestInputFragment.selectDebitCardSection = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_debit_card_type_section, "field 'selectDebitCardSection'", Group.class);
        debitCardRequestInputFragment.termsAndConditionGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions, "field 'termsAndConditionGroup'", Group.class);
        debitCardRequestInputFragment.cardViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'cardViewPager'", ViewPager.class);
        debitCardRequestInputFragment.circleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.circle_indicator, "field 'circleIndicator'", CircleIndicator.class);
        debitCardRequestInputFragment.annualFeeSection = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.annual_fee, "field 'annualFeeSection'", CustomTransferAndPayItem.class);
        debitCardRequestInputFragment.issuingFeeSection = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.issuing_fee, "field 'issuingFeeSection'", CustomTransferAndPayItem.class);
        debitCardRequestInputFragment.deliveryFeeSection = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delivery_fee, "field 'deliveryFeeSection'", CustomTransferAndPayItem.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.review_button, "field 'reviewButton' and method 'onReviewbuttonClick'");
        debitCardRequestInputFragment.reviewButton = (Button) onStart.write(IconCompatParcelizer4, R.id.review_button, "field 'reviewButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardRequestInputFragment.this.onReviewbuttonClick();
            }
        });
        debitCardRequestInputFragment.tvDebitCardTypeTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_label, "field 'tvDebitCardTypeTitle'", TextView.class);
        debitCardRequestInputFragment.tvBasicAccountRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_basic_account_remark, "field 'tvBasicAccountRemark'", TextView.class);
        debitCardRequestInputFragment.noDebitCardErrorView = onStart.IconCompatParcelizer(view, R.id.no_debit_card_available, "field 'noDebitCardErrorView'");
        debitCardRequestInputFragment.termsAndConditionCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terms_and_conditions_cb, "field 'termsAndConditionCheckBox'", CheckBox.class);
        debitCardRequestInputFragment.saleSheetLink = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sale_sheet_tv, "field 'saleSheetLink'", TextView.class);
    }

    public final void read() {
        DebitCardRequestInputFragment debitCardRequestInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardRequestInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            debitCardRequestInputFragment.newCardButton = null;
            debitCardRequestInputFragment.replaceCardButton = null;
            debitCardRequestInputFragment.existingDebitCardsGroup = null;
            debitCardRequestInputFragment.debitCardSpinner = null;
            debitCardRequestInputFragment.selectDebitCardSection = null;
            debitCardRequestInputFragment.termsAndConditionGroup = null;
            debitCardRequestInputFragment.cardViewPager = null;
            debitCardRequestInputFragment.circleIndicator = null;
            debitCardRequestInputFragment.annualFeeSection = null;
            debitCardRequestInputFragment.issuingFeeSection = null;
            debitCardRequestInputFragment.deliveryFeeSection = null;
            debitCardRequestInputFragment.reviewButton = null;
            debitCardRequestInputFragment.tvDebitCardTypeTitle = null;
            debitCardRequestInputFragment.tvBasicAccountRemark = null;
            debitCardRequestInputFragment.noDebitCardErrorView = null;
            debitCardRequestInputFragment.termsAndConditionCheckBox = null;
            debitCardRequestInputFragment.saleSheetLink = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
