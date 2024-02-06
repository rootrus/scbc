package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBaseLoanReviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBaseLoanReviewActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlBaseLoanReviewActivity_ViewBinding(final HmlBaseLoanReviewActivity hmlBaseLoanReviewActivity, View view) {
        super(hmlBaseLoanReviewActivity, view);
        this.MediaBrowserCompat$ItemReceiver = hmlBaseLoanReviewActivity;
        hmlBaseLoanReviewActivity.loanInformationContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_loan_information_container, "field 'loanInformationContainer'", LinearLayout.class);
        hmlBaseLoanReviewActivity.accountsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_accounts_container, "field 'accountsContainer'", LinearLayout.class);
        hmlBaseLoanReviewActivity.taxFeesContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_tax_fees_container, "field 'taxFeesContainer'", LinearLayout.class);
        hmlBaseLoanReviewActivity.netAmountView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cl_net_amount_group, "field 'netAmountView'", ConstraintLayout.class);
        hmlBaseLoanReviewActivity.netAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_net_amount, "field 'netAmount'", TextView.class);
        hmlBaseLoanReviewActivity.taxFeesTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tax_fees_title, "field 'taxFeesTitle'", TextView.class);
        hmlBaseLoanReviewActivity.repaymentDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_date, "field 'repaymentDate'", TextView.class);
        hmlBaseLoanReviewActivity.estatementMailTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_estatement_title, "field 'estatementMailTitle'", TextView.class);
        hmlBaseLoanReviewActivity.estatementMail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_estatement, "field 'estatementMail'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.cb_terms_and_conditions, "field 'termsConditionsCheckbox' and method 'onCheckboxChanged'");
        hmlBaseLoanReviewActivity.termsConditionsCheckbox = (CheckBox) onStart.write(IconCompatParcelizer, R.id.cb_terms_and_conditions, "field 'termsConditionsCheckbox'", CheckBox.class);
        this.write = IconCompatParcelizer;
        ((CompoundButton) IconCompatParcelizer).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBaseLoanReviewActivity.this.onCheckboxChanged();
            }
        });
        hmlBaseLoanReviewActivity.termsConditionsText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_terms_and_conditions, "field 'termsConditionsText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_accept, "field 'btnAccept' and method 'onBtnAcceptClicked'");
        hmlBaseLoanReviewActivity.btnAccept = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_accept, "field 'btnAccept'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBaseLoanReviewActivity.this.onBtnAcceptClicked();
            }
        });
        hmlBaseLoanReviewActivity.attentionBox = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_attention_description, "field 'attentionBox'", ThaiTextView.class);
    }

    public final void read() {
        HmlBaseLoanReviewActivity hmlBaseLoanReviewActivity = this.MediaBrowserCompat$ItemReceiver;
        if (hmlBaseLoanReviewActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlBaseLoanReviewActivity.loanInformationContainer = null;
            hmlBaseLoanReviewActivity.accountsContainer = null;
            hmlBaseLoanReviewActivity.taxFeesContainer = null;
            hmlBaseLoanReviewActivity.netAmountView = null;
            hmlBaseLoanReviewActivity.netAmount = null;
            hmlBaseLoanReviewActivity.taxFeesTitle = null;
            hmlBaseLoanReviewActivity.repaymentDate = null;
            hmlBaseLoanReviewActivity.estatementMailTitle = null;
            hmlBaseLoanReviewActivity.estatementMail = null;
            hmlBaseLoanReviewActivity.termsConditionsCheckbox = null;
            hmlBaseLoanReviewActivity.termsConditionsText = null;
            hmlBaseLoanReviewActivity.btnAccept = null;
            hmlBaseLoanReviewActivity.attentionBox = null;
            ((CompoundButton) this.write).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
