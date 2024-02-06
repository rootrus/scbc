package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OccupationInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public OccupationInfoFragment_ViewBinding(final OccupationInfoFragment occupationInfoFragment, View view) {
        super(occupationInfoFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = occupationInfoFragment;
        occupationInfoFragment.textJob = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_job, "field 'textJob'", TextView.class);
        occupationInfoFragment.textCompanyName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.company_name, "field 'textCompanyName'", CommonInputViewGroup.class);
        occupationInfoFragment.textWorkAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_work_address, "field 'textWorkAddress'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_work_address, "field 'layoutWorkAddress' and method 'onWorkLayoutClick'");
        occupationInfoFragment.layoutWorkAddress = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.layout_work_address, "field 'layoutWorkAddress'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationInfoFragment.this.onWorkLayoutClick();
            }
        });
        occupationInfoFragment.spinnerSourceOfIncome = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_source_of_income, "field 'spinnerSourceOfIncome'", Spinner.class);
        occupationInfoFragment.currentWorkAddressCheckbox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_current_work_address, "field 'currentWorkAddressCheckbox'", CheckBox.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        occupationInfoFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer3, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationInfoFragment.this.onNextButtonClick(view);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.layout_job, "method 'onJobLayoutClick'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationInfoFragment.this.onJobLayoutClick();
            }
        });
    }

    public final void read() {
        OccupationInfoFragment occupationInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (occupationInfoFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            occupationInfoFragment.textJob = null;
            occupationInfoFragment.textCompanyName = null;
            occupationInfoFragment.textWorkAddress = null;
            occupationInfoFragment.layoutWorkAddress = null;
            occupationInfoFragment.spinnerSourceOfIncome = null;
            occupationInfoFragment.currentWorkAddressCheckbox = null;
            occupationInfoFragment.buttonNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
