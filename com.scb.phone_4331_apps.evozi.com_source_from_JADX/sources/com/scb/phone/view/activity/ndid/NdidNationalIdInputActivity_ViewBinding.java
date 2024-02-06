package com.scb.phone.view.activity.ndid;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.onCreateDialog;
import p040o.onStart;

public class NdidNationalIdInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private NdidNationalIdInputActivity MediaBrowserCompat$CustomActionResultReceiver;

    public NdidNationalIdInputActivity_ViewBinding(final NdidNationalIdInputActivity ndidNationalIdInputActivity, View view) {
        super(ndidNationalIdInputActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ndidNationalIdInputActivity;
        ndidNationalIdInputActivity.scanIdIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_scan_id, "field 'scanIdIcon'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_taking_photo_edit_label, "field 'textViewTakingPhotoEditLabel' and method 'onEditTextClicked'");
        ndidNationalIdInputActivity.textViewTakingPhotoEditLabel = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_taking_photo_edit_label, "field 'textViewTakingPhotoEditLabel'", TextView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NdidNationalIdInputActivity.this.onEditTextClicked();
            }
        });
        ndidNationalIdInputActivity.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_view_container, "field 'rootView'", RelativeLayout.class);
        ndidNationalIdInputActivity.spinnerTitle = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_title, "field 'spinnerTitle'", CustomSpinnerWithTitle.class);
        ndidNationalIdInputActivity.ivpFirstNameThai = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_first_name_thai, "field 'ivpFirstNameThai'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.ivpLastNameThai = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_last_name_thai, "field 'ivpLastNameThai'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.ivpFirstNameEnglish = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_first_name_english, "field 'ivpFirstNameEnglish'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.ivpLastNameEnglish = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_last_name_english, "field 'ivpLastNameEnglish'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.ivpNationalIdNumber = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_national_id_number, "field 'ivpNationalIdNumber'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.helpButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.help_button, "field 'helpButton'", ImageView.class);
        ndidNationalIdInputActivity.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_next, "field 'nextButton'", Button.class);
        ndidNationalIdInputActivity.dateOfBirthViewGroup = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_date_of_birth, "field 'dateOfBirthViewGroup'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.dateOfIssuedViewGroup = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivp_issued_date, "field 'dateOfIssuedViewGroup'", CommonInputViewGroup.class);
        ndidNationalIdInputActivity.laserIdFirst = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_first, "field 'laserIdFirst'", EditText.class);
        ndidNationalIdInputActivity.laserIdSecond = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_second, "field 'laserIdSecond'", EditText.class);
        ndidNationalIdInputActivity.laserIdThird = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.laser_id_third, "field 'laserIdThird'", EditText.class);
        ndidNationalIdInputActivity.spinnerCountry = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_spinner_country, "field 'spinnerCountry'", CustomSpinnerWithTitle.class);
        ndidNationalIdInputActivity.fieldsContainer = onStart.IconCompatParcelizer(view, R.id.fields_container, "field 'fieldsContainer'");
    }

    public final void read() {
        NdidNationalIdInputActivity ndidNationalIdInputActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ndidNationalIdInputActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ndidNationalIdInputActivity.scanIdIcon = null;
            ndidNationalIdInputActivity.textViewTakingPhotoEditLabel = null;
            ndidNationalIdInputActivity.rootView = null;
            ndidNationalIdInputActivity.spinnerTitle = null;
            ndidNationalIdInputActivity.ivpFirstNameThai = null;
            ndidNationalIdInputActivity.ivpLastNameThai = null;
            ndidNationalIdInputActivity.ivpFirstNameEnglish = null;
            ndidNationalIdInputActivity.ivpLastNameEnglish = null;
            ndidNationalIdInputActivity.ivpNationalIdNumber = null;
            ndidNationalIdInputActivity.helpButton = null;
            ndidNationalIdInputActivity.nextButton = null;
            ndidNationalIdInputActivity.dateOfBirthViewGroup = null;
            ndidNationalIdInputActivity.dateOfIssuedViewGroup = null;
            ndidNationalIdInputActivity.laserIdFirst = null;
            ndidNationalIdInputActivity.laserIdSecond = null;
            ndidNationalIdInputActivity.laserIdThird = null;
            ndidNationalIdInputActivity.spinnerCountry = null;
            ndidNationalIdInputActivity.fieldsContainer = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
