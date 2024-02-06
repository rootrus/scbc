package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.CardManagementService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C7397qD;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsBackgroundWorker;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDirectDebitInputMainFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.PassportCaptureModule_GetIExtractionServerRttiFactory;
import p040o.UserProfile;
import p040o.UserProfile$MediaBrowserCompat$MediaItem;
import p040o.UserProfile$MediaBrowserCompat$SearchResultReceiver;
import p040o.UserProfile$MediaSessionCompat$ResultReceiverWrapper;
import p040o.VisibilityAwareImageButton;
import p040o.doCleanInvalidTempFiles;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.trimOpenSessions;
import p040o.writeNonFatalException;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public abstract class HmlBaseReviewActivity<T extends UserProfile> extends BaseActivity implements PassportCaptureModule_GetIExtractionServerRttiFactory {
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    @BindView
    public ProgressStateBar breadcrumbs;
    @BindView
    public Button btConfirm;
    @BindView
    public CheckBox cbTermsAndConditions;
    @BindView
    public CustomAcceptDeclineButtons crossConsent;
    @BindView
    public Group grBusinessAccountGroup;
    @BindView
    public View grRequiredDocuments;
    @BindView
    public ImageView ivPhotoAttached;
    @BindView
    public CustomAcceptDeclineButtons modelConsent;
    @HmlPinActivity
    public T presenter;
    @BindView
    public View promoSeparator;
    @BindView
    public View separatorBreadcrumbs;
    @BindView
    public Space spConsentSection;
    @BindView
    public TextView stampDutyDescription;
    @BindView
    public TextView stampDutyLabel;
    @BindView
    public View stampDutySeparator;
    @BindView
    public TierPricingSimplePromotionView tierPricingPromo;
    @BindView
    public TextView tvBirth;
    @BindView
    public TextView tvBirthLabel;
    @BindView
    public TextView tvBusinessAccountName;
    @BindView
    public TextView tvBusinessAccountNumber;
    @BindView
    public TextView tvCompanyName;
    @BindView
    public TextView tvConsentDescription;
    @BindView
    public TextView tvConsentLabel;
    @BindView
    public TextView tvDuration;
    @BindView
    public TextView tvDurationDescription;
    @BindView
    public TextView tvEducation;
    @BindView
    public TextView tvEmail;
    @BindView
    public TextView tvEngName;
    @BindView
    public TextView tvEngNameLabel;
    @BindView
    public TextView tvExperience;
    @BindView
    public TextView tvExpiry;
    @BindView
    public TextView tvHomeAddress;
    @BindView
    public TextView tvHomeAddressLabel;
    @BindView
    public TextView tvIssue;
    @BindView
    public TextView tvIssueLabel;
    @BindView
    public TextView tvJob;
    @BindView
    public TextView tvLaser;
    @BindView
    public TextView tvLaserId;
    @BindView
    public TextView tvLaserIdLabel;
    @BindView
    public TextView tvLaserLabel;
    @BindView
    public TextView tvMailingAddress;
    @BindView
    public TextView tvMarital;
    @BindView
    public TextView tvMobileNumber;
    @BindView
    public TextView tvMonthlyIncome;
    @BindView
    public TextView tvName;
    @BindView
    public TextView tvNameLabel;
    @BindView
    public TextView tvNationalId;
    @BindView
    public TextView tvNationalIdLabel;
    @BindView
    public TextView tvPhotoAttached;
    @BindView
    public TextView tvRepaymentAmount;
    @BindView
    public TextView tvRequestedLoan;
    @BindView
    public TextView tvResidential;
    @BindView
    public TextView tvSourceOfIncome;
    @BindView
    public TextView tvStartPaymentDate;
    @BindView
    public TextView tvTermsAndConditions;
    @BindView
    public TextView tvTitle;
    @BindView
    public TextView tvTitleLabel;
    @BindView
    public TextView tvWorkAddress;
    @BindView
    public TextView tvWorkContactNumber;
    @BindView
    public View vwConsentBg;
    @BindView
    public View vwCrossConsentSeparator;
    @BindView
    public View vwModelConsentSeparator;

    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlBaseReviewActivity MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(HmlBaseReviewActivity hmlBaseReviewActivity) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseReviewActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            T t = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            t.read(zzfe.zza.CROSS_SELL_CONSENT, booleanValue);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlBaseReviewActivity read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(HmlBaseReviewActivity hmlBaseReviewActivity) {
            super(1);
            this.read = hmlBaseReviewActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            T t = this.read.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            t.read(zzfe.zza.MODEL_CONSENT, booleanValue);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void setSeparatorBreadcrumbs(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.separatorBreadcrumbs = view;
    }

    public final void setPromoSeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.promoSeparator = view;
    }

    public final void setGrRequiredDocuments(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.grRequiredDocuments = view;
    }

    public final void setVwConsentBg(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.vwConsentBg = view;
    }

    public final void setVwModelConsentSeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.vwModelConsentSeparator = view;
    }

    public final void setVwCrossConsentSeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.vwCrossConsentSeparator = view;
    }

    public final void setStampDutySeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.stampDutySeparator = view;
    }

    /* access modifiers changed from: protected */
    public boolean MediaSessionCompat$Token() {
        return this.MediaMetadataCompat;
    }

    public static final class read {
        public String MediaBrowserCompat$ItemReceiver;
        public CardManagementService read;

        private read() {
        }

        @HmlPinActivity
        public read(CardManagementService cardManagementService, String str) {
            this.read = cardManagementService;
            this.MediaBrowserCompat$ItemReceiver = str;
        }
    }

    public void onCreate(Bundle bundle) {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        super.onCreate(bundle);
        setContentView(R.layout.f78352131493060);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_title));
        setTabContainer();
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.MediaBrowserCompat$ItemReceiver(this);
        T t2 = this.presenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean MediaSessionCompat$Token = MediaSessionCompat$Token();
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        int intExtra = intent.getIntExtra("EXTRA_TYPE", -1);
        VisibilityAwareImageButton visibilityAwareImageButton = intExtra >= 0 ? VisibilityAwareImageButton.values()[intExtra] : null;
        if (visibilityAwareImageButton == null) {
            visibilityAwareImageButton = VisibilityAwareImageButton.NORMAL;
        }
        String stringExtra = getIntent().getStringExtra("DEEP_LINK_ID");
        onGetStartedClick.write((Object) visibilityAwareImageButton, "type");
        if (t2.RatingCompat != null) {
            t2.RatingCompat.AlertController$RecycleListView();
        }
        if (VisibilityAwareImageButton.NORMAL == visibilityAwareImageButton) {
            debitCardResetOtpActivity = DebitCardResetOtpActivity.zip(t2.write.IconCompatParcelizer(VisibilityAwareImageButton.NORMAL, (String) null), t2.read.MediaBrowserCompat$ItemReceiver(), t2.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(), new UserProfile.ParcelableVolumeInfo(t2, MediaSessionCompat$Token));
        } else {
            debitCardResetOtpActivity = DebitCardResetOtpActivity.zip(t2.write.IconCompatParcelizer(visibilityAwareImageButton, stringExtra), t2.read.MediaBrowserCompat$ItemReceiver(), new UserProfile$MediaSessionCompat$ResultReceiverWrapper(t2, MediaSessionCompat$Token));
        }
        t2.write.write(debitCardResetOtpActivity, new UserProfile.MediaDescriptionCompat(t2));
        t2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        t2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new UserProfile$MediaBrowserCompat$SearchResultReceiver(t2));
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "campaignId");
        MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_title));
        setTabContainer();
    }

    public final void write(CrashlyticsBackgroundWorker.C32142 r11) {
        onGetStartedClick.write((Object) r11, "display");
        CheckBox checkBox = this.cbTermsAndConditions;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbTermsAndConditions");
        }
        checkBox.setOnCheckedChangeListener(new HmlBaseReviewActivity$MediaBrowserCompat$SearchResultReceiver(this));
        TextView textView = this.tvTermsAndConditions;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTermsAndConditions");
        }
        Resources resources = getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "resources");
        String string = getString(R.string.hml_review_terms_and_conditions_not_clickable_initial);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_r…ns_not_clickable_initial)");
        String string2 = getString(R.string.hml_review_terms_and_conditions_clickable);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_r…and_conditions_clickable)");
        textView.setText(FragmentBuilder_BindDirectDebitInputMainFragment.MediaBrowserCompat$ItemReceiver(resources, string2, string, (String) null, true, 0, new RatingCompat(this, r11), 104));
        TextView textView2 = this.tvTermsAndConditions;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTermsAndConditions");
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32142 r6) {
        onGetStartedClick.write((Object) r6, "display");
        m2902x50fd9e4a();
        View view = this.vwModelConsentSeparator;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwModelConsentSeparator");
        }
        view.setVisibility(0);
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.modelConsent;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("modelConsent");
        }
        customAcceptDeclineButtons.setVisibility(0);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.modelConsent;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("modelConsent");
        }
        String string = getString(R.string.hml_review_model_consent_not_clickable_initial);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_r…nt_not_clickable_initial)");
        String string2 = getString(R.string.hml_review_model_consent_clickable);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_r…_model_consent_clickable)");
        customAcceptDeclineButtons2.setHeaderText(string, string2, new HmlBaseReviewActivity$MediaBrowserCompat$MediaItem(this, r6));
        CustomAcceptDeclineButtons customAcceptDeclineButtons3 = this.modelConsent;
        if (customAcceptDeclineButtons3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("modelConsent");
        }
        customAcceptDeclineButtons3.setOnButtonClickListener(new MediaMetadataCompat(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32142 r6) {
        onGetStartedClick.write((Object) r6, "display");
        m2902x50fd9e4a();
        View view = this.vwCrossConsentSeparator;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwCrossConsentSeparator");
        }
        view.setVisibility(0);
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.crossConsent;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("crossConsent");
        }
        customAcceptDeclineButtons.setVisibility(0);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.crossConsent;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("crossConsent");
        }
        String string = getString(R.string.hml_review_cross_consent_not_clickable_initial);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_r…nt_not_clickable_initial)");
        String string2 = getString(R.string.hml_review_cross_consent_clickable);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_r…_cross_consent_clickable)");
        customAcceptDeclineButtons2.setHeaderText(string, string2, new C5601x1ed15e4c(this, r6));
        CustomAcceptDeclineButtons customAcceptDeclineButtons3 = this.crossConsent;
        if (customAcceptDeclineButtons3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("crossConsent");
        }
        customAcceptDeclineButtons3.setOnButtonClickListener(new MediaDescriptionCompat(this));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2902x50fd9e4a() {
        TextView textView = this.tvConsentLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvConsentLabel");
        }
        View view = textView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        View view2 = this.vwConsentBg;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwConsentBg");
        }
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(0);
        TextView textView2 = this.tvConsentDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvConsentDescription");
        }
        View view3 = textView2;
        onGetStartedClick.write((Object) view3, "$this$isVisible");
        view3.setVisibility(0);
        Space space = this.spConsentSection;
        if (space == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spConsentSection");
        }
        View view4 = space;
        onGetStartedClick.write((Object) view4, "$this$isVisible");
        view4.setVisibility(0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("HML_CONSENT_TYPE");
            if (!(serializableExtra instanceof zzfe.zza)) {
                serializableExtra = null;
            }
            zzfe.zza zza = (zzfe.zza) serializableExtra;
            if (zza != null) {
                T t = this.presenter;
                if (t == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                boolean z = false;
                boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_ACCEPTED", false);
                onGetStartedClick.write((Object) zza, "type");
                writeUInt64NoTag.IconCompatParcelizer userProfile$MediaBrowserCompat$MediaItem = new UserProfile$MediaBrowserCompat$MediaItem(zza, booleanExtra);
                if (t.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    userProfile$MediaBrowserCompat$MediaItem.IconCompatParcelizer(t.RatingCompat);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btConfirm;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btConfirm");
        }
        button.setEnabled(z);
    }

    public final void IconCompatParcelizer(zzfe.zza zza, boolean z) {
        onGetStartedClick.write((Object) zza, "type");
        int i = C7397qD.MediaBrowserCompat$CustomActionResultReceiver[zza.ordinal()];
        if (i == 1) {
            CheckBox checkBox = this.cbTermsAndConditions;
            if (checkBox == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbTermsAndConditions");
            }
            checkBox.setChecked(z);
        } else if (i != 2) {
            CustomAcceptDeclineButtons customAcceptDeclineButtons = this.crossConsent;
            if (customAcceptDeclineButtons == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("crossConsent");
            }
            customAcceptDeclineButtons.write(z);
        } else {
            CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.modelConsent;
            if (customAcceptDeclineButtons2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("modelConsent");
            }
            customAcceptDeclineButtons2.write(z);
        }
    }

    public void onDestroy() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.onDestroy();
        super.onDestroy();
    }

    public void onBackPressed() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.hml_occupation_back_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.hml_occupation_back_dialog_text);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(getString(R.string.personal_limit_exit_dialog_ok), new write(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.personal_limit_exit_dialog_cancel), IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlBaseReviewActivity MediaBrowserCompat$ItemReceiver;

        write(HmlBaseReviewActivity hmlBaseReviewActivity) {
            this.MediaBrowserCompat$ItemReceiver = hmlBaseReviewActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            T t = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = UserProfile.MediaMetadataCompat.write;
            if (t.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        finish();
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ CrashlyticsBackgroundWorker.C32142 MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ HmlBaseReviewActivity read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(HmlBaseReviewActivity hmlBaseReviewActivity, CrashlyticsBackgroundWorker.C32142 r2) {
            super(0);
            this.read = hmlBaseReviewActivity;
            this.MediaBrowserCompat$ItemReceiver = r2;
        }

        public final /* synthetic */ Object invoke() {
            T t = this.read.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            t.read(zzfe.zza.TERMS_N_CONDITIONS, this.MediaBrowserCompat$ItemReceiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public void read(writeNonFatalException writenonfatalexception) {
        CrashlyticsReport.FilesPayload.Builder builder;
        onGetStartedClick.write((Object) writenonfatalexception, "display");
        CrashlyticsController.C322216 r0 = writenonfatalexception.read;
        this.MediaBrowserCompat$MediaItem = r0.MediaBrowserCompat$ItemReceiver;
        TextView textView = this.tvRequestedLoan;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRequestedLoan");
        }
        textView.setText(getString(R.string.hml_summary_request_value, new Object[]{r0.MediaBrowserCompat$ItemReceiver}));
        this.MediaDescriptionCompat = r0.write.IconCompatParcelizer;
        String string = getString(R.string.hml_summary_duration_value, new Object[]{r0.read, r0.write.write});
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(\n             …tallment.installmentUnit)");
        this.MediaBrowserCompat$SearchResultReceiver = string;
        TextView textView2 = this.tvRepaymentAmount;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRepaymentAmount");
        }
        textView2.setText(getString(R.string.hml_summary_request_amount_value, new Object[]{r0.write.IconCompatParcelizer, r0.write.MediaBrowserCompat$CustomActionResultReceiver}));
        TextView textView3 = this.tvDuration;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDuration");
        }
        textView3.setText(getString(R.string.hml_summary_duration_value, new Object[]{r0.read, r0.write.write}));
        TextView textView4 = this.tvDurationDescription;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDurationDescription");
        }
        textView4.setText(getString(R.string.hml_summary_duration_description, new Object[]{r0.IconCompatParcelizer}));
        TextView textView5 = this.tvStartPaymentDate;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvStartPaymentDate");
        }
        textView5.setText(r0.RatingCompat);
        List<CrashlyticsReport.FilesPayload.Builder> list = r0.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((CrashlyticsReport.FilesPayload.Builder) next).read) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (!(!list2.isEmpty())) {
                list2 = null;
            }
            if (!(list2 == null || (builder = (CrashlyticsReport.FilesPayload.Builder) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list2)) == null)) {
                TierPricingSimplePromotionView tierPricingSimplePromotionView = this.tierPricingPromo;
                if (tierPricingSimplePromotionView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tierPricingPromo");
                }
                tierPricingSimplePromotionView.setDisplay(builder);
                tierPricingSimplePromotionView.setRemarkTextColor(R.color.f66182131099773);
                tierPricingSimplePromotionView.setVisibility(0);
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                View view = this.promoSeparator;
                if (view == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("promoSeparator");
                }
                view.setVisibility(0);
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity2 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
        TextView textView6 = this.tvName;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
        }
        textView6.setText(writenonfatalexception.RatingCompat);
        trimOpenSessions trimopensessions = writenonfatalexception.IconCompatParcelizer;
        TextView textView7 = this.tvMobileNumber;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMobileNumber");
        }
        textView7.setText(getICheckDeserializerRtti.IconCompatParcelizer(false, true, trimopensessions.MediaMetadataCompat));
        TextView textView8 = this.tvEmail;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEmail");
        }
        textView8.setText(trimopensessions.MediaBrowserCompat$ItemReceiver);
        TextView textView9 = this.tvMailingAddress;
        if (textView9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMailingAddress");
        }
        textView9.setText(trimopensessions.MediaBrowserCompat$SearchResultReceiver);
        TextView textView10 = this.tvMonthlyIncome;
        if (textView10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonthlyIncome");
        }
        textView10.setText(trimopensessions.MediaDescriptionCompat);
        if (trimopensessions.MediaBrowserCompat$MediaItem) {
            TextView textView11 = this.tvPhotoAttached;
            if (textView11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPhotoAttached");
            }
            textView11.setText(getString(R.string.hml_review_photos_attached, new Object[]{trimopensessions.MediaSessionCompat$Token}));
            View view2 = this.grRequiredDocuments;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("grRequiredDocuments");
            }
            view2.setVisibility(0);
        }
        TextView textView12 = this.tvEducation;
        if (textView12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEducation");
        }
        textView12.setText(trimopensessions.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView13 = this.tvMarital;
        if (textView13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMarital");
        }
        textView13.setText(trimopensessions.RatingCompat);
        TextView textView14 = this.tvResidential;
        if (textView14 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvResidential");
        }
        textView14.setText(trimopensessions.MediaSessionCompat$QueueItem);
        TextView textView15 = this.tvExpiry;
        if (textView15 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpiry");
        }
        textView15.setText(trimopensessions.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        TextView textView16 = this.tvLaser;
        if (textView16 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaser");
        }
        textView16.setText(trimopensessions.IconCompatParcelizer.write);
        TextView textView17 = this.tvLaserId;
        if (textView17 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserId");
        }
        textView17.setText(trimopensessions.IconCompatParcelizer.write);
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity3 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        doCleanInvalidTempFiles docleaninvalidtempfiles = writenonfatalexception.MediaBrowserCompat$MediaItem;
        TextView textView18 = this.tvJob;
        if (textView18 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvJob");
        }
        textView18.setText(docleaninvalidtempfiles.IconCompatParcelizer);
        TextView textView19 = this.tvSourceOfIncome;
        if (textView19 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSourceOfIncome");
        }
        textView19.setText(docleaninvalidtempfiles.write);
        TextView textView20 = this.tvCompanyName;
        if (textView20 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCompanyName");
        }
        textView20.setText(docleaninvalidtempfiles.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView21 = this.tvWorkAddress;
        if (textView21 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvWorkAddress");
        }
        textView21.setText(docleaninvalidtempfiles.read);
        TextView textView22 = this.tvWorkContactNumber;
        if (textView22 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvWorkContactNumber");
        }
        textView22.setText(getICheckDeserializerRtti.IconCompatParcelizer(false, true, docleaninvalidtempfiles.RatingCompat));
        TextView textView23 = this.tvExperience;
        if (textView23 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExperience");
        }
        textView23.setText(getString(R.string.hml_review_experience_values, new Object[]{docleaninvalidtempfiles.MediaBrowserCompat$SearchResultReceiver, docleaninvalidtempfiles.MediaBrowserCompat$ItemReceiver}));
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity4 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        writeNonFatalException.write write2 = writenonfatalexception.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            Group group = this.grBusinessAccountGroup;
            if (group == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("grBusinessAccountGroup");
            }
            group.setVisibility(0);
            TextView textView24 = this.tvBusinessAccountName;
            if (textView24 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBusinessAccountName");
            }
            textView24.setText(write2.IconCompatParcelizer);
            TextView textView25 = this.tvBusinessAccountNumber;
            if (textView25 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBusinessAccountNumber");
            }
            textView25.setText(write2.write);
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity5 = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        Button button = this.btConfirm;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btConfirm");
        }
        button.setOnClickListener(new HmlBaseReviewActivity$MediaBrowserCompat$ItemReceiver(this));
    }
}
