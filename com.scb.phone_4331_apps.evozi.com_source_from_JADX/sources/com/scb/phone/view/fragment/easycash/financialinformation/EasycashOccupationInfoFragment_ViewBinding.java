package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashOccupationInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaMetadataCompat;
    private EasycashOccupationInfoFragment write;

    public EasycashOccupationInfoFragment_ViewBinding(final EasycashOccupationInfoFragment easycashOccupationInfoFragment, View view) {
        super(easycashOccupationInfoFragment, view);
        this.write = easycashOccupationInfoFragment;
        easycashOccupationInfoFragment.textJob = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_job, "field 'textJob'", TextView.class);
        easycashOccupationInfoFragment.spinnerSourceOfIncome = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_source_of_income, "field 'spinnerSourceOfIncome'", Spinner.class);
        easycashOccupationInfoFragment.textCompanyName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.company_name, "field 'textCompanyName'", CommonInputViewGroup.class);
        easycashOccupationInfoFragment.textWorkAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_work_address, "field 'textWorkAddress'", TextView.class);
        easycashOccupationInfoFragment.textWorkAddressError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_work_address_error, "field 'textWorkAddressError'", TextView.class);
        easycashOccupationInfoFragment.textDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_duration, "field 'textDuration'", TextView.class);
        easycashOccupationInfoFragment.contactNumber = (CustomPhone) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.phone_edit_text, "field 'contactNumber'", CustomPhone.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClicked'");
        easycashOccupationInfoFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashOccupationInfoFragment.this.onNextButtonClicked();
            }
        });
        easycashOccupationInfoFragment.buttonLayout = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_layout, "field 'buttonLayout'", FrameLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_job, "method 'onOccupationClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashOccupationInfoFragment.this.onOccupationClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.layout_work_address, "method 'onWorkAddressClick'");
        this.MediaMetadataCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashOccupationInfoFragment.this.onWorkAddressClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.layout_duration, "method 'onDurationClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashOccupationInfoFragment.this.onDurationClick();
            }
        });
    }

    public final void read() {
        EasycashOccupationInfoFragment easycashOccupationInfoFragment = this.write;
        if (easycashOccupationInfoFragment != null) {
            this.write = null;
            easycashOccupationInfoFragment.textJob = null;
            easycashOccupationInfoFragment.spinnerSourceOfIncome = null;
            easycashOccupationInfoFragment.textCompanyName = null;
            easycashOccupationInfoFragment.textWorkAddress = null;
            easycashOccupationInfoFragment.textWorkAddressError = null;
            easycashOccupationInfoFragment.textDuration = null;
            easycashOccupationInfoFragment.contactNumber = null;
            easycashOccupationInfoFragment.buttonNext = null;
            easycashOccupationInfoFragment.buttonLayout = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
