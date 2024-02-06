package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.remittance.RemittanceReviewActivity;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.TintInputViewGroup;
import com.scb.phone.view.custom.common.TintNoteEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.regex.Pattern;
import p040o.BaseDiscoverFundFilterActivity;
import p040o.C10068nJ;
import p040o.C10073nW;
import p040o.C3092xce3d994b;
import p040o.C5010nK;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.ImmutableListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.nK$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;
import p040o.setImportance;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeObject;

public final class RemittanceRecipientDetailFragment extends BaseFragment implements ServerProjectProvider.C70611 {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    /* access modifiers changed from: private */
    public CustomInputDialog IconCompatParcelizer;
    private final RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem MediaBrowserCompat$MediaItem = new RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem(this);
    private final BaseDiscoverFundFilterActivity<View, Boolean, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$SearchResultReceiver = new MediaMetadataCompat(this);
    private final CustomEditText.IconCompatParcelizer MediaDescriptionCompat = new MediaDescriptionCompat(this);
    private final read MediaMetadataCompat = new read(this);
    private final HmlVerifyEmailActivity ParcelableVolumeInfo;
    private final TextView.OnEditorActionListener RatingCompat = new RatingCompat(this);
    @BindView
    public Button btAction;
    @BindView
    public CustomEditText etCountryCode;
    @BindView
    public TintNoteEditText etNote;
    @BindView
    public CustomEditText etPhoneNumber;
    @BindView
    public TintInputViewGroup ivgAccountNumber;
    @BindView
    public TintInputViewGroup ivgAddress;
    @BindView
    public TintInputViewGroup ivgBankCode;
    @BindView
    public TintInputViewGroup ivgCity;
    @BindView
    public TintInputViewGroup ivgEmail;
    @BindView
    public TintInputViewGroup ivgFirstName;
    @BindView
    public TintInputViewGroup ivgIdentificationNumber;
    @BindView
    public TintInputViewGroup ivgLastName;
    @BindView
    public TintInputViewGroup ivgNationality;
    @BindView
    public TintInputViewGroup ivgPostcode;
    @BindView
    public TintInputViewGroup ivgReceivingBank;
    @BindView
    public TintInputViewGroup ivgState;
    @BindView
    public TintInputViewGroup ivgSwiftCode;
    @BindView
    public LinearLayout llAddressViewsContainer;
    @BindView
    public LinearLayout llBankViewsContainer;
    @BindView
    public LinearLayout llContactDetailViewsContainer;
    @BindView
    public LinearLayout llContainer;
    @BindView
    public LinearLayout llPersonalDetailViewsContainer;
    @BindView
    public LinearLayout llTransactionDetailViewsContainer;
    @HmlPinActivity
    public C5010nK presenter;
    @BindView
    public CustomSpinnerWithTitle swtAccountType;
    @BindView
    public CustomSpinnerWithTitle swtIdentificationType;
    @BindView
    public CustomSpinnerWithTitle swtPurpose;
    @BindView
    public CustomSpinnerWithTitle swtTitle;
    @BindView
    public TextView tvContactNumberTitle;

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<View, Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ RemittanceRecipientDetailFragment MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
            super(2);
            this.MediaBrowserCompat$ItemReceiver = remittanceRecipientDetailFragment;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            View view = (View) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            if (view.getId() == R.id.note || booleanValue) {
                ViewParent parent = view.getParent();
                if (parent instanceof TintInputViewGroup) {
                    TintInputViewGroup tintInputViewGroup = (TintInputViewGroup) parent;
                    if (tintInputViewGroup.getId() == R.id.ivg_email) {
                        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
                        tintInputViewGroup.mErrorTextView.setVisibility(8);
                    }
                }
                if (parent instanceof TintNoteEditText) {
                    TintNoteEditText tintNoteEditText = (TintNoteEditText) parent;
                    tintNoteEditText.mErrorText.setVisibility(8);
                    tintNoteEditText.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(tintNoteEditText.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
                }
            } else {
                RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public RemittanceRecipientDetailFragment() {
        FundActionsSuccessActivity remittanceRecipientDetailFragment$PlaybackStateCompat$CustomAction = new C6159xef604d1b(this);
        onGetStartedClick.write((Object) remittanceRecipientDetailFragment$PlaybackStateCompat$CustomAction, "initializer");
        this.ParcelableVolumeInfo = new HmlVerifyPhoneTermsConditionsActivity(remittanceRecipientDetailFragment$PlaybackStateCompat$CustomAction);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static RemittanceRecipientDetailFragment MediaBrowserCompat$ItemReceiver(C3092xce3d994b.Builder builder, C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame) {
            onGetStartedClick.write((Object) builder, "state");
            RemittanceRecipientDetailFragment remittanceRecipientDetailFragment = new RemittanceRecipientDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("STATE", builder.ordinal());
            bundle.putParcelable("display", autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame);
            remittanceRecipientDetailFragment.setArguments(bundle);
            return remittanceRecipientDetailFragment;
        }
    }

    static final class RatingCompat implements TextView.OnEditorActionListener {
        private /* synthetic */ RemittanceRecipientDetailFragment MediaBrowserCompat$CustomActionResultReceiver;

        RatingCompat(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = remittanceRecipientDetailFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return true;
            }
            RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            return false;
        }
    }

    static final class MediaDescriptionCompat implements CustomEditText.IconCompatParcelizer {
        private /* synthetic */ RemittanceRecipientDetailFragment read;

        MediaDescriptionCompat(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
            this.read = remittanceRecipientDetailFragment;
        }

        public final boolean IconCompatParcelizer(CustomEditText customEditText, String str) {
            customEditText.setText(str);
            RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            return true;
        }
    }

    public static final class read implements TextWatcher {
        private /* synthetic */ RemittanceRecipientDetailFragment write;

        public final void afterTextChanged(Editable editable) {
            onGetStartedClick.write((Object) editable, "s");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            onGetStartedClick.write((Object) charSequence, "s");
        }

        read(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
            this.write = remittanceRecipientDetailFragment;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            onGetStartedClick.write((Object) charSequence, "s");
            CustomInputDialog MediaBrowserCompat$ItemReceiver = this.write.IconCompatParcelizer;
            if (MediaBrowserCompat$ItemReceiver == null || (str = String.valueOf(MediaBrowserCompat$ItemReceiver.mEditTextView.getText())) == null) {
                str = "";
            }
            if (!Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(str).matches()) {
                CustomInputDialog MediaBrowserCompat$ItemReceiver2 = this.write.IconCompatParcelizer;
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    String string = this.write.getString(R.string.favorite_invalid_character);
                    MediaBrowserCompat$ItemReceiver2.mErrorTextView.setVisibility(0);
                    MediaBrowserCompat$ItemReceiver2.mErrorTextView.setText(string);
                }
                CustomInputDialog MediaBrowserCompat$ItemReceiver3 = this.write.IconCompatParcelizer;
                if (MediaBrowserCompat$ItemReceiver3 != null) {
                    MediaBrowserCompat$ItemReceiver3.mPositiveButton.setEnabled(false);
                    return;
                }
                return;
            }
            CustomInputDialog MediaBrowserCompat$ItemReceiver4 = this.write.IconCompatParcelizer;
            if (MediaBrowserCompat$ItemReceiver4 != null) {
                MediaBrowserCompat$ItemReceiver4.mErrorTextView.setVisibility(8);
            }
            CustomInputDialog MediaBrowserCompat$ItemReceiver5 = this.write.IconCompatParcelizer;
            if (MediaBrowserCompat$ItemReceiver5 != null) {
                MediaBrowserCompat$ItemReceiver5.mPositiveButton.setEnabled(true);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89432131494170, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [o.ActivityBuilder_ContributePrepaidMarketConductActivity] */
    /* JADX WARNING: type inference failed for: r5v6, types: [o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity] */
    /* JADX WARNING: type inference failed for: r5v7, types: [o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "view"
            r2 = r18
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r1)
            super.onViewCreated(r18, r19)
            o.nK r1 = r0.presenter
            java.lang.String r2 = "presenter"
            if (r1 != 0) goto L_0x0015
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0015:
            r3 = r0
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r3 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r3
            r1.MediaBrowserCompat$ItemReceiver(r3)
            android.os.Bundle r1 = r17.getArguments()
            java.lang.String r3 = "etNote"
            java.lang.String r4 = "ivgBankCode"
            java.lang.String r5 = "ivgReceivingBank"
            java.lang.String r6 = "swtAccountType"
            java.lang.String r7 = "ivgSwiftCode"
            java.lang.String r8 = "ivgAccountNumber"
            if (r1 == 0) goto L_0x03c9
            java.lang.String r10 = "display"
            android.os.Parcelable r1 = r1.getParcelable(r10)
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r1 = (p040o.C3092xce3d994b) r1
            if (r1 == 0) goto L_0x03c9
            java.lang.String r11 = "arguments\n              …                ?: return"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r11)
            o.nK r11 = r0.presenter
            if (r11 != 0) goto L_0x0043
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0043:
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r10)
            r11.write = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            o.setCode r10 = r1.setContentView
            r12 = 0
            if (r10 == 0) goto L_0x008c
            com.scb.phone.view.custom.common.TintInputViewGroup r13 = r0.ivgReceivingBank
            if (r13 != 0) goto L_0x005b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x005b:
            boolean r14 = r10.write
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            r2.add(r15)
            o.HmlVerifyPhoneValidateOtpActivity r15 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r14 == 0) goto L_0x006a
            r14 = r12
            goto L_0x006c
        L_0x006a:
            r14 = 8
        L_0x006c:
            r13.setVisibility(r14)
            com.scb.phone.view.custom.common.TintInputViewGroup r13 = r0.ivgReceivingBank
            if (r13 != 0) goto L_0x0076
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0076:
            android.view.View r13 = (android.view.View) r13
            int r14 = r13.getVisibility()
            if (r14 == 0) goto L_0x007f
            r13 = 0
        L_0x007f:
            com.scb.phone.view.custom.common.TintInputViewGroup r13 = (com.scb.phone.view.custom.common.TintInputViewGroup) r13
            if (r13 == 0) goto L_0x0088
            java.lang.String r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r13.setText(r10)
        L_0x0088:
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x008c:
            o.setAddress r10 = r1.MediaBrowserCompat$ItemReceiver
            r13 = 1
            if (r10 == 0) goto L_0x00f7
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r14 = r0.swtAccountType
            if (r14 != 0) goto L_0x0098
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0098:
            boolean r15 = r10.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r15)
            r2.add(r9)
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r15 == 0) goto L_0x00a7
            r9 = r12
            goto L_0x00a9
        L_0x00a7:
            r9 = 8
        L_0x00a9:
            r14.setVisibility(r9)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r9 = r0.swtAccountType
            if (r9 != 0) goto L_0x00b3
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x00b3:
            android.view.View r9 = (android.view.View) r9
            int r14 = r9.getVisibility()
            if (r14 == 0) goto L_0x00bc
            r9 = 0
        L_0x00bc:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r9 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r9
            if (r9 == 0) goto L_0x00c7
            java.util.List<java.lang.String> r14 = r10.MediaBrowserCompat$ItemReceiver
            r9.setItemsWithPlaceholder(r14, r13, r12)
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00c7:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r9 = r0.swtAccountType
            if (r9 != 0) goto L_0x00ce
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x00ce:
            android.view.View r9 = (android.view.View) r9
            int r14 = r9.getVisibility()
            if (r14 == 0) goto L_0x00d7
            r9 = 0
        L_0x00d7:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r9 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r9
            if (r9 == 0) goto L_0x00f3
            java.util.List<java.lang.String> r14 = r10.MediaBrowserCompat$ItemReceiver
            if (r14 == 0) goto L_0x00ef
            java.lang.String r10 = r10.read
            java.lang.String r15 = "$this$indexOf"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r15)
            int r10 = r14.indexOf(r10)
            int r10 = r10 + r13
            r9.setSelectionIndex(r10)
            goto L_0x00f3
        L_0x00ef:
            r16 = r4
            goto L_0x03ae
        L_0x00f3:
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00f7:
            o.setCode r9 = r1.MediaDescriptionCompat
            if (r9 == 0) goto L_0x0133
            com.scb.phone.view.custom.common.TintInputViewGroup r10 = r0.ivgBankCode
            if (r10 != 0) goto L_0x0102
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0102:
            boolean r14 = r9.write
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            r2.add(r15)
            o.HmlVerifyPhoneValidateOtpActivity r15 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r14 == 0) goto L_0x0111
            r14 = r12
            goto L_0x0113
        L_0x0111:
            r14 = 8
        L_0x0113:
            r10.setVisibility(r14)
            com.scb.phone.view.custom.common.TintInputViewGroup r10 = r0.ivgBankCode
            if (r10 != 0) goto L_0x011d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x011d:
            android.view.View r10 = (android.view.View) r10
            int r14 = r10.getVisibility()
            if (r14 == 0) goto L_0x0126
            r10 = 0
        L_0x0126:
            com.scb.phone.view.custom.common.TintInputViewGroup r10 = (com.scb.phone.view.custom.common.TintInputViewGroup) r10
            if (r10 == 0) goto L_0x012f
            java.lang.String r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            r10.setText(r9)
        L_0x012f:
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0133:
            o.setCode r9 = r1.IconCompatParcelizer
            java.lang.String r15 = " ("
            r12 = 2131760476(0x7f10155c, float:1.9151974E38)
            if (r9 == 0) goto L_0x0238
            com.scb.phone.view.custom.common.TintInputViewGroup r14 = r0.ivgAccountNumber
            if (r14 != 0) goto L_0x0143
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0143:
            boolean r11 = r9.write
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            r2.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x0152
            r10 = 0
            goto L_0x0154
        L_0x0152:
            r10 = 8
        L_0x0154:
            r14.setVisibility(r10)
            java.lang.String r10 = r9.MediaBrowserCompat$ItemReceiver
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0165
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0165
            r10 = 0
            goto L_0x0166
        L_0x0165:
            r10 = r13
        L_0x0166:
            if (r10 == 0) goto L_0x016d
            java.lang.String r10 = r0.getString(r12)
            goto L_0x016f
        L_0x016d:
            java.lang.String r10 = r9.MediaBrowserCompat$ItemReceiver
        L_0x016f:
            java.util.List<java.lang.String> r11 = r9.read
            if (r11 == 0) goto L_0x01d0
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r13
            if (r11 != r13) goto L_0x01d0
            java.util.List<java.lang.String> r11 = r9.read
            if (r11 == 0) goto L_0x01a2
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r13 = 32
            r14.append(r13)
            r16 = r4
            r12 = 2131760509(0x7f10157d, float:1.915204E38)
            java.lang.String r4 = r0.getString(r12)
            r14.append(r4)
            r14.append(r13)
            java.lang.String r4 = r14.toString()
            java.lang.String r4 = p040o.AlertController$RecycleListView.write((java.util.List<java.lang.String>) r11, (java.lang.String) r4)
            goto L_0x01a7
        L_0x01a2:
            r16 = r4
            r13 = 32
            r4 = 0
        L_0x01a7:
            if (r4 == 0) goto L_0x01d2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r15)
            r11.append(r4)
            r11.append(r13)
            r4 = 2131760486(0x7f101566, float:1.9151994E38)
            java.lang.String r12 = r0.getString(r4)
            r11.append(r12)
            r4 = 41
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            o.HmlVerifyPhoneValidateOtpActivity r11 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            goto L_0x01d3
        L_0x01d0:
            r16 = r4
        L_0x01d2:
            r4 = r10
        L_0x01d3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = 2131760495(0x7f10156f, float:1.9152012E38)
            java.lang.String r13 = r0.getString(r12)
            r11.append(r13)
            r12 = 32
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.scb.phone.view.custom.common.TintInputViewGroup r11 = r0.ivgAccountNumber
            if (r11 != 0) goto L_0x01f5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x01f5:
            r11.setTitle(r4)
            com.scb.phone.view.custom.common.TintInputViewGroup r4 = r0.ivgAccountNumber
            if (r4 != 0) goto L_0x01ff
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x01ff:
            r4.setHint(r10)
            com.scb.phone.view.custom.common.TintInputViewGroup r4 = r0.ivgAccountNumber
            if (r4 != 0) goto L_0x0209
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0209:
            android.view.View r4 = (android.view.View) r4
            int r10 = r4.getVisibility()
            if (r10 == 0) goto L_0x0212
            r4 = 0
        L_0x0212:
            com.scb.phone.view.custom.common.TintInputViewGroup r4 = (com.scb.phone.view.custom.common.TintInputViewGroup) r4
            if (r4 == 0) goto L_0x021b
            java.lang.String r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            r4.setText(r9)
        L_0x021b:
            com.scb.phone.view.custom.common.TintInputViewGroup r4 = r0.ivgAccountNumber
            if (r4 != 0) goto L_0x0222
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0222:
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$QueueItem r9 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$QueueItem
            r9.<init>(r0)
            android.text.TextWatcher r9 = (android.text.TextWatcher) r9
            com.scb.phone.view.custom.common.CustomEditText r10 = r4.mEditText
            r10.addTextChangedListener(r9)
            java.util.ArrayList<android.text.TextWatcher> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r4.add(r9)
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            goto L_0x023a
        L_0x0238:
            r16 = r4
        L_0x023a:
            o.setCode r4 = r1.setExpandedFormat
            if (r4 == 0) goto L_0x033d
            com.scb.phone.view.custom.common.TintInputViewGroup r9 = r0.ivgSwiftCode
            if (r9 != 0) goto L_0x0245
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0245:
            boolean r10 = r4.write
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            r2.add(r11)
            o.HmlVerifyPhoneValidateOtpActivity r11 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x0254
            r10 = 0
            goto L_0x0256
        L_0x0254:
            r10 = 8
        L_0x0256:
            r9.setVisibility(r10)
            java.lang.String r9 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x0267
            int r9 = r9.length()
            if (r9 == 0) goto L_0x0267
            r9 = 0
            goto L_0x0268
        L_0x0267:
            r9 = 1
        L_0x0268:
            if (r9 == 0) goto L_0x0272
            r9 = 2131760476(0x7f10155c, float:1.9151974E38)
            java.lang.String r9 = r0.getString(r9)
            goto L_0x0274
        L_0x0272:
            java.lang.String r9 = r4.MediaBrowserCompat$ItemReceiver
        L_0x0274:
            java.util.List<java.lang.String> r10 = r4.read
            if (r10 == 0) goto L_0x02d2
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r11 = 1
            r10 = r10 ^ r11
            if (r10 != r11) goto L_0x02d3
            java.util.List<java.lang.String> r10 = r4.read
            if (r10 == 0) goto L_0x02a6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 32
            r12.append(r13)
            r14 = 2131760509(0x7f10157d, float:1.915204E38)
            java.lang.String r14 = r0.getString(r14)
            r12.append(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r10 = p040o.AlertController$RecycleListView.write((java.util.List<java.lang.String>) r10, (java.lang.String) r12)
            goto L_0x02a9
        L_0x02a6:
            r13 = 32
            r10 = 0
        L_0x02a9:
            if (r10 == 0) goto L_0x02d3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r15)
            r12.append(r10)
            r12.append(r13)
            r10 = 2131760486(0x7f101566, float:1.9151994E38)
            java.lang.String r10 = r0.getString(r10)
            r12.append(r10)
            r10 = 41
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            o.HmlVerifyPhoneValidateOtpActivity r12 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            goto L_0x02d4
        L_0x02d2:
            r11 = 1
        L_0x02d3:
            r10 = r9
        L_0x02d4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 2131760495(0x7f10156f, float:1.9152012E38)
            java.lang.String r13 = r0.getString(r13)
            r12.append(r13)
            r13 = 32
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            com.scb.phone.view.custom.common.TintInputViewGroup r12 = r0.ivgSwiftCode
            if (r12 != 0) goto L_0x02f6
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x02f6:
            r12.setTitle(r10)
            com.scb.phone.view.custom.common.TintInputViewGroup r10 = r0.ivgSwiftCode
            if (r10 != 0) goto L_0x0300
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0300:
            r10.setHint(r9)
            com.scb.phone.view.custom.common.TintInputViewGroup r9 = r0.ivgSwiftCode
            if (r9 != 0) goto L_0x030a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x030a:
            android.view.View r9 = (android.view.View) r9
            int r10 = r9.getVisibility()
            if (r10 == 0) goto L_0x0313
            r9 = 0
        L_0x0313:
            com.scb.phone.view.custom.common.TintInputViewGroup r9 = (com.scb.phone.view.custom.common.TintInputViewGroup) r9
            if (r9 == 0) goto L_0x0320
            if (r4 == 0) goto L_0x031c
            java.lang.String r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x031d
        L_0x031c:
            r4 = 0
        L_0x031d:
            r9.setText(r4)
        L_0x0320:
            com.scb.phone.view.custom.common.TintInputViewGroup r4 = r0.ivgSwiftCode
            if (r4 != 0) goto L_0x0327
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0327:
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$ResultReceiverWrapper r9 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$ResultReceiverWrapper
            r9.<init>(r0)
            android.text.TextWatcher r9 = (android.text.TextWatcher) r9
            com.scb.phone.view.custom.common.CustomEditText r10 = r4.mEditText
            r10.addTextChangedListener(r9)
            java.util.ArrayList<android.text.TextWatcher> r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r4.add(r9)
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            goto L_0x033e
        L_0x033d:
            r11 = 1
        L_0x033e:
            android.widget.LinearLayout r4 = r0.llBankViewsContainer
            if (r4 != 0) goto L_0x0347
            java.lang.String r9 = "llBankViewsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r9)
        L_0x0347:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            java.lang.String r10 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r10)
            r10 = r2
            java.util.Collection r10 = (java.util.Collection) r10
            int r10 = r10.size()
            r9.<init>(r10)
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r2 = r2.iterator()
        L_0x0360:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x037e
            java.lang.Object r10 = r2.next()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0374
            r10 = 0
            goto L_0x0376
        L_0x0374:
            r10 = 8
        L_0x0376:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            goto L_0x0360
        L_0x037e:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r2 = r9.iterator()
        L_0x0386:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x039f
            java.lang.Object r9 = r2.next()
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != 0) goto L_0x039b
            r10 = r11
            goto L_0x039c
        L_0x039b:
            r10 = 0
        L_0x039c:
            if (r10 == 0) goto L_0x0386
            goto L_0x03a0
        L_0x039f:
            r9 = 0
        L_0x03a0:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x03a9
            int r11 = r9.intValue()
            goto L_0x03ab
        L_0x03a9:
            r11 = 8
        L_0x03ab:
            r4.setVisibility(r11)
        L_0x03ae:
            r0.MediaBrowserCompat$ItemReceiver((p040o.C3092xce3d994b) r1)
            r0.read(r1)
            r0.MediaBrowserCompat$CustomActionResultReceiver((p040o.C3092xce3d994b) r1)
            r0.IconCompatParcelizer((p040o.C3092xce3d994b) r1)
            java.lang.String r1 = r1.MediaMetadataCompat
            if (r1 == 0) goto L_0x03cb
            com.scb.phone.view.custom.common.TintNoteEditText r2 = r0.etNote
            if (r2 != 0) goto L_0x03c5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x03c5:
            r2.setText(r1)
            goto L_0x03cb
        L_0x03c9:
            r16 = r4
        L_0x03cb:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgReceivingBank
            if (r1 != 0) goto L_0x03d2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x03d2:
            java.lang.String r2 = "^[a-zA-Z0-9 ]+$"
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtAccountType
            if (r1 != 0) goto L_0x03de
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x03de:
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 == 0) goto L_0x03e8
            r4 = 0
        L_0x03e8:
            if (r4 == 0) goto L_0x03f1
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem r4 = r0.MediaBrowserCompat$MediaItem
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle$IconCompatParcelizer r4 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle.IconCompatParcelizer) r4
            r1.setOnCustomSpinnerWithTitleCompletion(r4)
        L_0x03f1:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgBankCode
            if (r1 != 0) goto L_0x03f8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r16)
        L_0x03f8:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAccountNumber
            if (r1 != 0) goto L_0x0402
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0402:
            java.lang.String r4 = "^[a-zA-Z0-9]+$"
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r4)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgSwiftCode
            if (r1 != 0) goto L_0x040e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x040e:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r4)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtTitle
            if (r1 != 0) goto L_0x041a
            java.lang.String r4 = "swtTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x041a:
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 == 0) goto L_0x0424
            r4 = 0
        L_0x0424:
            if (r4 == 0) goto L_0x042d
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem r4 = r0.MediaBrowserCompat$MediaItem
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle$IconCompatParcelizer r4 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle.IconCompatParcelizer) r4
            r1.setOnCustomSpinnerWithTitleCompletion(r4)
        L_0x042d:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgFirstName
            if (r1 != 0) goto L_0x0436
            java.lang.String r4 = "ivgFirstName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0436:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgLastName
            if (r1 != 0) goto L_0x0442
            java.lang.String r4 = "ivgLastName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0442:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgNationality
            if (r1 != 0) goto L_0x044e
            java.lang.String r4 = "ivgNationality"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x044e:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtIdentificationType
            if (r1 != 0) goto L_0x045a
            java.lang.String r4 = "swtIdentificationType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x045a:
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 == 0) goto L_0x0464
            r4 = 0
        L_0x0464:
            if (r4 == 0) goto L_0x046d
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem r4 = r0.MediaBrowserCompat$MediaItem
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle$IconCompatParcelizer r4 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle.IconCompatParcelizer) r4
            r1.setOnCustomSpinnerWithTitleCompletion(r4)
        L_0x046d:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgIdentificationNumber
            if (r1 != 0) goto L_0x0476
            java.lang.String r4 = "ivgIdentificationNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0476:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAddress
            if (r1 != 0) goto L_0x0482
            java.lang.String r4 = "ivgAddress"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0482:
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 == 0) goto L_0x048c
            r4 = 0
        L_0x048c:
            if (r4 == 0) goto L_0x04b6
            o.BaseDiscoverFundFilterActivity<android.view.View, java.lang.Boolean, o.HmlVerifyPhoneValidateOtpActivity> r4 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x0498
            o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity r5 = new o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity
            r5.<init>(r4)
            r4 = r5
        L_0x0498:
            android.view.View$OnFocusChangeListener r4 = (android.view.View.OnFocusChangeListener) r4
            r1.setFocusListener(r4)
            android.widget.TextView$OnEditorActionListener r4 = r0.RatingCompat
            r1.setOnEditorActionListener(r4)
            com.scb.phone.view.custom.common.CustomEditText$IconCompatParcelizer r4 = r0.MediaDescriptionCompat
            r1.setOnPasteListener(r4)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$write r4 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$write
            r4.<init>(r0)
            com.scb.phone.view.custom.common.CustomEditText$write r4 = (com.scb.phone.view.custom.common.CustomEditText.write) r4
            r1.setOnBackListener(r4)
            java.lang.String r4 = "^[a-zA-Z0-9 ,\\/*.-]+$"
            r1.setFilter(r4)
        L_0x04b6:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgCity
            if (r1 != 0) goto L_0x04bf
            java.lang.String r4 = "ivgCity"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x04bf:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgState
            if (r1 != 0) goto L_0x04cb
            java.lang.String r4 = "ivgState"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x04cb:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgPostcode
            if (r1 != 0) goto L_0x04d7
            java.lang.String r4 = "ivgPostcode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x04d7:
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 == 0) goto L_0x04e1
            r4 = 0
        L_0x04e1:
            if (r4 == 0) goto L_0x050b
            o.BaseDiscoverFundFilterActivity<android.view.View, java.lang.Boolean, o.HmlVerifyPhoneValidateOtpActivity> r4 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r4 == 0) goto L_0x04ed
            o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity r5 = new o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity
            r5.<init>(r4)
            r4 = r5
        L_0x04ed:
            android.view.View$OnFocusChangeListener r4 = (android.view.View.OnFocusChangeListener) r4
            r1.setFocusListener(r4)
            android.widget.TextView$OnEditorActionListener r4 = r0.RatingCompat
            r1.setOnEditorActionListener(r4)
            com.scb.phone.view.custom.common.CustomEditText$IconCompatParcelizer r4 = r0.MediaDescriptionCompat
            r1.setOnPasteListener(r4)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$SearchResultReceiver r4 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$SearchResultReceiver
            r4.<init>(r0)
            com.scb.phone.view.custom.common.CustomEditText$write r4 = (com.scb.phone.view.custom.common.CustomEditText.write) r4
            r1.setOnBackListener(r4)
            java.lang.String r4 = "^(?=\\S)[0-9a-zA-Z]+$"
            r1.setFilter(r4)
        L_0x050b:
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etCountryCode
            if (r1 != 0) goto L_0x0514
            java.lang.String r4 = "etCountryCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0514:
            r0.IconCompatParcelizer((com.scb.phone.view.custom.common.CustomEditText) r1, (java.lang.String) r2)
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etPhoneNumber
            if (r1 != 0) goto L_0x0520
            java.lang.String r4 = "etPhoneNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0520:
            r0.IconCompatParcelizer((com.scb.phone.view.custom.common.CustomEditText) r1, (java.lang.String) r2)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgEmail
            if (r1 != 0) goto L_0x052c
            java.lang.String r2 = "ivgEmail"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x052c:
            java.lang.String r2 = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
            r0.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtPurpose
            if (r1 != 0) goto L_0x053a
            java.lang.String r2 = "swtPurpose"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x053a:
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r4 = r2.getVisibility()
            if (r4 == 0) goto L_0x0545
            r9 = 0
            goto L_0x0546
        L_0x0545:
            r9 = r2
        L_0x0546:
            if (r9 == 0) goto L_0x054f
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$MediaItem r2 = r0.MediaBrowserCompat$MediaItem
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle$IconCompatParcelizer r2 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle.IconCompatParcelizer) r2
            r1.setOnCustomSpinnerWithTitleCompletion(r2)
        L_0x054f:
            com.scb.phone.view.custom.common.TintNoteEditText r1 = r0.etNote
            if (r1 != 0) goto L_0x0556
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0556:
            android.widget.EditText r1 = r1.mNoteEditText
            o.BaseDiscoverFundFilterActivity<android.view.View, java.lang.Boolean, o.HmlVerifyPhoneValidateOtpActivity> r2 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x0562
            o.ActivityBuilder_ContributePrepaidMarketConductActivity r3 = new o.ActivityBuilder_ContributePrepaidMarketConductActivity
            r3.<init>(r2)
            r2 = r3
        L_0x0562:
            android.view.View$OnFocusChangeListener r2 = (android.view.View.OnFocusChangeListener) r2
            r1.setOnFocusChangeListener(r2)
            o.HmlVerifyEmailActivity r1 = r0.ParcelableVolumeInfo
            java.lang.Object r1 = r1.MediaBrowserCompat$CustomActionResultReceiver()
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r1 = (p040o.C3092xce3d994b.Builder) r1
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r2 = p040o.C3092xce3d994b.Builder.ADD_FAVOURITE
            if (r1 != r2) goto L_0x057b
            r1 = 2131760479(0x7f10155f, float:1.915198E38)
            java.lang.String r1 = r0.getString(r1)
            goto L_0x0582
        L_0x057b:
            r1 = 2131760518(0x7f101586, float:1.9152059E38)
            java.lang.String r1 = r0.getString(r1)
        L_0x0582:
            java.lang.String r2 = "if (state == RemittanceS…w_button_title)\n        }"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            android.widget.Button r2 = r0.btAction
            if (r2 != 0) goto L_0x0590
            java.lang.String r3 = "btAction"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0590:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    static final class ParcelableVolumeInfo implements DialogInterface.OnClickListener {
        public static final ParcelableVolumeInfo IconCompatParcelizer = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    public final void write() {
        TintInputViewGroup tintInputViewGroup = this.ivgEmail;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        View view = tintInputViewGroup;
        if (view.getVisibility() != 0) {
            view = null;
        }
        TintInputViewGroup tintInputViewGroup2 = (TintInputViewGroup) view;
        if (tintInputViewGroup2 != null) {
            tintInputViewGroup2.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup2.getContext(), R.drawable.shape_red_reounded_reactangle_border));
            tintInputViewGroup2.mErrorTextView.setVisibility(0);
        }
    }

    public final void MediaMetadataCompat() {
        TintNoteEditText tintNoteEditText = this.etNote;
        if (tintNoteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
        }
        tintNoteEditText.mErrorText.setVisibility(0);
        tintNoteEditText.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(tintNoteEditText.getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.btAction;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAction");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setImportance setimportance) {
        onGetStartedClick.write((Object) setimportance, "display");
        Context context = getContext();
        if (context != null) {
            RemittanceReviewActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceReviewActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) setimportance, "reviewDisplay");
            Intent intent = new Intent(context, RemittanceReviewActivity.class);
            intent.putExtra("EXTRA_REMITTANCE_REVIEW_DISPLAY", setimportance);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TintInputViewGroup tintInputViewGroup = this.ivgAccountNumber;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
        }
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_red_reounded_reactangle_border));
        tintInputViewGroup.mErrorTextView.setVisibility(0);
        TintInputViewGroup tintInputViewGroup2 = this.ivgAccountNumber;
        if (tintInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
        }
        tintInputViewGroup2.setErrorText(getString(R.string.remittance_recipient_account_number_input_error));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TintInputViewGroup tintInputViewGroup = this.ivgAccountNumber;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
        }
        tintInputViewGroup.setErrorText((String) null);
        TintInputViewGroup tintInputViewGroup2 = this.ivgAccountNumber;
        if (tintInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
        }
        tintInputViewGroup2.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup2.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
        tintInputViewGroup2.mErrorTextView.setVisibility(8);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        TintInputViewGroup tintInputViewGroup = this.ivgSwiftCode;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
        }
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_red_reounded_reactangle_border));
        tintInputViewGroup.mErrorTextView.setVisibility(0);
        TintInputViewGroup tintInputViewGroup2 = this.ivgSwiftCode;
        if (tintInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
        }
        tintInputViewGroup2.setErrorText(getString(R.string.remittance_recipient_swift_code_input_error));
    }

    public final void IconCompatParcelizer() {
        TintInputViewGroup tintInputViewGroup = this.ivgSwiftCode;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
        }
        tintInputViewGroup.setErrorText((String) null);
        TintInputViewGroup tintInputViewGroup2 = this.ivgSwiftCode;
        if (tintInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
        }
        tintInputViewGroup2.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup2.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
        tintInputViewGroup2.mErrorTextView.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$ItemReceiver(p040o.C3092xce3d994b r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            o.setAddress r1 = r12.AppCompatViewInflater
            java.lang.String r2 = "$this$indexOf"
            r3 = 1
            r4 = 8
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0074
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtTitle
            java.lang.String r8 = "swtTitle"
            if (r7 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x001b:
            boolean r9 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r0.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x002a
            r9 = r6
            goto L_0x002b
        L_0x002a:
            r9 = r4
        L_0x002b:
            r7.setVisibility(r9)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtTitle
            if (r7 != 0) goto L_0x0035
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0035:
            android.view.View r7 = (android.view.View) r7
            int r9 = r7.getVisibility()
            if (r9 == 0) goto L_0x003e
            r7 = r5
        L_0x003e:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r7
            if (r7 == 0) goto L_0x0049
            java.util.List<java.lang.String> r9 = r1.MediaBrowserCompat$ItemReceiver
            r7.setItemsWithPlaceholder(r9, r3, r6)
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0049:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtTitle
            if (r7 != 0) goto L_0x0050
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0050:
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == 0) goto L_0x0059
            r7 = r5
        L_0x0059:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r7
            if (r7 == 0) goto L_0x0070
            java.util.List<java.lang.String> r8 = r1.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x006f
            java.lang.String r1 = r1.read
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r2)
            int r1 = r8.indexOf(r1)
            int r1 = r1 + r3
            r7.setSelectionIndex(r1)
            goto L_0x0070
        L_0x006f:
            return
        L_0x0070:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0074:
            o.setCode r1 = r12.PlaybackStateCompat
            if (r1 == 0) goto L_0x00b1
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgFirstName
            java.lang.String r8 = "ivgFirstName"
            if (r7 != 0) goto L_0x0081
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0081:
            boolean r9 = r1.write
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r0.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x0090
            r9 = r6
            goto L_0x0091
        L_0x0090:
            r9 = r4
        L_0x0091:
            r7.setVisibility(r9)
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgFirstName
            if (r7 != 0) goto L_0x009b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x009b:
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == 0) goto L_0x00a4
            r7 = r5
        L_0x00a4:
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = (com.scb.phone.view.custom.common.TintInputViewGroup) r7
            if (r7 == 0) goto L_0x00ad
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r7.setText(r1)
        L_0x00ad:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00b1:
            o.setCode r1 = r12.PlaybackStateCompat$CustomAction
            if (r1 == 0) goto L_0x00ee
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgLastName
            java.lang.String r8 = "ivgLastName"
            if (r7 != 0) goto L_0x00be
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00be:
            boolean r9 = r1.write
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r0.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x00cd
            r9 = r6
            goto L_0x00ce
        L_0x00cd:
            r9 = r4
        L_0x00ce:
            r7.setVisibility(r9)
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgLastName
            if (r7 != 0) goto L_0x00d8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00d8:
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == 0) goto L_0x00e1
            r7 = r5
        L_0x00e1:
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = (com.scb.phone.view.custom.common.TintInputViewGroup) r7
            if (r7 == 0) goto L_0x00ea
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r7.setText(r1)
        L_0x00ea:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x00ee:
            o.setCode r1 = r12.AlertController$RecycleListView
            if (r1 == 0) goto L_0x012b
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgNationality
            java.lang.String r8 = "ivgNationality"
            if (r7 != 0) goto L_0x00fb
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00fb:
            boolean r9 = r1.write
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r0.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x010a
            r9 = r6
            goto L_0x010b
        L_0x010a:
            r9 = r4
        L_0x010b:
            r7.setVisibility(r9)
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = r11.ivgNationality
            if (r7 != 0) goto L_0x0115
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0115:
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == 0) goto L_0x011e
            r7 = r5
        L_0x011e:
            com.scb.phone.view.custom.common.TintInputViewGroup r7 = (com.scb.phone.view.custom.common.TintInputViewGroup) r7
            if (r7 == 0) goto L_0x0127
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r7.setText(r1)
        L_0x0127:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x012b:
            o.setAddress r1 = r12.Keep
            if (r1 == 0) goto L_0x0191
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtIdentificationType
            java.lang.String r8 = "swtIdentificationType"
            if (r7 != 0) goto L_0x0138
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0138:
            boolean r9 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r0.add(r10)
            o.HmlVerifyPhoneValidateOtpActivity r10 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x0147
            r9 = r6
            goto L_0x0148
        L_0x0147:
            r9 = r4
        L_0x0148:
            r7.setVisibility(r9)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtIdentificationType
            if (r7 != 0) goto L_0x0152
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x0152:
            android.view.View r7 = (android.view.View) r7
            int r9 = r7.getVisibility()
            if (r9 == 0) goto L_0x015b
            r7 = r5
        L_0x015b:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r7
            if (r7 == 0) goto L_0x0166
            java.util.List<java.lang.String> r9 = r1.MediaBrowserCompat$ItemReceiver
            r7.setItemsWithPlaceholder(r9, r3, r6)
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0166:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = r11.swtIdentificationType
            if (r7 != 0) goto L_0x016d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x016d:
            android.view.View r7 = (android.view.View) r7
            int r8 = r7.getVisibility()
            if (r8 == 0) goto L_0x0176
            r7 = r5
        L_0x0176:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r7 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r7
            if (r7 == 0) goto L_0x018d
            java.util.List<java.lang.String> r8 = r1.MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x018c
            java.lang.String r1 = r1.read
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r2)
            int r1 = r8.indexOf(r1)
            int r1 = r1 + r3
            r7.setSelectionIndex(r1)
            goto L_0x018d
        L_0x018c:
            return
        L_0x018d:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0191:
            o.setCode r12 = r12.setHasDecor
            if (r12 == 0) goto L_0x01ce
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r11.ivgIdentificationNumber
            java.lang.String r2 = "ivgIdentificationNumber"
            if (r1 != 0) goto L_0x019e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x019e:
            boolean r7 = r12.write
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.add(r8)
            o.HmlVerifyPhoneValidateOtpActivity r8 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x01ad
            r7 = r6
            goto L_0x01ae
        L_0x01ad:
            r7 = r4
        L_0x01ae:
            r1.setVisibility(r7)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r11.ivgIdentificationNumber
            if (r1 != 0) goto L_0x01b8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x01b8:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x01c1
            r1 = r5
        L_0x01c1:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01ca
            java.lang.String r12 = r12.MediaBrowserCompat$CustomActionResultReceiver
            r1.setText(r12)
        L_0x01ca:
            o.HmlVerifyPhoneValidateOtpActivity r12 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            o.HmlVerifyPhoneValidateOtpActivity r12 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x01ce:
            android.widget.LinearLayout r12 = r11.llPersonalDetailViewsContainer
            if (r12 != 0) goto L_0x01d7
            java.lang.String r1 = "llPersonalDetailViewsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x01d7:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x01f0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x020d
            java.lang.Object r2 = r0.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0204
            r2 = r6
            goto L_0x0205
        L_0x0204:
            r2 = r4
        L_0x0205:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            goto L_0x01f0
        L_0x020d:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x0215:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x022e
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x022a
            r2 = r3
            goto L_0x022b
        L_0x022a:
            r2 = r6
        L_0x022b:
            if (r2 == 0) goto L_0x0215
            r5 = r1
        L_0x022e:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0236
            int r4 = r5.intValue()
        L_0x0236:
            r12.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.MediaBrowserCompat$ItemReceiver(o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void read(p040o.C3092xce3d994b r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            o.setCode r1 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0042
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgAddress
            java.lang.String r6 = "ivgAddress"
            if (r5 != 0) goto L_0x0018
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0018:
            boolean r7 = r1.write
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.add(r8)
            if (r7 == 0) goto L_0x0025
            r7 = r3
            goto L_0x0026
        L_0x0025:
            r7 = r4
        L_0x0026:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgAddress
            if (r5 != 0) goto L_0x0030
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0030:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x0039
            r5 = r2
        L_0x0039:
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = (com.scb.phone.view.custom.common.TintInputViewGroup) r5
            if (r5 == 0) goto L_0x0042
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r5.setText(r1)
        L_0x0042:
            o.setCode r1 = r10.MediaSessionCompat$QueueItem
            if (r1 == 0) goto L_0x0079
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgCity
            java.lang.String r6 = "ivgCity"
            if (r5 != 0) goto L_0x004f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x004f:
            boolean r7 = r1.write
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.add(r8)
            if (r7 == 0) goto L_0x005c
            r7 = r3
            goto L_0x005d
        L_0x005c:
            r7 = r4
        L_0x005d:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgCity
            if (r5 != 0) goto L_0x0067
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0067:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x0070
            r5 = r2
        L_0x0070:
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = (com.scb.phone.view.custom.common.TintInputViewGroup) r5
            if (r5 == 0) goto L_0x0079
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r5.setText(r1)
        L_0x0079:
            o.setCode r1 = r10.AppCompatDelegateImpl$ListMenuDecorView
            if (r1 == 0) goto L_0x00b0
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgState
            java.lang.String r6 = "ivgState"
            if (r5 != 0) goto L_0x0086
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0086:
            boolean r7 = r1.write
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.add(r8)
            if (r7 == 0) goto L_0x0093
            r7 = r3
            goto L_0x0094
        L_0x0093:
            r7 = r4
        L_0x0094:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = r9.ivgState
            if (r5 != 0) goto L_0x009e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x009e:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x00a7
            r5 = r2
        L_0x00a7:
            com.scb.phone.view.custom.common.TintInputViewGroup r5 = (com.scb.phone.view.custom.common.TintInputViewGroup) r5
            if (r5 == 0) goto L_0x00b0
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r5.setText(r1)
        L_0x00b0:
            o.setCode r10 = r10.AppCompatActivity
            if (r10 == 0) goto L_0x00e7
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r9.ivgPostcode
            java.lang.String r5 = "ivgPostcode"
            if (r1 != 0) goto L_0x00bd
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x00bd:
            boolean r6 = r10.write
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r0.add(r7)
            if (r6 == 0) goto L_0x00ca
            r6 = r3
            goto L_0x00cb
        L_0x00ca:
            r6 = r4
        L_0x00cb:
            r1.setVisibility(r6)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r9.ivgPostcode
            if (r1 != 0) goto L_0x00d5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x00d5:
            android.view.View r1 = (android.view.View) r1
            int r5 = r1.getVisibility()
            if (r5 == 0) goto L_0x00de
            r1 = r2
        L_0x00de:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x00e7
            java.lang.String r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r1.setText(r10)
        L_0x00e7:
            android.widget.LinearLayout r10 = r9.llAddressViewsContainer
            if (r10 != 0) goto L_0x00f0
            java.lang.String r1 = "llAddressViewsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00f0:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r5 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r1.<init>(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0109:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0126
            java.lang.Object r5 = r0.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x011d
            r5 = r3
            goto L_0x011e
        L_0x011d:
            r5 = r4
        L_0x011e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            goto L_0x0109
        L_0x0126:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x012e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0147
            java.lang.Object r1 = r0.next()
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x0143
            r5 = 1
            goto L_0x0144
        L_0x0143:
            r5 = r3
        L_0x0144:
            if (r5 == 0) goto L_0x012e
            r2 = r1
        L_0x0147:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x014f
            int r4 = r2.intValue()
        L_0x014f:
            r10.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.read(o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver(p040o.C3092xce3d994b r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder r1 = r9.setBackgroundResource
            r2 = 0
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L_0x0085
            com.scb.phone.view.custom.common.CustomEditText r5 = r8.etCountryCode
            java.lang.String r6 = "etCountryCode"
            if (r5 != 0) goto L_0x0018
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0018:
            boolean r7 = r1.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x001e
            r7 = r3
            goto L_0x001f
        L_0x001e:
            r7 = r4
        L_0x001f:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.common.CustomEditText r5 = r8.etCountryCode
            if (r5 != 0) goto L_0x0029
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0029:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x0032
            r5 = r2
        L_0x0032:
            com.scb.phone.view.custom.common.CustomEditText r5 = (com.scb.phone.view.custom.common.CustomEditText) r5
            if (r5 == 0) goto L_0x003d
            java.lang.String r6 = r1.write
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
        L_0x003d:
            com.scb.phone.view.custom.common.CustomEditText r5 = r8.etPhoneNumber
            java.lang.String r6 = "etPhoneNumber"
            if (r5 != 0) goto L_0x0046
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0046:
            boolean r7 = r1.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x004c
            r7 = r3
            goto L_0x004d
        L_0x004c:
            r7 = r4
        L_0x004d:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.common.CustomEditText r5 = r8.etPhoneNumber
            if (r5 != 0) goto L_0x0057
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0057:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x0060
            r5 = r2
        L_0x0060:
            com.scb.phone.view.custom.common.CustomEditText r5 = (com.scb.phone.view.custom.common.CustomEditText) r5
            if (r5 == 0) goto L_0x006b
            java.lang.String r6 = r1.IconCompatParcelizer
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
        L_0x006b:
            android.widget.TextView r5 = r8.tvContactNumberTitle
            if (r5 != 0) goto L_0x0074
            java.lang.String r6 = "tvContactNumberTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0074:
            boolean r1 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            r0.add(r6)
            if (r1 == 0) goto L_0x0081
            r1 = r3
            goto L_0x0082
        L_0x0081:
            r1 = r4
        L_0x0082:
            r5.setVisibility(r1)
        L_0x0085:
            o.setCode r9 = r9.MediaSessionCompat$Token
            if (r9 == 0) goto L_0x00bc
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r8.ivgEmail
            java.lang.String r5 = "ivgEmail"
            if (r1 != 0) goto L_0x0092
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0092:
            boolean r6 = r9.write
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r0.add(r7)
            if (r6 == 0) goto L_0x009f
            r6 = r3
            goto L_0x00a0
        L_0x009f:
            r6 = r4
        L_0x00a0:
            r1.setVisibility(r6)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r8.ivgEmail
            if (r1 != 0) goto L_0x00aa
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x00aa:
            android.view.View r1 = (android.view.View) r1
            int r5 = r1.getVisibility()
            if (r5 == 0) goto L_0x00b3
            r1 = r2
        L_0x00b3:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            r1.setText(r9)
        L_0x00bc:
            android.widget.LinearLayout r9 = r8.llContactDetailViewsContainer
            if (r9 != 0) goto L_0x00c5
            java.lang.String r1 = "llContactDetailViewsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00c5:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r5 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r1.<init>(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x00de:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00fb
            java.lang.Object r5 = r0.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00f2
            r5 = r3
            goto L_0x00f3
        L_0x00f2:
            r5 = r4
        L_0x00f3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            goto L_0x00de
        L_0x00fb:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x0103:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011c
            java.lang.Object r1 = r0.next()
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x0118
            r5 = 1
            goto L_0x0119
        L_0x0118:
            r5 = r3
        L_0x0119:
            if (r5 == 0) goto L_0x0103
            r2 = r1
        L_0x011c:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0124
            int r4 = r2.intValue()
        L_0x0124:
            r9.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void IconCompatParcelizer(p040o.C3092xce3d994b r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            o.setAddress r10 = r10.AppCompatDialogFragment
            r1 = 1
            r2 = 0
            r3 = 8
            r4 = 0
            if (r10 == 0) goto L_0x006c
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r5 = r9.swtPurpose
            java.lang.String r6 = "swtPurpose"
            if (r5 != 0) goto L_0x0019
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0019:
            boolean r7 = r10.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.add(r8)
            if (r7 == 0) goto L_0x0026
            r7 = r4
            goto L_0x0027
        L_0x0026:
            r7 = r3
        L_0x0027:
            r5.setVisibility(r7)
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r5 = r9.swtPurpose
            if (r5 != 0) goto L_0x0031
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0031:
            android.view.View r5 = (android.view.View) r5
            int r7 = r5.getVisibility()
            if (r7 == 0) goto L_0x003a
            r5 = r2
        L_0x003a:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r5 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r5
            if (r5 == 0) goto L_0x0043
            java.util.List<java.lang.String> r7 = r10.MediaBrowserCompat$ItemReceiver
            r5.setItemsWithPlaceholder(r7, r1, r4)
        L_0x0043:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r5 = r9.swtPurpose
            if (r5 != 0) goto L_0x004a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x004a:
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getVisibility()
            if (r6 == 0) goto L_0x0053
            r5 = r2
        L_0x0053:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r5 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r5
            if (r5 == 0) goto L_0x006c
            java.util.List<java.lang.String> r6 = r10.MediaBrowserCompat$ItemReceiver
            if (r6 == 0) goto L_0x006b
            java.lang.String r10 = r10.read
            java.lang.String r7 = "$this$indexOf"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r7)
            int r10 = r6.indexOf(r10)
            int r10 = r10 + r1
            r5.setSelectionIndex(r10)
            goto L_0x006c
        L_0x006b:
            return
        L_0x006c:
            android.widget.LinearLayout r10 = r9.llTransactionDetailViewsContainer
            if (r10 != 0) goto L_0x0075
            java.lang.String r5 = "llTransactionDetailViewsContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0075:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.String r6 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r6)
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r0 = r0.iterator()
        L_0x008e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r0.next()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00a2
            r6 = r4
            goto L_0x00a3
        L_0x00a2:
            r6 = r3
        L_0x00a3:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L_0x008e
        L_0x00ab:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L_0x00b3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x00c8
            r6 = r1
            goto L_0x00c9
        L_0x00c8:
            r6 = r4
        L_0x00c9:
            if (r6 == 0) goto L_0x00b3
            r2 = r5
        L_0x00cc:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x00d4
            int r3 = r2.intValue()
        L_0x00d4:
            r10.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.IconCompatParcelizer(o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame):void");
    }

    public final void onDestroyView() {
        TintInputViewGroup tintInputViewGroup = this.ivgReceivingBank;
        if (tintInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgReceivingBank");
        }
        read(this, tintInputViewGroup);
        CustomSpinnerWithTitle customSpinnerWithTitle = this.swtAccountType;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtAccountType");
        }
        View view = customSpinnerWithTitle;
        if (view.getVisibility() != 0) {
            view = null;
        }
        if (view != null) {
            customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        }
        TintInputViewGroup tintInputViewGroup2 = this.ivgBankCode;
        if (tintInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgBankCode");
        }
        read(this, tintInputViewGroup2);
        TintInputViewGroup tintInputViewGroup3 = this.ivgAccountNumber;
        if (tintInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
        }
        read(this, tintInputViewGroup3);
        TintInputViewGroup tintInputViewGroup4 = this.ivgSwiftCode;
        if (tintInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
        }
        read(this, tintInputViewGroup4);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.swtTitle;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtTitle");
        }
        View view2 = customSpinnerWithTitle2;
        if (view2.getVisibility() != 0) {
            view2 = null;
        }
        if (view2 != null) {
            customSpinnerWithTitle2.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        }
        TintInputViewGroup tintInputViewGroup5 = this.ivgFirstName;
        if (tintInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgFirstName");
        }
        read(this, tintInputViewGroup5);
        TintInputViewGroup tintInputViewGroup6 = this.ivgLastName;
        if (tintInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgLastName");
        }
        read(this, tintInputViewGroup6);
        TintInputViewGroup tintInputViewGroup7 = this.ivgNationality;
        if (tintInputViewGroup7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgNationality");
        }
        read(this, tintInputViewGroup7);
        CustomSpinnerWithTitle customSpinnerWithTitle3 = this.swtIdentificationType;
        if (customSpinnerWithTitle3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtIdentificationType");
        }
        View view3 = customSpinnerWithTitle3;
        if (view3.getVisibility() != 0) {
            view3 = null;
        }
        if (view3 != null) {
            customSpinnerWithTitle3.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        }
        TintInputViewGroup tintInputViewGroup8 = this.ivgIdentificationNumber;
        if (tintInputViewGroup8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgIdentificationNumber");
        }
        read(this, tintInputViewGroup8);
        TintInputViewGroup tintInputViewGroup9 = this.ivgAddress;
        if (tintInputViewGroup9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAddress");
        }
        read(this, tintInputViewGroup9);
        TintInputViewGroup tintInputViewGroup10 = this.ivgCity;
        if (tintInputViewGroup10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgCity");
        }
        read(this, tintInputViewGroup10);
        TintInputViewGroup tintInputViewGroup11 = this.ivgState;
        if (tintInputViewGroup11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgState");
        }
        read(this, tintInputViewGroup11);
        TintInputViewGroup tintInputViewGroup12 = this.ivgPostcode;
        if (tintInputViewGroup12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgPostcode");
        }
        read(this, tintInputViewGroup12);
        CustomEditText customEditText = this.etCountryCode;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etCountryCode");
        }
        MediaBrowserCompat$ItemReceiver(this, customEditText);
        CustomEditText customEditText2 = this.etPhoneNumber;
        if (customEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etPhoneNumber");
        }
        MediaBrowserCompat$ItemReceiver(this, customEditText2);
        TintInputViewGroup tintInputViewGroup13 = this.ivgEmail;
        if (tintInputViewGroup13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
        }
        read(this, tintInputViewGroup13);
        CustomSpinnerWithTitle customSpinnerWithTitle4 = this.swtPurpose;
        if (customSpinnerWithTitle4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
        }
        View view4 = customSpinnerWithTitle4;
        if (view4.getVisibility() != 0) {
            view4 = null;
        }
        if (view4 != null) {
            customSpinnerWithTitle4.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        }
        TintNoteEditText tintNoteEditText = this.etNote;
        if (tintNoteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etNote");
        }
        EditText editText = tintNoteEditText.mNoteEditText;
        onGetStartedClick.IconCompatParcelizer((Object) editText, "etNote.noteEditText");
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        super.onDestroyView();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver(com.scb.phone.view.custom.common.TintInputViewGroup r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L_0x000a
            r0 = 0
        L_0x000a:
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            o.BaseDiscoverFundFilterActivity<android.view.View, java.lang.Boolean, o.HmlVerifyPhoneValidateOtpActivity> r0 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0017
            o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity r1 = new o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity
            r1.<init>(r0)
            r0 = r1
        L_0x0017:
            android.view.View$OnFocusChangeListener r0 = (android.view.View.OnFocusChangeListener) r0
            r3.setFocusListener(r0)
            android.widget.TextView$OnEditorActionListener r0 = r2.RatingCompat
            r3.setOnEditorActionListener(r0)
            com.scb.phone.view.custom.common.CustomEditText$IconCompatParcelizer r0 = r2.MediaDescriptionCompat
            r3.setOnPasteListener(r0)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r2)
            com.scb.phone.view.custom.common.CustomEditText$write r0 = (com.scb.phone.view.custom.common.CustomEditText.write) r0
            r3.setOnBackListener(r0)
            r3.setFilter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(com.scb.phone.view.custom.common.TintInputViewGroup, java.lang.String):void");
    }

    static final class write implements CustomEditText.write {
        private /* synthetic */ RemittanceRecipientDetailFragment read;

        write(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment) {
            this.read = remittanceRecipientDetailFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void IconCompatParcelizer(com.scb.phone.view.custom.common.CustomEditText r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L_0x000a
            r0 = 0
        L_0x000a:
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            o.BaseDiscoverFundFilterActivity<android.view.View, java.lang.Boolean, o.HmlVerifyPhoneValidateOtpActivity> r0 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0017
            o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity r1 = new o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity
            r1.<init>(r0)
            r0 = r1
        L_0x0017:
            android.view.View$OnFocusChangeListener r0 = (android.view.View.OnFocusChangeListener) r0
            r3.setOnFocusChangeListener(r0)
            android.widget.TextView$OnEditorActionListener r0 = r2.RatingCompat
            r3.setOnEditorActionListener(r0)
            com.scb.phone.view.custom.common.CustomEditText$IconCompatParcelizer r0 = r2.MediaDescriptionCompat
            r3.setOnPasteListener(r0)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$ItemReceiver r0 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaBrowserCompat$ItemReceiver
            r0.<init>(r2)
            com.scb.phone.view.custom.common.CustomEditText$write r0 = (com.scb.phone.view.custom.common.CustomEditText.write) r0
            r3.setOnBackListener(r0)
            r3.setFilter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.IconCompatParcelizer(com.scb.phone.view.custom.common.CustomEditText, java.lang.String):void");
    }

    public static final /* synthetic */ void IconCompatParcelizer(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment, DialogInterface dialogInterface) {
        Editable text;
        Editable text2;
        RemittanceRecipientDetailFragment remittanceRecipientDetailFragment2 = remittanceRecipientDetailFragment;
        CustomInputDialog customInputDialog = remittanceRecipientDetailFragment2.IconCompatParcelizer;
        String str = null;
        String valueOf = customInputDialog != null ? String.valueOf(customInputDialog.mEditTextView.getText()) : null;
        if (valueOf == null) {
            return;
        }
        if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(valueOf).matches()) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            TintInputViewGroup tintInputViewGroup = remittanceRecipientDetailFragment2.ivgReceivingBank;
            if (tintInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgReceivingBank");
            }
            View view = tintInputViewGroup;
            if (view.getVisibility() != 0) {
                view = null;
            }
            TintInputViewGroup tintInputViewGroup2 = (TintInputViewGroup) view;
            String obj = tintInputViewGroup2 != null ? tintInputViewGroup2.mEditText.getText().toString() : null;
            CustomSpinnerWithTitle customSpinnerWithTitle = remittanceRecipientDetailFragment2.swtAccountType;
            if (customSpinnerWithTitle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtAccountType");
            }
            View view2 = customSpinnerWithTitle;
            if (view2.getVisibility() != 0) {
                view2 = null;
            }
            CustomSpinnerWithTitle customSpinnerWithTitle2 = (CustomSpinnerWithTitle) view2;
            String MediaBrowserCompat$ItemReceiver = customSpinnerWithTitle2 != null ? customSpinnerWithTitle2.MediaBrowserCompat$ItemReceiver() : null;
            TintInputViewGroup tintInputViewGroup3 = remittanceRecipientDetailFragment2.ivgBankCode;
            if (tintInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgBankCode");
            }
            View view3 = tintInputViewGroup3;
            if (view3.getVisibility() != 0) {
                view3 = null;
            }
            TintInputViewGroup tintInputViewGroup4 = (TintInputViewGroup) view3;
            String obj2 = tintInputViewGroup4 != null ? tintInputViewGroup4.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup5 = remittanceRecipientDetailFragment2.ivgAccountNumber;
            if (tintInputViewGroup5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAccountNumber");
            }
            View view4 = tintInputViewGroup5;
            if (view4.getVisibility() != 0) {
                view4 = null;
            }
            TintInputViewGroup tintInputViewGroup6 = (TintInputViewGroup) view4;
            String obj3 = tintInputViewGroup6 != null ? tintInputViewGroup6.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup7 = remittanceRecipientDetailFragment2.ivgSwiftCode;
            if (tintInputViewGroup7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgSwiftCode");
            }
            View view5 = tintInputViewGroup7;
            if (view5.getVisibility() != 0) {
                view5 = null;
            }
            TintInputViewGroup tintInputViewGroup8 = (TintInputViewGroup) view5;
            String obj4 = tintInputViewGroup8 != null ? tintInputViewGroup8.mEditText.getText().toString() : null;
            CustomSpinnerWithTitle customSpinnerWithTitle3 = remittanceRecipientDetailFragment2.swtTitle;
            if (customSpinnerWithTitle3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtTitle");
            }
            View view6 = customSpinnerWithTitle3;
            if (view6.getVisibility() != 0) {
                view6 = null;
            }
            CustomSpinnerWithTitle customSpinnerWithTitle4 = (CustomSpinnerWithTitle) view6;
            String MediaBrowserCompat$ItemReceiver2 = customSpinnerWithTitle4 != null ? customSpinnerWithTitle4.MediaBrowserCompat$ItemReceiver() : null;
            TintInputViewGroup tintInputViewGroup9 = remittanceRecipientDetailFragment2.ivgFirstName;
            if (tintInputViewGroup9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgFirstName");
            }
            View view7 = tintInputViewGroup9;
            if (view7.getVisibility() != 0) {
                view7 = null;
            }
            TintInputViewGroup tintInputViewGroup10 = (TintInputViewGroup) view7;
            String obj5 = tintInputViewGroup10 != null ? tintInputViewGroup10.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup11 = remittanceRecipientDetailFragment2.ivgLastName;
            if (tintInputViewGroup11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgLastName");
            }
            View view8 = tintInputViewGroup11;
            if (view8.getVisibility() != 0) {
                view8 = null;
            }
            TintInputViewGroup tintInputViewGroup12 = (TintInputViewGroup) view8;
            String obj6 = tintInputViewGroup12 != null ? tintInputViewGroup12.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup13 = remittanceRecipientDetailFragment2.ivgNationality;
            if (tintInputViewGroup13 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgNationality");
            }
            View view9 = tintInputViewGroup13;
            if (view9.getVisibility() != 0) {
                view9 = null;
            }
            TintInputViewGroup tintInputViewGroup14 = (TintInputViewGroup) view9;
            String obj7 = tintInputViewGroup14 != null ? tintInputViewGroup14.mEditText.getText().toString() : null;
            CustomSpinnerWithTitle customSpinnerWithTitle5 = remittanceRecipientDetailFragment2.swtIdentificationType;
            if (customSpinnerWithTitle5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtIdentificationType");
            }
            View view10 = customSpinnerWithTitle5;
            if (view10.getVisibility() != 0) {
                view10 = null;
            }
            CustomSpinnerWithTitle customSpinnerWithTitle6 = (CustomSpinnerWithTitle) view10;
            String MediaBrowserCompat$ItemReceiver3 = customSpinnerWithTitle6 != null ? customSpinnerWithTitle6.MediaBrowserCompat$ItemReceiver() : null;
            TintInputViewGroup tintInputViewGroup15 = remittanceRecipientDetailFragment2.ivgIdentificationNumber;
            if (tintInputViewGroup15 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgIdentificationNumber");
            }
            View view11 = tintInputViewGroup15;
            if (view11.getVisibility() != 0) {
                view11 = null;
            }
            TintInputViewGroup tintInputViewGroup16 = (TintInputViewGroup) view11;
            String obj8 = tintInputViewGroup16 != null ? tintInputViewGroup16.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup17 = remittanceRecipientDetailFragment2.ivgAddress;
            if (tintInputViewGroup17 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgAddress");
            }
            View view12 = tintInputViewGroup17;
            if (view12.getVisibility() != 0) {
                view12 = null;
            }
            TintInputViewGroup tintInputViewGroup18 = (TintInputViewGroup) view12;
            String obj9 = tintInputViewGroup18 != null ? tintInputViewGroup18.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup19 = remittanceRecipientDetailFragment2.ivgCity;
            if (tintInputViewGroup19 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgCity");
            }
            View view13 = tintInputViewGroup19;
            if (view13.getVisibility() != 0) {
                view13 = null;
            }
            TintInputViewGroup tintInputViewGroup20 = (TintInputViewGroup) view13;
            String obj10 = tintInputViewGroup20 != null ? tintInputViewGroup20.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup21 = remittanceRecipientDetailFragment2.ivgState;
            if (tintInputViewGroup21 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgState");
            }
            View view14 = tintInputViewGroup21;
            if (view14.getVisibility() != 0) {
                view14 = null;
            }
            TintInputViewGroup tintInputViewGroup22 = (TintInputViewGroup) view14;
            String obj11 = tintInputViewGroup22 != null ? tintInputViewGroup22.mEditText.getText().toString() : null;
            TintInputViewGroup tintInputViewGroup23 = remittanceRecipientDetailFragment2.ivgPostcode;
            if (tintInputViewGroup23 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgPostcode");
            }
            View view15 = tintInputViewGroup23;
            if (view15.getVisibility() != 0) {
                view15 = null;
            }
            TintInputViewGroup tintInputViewGroup24 = (TintInputViewGroup) view15;
            String obj12 = tintInputViewGroup24 != null ? tintInputViewGroup24.mEditText.getText().toString() : null;
            CustomEditText customEditText = remittanceRecipientDetailFragment2.etCountryCode;
            if (customEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etCountryCode");
            }
            View view16 = customEditText;
            if (view16.getVisibility() != 0) {
                view16 = null;
            }
            CustomEditText customEditText2 = (CustomEditText) view16;
            String obj13 = (customEditText2 == null || (text2 = customEditText2.getText()) == null) ? null : text2.toString();
            CustomEditText customEditText3 = remittanceRecipientDetailFragment2.etPhoneNumber;
            if (customEditText3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etPhoneNumber");
            }
            View view17 = customEditText3;
            if (view17.getVisibility() != 0) {
                view17 = null;
            }
            CustomEditText customEditText4 = (CustomEditText) view17;
            String obj14 = (customEditText4 == null || (text = customEditText4.getText()) == null) ? null : text.toString();
            TintInputViewGroup tintInputViewGroup25 = remittanceRecipientDetailFragment2.ivgEmail;
            if (tintInputViewGroup25 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgEmail");
            }
            View view18 = tintInputViewGroup25;
            if (view18.getVisibility() != 0) {
                view18 = null;
            }
            TintInputViewGroup tintInputViewGroup26 = (TintInputViewGroup) view18;
            String obj15 = tintInputViewGroup26 != null ? tintInputViewGroup26.mEditText.getText().toString() : null;
            CustomSpinnerWithTitle customSpinnerWithTitle7 = remittanceRecipientDetailFragment2.swtPurpose;
            if (customSpinnerWithTitle7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
            }
            View view19 = customSpinnerWithTitle7;
            if (view19.getVisibility() != 0) {
                view19 = null;
            }
            CustomSpinnerWithTitle customSpinnerWithTitle8 = (CustomSpinnerWithTitle) view19;
            if (customSpinnerWithTitle8 != null) {
                str = customSpinnerWithTitle8.MediaBrowserCompat$ItemReceiver();
            }
            C10073nW nWVar = new C10073nW(valueOf, obj, MediaBrowserCompat$ItemReceiver, obj2, obj3, obj4, MediaBrowserCompat$ItemReceiver2, obj5, obj6, obj7, MediaBrowserCompat$ItemReceiver3, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, str);
            C5010nK nKVar = remittanceRecipientDetailFragment2.presenter;
            if (nKVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) nWVar, "input");
            C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame = nKVar.write;
            if (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame != null) {
                ImmutableListMultimap immutableListMultimap = new ImmutableListMultimap();
                immutableListMultimap.AppCompatViewInflater = "REMITTANCE";
                immutableListMultimap.setShortcut = "ALL";
                immutableListMultimap.ActionMenuItemView = nWVar.MediaMetadataCompat;
                immutableListMultimap.setContentView = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.write;
                immutableListMultimap.MediaDescriptionCompat = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.f2679x50fd9e4a;
                immutableListMultimap.MediaBrowserCompat$MediaItem = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.RatingCompat;
                immutableListMultimap.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaBrowserCompat$MediaItem;
                immutableListMultimap.MediaBrowserCompat$MediaItem = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.RatingCompat;
                immutableListMultimap.MediaBrowserCompat$SearchResultReceiver = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.ParcelableVolumeInfo;
                immutableListMultimap.PlaybackStateCompat$CustomAction = nWVar.PlaybackStateCompat$CustomAction;
                immutableListMultimap.MediaBrowserCompat$CustomActionResultReceiver = nWVar.IconCompatParcelizer;
                immutableListMultimap.MediaBrowserCompat$ItemReceiver = nWVar.read;
                immutableListMultimap.read = nWVar.MediaBrowserCompat$CustomActionResultReceiver;
                immutableListMultimap.AppCompatDialogFragment = nWVar.Keep;
                immutableListMultimap.setBackgroundResource = nWVar.AlertController$RecycleListView;
                immutableListMultimap.f5514x50fd9e4a = nWVar.MediaBrowserCompat$SearchResultReceiver;
                immutableListMultimap.MediaSessionCompat$QueueItem = nWVar.MediaSessionCompat$QueueItem;
                immutableListMultimap.AlertController$RecycleListView = nWVar.f5548x50fd9e4a;
                immutableListMultimap.MediaSessionCompat$Token = nWVar.ParcelableVolumeInfo;
                immutableListMultimap.MediaSessionCompat$ResultReceiverWrapper = nWVar.MediaBrowserCompat$MediaItem;
                immutableListMultimap.write = nWVar.MediaBrowserCompat$ItemReceiver;
                immutableListMultimap.MediaMetadataCompat = nWVar.write;
                immutableListMultimap.AppCompatActivity = nWVar.setHasDecor;
                immutableListMultimap.PlaybackStateCompat = nWVar.MediaSessionCompat$Token;
                immutableListMultimap.RatingCompat = nWVar.RatingCompat;
                immutableListMultimap.Keep = nWVar.MediaSessionCompat$ResultReceiverWrapper;
                immutableListMultimap.ParcelableVolumeInfo = nWVar.MediaDescriptionCompat;
                immutableListMultimap.setHasDecor = nWVar.PlaybackStateCompat;
                if (nKVar.RatingCompat != null) {
                    nKVar.RatingCompat.AlertController$RecycleListView();
                }
                writeObject writeobject = nKVar.read;
                onGetStartedClick.write((Object) immutableListMultimap, "request");
                C5010nK nKVar2 = nKVar;
                writeobject.read(writeobject.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(immutableListMultimap), new C10068nJ(new C5010nK.MediaDescriptionCompat(nKVar2)), new C10068nJ(new nK$MediaBrowserCompat$MediaItem(nKVar2)));
                return;
            }
            return;
        }
        CustomInputDialog customInputDialog2 = remittanceRecipientDetailFragment2.IconCompatParcelizer;
        if (customInputDialog2 != null) {
            String string = remittanceRecipientDetailFragment2.getString(R.string.favorite_invalid_character);
            customInputDialog2.mErrorTextView.setVisibility(0);
            customInputDialog2.mErrorTextView.setText(string);
        }
    }

    public static final /* synthetic */ void read(TintInputViewGroup tintInputViewGroup, TextWatcher textWatcher, String str) {
        tintInputViewGroup.mEditText.removeTextChangedListener(textWatcher);
        tintInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher);
        tintInputViewGroup.setText(str);
        tintInputViewGroup.mEditText.setBackground(setLastBaselineToBottomHeight.write(tintInputViewGroup.getContext(), R.drawable.shape_gray_rounded_rectangle_with_focus_color));
        tintInputViewGroup.mErrorTextView.setVisibility(8);
        tintInputViewGroup.mEditText.setSelection(tintInputViewGroup.mEditText.getText().toString().length());
        tintInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        tintInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
    }

