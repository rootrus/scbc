package com.scb.phone.view.fragment.registration;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomATMInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RegistrationCardDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private RegistrationCardDetailFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public RegistrationCardDetailFragment_ViewBinding(final RegistrationCardDetailFragment registrationCardDetailFragment, View view) {
        super(registrationCardDetailFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = registrationCardDetailFragment;
        registrationCardDetailFragment.cardNoInput = (CustomCardInformationInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_no_input, "field 'cardNoInput'", CustomCardInformationInput.class);
        registrationCardDetailFragment.creditCardLimitInput = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_credit_card_limit, "field 'creditCardLimitInput'", EditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ib_credit_card_limit_clear, "field 'btnClearCreditCardLimit' and method 'onClearCreditLimitClick'");
        registrationCardDetailFragment.btnClearCreditCardLimit = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.ib_credit_card_limit_clear, "field 'btnClearCreditCardLimit'", ImageButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationCardDetailFragment.this.onClearCreditLimitClick();
            }
        });
        registrationCardDetailFragment.atmPinInput = (CustomATMInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.atm_pin, "field 'atmPinInput'", CustomATMInput.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'nextButton' and method 'onNextButtonClick'");
        registrationCardDetailFragment.nextButton = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_next, "field 'nextButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationCardDetailFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ll_layout_face_recognition, "field 'faceRecognitionLayout' and method 'onRegisterByFaceRecognitionClick'");
        registrationCardDetailFragment.faceRecognitionLayout = (LinearLayout) onStart.write(IconCompatParcelizer4, R.id.ll_layout_face_recognition, "field 'faceRecognitionLayout'", LinearLayout.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationCardDetailFragment.this.onRegisterByFaceRecognitionClick();
            }
        });
        registrationCardDetailFragment.txtVwCreditLimitOrAtmPin = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_credit_limit_or_atm, "field 'txtVwCreditLimitOrAtmPin'", TextView.class);
        registrationCardDetailFragment.tvFaceRecognitionMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_face_recognition_message, "field 'tvFaceRecognitionMessage'", TextView.class);
        registrationCardDetailFragment.expiryDateView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expiry_date_view, "field 'expiryDateView'", ConstraintLayout.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.tv_credit_expiry_date_month, "field 'tvExpiryMonth' and method 'onExpiryMonthButtonClick'");
        registrationCardDetailFragment.tvExpiryMonth = (TextView) onStart.write(IconCompatParcelizer5, R.id.tv_credit_expiry_date_month, "field 'tvExpiryMonth'", TextView.class);
        this.MediaMetadataCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationCardDetailFragment.this.onExpiryMonthButtonClick();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.tv_credit_expiry_date_year, "field 'tvExpiryYear' and method 'onExpiryYearButtonClick'");
        registrationCardDetailFragment.tvExpiryYear = (TextView) onStart.write(IconCompatParcelizer6, R.id.tv_credit_expiry_date_year, "field 'tvExpiryYear'", TextView.class);
        this.RatingCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RegistrationCardDetailFragment.this.onExpiryYearButtonClick();
            }
        });
    }

    public final void read() {
        RegistrationCardDetailFragment registrationCardDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (registrationCardDetailFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            registrationCardDetailFragment.cardNoInput = null;
            registrationCardDetailFragment.creditCardLimitInput = null;
            registrationCardDetailFragment.btnClearCreditCardLimit = null;
            registrationCardDetailFragment.atmPinInput = null;
            registrationCardDetailFragment.nextButton = null;
            registrationCardDetailFragment.faceRecognitionLayout = null;
            registrationCardDetailFragment.txtVwCreditLimitOrAtmPin = null;
            registrationCardDetailFragment.tvFaceRecognitionMessage = null;
            registrationCardDetailFragment.expiryDateView = null;
            registrationCardDetailFragment.tvExpiryMonth = null;
            registrationCardDetailFragment.tvExpiryYear = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
