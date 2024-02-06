package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundMaritalStatusFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundMaritalStatusFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View RatingCompat;
    private View write;

    public FundMaritalStatusFragment_ViewBinding(final FundMaritalStatusFragment fundMaritalStatusFragment, View view) {
        super(fundMaritalStatusFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundMaritalStatusFragment;
        fundMaritalStatusFragment.recyclerViewMaritalStatus = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_marital_status, "field 'recyclerViewMaritalStatus'", RecyclerView.class);
        fundMaritalStatusFragment.layoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_container, "field 'layoutContainer'", LinearLayout.class);
        fundMaritalStatusFragment.layoutNotMarried = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_not_married, "field 'layoutNotMarried'", LinearLayout.class);
        fundMaritalStatusFragment.layoutDisclosed = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_disclosed, "field 'layoutDisclosed'", LinearLayout.class);
        fundMaritalStatusFragment.radioGroupDisclosed = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_disclosed, "field 'radioGroupDisclosed'", RadioGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.radio_button_disclosed, "field 'radioDisclosed' and method 'onClickRadioButtonDisclosed'");
        fundMaritalStatusFragment.radioDisclosed = (RadioButton) onStart.write(IconCompatParcelizer2, R.id.radio_button_disclosed, "field 'radioDisclosed'", RadioButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundMaritalStatusFragment.this.onClickRadioButtonDisclosed();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.radio_button_undisclosed, "field 'radioUndisclosed' and method 'onClickRadioButtonUndisclosed'");
        fundMaritalStatusFragment.radioUndisclosed = (RadioButton) onStart.write(IconCompatParcelizer3, R.id.radio_button_undisclosed, "field 'radioUndisclosed'", RadioButton.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundMaritalStatusFragment.this.onClickRadioButtonUndisclosed();
            }
        });
        fundMaritalStatusFragment.radioGroupSpouse = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_spouse, "field 'radioGroupSpouse'", RadioGroup.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.radio_button_thai, "field 'radioTh' and method 'onClickRadioButtonThaiSpouse'");
        fundMaritalStatusFragment.radioTh = (RadioButton) onStart.write(IconCompatParcelizer4, R.id.radio_button_thai, "field 'radioTh'", RadioButton.class);
        this.RatingCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundMaritalStatusFragment.this.onClickRadioButtonThaiSpouse();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.radio_button_foreigner, "field 'radioFore' and method 'onClickRadioButtonForeignerSpouse'");
        fundMaritalStatusFragment.radioFore = (RadioButton) onStart.write(IconCompatParcelizer5, R.id.radio_button_foreigner, "field 'radioFore'", RadioButton.class);
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundMaritalStatusFragment.this.onClickRadioButtonForeignerSpouse();
            }
        });
        fundMaritalStatusFragment.inputFirstName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_first_name, "field 'inputFirstName'", CommonInputViewGroup.class);
        fundMaritalStatusFragment.inputMiddleName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_middle_name, "field 'inputMiddleName'", CommonInputViewGroup.class);
        fundMaritalStatusFragment.inputLastName = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_last_name, "field 'inputLastName'", CommonInputViewGroup.class);
        fundMaritalStatusFragment.inputSpouseId = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_spouse_national_id, "field 'inputSpouseId'", CommonInputViewGroup.class);
        fundMaritalStatusFragment.inputPassportId = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_input_passport_id, "field 'inputPassportId'", CommonInputViewGroup.class);
        fundMaritalStatusFragment.spinnerCountry = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_country, "field 'spinnerCountry'", CustomSpinnerWithTitle.class);
        fundMaritalStatusFragment.spinnerTitle = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_title, "field 'spinnerTitle'", CustomSpinnerWithTitle.class);
        fundMaritalStatusFragment.layoutForeignerSpouse = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_foreigner_spouse, "field 'layoutForeignerSpouse'", LinearLayout.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onClickNext'");
        fundMaritalStatusFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer6, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundMaritalStatusFragment.this.onClickNext();
            }
        });
    }

    public final void read() {
        FundMaritalStatusFragment fundMaritalStatusFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundMaritalStatusFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundMaritalStatusFragment.recyclerViewMaritalStatus = null;
            fundMaritalStatusFragment.layoutContainer = null;
            fundMaritalStatusFragment.layoutNotMarried = null;
            fundMaritalStatusFragment.layoutDisclosed = null;
            fundMaritalStatusFragment.radioGroupDisclosed = null;
            fundMaritalStatusFragment.radioDisclosed = null;
            fundMaritalStatusFragment.radioUndisclosed = null;
            fundMaritalStatusFragment.radioGroupSpouse = null;
            fundMaritalStatusFragment.radioTh = null;
            fundMaritalStatusFragment.radioFore = null;
            fundMaritalStatusFragment.inputFirstName = null;
            fundMaritalStatusFragment.inputMiddleName = null;
            fundMaritalStatusFragment.inputLastName = null;
            fundMaritalStatusFragment.inputSpouseId = null;
            fundMaritalStatusFragment.inputPassportId = null;
            fundMaritalStatusFragment.spinnerCountry = null;
            fundMaritalStatusFragment.spinnerTitle = null;
            fundMaritalStatusFragment.layoutForeignerSpouse = null;
            fundMaritalStatusFragment.buttonNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