    /* JADX WARNING: Removed duplicated region for block: B:345:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment r24) {
        /*
            r0 = r24
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgReceivingBank
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "ivgReceivingBank"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x000b:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r1 = r3
        L_0x0015:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0025
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = r3
        L_0x0026:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtAccountType
            if (r1 != 0) goto L_0x002f
            java.lang.String r2 = "swtAccountType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x002f:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x0038
            r1 = r3
        L_0x0038:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x0048
            com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner r1 = r1.spinner
            int r1 = r1.getSelectedItemPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = r1
            goto L_0x0049
        L_0x0048:
            r6 = r3
        L_0x0049:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgBankCode
            if (r1 != 0) goto L_0x0052
            java.lang.String r2 = "ivgBankCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0052:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x005b
            r1 = r3
        L_0x005b:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x006b
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r7 = r1
            goto L_0x006c
        L_0x006b:
            r7 = r3
        L_0x006c:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAccountNumber
            if (r1 != 0) goto L_0x0075
            java.lang.String r2 = "ivgAccountNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0075:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x007e
            r1 = r3
        L_0x007e:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x008e
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r8 = r1
            goto L_0x008f
        L_0x008e:
            r8 = r3
        L_0x008f:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgSwiftCode
            if (r1 != 0) goto L_0x0098
            java.lang.String r2 = "ivgSwiftCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0098:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x00a1
            r1 = r3
        L_0x00a1:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x00b1
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r9 = r1
            goto L_0x00b2
        L_0x00b1:
            r9 = r3
        L_0x00b2:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtTitle
            if (r1 != 0) goto L_0x00bb
            java.lang.String r2 = "swtTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x00bb:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x00c4
            r1 = r3
        L_0x00c4:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x00d4
            com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner r1 = r1.spinner
            int r1 = r1.getSelectedItemPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10 = r1
            goto L_0x00d5
        L_0x00d4:
            r10 = r3
        L_0x00d5:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgFirstName
            if (r1 != 0) goto L_0x00de
            java.lang.String r2 = "ivgFirstName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x00de:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x00e7
            r1 = r3
        L_0x00e7:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x00f7
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r11 = r1
            goto L_0x00f8
        L_0x00f7:
            r11 = r3
        L_0x00f8:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgLastName
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = "ivgLastName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0101:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x010a
            r1 = r3
        L_0x010a:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x011a
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r12 = r1
            goto L_0x011b
        L_0x011a:
            r12 = r3
        L_0x011b:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgNationality
            if (r1 != 0) goto L_0x0124
            java.lang.String r2 = "ivgNationality"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0124:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x012d
            r1 = r3
        L_0x012d:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x013d
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r13 = r1
            goto L_0x013e
        L_0x013d:
            r13 = r3
        L_0x013e:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtIdentificationType
            if (r1 != 0) goto L_0x0147
            java.lang.String r2 = "swtIdentificationType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0147:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x0150
            r1 = r3
        L_0x0150:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x0160
            com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner r1 = r1.spinner
            int r1 = r1.getSelectedItemPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14 = r1
            goto L_0x0161
        L_0x0160:
            r14 = r3
        L_0x0161:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgIdentificationNumber
            if (r1 != 0) goto L_0x016a
            java.lang.String r2 = "ivgIdentificationNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x016a:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x0173
            r1 = r3
        L_0x0173:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0183
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r15 = r1
            goto L_0x0184
        L_0x0183:
            r15 = r3
        L_0x0184:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAddress
            if (r1 != 0) goto L_0x018d
            java.lang.String r2 = "ivgAddress"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x018d:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x0196
            r1 = r3
        L_0x0196:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01a7
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r16 = r1
            goto L_0x01a9
        L_0x01a7:
            r16 = r3
        L_0x01a9:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgCity
            if (r1 != 0) goto L_0x01b2
            java.lang.String r2 = "ivgCity"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x01b2:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x01bb
            r1 = r3
        L_0x01bb:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01cc
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r17 = r1
            goto L_0x01ce
        L_0x01cc:
            r17 = r3
        L_0x01ce:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgState
            if (r1 != 0) goto L_0x01d7
            java.lang.String r2 = "ivgState"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x01d7:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x01e0
            r1 = r3
        L_0x01e0:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01f1
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r18 = r1
            goto L_0x01f3
        L_0x01f1:
            r18 = r3
        L_0x01f3:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgPostcode
            if (r1 != 0) goto L_0x01fc
            java.lang.String r2 = "ivgPostcode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x01fc:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x0205
            r1 = r3
        L_0x0205:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0216
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r19 = r1
            goto L_0x0218
        L_0x0216:
            r19 = r3
        L_0x0218:
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etCountryCode
            if (r1 != 0) goto L_0x0221
            java.lang.String r2 = "etCountryCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0221:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x022a
            r1 = r3
        L_0x022a:
            com.scb.phone.view.custom.common.CustomEditText r1 = (com.scb.phone.view.custom.common.CustomEditText) r1
            if (r1 == 0) goto L_0x0233
            android.text.Editable r1 = r1.getText()
            goto L_0x0234
        L_0x0233:
            r1 = r3
        L_0x0234:
            java.lang.String r20 = java.lang.String.valueOf(r1)
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etPhoneNumber
            if (r1 != 0) goto L_0x0241
            java.lang.String r2 = "etPhoneNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0241:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x024a
            r1 = r3
        L_0x024a:
            com.scb.phone.view.custom.common.CustomEditText r1 = (com.scb.phone.view.custom.common.CustomEditText) r1
            if (r1 == 0) goto L_0x0253
            android.text.Editable r1 = r1.getText()
            goto L_0x0254
        L_0x0253:
            r1 = r3
        L_0x0254:
            java.lang.String r21 = java.lang.String.valueOf(r1)
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgEmail
            if (r1 != 0) goto L_0x0261
            java.lang.String r2 = "ivgEmail"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0261:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x026a
            r1 = r3
        L_0x026a:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x027b
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r22 = r1
            goto L_0x027d
        L_0x027b:
            r22 = r3
        L_0x027d:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtPurpose
            if (r1 != 0) goto L_0x0286
            java.lang.String r2 = "swtPurpose"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0286:
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getVisibility()
            if (r2 == 0) goto L_0x028f
            r1 = r3
        L_0x028f:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x02a0
            com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner r1 = r1.spinner
            int r1 = r1.getSelectedItemPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r23 = r1
            goto L_0x02a2
        L_0x02a0:
            r23 = r3
        L_0x02a2:
            o.nU r1 = new o.nU
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            o.nK r0 = r0.presenter
            if (r0 != 0) goto L_0x02b1
            java.lang.String r2 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x02b1:
            java.lang.String r2 = "input"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r2 = r1.setHasDecor
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x02c8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x02c6
            goto L_0x02c8
        L_0x02c6:
            r2 = r4
            goto L_0x02c9
        L_0x02c8:
            r2 = r5
        L_0x02c9:
            if (r2 == 0) goto L_0x0443
            java.lang.Integer r2 = r1.read
            if (r2 == 0) goto L_0x02d7
            int r2 = r2.intValue()
            if (r2 > 0) goto L_0x02d7
            r2 = r4
            goto L_0x02d8
        L_0x02d7:
            r2 = r5
        L_0x02d8:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.write
            if (r2 == 0) goto L_0x02ea
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x02e8
            goto L_0x02ea
        L_0x02e8:
            r2 = r4
            goto L_0x02eb
        L_0x02ea:
            r2 = r5
        L_0x02eb:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x02fd
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x02fb
            goto L_0x02fd
        L_0x02fb:
            r2 = r4
            goto L_0x02fe
        L_0x02fd:
            r2 = r5
        L_0x02fe:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaBrowserCompat$ItemReceiver
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r6 = r0.write
            if (r6 == 0) goto L_0x030d
            o.setCode r6 = r6.IconCompatParcelizer
            if (r6 == 0) goto L_0x030d
            java.util.List<java.lang.String> r6 = r6.read
            goto L_0x030e
        L_0x030d:
            r6 = r3
        L_0x030e:
            o.nC r7 = new o.nC
            r7.<init>(r2, r6)
            boolean r2 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.PlaybackStateCompat$CustomAction
            if (r2 == 0) goto L_0x0329
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0327
            goto L_0x0329
        L_0x0327:
            r2 = r4
            goto L_0x032a
        L_0x0329:
            r2 = r5
        L_0x032a:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.PlaybackStateCompat$CustomAction
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r6 = r0.write
            if (r6 == 0) goto L_0x0338
            o.setCode r6 = r6.setExpandedFormat
            if (r6 == 0) goto L_0x0338
            java.util.List<java.lang.String> r3 = r6.read
        L_0x0338:
            o.nC r6 = new o.nC
            r6.<init>(r2, r3)
            boolean r2 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            if (r2 == 0) goto L_0x0443
            java.lang.Integer r2 = r1.AlertController$RecycleListView
            if (r2 == 0) goto L_0x034f
            int r2 = r2.intValue()
            if (r2 > 0) goto L_0x034f
            r2 = r4
            goto L_0x0350
        L_0x034f:
            r2 = r5
        L_0x0350:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.RatingCompat
            if (r2 == 0) goto L_0x0362
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0360
            goto L_0x0362
        L_0x0360:
            r2 = r4
            goto L_0x0363
        L_0x0362:
            r2 = r5
        L_0x0363:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaSessionCompat$QueueItem
            if (r2 == 0) goto L_0x0375
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0373
            goto L_0x0375
        L_0x0373:
            r2 = r4
            goto L_0x0376
        L_0x0375:
            r2 = r5
        L_0x0376:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.ParcelableVolumeInfo
            if (r2 == 0) goto L_0x0388
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0386
            goto L_0x0388
        L_0x0386:
            r2 = r4
            goto L_0x0389
        L_0x0388:
            r2 = r5
        L_0x0389:
            if (r2 == 0) goto L_0x0443
            java.lang.Integer r2 = r1.MediaDescriptionCompat
            if (r2 == 0) goto L_0x0397
            int r2 = r2.intValue()
            if (r2 > 0) goto L_0x0397
            r2 = r4
            goto L_0x0398
        L_0x0397:
            r2 = r5
        L_0x0398:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaBrowserCompat$MediaItem
            if (r2 == 0) goto L_0x03aa
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x03a8
            goto L_0x03aa
        L_0x03a8:
            r2 = r4
            goto L_0x03ab
        L_0x03aa:
            r2 = r5
        L_0x03ab:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.IconCompatParcelizer
            if (r2 == 0) goto L_0x03bd
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x03bb
            goto L_0x03bd
        L_0x03bb:
            r2 = r4
            goto L_0x03be
        L_0x03bd:
            r2 = r5
        L_0x03be:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x03d0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x03ce
            goto L_0x03d0
        L_0x03ce:
            r2 = r4
            goto L_0x03d1
        L_0x03d0:
            r2 = r5
        L_0x03d1:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.PlaybackStateCompat
            if (r2 == 0) goto L_0x03e3
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x03e1
            goto L_0x03e3
        L_0x03e1:
            r2 = r4
            goto L_0x03e4
        L_0x03e3:
            r2 = r5
        L_0x03e4:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x03f6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x03f4
            goto L_0x03f6
        L_0x03f4:
            r2 = r4
            goto L_0x03f7
        L_0x03f6:
            r2 = r5
        L_0x03f7:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x0409
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0407
            goto L_0x0409
        L_0x0407:
            r2 = r4
            goto L_0x040a
        L_0x0409:
            r2 = r5
        L_0x040a:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaSessionCompat$Token
            if (r2 == 0) goto L_0x041c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x041a
            goto L_0x041c
        L_0x041a:
            r2 = r4
            goto L_0x041d
        L_0x041c:
            r2 = r5
        L_0x041d:
            if (r2 == 0) goto L_0x0443
            java.lang.String r2 = r1.MediaMetadataCompat
            if (r2 == 0) goto L_0x042f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r2 = r4
            goto L_0x0430
        L_0x042f:
            r2 = r5
        L_0x0430:
            if (r2 == 0) goto L_0x0443
            java.lang.Integer r1 = r1.f2895x50fd9e4a
            if (r1 == 0) goto L_0x043e
            int r1 = r1.intValue()
            if (r1 > 0) goto L_0x043e
            r1 = r4
            goto L_0x043f
        L_0x043e:
            r1 = r5
        L_0x043f:
            if (r1 == 0) goto L_0x0443
            r1 = r5
            goto L_0x0444
        L_0x0443:
            r1 = r4
        L_0x0444:
            o.nK$ParcelableVolumeInfo r2 = new o.nK$ParcelableVolumeInfo
            r2.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0450
            r4 = r5
        L_0x0450:
            if (r4 == 0) goto L_0x0457
            T r0 = r0.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x0457:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment):void");
    }

    private static /* synthetic */ void MediaBrowserCompat$ItemReceiver(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment, CustomEditText customEditText) {
        View view = customEditText;
        if (view.getVisibility() != 0) {
            view = null;
        }
        if (view != null) {
            customEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            customEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            customEditText.setOnPasteListener((CustomEditText.IconCompatParcelizer) null);
            customEditText.setOnBackListener((CustomEditText.write) null);
            customEditText.setFilter("^[a-zA-Z0-9 ]+$");
        }
    }

