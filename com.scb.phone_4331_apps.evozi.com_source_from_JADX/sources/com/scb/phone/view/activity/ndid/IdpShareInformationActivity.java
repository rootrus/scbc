package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.ndid.CustomIdpTitleWithLabelView;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport;
import p040o.C4121bx;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiJsonBill_MembersInjector;
import p040o.ZHPR2;
import p040o.access$2200;
import p040o.access$2300;
import p040o.buildWeekDays;
import p040o.getDividerHeight;
import p040o.getKernelIDAdd;
import p040o.getPlatform;
import p040o.getSdkVersion;
import p040o.getVariant;
import p040o.post;
import p040o.setMinimumDate;
import p040o.setTapText;
import p040o.setWeekDayFormatter;
import p040o.setWeekDayTextAppearance;
import p040o.toBuilder;

public class IdpShareInformationActivity extends BaseActivity implements getVariant {
    public String MediaBrowserCompat$MediaItem;
    protected int MediaBrowserCompat$SearchResultReceiver = -1;
    private getKernelIDAdd MediaDescriptionCompat = new getKernelIDAdd();
    @BindView
    Button buttonNext;
    @BindView
    CustomIdpTitleWithLabelView customCitizenId;
    @BindView
    CustomIdpTitleWithLabelView customCompanyName;
    @BindView
    CustomIdpTitleWithLabelView customCurrentAddress;
    @BindView
    CustomIdpTitleWithLabelView customDateOfBirth;
    @BindView
    CustomIdpTitleWithLabelView customEnglishName;
    @BindView
    CustomIdpTitleWithLabelView customGender;
    @BindView
    CustomIdpTitleWithLabelView customHomeAddress;
    @BindView
    CustomIdpTitleWithLabelView customIncome;
    @BindView
    CustomIdpTitleWithLabelView customJobTitle;
    @BindView
    CustomIdpTitleWithLabelView customMaritalStatus;
    @BindView
    CustomIdpTitleWithLabelView customNationality;
    @BindView
    CustomIdpTitleWithLabelView customSingleContactNumber;
    @BindView
    CustomIdpTitleWithLabelView customThaiName;
    @BindView
    CustomIdpTitleWithLabelView customWorkAddress;
    @BindView
    ViewGroup layoutAllContactNumberContainers;
    @BindView
    ViewGroup layoutContactInfoSection;
    @BindView
    ViewGroup layoutMultiContactNumberContainers;
    @BindView
    ViewGroup layoutOccupationInfoSection;
    @BindView
    ViewGroup layoutPersonalInfoSection;
    @HmlPinActivity
    public C4121bx presenter;
    @BindView
    Spinner spnMultiContactNumberValue;
    @BindView
    TextView textCancellation;
    @BindView
    TextView textCreatedDate;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static /* synthetic */ void m2966x50fd9e4a() {
    }

