package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlMailingAddressActivity;
import com.scb.phone.view.activity.hml.HmlNTBLaserIdAboutActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.CustomLaserIdInput;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import org.jmrtd.cbeff.ISO781611;
import p040o.ActivityBuilder_AddAccountInfoActivity;
import p040o.ActivityBuilder_BScanCEntryPointActivity;
import p040o.DeepLinkModule_EasycashReferralSendDfwDeepLinkActivity;
import p040o.DeepLinkModule_MutualFundsPurchaseDeepLinkActivity;
import p040o.DeepLinkModule_NdidIdpDeepLinkActivity;
import p040o.DeepLinkModule_OprRenewDeepLinkActivity;
import p040o.DeepLinkModule_TopUpDeepLinkActivity;
import p040o.DeepLinkModule_WebViewDeepLinkActivity;
import p040o.DocumentType;
import p040o.FileService;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FragmentBuilder_BindETBProductTermConditionFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OcrParameters;
import p040o.PhenotypeFlag;
import p040o.copyFile;
import p040o.getEligibility;
import p040o.getExtractionType;
import p040o.getPageID;
import p040o.getPageID$MediaBrowserCompat$ItemReceiver;
import p040o.setImageProcessorConfiguration;
import p040o.setTapText;

public abstract class HmlBasePersonalInfoFragment extends BaseFragment implements CustomLaserIdInput.write, getExtractionType {
    public getPageID IconCompatParcelizer;
    private write MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    @BindView
    DateInputText baseExpiredDate;
    @BindView
    CustomSpinnerWithTitle educationLevelSpinner;
    @BindView
    TextView educationalLevelError;
    @BindView
    TextView emailRemark;
    @BindView
    CommonInputViewGroup emailView;
    @BindView
    CommonInputViewGroup firstNameView;
    @BindView
    public CustomEditText income;
    @BindView
    TextView incomeError;
    @BindView
    CustomLaserIdInput laserIdInput;
    @BindView
    CommonInputViewGroup lastNameView;
    @BindView
    ImageView mailingArrow;
    @BindView
    TextView mailingView;
    @BindView
    TextView mailingViewError;
    @BindView
    TextView maritalStatusError;
    @BindView
    CustomSpinnerWithTitle maritalStatusSpinner;
    @BindView
    TextView mobileNumberOtpMsg;
    @BindView
    CustomPhoneNumberInput mobileNumberView;
    @BindView
    View nameSection;
    @BindView
    TextView nameValue;
    @BindView
    Button nextButton;
    @BindView
    TextView residentialStatusError;
    @BindView
    CustomSpinnerWithTitle residentialStatusSpinner;
    @BindView
    public LinearLayout root;
    @BindView
    CheckBox sameAddressCheckBox;
    @BindView
    View separator;

    /* access modifiers changed from: protected */
    public abstract void AppCompatActivity();

