package com.scb.phone.view.fragment.registration;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.forgotpin.ForgotPinOtpActivity;
import com.scb.phone.view.activity.registration.RegistrationDeadCardActivity;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.custom.ColorChangeableNumberPicker;
import com.scb.phone.view.custom.MonthYearPickerDialog;
import com.scb.phone.view.custom.common.CustomATMInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput;
import com.scb.phone.view.custom.common.CustomCardInformationInput$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributeMwPinnedSuccessActivity;
import p040o.ActivityBuilder_ContributeMwReviewActivity;
import p040o.ActivityBuilder_ContributeMwSearchMarketMallActivity;
import p040o.ActivityBuilder_ContributeMwShopTypeActivity;
import p040o.C10178z;
import p040o.C4927lO;
import p040o.C4979mt;
import p040o.C9839a;
import p040o.EdgeGuidance;
import p040o.FixedAspectRatioDetectionResult;
import p040o.FragmentBuilder_BindDirectDebitInputSelectedFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickExtractorAgent;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.buildNameMap;
import p040o.getKernelIDDstOver;
import p040o.isEdgeFound;
import p040o.mB$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.removeIfFromRandomAccessList;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.validateReferralEligibility;
import p040o.writeUInt64NoTag;

public class RegistrationCardDetailFragment extends BaseFragment implements QuickExtractorAgent {
    public int IconCompatParcelizer = 0;
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private TextView.OnEditorActionListener MediaBrowserCompat$MediaItem = new ActivityBuilder_ContributeMwSearchMarketMallActivity(this);
    private getKernelIDDstOver MediaDescriptionCompat = new getKernelIDDstOver();
    private TextView.OnEditorActionListener RatingCompat = new ActivityBuilder_ContributeMwReviewActivity(this);
    @BindView
    CustomATMInput atmPinInput;
    @BindView
    public ImageButton btnClearCreditCardLimit;
    @BindView
    CustomCardInformationInput cardNoInput;
    @BindView
    public EditText creditCardLimitInput;
    @BindView
    ConstraintLayout expiryDateView;
    @BindView
    LinearLayout faceRecognitionLayout;
    @BindView
    Button nextButton;
    @HmlPinActivity
    public buildNameMap presenter;
    @BindView
    TextView tvExpiryMonth;
    @BindView
    TextView tvExpiryYear;
    @BindView
    TextView tvFaceRecognitionMessage;
    @BindView
    TextView txtVwCreditLimitOrAtmPin;

    public static RegistrationCardDetailFragment MediaBrowserCompat$CustomActionResultReceiver(boolean z, parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION", z);
        bundle.putSerializable("EXTRA_FLOW_TYPE", parseprocmapsjsonfromstream);
        RegistrationCardDetailFragment registrationCardDetailFragment = new RegistrationCardDetailFragment();
        registrationCardDetailFragment.setArguments(bundle);
        return registrationCardDetailFragment;
    }