    private static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((IdpShareInformationActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, IdpShareInformationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.ndid.IdpShareInformationActivity.EXTRA_REQUEST_ID", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78412131493066);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("com.scb.phone.view.activity.ndid.IdpShareInformationActivity.EXTRA_REQUEST_ID");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.write(this.MediaBrowserCompat$MediaItem);
        super.setStackedBackground();
        setTitle(R.string.idp_share_information_activity_title);
        setTabContainer();
        String string = getString(R.string.idp_share_information_cancellation_label_start);
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(getString(R.string.idp_share_information_cancellation_label_clickable));
        sb.append(" ");
        SpannableString MediaBrowserCompat$CustomActionResultReceiver = ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(string, sb.toString(), getResources(), new setWeekDayFormatter(this), false, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(MediaBrowserCompat$CustomActionResultReceiver);
        spannableStringBuilder.append(getString(R.string.idp_share_information_cancellation_label_end));
        this.textCancellation.setText(spannableStringBuilder);
        this.textCancellation.setMovementMethod(LinkMovementMethod.getInstance());
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ndid_idp_review_screen");
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        bundle.putString("com.scb.phone.view.activity.ndid.IdpShareInformationActivity.EXTRA_REQUEST_ID", this.MediaBrowserCompat$MediaItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("com.scb.phone.view.activity.ndid.IdpShareInformationActivity.EXTRA_REQUEST_ID")) {
            this.MediaBrowserCompat$MediaItem = bundle.getString("com.scb.phone.view.activity.ndid.IdpShareInformationActivity.EXTRA_REQUEST_ID");
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.idp_share_information_activity_title);
        setTabContainer();
    }

    public final void IconCompatParcelizer(getSdkVersion getsdkversion) {
        if (getsdkversion == null) {
            this.layoutPersonalInfoSection.setVisibility(8);
            this.layoutContactInfoSection.setVisibility(8);
            this.layoutOccupationInfoSection.setVisibility(8);
            return;
        }
        toBuilder tobuilder = getsdkversion.IconCompatParcelizer;
        if (tobuilder == null) {
            this.layoutPersonalInfoSection.setVisibility(8);
        } else {
            this.customThaiName.setTextValue(tobuilder.MediaBrowserCompat$MediaItem);
            this.customEnglishName.setTextValue(tobuilder.write);
            this.customNationality.setTextValue(tobuilder.MediaMetadataCompat);
            this.customCitizenId.setTextValue(tobuilder.IconCompatParcelizer);
            this.customDateOfBirth.setTextValue(tobuilder.MediaBrowserCompat$CustomActionResultReceiver);
            this.customMaritalStatus.setTextValue(tobuilder.MediaBrowserCompat$ItemReceiver);
            this.customGender.setTextValue(tobuilder.read);
        }
        AutoValue_CrashlyticsReport autoValue_CrashlyticsReport = getsdkversion.read;
        if (autoValue_CrashlyticsReport == null) {
            this.layoutContactInfoSection.setVisibility(8);
        } else {
            this.customHomeAddress.setTextValue(autoValue_CrashlyticsReport.MediaBrowserCompat$CustomActionResultReceiver);
            this.customCurrentAddress.setTextValue(autoValue_CrashlyticsReport.MediaBrowserCompat$ItemReceiver);
        }
        getPlatform getplatform = getsdkversion.MediaBrowserCompat$CustomActionResultReceiver;
        if (getplatform == null) {
            this.layoutOccupationInfoSection.setVisibility(8);
        } else {
            this.customCompanyName.setTextValue(getplatform.IconCompatParcelizer);
            this.customJobTitle.setTextValue(getplatform.MediaBrowserCompat$CustomActionResultReceiver);
            this.customIncome.setTextValue(getplatform.MediaBrowserCompat$ItemReceiver);
            this.customWorkAddress.setTextValue(getplatform.read);
        }
        String str = getsdkversion.MediaBrowserCompat$ItemReceiver;
        if (!(str == null || str.length() == 0)) {
            this.textCreatedDate.setText(getString(R.string.idp_share_information_created_message, new Object[]{str}));
            this.textCreatedDate.setVisibility(0);
        }
    }

    public final /* synthetic */ void MediaSessionCompat$Token() {
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, RttiJsonBill_MembersInjector.read.C10785read.REJECTED);
    }

    public final void IconCompatParcelizer() {
        this.layoutAllContactNumberContainers.setVisibility(8);
    }

    public final void read(String str) {
        this.customSingleContactNumber.setVisibility(0);
        this.customSingleContactNumber.setTextValue(str);
        this.MediaBrowserCompat$SearchResultReceiver = 0;
    }

    public final void write(List<String> list) {
        this.layoutMultiContactNumberContainers.setVisibility(0);
        this.spnMultiContactNumberValue.setAdapter(new ArrayAdapter(this, R.layout.f84812131493708, list));
        this.spnMultiContactNumberValue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                IdpShareInformationActivity.this.MediaBrowserCompat$SearchResultReceiver = i;
            }
        });
        this.MediaBrowserCompat$SearchResultReceiver = 0;
    }

    public final void write(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void IconCompatParcelizer(String str, List<String> list) {
        NdidIdpShareSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(this, str, list);
    }

    public final void read(access$2200 access_2200) {
        if (access_2200 != null) {
            access$2300 access_2300 = new access$2300();
            access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.idp_share_information_cancellation_button_retry);
            setWeekDayTextAppearance setweekdaytextappearance = new setWeekDayTextAppearance(this);
            access_2300.read = access$2300.write.CUSTOM;
            access_2300.MediaBrowserCompat$CustomActionResultReceiver = setweekdaytextappearance;
            access$2300 access_23002 = new access$2300();
            access_23002.MediaBrowserCompat$ItemReceiver = getString(R.string.cancel);
            setMinimumDate setminimumdate = new setMinimumDate(this);
            access_23002.read = access$2300.write.CUSTOM;
            access_23002.MediaBrowserCompat$CustomActionResultReceiver = setminimumdate;
            access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
            access_2200.write = access_23002;
            write(access_2200);
        }
    }

    public final void read() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.notification_tab);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer((Context) this, intent);
    }

    @OnCheckedChanged
    public void onCheckedConsent(CompoundButton compoundButton, boolean z) {
        C4121bx bxVar = this.presenter;
        post post = new post(z);
        if (bxVar.RatingCompat != null) {
            post.IconCompatParcelizer(bxVar.RatingCompat);
        }
    }

    @OnClick
    public void onClickConfirm() {
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, RttiJsonBill_MembersInjector.read.C10785read.COMPLETED);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public static /* synthetic */ void write(IdpShareInformationActivity idpShareInformationActivity) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) idpShareInformationActivity);
        String string = IconCompatParcelizer.read.getString(R.string.idp_share_information_cancellation_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.idp_share_information_cancellation_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ok), new getDividerHeight(idpShareInformationActivity));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), buildWeekDays.MediaBrowserCompat$CustomActionResultReceiver).show();
    }
}
