package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlCompanyNameActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlDocumentUploadGuidelineActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlWorkAddressActivity;
import com.scb.phone.view.activity.hml.frictionlessmoa.HmlMoaActivity;
import com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomPhoneNumberInput;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Arrays;
import java.util.List;
import p040o.ActivityBuilder_BindConfirmRedemptionActivity;
import p040o.ActivityBuilder_BindCreditCardBilledDetailActivity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C10153x840f965d;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FloatingActionButton;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NTBLandingActivity_ViewBinding;
import p040o.ReviewDeviceActivity_ViewBinding;
import p040o.getAuthApiSignInModuleVersion;
import p040o.getEligibility;
import p040o.getExitingExecutorService;
import p040o.getIPassportDetector;
import p040o.onGetStartedClick;
import p040o.setInfoWindowAdapter;
import p040o.setMapStyle;
import p040o.setMaxZoomPreference;
import p040o.setTapText;
import p040o.setWscClientIp;
import p040o.setWscClientIp$AlertController$RecycleListView;
import p040o.setWscClientIp$MediaBrowserCompat$ItemReceiver;
import p040o.setWscClientIp$MediaBrowserCompat$SearchResultReceiver;
import p040o.setWscClientIp$MediaSessionCompat$QueueItem;
import p040o.setWscClientIp$MediaSessionCompat$ResultReceiverWrapper;
import p040o.setWscClientIp$MediaSessionCompat$Token;
import p040o.setWscClientIp$PlaybackStateCompat$CustomAction;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public class HmlOccupationInfoFragment extends BaseFragment implements getIPassportDetector {
    private FragmentBuilder_BindCreditLimitDisplayFragment MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ProgressStateBar breadcrumbnsNtb;
    @BindView
    TextView companyName;
    @BindView
    TextView companyNameError;
    @BindView
    TextView experienceError;
    @BindView
    TextView job;
    @BindView
    TextView jobError;
    @BindView
    CustomPhoneNumberInput mobileNumberView;
    @BindView
    CustomSpinnerWithTitle monthsSpinner;
    @BindView
    Button nextButton;
    @HmlPinActivity
    public setWscClientIp presenter;
    @BindView
    LinearLayout root;
    @BindView
    Spinner sourceOfIncome;
    @BindView
    TextView sourceOfIncomeError;
    @BindView
    TextView workAddress;
    @BindView
    TextView workAddressError;
    @BindView
    CustomSpinnerWithTitle yearsSpinner;

    public static HmlOccupationInfoFragment MediaMetadataCompat() {
        return new HmlOccupationInfoFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87962131494023, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.root.requestFocus();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setWscClientIp setwscclientip = this.presenter;
        if (setwscclientip.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        BScanCNotificationDeepLinkActivity<List<R>> list = setwscclientip.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().flatMapIterable(setWscClientIp$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer).map(new setWscClientIp$MediaSessionCompat$Token(setwscclientip)).sorted(setWscClientIp.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver).toList();
        DebitCardMarketConductDeepLinkActivity keep = new setWscClientIp.Keep(setwscclientip);
        HmlLatestPersonalInformationDeepLinkActivity.write(keep, "onSuccess is null");
        ReviewDeviceActivity_ViewBinding reviewDeviceActivity_ViewBinding = new ReviewDeviceActivity_ViewBinding(list, keep);
        DirectDebitDeepLinkActivity setwscclientip_alertcontroller_recyclelistview = new setWscClientIp$AlertController$RecycleListView(setwscclientip);
        HmlLatestPersonalInformationDeepLinkActivity.write(setwscclientip_alertcontroller_recyclelistview, "mapper is null");
        setwscclientip.MediaMetadataCompat.write(new NTBLandingActivity_ViewBinding(reviewDeviceActivity_ViewBinding, setwscclientip_alertcontroller_recyclelistview).doOnNext(new setWscClientIp$PlaybackStateCompat$CustomAction(setwscclientip)), new setWscClientIp$MediaSessionCompat$QueueItem(setwscclientip));
        MediaBrowserCompat$ItemReceiver(this.yearsSpinner, R.array.f64732130903052);
        MediaBrowserCompat$ItemReceiver(this.monthsSpinner, R.array.f64722130903051);
        return inflate;
    }

    @OnClick
    public void onJobClick() {
        Intent intent = new Intent(getContext(), OccupationSearchActivity.class);
        intent.putExtra("SEARCH_TITLE", getString(R.string.hml_review_job_title));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        boolean z = false;
        if (i == 1001 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_CODE");
            String stringExtra2 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION");
            String stringExtra3 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE");
            String stringExtra4 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_GROUP_CODE");
            String stringExtra5 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_OCCUPATION_GROUP");
            setWscClientIp setwscclientip = this.presenter;
            onGetStartedClick.write((Object) stringExtra3, "isicCode");
            writeUInt64NoTag.IconCompatParcelizer setwscclientip_mediabrowsercompat_searchresultreceiver = new setWscClientIp$MediaBrowserCompat$SearchResultReceiver(stringExtra2, stringExtra);
            if (setwscclientip.RatingCompat != null) {
                setwscclientip_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(setwscclientip.RatingCompat);
            }
            setwscclientip.MediaBrowserCompat$MediaItem = stringExtra5;
            setwscclientip.MediaSessionCompat$ResultReceiverWrapper = new setMaxZoomPreference(stringExtra, stringExtra2, stringExtra3, stringExtra4);
            setWscClientIp.IconCompatParcelizer iconCompatParcelizer = setWscClientIp.IconCompatParcelizer.JOB;
            if (stringExtra == null) {
                z = true;
            }
            setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, true, z);
        } else if (i == 1002 && i2 == -1 && intent != null) {
            setWscClientIp setwscclientip2 = this.presenter;
            String stringExtra6 = intent.getStringExtra("com.scb.phone.EXTRA_RESULT_ADDRESS");
            onGetStartedClick.write((Object) stringExtra6, "address");
            setwscclientip2.write = stringExtra6;
            writeUInt64NoTag.IconCompatParcelizer read = new setWscClientIp.read(stringExtra6);
            if (setwscclientip2.RatingCompat != null) {
                read.IconCompatParcelizer(setwscclientip2.RatingCompat);
            }
            setWscClientIp.IconCompatParcelizer iconCompatParcelizer2 = setWscClientIp.IconCompatParcelizer.WORK_ADDRESS;
            if (stringExtra6.length() == 0) {
                z = true;
            }
            setwscclientip2.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer2, true, z);
        } else if (i == 1003 && i2 == -1 && intent != null) {
            String stringExtra7 = intent.getStringExtra("EXTRA_COMPANY_NAME");
            this.companyName.setText(stringExtra7);
            setWscClientIp setwscclientip3 = this.presenter;
            String stringExtra8 = intent.getStringExtra("EXTRA_COMPANY_ID");
            onGetStartedClick.write((Object) stringExtra8, Name.MARK);
            onGetStartedClick.write((Object) stringExtra7, "name");
            setwscclientip3.MediaBrowserCompat$ItemReceiver = stringExtra8;
            setwscclientip3.read = stringExtra7;
            setWscClientIp.IconCompatParcelizer iconCompatParcelizer3 = setWscClientIp.IconCompatParcelizer.COMPANY_NAME;
            setMaxZoomPreference setmaxzoompreference = setwscclientip3.MediaSessionCompat$ResultReceiverWrapper;
            if (setmaxzoompreference != null) {
                str = setmaxzoompreference.IconCompatParcelizer;
            } else {
                str = null;
            }
            boolean MediaBrowserCompat$ItemReceiver = setWscClientIp.MediaBrowserCompat$ItemReceiver(stringExtra7, str);
            if (stringExtra7.length() == 0) {
                z = true;
            }
            setwscclientip3.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer3, MediaBrowserCompat$ItemReceiver, z);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void write(String str, String str2) {
        if (str != null && str2 != null) {
            this.job.setText(str);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(final List<getExitingExecutorService> list) {
        this.sourceOfIncome.setAdapter(new ArrayAdapter(getContext(), R.layout.f84812131493708, list));
        this.sourceOfIncome.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                setWscClientIp setwscclientip = HmlOccupationInfoFragment.this.presenter;
                getExitingExecutorService getexitingexecutorservice = (getExitingExecutorService) list.get(i);
                onGetStartedClick.write((Object) getexitingexecutorservice, "country");
                setwscclientip.MediaDescriptionCompat = getexitingexecutorservice;
                setwscclientip.MediaBrowserCompat$ItemReceiver(setWscClientIp.IconCompatParcelizer.SOURCE_OF_INCOME, true, false);
            }
        });
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.sourceOfIncome.setSelection(i);
    }

    public final void write(String str) {
        this.companyName.setText(str);
    }

    @OnClick
    public void onCompanyNameClick() {
        setWscClientIp setwscclientip = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setWscClientIp$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (setwscclientip.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setwscclientip.RatingCompat);
        }
    }

    public void write() {
        if (getContext() != null) {
            Intent MediaBrowserCompat$ItemReceiver = HmlCompanyNameActivity.MediaBrowserCompat$ItemReceiver(getContext());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(MediaBrowserCompat$ItemReceiver, 1003);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void onWorkAddressClick() {
        setWscClientIp setwscclientip = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10153x840f965d.MediaBrowserCompat$CustomActionResultReceiver;
        if (setwscclientip.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setwscclientip.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.workAddress.setText(str);
    }

    public void MediaBrowserCompat$ItemReceiver() {
        Intent write = HmlWorkAddressActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        if (str != null) {
            this.mobileNumberView.setText(str);
        }
        C60074 r6 = new FragmentBuilder_BindCreditLimitDisplayFragment() {
            public final void afterTextChanged(Editable editable) {
                boolean z;
                setWscClientIp setwscclientip = HmlOccupationInfoFragment.this.presenter;
                String obj = HmlOccupationInfoFragment.this.mobileNumberView.mEditText.getText().toString();
                onGetStartedClick.write((Object) obj, "formattedPhone");
                if (obj != null && !obj.equals("")) {
                    obj = obj.replace("-", "");
                }
                setWscClientIp.IconCompatParcelizer iconCompatParcelizer = setWscClientIp.IconCompatParcelizer.WORK_CONTACT;
                onGetStartedClick.IconCompatParcelizer((Object) obj, "phoneValid");
                onGetStartedClick.write((Object) obj, "phoneValid");
                getAuthApiSignInModuleVersion getauthapisigninmoduleversion = setwscclientip.f2968x50fd9e4a;
                boolean z2 = false;
                if (obj == null) {
                    z = false;
                } else {
                    z = getauthapisigninmoduleversion.IconCompatParcelizer.matcher(obj).matches();
                }
                if (obj.length() == 0) {
                    z2 = true;
                }
                setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, z, z2);
            }
        };
        this.MediaBrowserCompat$CustomActionResultReceiver = r6;
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        customPhoneNumberInput.mEditText.addTextChangedListener(r6);
        customPhoneNumberInput.MediaBrowserCompat$CustomActionResultReceiver.add(r6);
        this.mobileNumberView.setErrorText(getString(R.string.easycash_invalid_format));
        this.mobileNumberView.clearFocus();
        CustomPhoneNumberInput customPhoneNumberInput2 = this.mobileNumberView;
        customPhoneNumberInput2.mEditText.setOnFocusChangeListener(new getEligibility(customPhoneNumberInput2, customPhoneNumberInput2.getOnFocusChangeListener(), 10, false));
    }

    public final void write(Integer num) {
        if (num != null) {
            this.yearsSpinner.setSelectionIndex(num.intValue() + 1);
        }
    }

    public final void read(Integer num) {
        if (num != null) {
            this.monthsSpinner.setSelectionIndex(num.intValue() + 1);
        }
    }

    @OnClick
    public void onNextButtonClick() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        setWscClientIp setwscclientip = this.presenter;
        String obj = this.mobileNumberView.mEditText.getText().toString();
        onGetStartedClick.write((Object) obj, "phone");
        boolean z3 = true;
        if (setwscclientip.RatingCompat != null) {
            setwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        setMaxZoomPreference setmaxzoompreference = setwscclientip.MediaSessionCompat$ResultReceiverWrapper;
        String str5 = null;
        boolean z4 = ((setmaxzoompreference != null ? setmaxzoompreference.write : null) == null || setmaxzoompreference.MediaBrowserCompat$ItemReceiver == null) ? false : true;
        String str6 = setwscclientip.read;
        setMaxZoomPreference setmaxzoompreference2 = setwscclientip.MediaSessionCompat$ResultReceiverWrapper;
        if (setmaxzoompreference2 != null) {
            str = setmaxzoompreference2.IconCompatParcelizer;
        } else {
            str = null;
        }
        boolean MediaBrowserCompat$ItemReceiver = setWscClientIp.MediaBrowserCompat$ItemReceiver(str6, str);
        if (obj != null && !obj.equals("")) {
            obj = obj.replace("-", "");
        }
        String str7 = obj;
        setWscClientIp.IconCompatParcelizer iconCompatParcelizer = setWscClientIp.IconCompatParcelizer.JOB;
        if (setmaxzoompreference != null) {
            str2 = setmaxzoompreference.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, z4, str2 == null || setmaxzoompreference.write == null);
        setWscClientIp.IconCompatParcelizer iconCompatParcelizer2 = setWscClientIp.IconCompatParcelizer.SOURCE_OF_INCOME;
        getExitingExecutorService getexitingexecutorservice = setwscclientip.MediaDescriptionCompat;
        if (getexitingexecutorservice != null) {
            str3 = getexitingexecutorservice.MediaBrowserCompat$ItemReceiver;
        } else {
            str3 = null;
        }
        CharSequence charSequence = str3;
        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer2, true, charSequence == null || charSequence.length() == 0);
        setWscClientIp.IconCompatParcelizer iconCompatParcelizer3 = setWscClientIp.IconCompatParcelizer.COMPANY_NAME;
        setMaxZoomPreference setmaxzoompreference3 = setwscclientip.MediaSessionCompat$ResultReceiverWrapper;
        if (setmaxzoompreference3 != null) {
            str4 = setmaxzoompreference3.IconCompatParcelizer;
        } else {
            str4 = null;
        }
        CharSequence charSequence2 = str4;
        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer3, MediaBrowserCompat$ItemReceiver, charSequence2 == null || charSequence2.length() == 0);
        setWscClientIp.IconCompatParcelizer iconCompatParcelizer4 = setWscClientIp.IconCompatParcelizer.WORK_ADDRESS;
        CharSequence charSequence3 = setwscclientip.write;
        boolean z5 = charSequence3 == null || charSequence3.length() == 0;
        CharSequence charSequence4 = setwscclientip.write;
        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer4, !z5, charSequence4 == null || charSequence4.length() == 0);
        setWscClientIp.IconCompatParcelizer iconCompatParcelizer5 = setWscClientIp.IconCompatParcelizer.WORK_CONTACT;
        onGetStartedClick.IconCompatParcelizer((Object) str7, "phoneValid");
        onGetStartedClick.write((Object) str7, "phoneValid");
        getAuthApiSignInModuleVersion getauthapisigninmoduleversion = setwscclientip.f2968x50fd9e4a;
        if (str7 == null) {
            z = false;
        } else {
            z = getauthapisigninmoduleversion.IconCompatParcelizer.matcher(str7).matches();
        }
        CharSequence charSequence5 = str7;
        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer5, z, charSequence5.length() == 0);
        setwscclientip.MediaBrowserCompat$ItemReceiver(setWscClientIp.IconCompatParcelizer.EXPERIENCE, (setwscclientip.MediaSessionCompat$QueueItem == null || setwscclientip.MediaSessionCompat$Token == null) ? false : true, setwscclientip.MediaSessionCompat$QueueItem == null || setwscclientip.MediaSessionCompat$Token == null);
        if (z4 && MediaBrowserCompat$ItemReceiver) {
            CharSequence charSequence6 = setwscclientip.write;
            if (!(charSequence6 == null || charSequence6.length() == 0)) {
                if (!(charSequence5.length() == 0)) {
                    onGetStartedClick.write((Object) str7, "phoneValid");
                    getAuthApiSignInModuleVersion getauthapisigninmoduleversion2 = setwscclientip.f2968x50fd9e4a;
                    if (str7 == null) {
                        z2 = false;
                    } else {
                        z2 = getauthapisigninmoduleversion2.IconCompatParcelizer.matcher(str7).matches();
                    }
                    if (!(!z2 || setwscclientip.MediaSessionCompat$Token == null || setwscclientip.MediaSessionCompat$QueueItem == null)) {
                        FloatingActionButton.BaseBehavior baseBehavior = setwscclientip.MediaBrowserCompat$SearchResultReceiver;
                        getExitingExecutorService getexitingexecutorservice2 = setwscclientip.MediaDescriptionCompat;
                        if (getexitingexecutorservice2 != null) {
                            str5 = getexitingexecutorservice2.MediaBrowserCompat$CustomActionResultReceiver;
                        }
                        baseBehavior.MediaBrowserCompat$ItemReceiver(setmaxzoompreference, new setMapStyle(str5), setwscclientip.MediaBrowserCompat$ItemReceiver, setwscclientip.read, str7, setwscclientip.MediaBrowserCompat$MediaItem, new setInfoWindowAdapter(setwscclientip.MediaSessionCompat$Token, setwscclientip.MediaSessionCompat$QueueItem));
                        setwscclientip.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new setWscClientIp.RatingCompat(setwscclientip));
                        return;
                    }
                }
            }
        }
        if (setwscclientip.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            setwscclientip.RatingCompat.aj_();
        }
    }

    public void IconCompatParcelizer() {
        Intent MediaBrowserCompat$ItemReceiver = HmlDocumentUploadGuidelineActivity.MediaBrowserCompat$ItemReceiver(requireContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void read() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), zzfe.zza.NCB_CONSENT);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaDescriptionCompat() {
        HmlMoaActivity.read read = HmlMoaActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlMoaActivity.class);
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

    public void onDestroy() {
        CustomPhoneNumberInput customPhoneNumberInput = this.mobileNumberView;
        FragmentBuilder_BindCreditLimitDisplayFragment fragmentBuilder_BindCreditLimitDisplayFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        customPhoneNumberInput.mEditText.removeTextChangedListener(fragmentBuilder_BindCreditLimitDisplayFragment);
        customPhoneNumberInput.MediaBrowserCompat$CustomActionResultReceiver.remove(fragmentBuilder_BindCreditLimitDisplayFragment);
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_occupation_back_dialog_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_occupation_back_dialog_text)).IconCompatParcelizer(getString(R.string.hml_occupation_back_dialog_confirm), new ActivityBuilder_BindCreditCardBilledDetailActivity(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_occupation_back_dialog_cancel), ActivityBuilder_BindConfirmRedemptionActivity.read).show();
    }

    /* renamed from: com.scb.phone.view.fragment.hml.HmlOccupationInfoFragment$3 */
    static /* synthetic */ class C60063 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.setWscClientIp$IconCompatParcelizer[] r0 = p040o.setWscClientIp.IconCompatParcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.JOB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.SOURCE_OF_INCOME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.WORK_CONTACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.WORK_ADDRESS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.COMPANY_NAME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.setWscClientIp$IconCompatParcelizer r1 = p040o.setWscClientIp.IconCompatParcelizer.EXPERIENCE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlOccupationInfoFragment.C60063.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setWscClientIp.IconCompatParcelizer iconCompatParcelizer) {
        switch (C60063.write[iconCompatParcelizer.ordinal()]) {
            case 1:
                this.jobError.setVisibility(0);
                return;
            case 2:
                this.sourceOfIncomeError.setText(getString(R.string.hml_occupation_source_of_income_error));
                this.sourceOfIncome.setVisibility(0);
                return;
            case 3:
                this.mobileNumberView.setErrorText(getString(R.string.hml_occupation_work_contact_error));
                this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
                return;
            case 4:
                this.workAddressError.setText(getString(R.string.hml_occupation_work_address_error));
                this.workAddressError.setVisibility(0);
                return;
            case 5:
                this.companyNameError.setText(getString(R.string.hml_occupation_incomplete));
                this.companyNameError.setVisibility(0);
                return;
            case 6:
                this.experienceError.setVisibility(0);
                return;
            default:
                return;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setWscClientIp.IconCompatParcelizer iconCompatParcelizer) {
        int i = C60063.write[iconCompatParcelizer.ordinal()];
        if (i == 3) {
            this.mobileNumberView.setErrorText(getString(R.string.hml_occupation_invalid_format));
            this.mobileNumberView.MediaBrowserCompat$ItemReceiver();
        } else if (i == 5) {
            this.companyNameError.setText(getString(R.string.hml_occupation_company_error));
            this.companyNameError.setVisibility(0);
        }
    }

    public final void read(setWscClientIp.IconCompatParcelizer iconCompatParcelizer) {
        switch (C60063.write[iconCompatParcelizer.ordinal()]) {
            case 1:
                this.jobError.setVisibility(8);
                return;
            case 2:
                this.sourceOfIncomeError.setVisibility(8);
                return;
            case 3:
                this.mobileNumberView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 4:
                this.workAddressError.setVisibility(8);
                return;
            case 5:
                this.companyNameError.setVisibility(8);
                return;
            case 6:
                this.experienceError.setVisibility(8);
                return;
            default:
                return;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void RatingCompat() {
        if (getContext() != null) {
            HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver hmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver = HmlIssuerLandingActivity.MediaDescriptionCompat;
            Intent intent = new Intent(getContext(), HmlIssuerLandingActivity.class);
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

    private void MediaBrowserCompat$ItemReceiver(final CustomSpinnerWithTitle customSpinnerWithTitle, int i) {
        customSpinnerWithTitle.IconCompatParcelizer = false;
        if (!customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            customSpinnerWithTitle.spinner.setSelection(0);
        }
        customSpinnerWithTitle.setItems(Arrays.asList(getResources().getStringArray(i)), true, false);
        customSpinnerWithTitle.setMandatory(true);
        customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                if (customSpinnerWithTitle.spinner.getSelectedItemPosition() > 0) {
                    int selectedItemPosition = customSpinnerWithTitle.spinner.getSelectedItemPosition() - 1;
                    boolean z = false;
                    if (customSpinnerWithTitle.equals(HmlOccupationInfoFragment.this.yearsSpinner)) {
                        setWscClientIp setwscclientip = HmlOccupationInfoFragment.this.presenter;
                        setwscclientip.MediaSessionCompat$Token = Integer.valueOf(selectedItemPosition);
                        setWscClientIp.IconCompatParcelizer iconCompatParcelizer = setWscClientIp.IconCompatParcelizer.EXPERIENCE;
                        if (setwscclientip.MediaSessionCompat$Token == null || setwscclientip.MediaSessionCompat$QueueItem == null) {
                            z = true;
                        }
                        setwscclientip.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, true, z);
                        return;
                    }
                    setWscClientIp setwscclientip2 = HmlOccupationInfoFragment.this.presenter;
                    setwscclientip2.MediaSessionCompat$QueueItem = Integer.valueOf(selectedItemPosition);
                    setWscClientIp.IconCompatParcelizer iconCompatParcelizer2 = setWscClientIp.IconCompatParcelizer.EXPERIENCE;
                    if (setwscclientip2.MediaSessionCompat$Token == null || setwscclientip2.MediaSessionCompat$QueueItem == null) {
                        z = true;
                    }
                    setwscclientip2.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer2, true, z);
                }
            }
        });
    }
}
