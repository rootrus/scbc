package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOccupationInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlOccupationInfoFragment MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View write;

    public HmlOccupationInfoFragment_ViewBinding(final HmlOccupationInfoFragment hmlOccupationInfoFragment, View view) {
        super(hmlOccupationInfoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlOccupationInfoFragment;
        hmlOccupationInfoFragment.breadcrumbnsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbnsNtb'", ProgressStateBar.class);
        hmlOccupationInfoFragment.root = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root, "field 'root'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_job, "field 'job' and method 'onJobClick'");
        hmlOccupationInfoFragment.job = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_job, "field 'job'", TextView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOccupationInfoFragment.this.onJobClick();
            }
        });
        hmlOccupationInfoFragment.jobError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_job_error, "field 'jobError'", TextView.class);
        hmlOccupationInfoFragment.sourceOfIncome = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_source_of_income, "field 'sourceOfIncome'", Spinner.class);
        hmlOccupationInfoFragment.sourceOfIncomeError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_source_of_income_error, "field 'sourceOfIncomeError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_company_name, "field 'companyName' and method 'onCompanyNameClick'");
        hmlOccupationInfoFragment.companyName = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_company_name, "field 'companyName'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOccupationInfoFragment.this.onCompanyNameClick();
            }
        });
        hmlOccupationInfoFragment.companyNameError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_company_name_error, "field 'companyNameError'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_work_address, "field 'workAddress' and method 'onWorkAddressClick'");
        hmlOccupationInfoFragment.workAddress = (TextView) onStart.write(IconCompatParcelizer4, R.id.tv_work_address, "field 'workAddress'", TextView.class);
        this.MediaDescriptionCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOccupationInfoFragment.this.onWorkAddressClick();
            }
        });
        hmlOccupationInfoFragment.workAddressError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_work_address_error, "field 'workAddressError'", TextView.class);
        hmlOccupationInfoFragment.mobileNumberView = (CustomPhoneNumberInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.phone, "field 'mobileNumberView'", CustomPhoneNumberInput.class);
        hmlOccupationInfoFragment.yearsSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_year, "field 'yearsSpinner'", CustomSpinnerWithTitle.class);
        hmlOccupationInfoFragment.monthsSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_month, "field 'monthsSpinner'", CustomSpinnerWithTitle.class);
        hmlOccupationInfoFragment.experienceError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_experience_error, "field 'experienceError'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'onNextButtonClick'");
        hmlOccupationInfoFragment.nextButton = (Button) onStart.write(IconCompatParcelizer5, R.id.bt_next, "field 'nextButton'", Button.class);
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOccupationInfoFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        HmlOccupationInfoFragment hmlOccupationInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlOccupationInfoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlOccupationInfoFragment.breadcrumbnsNtb = null;
            hmlOccupationInfoFragment.root = null;
            hmlOccupationInfoFragment.job = null;
            hmlOccupationInfoFragment.jobError = null;
            hmlOccupationInfoFragment.sourceOfIncome = null;
            hmlOccupationInfoFragment.sourceOfIncomeError = null;
            hmlOccupationInfoFragment.companyName = null;
            hmlOccupationInfoFragment.companyNameError = null;
            hmlOccupationInfoFragment.workAddress = null;
            hmlOccupationInfoFragment.workAddressError = null;
            hmlOccupationInfoFragment.mobileNumberView = null;
            hmlOccupationInfoFragment.yearsSpinner = null;
            hmlOccupationInfoFragment.monthsSpinner = null;
            hmlOccupationInfoFragment.experienceError = null;
            hmlOccupationInfoFragment.nextButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
