package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SCBSMaritalStatusFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private SCBSMaritalStatusFragment write;

    public SCBSMaritalStatusFragment_ViewBinding(final SCBSMaritalStatusFragment sCBSMaritalStatusFragment, View view) {
        super(sCBSMaritalStatusFragment, view);
        this.write = sCBSMaritalStatusFragment;
        sCBSMaritalStatusFragment.recyclerViewMaritalStatus = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_marital_status, "field 'recyclerViewMaritalStatus'", RecyclerView.class);
        sCBSMaritalStatusFragment.layoutMarried = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_married, "field 'layoutMarried'", ViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onClickNext'");
        sCBSMaritalStatusFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SCBSMaritalStatusFragment.this.onClickNext();
            }
        });
        sCBSMaritalStatusFragment.spinnerCountry = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_country, "field 'spinnerCountry'", CustomSpinnerWithTitle.class);
        sCBSMaritalStatusFragment.spinnerTitle = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_title, "field 'spinnerTitle'", CustomSpinnerWithTitle.class);
        sCBSMaritalStatusFragment.inputFirstName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_first_name, "field 'inputFirstName'", CommonInputViewGroup.class);
        sCBSMaritalStatusFragment.inputMiddleName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_middle_name, "field 'inputMiddleName'", CommonInputViewGroup.class);
        sCBSMaritalStatusFragment.inputLastName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_last_name, "field 'inputLastName'", CommonInputViewGroup.class);
        sCBSMaritalStatusFragment.inputPassportId = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_passport_id, "field 'inputPassportId'", CommonInputViewGroup.class);
        sCBSMaritalStatusFragment.inputSpouseId = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_spouse_national_id, "field 'inputSpouseId'", CommonInputViewGroup.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.radio_button_thai, "method 'onClickRadioButtonThaiSpouse'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SCBSMaritalStatusFragment.this.onClickRadioButtonThaiSpouse();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.radio_button_foreigner, "method 'onClickRadioButtonForeignerSpouse'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SCBSMaritalStatusFragment.this.onClickRadioButtonForeignerSpouse();
            }
        });
    }

    public final void read() {
        SCBSMaritalStatusFragment sCBSMaritalStatusFragment = this.write;
        if (sCBSMaritalStatusFragment != null) {
            this.write = null;
            sCBSMaritalStatusFragment.recyclerViewMaritalStatus = null;
            sCBSMaritalStatusFragment.layoutMarried = null;
            sCBSMaritalStatusFragment.buttonNext = null;
            sCBSMaritalStatusFragment.spinnerCountry = null;
            sCBSMaritalStatusFragment.spinnerTitle = null;
            sCBSMaritalStatusFragment.inputFirstName = null;
            sCBSMaritalStatusFragment.inputMiddleName = null;
            sCBSMaritalStatusFragment.inputLastName = null;
            sCBSMaritalStatusFragment.inputPassportId = null;
            sCBSMaritalStatusFragment.inputSpouseId = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
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