    public static RegistrationCardDetailFragment read(parseProcMapsJsonFromStream parseprocmapsjsonfromstream, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION", false);
        bundle.putSerializable("EXTRA_FLOW_TYPE", parseprocmapsjsonfromstream);
        bundle.putString("EXTRA_CARD_NO", str);
        bundle.putString("EXTRA_LIMIT", str2);
        RegistrationCardDetailFragment registrationCardDetailFragment = new RegistrationCardDetailFragment();
        registrationCardDetailFragment.setArguments(bundle);
        return registrationCardDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89302131494157, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        boolean z2 = (getArguments() == null || !getArguments().containsKey("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION")) ? false : getArguments().getBoolean("EXTRA_SHOULD_DISPLAY_FACIAL_RECOGNITION", false);
        parseProcMapsJsonFromStream parseprocmapsjsonfromstream = parseProcMapsJsonFromStream.FAST_EASY;
        if (getArguments() != null && getArguments().containsKey("EXTRA_FLOW_TYPE")) {
            parseprocmapsjsonfromstream = (parseProcMapsJsonFromStream) getArguments().getSerializable("EXTRA_FLOW_TYPE");
        }
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        this.cardNoInput.setCardInputListener(new CustomCardInformationInput$MediaBrowserCompat$ItemReceiver() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
                RegistrationCardDetailFragment.this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
            }

            public final void read(String str) {
                RegistrationCardDetailFragment.this.presenter.write(str, false);
            }

            public final void write(String str) {
                RegistrationCardDetailFragment.this.presenter.write(str, true);
            }

            public final void write() {
                RegistrationCardDetailFragment.this.txtVwCreditLimitOrAtmPin.setVisibility(8);
                RegistrationCardDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(RegistrationCardDetailFragment.this);
                RegistrationCardDetailFragment.this.atmPinInput.setVisibility(8);
                RegistrationCardDetailFragment.this.nextButton.setVisibility(8);
            }

            public final void read(boolean z) {
                RegistrationCardDetailFragment.this.presenter.MediaBrowserCompat$ItemReceiver(z);
            }

            public final String MediaBrowserCompat$ItemReceiver(String str) {
                return removeIfFromRandomAccessList.read(str, "[^0-9]", "XXXX XXXX XXXX XXXX");
            }
        });
        this.cardNoInput.setLabel(getString(R.string.registration_card_detail_card_number));
        this.cardNoInput.setHint(getString(R.string.registration_card_detail_card_number_hint));
        this.cardNoInput.setErrorInLine(R.string.registration_unknown_card_error);
        this.cardNoInput.setStyle(R.drawable.shape_transparent_rounded_rectangle, R.color.f65322131099683);
        this.cardNoInput.setCardNoEditorActionListener(this.MediaBrowserCompat$MediaItem);
        this.cardNoInput.setCardNumber("");
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
        this.atmPinInput.setStyle(R.drawable.shape_transparent_rounded_rectangle, R.color.f65322131099683);
        this.atmPinInput.setOnEditorActionListener(this.RatingCompat);
        this.atmPinInput.setHint(getString(R.string.registration_card_detail_enter_atm_pin));
        this.atmPinInput.setCardInputListener(new CustomATMInput.write() {
            public final void MediaBrowserCompat$ItemReceiver(boolean z) {
                RegistrationCardDetailFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(z);
            }

            public final void MediaBrowserCompat$ItemReceiver(String str) {
                RegistrationCardDetailFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(str);
            }
        });
        this.creditCardLimitInput.setLongClickable(false);
        this.creditCardLimitInput.setTextIsSelectable(false);
        this.creditCardLimitInput.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        this.creditCardLimitInput.setOnEditorActionListener(this.RatingCompat);
        this.creditCardLimitInput.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                RegistrationCardDetailFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(editable.toString());
                RegistrationCardDetailFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(!TextUtils.isEmpty(editable.toString()));
                RegistrationCardDetailFragment.this.IconCompatParcelizer(true);
            }
        });
        this.creditCardLimitInput.setOnFocusChangeListener(new ActivityBuilder_ContributeMwShopTypeActivity(this));
        Context context = getContext();
        if (context != null) {
            String string = context.getString(R.string.registration_card_detail_card_register_using_face_recognition);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("  ");
            String obj = sb.toString();
            LayerDrawable layerDrawable = (LayerDrawable) setLastBaselineToBottomHeight.write(context, R.drawable.ic_face_recognition_with_chevron);
            if (layerDrawable != null) {
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.item_chevron);
                if (findDrawableByLayerId != null) {
                    setBaselineAligned.MediaBrowserCompat$ItemReceiver(setBaselineAligned.MediaBrowserCompat$MediaItem(findDrawableByLayerId), setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
                }
                layerDrawable.setBounds(0, 0, layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight());
                SpannableString spannableString = new SpannableString(obj);
                spannableString.setSpan(new validateReferralEligibility(layerDrawable), string.length() + 1, string.length() + 2, 33);
                this.tvFaceRecognitionMessage.setText(spannableString);
            }
        }
        if (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.DEAD_CARD || parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.PIN_LOCK_DEAD_CARD) {
            getKernelIDDstOver getkerneliddstover = this.MediaDescriptionCompat;
            if (getActivity() != null) {
                getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_activate_credit_card");
            }
        } else {
            getKernelIDDstOver getkerneliddstover2 = this.MediaDescriptionCompat;
            if (getActivity() != null) {
                getkerneliddstover2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_atmcreditcard");
            }
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (!getArguments().containsKey("EXTRA_CARD_NO") || !getArguments().containsKey("EXTRA_LIMIT")) {
            buildNameMap buildnamemap = this.presenter;
            buildnamemap.MediaBrowserCompat$SearchResultReceiver = parseprocmapsjsonfromstream;
            EdgeGuidance.EdgeType edgeType = new EdgeGuidance.EdgeType(buildnamemap, z2);
            if (buildnamemap.RatingCompat != null) {
                z = true;
            }
            if (z) {
                edgeType.IconCompatParcelizer(buildnamemap.RatingCompat);
            }
        } else {
            buildNameMap buildnamemap2 = this.presenter;
            String string2 = getArguments().getString("EXTRA_CARD_NO");
            String string3 = getArguments().getString("EXTRA_LIMIT");
            buildnamemap2.MediaBrowserCompat$SearchResultReceiver = parseprocmapsjsonfromstream;
            buildnamemap2.read = string2;
            buildnamemap2.MediaBrowserCompat$ItemReceiver = string3;
            String str = buildnamemap2.read;
            String str2 = buildnamemap2.MediaBrowserCompat$ItemReceiver;
            int i = buildNameMap.C41182.MediaBrowserCompat$CustomActionResultReceiver[parseprocmapsjsonfromstream.ordinal()];
            if (i == 3) {
                C4927lO lOVar = new C4927lO(str, str2);
                if (buildnamemap2.RatingCompat != null) {
                    lOVar.IconCompatParcelizer(buildnamemap2.RatingCompat);
                }
            } else if (i != 4) {
                C4979mt mtVar = C4979mt.MediaBrowserCompat$CustomActionResultReceiver;
                if (buildnamemap2.RatingCompat != null) {
                    mtVar.IconCompatParcelizer(buildnamemap2.RatingCompat);
                }
            } else {
                isEdgeFound isedgefound = new isEdgeFound(str, str2);
                if (buildnamemap2.RatingCompat != null) {
                    isedgefound.IconCompatParcelizer(buildnamemap2.RatingCompat);
                }
            }
            FixedAspectRatioDetectionResult fixedAspectRatioDetectionResult = new FixedAspectRatioDetectionResult(buildnamemap2, z2);
            if (buildnamemap2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                fixedAspectRatioDetectionResult.IconCompatParcelizer(buildnamemap2.RatingCompat);
            }
        }
        return inflate;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void onNextButtonClick() {
        this.presenter.write();
    }

    @OnClick
    public void onExpiryMonthButtonClick() {
        buildNameMap buildnamemap = this.presenter;
        C9839a.C9841b bVar = C9839a.C9841b.write;
        if (buildnamemap.RatingCompat != null) {
            bVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
    }

    @OnClick
    public void onExpiryYearButtonClick() {
        buildNameMap buildnamemap = this.presenter;
        C9839a.C9841b bVar = C9839a.C9841b.write;
        if (buildnamemap.RatingCompat != null) {
            bVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
    }

    @OnClick
    public void onRegisterByFaceRecognitionClick() {
        buildNameMap buildnamemap = this.presenter;
        C10178z.C54877.C54881 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((QuickExtractorAgent) obj).IconCompatParcelizer(buildNameMap.this.MediaBrowserCompat$SearchResultReceiver);
            }
        };
        if (buildnamemap.RatingCompat != null) {
            r1.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
    }

    @OnClick
    public void onClearCreditLimitClick() {
        this.creditCardLimitInput.setText("");
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
    }

    public final void MediaSessionCompat$QueueItem() {
        this.cardNoInput.setVisibility(0);
        this.cardNoInput.setCardNumber("");
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
        this.txtVwCreditLimitOrAtmPin.setVisibility(8);
        this.atmPinInput.setVisibility(8);
        this.atmPinInput.setATMNumber("");
        this.creditCardLimitInput.setVisibility(8);
        IconCompatParcelizer(false);
        this.creditCardLimitInput.setText("");
        this.nextButton.setVisibility(8);
        this.expiryDateView.setVisibility(8);
    }

    public final void read(String str, String str2) {
        this.cardNoInput.setVisibility(0);
        this.cardNoInput.setCardNumber(str);
        if (getContext() != null) {
            Drawable write = setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_sample_card_grey);
            if (write != null) {
                write.setColorFilter(new PorterDuffColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f66462131099802), PorterDuff.Mode.SRC_IN));
            }
            this.cardNoInput.setIcon(write);
        } else {
            this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
        }
        this.cardNoInput.setClickable(false);
        this.cardNoInput.MediaBrowserCompat$CustomActionResultReceiver();
        CustomCardInformationInput customCardInformationInput = this.cardNoInput;
        customCardInformationInput.headerLabel.setTextColor(setLastBaselineToBottomHeight.read(customCardInformationInput.getContext(), R.color.f66022131099757));
        customCardInformationInput.cardNoInputField.setEnabled(false);
        customCardInformationInput.cardNoInputField.setFocusable(false);
        customCardInformationInput.cardNoInputField.setClickable(false);
        customCardInformationInput.cardNoInputField.setTextColor(setLastBaselineToBottomHeight.read(customCardInformationInput.getContext(), R.color.f66022131099757));
        this.txtVwCreditLimitOrAtmPin.setVisibility(0);
        if (getContext() != null) {
            this.txtVwCreditLimitOrAtmPin.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66022131099757));
        }
        this.atmPinInput.setVisibility(8);
        this.atmPinInput.setATMNumber("");
        this.creditCardLimitInput.setVisibility(0);
        IconCompatParcelizer(true);
        this.creditCardLimitInput.setText(str2);
        this.creditCardLimitInput.setClickable(false);
        this.creditCardLimitInput.setFocusable(false);
        if (getContext() != null) {
            this.creditCardLimitInput.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66022131099757));
        }
        this.creditCardLimitInput.setEnabled(false);
        this.btnClearCreditCardLimit.setVisibility(8);
        this.nextButton.setVisibility(0);
        this.nextButton.setEnabled(false);
        this.expiryDateView.setVisibility(0);
    }

    public final void IconCompatParcelizer(String str) {
        ParcelableVolumeInfo(str);
    }

    public final void read() {
        this.cardNoInput.setIcon((int) R.drawable.ic_atm_card);
    }

    public final void write() {
        this.cardNoInput.setIcon((int) R.drawable.ic_credit_card);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.cardNoInput.setIcon((int) R.drawable.ic_sample_card_grey);
    }

    public final void IconCompatParcelizer() {
        this.cardNoInput.setErrorValidationVisibility(0);
        this.cardNoInput.setErrorInLine(R.string.registration_unknown_card_error);
    }

    public final void RatingCompat() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.atmPinInput.IconCompatParcelizer());
        if (this.atmPinInput.getVisibility() != 0) {
            this.atmPinInput.setATMNumber("");
            this.atmPinInput.setVisibility(0);
        }
        this.txtVwCreditLimitOrAtmPin.setText(getString(R.string.registration_card_detail_atm_pin));
        this.txtVwCreditLimitOrAtmPin.setVisibility(0);
        this.nextButton.setVisibility(0);
    }

    public final void MediaDescriptionCompat() {
        this.atmPinInput.atmPin.requestFocus();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.presenter.MediaBrowserCompat$ItemReceiver();
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(!TextUtils.isEmpty(this.creditCardLimitInput.getText().toString()));
        if (this.creditCardLimitInput.getVisibility() != 0) {
            this.creditCardLimitInput.setText("");
            this.creditCardLimitInput.setVisibility(0);
            IconCompatParcelizer(true);
        }
        this.txtVwCreditLimitOrAtmPin.setText(getString(R.string.registration_card_detail_credit_limit));
        this.txtVwCreditLimitOrAtmPin.setVisibility(0);
        this.nextButton.setVisibility(0);
    }

    public final void MediaMetadataCompat() {
        this.creditCardLimitInput.requestFocus();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void read(boolean z) {
        this.faceRecognitionLayout.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$MediaItem() {
        if (getContext() != null) {
            SplashActivity.IconCompatParcelizer(getContext());
        }
    }

    public final void IconCompatParcelizer(parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        Intent intent;
        if (getContext() != null) {
            if (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.FAST_EASY) {
                intent = RegistrationFacialRecognitionLandingActivity.MediaBrowserCompat$ItemReceiver(getContext(), binaryImagesJsonFromMapsFile.NEW_REGISTRATION);
            } else {
                intent = RegistrationFacialRecognitionLandingActivity.MediaBrowserCompat$ItemReceiver(getContext(), binaryImagesJsonFromMapsFile.FORGOT_PIN);
            }
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(mB$MediaBrowserCompat$ItemReceiver mb_mediabrowsercompat_itemreceiver) {
        if (getContext() != null && getActivity() != null) {
            Intent read = RegistrationTermsAndConsActivity.read(getContext(), mb_mediabrowsercompat_itemreceiver);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            getActivity().finish();
        }
    }

    public final void MediaSessionCompat$Token() {
        Intent intent = new Intent(getContext(), ForgotPinOtpActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            Intent read = RegistrationDeadCardActivity.read(context, str, str2, this.presenter.MediaBrowserCompat$SearchResultReceiver);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Context context = getContext();
        if (context != null) {
            MonthYearPickerDialog monthYearPickerDialog = new MonthYearPickerDialog(context);
            int i = this.IconCompatParcelizer;
            if (i < monthYearPickerDialog.MediaBrowserCompat$ItemReceiver.length) {
                monthYearPickerDialog.MediaBrowserCompat$CustomActionResultReceiver = i;
                ColorChangeableNumberPicker colorChangeableNumberPicker = monthYearPickerDialog.MediaMetadataCompat.monthPicker;
                if (colorChangeableNumberPicker == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
                }
                colorChangeableNumberPicker.setValue(monthYearPickerDialog.MediaBrowserCompat$CustomActionResultReceiver);
            }
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 < monthYearPickerDialog.MediaDescriptionCompat.length) {
                monthYearPickerDialog.MediaBrowserCompat$MediaItem = i2;
                ColorChangeableNumberPicker colorChangeableNumberPicker2 = monthYearPickerDialog.MediaMetadataCompat.yearPicker;
                if (colorChangeableNumberPicker2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
                }
                colorChangeableNumberPicker2.setValue(monthYearPickerDialog.MediaBrowserCompat$MediaItem);
            }
            TextView textView = monthYearPickerDialog.MediaMetadataCompat.tvTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
            }
            textView.setText(monthYearPickerDialog.write.getResources().getString(R.string.registration_select_expiry_date));
            ActivityBuilder_ContributeMwPinnedSuccessActivity activityBuilder_ContributeMwPinnedSuccessActivity = new ActivityBuilder_ContributeMwPinnedSuccessActivity(this);
            onGetStartedClick.write((Object) activityBuilder_ContributeMwPinnedSuccessActivity, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            monthYearPickerDialog.read = activityBuilder_ContributeMwPinnedSuccessActivity;
            monthYearPickerDialog.IconCompatParcelizer.show();
        }
    }

    public final void write(String str, String str2) {
        this.tvExpiryMonth.setText(str);
        this.tvExpiryYear.setText(str2);
        this.tvExpiryMonth.setBackgroundResource(R.drawable.shape_purple_border_rounded_rectangle);
        this.tvExpiryYear.setBackgroundResource(R.drawable.shape_purple_border_rounded_rectangle);
    }

    /* access modifiers changed from: private */
    public void IconCompatParcelizer(boolean z) {
        int i = 8;
        if (!z) {
            this.btnClearCreditCardLimit.setVisibility(8);
            return;
        }
        ImageButton imageButton = this.btnClearCreditCardLimit;
        if (!TextUtils.isEmpty(this.creditCardLimitInput.getText())) {
            i = 0;
        }
        imageButton.setVisibility(i);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RegistrationCardDetailFragment registrationCardDetailFragment) {
        registrationCardDetailFragment.creditCardLimitInput.setVisibility(8);
        registrationCardDetailFragment.IconCompatParcelizer(false);
    }
}
