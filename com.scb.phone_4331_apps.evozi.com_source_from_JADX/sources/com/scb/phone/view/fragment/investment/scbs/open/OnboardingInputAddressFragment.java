package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CaptureAnimationsModule;
import p040o.CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory;
import p040o.CaptureMessage;
import p040o.CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportWorkflowActivity;
import p040o.ResponseParser;
import p040o.addDelayedShutdownHook;
import p040o.getDeviceRatio;
import p040o.gzipInputStream;
import p040o.keyType;
import p040o.keyType$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.valueType;

public class OnboardingInputAddressFragment extends BaseFragment implements PassportWorkflowActivity.C6985a {
    private String IconCompatParcelizer;
    @BindView
    TextView addressTitleTextView;
    @BindView
    TextView districtAutofilledTextView;
    @BindView
    OnboardingInputAddressItemCustomView floorCustomView;
    @BindView
    OnboardingInputAddressItemCustomView houseNumberCustomView;
    @BindView
    OnboardingInputAddressItemCustomView mooCustomView;
    @BindView
    Button nextButton;
    @BindView
    TextView postalCodeAutofilledTextView;
    @HmlPinActivity
    public CaptureMessage presenter;
    @BindView
    OnboardingAddressInformationItemCustomView provinceCustomView;
    @BindView
    OnboardingInputAddressItemCustomView roadCustomView;
    @BindView
    OnboardingInputAddressItemCustomView soiCustomView;
    @BindView
    TextView subdistrictAutofilledTextView;
    @BindView
    OnboardingInputAddressItemCustomView unitCustomView;
    @BindView
    OnboardingInputAddressItemCustomView villageBuildingCustomView;

