package com.scb.phone.view.activity.easycash;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EasycashCarInformationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashCarInformationActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public EasycashCarInformationActivity_ViewBinding(final EasycashCarInformationActivity easycashCarInformationActivity, View view) {
        super(easycashCarInformationActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashCarInformationActivity;
        easycashCarInformationActivity.tvBrand = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_brand, "field 'tvBrand'", TextView.class);
        easycashCarInformationActivity.tvModel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_model, "field 'tvModel'", TextView.class);
        easycashCarInformationActivity.tvSubModel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_sub_model, "field 'tvSubModel'", TextView.class);
        easycashCarInformationActivity.tvModelYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_model_year, "field 'tvModelYear'", TextView.class);
        easycashCarInformationActivity.tvPlateNumber = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_plate_no, "field 'tvPlateNumber'", CommonInputViewGroup.class);
        easycashCarInformationActivity.spinnerLocation = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_location, "field 'spinnerLocation'", CustomSpinnerWithTitle.class);
        easycashCarInformationActivity.spinnerYearRegistration = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_year_registration, "field 'spinnerYearRegistration'", CustomSpinnerWithTitle.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_calculate, "field 'btnCalculate' and method 'onCalculateClick'");
        easycashCarInformationActivity.btnCalculate = (Button) onStart.write(IconCompatParcelizer2, R.id.button_calculate, "field 'btnCalculate'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCarInformationActivity.this.onCalculateClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_brand, "method 'onCarSequentialSearch'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCarInformationActivity.this.onCarSequentialSearch();
            }
        });
    }

    public final void read() {
        EasycashCarInformationActivity easycashCarInformationActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashCarInformationActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashCarInformationActivity.tvBrand = null;
            easycashCarInformationActivity.tvModel = null;
            easycashCarInformationActivity.tvSubModel = null;
            easycashCarInformationActivity.tvModelYear = null;
            easycashCarInformationActivity.tvPlateNumber = null;
            easycashCarInformationActivity.spinnerLocation = null;
            easycashCarInformationActivity.spinnerYearRegistration = null;
            easycashCarInformationActivity.btnCalculate = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