    private static /* synthetic */ void read(RemittanceRecipientDetailFragment remittanceRecipientDetailFragment, TintInputViewGroup tintInputViewGroup) {
        View view = tintInputViewGroup;
        if (view.getVisibility() != 0) {
            view = null;
        }
        if (view != null) {
            tintInputViewGroup.setFocusListener((View.OnFocusChangeListener) null);
            tintInputViewGroup.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            tintInputViewGroup.setOnPasteListener((CustomEditText.IconCompatParcelizer) null);
            tintInputViewGroup.setOnBackListener((CustomEditText.write) null);
            tintInputViewGroup.setFilter("^[a-zA-Z0-9 ]+$");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClicked() {
        /*
            r40 = this;
            r0 = r40
            androidx.fragment.app.FragmentActivity r1 = r40.getActivity()
            if (r1 == 0) goto L_0x0013
            androidx.fragment.app.FragmentActivity r1 = r40.getActivity()
            com.scb.phone.view.activity.BaseActivity r1 = (com.scb.phone.view.activity.BaseActivity) r1
            java.lang.String r2 = "outward_remittance_recipient_detail"
            r1.mo13676d_(r2)
        L_0x0013:
            android.widget.LinearLayout r1 = r0.llContainer
            if (r1 != 0) goto L_0x001c
            java.lang.String r2 = "llContainer"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x001c:
            r1.requestFocus()
            o.nK r1 = r0.presenter
            java.lang.String r2 = "presenter"
            if (r1 != 0) goto L_0x0028
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0028:
            com.scb.phone.view.custom.common.TintInputViewGroup r3 = r0.ivgEmail
            java.lang.String r4 = "ivgEmail"
            if (r3 != 0) goto L_0x0031
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0031:
            android.view.View r3 = (android.view.View) r3
            int r5 = r3.getVisibility()
            r6 = 0
            if (r5 == 0) goto L_0x003b
            r3 = r6
        L_0x003b:
            com.scb.phone.view.custom.common.TintInputViewGroup r3 = (com.scb.phone.view.custom.common.TintInputViewGroup) r3
            if (r3 == 0) goto L_0x004a
            com.scb.phone.view.custom.common.CustomEditText r3 = r3.mEditText
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            goto L_0x004b
        L_0x004a:
            r3 = r6
        L_0x004b:
            com.scb.phone.view.custom.common.TintNoteEditText r5 = r0.etNote
            java.lang.String r7 = "etNote"
            if (r5 != 0) goto L_0x0054
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0054:
            android.widget.EditText r5 = r5.mNoteEditText
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "etNote.note"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r8)
            java.lang.String r8 = "note"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r8)
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x0080
            o.PhenotypeFlag$zza r10 = r1.IconCompatParcelizer
            if (r3 != 0) goto L_0x0072
            r3 = r9
            goto L_0x007c
        L_0x0072:
            java.util.regex.Pattern r10 = r10.IconCompatParcelizer
            java.util.regex.Matcher r3 = r10.matcher(r3)
            boolean r3 = r3.matches()
        L_0x007c:
            if (r3 != 0) goto L_0x0080
            r3 = r9
            goto L_0x0081
        L_0x0080:
            r3 = r8
        L_0x0081:
            r10 = r5
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = p040o.GoodToKnowActivity.read(r10)
            if (r10 != 0) goto L_0x009c
            java.lang.String r10 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            java.util.regex.Matcher r5 = r10.matcher(r5)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x009c
            r5 = r9
            goto L_0x009d
        L_0x009c:
            r5 = r8
        L_0x009d:
            if (r3 != 0) goto L_0x00b1
            o.nK$RatingCompat r10 = p040o.C5010nK.RatingCompat.read
            o.writeUInt64NoTag$IconCompatParcelizer r10 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r10
            T r11 = r1.RatingCompat
            if (r11 == 0) goto L_0x00a9
            r11 = r8
            goto L_0x00aa
        L_0x00a9:
            r11 = r9
        L_0x00aa:
            if (r11 == 0) goto L_0x00b1
            T r11 = r1.RatingCompat
            r10.IconCompatParcelizer(r11)
        L_0x00b1:
            if (r5 != 0) goto L_0x00c5
            o.nK$MediaMetadataCompat r10 = p040o.C5010nK.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r10 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r10
            T r11 = r1.RatingCompat
            if (r11 == 0) goto L_0x00bd
            r11 = r8
            goto L_0x00be
        L_0x00bd:
            r11 = r9
        L_0x00be:
            if (r11 == 0) goto L_0x00c5
            T r1 = r1.RatingCompat
            r10.IconCompatParcelizer(r1)
        L_0x00c5:
            if (r3 == 0) goto L_0x00cb
            if (r5 == 0) goto L_0x00cb
            r1 = r8
            goto L_0x00cc
        L_0x00cb:
            r1 = r9
        L_0x00cc:
            if (r1 == 0) goto L_0x04e8
            o.HmlVerifyEmailActivity r1 = r0.ParcelableVolumeInfo
            java.lang.Object r1 = r1.MediaBrowserCompat$CustomActionResultReceiver()
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r1 = (p040o.C3092xce3d994b.Builder) r1
            int[] r3 = p040o.ActivityBuilder_ContributePrepaidRequestActivity.IconCompatParcelizer
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r8) goto L_0x045d
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgReceivingBank
            if (r1 != 0) goto L_0x00e9
            java.lang.String r3 = "ivgReceivingBank"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00e9:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x00f2
            r1 = r6
        L_0x00f2:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0102
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r11 = r1
            goto L_0x0103
        L_0x0102:
            r11 = r6
        L_0x0103:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtAccountType
            if (r1 != 0) goto L_0x010c
            java.lang.String r3 = "swtAccountType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x010c:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0115
            r1 = r6
        L_0x0115:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver()
            r12 = r1
            goto L_0x0120
        L_0x011f:
            r12 = r6
        L_0x0120:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgBankCode
            if (r1 != 0) goto L_0x0129
            java.lang.String r3 = "ivgBankCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0129:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0132
            r1 = r6
        L_0x0132:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0142
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r13 = r1
            goto L_0x0143
        L_0x0142:
            r13 = r6
        L_0x0143:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAccountNumber
            if (r1 != 0) goto L_0x014c
            java.lang.String r3 = "ivgAccountNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x014c:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0155
            r1 = r6
        L_0x0155:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0165
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r14 = r1
            goto L_0x0166
        L_0x0165:
            r14 = r6
        L_0x0166:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgSwiftCode
            if (r1 != 0) goto L_0x016f
            java.lang.String r3 = "ivgSwiftCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x016f:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0178
            r1 = r6
        L_0x0178:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0188
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r15 = r1
            goto L_0x0189
        L_0x0188:
            r15 = r6
        L_0x0189:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtTitle
            if (r1 != 0) goto L_0x0192
            java.lang.String r3 = "swtTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0192:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x019b
            r1 = r6
        L_0x019b:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x01a6
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver()
            r16 = r1
            goto L_0x01a8
        L_0x01a6:
            r16 = r6
        L_0x01a8:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgFirstName
            if (r1 != 0) goto L_0x01b1
            java.lang.String r3 = "ivgFirstName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x01b1:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x01ba
            r1 = r6
        L_0x01ba:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01cb
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r17 = r1
            goto L_0x01cd
        L_0x01cb:
            r17 = r6
        L_0x01cd:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgLastName
            if (r1 != 0) goto L_0x01d6
            java.lang.String r3 = "ivgLastName"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x01d6:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x01df
            r1 = r6
        L_0x01df:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x01f0
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r18 = r1
            goto L_0x01f2
        L_0x01f0:
            r18 = r6
        L_0x01f2:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgNationality
            if (r1 != 0) goto L_0x01fb
            java.lang.String r3 = "ivgNationality"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x01fb:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0204
            r1 = r6
        L_0x0204:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0215
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r19 = r1
            goto L_0x0217
        L_0x0215:
            r19 = r6
        L_0x0217:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtIdentificationType
            if (r1 != 0) goto L_0x0220
            java.lang.String r3 = "swtIdentificationType"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0220:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0229
            r1 = r6
        L_0x0229:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x0234
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver()
            r20 = r1
            goto L_0x0236
        L_0x0234:
            r20 = r6
        L_0x0236:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgIdentificationNumber
            if (r1 != 0) goto L_0x023f
            java.lang.String r3 = "ivgIdentificationNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x023f:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0248
            r1 = r6
        L_0x0248:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x0259
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r21 = r1
            goto L_0x025b
        L_0x0259:
            r21 = r6
        L_0x025b:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgAddress
            if (r1 != 0) goto L_0x0264
            java.lang.String r3 = "ivgAddress"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0264:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x026d
            r1 = r6
        L_0x026d:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x027e
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r22 = r1
            goto L_0x0280
        L_0x027e:
            r22 = r6
        L_0x0280:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgCity
            if (r1 != 0) goto L_0x0289
            java.lang.String r3 = "ivgCity"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0289:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0292
            r1 = r6
        L_0x0292:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x02a3
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r23 = r1
            goto L_0x02a5
        L_0x02a3:
            r23 = r6
        L_0x02a5:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgState
            if (r1 != 0) goto L_0x02ae
            java.lang.String r3 = "ivgState"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x02ae:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x02b7
            r1 = r6
        L_0x02b7:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x02c8
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r24 = r1
            goto L_0x02ca
        L_0x02c8:
            r24 = r6
        L_0x02ca:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgPostcode
            if (r1 != 0) goto L_0x02d3
            java.lang.String r3 = "ivgPostcode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x02d3:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x02dc
            r1 = r6
        L_0x02dc:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x02ed
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r25 = r1
            goto L_0x02ef
        L_0x02ed:
            r25 = r6
        L_0x02ef:
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etCountryCode
            if (r1 != 0) goto L_0x02f8
            java.lang.String r3 = "etCountryCode"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x02f8:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0301
            r1 = r6
        L_0x0301:
            com.scb.phone.view.custom.common.CustomEditText r1 = (com.scb.phone.view.custom.common.CustomEditText) r1
            if (r1 == 0) goto L_0x0312
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0312
            java.lang.String r1 = r1.toString()
            r26 = r1
            goto L_0x0314
        L_0x0312:
            r26 = r6
        L_0x0314:
            com.scb.phone.view.custom.common.CustomEditText r1 = r0.etPhoneNumber
            if (r1 != 0) goto L_0x031d
            java.lang.String r3 = "etPhoneNumber"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x031d:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0326
            r1 = r6
        L_0x0326:
            com.scb.phone.view.custom.common.CustomEditText r1 = (com.scb.phone.view.custom.common.CustomEditText) r1
            if (r1 == 0) goto L_0x0337
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0337
            java.lang.String r1 = r1.toString()
            r27 = r1
            goto L_0x0339
        L_0x0337:
            r27 = r6
        L_0x0339:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = r0.ivgEmail
            if (r1 != 0) goto L_0x0340
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0340:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x0349
            r1 = r6
        L_0x0349:
            com.scb.phone.view.custom.common.TintInputViewGroup r1 = (com.scb.phone.view.custom.common.TintInputViewGroup) r1
            if (r1 == 0) goto L_0x035a
            com.scb.phone.view.custom.common.CustomEditText r1 = r1.mEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r28 = r1
            goto L_0x035c
        L_0x035a:
            r28 = r6
        L_0x035c:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = r0.swtPurpose
            if (r1 != 0) goto L_0x0365
            java.lang.String r3 = "swtPurpose"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0365:
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getVisibility()
            if (r3 == 0) goto L_0x036e
            r1 = r6
        L_0x036e:
            com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle r1 = (com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle) r1
            if (r1 == 0) goto L_0x0379
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver()
            r29 = r1
            goto L_0x037b
        L_0x0379:
            r29 = r6
        L_0x037b:
            com.scb.phone.view.custom.common.TintNoteEditText r1 = r0.etNote
            if (r1 != 0) goto L_0x0382
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0382:
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0396
            r3 = r8
            goto L_0x0397
        L_0x0396:
            r3 = r9
        L_0x0397:
            if (r3 != 0) goto L_0x039a
            r6 = r1
        L_0x039a:
            r30 = r6
            java.lang.String r30 = (java.lang.String) r30
            o.nS r1 = new o.nS
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            o.nK r3 = r0.presenter
            if (r3 != 0) goto L_0x03ab
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x03ab:
            java.lang.String r2 = "input"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r2 = r3.write
            if (r2 == 0) goto L_0x045c
            java.lang.String r11 = r2.f2679x50fd9e4a
            java.lang.String r12 = r2.RatingCompat
            java.lang.String r13 = r2.MediaBrowserCompat$MediaItem
            java.lang.String r14 = r2.ParcelableVolumeInfo
            double r4 = r2.MediaBrowserCompat$SearchResultReceiver
            r15 = r4
            java.lang.String r4 = r2.write
            r17 = r4
            java.lang.String r4 = r2.read
            r18 = r4
            java.lang.String r4 = r1.setHasDecor
            r19 = r4
            java.lang.String r4 = r1.read
            r20 = r4
            java.lang.String r4 = r1.IconCompatParcelizer
            r21 = r4
            java.lang.String r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r22 = r4
            java.lang.String r4 = r1.PlaybackStateCompat
            r23 = r4
            java.lang.String r4 = r1.AlertController$RecycleListView
            r24 = r4
            java.lang.String r4 = r1.MediaDescriptionCompat
            r25 = r4
            java.lang.String r4 = r1.f5547x50fd9e4a
            r26 = r4
            java.lang.String r4 = r1.ParcelableVolumeInfo
            r27 = r4
            java.lang.String r4 = r1.MediaSessionCompat$Token
            r28 = r4
            java.lang.String r4 = r1.MediaMetadataCompat
            r29 = r4
            java.lang.String r4 = r1.MediaBrowserCompat$ItemReceiver
            r30 = r4
            java.lang.String r4 = r1.RatingCompat
            r31 = r4
            java.lang.String r4 = r1.Keep
            r32 = r4
            java.lang.String r4 = r1.MediaSessionCompat$ResultReceiverWrapper
            r33 = r4
            java.lang.String r4 = r1.MediaBrowserCompat$MediaItem
            r34 = r4
            java.lang.String r4 = r1.MediaSessionCompat$QueueItem
            r35 = r4
            java.lang.String r4 = r1.MediaBrowserCompat$SearchResultReceiver
            r36 = r4
            java.lang.String r4 = r1.PlaybackStateCompat$CustomAction
            r37 = r4
            java.lang.String r1 = r1.write
            r38 = r1
            java.lang.String r1 = r2.MediaSessionCompat$ResultReceiverWrapper
            r39 = r1
            o.validateEntries r1 = new o.validateEntries
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            T r2 = r3.RatingCompat
            if (r2 == 0) goto L_0x0426
            goto L_0x0427
        L_0x0426:
            r8 = r9
        L_0x0427:
            if (r8 == 0) goto L_0x042e
            T r2 = r3.RatingCompat
            r2.AlertController$RecycleListView()
        L_0x042e:
            o.AbstractIterator$State r2 = r3.MediaBrowserCompat$ItemReceiver
            java.lang.String r4 = "request"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            o.AbstractMultiset r4 = r2.IconCompatParcelizer
            o.DebitCardResetOtpActivity r1 = r4.MediaBrowserCompat$ItemReceiver((p040o.validateEntries) r1)
            o.nK r3 = (p040o.C5010nK) r3
            o.nJ r4 = new o.nJ
            o.nK$MediaSessionCompat$ResultReceiverWrapper r5 = new o.nK$MediaSessionCompat$ResultReceiverWrapper
            r5.<init>(r3)
            o.FundFactSheetActivity r5 = (p040o.FundFactSheetActivity) r5
            r4.<init>(r5)
            o.DebitCardMarketConductDeepLinkActivity r4 = (p040o.DebitCardMarketConductDeepLinkActivity) r4
            o.nJ r5 = new o.nJ
            o.nK$MediaSessionCompat$QueueItem r6 = new o.nK$MediaSessionCompat$QueueItem
            r6.<init>(r3)
            o.FundFactSheetActivity r6 = (p040o.FundFactSheetActivity) r6
            r5.<init>(r6)
            o.DebitCardMarketConductDeepLinkActivity r5 = (p040o.DebitCardMarketConductDeepLinkActivity) r5
            r2.read(r1, r4, r5)
        L_0x045c:
            return
        L_0x045d:
            android.content.Context r1 = r40.getContext()
            com.scb.phone.view.custom.common.CustomInputDialog r1 = com.scb.phone.view.custom.common.CustomInputDialog.MediaBrowserCompat$ItemReceiver(r1)
            r2 = 2131755682(0x7f1002a2, float:1.914225E38)
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x0478
            android.widget.TextView r3 = r1.mTitleTextView
            r3.setVisibility(r9)
            android.widget.TextView r3 = r1.mTitleTextView
            r3.setText(r2)
        L_0x0478:
            android.widget.EditText r2 = r1.mEditTextView
            r3 = 2131757302(0x7f1008f6, float:1.9145536E38)
            r2.setHint(r3)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$read r2 = r0.MediaMetadataCompat
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            android.widget.EditText r3 = r1.mEditTextView
            r3.addTextChangedListener(r2)
            android.text.InputFilter[] r2 = new android.text.InputFilter[r8]
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            r4 = 20
            r3.<init>(r4)
            r2[r9] = r3
            android.widget.EditText r3 = r1.mEditTextView
            r3.setFilters(r2)
            r1.setCanceledOnTouchOutside(r9)
            android.widget.EditText r2 = r1.mEditTextView
            r2.setVisibility(r9)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$ParcelableVolumeInfo r2 = com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.ParcelableVolumeInfo.IconCompatParcelizer
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            android.content.Context r3 = r1.MediaBrowserCompat$ItemReceiver
            r4 = 2131756397(0x7f10056d, float:1.91437E38)
            java.lang.String r3 = r3.getString(r4)
            r1.write(r3, r2)
            r2 = 2131757073(0x7f100811, float:1.9145071E38)
            java.lang.String r2 = r0.getString(r2)
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$Token r3 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaSessionCompat$Token
            r3.<init>(r0)
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            if (r2 == 0) goto L_0x04d0
            android.widget.Button r4 = r1.mPositiveButton
            r4.setText(r2)
            android.widget.Button r2 = r1.mPositiveButton
            o.getRegistrationsAddresses r4 = new o.getRegistrationsAddresses
            r4.<init>(r1, r3, r9)
            r2.setOnClickListener(r4)
        L_0x04d0:
            r0.IconCompatParcelizer = r1
            com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r1 = new com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r1.<init>(r0)
            com.scb.phone.view.fragment.BaseFragment$write r1 = (com.scb.phone.view.fragment.BaseFragment.write) r1
            boolean r2 = r40.isAdded()
            if (r2 == 0) goto L_0x04e8
            androidx.fragment.app.FragmentActivity r2 = r40.getActivity()
            if (r2 == 0) goto L_0x04e8
            r1.MediaBrowserCompat$ItemReceiver(r2)
        L_0x04e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceRecipientDetailFragment.onButtonClicked():void");
    }
}