    public static OnboardingInputAddressFragment MediaBrowserCompat$ItemReceiver(gzipInputStream gzipinputstream, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PERSONAL_ADDRESS", gzipinputstream);
        bundle.putString("ADDRESS_TYPE", str);
        OnboardingInputAddressFragment onboardingInputAddressFragment = new OnboardingInputAddressFragment();
        onboardingInputAddressFragment.setArguments(bundle);
        return onboardingInputAddressFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0144, code lost:
        if (r2.equals("HOME") == false) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r6 = 0
            r0 = 2131494100(0x7f0c04d4, float:1.8611699E38)
            android.view.View r7 = r9.inflate(r0, r10, r6)
            butterknife.ButterKnife.IconCompatParcelizer(r8, r7)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.houseNumberCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeAddAccountOtpActivity r5 = new o.ActivityBuilder_ContributeAddAccountOtpActivity
            r5.<init>(r0)
            r2 = 2131759741(0x7f10127d, float:1.9150483E38)
            r3 = 2131759731(0x7f101273, float:1.9150463E38)
            r4 = 9
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r0 = r8.houseNumberCustomView
            r1 = 2131759741(0x7f10127d, float:1.9150483E38)
            r0.setTitleWithMandatory(r1)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.unitCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeActivateChequeLandingActivity r5 = new o.ActivityBuilder_ContributeActivateChequeLandingActivity
            r5.<init>(r0)
            r2 = 2131759758(0x7f10128e, float:1.9150517E38)
            r3 = 2131759735(0x7f101277, float:1.915047E38)
            r4 = 7
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.floorCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeAssesmentPopupActivity r5 = new o.ActivityBuilder_ContributeAssesmentPopupActivity
            r5.<init>(r0)
            r2 = 2131759738(0x7f10127a, float:1.9150477E38)
            r3 = 2131759730(0x7f101272, float:1.915046E38)
            r4 = 5
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.villageBuildingCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeAccountManagementActivity r5 = new o.ActivityBuilder_ContributeAccountManagementActivity
            r5.<init>(r0)
            r2 = 2131759760(0x7f101290, float:1.9150521E38)
            r3 = 2131759736(0x7f101278, float:1.9150473E38)
            r4 = 30
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.mooCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeAddNewCurrencyActivity r5 = new o.ActivityBuilder_ContributeAddNewCurrencyActivity
            r5.<init>(r0)
            r2 = 2131759743(0x7f10127f, float:1.9150487E38)
            r3 = 2131759732(0x7f101274, float:1.9150465E38)
            r4 = 3
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.soiCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeBankingAgentReviewActivity r5 = new o.ActivityBuilder_ContributeBankingAgentReviewActivity
            r5.<init>(r0)
            r2 = 2131759754(0x7f10128a, float:1.915051E38)
            r3 = 2131759734(0x7f101276, float:1.9150469E38)
            r4 = 30
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingInputAddressItemCustomView r1 = r8.roadCustomView
            o.CaptureMessage r0 = r8.presenter
            o.ActivityBuilder_ContributeAddAccountsActivity r5 = new o.ActivityBuilder_ContributeAddAccountsActivity
            r5.<init>(r0)
            r2 = 2131759752(0x7f101288, float:1.9150505E38)
            r3 = 2131759733(0x7f101275, float:1.9150467E38)
            r0 = r8
            r0.write(r1, r2, r3, r4, r5)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            r1 = 2131759751(0x7f101287, float:1.9150503E38)
            r0.setTitleWithMandatory(r1)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            r1 = 2131759753(0x7f101289, float:1.9150507E38)
            r0.setTextHint(r1)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            r0.setEnabledAddress(r6)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            r0.setEnabledSeparator(r6)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            r1 = 1
            r0.setEnabledClickedAddressTextBox(r1)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            o.ActivityBuilder_BindTempLimitReviewActivity r2 = new o.ActivityBuilder_BindTempLimitReviewActivity
            r2.<init>(r8)
            r0.setOnClickListener(r2)
            com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView r0 = r8.provinceCustomView
            o.ActivityBuilder_BindTempLimitHomeActivity r2 = new o.ActivityBuilder_BindTempLimitHomeActivity
            r2.<init>(r8)
            r0.setOnAddressChangedListener(r2)
            android.widget.Button r0 = r8.nextButton
            r0.setEnabled(r6)
            o.CaptureMessage r0 = r8.presenter
            r0.MediaBrowserCompat$ItemReceiver(r8)
            android.os.Bundle r0 = r8.getArguments()
            if (r0 == 0) goto L_0x0182
            java.lang.String r2 = "ADDRESS_TYPE"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0182
            java.lang.String r3 = "PERSONAL_ADDRESS"
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x0182
            java.lang.String r2 = r0.getString(r2)
            android.os.Parcelable r0 = r0.getParcelable(r3)
            o.gzipInputStream r0 = (p040o.gzipInputStream) r0
            o.CaptureMessage r3 = r8.presenter
            o.Rotate r4 = new o.Rotate
            r4.<init>(r3, r2, r0)
            T r0 = r3.RatingCompat
            if (r0 == 0) goto L_0x010c
            r0 = r1
            goto L_0x010d
        L_0x010c:
            r0 = r6
        L_0x010d:
            if (r0 == 0) goto L_0x0114
            T r0 = r3.RatingCompat
            r4.IconCompatParcelizer(r0)
        L_0x0114:
            if (r2 == 0) goto L_0x0182
            int r0 = r2.hashCode()
            r3 = 2223327(0x21ecdf, float:3.115545E-39)
            r4 = 2
            if (r0 == r3) goto L_0x013e
            r3 = 2670353(0x28bf11, float:3.741962E-39)
            if (r0 == r3) goto L_0x0134
            r3 = 1844922713(0x6df74959, float:9.5664337E27)
            if (r0 != r3) goto L_0x0146
            java.lang.String r0 = "CURRENT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0146
            r6 = r1
            goto L_0x0147
        L_0x0134:
            java.lang.String r0 = "WORK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0146
            r6 = r4
            goto L_0x0147
        L_0x013e:
            java.lang.String r0 = "HOME"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0147
        L_0x0146:
            r6 = -1
        L_0x0147:
            if (r6 == 0) goto L_0x0171
            if (r6 == r1) goto L_0x015f
            if (r6 != r4) goto L_0x0182
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x0182
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            java.lang.String r1 = "scbsonboard_officeaddress_input"
            r0.mo13676d_(r1)
            goto L_0x0182
        L_0x015f:
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x0182
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            java.lang.String r1 = "scbsonboard_currentaddress_input"
            r0.mo13676d_(r1)
            goto L_0x0182
        L_0x0171:
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x0182
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            java.lang.String r1 = "scbsonboard_houseaddress_input"
            r0.mo13676d_(r1)
        L_0x0182:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1 && i2 == -1) {
            addDelayedShutdownHook adddelayedshutdownhook = (addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY");
            CaptureMessage captureMessage = this.presenter;
            ResponseParser responseParser = captureMessage.ParcelableVolumeInfo;
            String str = adddelayedshutdownhook.MediaDescriptionCompat;
            onGetStartedClick.write((Object) str, "<set-?>");
            responseParser.read = str;
            ResponseParser responseParser2 = captureMessage.ParcelableVolumeInfo;
            String str2 = adddelayedshutdownhook.RatingCompat;
            onGetStartedClick.write((Object) str2, "<set-?>");
            responseParser2.MediaBrowserCompat$SearchResultReceiver = str2;
            ResponseParser responseParser3 = captureMessage.ParcelableVolumeInfo;
            String str3 = adddelayedshutdownhook.read;
            onGetStartedClick.write((Object) str3, "<set-?>");
            responseParser3.MediaBrowserCompat$ItemReceiver = str3;
            ResponseParser responseParser4 = captureMessage.ParcelableVolumeInfo;
            String str4 = adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str4, "<set-?>");
            responseParser4.MediaSessionCompat$ResultReceiverWrapper = str4;
            getDeviceRatio getdeviceratio = new getDeviceRatio(adddelayedshutdownhook);
            if (captureMessage.RatingCompat != null) {
                getdeviceratio.IconCompatParcelizer(captureMessage.RatingCompat);
            }
            CaptureAnimationsModule captureAnimationsModule = new CaptureAnimationsModule(captureMessage);
            if (captureMessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                captureAnimationsModule.IconCompatParcelizer(captureMessage.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    private void write(OnboardingInputAddressItemCustomView onboardingInputAddressItemCustomView, int i, int i2, int i3, final OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver onboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver) {
        onboardingInputAddressItemCustomView.setTitle(i);
        onboardingInputAddressItemCustomView.setTextHint(i2);
        onboardingInputAddressItemCustomView.setTextInputLimit(i3);
        onboardingInputAddressItemCustomView.inputAddressEditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                OnboardingInputAddressFragment$MediaBrowserCompat$ItemReceiver.this.IconCompatParcelizer(editable.toString());
            }
        });
    }

