package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
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
import com.google.gson.annotations.SerializedName;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity;
import com.scb.phone.view.activity.easycash.EasycashNCBConsentActivity;
import com.scb.phone.view.activity.easycash.speedycash.LoanTermsConditionsActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.easycash.CustomAcceptDecline;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomPhone;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashMailingAddressFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AnalyticsReceiver;
import p040o.C6393xc7fe0382;
import p040o.FragmentBuilder_BindDebitCardFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.Image;
import p040o.Multisets;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.enablePublishingAndFlushPending;
import p040o.forEachClear;
import p040o.getAspectRatioFraction;
import p040o.getNTBApplyLoanEntry;
import p040o.getNTBContactInfo;
import p040o.getOccupation;
import p040o.getOffers;
import p040o.getOperatingAccount;
import p040o.getOverridenSpiEndpoint;
import p040o.getPromptPayVerificationStage;
import p040o.getResidentTypeStatus;
import p040o.getSupportingDocumentType;
import p040o.getTimeOutParameters;
import p040o.immediateFailedFuture;
import p040o.isEmulator;
import p040o.loginFingerPrint;
import p040o.onGetStartedClick;
import p040o.setEmpty;
import p040o.setTapText;

public class EasycashContactInformationFragment extends BreadcrumbFragment implements C6393xc7fe0382 {
    private IOrientationGuidanceCalculator IconCompatParcelizer;
    private Map<String, CustomAcceptDecline> MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected TextView addressInfo;
    @BindView
    protected Button btnNext;
    @BindView
    protected CustomSeparatedViews consentList;
    @BindView
    protected LinearLayout englishNameGroup;
    @BindView
    protected CommonInputViewGroup firstName;
    @BindView
    protected CustomEasyCashSectionLabel labelConsentSection;
    @BindView
    protected CommonInputViewGroup lastName;
    @BindView
    protected LinearLayout layoutConsentContent;
    @BindView
    protected ImageView mImageIconExpandMore;
    @BindView
    protected CustomPhone phoneEditText;
    @HmlPinActivity
    public Image.C34591 presenter;
    @BindView
    protected CommonInputViewGroup refCode1;
    @BindView
    protected CommonInputViewGroup refCode2;
    @BindView
    protected LinearLayout refCodeExpandView;
    @BindView
    protected CheckBox termsAndConditionsCheck;
    @BindView
    protected TextView termsConditionsText;
    @BindView
    protected TextView textAddressError;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    protected TextView tvEmail;
    @BindView
    protected TextView tvName;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final int ParcelableVolumeInfo() {
        return 2;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EasycashContactInformationFragment write() {
        EasycashContactInformationFragment easycashContactInformationFragment = new EasycashContactInformationFragment();
        easycashContactInformationFragment.setArguments(new Bundle());
        return easycashContactInformationFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f86932131493920, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Image.C34591 r4 = this.presenter;
        String read = this.IconCompatParcelizer.read();
        String MediaBrowserCompat$SearchResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver();
        isEmulator MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        r4.write = read;
        r4.MediaBrowserCompat$MediaItem = MediaBrowserCompat$SearchResultReceiver;
        if (MediaBrowserCompat$ItemReceiver != null) {
            str = MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
        } else {
            str = null;
        }
        r4.MediaBrowserCompat$SearchResultReceiver = str;
        r4.MediaBrowserCompat$ItemReceiver = new HashMap();
        r4.MediaSessionCompat$ResultReceiverWrapper = new ArrayList();
        r4.MediaSessionCompat$QueueItem = new Object() {
            @SerializedName("engLastName")
            public String IconCompatParcelizer;
            @SerializedName("engFirstName")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("declinedConsents")
            public List<String> MediaBrowserCompat$ItemReceiver;
            @SerializedName("mailingAddress")
            public animateCamera MediaBrowserCompat$MediaItem;
            @SerializedName("staffId2")
            public String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("tilesVersion")
            public String MediaDescriptionCompat;
            @SerializedName("staffId1")
            public String MediaMetadataCompat;
            @SerializedName("mobileNo")
            public String RatingCompat;
            @SerializedName("acceptedConsents")
            public List<String> read;
            @SerializedName("applicationId")
            public String write;
        };
        r4.MediaBrowserCompat$ItemReceiver();
        this.phoneEditText.MediaBrowserCompat$ItemReceiver();
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getOverridenSpiEndpoint getoverridenspiendpoint) {
        this.tvEmail.requestFocus();
        this.tvName.setText(getoverridenspiendpoint.MediaDescriptionCompat);
        this.phoneEditText.setNecessaryInfo(getoverridenspiendpoint.RatingCompat, getString(R.string.easycash_invalid_format), new getPromptPayVerificationStage(this));
        this.tvEmail.setText(getoverridenspiendpoint.read);
        this.tvEmail.setOnFocusChangeListener(new getNTBContactInfo(this));
        this.refCode1.setFilter("^[a-zA-Z0-9]+$");
        this.refCode2.setFilter("^[a-zA-Z0-9]+$");
        this.refCode1.setFocusListener(new getOperatingAccount(this));
        CommonInputViewGroup commonInputViewGroup = this.refCode1;
        C59152 r0 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CommonInputViewGroup commonInputViewGroup = EasycashContactInformationFragment.this.refCode1;
                commonInputViewGroup.mEditText.removeTextChangedListener(this);
                commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.remove(this);
                EasycashContactInformationFragment.MediaBrowserCompat$ItemReceiver(editable);
                CommonInputViewGroup commonInputViewGroup2 = EasycashContactInformationFragment.this.refCode1;
                commonInputViewGroup2.mEditText.addTextChangedListener(this);
                commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(this);
                Image.C34591 r0 = EasycashContactInformationFragment.this.presenter;
                r0.MediaSessionCompat$QueueItem.MediaMetadataCompat = editable.toString();
                setEmpty setempty = new setEmpty(r0);
                if (r0.RatingCompat != null) {
                    setempty.IconCompatParcelizer(r0.RatingCompat);
                }
            }
        };
        commonInputViewGroup.mEditText.addTextChangedListener(r0);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(r0);
        this.refCode2.setFocusListener(new getNTBApplyLoanEntry(this));
        CommonInputViewGroup commonInputViewGroup2 = this.refCode2;
        C59141 r02 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                Image.C34591 r0 = EasycashContactInformationFragment.this.presenter;
                r0.MediaSessionCompat$QueueItem.MediaBrowserCompat$SearchResultReceiver = editable.toString();
                setEmpty setempty = new setEmpty(r0);
                if (r0.RatingCompat != null) {
                    setempty.IconCompatParcelizer(r0.RatingCompat);
                }
            }
        };
        commonInputViewGroup2.mEditText.addTextChangedListener(r02);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(r02);
    }

    @OnClick
    public void onLayoutCollapsedClick() {
        FragmentBuilder_BindDeejungPlansFragment.read(this.mImageIconExpandMore);
        if (this.refCodeExpandView.getVisibility() == 8) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.refCodeExpandView);
        } else {
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.refCodeExpandView);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.englishNameGroup.setVisibility(0);
        this.firstName.setFilter("^[a-zA-Z .'-]+$");
        this.lastName.setFilter("^[a-zA-Z .'-]+$");
        this.firstName.setText(str);
        this.lastName.setText(str2);
        this.firstName.setFocusListener(new getOffers(this));
        CommonInputViewGroup commonInputViewGroup = this.firstName;
        C59185 r4 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                Image.C34591 r0 = EasycashContactInformationFragment.this.presenter;
                r0.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver = editable.toString();
                setEmpty setempty = new setEmpty(r0);
                if (r0.RatingCompat != null) {
                    setempty.IconCompatParcelizer(r0.RatingCompat);
                }
            }
        };
        commonInputViewGroup.mEditText.addTextChangedListener(r4);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(r4);
        this.lastName.setFocusListener(new getOccupation(this));
        CommonInputViewGroup commonInputViewGroup2 = this.lastName;
        C59163 r42 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                Image.C34591 r0 = EasycashContactInformationFragment.this.presenter;
                r0.MediaSessionCompat$QueueItem.IconCompatParcelizer = editable.toString();
                setEmpty setempty = new setEmpty(r0);
                if (r0.RatingCompat != null) {
                    setempty.IconCompatParcelizer(r0.RatingCompat);
                }
            }
        };
        commonInputViewGroup2.mEditText.addTextChangedListener(r42);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(r42);
    }

    public final /* synthetic */ void MediaDescriptionCompat(boolean z) {
        if (z) {
            write(false);
            return;
        }
        CommonInputViewGroup commonInputViewGroup = this.firstName;
        commonInputViewGroup.setText(commonInputViewGroup.mEditText.getText().toString().trim());
        this.presenter.read(this.firstName.mEditText.getText().toString());
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem(boolean z) {
        if (z) {
            IconCompatParcelizer(false);
            return;
        }
        CommonInputViewGroup commonInputViewGroup = this.lastName;
        commonInputViewGroup.setText(commonInputViewGroup.mEditText.getText().toString().trim());
        this.presenter.MediaBrowserCompat$ItemReceiver(this.lastName.mEditText.getText().toString());
    }

    public final void write(boolean z) {
        if (z) {
            this.firstName.setErrorText(getString(R.string.english_name_inline_error));
            this.firstName.MediaBrowserCompat$ItemReceiver();
            return;
        }
        this.firstName.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            this.lastName.setErrorText(getString(R.string.english_name_inline_error));
            this.lastName.MediaBrowserCompat$ItemReceiver();
            return;
        }
        this.lastName.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.refCode1.setErrorText(getString(R.string.reference_code_error));
            this.refCode1.MediaBrowserCompat$ItemReceiver();
            return;
        }
        this.refCode1.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaMetadataCompat(boolean z) {
        if (z) {
            this.refCode2.setErrorText(getString(R.string.reference_code_error));
            this.refCode2.MediaBrowserCompat$ItemReceiver();
            return;
        }
        this.refCode2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(String str) {
        this.addressInfo.setText(str);
    }

    @OnClick
    public void onAddressClick() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashMailingAddressFragment.IconCompatParcelizer(this.presenter.IconCompatParcelizer));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void nextButtonClick() {
        this.presenter.read(this.firstName.mEditText.getText().toString());
        this.presenter.MediaBrowserCompat$ItemReceiver(this.lastName.mEditText.getText().toString());
        if (this.presenter.IconCompatParcelizer()) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.IconCompatParcelizer.write()));
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_contact");
            }
            Image.C34591 r0 = this.presenter;
            r0.MediaSessionCompat$QueueItem.read = r0.IconCompatParcelizer(DiskLruCache.VERSION_1);
            r0.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver = r0.IconCompatParcelizer("0");
            r0.IconCompatParcelizer(false);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        Intent intent = new Intent(getContext(), EasycashNCBConsentActivity.class);
        intent.putExtra("EXTRA_APPLICATION_ID", str);
        intent.putExtra("EXTRA_PRODUCT_TYPE", str2);
        intent.putExtra("EXTRA_PRODUCT_PROGRAM", str3);
        intent.putExtra("EXTRA_PRODUCT_GROUP", this.IconCompatParcelizer.MediaMetadataCompat());
        intent.putExtra("EXTRA_FLOW_TYPE", this.IconCompatParcelizer.write());
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
            startActivityForResult(intent, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str, String str2, String str3) {
        Intent IconCompatParcelizer2 = EasycashCommonNCBConsentActivity.IconCompatParcelizer(new FragmentBuilder_BindDebitCardFragment(getContext(), this.IconCompatParcelizer.MediaMetadataCompat(), this.IconCompatParcelizer.write(), str2, str3, str, this.IconCompatParcelizer.IconCompatParcelizer()));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.textAddressError.setVisibility(0);
        this.textAddressError.setText(getString(R.string.address_required_field));
    }

    public final void read() {
        this.textAddressError.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer() {
        /*
            r14 = this;
            o.IOrientationGuidanceCalculator r0 = r14.IconCompatParcelizer
            java.lang.String r0 = r0.MediaBrowserCompat$SearchResultReceiver()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            r4 = 277399877(0x1088c945, float:5.3952646E-29)
            if (r1 == r4) goto L_0x0020
            r4 = 2090361232(0x7c986190, float:6.3296634E36)
            if (r1 != r4) goto L_0x002a
            java.lang.String r1 = "PURPOSEFUL_LOAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002a
            r0 = r2
            goto L_0x002b
        L_0x0020:
            java.lang.String r1 = "HOME_TOP_UP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002a
            r0 = r3
            goto L_0x002b
        L_0x002a:
            r0 = -1
        L_0x002b:
            r1 = 2131760667(0x7f10161b, float:1.915236E38)
            if (r0 == 0) goto L_0x0068
            if (r0 == r3) goto L_0x0046
            o.Image$1 r0 = r14.presenter
            o.setRectRight r1 = new o.setRectRight
            r1.<init>(r0)
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x003e
            r2 = r3
        L_0x003e:
            if (r2 == 0) goto L_0x0045
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0045:
            return
        L_0x0046:
            o.Image$1 r2 = r14.presenter
            java.lang.String r3 = r14.getString(r1)
            o.IOrientationGuidanceCalculator r0 = r14.IconCompatParcelizer
            o.isEmulator r0 = r0.MediaBrowserCompat$ItemReceiver()
            o.IOrientationGuidanceCalculator r1 = r14.IconCompatParcelizer
            o.getTotalRamInBytes r1 = r1.MediaBrowserCompat$CustomActionResultReceiver()
            o.Multisets$UnmodifiableMultiset r4 = r2.read
            java.util.List r4 = r4.MediaBrowserCompat$ItemReceiver(r0)
            java.lang.String r5 = r1.IconCompatParcelizer
            java.lang.String r6 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r7 = ""
            r2.write(r3, r4, r5, r6, r7)
            return
        L_0x0068:
            o.Image$1 r8 = r14.presenter
            java.lang.String r9 = r14.getString(r1)
            o.IOrientationGuidanceCalculator r0 = r14.IconCompatParcelizer
            o.isEmulator r0 = r0.MediaBrowserCompat$ItemReceiver()
            o.IOrientationGuidanceCalculator r1 = r14.IconCompatParcelizer
            o.isRooted r1 = r1.MediaBrowserCompat$MediaItem()
            o.Multisets$UnmodifiableMultiset r2 = r8.read
            java.lang.String r3 = r8.MediaBrowserCompat$MediaItem
            o.zzbt$zzc$zza r4 = r8.f2721x50fd9e4a
            java.lang.String r4 = r4.MediaBrowserCompat$ItemReceiver
            o.CustomConcurrentHashMap$EntryFactory$12 r5 = r8.MediaSessionCompat$QueueItem
            o.animateCamera r5 = r5.MediaBrowserCompat$MediaItem
            o.AutoValue_CrashlyticsReport_CustomAttribute r5 = p040o.getDigest.MediaBrowserCompat$ItemReceiver(r5)
            java.lang.String r5 = r5.MediaBrowserCompat$SearchResultReceiver
            java.util.List r10 = r2.IconCompatParcelizer((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (p040o.isEmulator) r0)
            java.lang.String r11 = r1.IconCompatParcelizer
            java.lang.String r12 = r1.MediaBrowserCompat$CustomActionResultReceiver
            double r0 = r0.read
            java.lang.String r13 = java.lang.String.valueOf(r0)
            r8.write(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment.IconCompatParcelizer():void");
    }

    public final void read(access$2200 access_2200) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer((Context) getActivity()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new getSupportingDocumentType(this));
        IconCompatParcelizer2.setCancelable(false);
        IconCompatParcelizer2.setOnDismissListener(this);
        IconCompatParcelizer2.show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AnalyticsReceiver analyticsReceiver) {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashReviewFragment.IconCompatParcelizer(analyticsReceiver));
    }

    public final void MediaBrowserCompat$ItemReceiver(Map<String, String> map) {
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        onGetStartedClick.write((Object) map, "consents");
        Bundle bundle = new Bundle();
        bundle.putSerializable("CONSENTS_MAP", (Serializable) map);
        EasycashCommonReviewFragment easycashCommonReviewFragment = new EasycashCommonReviewFragment();
        easycashCommonReviewFragment.setArguments(bundle);
        gettimeoutparameters.IconCompatParcelizer(this, easycashCommonReviewFragment);
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.contact_info_title);
    }

    public final void write(String str) {
        String string = getString(R.string.contact_info_terms_cond_begin);
        String string2 = getString(R.string.contact_info_terms_cond_clickable);
        String string3 = getString(R.string.contact_info_terms_cond_end);
        if (!(str == null || str.length() == 0)) {
            string3 = string3.concat("\n\n").concat(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(string2);
        sb.append(string3);
        SpannableString spannableString = new SpannableString(sb.toString());
        C59174 r7 = new ClickableSpan() {
            public final void onClick(View view) {
                Image.C34591 r7 = EasycashContactInformationFragment.this.presenter;
                if (r7.RatingCompat != null) {
                    r7.RatingCompat.AlertController$RecycleListView();
                }
                r7.MediaSessionCompat$Token.IconCompatParcelizer(Multisets.UnmodifiableMultiset.MediaBrowserCompat$CustomActionResultReceiver(r7.write, r7.MediaBrowserCompat$MediaItem, "TERMS_N_CONDITIONS", r7.MediaBrowserCompat$SearchResultReceiver));
                r7.MediaSessionCompat$Token.IconCompatParcelizer(new Image.C34591.write("TERMS_N_CONDITIONS"));
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                EasycashContactInformationFragment.this.getResources();
                textPaint.setColor(-9031231);
            }
        };
        int length = string.length();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(string2);
        spannableString.setSpan(r7, length, sb2.toString().length(), 0);
        this.termsConditionsText.setText(spannableString);
        this.termsConditionsText.setMovementMethod(LinkMovementMethod.getInstance());
        this.termsConditionsText.setHighlightColor(0);
        this.termsAndConditionsCheck.setOnClickListener(new getResidentTypeStatus(this));
    }

    public final /* synthetic */ void MediaDescriptionCompat() {
        this.presenter.IconCompatParcelizer("TERMS_N_CONDITIONS", this.termsAndConditionsCheck.isChecked());
    }

    public final void read(boolean z) {
        this.termsAndConditionsCheck.setChecked(z);
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        Map<String, CustomAcceptDecline> map = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (map != null && !map.isEmpty()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.get(str).setAgree(Boolean.valueOf(z));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.consentList.items.removeAllViews();
        this.labelConsentSection.setVisibility(8);
        this.layoutConsentContent.setVisibility(8);
    }

    public final void write(List<enablePublishingAndFlushPending> list) {
        this.consentList.items.removeAllViews();
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (enablePublishingAndFlushPending next : list) {
            CustomAcceptDecline customAcceptDecline = new CustomAcceptDecline(getContext(), next, new loginFingerPrint() {
                public final void read(String str, Boolean bool) {
                    EasycashContactInformationFragment.this.presenter.IconCompatParcelizer(str, bool.booleanValue());
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4) {
                    Image.C34591 r0 = EasycashContactInformationFragment.this.presenter;
                    getAspectRatioFraction getaspectratiofraction = new getAspectRatioFraction(r0.MediaDescriptionCompat.read(str4, str2, str3, true, false, str));
                    if (r0.RatingCompat != null) {
                        getaspectratiofraction.IconCompatParcelizer(r0.RatingCompat);
                    }
                }
            });
            this.MediaBrowserCompat$CustomActionResultReceiver.put(next.write, customAcceptDecline);
            arrayList.add(customAcceptDecline);
        }
        this.consentList.IconCompatParcelizer(arrayList);
    }

    public final void read(String str) {
        Map<String, CustomAcceptDecline> map = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (map != null && !map.isEmpty()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.get(str).MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.btnNext.setEnabled(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 23 || i == 101) {
            boolean booleanExtra = intent.getBooleanExtra("CONSENT_CONDITIONS_STATUS", false);
            this.presenter.IconCompatParcelizer(intent.getStringExtra("CONSENT_CONDITIONS_TAG"), booleanExtra);
        }
    }

    public void onDestroyView() {
        this.tracker = null;
        this.IconCompatParcelizer = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        Intent IconCompatParcelizer2 = LoanTermsConditionsActivity.IconCompatParcelizer(getContext(), immediatefailedfuture);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 23);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Editable editable) {
        try {
            Integer.parseInt(String.valueOf(editable.charAt(0)));
            editable.replace(0, editable.length(), new SpannableStringBuilder(editable.toString().replaceAll("[a-zA-Z]", "")));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
        }
    }
}