    public int AppCompatDialogFragment() {
        return R.layout.f88062131494033;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AppCompatDialogFragment(), (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        AppCompatViewInflater();
        setExpandedFormat();
        write write2 = new write();
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        this.mailingView.addTextChangedListener(write2);
        this.mailingView.clearFocus();
        AppCompatActivity();
        this.nextButton.setOnClickListener(new ActivityBuilder_AddAccountInfoActivity(this));
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        customPhoneNumberInput.mEditText.setOnFocusChangeListener(new getEligibility(customPhoneNumberInput, customPhoneNumberInput.getOnFocusChangeListener(), 10, false));
        this.mobileNumberView.setErrorText(getString(R.string.hml_personal_info_empty_field));
        HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver = new HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
        this.MediaMetadataCompat = hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver;
        CustomPhoneNumberInput customPhoneNumberInput2 = this.mobileNumberView;
        customPhoneNumberInput2.mEditText.addTextChangedListener(hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver);
        customPhoneNumberInput2.MediaBrowserCompat$CustomActionResultReceiver.add(hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver);
        this.mobileNumberView.clearFocus();
        this.income.setFilters(new InputFilter[]{new FragmentBuilder_BindETBProductTermConditionFragment(17, 0)});
        CustomEditText customEditText = this.income;
        customEditText.addTextChangedListener(new FragmentBuilder_BindEasycashContactInformationFragment(customEditText, new DeepLinkModule_EasycashReferralSendDfwDeepLinkActivity(this)));
        this.income.setOnBackListener(new DeepLinkModule_NdidIdpDeepLinkActivity(this));
        this.income.setOnFocusChangeListener(new DeepLinkModule_MutualFundsPurchaseDeepLinkActivity(this));
        this.income.setOnEditorActionListener(new DeepLinkModule_WebViewDeepLinkActivity(this));
        CustomLaserIdInput customLaserIdInput = this.laserIdInput;
        C59689 r7 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                String write2 = HmlBasePersonalInfoFragment.this.laserIdInput.write();
                if (write2 != null) {
                    IconCompatParcelizer.write(getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID, write2.length() == 12 && write2.matches("[a-zA-Z0-9]*"), TextUtils.isEmpty(write2));
                }
            }
        };
        customLaserIdInput.etLaserIdFirst.addTextChangedListener(r7);
        customLaserIdInput.etLaserIdSecond.addTextChangedListener(r7);
        customLaserIdInput.etLaserIdThird.addTextChangedListener(r7);
        this.laserIdInput.setOnLaserIdListener(this);
        this.laserIdInput.setFocusListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
            }
        });
        CommonInputViewGroup commonInputViewGroup = this.emailView;
        C59656 r72 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                boolean z;
                getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                String obj = editable.toString();
                boolean z2 = true;
                boolean z3 = false;
                if (obj == null || obj.isEmpty()) {
                    DocumentType.SourceServer sourceServer = DocumentType.SourceServer.MediaBrowserCompat$CustomActionResultReceiver;
                    if (IconCompatParcelizer.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        sourceServer.IconCompatParcelizer(IconCompatParcelizer.RatingCompat);
                    }
                    IconCompatParcelizer.read(getPageID$MediaBrowserCompat$ItemReceiver.EMAIL, false);
                    return;
                }
                PhenotypeFlag.zza zza = IconCompatParcelizer.PlaybackStateCompat$CustomAction;
                if (obj == null) {
                    z = false;
                } else {
                    z = zza.IconCompatParcelizer.matcher(obj).matches();
                }
                if (!z) {
                    OcrParameters.Font font = OcrParameters.Font.write;
                    if (IconCompatParcelizer.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        font.IconCompatParcelizer(IconCompatParcelizer.RatingCompat);
                    }
                    IconCompatParcelizer.read(getPageID$MediaBrowserCompat$ItemReceiver.EMAIL, false);
                    return;
                }
                FileService fileService = FileService.MediaBrowserCompat$CustomActionResultReceiver;
                if (IconCompatParcelizer.RatingCompat != null) {
                    z3 = true;
                }
                if (z3) {
                    fileService.IconCompatParcelizer(IconCompatParcelizer.RatingCompat);
                }
                IconCompatParcelizer.read(getPageID$MediaBrowserCompat$ItemReceiver.EMAIL, true);
            }
        };
        commonInputViewGroup.mEditText.addTextChangedListener(r72);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(r72);
        this.maritalStatusSpinner.setSpinnerEventsListener(new CustomDropdownAwareSpinner.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                HmlBasePersonalInfoFragment.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment.this.maritalStatusSpinner.spinner.getSelectedItemPosition(), HmlBasePersonalInfoFragment.this.maritalStatusSpinner.MediaBrowserCompat$ItemReceiver(), getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS);
                getPageID IconCompatParcelizer2 = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                copyFile copyfile = new copyFile(IconCompatParcelizer2, getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS);
                if (IconCompatParcelizer2.RatingCompat != null) {
                    copyfile.IconCompatParcelizer(IconCompatParcelizer2.RatingCompat);
                }
            }
        });
        this.residentialStatusSpinner.setSpinnerEventsListener(new CustomDropdownAwareSpinner.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                HmlBasePersonalInfoFragment.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment.this.residentialStatusSpinner.spinner.getSelectedItemPosition(), (String) null, getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE);
                getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                copyFile copyfile = new copyFile(IconCompatParcelizer, getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE);
                if (IconCompatParcelizer.RatingCompat != null) {
                    copyfile.IconCompatParcelizer(IconCompatParcelizer.RatingCompat);
                }
            }
        });
        this.educationLevelSpinner.setSpinnerEventsListener(new CustomDropdownAwareSpinner.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                HmlBasePersonalInfoFragment.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment.this.educationLevelSpinner.spinner.getSelectedItemPosition(), (String) null, getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
                getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                copyFile copyfile = new copyFile(IconCompatParcelizer, getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
                if (IconCompatParcelizer.RatingCompat != null) {
                    copyfile.IconCompatParcelizer(IconCompatParcelizer.RatingCompat);
                }
            }
        });
        return inflate;
    }

    @OnClick
    public void onMailingClick() {
        getPageID getpageid = this.IconCompatParcelizer;
        setImageProcessorConfiguration setimageprocessorconfiguration = setImageProcessorConfiguration.write;
        if (getpageid.RatingCompat != null) {
            setimageprocessorconfiguration.IconCompatParcelizer(getpageid.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void AppCompatViewInflater() {
        this.firstNameView.requestFocus();
        this.firstNameView.mEditText.setInputType(524432);
        this.firstNameView.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ISO781611.BIOMETRIC_SUBTYPE_TAG)});
        write(this.firstNameView, getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME);
    }

    /* access modifiers changed from: protected */
    public final void setExpandedFormat() {
        this.lastNameView.clearFocus();
        this.lastNameView.mEditText.setInputType(524432);
        this.lastNameView.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        write(this.lastNameView, getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME);
    }

    public final void read(String str) {
        this.nameSection.setVisibility(0);
        this.nameValue.setText(str);
    }

    public final void write(String str, String str2) {
        this.separator.setVisibility(0);
        this.firstNameView.setVisibility(0);
        this.lastNameView.setVisibility(0);
        CommonInputViewGroup commonInputViewGroup = this.firstNameView;
        if (str != null && !str.isEmpty()) {
            commonInputViewGroup.setText(str);
        }
        CommonInputViewGroup commonInputViewGroup2 = this.lastNameView;
        if (str2 != null && !str2.isEmpty()) {
            commonInputViewGroup2.setText(str2);
        }
    }

    /* renamed from: com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment$2 */
    static /* synthetic */ class C59612 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getPageID$MediaBrowserCompat$ItemReceiver[] r0 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MOBILE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.INCOMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.EMAIL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment.C59612.<clinit>():void");
        }
    }

    public void MediaBrowserCompat$ItemReceiver(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59612.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        Boolean bool = Boolean.TRUE;
        switch (i) {
            case 1:
                this.firstNameView.setErrorText(getString(R.string.hml_personal_info_first_name_thai_only));
                this.firstNameView.MediaBrowserCompat$ItemReceiver();
                return;
            case 2:
                this.lastNameView.setErrorText(getString(R.string.hml_personal_info_last_name_thai_only));
                this.lastNameView.MediaBrowserCompat$ItemReceiver();
                return;
            case 3:
                this.mobileNumberView.setErrorText(getString(R.string.hml_personal_info_invalid_format));
                this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
                return;
            case 4:
                this.incomeError.setText(R.string.hml_personal_info_monthly_income_error);
                this.incomeError.setVisibility(0);
                this.income.MediaBrowserCompat$CustomActionResultReceiver(true);
                return;
            case 5:
                this.emailRemark.setVisibility(8);
                this.emailView.setErrorText(getString(R.string.hml_personal_info_invalid_format));
                this.emailView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 6:
                this.educationalLevelError.setVisibility(0);
                this.educationLevelSpinner.setSpinnerBackground(bool);
                return;
            case 7:
                this.maritalStatusError.setVisibility(0);
                this.maritalStatusSpinner.setSpinnerBackground(bool);
                return;
            case 8:
                this.laserIdInput.setError(getString(R.string.auto_personal_laser_id_error_invalid));
                CustomLaserIdInput customLaserIdInput = this.laserIdInput;
                customLaserIdInput.tvLaserIdError.setVisibility(0);
                customLaserIdInput.MediaBrowserCompat$ItemReceiver(false);
                return;
            default:
                return;
        }
    }

    public void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59612.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        Boolean bool = Boolean.FALSE;
        switch (i) {
            case 1:
                this.firstNameView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 2:
                this.lastNameView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 3:
                this.mobileNumberView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 4:
                this.incomeError.setVisibility(8);
                this.income.MediaBrowserCompat$CustomActionResultReceiver(true);
                return;
            case 5:
                this.emailRemark.setVisibility(0);
                this.emailView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 6:
                this.educationalLevelError.setVisibility(8);
                this.educationLevelSpinner.setSpinnerBackground(bool);
                return;
            case 7:
                this.maritalStatusError.setVisibility(8);
                this.maritalStatusSpinner.setSpinnerBackground(bool);
                return;
            case 8:
                CustomLaserIdInput customLaserIdInput = this.laserIdInput;
                customLaserIdInput.tvLaserIdError.setVisibility(8);
                customLaserIdInput.MediaBrowserCompat$ItemReceiver(true);
                return;
            case 9:
                this.residentialStatusError.setVisibility(8);
                this.residentialStatusSpinner.setSpinnerBackground(bool);
                return;
            case 10:
                this.mailingViewError.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.mailingView.setText(str);
        TextView textView = this.mailingView;
        getResources();
        textView.setTextColor(-13290951);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent write2 = HmlMailingAddressActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivityForResult(write2, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaMetadataCompat() {
        this.emailRemark.setVisibility(8);
        this.emailView.setErrorText(getString(R.string.hml_personal_info_email_empty_error));
        this.emailView.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.emailRemark.setVisibility(8);
        this.emailView.setErrorText(getString(R.string.hml_personal_info_email_invalid_error));
        this.emailView.MediaBrowserCompat$ItemReceiver();
    }

    public void read(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59612.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        Boolean bool = Boolean.TRUE;
        switch (i) {
            case 1:
                this.firstNameView.setErrorText(getString(R.string.hml_personal_info_empty_field));
                this.firstNameView.MediaBrowserCompat$ItemReceiver();
                return;
            case 2:
                this.lastNameView.setErrorText(getString(R.string.hml_personal_info_empty_field));
                this.lastNameView.MediaBrowserCompat$ItemReceiver();
                return;
            case 3:
                this.mobileNumberView.setErrorText(getString(R.string.hml_personal_info_empty_field));
                this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
                return;
            case 4:
                this.incomeError.setText(R.string.hml_personal_info_monthly_income_empty_error);
                this.incomeError.setVisibility(0);
                this.income.MediaBrowserCompat$CustomActionResultReceiver(false);
                return;
            case 5:
                this.emailRemark.setVisibility(8);
                this.emailView.setErrorText(getString(R.string.hml_personal_info_empty_field));
                this.emailView.MediaBrowserCompat$ItemReceiver();
                return;
            case 6:
                this.educationalLevelError.setVisibility(0);
                this.educationLevelSpinner.setSpinnerBackground(bool);
                return;
            case 7:
                this.maritalStatusError.setVisibility(0);
                this.maritalStatusSpinner.setSpinnerBackground(bool);
                return;
            case 8:
                this.laserIdInput.setError(getString(R.string.hml_personal_info_empty_field));
                CustomLaserIdInput customLaserIdInput = this.laserIdInput;
                customLaserIdInput.tvLaserIdError.setVisibility(0);
                customLaserIdInput.MediaBrowserCompat$ItemReceiver(false);
                return;
            case 9:
                this.residentialStatusError.setVisibility(0);
                this.residentialStatusSpinner.setSpinnerBackground(bool);
                return;
            case 10:
                this.mailingViewError.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public void write(final String str, List<String> list, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59612.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i == 6) {
            IconCompatParcelizer(this.educationLevelSpinner, str, list, R.string.hml_personal_info_select_education_level);
            this.educationLevelSpinner.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
                public final void write() {
                }

                public final void IconCompatParcelizer() {
                    HmlBasePersonalInfoFragment.this.write(getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
                    HmlBasePersonalInfoFragment.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(HmlBasePersonalInfoFragment.this.educationLevelSpinner.spinner.getSelectedItemPosition(), str, getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
                }
            });
        } else if (i == 7) {
            IconCompatParcelizer(this.maritalStatusSpinner, str, list, R.string.hml_personal_info_select_marital_status);
            this.maritalStatusSpinner.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
                public final void write() {
                }

                public final void IconCompatParcelizer() {
                    HmlBasePersonalInfoFragment.this.write(getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS);
                    getPageID IconCompatParcelizer2 = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                    int selectedItemPosition = HmlBasePersonalInfoFragment.this.maritalStatusSpinner.spinner.getSelectedItemPosition();
                    String str = str;
                    getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS;
                    HmlBasePersonalInfoFragment.this.maritalStatusSpinner.MediaBrowserCompat$ItemReceiver();
                    IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(selectedItemPosition, str, getpageid_mediabrowsercompat_itemreceiver);
                }
            });
        } else if (i == 9) {
            IconCompatParcelizer(this.residentialStatusSpinner, str, list, R.string.hml_personal_info_select_residential_status);
            this.residentialStatusSpinner.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
                public final void write() {
                }

                public final void IconCompatParcelizer() {
                    HmlBasePersonalInfoFragment.this.write(getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE);
                    getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
                    int selectedItemPosition = HmlBasePersonalInfoFragment.this.residentialStatusSpinner.spinner.getSelectedItemPosition();
                    String str = str;
                    getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE;
                    HmlBasePersonalInfoFragment.this.residentialStatusSpinner.MediaBrowserCompat$ItemReceiver();
                    IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(selectedItemPosition, str, getpageid_mediabrowsercompat_itemreceiver);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void write(final CommonInputViewGroup commonInputViewGroup, final getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        C59623 r0 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                HmlBasePersonalInfoFragment.this.IconCompatParcelizer.read(getpageid_mediabrowsercompat_itemreceiver, commonInputViewGroup.mEditText.getText().toString(), commonInputViewGroup.MediaBrowserCompat$ItemReceiver);
            }
        };
        commonInputViewGroup.mEditText.addTextChangedListener(r0);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(r0);
    }

    public class write extends FragmentBuilder_BindCreditLimitDisplayFragment {
        protected write() {
        }

        public final void afterTextChanged(Editable editable) {
            getPageID IconCompatParcelizer = HmlBasePersonalInfoFragment.this.IconCompatParcelizer;
            String obj = editable.toString();
            IconCompatParcelizer.read(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, obj != null && !TextUtils.isEmpty(obj));
        }
    }

    public final void write() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_occupation_back_dialog_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_occupation_back_dialog_text)).IconCompatParcelizer(getString(R.string.hml_personal_back_dialog_confirm), new DeepLinkModule_OprRenewDeepLinkActivity(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_personal_back_dialog_cancel), ActivityBuilder_BScanCEntryPointActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroyView() {
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        HmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver = this.MediaMetadataCompat;
        customPhoneNumberInput.mEditText.removeTextChangedListener(hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver);
        customPhoneNumberInput.MediaBrowserCompat$CustomActionResultReceiver.remove(hmlBasePersonalInfoFragment$MediaBrowserCompat$ItemReceiver);
        this.mailingView.removeTextChangedListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.IconCompatParcelizer.onDestroy();
        super.onDestroyView();
    }

    public final void ParcelableVolumeInfo() {
        Intent write2 = HmlNTBLaserIdAboutActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_personal_information_validation_error_header)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_personal_information_validation_error_message)).write(getString(R.string.ok), DeepLinkModule_TopUpDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, boolean z) {
        int i = z ? 8 : 0;
        int i2 = C59612.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i2 == 6) {
            this.educationalLevelError.setVisibility(i);
        } else if (i2 == 7) {
            this.maritalStatusError.setVisibility(i);
        } else if (i2 == 9) {
            this.residentialStatusError.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(CustomSpinnerWithTitle customSpinnerWithTitle, String str, List<String> list, int i) {
        customSpinnerWithTitle.IconCompatParcelizer = false;
        if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            customSpinnerWithTitle.spinner.setSelection(0);
        }
        if (str != null) {
            customSpinnerWithTitle.setItems(list, false, true);
            int indexOf = list.indexOf(str);
            if (indexOf != -1) {
                customSpinnerWithTitle.setSelectionIndex(indexOf);
                return;
            }
            return;
        }
        customSpinnerWithTitle.setHint(getString(i));
        customSpinnerWithTitle.setItems(list, true, false);
        customSpinnerWithTitle.setMandatory(true);
    }
}
