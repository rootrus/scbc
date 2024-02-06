package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlEtbSubmissionOtpActivity;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomInfoItemWithImage;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.ActivityBuilder_BindFundRedeemReviewActivity;
import p040o.C3758xd990f62c;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LookAndFeelParameters;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RestrictedComponentContainer;
import p040o.UserLogoutResponse;
import p040o.UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.UserLogoutResponse$MediaBrowserCompat$ItemReceiver;
import p040o.UserLogoutResponse$MediaBrowserCompat$MediaItem;
import p040o.ZSYR2K;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.onUncaughtException;
import p040o.setCollapsedTitleTextColor;
import p040o.setExpandedTitleTypeface;
import p040o.setExtraData;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.verifyMoneyGift$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public final class HmlBusinessOwnerSubmissionReviewStepTwoFragment extends BaseFragment implements LookAndFeelParameters.TorchMode {
    public static final C6019xdde7963c IconCompatParcelizer = new C6019xdde7963c((byte) 0);
    private final Map<zzfe.zza, CustomAcceptDeclineButtons> MediaBrowserCompat$CustomActionResultReceiver = new LinkedHashMap();
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    private final HmlVerifyEmailActivity RatingCompat;
    @BindView
    public CustomSeparatedViews bankAccountsInfoContainer;
    @BindView
    public CustomSeparatedViews businessInfoContainer;
    @BindView
    public CheckBox checkBoxTermsConditions;
    @BindView
    public Button confirmButton;
    @BindView
    public View consentSection;
    @BindView
    public CustomSeparatedViews consentsContainer;
    @BindView
    public CustomSeparatedViews incomeInfoContainer;
    @BindView
    public CustomSeparatedViews loanInfoInfoContainer;
    @BindView
    public View ownStoreHeader;
    @BindView
    public CustomSeparatedViews ownStoreInfoContainer;
    @HmlPinActivity
    public UserLogoutResponse<LookAndFeelParameters.TorchMode> presenter;
    @BindView
    public View storeOrProductHeader;
    @BindView
    public CustomSeparatedViews storeOrProductInfoContainer;
    @BindView
    public TextView textViewTermsConditions;
    @BindView
    public TextView tvFilesAttached;
    @BindView
    public View uploadedDocumentsContainer;

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<RestrictedComponentContainer, Boolean> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(((RestrictedComponentContainer) obj) == null);
        }
    }

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<TextView, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextView textView = (TextView) obj;
            onGetStartedClick.write((Object) textView, "$receiver");
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<TextView, HmlVerifyPhoneValidateOtpActivity> {
        public static final MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaMetadataCompat();

        MediaMetadataCompat() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextView textView = (TextView) obj;
            onGetStartedClick.write((Object) textView, "$receiver");
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<TextView, HmlVerifyPhoneValidateOtpActivity> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextView textView = (TextView) obj;
            onGetStartedClick.write((Object) textView, "$receiver");
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public HmlBusinessOwnerSubmissionReviewStepTwoFragment() {
        FundActionsSuccessActivity hmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6018xf096d4ad(this);
        onGetStartedClick.write((Object) hmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.RatingCompat = new HmlVerifyPhoneTermsConditionsActivity(hmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$CustomActionResultReceiver);
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(read2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87772131494004, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogoutResponse.MediaBrowserCompat$ItemReceiver(this);
        onUncaughtException onuncaughtexception = (onUncaughtException) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (onuncaughtexception != null) {
            UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse2 = this.presenter;
            if (userLogoutResponse2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) onuncaughtexception, "it");
            onGetStartedClick.write((Object) onuncaughtexception, "initialDataDisplay");
            userLogoutResponse2.MediaMetadataCompat = onuncaughtexception.MediaMetadataCompat;
            List<onUncaughtException.IconCompatParcelizer> list = onuncaughtexception.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                for (onUncaughtException.IconCompatParcelizer iconCompatParcelizer : list) {
                    userLogoutResponse2.read.put(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.write);
                }
            }
            writeUInt64NoTag.IconCompatParcelizer userLogoutResponse$MediaBrowserCompat$MediaItem = new UserLogoutResponse$MediaBrowserCompat$MediaItem(onuncaughtexception);
            if (userLogoutResponse2.RatingCompat != null) {
                userLogoutResponse$MediaBrowserCompat$MediaItem.IconCompatParcelizer(userLogoutResponse2.RatingCompat);
            }
            writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new UserLogoutResponse.MediaDescriptionCompat(userLogoutResponse2);
            if (userLogoutResponse2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                mediaDescriptionCompat.IconCompatParcelizer(userLogoutResponse2.RatingCompat);
            }
        }
        return inflate;
    }

    @OnClick
    public final void confirmButtonClick() {
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (userLogoutResponse.RatingCompat != null) {
            userLogoutResponse.RatingCompat.AlertController$RecycleListView();
        }
        setCollapsedTitleTextColor setcollapsedtitletextcolor = userLogoutResponse.IconCompatParcelizer;
        setcollapsedtitletextcolor.write(setcollapsedtitletextcolor.MediaBrowserCompat$ItemReceiver(), new UserLogoutResponse$MediaBrowserCompat$CustomActionResultReceiver(userLogoutResponse));
    }

    private final void IconCompatParcelizer(onUncaughtException.MediaMetadataCompat mediaMetadataCompat) {
        CustomSeparatedViews customSeparatedViews = this.loanInfoInfoContainer;
        if (customSeparatedViews == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfoInfoContainer");
        }
        String string = getString(R.string.hml_business_owner_review_2_label_loan_purpose);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…iew_2_label_loan_purpose)");
        List singletonList = Collections.singletonList(new C3758xd990f62c(mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        RestrictedComponentContainer restrictedComponentContainer = new RestrictedComponentContainer(string, (String) null, singletonList);
        restrictedComponentContainer.MediaBrowserCompat$CustomActionResultReceiver = "hml";
        List singletonList2 = Collections.singletonList(restrictedComponentContainer);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList2, "java.util.Collections.singletonList(element)");
        customSeparatedViews.IconCompatParcelizer(singletonList2, R.layout.f84732131493700);
    }

    private final void write(onUncaughtException.write write2) {
        CustomSeparatedViews customSeparatedViews = this.incomeInfoContainer;
        if (customSeparatedViews == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeInfoContainer");
        }
        RestrictedComponentContainer[] restrictedComponentContainerArr = new RestrictedComponentContainer[2];
        String string = getString(R.string.hml_business_owner_review_2_label_monthly_income);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…w_2_label_monthly_income)");
        RestrictedComponentContainer restrictedComponentContainer = null;
        RestrictedComponentContainer restrictedComponentContainer2 = new RestrictedComponentContainer(string, write2.IconCompatParcelizer, (List<C3758xd990f62c>) null);
        restrictedComponentContainer2.MediaBrowserCompat$CustomActionResultReceiver = "hml";
        restrictedComponentContainerArr[0] = restrictedComponentContainer2;
        String str = write2.read;
        if (str != null) {
            String string2 = getString(R.string.hml_business_owner_review_2_label_source_of_income);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_b…2_label_source_of_income)");
            RestrictedComponentContainer restrictedComponentContainer3 = new RestrictedComponentContainer(string2, str, (List<C3758xd990f62c>) null);
            restrictedComponentContainer3.MediaBrowserCompat$CustomActionResultReceiver = "hml";
            restrictedComponentContainer = restrictedComponentContainer3;
        }
        restrictedComponentContainerArr[1] = restrictedComponentContainer;
        onGetStartedClick.write((Object) restrictedComponentContainerArr, "elements");
        onGetStartedClick.write((Object) restrictedComponentContainerArr, "$this$asList");
        List asList = Arrays.asList(restrictedComponentContainerArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        customSeparatedViews.IconCompatParcelizer(asList, R.layout.f84742131493701);
    }

    private final void read(List<String> list) {
        Context context = getContext();
        if (context != null) {
            CustomSeparatedViews customSeparatedViews = this.ownStoreInfoContainer;
            if (customSeparatedViews == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ownStoreInfoContainer");
            }
            Iterable<String> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (String customInfoItemWithImage : iterable) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                CustomInfoItemWithImage customInfoItemWithImage2 = new CustomInfoItemWithImage(context, new verifyMoneyGift$MediaBrowserCompat$CustomActionResultReceiver(), customInfoItemWithImage);
                FundFactSheetActivity fundFactSheetActivity = MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) fundFactSheetActivity, "block");
                TextView textView = customInfoItemWithImage2.tvRightText;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRightText");
                }
                fundFactSheetActivity.invoke(textView);
                arrayList.add(customInfoItemWithImage2);
            }
            customSeparatedViews.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList, R.layout.f84742131493701);
        }
    }

    private final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        Context context = getContext();
        if (context != null) {
            CustomSeparatedViews customSeparatedViews = this.storeOrProductInfoContainer;
            if (customSeparatedViews == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeOrProductInfoContainer");
            }
            Iterable<String> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (String customInfoItemWithImage : iterable) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                CustomInfoItemWithImage customInfoItemWithImage2 = new CustomInfoItemWithImage(context, new verifyMoneyGift$MediaBrowserCompat$CustomActionResultReceiver(), customInfoItemWithImage);
                FundFactSheetActivity fundFactSheetActivity = MediaDescriptionCompat.write;
                onGetStartedClick.write((Object) fundFactSheetActivity, "block");
                TextView textView = customInfoItemWithImage2.tvRightText;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRightText");
                }
                fundFactSheetActivity.invoke(textView);
                arrayList.add(customInfoItemWithImage2);
            }
            customSeparatedViews.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList, R.layout.f84742131493701);
        }
    }

    private final void write(List<onUncaughtException.IconCompatParcelizer> list) {
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity;
        Context context = getContext();
        if (context != null) {
            CustomSeparatedViews customSeparatedViews = this.consentsContainer;
            if (customSeparatedViews == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentsContainer");
            }
            Iterable<onUncaughtException.IconCompatParcelizer> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (onUncaughtException.IconCompatParcelizer iconCompatParcelizer : iterable) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "ctx");
                CustomAcceptDeclineButtons customAcceptDeclineButtons = new CustomAcceptDeclineButtons(context, context.getResources().getDimensionPixelSize(R.dimen.f72472131165407), context.getResources().getDimensionPixelSize(R.dimen.f72472131165407));
                this.MediaBrowserCompat$CustomActionResultReceiver.put(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, customAcceptDeclineButtons);
                int i2 = ActivityBuilder_BindFundRedeemReviewActivity.MediaBrowserCompat$ItemReceiver[iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
                if (i2 == 1) {
                    hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(R.string.hml_business_owner_review_2_model_consent_first), Integer.valueOf(R.string.hml_business_owner_review_2_model_consent_link));
                } else if (i2 != 2) {
                    hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(R.string.contact_info_terms_cond_begin), Integer.valueOf(R.string.contact_info_terms_cond_clickable));
                } else {
                    hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(Integer.valueOf(R.string.hml_review_cross_consent_not_clickable_initial), Integer.valueOf(R.string.hml_review_cross_consent_clickable));
                }
                String string = getString(((Number) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver).intValue());
                onGetStartedClick.IconCompatParcelizer((Object) string, "getString(stringPair.first)");
                String string2 = getString(((Number) hmlVerifyEmailSuccessfulActivity.write).intValue());
                onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(stringPair.second)");
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string2);
                SpannableString spannableString = new SpannableString(sb.toString());
                RatingCompat ratingCompat = new RatingCompat(customAcceptDeclineButtons, iconCompatParcelizer, this);
                int length = string.length();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(string2);
                spannableString.setSpan(ratingCompat, length, sb2.toString().length(), 0);
                TextView textView = customAcceptDeclineButtons.tvLabel;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
                }
                textView.setText(spannableString);
                TextView textView2 = customAcceptDeclineButtons.tvLabel;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
                }
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                TextView textView3 = customAcceptDeclineButtons.tvLabel;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
                }
                textView3.setHighlightColor(0);
                customAcceptDeclineButtons.setOnButtonClickListener(new C6020x8e0ec33d(iconCompatParcelizer, this));
                int i3 = ActivityBuilder_BindFundRedeemReviewActivity.read[iconCompatParcelizer.write.ordinal()];
                if (i3 == 2) {
                    customAcceptDeclineButtons.onAcceptClicked();
                } else if (i3 == 3) {
                    customAcceptDeclineButtons.onDeclineClicked();
                }
                arrayList.add(customAcceptDeclineButtons);
            }
            customSeparatedViews.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList, R.layout.f84752131493702);
        }
    }

    public static final class RatingCompat extends ClickableSpan {
        private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment IconCompatParcelizer;
        private /* synthetic */ onUncaughtException.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ CustomAcceptDeclineButtons write;

        RatingCompat(CustomAcceptDeclineButtons customAcceptDeclineButtons, onUncaughtException.IconCompatParcelizer iconCompatParcelizer, HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
            this.write = customAcceptDeclineButtons;
            this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
            this.IconCompatParcelizer = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
        }

        public final void onClick(View view) {
            onGetStartedClick.write((Object) view, "textView");
            UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.IconCompatParcelizer.presenter;
            if (userLogoutResponse == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            zzfe.zza zza = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) zza, "type");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new UserLogoutResponse.IconCompatParcelizer(zza);
            if (userLogoutResponse.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(userLogoutResponse.RatingCompat);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            onGetStartedClick.write((Object) textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            Context context = this.write.getContext();
            if (context != null) {
                textPaint.setColor(setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
            }
        }
    }

    public final void write(zzfe.zza zza, boolean z) {
        onGetStartedClick.write((Object) zza, "type");
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.MediaBrowserCompat$CustomActionResultReceiver.get(zza);
        if (customAcceptDeclineButtons == null) {
            return;
        }
        if (z) {
            customAcceptDeclineButtons.onAcceptClicked();
        } else {
            customAcceptDeclineButtons.onDeclineClicked();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzfe.zza zza) {
        onGetStartedClick.write((Object) zza, "type");
        Context context = getContext();
        if (context != null) {
            HmlConsentActivity.read read2 = HmlConsentActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            Intent write2 = HmlConsentActivity.read.write(context, zza, (immediateFailedFuture) null);
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
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 1002 && intent != null) {
            Serializable serializableExtra = intent.getSerializableExtra("HML_CONSENT_TYPE");
            if (!(serializableExtra instanceof zzfe.zza)) {
                serializableExtra = null;
            }
            zzfe.zza zza = (zzfe.zza) serializableExtra;
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_ACCEPTED", false);
            if (zza != null) {
                UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.presenter;
                if (userLogoutResponse == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) zza, "type");
                if (setExtraData.IconCompatParcelizer[zza.ordinal()] != 1) {
                    writeUInt64NoTag.IconCompatParcelizer read2 = new UserLogoutResponse.read(zza, booleanExtra);
                    if (userLogoutResponse.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        read2.IconCompatParcelizer(userLogoutResponse.RatingCompat);
                        return;
                    }
                    return;
                }
                writeUInt64NoTag.IconCompatParcelizer write2 = new UserLogoutResponse.write(booleanExtra);
                if (userLogoutResponse.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    write2.IconCompatParcelizer(userLogoutResponse.RatingCompat);
                }
            }
        } else if (i == 1200) {
            UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse2 = this.presenter;
            if (userLogoutResponse2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setExpandedTitleTypeface setexpandedtitletypeface = userLogoutResponse2.write;
            setexpandedtitletypeface.write(setexpandedtitletypeface.IconCompatParcelizer(), new UserLogoutResponse$MediaBrowserCompat$ItemReceiver(userLogoutResponse2));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        CheckBox checkBox = this.checkBoxTermsConditions;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("checkBoxTermsConditions");
        }
        checkBox.setChecked(z);
    }

    public final void write(boolean z) {
        Button button = this.confirmButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2, String str) {
        String str2;
        String str3;
        String str4;
        onUncaughtException.MediaDescriptionCompat mediaDescriptionCompat;
        onUncaughtException.MediaDescriptionCompat mediaDescriptionCompat2;
        onUncaughtException.MediaDescriptionCompat mediaDescriptionCompat3;
        onGetStartedClick.write((Object) str, "applicationUuid");
        Context context = getContext();
        if (context != null) {
            HmlEtbSubmissionOtpActivity.write write2 = HmlEtbSubmissionOtpActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            String str5 = (String) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
            onUncaughtException onuncaughtexception = (onUncaughtException) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (onuncaughtexception == null || (mediaDescriptionCompat3 = onuncaughtexception.MediaBrowserCompat$SearchResultReceiver) == null) {
                str2 = null;
            } else {
                str2 = mediaDescriptionCompat3.IconCompatParcelizer;
            }
            onUncaughtException onuncaughtexception2 = (onUncaughtException) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (onuncaughtexception2 == null || (mediaDescriptionCompat2 = onuncaughtexception2.MediaBrowserCompat$SearchResultReceiver) == null) {
                str3 = null;
            } else {
                str3 = mediaDescriptionCompat2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            onUncaughtException onuncaughtexception3 = (onUncaughtException) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (onuncaughtexception3 == null || (mediaDescriptionCompat = onuncaughtexception3.MediaBrowserCompat$SearchResultReceiver) == null) {
                str4 = null;
            } else {
                str4 = mediaDescriptionCompat.write;
            }
            Intent MediaBrowserCompat$ItemReceiver = HmlEtbSubmissionOtpActivity.write.MediaBrowserCompat$ItemReceiver(context, Boolean.valueOf(z), Boolean.valueOf(z2), (Boolean) null, str, str5, str2, str3, str4);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(MediaBrowserCompat$ItemReceiver, 1200);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "principalAmount");
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb"), new ZSYR2K("loan_type", "business_owner"), new ZSYR2K("product_type", str), new ZSYR2K("product_application_amount", str2)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_etb_otp", zsyr2kArr);
        }
    }

    public final void onDestroyView() {
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogoutResponse.onDestroy();
        super.onDestroyView();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<String> {
        private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
            super(0);
            this.read = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            r0 = r0.getString("INTENT_VALUE", "");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r3 = this;
                com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment r0 = r3.read
                android.os.Bundle r0 = r0.getArguments()
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0013
                java.lang.String r2 = "INTENT_VALUE"
                java.lang.String r0 = r0.getString(r2, r1)
                if (r0 == 0) goto L_0x0013
                r1 = r0
            L_0x0013:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment.read.invoke():java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0334  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.onUncaughtException r15) {
        /*
            r14 = this;
            java.lang.String r0 = "display"
            p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r0)
            o.onUncaughtException$MediaBrowserCompat$ItemReceiver r0 = r15.write
            com.scb.phone.view.custom.easycash.CustomSeparatedViews r1 = r14.businessInfoContainer
            if (r1 != 0) goto L_0x0010
            java.lang.String r2 = "businessInfoContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0010:
            r2 = 8
            o.RestrictedComponentContainer[] r3 = new p040o.RestrictedComponentContainer[r2]
            r4 = 2131757916(0x7f100b5c, float:1.9146781E38)
            java.lang.String r4 = r14.getString(r4)
            java.lang.String r5 = "getString(R.string.hml_b…label_business_info_name)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r5)
            java.lang.String r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r6 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r6.<init>((java.lang.String) r5)
            java.util.List r5 = java.util.Collections.singletonList(r6)
            java.lang.String r6 = "java.util.Collections.singletonList(element)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r6)
            o.RestrictedComponentContainer r7 = new o.RestrictedComponentContainer
            r8 = 0
            r7.<init>(r4, r8, r5)
            java.lang.String r4 = "hml"
            r7.MediaBrowserCompat$CustomActionResultReceiver = r4
            r5 = 0
            r3[r5] = r7
            r7 = 2131757917(0x7f100b5d, float:1.9146783E38)
            java.lang.String r7 = r14.getString(r7)
            java.lang.String r9 = "getString(R.string.hml_b…bel_business_info_number)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r9)
            java.lang.String r9 = r0.MediaBrowserCompat$ItemReceiver
            o.RestrictedComponentContainer r10 = new o.RestrictedComponentContainer
            r10.<init>(r7, r9, r8)
            r10.MediaBrowserCompat$CustomActionResultReceiver = r4
            r7 = 1
            r3[r7] = r10
            r9 = 2131757922(0x7f100b62, float:1.9146793E38)
            java.lang.String r9 = r14.getString(r9)
            java.lang.String r10 = "getString(R.string.hml_b…abel_business_info_years)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            java.lang.String r10 = r0.read
            java.lang.String r11 = r0.RatingCompat
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r5] = r11
            r13[r7] = r10
            r10 = 2131757923(0x7f100b63, float:1.9146795E38)
            java.lang.String r10 = r14.getString(r10, r13)
            java.lang.String r11 = "getString(R.string.hml_b…rs_format, years, months)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r11)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r11 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r11.<init>((java.lang.String) r10)
            java.util.List r10 = java.util.Collections.singletonList(r11)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r6)
            o.RestrictedComponentContainer r11 = new o.RestrictedComponentContainer
            r11.<init>(r9, r8, r10)
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
            r3[r12] = r11
            r9 = 2131757915(0x7f100b5b, float:1.914678E38)
            java.lang.String r9 = r14.getString(r9)
            java.lang.String r10 = "getString(R.string.hml_b…l_business_info_industry)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            java.lang.String r10 = r0.IconCompatParcelizer
            r11 = 3
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r12 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r12.<init>((java.lang.String) r10)
            java.util.List r10 = java.util.Collections.singletonList(r12)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r6)
            o.RestrictedComponentContainer r12 = new o.RestrictedComponentContainer
            r12.<init>(r9, r8, r10)
            r12.MediaBrowserCompat$CustomActionResultReceiver = r4
            r3[r11] = r12
            r9 = 2131757921(0x7f100b61, float:1.9146791E38)
            java.lang.String r9 = r14.getString(r9)
            java.lang.String r10 = "getString(R.string.hml_b…label_business_info_type)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            java.lang.String r10 = r0.MediaBrowserCompat$SearchResultReceiver
            r11 = 4
            o.RestrictedComponentContainer r12 = new o.RestrictedComponentContainer
            r12.<init>(r9, r10, r8)
            r12.MediaBrowserCompat$CustomActionResultReceiver = r4
            r3[r11] = r12
            java.lang.String r9 = r0.MediaMetadataCompat
            if (r9 == 0) goto L_0x00fe
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00d8
            r10 = r7
            goto L_0x00d9
        L_0x00d8:
            r10 = r5
        L_0x00d9:
            if (r10 != 0) goto L_0x00dc
            r9 = r8
        L_0x00dc:
            if (r9 == 0) goto L_0x00fe
            r10 = 2131757919(0x7f100b5f, float:1.9146787E38)
            java.lang.String r10 = r14.getString(r10)
            java.lang.String r11 = "getString(R.string.hml_b…info_registration_number)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r11)
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r11 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r11.<init>((java.lang.String) r9)
            java.util.List r9 = java.util.Collections.singletonList(r11)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r6)
            o.RestrictedComponentContainer r11 = new o.RestrictedComponentContainer
            r11.<init>(r10, r8, r9)
            r11.MediaBrowserCompat$CustomActionResultReceiver = r4
            goto L_0x00ff
        L_0x00fe:
            r11 = r8
        L_0x00ff:
            r9 = 5
            r3[r9] = r11
            r9 = 2131757920(0x7f100b60, float:1.914679E38)
            java.lang.String r9 = r14.getString(r9)
            java.lang.String r10 = "getString(R.string.hml_b…business_info_store_type)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            java.lang.String r10 = r0.MediaDescriptionCompat
            r11 = 6
            o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver r12 = new o.RestrictedComponentContainer$MediaBrowserCompat$CustomActionResultReceiver
            r12.<init>((java.lang.String) r10)
            java.util.List r10 = java.util.Collections.singletonList(r12)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r6)
            o.RestrictedComponentContainer r6 = new o.RestrictedComponentContainer
            r6.<init>(r9, r8, r10)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r4
            r3[r11] = r6
            java.lang.Boolean r0 = r0.write
            if (r0 == 0) goto L_0x0158
            boolean r0 = r0.booleanValue()
            r6 = 2131757918(0x7f100b5e, float:1.9146785E38)
            java.lang.String r6 = r14.getString(r6)
            java.lang.String r9 = "getString(R.string.hml_b…el_business_info_premise)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r9)
            if (r0 == 0) goto L_0x0144
            r0 = 2131757978(0x7f100b9a, float:1.9146907E38)
            java.lang.String r0 = r14.getString(r0)
            goto L_0x014b
        L_0x0144:
            r0 = 2131757977(0x7f100b99, float:1.9146905E38)
            java.lang.String r0 = r14.getString(r0)
        L_0x014b:
            java.lang.String r9 = "if (info) {\n            …                        }"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r9)
            o.RestrictedComponentContainer r9 = new o.RestrictedComponentContainer
            r9.<init>(r6, r0, r8)
            r9.MediaBrowserCompat$CustomActionResultReceiver = r4
            r8 = r9
        L_0x0158:
            r0 = 7
            r3[r0] = r8
            java.util.List r0 = p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)
            com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$IconCompatParcelizer r3 = com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment.IconCompatParcelizer.read
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            java.lang.String r4 = "$this$removeAll"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            java.lang.String r4 = "predicate"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r4)
            p040o.HmlNTBEkycNdidLandingActivity.read(r0, r3)
            r3 = 2131493701(0x7f0c0345, float:1.861089E38)
            r1.IconCompatParcelizer(r0, r3)
            o.onUncaughtException$MediaBrowserCompat$CustomActionResultReceiver r0 = r15.MediaBrowserCompat$CustomActionResultReceiver
            android.content.Context r1 = r14.getContext()
            if (r1 == 0) goto L_0x01eb
            com.scb.phone.view.custom.easycash.CustomSeparatedViews r4 = r14.bankAccountsInfoContainer
            if (r4 != 0) goto L_0x0187
            java.lang.String r6 = "bankAccountsInfoContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0187:
            java.util.List<o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String>> r0 = r0.write
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            java.lang.String r9 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r9)
            boolean r9 = r0 instanceof java.util.Collection
            if (r9 == 0) goto L_0x019f
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
        L_0x019f:
            r6.<init>(r8)
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r0 = r0.iterator()
        L_0x01a8:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x01e6
            java.lang.Object r8 = r0.next()
            o.HmlVerifyEmailSuccessfulActivity r8 = (p040o.HmlVerifyEmailSuccessfulActivity) r8
            java.lang.String r9 = "context"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r9)
            com.scb.phone.view.custom.common.CustomInfoItemWithImage r9 = new com.scb.phone.view.custom.common.CustomInfoItemWithImage
            o.verifyMoneyGift$IconCompatParcelizer r10 = new o.verifyMoneyGift$IconCompatParcelizer
            A r11 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = (java.lang.String) r11
            r10.<init>(r11)
            o.verifyMoneyGift r10 = (p040o.verifyMoneyGift) r10
            B r8 = r8.write
            java.lang.String r8 = (java.lang.String) r8
            r9.<init>((android.content.Context) r1, (p040o.verifyMoneyGift) r10, (java.lang.String) r8)
            com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$write r8 = com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment.write.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r8 = (p040o.FundFactSheetActivity) r8
            java.lang.String r10 = "block"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r10)
            android.widget.TextView r10 = r9.tvRightText
            if (r10 != 0) goto L_0x01df
            java.lang.String r11 = "tvRightText"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r11)
        L_0x01df:
            r8.invoke(r10)
            r6.add(r9)
            goto L_0x01a8
        L_0x01e6:
            java.util.List r6 = (java.util.List) r6
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r3)
        L_0x01eb:
            o.onUncaughtException$MediaMetadataCompat r0 = r15.read
            r14.IconCompatParcelizer((p040o.onUncaughtException.MediaMetadataCompat) r0)
            o.onUncaughtException$write r0 = r15.IconCompatParcelizer
            r14.write((p040o.onUncaughtException.write) r0)
            o.onUncaughtException$MediaBrowserCompat$SearchResultReceiver r0 = r15.MediaDescriptionCompat
            int r0 = r0.MediaBrowserCompat$ItemReceiver
            android.view.View r1 = r14.uploadedDocumentsContainer
            if (r1 != 0) goto L_0x0202
            java.lang.String r3 = "uploadedDocumentsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0202:
            if (r0 <= 0) goto L_0x0206
            r3 = r7
            goto L_0x0207
        L_0x0206:
            r3 = r5
        L_0x0207:
            java.lang.String r4 = "$this$isVisible"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            if (r3 == 0) goto L_0x0210
            r3 = r5
            goto L_0x0211
        L_0x0210:
            r3 = r2
        L_0x0211:
            r1.setVisibility(r3)
            if (r0 <= 0) goto L_0x0233
            android.widget.TextView r1 = r14.tvFilesAttached
            if (r1 != 0) goto L_0x021f
            java.lang.String r3 = "tvFilesAttached"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x021f:
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r5] = r0
            r0 = 2131757925(0x7f100b65, float:1.91468E38)
            java.lang.String r0 = r14.getString(r0, r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0233:
            o.onUncaughtException$RatingCompat r0 = r15.MediaBrowserCompat$MediaItem
            java.util.List<java.lang.String> r0 = r0.IconCompatParcelizer
            if (r0 == 0) goto L_0x0246
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x0246
            r14.read(r0)
        L_0x0246:
            android.view.View r0 = r14.ownStoreHeader
            if (r0 != 0) goto L_0x024f
            java.lang.String r1 = "ownStoreHeader"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x024f:
            o.onUncaughtException$RatingCompat r1 = r15.MediaBrowserCompat$MediaItem
            java.util.List<java.lang.String> r1 = r1.IconCompatParcelizer
            if (r1 != 0) goto L_0x0259
            o.HmlNationalIdActivity r1 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r1 = (java.util.List) r1
        L_0x0259:
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r7
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            if (r1 == 0) goto L_0x0267
            r1 = r5
            goto L_0x0268
        L_0x0267:
            r1 = r2
        L_0x0268:
            r0.setVisibility(r1)
            o.onUncaughtException$RatingCompat r0 = r15.MediaBrowserCompat$MediaItem
            java.util.List<java.lang.String> r0 = r0.read
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x027c
            r14.MediaBrowserCompat$ItemReceiver((java.util.List<java.lang.String>) r0)
        L_0x027c:
            android.view.View r0 = r14.storeOrProductHeader
            if (r0 != 0) goto L_0x0285
            java.lang.String r3 = "storeOrProductHeader"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0285:
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r7
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            if (r1 == 0) goto L_0x0291
            r1 = r5
            goto L_0x0292
        L_0x0291:
            r1 = r2
        L_0x0292:
            r0.setVisibility(r1)
            o.onUncaughtException$MediaBrowserCompat$MediaItem r0 = r15.RatingCompat
            r1 = 2131758448(0x7f100d70, float:1.914786E38)
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "getString(R.string.hml_r…ns_not_clickable_initial)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r3)
            r3 = 2131758447(0x7f100d6f, float:1.9147858E38)
            java.lang.String r3 = r14.getString(r3)
            java.lang.String r6 = "getString(R.string.hml_r…and_conditions_clickable)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r8.<init>(r6)
            com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaSessionCompat$QueueItem r6 = new com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaSessionCompat$QueueItem
            r6.<init>(r14)
            int r9 = r1.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r3)
            java.lang.String r1 = r10.toString()
            int r1 = r1.length()
            r8.setSpan(r6, r9, r1, r5)
            android.widget.TextView r1 = r14.textViewTermsConditions
            java.lang.String r3 = "textViewTermsConditions"
            if (r1 != 0) goto L_0x02ed
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x02ed:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1.setText(r8)
            android.widget.TextView r1 = r14.textViewTermsConditions
            if (r1 != 0) goto L_0x02f9
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x02f9:
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r6)
            android.widget.TextView r1 = r14.textViewTermsConditions
            if (r1 != 0) goto L_0x0307
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0307:
            r1.setHighlightColor(r5)
            android.widget.CheckBox r1 = r14.checkBoxTermsConditions
            java.lang.String r3 = "checkBoxTermsConditions"
            if (r1 != 0) goto L_0x0313
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0313:
            com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$SearchResultReceiver r6 = new com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$SearchResultReceiver
            r6.<init>(r14)
            android.widget.CompoundButton$OnCheckedChangeListener r6 = (android.widget.CompoundButton.OnCheckedChangeListener) r6
            r1.setOnCheckedChangeListener(r6)
            android.widget.CheckBox r1 = r14.checkBoxTermsConditions
            if (r1 != 0) goto L_0x0324
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0324:
            boolean r0 = r0.write
            r1.setChecked(r0)
            java.util.List<o.onUncaughtException$IconCompatParcelizer> r0 = r15.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0330
            r14.write((java.util.List<p040o.onUncaughtException.IconCompatParcelizer>) r0)
        L_0x0330:
            android.view.View r0 = r14.consentSection
            if (r0 != 0) goto L_0x0339
            java.lang.String r1 = "consentSection"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0339:
            java.util.List<o.onUncaughtException$IconCompatParcelizer> r15 = r15.MediaBrowserCompat$ItemReceiver
            if (r15 != 0) goto L_0x0341
            o.HmlNationalIdActivity r15 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r15 = (java.util.List) r15
        L_0x0341:
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ r7
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            if (r15 == 0) goto L_0x034e
            r2 = r5
        L_0x034e:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment.IconCompatParcelizer(o.onUncaughtException):void");
    }
}
