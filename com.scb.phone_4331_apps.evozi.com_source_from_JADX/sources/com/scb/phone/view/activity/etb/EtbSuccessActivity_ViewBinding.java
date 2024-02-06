package com.scb.phone.view.activity.etb;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.CustomInformationList;
import com.scb.phone.view.custom.investment.CustomSuccessInformation;
import p040o.onCreateDialog;
import p040o.onStart;

public class EtbSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EtbSuccessActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EtbSuccessActivity_ViewBinding(final EtbSuccessActivity etbSuccessActivity, View view) {
        super(etbSuccessActivity, view);
        this.IconCompatParcelizer = etbSuccessActivity;
        etbSuccessActivity.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvTitle'", TextView.class);
        etbSuccessActivity.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time, "field 'tvDateTime'", TextView.class);
        etbSuccessActivity.tvRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'tvRefId'", TextView.class);
        etbSuccessActivity.vSuccessInformation = (CustomSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_information, "field 'vSuccessInformation'", CustomSuccessInformation.class);
        etbSuccessActivity.vOpeningDeposit = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_opening_deposit, "field 'vOpeningDeposit'", CustomInformationList.class);
        etbSuccessActivity.vMonthlyDeduction = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_monthly_deduction, "field 'vMonthlyDeduction'", CustomInformationList.class);
        etbSuccessActivity.layoutRemarks = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_remarks, "field 'layoutRemarks'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_button, "field 'saveButton' and method 'onSaveButtonClicked'");
        etbSuccessActivity.saveButton = (Button) onStart.write(IconCompatParcelizer2, R.id.save_button, "field 'saveButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbSuccessActivity.this.onSaveButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnButtonClicked'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EtbSuccessActivity.this.onReturnButtonClicked();
            }
        });
    }

    public final void read() {
        EtbSuccessActivity etbSuccessActivity = this.IconCompatParcelizer;
        if (etbSuccessActivity != null) {
            this.IconCompatParcelizer = null;
            etbSuccessActivity.tvTitle = null;
            etbSuccessActivity.tvDateTime = null;
            etbSuccessActivity.tvRefId = null;
            etbSuccessActivity.vSuccessInformation = null;
            etbSuccessActivity.vOpeningDeposit = null;
            etbSuccessActivity.vMonthlyDeduction = null;
            etbSuccessActivity.layoutRemarks = null;
            etbSuccessActivity.saveButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
