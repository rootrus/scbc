package com.scb.phone.view.activity.ndid;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdHelpActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import java.util.Collections;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4099bh;
import p040o.C4108bo;
import p040o.C4128bz;
import p040o.Equivalences;
import p040o.FragmentBuilder_BindCreditCardReviewFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.HmlPinActivity;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.calculateBounds;
import p040o.cellSet;
import p040o.getFrontImage;
import p040o.getKernelIDAdd;
import p040o.isDayEnabled;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onInitializeAccessibilityNodeInfo;
import p040o.resetAndGetWorkingCalendar;
import p040o.setDayViewDecorators;
import p040o.setFilename;
import p040o.setMaximumDate;
import p040o.setOrgId;
import p040o.setRangeDates;
import p040o.setTapText;
import p040o.synchronizedSupplier;
import p040o.updateUi;

public class NdidNationalIdInputActivity extends BaseActivity implements getFrontImage {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private View.OnClickListener MediaBrowserCompat$SearchResultReceiver = new setDayViewDecorators(this);
    private boolean MediaDescriptionCompat = false;
    private String MediaMetadataCompat;
    private getKernelIDAdd MediaSessionCompat$ResultReceiverWrapper = new getKernelIDAdd();
    private boolean MediaSessionCompat$Token;
    @BindView
    public CommonInputViewGroup dateOfBirthViewGroup;
    @BindView
    public CommonInputViewGroup dateOfIssuedViewGroup;
    @BindView
    protected View fieldsContainer;
    @BindView
    protected ImageView helpButton;
    @BindView
    public CommonInputViewGroup ivpFirstNameEnglish;
    @BindView
    public CommonInputViewGroup ivpFirstNameThai;
    @BindView
    public CommonInputViewGroup ivpLastNameEnglish;
    @BindView
    public CommonInputViewGroup ivpLastNameThai;
    @BindView
    public CommonInputViewGroup ivpNationalIdNumber;
    @BindView
    public EditText laserIdFirst;
    @BindView
    public EditText laserIdSecond;
    @BindView
    public EditText laserIdThird;
    @BindView
    protected Button nextButton;
    @HmlPinActivity
    public C4128bz presenter;
    @BindView
    RelativeLayout rootView;
    @BindView
    protected ImageView scanIdIcon;
    @BindView
    public CustomSpinnerWithTitle spinnerCountry;
    @BindView
    public CustomSpinnerWithTitle spinnerTitle;
    @BindView
    protected TextView textViewTakingPhotoEditLabel;

    public /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    /* access modifiers changed from: protected */
    public String MediaSessionCompat$ResultReceiverWrapper() {
        return "open_account";
    }

    public /* synthetic */ void write(AutoValue_CrashlyticsReport.Builder builder) {
    }

