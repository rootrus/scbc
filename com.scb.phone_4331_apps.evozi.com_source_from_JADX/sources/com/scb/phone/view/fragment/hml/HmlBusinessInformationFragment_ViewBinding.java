package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlBusinessInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlBusinessInformationFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private View f5442x50fd9e4a;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View MediaSessionCompat$QueueItem;
    private View MediaSessionCompat$Token;
    private View RatingCompat;
    private View write;

    public HmlBusinessInformationFragment_ViewBinding(final HmlBusinessInformationFragment hmlBusinessInformationFragment, View view) {
        super(hmlBusinessInformationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessInformationFragment;
        hmlBusinessInformationFragment.root = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_root, "field 'root'", RelativeLayout.class);
        hmlBusinessInformationFragment.breadcrumbs = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.psb_breadcrumbs, "field 'breadcrumbs'", ProgressStateBar.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_business_selector, "field 'businessIndustry' and method 'navigateToSelectBusiness'");
        hmlBusinessInformationFragment.businessIndustry = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_business_selector, "field 'businessIndustry'", TextView.class);
        this.MediaSessionCompat$QueueItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.navigateToSelectBusiness();
            }
        });
        hmlBusinessInformationFragment.businessIndustryError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_business_selector_error, "field 'businessIndustryError'", TextView.class);
        hmlBusinessInformationFragment.businessType = (CustomAcceptDeclineButtons) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_juristic, "field 'businessType'", CustomAcceptDeclineButtons.class);
        hmlBusinessInformationFragment.businessTypeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_business_type_error, "field 'businessTypeError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.cb_physical, "field 'cbPhysical' and method 'onPhysicalChecked'");
        hmlBusinessInformationFragment.cbPhysical = (CheckBox) onStart.write(IconCompatParcelizer3, R.id.cb_physical, "field 'cbPhysical'", CheckBox.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer3;
        ((CompoundButton) IconCompatParcelizer3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBusinessInformationFragment.this.onPhysicalChecked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cb_marketplace, "field 'cbMarketplace' and method 'onMarketplaceChecked'");
        hmlBusinessInformationFragment.cbMarketplace = (CheckBox) onStart.write(IconCompatParcelizer4, R.id.cb_marketplace, "field 'cbMarketplace'", CheckBox.class);
        this.MediaMetadataCompat = IconCompatParcelizer4;
        ((CompoundButton) IconCompatParcelizer4).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBusinessInformationFragment.this.onMarketplaceChecked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.cb_website, "field 'cbWebsite' and method 'onWebsiteChecked'");
        hmlBusinessInformationFragment.cbWebsite = (CheckBox) onStart.write(IconCompatParcelizer5, R.id.cb_website, "field 'cbWebsite'", CheckBox.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer5;
        ((CompoundButton) IconCompatParcelizer5).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBusinessInformationFragment.this.onWebsiteChecked();
            }
        });
        hmlBusinessInformationFragment.storeTypeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_store_type_error, "field 'storeTypeError'", TextView.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.cb_expansion, "field 'cbExpansion' and method 'onExpansionChecked'");
        hmlBusinessInformationFragment.cbExpansion = (CheckBox) onStart.write(IconCompatParcelizer6, R.id.cb_expansion, "field 'cbExpansion'", CheckBox.class);
        this.write = IconCompatParcelizer6;
        ((CompoundButton) IconCompatParcelizer6).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBusinessInformationFragment.this.onExpansionChecked();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.cb_capital, "field 'cbCapital' and method 'onCapitalChecked'");
        hmlBusinessInformationFragment.cbCapital = (CheckBox) onStart.write(IconCompatParcelizer7, R.id.cb_capital, "field 'cbCapital'", CheckBox.class);
        this.IconCompatParcelizer = IconCompatParcelizer7;
        ((CompoundButton) IconCompatParcelizer7).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmlBusinessInformationFragment.this.onCapitalChecked();
            }
        });
        hmlBusinessInformationFragment.loanPurposeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_loan_purpose_error, "field 'loanPurposeError'", TextView.class);
        hmlBusinessInformationFragment.monthlyIncome = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_income, "field 'monthlyIncome'", CustomEditText.class);
        hmlBusinessInformationFragment.netIncomeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_net_income_error, "field 'netIncomeError'", TextView.class);
        hmlBusinessInformationFragment.accountSelector = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_operating_selector, "field 'accountSelector'", TextView.class);
        hmlBusinessInformationFragment.bankAccountError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bank_account_error, "field 'bankAccountError'", TextView.class);
        hmlBusinessInformationFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_bank_accounts, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'onNextClicked'");
        hmlBusinessInformationFragment.nextButton = (Button) onStart.write(IconCompatParcelizer8, R.id.bt_next, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.onNextClicked();
            }
        });
        hmlBusinessInformationFragment.addAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_add_account, "field 'addAccount'", TextView.class);
        hmlBusinessInformationFragment.incomeSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.income_spinner, "field 'incomeSpinner'", CustomSpinnerWithTitle.class);
        hmlBusinessInformationFragment.sourceIncomeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_source_income_error, "field 'sourceIncomeError'", TextView.class);
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.iv_business_industry, "method 'navigateToBusinessIndustryAbout'");
        this.RatingCompat = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.navigateToBusinessIndustryAbout();
            }
        });
        View IconCompatParcelizer10 = onStart.IconCompatParcelizer(view, R.id.iv_loan, "method 'navigateToLoanPurposeAbout'");
        this.MediaDescriptionCompat = IconCompatParcelizer10;
        IconCompatParcelizer10.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.navigateToLoanPurposeAbout();
            }
        });
        View IconCompatParcelizer11 = onStart.IconCompatParcelizer(view, R.id.iv_store, "method 'navigateToStoreTypeAbout'");
        this.f5442x50fd9e4a = IconCompatParcelizer11;
        IconCompatParcelizer11.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.navigateToStoreTypeAbout();
            }
        });
        View IconCompatParcelizer12 = onStart.IconCompatParcelizer(view, R.id.iv_monthly_income_about, "method 'navigateToMonthlyIncomeAbout'");
        this.MediaSessionCompat$Token = IconCompatParcelizer12;
        IconCompatParcelizer12.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessInformationFragment.this.navigateToMonthlyIncomeAbout();
            }
        });
    }

    public final void read() {
        HmlBusinessInformationFragment hmlBusinessInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessInformationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlBusinessInformationFragment.root = null;
            hmlBusinessInformationFragment.breadcrumbs = null;
            hmlBusinessInformationFragment.businessIndustry = null;
            hmlBusinessInformationFragment.businessIndustryError = null;
            hmlBusinessInformationFragment.businessType = null;
            hmlBusinessInformationFragment.businessTypeError = null;
            hmlBusinessInformationFragment.cbPhysical = null;
            hmlBusinessInformationFragment.cbMarketplace = null;
            hmlBusinessInformationFragment.cbWebsite = null;
            hmlBusinessInformationFragment.storeTypeError = null;
            hmlBusinessInformationFragment.cbExpansion = null;
            hmlBusinessInformationFragment.cbCapital = null;
            hmlBusinessInformationFragment.loanPurposeError = null;
            hmlBusinessInformationFragment.monthlyIncome = null;
            hmlBusinessInformationFragment.netIncomeError = null;
            hmlBusinessInformationFragment.accountSelector = null;
            hmlBusinessInformationFragment.bankAccountError = null;
            hmlBusinessInformationFragment.recyclerView = null;
            hmlBusinessInformationFragment.nextButton = null;
            hmlBusinessInformationFragment.addAccount = null;
            hmlBusinessInformationFragment.incomeSpinner = null;
            hmlBusinessInformationFragment.sourceIncomeError = null;
            this.MediaSessionCompat$QueueItem.setOnClickListener((View.OnClickListener) null);
            this.MediaSessionCompat$QueueItem = null;
            ((CompoundButton) this.MediaBrowserCompat$SearchResultReceiver).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            ((CompoundButton) this.MediaMetadataCompat).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaMetadataCompat = null;
            ((CompoundButton) this.MediaBrowserCompat$MediaItem).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            ((CompoundButton) this.write).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.write = null;
            ((CompoundButton) this.IconCompatParcelizer).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.f5442x50fd9e4a.setOnClickListener((View.OnClickListener) null);
            this.f5442x50fd9e4a = null;
            this.MediaSessionCompat$Token.setOnClickListener((View.OnClickListener) null);
            this.MediaSessionCompat$Token = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
