package com.scb.phone.view.fragment.investment.purchase;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundActionsSuccessActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.investment.CustomHyperLinkTextView;
import com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CheckParameters;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.checkForPreviousCrash;
import p040o.forEachMultiply;
import p040o.getGlobalBitmap;
import p040o.getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.isPartialView;
import p040o.setTapText;

public class FundPurchaseReviewFragment extends BaseInvestmentSuccessReviewFragment implements CheckParameters.write, CustomHyperLinkTextView.IconCompatParcelizer.write {
    @BindView
    LinearLayout linearLayoutVulnerableInvestorContainer;
    @BindView
    DefaultButton mBtnContinue;
    @BindView
    TextView mDisclaimerMessage;
    @BindView
    View mDisclaimerSeparator;
    @BindView
    RadioGroup mHoldingGroup;
    @BindView
    RadioButton mHoldingNo;
    @BindView
    RadioButton mHoldingYes;
    @BindView
    LinearLayout mLayoutComplexFundDisclaimer;
    @BindView
    TextView mLtfDisclaimerMessage;
    @BindView
    LinearLayout mLtfSection;
    @BindView
    TextView mPayDisclaimerMessage;
    @BindView
    RadioButton mRedeemYes;
    @BindView
    TextView mTransactionDate;
    @BindView
    RadioGroup mTransferGroup;
    @BindView
    RadioButton mTransferYes;
    @BindView
    CustomHyperLinkTextView mTvComplexFundDisclaimer;
    @HmlPinActivity
    public getGlobalBitmap purchaseReviewPresenter;
    @BindView
    TextView textViewVulnerableDisclaimer;

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r13 = 0
            r0 = 2131494143(0x7f0c04ff, float:1.8611786E38)
            android.view.View r11 = r11.inflate(r0, r12, r13)
            butterknife.ButterKnife.IconCompatParcelizer(r10, r11)
            o.getGlobalBitmap r12 = r10.purchaseReviewPresenter
            r12.MediaBrowserCompat$ItemReceiver(r10)
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            if (r12 == 0) goto L_0x01d6
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            if (r12 == 0) goto L_0x01d6
            o.getGlobalBitmap r12 = r10.purchaseReviewPresenter
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "PURCHASE_FUND_DETAILS"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            o.getOsBuildVersionString r0 = (p040o.getOsBuildVersionString) r0
            r12.IconCompatParcelizer = r0
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            if (r12 == 0) goto L_0x01d6
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            if (r12 == 0) goto L_0x01d6
            o.isBuildIdValid r12 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsFileMarker r12 = r12.setHasDecor
            if (r12 != 0) goto L_0x0050
            r12 = 2131760652(0x7f10160c, float:1.915233E38)
            goto L_0x0053
        L_0x0050:
            r12 = 2131760651(0x7f10160b, float:1.9152329E38)
        L_0x0053:
            java.lang.String r12 = r10.getString(r12)
            r10.ParcelableVolumeInfo(r12)
            o.isBuildIdValid r12 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            r10.getContext()
            o.getGlobalBitmap r1 = r10.purchaseReviewPresenter
            o.StreetViewPanoramaLink r1 = r1.MediaBrowserCompat$ItemReceiver
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.IconCompatParcelizer
            boolean r1 = r1.setItemInvoker()
            java.lang.String r2 = "ACCOUNT_MASKING_REVIEW"
            super.IconCompatParcelizer(r12, r11, r2, r1)
            o.isBuildIdValid r12 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsFileMarker r12 = r12.setHasDecor
            if (r12 == 0) goto L_0x0081
            o.isBuildIdValid r12 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsFileMarker r12 = r12.setHasDecor
            r10.read(r12)
        L_0x0081:
            android.widget.TextView r12 = r10.mTransactionDate
            java.lang.String r1 = r0.ParcelableVolumeInfo()
            r12.setText(r1)
            java.lang.String r12 = r0.PlaybackStateCompat
            java.lang.String r1 = "L"
            boolean r2 = r1.equals(r12)
            java.lang.String r3 = "S"
            if (r2 != 0) goto L_0x00a4
            java.lang.String r2 = "R"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x00a4
            boolean r2 = r3.equals(r12)
            if (r2 == 0) goto L_0x00b7
        L_0x00a4:
            android.widget.TextView r2 = r10.mDisclaimerMessage
            java.lang.String r4 = r0.RatingCompat()
            r2.setText(r4)
            android.widget.TextView r2 = r10.mDisclaimerMessage
            r2.setVisibility(r13)
            android.view.View r2 = r10.mDisclaimerSeparator
            r2.setVisibility(r13)
        L_0x00b7:
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x00c2
            android.widget.LinearLayout r12 = r10.mLtfSection
            r12.setVisibility(r13)
        L_0x00c2:
            java.lang.String r12 = r0.read()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r1 = 8
            r2 = 1
            if (r12 != 0) goto L_0x00e8
            android.widget.LinearLayout r12 = r10.mLayoutComplexFundDisclaimer
            r12.setVisibility(r13)
            com.scb.phone.view.custom.investment.CustomHyperLinkTextView r12 = r10.mTvComplexFundDisclaimer
            java.lang.String r4 = r0.read()
            r12.setTextViewHTML(r4)
            com.scb.phone.view.custom.investment.CustomHyperLinkTextView r12 = r10.mTvComplexFundDisclaimer
            com.scb.phone.view.custom.investment.CustomHyperLinkTextView$IconCompatParcelizer r4 = new com.scb.phone.view.custom.investment.CustomHyperLinkTextView$IconCompatParcelizer
            r4.<init>(r10)
            r12.setMovementMethod(r4)
            goto L_0x00f2
        L_0x00e8:
            android.widget.LinearLayout r12 = r10.mLayoutComplexFundDisclaimer
            r12.setVisibility(r1)
            com.scb.phone.view.custom.common.DefaultButton r12 = r10.mBtnContinue
            r12.setButtonEnabled(r2)
        L_0x00f2:
            java.lang.String r12 = r0.MediaDescriptionCompat()
            int r4 = r12.hashCode()
            r5 = 78
            java.lang.String r6 = "Y"
            java.lang.String r7 = "N"
            r8 = 2
            r9 = -1
            if (r4 == r5) goto L_0x011c
            r5 = 83
            if (r4 == r5) goto L_0x0114
            r3 = 89
            if (r4 != r3) goto L_0x0124
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0124
            r12 = r13
            goto L_0x0125
        L_0x0114:
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0124
            r12 = r8
            goto L_0x0125
        L_0x011c:
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L_0x0124
            r12 = r2
            goto L_0x0125
        L_0x0124:
            r12 = r9
        L_0x0125:
            if (r12 == 0) goto L_0x0149
            if (r12 == r2) goto L_0x0135
            if (r12 != r8) goto L_0x015c
            o.getGlobalBitmap r12 = r10.purchaseReviewPresenter
            r12.write = r7
            android.widget.RadioButton r12 = r10.mHoldingNo
            r12.setChecked(r2)
            goto L_0x015c
        L_0x0135:
            o.getGlobalBitmap r12 = r10.purchaseReviewPresenter
            r12.write = r7
            android.widget.RadioButton r12 = r10.mHoldingNo
            r12.setChecked(r2)
            android.widget.RadioButton r12 = r10.mHoldingYes
            r12.setEnabled(r13)
            android.widget.RadioButton r12 = r10.mHoldingNo
            r12.setEnabled(r13)
            goto L_0x015c
        L_0x0149:
            o.getGlobalBitmap r12 = r10.purchaseReviewPresenter
            r12.write = r6
            android.widget.RadioButton r12 = r10.mHoldingYes
            r12.setChecked(r2)
            android.widget.RadioButton r12 = r10.mHoldingYes
            r12.setEnabled(r13)
            android.widget.RadioButton r12 = r10.mHoldingNo
            r12.setEnabled(r13)
        L_0x015c:
            java.lang.String r12 = r0.IconCompatParcelizer()
            int r3 = r12.hashCode()
            java.lang.String r4 = "2"
            java.lang.String r5 = "1"
            if (r3 == 0) goto L_0x0183
            r6 = 49
            if (r3 == r6) goto L_0x017b
            r6 = 50
            if (r3 == r6) goto L_0x0173
            goto L_0x018c
        L_0x0173:
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x018c
            r9 = r2
            goto L_0x018c
        L_0x017b:
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x018c
            r9 = r13
            goto L_0x018c
        L_0x0183:
            java.lang.String r3 = ""
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x018c
            r9 = r8
        L_0x018c:
            if (r9 == 0) goto L_0x01ae
            if (r9 == r2) goto L_0x019b
            if (r9 != r8) goto L_0x01c0
            r10.write((java.lang.String) r5)
            android.widget.RadioButton r12 = r10.mTransferYes
            r12.setChecked(r2)
            goto L_0x01c0
        L_0x019b:
            android.widget.RadioButton r12 = r10.mRedeemYes
            r12.setChecked(r2)
            android.widget.RadioButton r12 = r10.mTransferYes
            r12.setEnabled(r13)
            android.widget.RadioButton r12 = r10.mRedeemYes
            r12.setEnabled(r13)
            r10.write((java.lang.String) r4)
            goto L_0x01c0
        L_0x01ae:
            android.widget.RadioButton r12 = r10.mTransferYes
            r12.setChecked(r2)
            android.widget.RadioButton r12 = r10.mTransferYes
            r12.setEnabled(r13)
            android.widget.RadioButton r12 = r10.mRedeemYes
            r12.setEnabled(r13)
            r10.write((java.lang.String) r5)
        L_0x01c0:
            android.widget.LinearLayout r12 = r10.linearLayoutVulnerableInvestorContainer
            boolean r2 = r0.MediaBrowserCompat$ItemReceiver()
            if (r2 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r13 = r1
        L_0x01ca:
            r12.setVisibility(r13)
            android.widget.TextView r12 = r10.textViewVulnerableDisclaimer
            java.lang.String r13 = r0.mo27462x50fd9e4a()
            r12.setText(r13)
        L_0x01d6:
            super.setTransitioning()
            r10.ActionBarContextView()
            r10.setActionBarVisibilityCallback()
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            if (r12 == 0) goto L_0x01f0
            androidx.fragment.app.FragmentActivity r12 = r10.getActivity()
            com.scb.phone.view.activity.BaseActivity r12 = (com.scb.phone.view.activity.BaseActivity) r12
            java.lang.String r13 = "mfschedule_purchasereview"
            r12.mo13676d_(r13)
        L_0x01f0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.purchase.FundPurchaseReviewFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
    }