    @OnClick
    public void clickNextButton() {
        keyType keytype;
        CaptureMessage captureMessage = this.presenter;
        boolean z = !CaptureMessage.MediaBrowserCompat$SearchResultReceiver.contains(captureMessage.ParcelableVolumeInfo.MediaMetadataCompat);
        boolean z2 = !CaptureMessage.IconCompatParcelizer.contains(captureMessage.ParcelableVolumeInfo.RatingCompat);
        boolean z3 = !CaptureMessage.write.contains(captureMessage.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z4 = !CaptureMessage.MediaBrowserCompat$MediaItem.contains(captureMessage.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem);
        boolean z5 = !CaptureMessage.MediaBrowserCompat$ItemReceiver.contains(captureMessage.ParcelableVolumeInfo.f2778x50fd9e4a);
        boolean z6 = !CaptureMessage.MediaMetadataCompat.contains(captureMessage.ParcelableVolumeInfo.MediaSessionCompat$QueueItem);
        boolean z7 = !CaptureMessage.read.contains(captureMessage.ParcelableVolumeInfo.write);
        CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory captureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory = r1;
        CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory captureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory2 = new CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory(captureMessage, z, z2, z3, z4, z5, z6, z7);
        if (captureMessage.RatingCompat != null) {
            captureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory.IconCompatParcelizer(captureMessage.RatingCompat);
        }
        if (z && z2 && z3 && z4 && z5 && z6 && z7) {
            if (captureMessage.RatingCompat != null) {
                captureMessage.RatingCompat.AlertController$RecycleListView();
            }
            String str = captureMessage.MediaDescriptionCompat;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 2223327) {
                if (hashCode != 2670353) {
                    if (hashCode == 1844922713 && str.equals("CURRENT")) {
                        c = 2;
                    }
                } else if (str.equals("WORK")) {
                    c = 1;
                }
            } else if (str.equals("HOME")) {
                c = 0;
            }
            keyType keytype2 = null;
            if (c == 0) {
                keyType$MediaBrowserCompat$ItemReceiver keytype_mediabrowsercompat_itemreceiver = keyType.MediaBrowserCompat$CustomActionResultReceiver;
                valueType write = captureMessage.write();
                onGetStartedClick.write((Object) write, "address");
                keytype = new keyType(write, (valueType) null, (valueType) null);
            } else if (c != 1) {
                if (c == 2) {
                    keyType$MediaBrowserCompat$ItemReceiver keytype_mediabrowsercompat_itemreceiver2 = keyType.MediaBrowserCompat$CustomActionResultReceiver;
                    valueType write2 = captureMessage.write();
                    onGetStartedClick.write((Object) write2, "address");
                    keytype = new keyType((valueType) null, (valueType) null, write2);
                }
                captureMessage.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(keytype2);
                captureMessage.MediaSessionCompat$QueueItem.IconCompatParcelizer(new CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver(captureMessage, (byte) 0));
            } else {
                keyType$MediaBrowserCompat$ItemReceiver keytype_mediabrowsercompat_itemreceiver3 = keyType.MediaBrowserCompat$CustomActionResultReceiver;
                valueType write3 = captureMessage.write();
                onGetStartedClick.write((Object) write3, "address");
                keytype = new keyType((valueType) null, write3, (valueType) null);
            }
            keytype2 = keytype;
            captureMessage.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(keytype2);
            captureMessage.MediaSessionCompat$QueueItem.IconCompatParcelizer(new CaptureMessage$MediaBrowserCompat$CustomActionResultReceiver(captureMessage, (byte) 0));
        }
    }

