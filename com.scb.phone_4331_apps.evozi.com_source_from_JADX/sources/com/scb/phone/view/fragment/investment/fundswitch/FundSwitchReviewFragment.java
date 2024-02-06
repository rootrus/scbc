package com.scb.phone.view.fragment.investment.fundswitch;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundActionsSuccessActivity;
import com.scb.phone.view.custom.common.CustomSwitchItem;
import com.scb.phone.view.custom.investment.CustomHyperLinkTextView;
import com.scb.phone.view.fragment.investment.BaseInvestmentSwitchSuccessReviewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CrashlyticsFileMarker;
import p040o.EmptyImmutableSet;
import p040o.ExecutorUtils;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaLink;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.access$2200;
import p040o.checkForPreviousCrash;
import p040o.forEachMultiply;
import p040o.newCheckParameters;
import p040o.onGetStartedClick;
import p040o.setSearchDirection;
import p040o.setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class FundSwitchReviewFragment extends BaseInvestmentSwitchSuccessReviewFragment implements newCheckParameters, CustomHyperLinkTextView.IconCompatParcelizer.write {
    @BindView
    public Button btConfirm;
    @BindView
    public CheckBox cbComplexDisclaimer;
    @BindView
    public LinearLayout linearLayoutVulnerableInvestorContainer;
    @BindView
    public LinearLayout llComplexDisclaimer;
    @BindView
    public LinearLayout llDisclaimerContainer;
    @BindView
    public LinearLayout llLtfContainer;
    @BindView
    public RadioButton rbHoldingNo;
    @BindView
    public RadioButton rbHoldingYes;
    @BindView
    public RadioButton rbRedeem;
    @BindView
    public RadioButton rbTransfer;
    @HmlPinActivity
    public setSearchDirection switchReviewPresenter;
    @BindView
    public TextView textViewVulnerableDisclaimer;
    @BindView
    public CustomHyperLinkTextView tvComplexDisclaimerMessage;
    @BindView
    public TextView tvDisclaimerMessage;
    @BindView
    public TextView tvPayDisclaimerMessage;
    @BindView
    public TextView tvTransactionDate;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r8 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r8)
            r8 = 0
            r0 = 2131494232(0x7f0c0558, float:1.8611967E38)
            android.view.View r6 = r6.inflate(r0, r7, r8)
            r5.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)
            o.setSearchDirection r7 = r5.switchReviewPresenter
            java.lang.String r0 = "switchReviewPresenter"
            if (r7 != 0) goto L_0x0019
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0019:
            r1 = r5
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r7.MediaBrowserCompat$ItemReceiver(r1)
            androidx.fragment.app.FragmentActivity r7 = r5.getActivity()
            if (r7 == 0) goto L_0x0132
            android.content.Intent r7 = r7.getIntent()
            if (r7 == 0) goto L_0x0132
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto L_0x0132
            java.lang.String r1 = "SWITCH_VERIFICATION_DETAILS"
            android.os.Parcelable r7 = r7.getParcelable(r1)
            o.ExecutorUtils$1 r7 = (p040o.ExecutorUtils.C33371) r7
            if (r7 == 0) goto L_0x0132
            java.lang.String r1 = "display"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r1)
            o.isBuildIdValid r1 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            android.content.Context r2 = r5.getContext()
            java.lang.String r3 = "ACCOUNT_MASKING_REVIEW"
            super.read(r1, r6, r2, r3)
            o.setSearchDirection r1 = r5.switchReviewPresenter
            if (r1 != 0) goto L_0x0054
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0054:
            java.lang.String r0 = "switchVerificationDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            r1.write = r7
            o.setSearchDirection$MediaBrowserCompat$MediaItem r0 = new o.setSearchDirection$MediaBrowserCompat$MediaItem
            r0.<init>(r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r1.RatingCompat
            r3 = 1
            if (r2 == 0) goto L_0x0069
            r2 = r3
            goto L_0x006a
        L_0x0069:
            r2 = r8
        L_0x006a:
            if (r2 == 0) goto L_0x0071
            T r2 = r1.RatingCompat
            r0.IconCompatParcelizer(r2)
        L_0x0071:
            boolean r0 = r7.MediaBrowserCompat$ItemReceiver()
            java.lang.String r2 = r7.mo27462x50fd9e4a()
            java.lang.String r4 = "switchVerificationDisplay.vulnerableDisclaimer"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r4)
            if (r0 == 0) goto L_0x0093
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x008d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x008d
            r0 = r8
            goto L_0x008e
        L_0x008d:
            r0 = r3
        L_0x008e:
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0093
            r0 = r3
            goto L_0x0094
        L_0x0093:
            r0 = r8
        L_0x0094:
            o.setSearchDirection$MediaDescriptionCompat r4 = new o.setSearchDirection$MediaDescriptionCompat
            r4.<init>(r2)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            r1.write(r0, r4)
            o.isBuildIdValid r0 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 == 0) goto L_0x00a7
            o.CrashlyticsFileMarker r0 = r0.setHasDecor
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            o.setSearchDirection$write r2 = new o.setSearchDirection$write
            r2.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x00b5
            r0 = r3
            goto L_0x00b6
        L_0x00b5:
            r0 = r8
        L_0x00b6:
            if (r0 == 0) goto L_0x00bd
            T r0 = r1.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x00bd:
            java.lang.String r0 = r7.read()
            java.lang.String r2 = "switchVerificationDisplay.complexFundDisclaimer"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r2)
            o.setSearchDirection$read r2 = new o.setSearchDirection$read
            r2.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x00d3
            r0 = r3
            goto L_0x00d4
        L_0x00d3:
            r0 = r8
        L_0x00d4:
            if (r0 == 0) goto L_0x00db
            T r0 = r1.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x00db:
            java.lang.String r0 = r7.MediaBrowserCompat$SearchResultReceiver()
            java.lang.String r2 = r7.RatingCompat()
            o.setSearchDirection$IconCompatParcelizer r4 = new o.setSearchDirection$IconCompatParcelizer
            r4.<init>(r7, r2, r0)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x00f0
            r0 = r3
            goto L_0x00f1
        L_0x00f0:
            r0 = r8
        L_0x00f1:
            if (r0 == 0) goto L_0x00f8
            T r0 = r1.RatingCompat
            r4.IconCompatParcelizer(r0)
        L_0x00f8:
            java.lang.String r0 = r7.MediaDescriptionCompat()
            java.lang.String r2 = "switchVerificationDisplay.statementOfHolding"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r2)
            o.setSearchDirection$MediaBrowserCompat$SearchResultReceiver r2 = new o.setSearchDirection$MediaBrowserCompat$SearchResultReceiver
            r2.<init>(r1, r0)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x010e
            r0 = r3
            goto L_0x010f
        L_0x010e:
            r0 = r8
        L_0x010f:
            if (r0 == 0) goto L_0x0116
            T r0 = r1.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x0116:
            java.lang.String r7 = r7.IconCompatParcelizer()
            java.lang.String r0 = "switchVerificationDisplay.ltfConditionFlag"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r0)
            o.setSearchDirection$MediaBrowserCompat$ItemReceiver r0 = new o.setSearchDirection$MediaBrowserCompat$ItemReceiver
            r0.<init>(r1, r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r7 = r1.RatingCompat
            if (r7 == 0) goto L_0x012b
            r8 = r3
        L_0x012b:
            if (r8 == 0) goto L_0x0132
            T r7 = r1.RatingCompat
            r0.IconCompatParcelizer(r7)
        L_0x0132:
            super.setTransitioning()
            r5.ActionBarContextView()
            r5.setActionBarVisibilityCallback()
            androidx.fragment.app.FragmentActivity r7 = r5.getActivity()
            if (r7 == 0) goto L_0x014c
            androidx.fragment.app.FragmentActivity r7 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r7 = (com.scb.phone.view.activity.BaseActivity) r7
            java.lang.String r8 = "mfschedule_switchreview"
            r7.mo13676d_(r8)
        L_0x014c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.fundswitch.FundSwitchReviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
    }

    public final void MediaSessionCompat$QueueItem() {
        forEachMultiply foreachmultiply = new forEachMultiply();
        foreachmultiply.MediaBrowserCompat$ItemReceiver(new ZSYR2K("feature", "switch"));
        ZTBSV ztbsv = foreachmultiply;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mf_complexfund");
        }
    }

    @OnClick
    public final void onConfirmButtonClick() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        if (setsearchdirection.RatingCompat != null) {
            setsearchdirection.RatingCompat.AlertController$RecycleListView();
        }
        StreetViewPanoramaLink streetViewPanoramaLink = setsearchdirection.read;
        ExecutorUtils.C33371 r2 = setsearchdirection.write;
        if (r2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchVerificationDisplay");
        }
        streetViewPanoramaLink.MediaBrowserCompat$CustomActionResultReceiver(new EmptyImmutableSet(r2.MediaSessionCompat$Token(), setsearchdirection.IconCompatParcelizer, setsearchdirection.MediaBrowserCompat$ItemReceiver));
        StreetViewPanoramaLink streetViewPanoramaLink2 = setsearchdirection.read;
        ExecutorUtils.C33371 r22 = setsearchdirection.write;
        if (r22 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchVerificationDisplay");
        }
        streetViewPanoramaLink2.IconCompatParcelizer(new setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver(setsearchdirection, r22, setsearchdirection.IconCompatParcelizer));
    }

    @OnClick
    public final void onHoldingYesRadioButtonClicked() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        onGetStartedClick.write((Object) "Y", "statementOfHolding");
        setsearchdirection.IconCompatParcelizer = "Y";
    }

    @OnClick
    public final void onHoldingNoRadioButtonClicked() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        onGetStartedClick.write((Object) "N", "statementOfHolding");
        setsearchdirection.IconCompatParcelizer = "N";
    }

    public final void write(access$2200 access_2200) {
        onGetStartedClick.write((Object) access_2200, "errorDisplay");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("REVIEW_IS_ERROR", true);
            activity.setResult(0, intent);
        }
        super.write(access_2200);
    }

    @OnClick
    public final void onTransferRadioButtonClicked() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        onGetStartedClick.write((Object) DiskLruCache.VERSION_1, "conditionFlag");
        setsearchdirection.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new setSearchDirection.MediaMetadataCompat(DiskLruCache.VERSION_1);
        if (setsearchdirection.RatingCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(setsearchdirection.RatingCompat);
        }
    }

    @OnClick
    public final void onRedeemRadioButtonClicked() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        onGetStartedClick.write((Object) "2", "conditionFlag");
        setsearchdirection.MediaBrowserCompat$ItemReceiver = "2";
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new setSearchDirection.MediaMetadataCompat("2");
        if (setsearchdirection.RatingCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(setsearchdirection.RatingCompat);
        }
    }

    public final void read(checkForPreviousCrash checkforpreviouscrash) {
        onGetStartedClick.write((Object) checkforpreviouscrash, "display");
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = FundActionsSuccessActivity.MediaBrowserCompat$ItemReceiver(context, checkforpreviouscrash);
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
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        LinearLayout linearLayout = this.llLtfContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llLtfContainer");
        }
        linearLayout.setVisibility(0);
        TextView textView = this.tvDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimerMessage");
        }
        textView.setText(str);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        TextView textView = this.tvDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimerMessage");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        TextView textView = this.tvDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimerMessage");
        }
        textView.setText(str);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo38187x50fd9e4a() {
        ParcelableVolumeInfo(getString(R.string.mf_switch_review_1));
    }

    public final void MediaMetadataCompat() {
        ParcelableVolumeInfo(getString(R.string.mf_switch_review_schedule_1));
    }

    public final void RatingCompat(String str) {
        onGetStartedClick.write((Object) str, "transactionDate");
        TextView textView = this.tvTransactionDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTransactionDate");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem() {
        RadioButton radioButton = this.rbHoldingYes;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbHoldingYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbHoldingNo;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton3.setEnabled(false);
    }

    public final void RatingCompat() {
        RadioButton radioButton = this.rbHoldingNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbHoldingYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingYes");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbHoldingNo;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton3.setEnabled(false);
    }

    public final void write() {
        RadioButton radioButton = this.rbHoldingNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbHoldingNo");
        }
        radioButton.setChecked(true);
    }

    public final void write(CrashlyticsFileMarker crashlyticsFileMarker) {
        onGetStartedClick.write((Object) crashlyticsFileMarker, "investmentScheduleDisplay");
        read(crashlyticsFileMarker);
        CustomSwitchItem customSwitchItem = this.switchDate;
        onGetStartedClick.IconCompatParcelizer((Object) customSwitchItem, "switchDate");
        customSwitchItem.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        LinearLayout linearLayout = this.llDisclaimerContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llDisclaimerContainer");
        }
        linearLayout.setVisibility(i);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        LinearLayout linearLayout = this.llComplexDisclaimer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llComplexDisclaimer");
        }
        linearLayout.setVisibility(0);
        CustomHyperLinkTextView customHyperLinkTextView = this.tvComplexDisclaimerMessage;
        if (customHyperLinkTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvComplexDisclaimerMessage");
        }
        customHyperLinkTextView.setTextViewHTML(str);
        CustomHyperLinkTextView customHyperLinkTextView2 = this.tvComplexDisclaimerMessage;
        if (customHyperLinkTextView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvComplexDisclaimerMessage");
        }
        customHyperLinkTextView2.setMovementMethod(new CustomHyperLinkTextView.IconCompatParcelizer(this));
        CheckBox checkBox = this.cbComplexDisclaimer;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbComplexDisclaimer");
        }
        checkBox.setOnCheckedChangeListener(new FundSwitchReviewFragment$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        LinearLayout linearLayout = this.llComplexDisclaimer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llComplexDisclaimer");
        }
        linearLayout.setVisibility(8);
        Button button = this.btConfirm;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btConfirm");
        }
        button.setEnabled(true);
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        LinearLayout linearLayout = this.linearLayoutVulnerableInvestorContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("linearLayoutVulnerableInvestorContainer");
        }
        linearLayout.setVisibility(0);
        TextView textView = this.textViewVulnerableDisclaimer;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textViewVulnerableDisclaimer");
        }
        textView.setText(str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        TextView textView = this.tvPayDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView.setVisibility(0);
        TextView textView2 = this.tvPayDisclaimerMessage;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView2.setText(R.string.review_transfer_disclaimer_message);
    }

    public final void MediaDescriptionCompat() {
        TextView textView = this.tvPayDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView.setVisibility(0);
        TextView textView2 = this.tvPayDisclaimerMessage;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView2.setText(R.string.review_redeem_disclaimer_message);
    }

    public final void IconCompatParcelizer() {
        RadioButton radioButton = this.rbTransfer;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbTransfer");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbTransfer;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbTransfer");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbRedeem;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbRedeem");
        }
        radioButton3.setEnabled(false);
        TextView textView = this.tvPayDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView.setText(R.string.review_transfer_disclaimer_message);
        TextView textView2 = this.tvPayDisclaimerMessage;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView2.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RadioButton radioButton = this.rbRedeem;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbRedeem");
        }
        radioButton.setChecked(true);
        RadioButton radioButton2 = this.rbTransfer;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbTransfer");
        }
        radioButton2.setEnabled(false);
        RadioButton radioButton3 = this.rbRedeem;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbRedeem");
        }
        radioButton3.setEnabled(false);
        TextView textView = this.tvPayDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView.setText(R.string.review_redeem_disclaimer_message);
        TextView textView2 = this.tvPayDisclaimerMessage;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView2.setVisibility(0);
    }

    public final void read() {
        TextView textView = this.tvPayDisclaimerMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPayDisclaimerMessage");
        }
        textView.setVisibility(0);
        RadioButton radioButton = this.rbTransfer;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rbTransfer");
        }
        radioButton.setChecked(true);
    }

    public final void onDestroy() {
        setSearchDirection setsearchdirection = this.switchReviewPresenter;
        if (setsearchdirection == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("switchReviewPresenter");
        }
        setsearchdirection.onDestroy();
        super.onDestroy();
    }
}