    public final void MediaSessionCompat$QueueItem() {
        forEachMultiply foreachmultiply = new forEachMultiply();
        foreachmultiply.MediaBrowserCompat$ItemReceiver(new ZSYR2K("feature", "review"));
        if (getActivity() != null) {
            foreachmultiply.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mf_complexfund");
        }
    }

    public final void IconCompatParcelizer(checkForPreviousCrash checkforpreviouscrash) {
        Intent intent = new Intent(getContext(), FundActionsSuccessActivity.class);
        intent.putExtra("com.scb.phone.ARGS_SUCCESS_DATA", checkforpreviouscrash);
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

    @OnClick
    public void onHoldingRadioButtonClicked(RadioButton radioButton) {
        boolean isChecked = radioButton.isChecked();
        int id = radioButton.getId();
        if (id != R.id.holding_no_radio_button) {
            if (id == R.id.holding_yes_radio_button && isChecked) {
                this.purchaseReviewPresenter.write = "Y";
            }
        } else if (isChecked) {
            this.purchaseReviewPresenter.write = "N";
        }
    }

    @OnClick
    public void onRadioButtonClicked(RadioButton radioButton) {
        boolean isChecked = radioButton.isChecked();
        int id = radioButton.getId();
        if (id != R.id.redeem_radio_button) {
            if (id == R.id.transfer_radio_button && isChecked) {
                write(DiskLruCache.VERSION_1);
            }
        } else if (isChecked) {
            write("2");
        }
    }

    public final void write(access$2200 access_2200) {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("REVIEW_IS_ERROR", true);
            getActivity().setResult(0, intent);
        }
        super.write(access_2200);
    }