    public final void read() {
        this.addressTitleTextView.setText(R.string.onboarding_input_address_please_enter_your_house_registration_address);
        String string = getString(R.string.onboarding_input_address_house_registration_address);
        this.IconCompatParcelizer = string;
        ParcelableVolumeInfo(string);
    }

    public final void write() {
        this.addressTitleTextView.setText(R.string.onboarding_input_address_please_enter_your_office_address);
        String string = getString(R.string.onboarding_input_address_office_address);
        this.IconCompatParcelizer = string;
        ParcelableVolumeInfo(string);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.addressTitleTextView.setText(R.string.onboarding_input_address_please_enter_your_current_address);
        String string = getString(R.string.onboarding_input_address_current_address);
        this.IconCompatParcelizer = string;
        ParcelableVolumeInfo(string);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(gzipInputStream gzipinputstream) {
        this.houseNumberCustomView.setText(gzipinputstream.read);
        this.unitCustomView.setText(gzipinputstream.MediaSessionCompat$ResultReceiverWrapper);
        this.floorCustomView.setText(gzipinputstream.ParcelableVolumeInfo);
        this.villageBuildingCustomView.setText(gzipinputstream.MediaMetadataCompat);
        this.mooCustomView.setText(gzipinputstream.MediaBrowserCompat$ItemReceiver);
        this.soiCustomView.setText(gzipinputstream.MediaBrowserCompat$MediaItem);
        this.roadCustomView.setText(gzipinputstream.MediaBrowserCompat$SearchResultReceiver);
        if (!TextUtils.isEmpty(gzipinputstream.MediaDescriptionCompat)) {
            this.provinceCustomView.setEnabledAddress(true);
            this.provinceCustomView.setEnabledTextHint(false);
            this.provinceCustomView.setAddress(gzipinputstream.MediaDescriptionCompat);
        }
        if (!TextUtils.isEmpty(gzipinputstream.write)) {
            this.districtAutofilledTextView.setText(gzipinputstream.write);
        }
        if (!TextUtils.isEmpty(gzipinputstream.IconCompatParcelizer)) {
            this.subdistrictAutofilledTextView.setText(gzipinputstream.IconCompatParcelizer);
        }
        if (!TextUtils.isEmpty(gzipinputstream.RatingCompat)) {
            this.postalCodeAutofilledTextView.setText(gzipinputstream.RatingCompat);
        }
    }

    public final void write(addDelayedShutdownHook adddelayedshutdownhook) {
        this.provinceCustomView.setEnabledAddress(true);
        this.provinceCustomView.setEnabledTextHint(false);
        this.provinceCustomView.setAddress(adddelayedshutdownhook.RatingCompat);
        this.districtAutofilledTextView.setText(adddelayedshutdownhook.read);
        this.subdistrictAutofilledTextView.setText(adddelayedshutdownhook.MediaDescriptionCompat);
        this.postalCodeAutofilledTextView.setText(adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent read = AddressSearchActivity.read(getContext(), this.IconCompatParcelizer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        setTitleMarginStart fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.RatingCompat();
            getTargetFragment().onActivityResult(0, -1, (Intent) null);
        }
    }
}
