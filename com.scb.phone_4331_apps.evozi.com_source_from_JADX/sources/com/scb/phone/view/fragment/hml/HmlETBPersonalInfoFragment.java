package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlMonthlyIncomeAboutActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomLaserIdInput;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_BindCCTermsAndConditionsActivity;
import p040o.ActivityBuilder_BindCardlessATMSuccessfulRequestActivity;
import p040o.ActivityBuilder_BindCardlessATMTermsConditionsActivity;
import p040o.ContentFrameLayout;
import p040o.CustomAdvertisingIdClient;
import p040o.LookAndFeelParameters_Factory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RotateType;
import p040o.ZSYR2K;
import p040o.getPageID$MediaBrowserCompat$ItemReceiver;
import p040o.listSessionBeginFiles;
import p040o.setTapText;

public abstract class HmlETBPersonalInfoFragment extends HmlBasePersonalInfoFragment implements LookAndFeelParameters_Factory {
    public CustomAdvertisingIdClient MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView tvETBExpiryDateTitle;

    /* access modifiers changed from: protected */
    /* renamed from: setChecked */
    public abstract void ActionMenuItemView();

    public final void MediaBrowserCompat$CustomActionResultReceiver(CustomAdvertisingIdClient customAdvertisingIdClient) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAdvertisingIdClient;
        this.IconCompatParcelizer = customAdvertisingIdClient;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1002 && i2 == -1 && intent != null) {
            CustomAdvertisingIdClient customAdvertisingIdClient = this.MediaBrowserCompat$CustomActionResultReceiver;
            String stringExtra = intent.getStringExtra("com.scb.phone.EXTRA_RESULT_ADDRESS");
            RotateType rotateType = new RotateType(stringExtra);
            if (customAdvertisingIdClient.RatingCompat != null) {
                rotateType.IconCompatParcelizer(customAdvertisingIdClient.RatingCompat);
            }
            customAdvertisingIdClient.write(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, !stringExtra.isEmpty(), TextUtils.isEmpty(stringExtra));
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void read() {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.MediaBrowserCompat$CustomActionResultReceiver;
        String obj = this.firstNameView.mEditText.getText().toString();
        String obj2 = this.lastNameView.mEditText.getText().toString();
        String obj3 = this.mobileNumberView.mEditText.getText().toString();
        String obj4 = this.emailView.mEditText.getText().toString();
        String obj5 = this.income.getText().toString();
        String MediaBrowserCompat$ItemReceiver = this.maritalStatusSpinner.MediaBrowserCompat$ItemReceiver();
        String MediaBrowserCompat$ItemReceiver2 = this.residentialStatusSpinner.MediaBrowserCompat$ItemReceiver();
        String MediaBrowserCompat$ItemReceiver3 = this.educationLevelSpinner.MediaBrowserCompat$ItemReceiver();
        String obj6 = this.baseExpiredDate.inputEditText.getText().toString();
        String write = this.laserIdInput.write();
        setStackedBackground();
        customAdvertisingIdClient.MediaBrowserCompat$CustomActionResultReceiver(obj, obj2, obj3, obj4, obj5, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3, obj6, write);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("monthly_income", this.income.getText().toString())};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_verification_personal_info", zsyr2kArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void AppCompatActivity() {
        this.baseExpiredDate.setDateUpdatedListener(new ActivityBuilder_BindCardlessATMTermsConditionsActivity(this));
        this.baseExpiredDate.setValidateInputListener(new ActivityBuilder_BindCardlessATMSuccessfulRequestActivity(this));
    }

    @OnClick
    public void onAboutClicked(View view) {
        Intent IconCompatParcelizer = HmlMonthlyIncomeAboutActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.scb.phone.view.fragment.hml.HmlETBPersonalInfoFragment$4 */
    static /* synthetic */ class C59884 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o.getPageID$MediaBrowserCompat$ItemReceiver[] r0 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlETBPersonalInfoFragment.C59884.<clinit>():void");
        }
    }

    public final void read(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59884.MediaBrowserCompat$ItemReceiver[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i == 1) {
            this.baseExpiredDate.setErrorText(getString(R.string.hml_personal_info_national_id_expired_date_error));
            this.baseExpiredDate.setErrorVisible(true);
        } else if (i != 2) {
            super.read(getpageid_mediabrowsercompat_itemreceiver);
        } else {
            this.laserIdInput.setError(getString(R.string.hml_personal_info_laser_id_invalid_error));
            CustomLaserIdInput customLaserIdInput = this.laserIdInput;
            customLaserIdInput.tvLaserIdError.setVisibility(0);
            customLaserIdInput.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    public final void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        if (C59884.MediaBrowserCompat$ItemReceiver[getpageid_mediabrowsercompat_itemreceiver.ordinal()] != 1) {
            super.write(getpageid_mediabrowsercompat_itemreceiver);
        } else {
            this.baseExpiredDate.setErrorVisible(false);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        int i = C59884.MediaBrowserCompat$ItemReceiver[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        if (i == 1) {
            this.baseExpiredDate.setErrorText(getString(R.string.hml_personal_info_date_of_expiry_format_error));
            this.baseExpiredDate.setErrorVisible(true);
        } else if (i != 2) {
            super.MediaBrowserCompat$ItemReceiver(getpageid_mediabrowsercompat_itemreceiver);
        } else {
            this.laserIdInput.setError(getString(R.string.hml_personal_info_laser_id_wrong_format));
            CustomLaserIdInput customLaserIdInput = this.laserIdInput;
            customLaserIdInput.tvLaserIdError.setVisibility(0);
            customLaserIdInput.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$CustomActionResultReceiver.onDestroy();
        super.onDestroy();
    }

    public final void read(listSessionBeginFiles listsessionbeginfiles) {
        String str = listsessionbeginfiles.MediaBrowserCompat$SearchResultReceiver;
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        if (str != null && !str.isEmpty()) {
            customPhoneNumberInput.setText(str);
        }
        String str2 = listsessionbeginfiles.read;
        CommonInputViewGroup commonInputViewGroup = this.emailView;
        if (str2 != null && !str2.isEmpty()) {
            commonInputViewGroup.setText(str2);
        }
        this.emailView.mEditText.setEnabled(listsessionbeginfiles.MediaBrowserCompat$CustomActionResultReceiver);
        if (!listsessionbeginfiles.MediaBrowserCompat$CustomActionResultReceiver) {
            this.emailView.mEditText.setTextColor(ContentFrameLayout.write(getResources(), R.color.f66182131099773, (Resources.Theme) null));
            ImageButton imageButton = this.emailView.mEditPencilImageButton;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            this.emailView.setPencilEditListener(new ActivityBuilder_BindCCTermsAndConditionsActivity(this));
        } else {
            ImageButton imageButton2 = this.emailView.mEditPencilImageButton;
            if (imageButton2 != null) {
                imageButton2.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(listsessionbeginfiles.MediaBrowserCompat$ItemReceiver)) {
            this.income.setText(listsessionbeginfiles.MediaBrowserCompat$ItemReceiver);
        }
        if (listsessionbeginfiles.write != null && !TextUtils.isEmpty(listsessionbeginfiles.write)) {
            this.baseExpiredDate.setText(listsessionbeginfiles.write);
        }
        if (!TextUtils.isEmpty(listsessionbeginfiles.MediaBrowserCompat$MediaItem)) {
            this.laserIdInput.setLaserId(listsessionbeginfiles.MediaBrowserCompat$MediaItem);
        }
        this.mailingView.setText(listsessionbeginfiles.RatingCompat);
    }
}