    @OnClick
    public void onCheckBoxClicked(CheckBox checkBox) {
        this.mBtnContinue.setButtonEnabled(checkBox.isChecked());
    }

    private void write(String str) {
        this.purchaseReviewPresenter.read = str;
        this.mPayDisclaimerMessage.setText(DiskLruCache.VERSION_1.equals(str) ? R.string.review_transfer_disclaimer_message : R.string.review_redeem_disclaimer_message);
        this.mPayDisclaimerMessage.setVisibility(0);
    }

    @OnClick
    public void onConfirmButtonClicked() {
        AlertController$RecycleListView();
        getGlobalBitmap getglobalbitmap = this.purchaseReviewPresenter;
        isPartialView ispartialview = new isPartialView();
        ispartialview.MediaBrowserCompat$CustomActionResultReceiver = getglobalbitmap.read;
        ispartialview.read = getglobalbitmap.write;
        ispartialview.IconCompatParcelizer = getglobalbitmap.IconCompatParcelizer.MediaSessionCompat$Token();
        getglobalbitmap.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(ispartialview);
        getglobalbitmap.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver(getglobalbitmap, getglobalbitmap.IconCompatParcelizer, getglobalbitmap.write));
    }

    public void onDestroy() {
        this.purchaseReviewPresenter.onDestroy();
        super.onDestroy();
    }
}