    public /* synthetic */ void lambda$new$0$NdidNationalIdInputActivity(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int id = view.getId();
        boolean z = true;
        if (id == R.id.button_next) {
            C4128bz bzVar = this.presenter;
            if (bzVar.MediaBrowserCompat$ItemReceiver.booleanValue() && bzVar.MediaBrowserCompat$ItemReceiver()) {
                bzVar.MediaBrowserCompat$ItemReceiver = Boolean.FALSE;
                if (bzVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bzVar.RatingCompat.AlertController$RecycleListView();
                }
                bzVar.MediaSessionCompat$QueueItem.IconCompatParcelizer.IconCompatParcelizer(bzVar.MediaDescriptionCompat.IconCompatParcelizer);
                synchronizedSupplier synchronizedsupplier = bzVar.MediaSessionCompat$QueueItem;
                String str10 = bzVar.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) str10, "date");
                synchronizedsupplier.IconCompatParcelizer.write(str10);
                Equivalences.Impl impl = bzVar.MediaSessionCompat$ResultReceiverWrapper;
                AutoValue_CrashlyticsReport.Builder builder = bzVar.MediaDescriptionCompat;
                onGetStartedClick.write((Object) builder, "display");
                String str11 = builder.MediaDescriptionCompat;
                String str12 = str11 == null ? "" : str11;
                String str13 = builder.MediaBrowserCompat$CustomActionResultReceiver;
                if (str13 == null) {
                    str = "";
                } else {
                    str = str13;
                }
                String str14 = builder.RatingCompat;
                if (str14 == null) {
                    str2 = "";
                } else {
                    str2 = str14;
                }
                String str15 = builder.read;
                if (str15 == null) {
                    str3 = "";
                } else {
                    str3 = str15;
                }
                String str16 = builder.MediaMetadataCompat;
                if (str16 == null) {
                    str4 = "";
                } else {
                    str4 = str16;
                }
                String str17 = builder.IconCompatParcelizer;
                if (str17 == null) {
                    str5 = "";
                } else {
                    str5 = str17;
                }
                String str18 = builder.MediaBrowserCompat$MediaItem;
                if (str18 == null) {
                    str6 = "";
                } else {
                    str6 = str18;
                }
                String str19 = builder.MediaBrowserCompat$ItemReceiver;
                if (str19 == null) {
                    str7 = "";
                } else {
                    str7 = str19;
                }
                String str20 = builder.f2673x50fd9e4a;
                if (str20 == null) {
                    str8 = "";
                } else {
                    str8 = str20;
                }
                String str21 = builder.MediaSessionCompat$Token;
                if (str21 == null) {
                    str9 = "";
                } else {
                    str9 = str21;
                }
                impl.MediaBrowserCompat$CustomActionResultReceiver(new cellSet(str12, str, str2, str3, str4, str5, str6, str7, str8, str9));
                bzVar.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new C4128bz.IconCompatParcelizer());
            }
            this.fieldsContainer.requestFocus();
        } else if (id == R.id.help_button) {
            C4128bz bzVar2 = this.presenter;
            if (bzVar2.MediaBrowserCompat$ItemReceiver.booleanValue()) {
                bzVar2.MediaBrowserCompat$ItemReceiver = Boolean.FALSE;
                C4108bo boVar = C4108bo.IconCompatParcelizer;
                if (bzVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    boVar.IconCompatParcelizer(bzVar2.RatingCompat);
                }
            }
        } else if (id == R.id.icon_scan_id) {
            this.presenter.read();
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79022131493127);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.scanIdIcon.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
        this.nextButton.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
        this.helpButton.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
        this.ivpFirstNameThai.mEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$"), new InputFilter.LengthFilter(50)});
        this.ivpFirstNameThai.mEditText.setInputType(524432);
        this.ivpLastNameThai.mEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$"), new InputFilter.LengthFilter(50)});
        this.ivpLastNameThai.mEditText.setInputType(524432);
        this.ivpFirstNameEnglish.mEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[a-zA-Z .'-]+$"), new InputFilter.LengthFilter(50)});
        this.ivpFirstNameEnglish.mEditText.setInputType(524432);
        this.ivpLastNameEnglish.mEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[a-zA-Z .'-]+$"), new InputFilter.LengthFilter(50)});
        this.ivpLastNameEnglish.mEditText.setInputType(524432);
        this.ivpNationalIdNumber.mEditText.setInputType(2);
        this.ivpNationalIdNumber.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
        CommonInputViewGroup commonInputViewGroup = this.ivpNationalIdNumber;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup.mEditText, "X-XXXX-XXXXX-XX-X", new onInitializeAccessibilityNodeInfo(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                NdidNationalIdInputActivity.this.presenter.write(str, false);
            }

            public final void write(String str) {
                if (!(str == null || str.length() == 0)) {
                    CommonInputViewGroup commonInputViewGroup = NdidNationalIdInputActivity.this.ivpNationalIdNumber;
                    commonInputViewGroup.write = true;
                    commonInputViewGroup.mEditClearImageButton.setVisibility(0);
                } else {
                    CommonInputViewGroup commonInputViewGroup2 = NdidNationalIdInputActivity.this.ivpNationalIdNumber;
                    commonInputViewGroup2.write = false;
                    commonInputViewGroup2.mEditClearImageButton.setVisibility(8);
                }
                NdidNationalIdInputActivity.this.presenter.write(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write = true;
        commonInputViewGroup.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        this.laserIdFirst.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(3)});
        this.laserIdSecond.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(7)});
        this.laserIdThird.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(2)});
        EditText editText = this.laserIdFirst;
        editText.addTextChangedListener(new C5676xf6023c28(this, editText, 3, this.laserIdSecond));
        EditText editText2 = this.laserIdSecond;
        editText2.addTextChangedListener(new C5676xf6023c28(this, editText2, 7, this.laserIdThird));
        EditText editText3 = this.laserIdThird;
        editText3.addTextChangedListener(new C5676xf6023c28(this, editText3, 2, this.dateOfIssuedViewGroup.mEditText));
        this.dateOfBirthViewGroup.mEditText.setInputType(2);
        this.dateOfBirthViewGroup.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        CommonInputViewGroup commonInputViewGroup2 = this.dateOfBirthViewGroup;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment2 = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup2.mEditText, "XX/XX/XXXX", new setMaximumDate(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment2.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                NdidNationalIdInputActivity.this.presenter.read(str, false);
            }

            public final void write(String str) {
                NdidNationalIdInputActivity.this.presenter.read(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment2.write = true;
        commonInputViewGroup2.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment2);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment2);
        CustomEditText customEditText = this.dateOfBirthViewGroup.mEditText;
        if (customEditText != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) customEditText.getLayoutParams();
            layoutParams.width = -2;
            customEditText.setLayoutParams(layoutParams);
        }
        this.dateOfIssuedViewGroup.mEditText.setInputType(2);
        this.dateOfIssuedViewGroup.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        CommonInputViewGroup commonInputViewGroup3 = this.dateOfIssuedViewGroup;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment3 = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup3.mEditText, "XX/XX/XXXX", new resetAndGetWorkingCalendar(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment3.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                NdidNationalIdInputActivity.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(str, false);
            }

            public final void write(String str) {
                NdidNationalIdInputActivity.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment3.write = true;
        commonInputViewGroup3.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment3);
        commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment3);
        CustomEditText customEditText2 = this.dateOfIssuedViewGroup.mEditText;
        if (customEditText2 != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) customEditText2.getLayoutParams();
            layoutParams2.width = -2;
            customEditText2.setLayoutParams(layoutParams2);
        }
        CommonInputViewGroup commonInputViewGroup4 = this.ivpFirstNameThai;
        C56703 r0 = new IconCompatParcelizer() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                bzVar.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver = charSequence.toString();
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        };
        commonInputViewGroup4.mEditText.addTextChangedListener(r0);
        commonInputViewGroup4.MediaBrowserCompat$CustomActionResultReceiver.add(r0);
        CommonInputViewGroup commonInputViewGroup5 = this.ivpLastNameThai;
        C56725 r02 = new IconCompatParcelizer() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                bzVar.MediaDescriptionCompat.RatingCompat = charSequence.toString();
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        };
        commonInputViewGroup5.mEditText.addTextChangedListener(r02);
        commonInputViewGroup5.MediaBrowserCompat$CustomActionResultReceiver.add(r02);
        CommonInputViewGroup commonInputViewGroup6 = this.ivpFirstNameEnglish;
        C56747 r03 = new IconCompatParcelizer() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                bzVar.MediaDescriptionCompat.read = charSequence.toString();
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        };
        commonInputViewGroup6.mEditText.addTextChangedListener(r03);
        commonInputViewGroup6.MediaBrowserCompat$CustomActionResultReceiver.add(r03);
        CommonInputViewGroup commonInputViewGroup7 = this.ivpLastNameEnglish;
        C56758 r04 = new IconCompatParcelizer() {
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                bzVar.MediaDescriptionCompat.MediaMetadataCompat = charSequence.toString();
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        };
        commonInputViewGroup7.mEditText.addTextChangedListener(r04);
        commonInputViewGroup7.MediaBrowserCompat$CustomActionResultReceiver.add(r04);
        this.spinnerTitle.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                int selectedItemPosition = NdidNationalIdInputActivity.this.spinnerTitle.spinner.getSelectedItemPosition();
                List<setOrgId> list = bzVar.write;
                if (list != null && selectedItemPosition > 0) {
                    int i = selectedItemPosition - 1;
                    if (list.get(i) != null) {
                        bzVar.MediaDescriptionCompat.MediaDescriptionCompat = bzVar.write.get(i).MediaDescriptionCompat;
                    }
                }
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        });
        this.spinnerTitle.spinner.setOnTouchListener(new isDayEnabled(this));
        this.spinnerTitle.setItems(Collections.singletonList(getString(R.string.ndid_national_id_input_title_name_placeholder)), false, false);
        this.spinnerCountry.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                String str;
                C4128bz bzVar = NdidNationalIdInputActivity.this.presenter;
                int selectedItemPosition = NdidNationalIdInputActivity.this.spinnerCountry.spinner.getSelectedItemPosition();
                List<MoreExecutors> list = bzVar.IconCompatParcelizer;
                if (list == null || list.size() <= selectedItemPosition) {
                    str = null;
                } else {
                    str = bzVar.IconCompatParcelizer.get(selectedItemPosition).MediaBrowserCompat$ItemReceiver;
                }
                bzVar.MediaDescriptionCompat.MediaBrowserCompat$MediaItem = str;
                C4099bh bhVar = new C4099bh(bzVar);
                if (bzVar.RatingCompat != null) {
                    bhVar.IconCompatParcelizer(bzVar.RatingCompat);
                }
            }
        });
        IconCompatParcelizer(this.spinnerTitle, this.ivpFirstNameThai.mEditText.getLayoutParams());
        IconCompatParcelizer(this.spinnerCountry, this.ivpFirstNameThai.mEditText.getLayoutParams());
        this.spinnerTitle.setHintTextColor(R.color.f66402131099796);
        this.spinnerCountry.setHintTextColor(R.color.f66402131099796);
        this.laserIdFirst.setTextColor(-3553587);
        this.laserIdSecond.setTextColor(-3553587);
        this.laserIdThird.setTextColor(-3553587);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.write(mo3026D_());
        this.MediaSessionCompat$ResultReceiverWrapper.read("feature", MediaSessionCompat$ResultReceiverWrapper());
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "ndid_rp_fill_info");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final /* synthetic */ boolean MediaSessionCompat$Token() {
        if (!this.MediaSessionCompat$Token) {
            C4128bz bzVar = this.presenter;
            if (bzVar.RatingCompat != null) {
                bzVar.RatingCompat.AlertController$RecycleListView();
            }
            bzVar.MediaSessionCompat$Token.IconCompatParcelizer("ndid");
            bzVar.MediaSessionCompat$Token.IconCompatParcelizer(new C4128bz.write());
        }
        return false;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.ntb_ekyc_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    public final void MediaMetadataCompat() {
        calculateBounds.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051 A[Catch:{ IOException -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058 A[Catch:{ IOException -> 0x00b5 }] */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34117x50fd9e4a() {
        /*
            r6 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x00b5 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b5 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "mounted_ro"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x00b5 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00b5 }
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r3 = "yyyyMMdd_HHmmss"
            r2.<init>(r3)     // Catch:{ IOException -> 0x00b5 }
            java.util.Date r3 = new java.util.Date     // Catch:{ IOException -> 0x00b5 }
            r3.<init>()     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ IOException -> 0x00b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b5 }
            r3.<init>()     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = "JPEG_"
            r3.append(r4)     // Catch:{ IOException -> 0x00b5 }
            r3.append(r2)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r2 = "_"
            r3.append(r2)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ IOException -> 0x00b5 }
            java.io.File r3 = r6.getExternalFilesDir(r3)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = ".jpg"
            java.io.File r2 = java.io.File.createTempFile(r2, r4, r3)     // Catch:{ IOException -> 0x00b5 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x00b5 }
            android.net.Uri r0 = p040o.AppCompatTextView.IconCompatParcelizer(r6, r0, r2)     // Catch:{ IOException -> 0x00b5 }
            goto L_0x005e
        L_0x0058:
            java.lang.String r0 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x00b5 }
            android.net.Uri r0 = p040o.AppCompatTextView.IconCompatParcelizer(r6, r0, r2)     // Catch:{ IOException -> 0x00b5 }
        L_0x005e:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ IOException -> 0x00b5 }
            java.lang.Class<com.scb.phone.view.activity.ndid.NationalIdCameraActivity> r4 = com.scb.phone.view.activity.ndid.NationalIdCameraActivity.class
            r3.<init>(r6, r4)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r4 = "output"
            r3.putExtra(r4, r0)     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r0 = "EXTRA_CROP_RATIO"
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.putExtra(r0, r4)     // Catch:{ IOException -> 0x00b5 }
            com.thunderhead.android.aspects.IntentTidInjectionActivityAspect.aspectOf()     // Catch:{ IOException -> 0x00b5 }
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r6, r3)     // Catch:{ all -> 0x00a8 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x00a8 }
            o.MyECouponActivity_ViewBinding$write r3 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "Uri intercepted on Activity.startActivityForResult(Intent, int), modified: "
            r4.<init>(r5)     // Catch:{ all -> 0x00a8 }
            android.net.Uri r5 = r0.getData()     // Catch:{ all -> 0x00a8 }
            r4.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "\n with context "
            r4.append(r5)     // Catch:{ all -> 0x00a8 }
            int r5 = r6.hashCode()     // Catch:{ all -> 0x00a8 }
            r4.append(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00a8 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00a8 }
            r3 = r6
            com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity r3 = (com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity) r3     // Catch:{ all -> 0x00a8 }
            r4 = 123(0x7b, float:1.72E-43)
            r3.startActivityForResult(r0, r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException -> 0x00b5 }
        L_0x00ac:
            r6.MediaDescriptionCompat = r1     // Catch:{ IOException -> 0x00b5 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00b5 }
            r6.MediaMetadataCompat = r0     // Catch:{ IOException -> 0x00b5 }
            return
        L_0x00b5:
            r0 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity.mo34117x50fd9e4a():void");
    }

    public final void IconCompatParcelizer() {
        this.scanIdIcon.setImageResource(R.drawable.icon_green_tick);
        this.textViewTakingPhotoEditLabel.setVisibility(0);
    }

    public final void read(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public void RatingCompat() {
        NationalIdHelpActivity.write(this, getString(R.string.laser_id_help_title));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.presentation.views.ndid.NdidNationalIdInputView.idDisplay", builder);
        setResult(-1, intent);
        finish();
    }

    public final void IconCompatParcelizer(List<String> list) {
        if (list != null) {
            this.MediaSessionCompat$Token = true;
            this.spinnerTitle.setItemsWithPlaceholder(list, true, true);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MoreExecutors moreExecutors, int i) {
        this.spinnerCountry.setItemsWithPlaceholder(moreExecutors.read, false, false);
        if (moreExecutors.read.size() >= i) {
            this.spinnerCountry.setSelectionIndex(i);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.ivpNationalIdNumber.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpNationalIdNumber.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        write(getString(R.string.ndid_under_age_error_message));
    }

    public final void write() {
        write(getString(R.string.error_ekyc_passport_1004_text));
    }

    public final void read() {
        setFilename setfilename = new setFilename();
        setfilename.MediaDescriptionCompat = R.drawable.ic_notice;
        setfilename.MediaBrowserCompat$SearchResultReceiver = getString(R.string.ntb_ekyc_title);
        setfilename.MediaMetadataCompat = getString(R.string.error_default_title);
        setfilename.IconCompatParcelizer = getString(R.string.ekyc_user_exists_description);
        setfilename.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.ekyc_register_scb_easy_app);
        setfilename.write = new FragmentBuilder_BindCreditCardReviewFragment();
        setfilename.MediaBrowserCompat$ItemReceiver = false;
        Intent MediaBrowserCompat$ItemReceiver = ReviewInfoResultActivity.MediaBrowserCompat$ItemReceiver(this, setfilename);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer(String str) {
        File file = new File(str);
        if (file.exists() && file.delete()) {
            onCheckBoxClick.read("deleteOldImage was deleted", new Object[0]);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.dateOfBirthViewGroup.MediaBrowserCompat$ItemReceiver();
        } else {
            this.dateOfBirthViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void write(boolean z) {
        if (z) {
            this.dateOfIssuedViewGroup.MediaBrowserCompat$ItemReceiver();
        } else {
            this.dateOfIssuedViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(String str, int i) {
        this.MediaBrowserCompat$MediaItem = FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(str, i).write(new updateUi(this.presenter), new setRangeDates(this.presenter));
    }

    private void write(String str) {
        Intent intent = new Intent(this, ReviewInfoResultActivity.class);
        intent.putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice);
        intent.putExtra("EXTRA_PAGE_TITLE", getString(R.string.ntb_ekyc_title));
        intent.putExtra("EXTRA_TITLE", getString(R.string.error_default_title));
        intent.putExtra("EXTRA_DESCRIPTION", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        calculateBounds.write(this, i, iArr);
        for (int i2 : iArr) {
            if (i2 != 0) {
                finish();
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.presenter.MediaBrowserCompat$ItemReceiver = Boolean.TRUE;
        if (this.MediaDescriptionCompat) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.MediaDescriptionCompat = false;
            this.presenter.read(this.MediaMetadataCompat, Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i2 == -1 && i == 123) {
            this.MediaDescriptionCompat = true;
            this.rootView.requestFocus();
        } else if (i2 == 0 && i == 123) {
            AutoValue_CrashlyticsReport.Builder builder = this.presenter.MediaDescriptionCompat;
            if (builder == null || builder.MediaSessionCompat$ResultReceiverWrapper == null) {
                z = false;
            }
            if (!z) {
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @OnClick
    public void onEditTextClicked() {
        this.presenter.read();
    }

    public void onDestroy() {
        this.presenter.write();
        this.presenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    abstract class IconCompatParcelizer implements TextWatcher {
        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(NdidNationalIdInputActivity ndidNationalIdInputActivity) {
            this();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(NdidNationalIdInputActivity ndidNationalIdInputActivity) {
        C4128bz bzVar = ndidNationalIdInputActivity.presenter;
        StringBuilder sb = new StringBuilder();
        sb.append(ndidNationalIdInputActivity.laserIdFirst.getText().toString());
        sb.append(ndidNationalIdInputActivity.laserIdSecond.getText().toString());
        sb.append(ndidNationalIdInputActivity.laserIdThird.getText().toString());
        bzVar.MediaDescriptionCompat.f2673x50fd9e4a = sb.toString();
        C4099bh bhVar = new C4099bh(bzVar);
        if (bzVar.RatingCompat != null) {
            bhVar.IconCompatParcelizer(bzVar.RatingCompat);
        }
    }

    private static void IconCompatParcelizer(CustomSpinnerWithTitle customSpinnerWithTitle, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = customSpinnerWithTitle.containerSpinner.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.height = layoutParams4.height;
            layoutParams3.topMargin = layoutParams4.topMargin;
            customSpinnerWithTitle.containerSpinner.setLayoutParams(layoutParams3);
        }
    }
}
