package com.scb.phone.view.fragment.investment.redeem;

import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.UnitsEditText;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.BulkTransferDeepLinkActivity;
import p040o.FragmentBuilder_BindCCTermsAndConditionsFragment;

public class AmountFragment extends BaseFragment {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindCCTermsAndConditionsFragment MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private BulkTransferDeepLinkActivity f3089x50fd9e4a;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private String ParcelableVolumeInfo;
    private boolean RatingCompat;
    @BindView
    LinearLayout llFundAvailableUnitSection;
    @BindView
    LinearLayout mAllContainerLayout;
    @BindView
    TextView mAmountTextView;
    @BindView
    TextInputLayout mInputAmountLayout;
    @BindView
    TextInputLayout mInputUnitsLayout;
    @BindView
    AmountEditText mTextInputEditAmount;
    @BindView
    UnitsEditText mTextInputEditUnits;
    @BindView
    TextView mUnitsTextView;
    @BindView
    TextView tvFundAvailableUnit;
    @BindView
    TextView tvFundPeriodTitle;

    public static AmountFragment read(String str, FragmentBuilder_BindCCTermsAndConditionsFragment fragmentBuilder_BindCCTermsAndConditionsFragment, String str2, String str3, String str4, String str5, boolean z, String str6) {
        AmountFragment amountFragment = new AmountFragment();
        amountFragment.MediaBrowserCompat$SearchResultReceiver = str;
        amountFragment.MediaBrowserCompat$MediaItem = fragmentBuilder_BindCCTermsAndConditionsFragment;
        amountFragment.IconCompatParcelizer = str2;
        amountFragment.ParcelableVolumeInfo = str3;
        amountFragment.MediaBrowserCompat$CustomActionResultReceiver = str4;
        amountFragment.MediaDescriptionCompat = str5;
        amountFragment.RatingCompat = z;
        amountFragment.MediaMetadataCompat = str6;
        return amountFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 2131493981(0x7f0c045d, float:1.8611457E38)
            android.view.View r5 = r5.inflate(r0, r6, r7)
            butterknife.ButterKnife.IconCompatParcelizer(r4, r5)
            java.lang.String r6 = r4.MediaBrowserCompat$SearchResultReceiver
            android.content.Context r0 = r4.getContext()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "BROADCAST_CLEAR_AMOUNT"
            r1.<init>(r2)
            o.DebitCardResetOtpActivity r0 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r0, r1)
            o.ActivityBuilder_BindRegistrationNoDataActivity r1 = new o.ActivityBuilder_BindRegistrationNoDataActivity
            r1.<init>(r4)
            o.ActivityBuilder_BindRewardSearchActivity r2 = p040o.ActivityBuilder_BindRewardSearchActivity.MediaBrowserCompat$CustomActionResultReceiver
            o.BulkTransferDeepLinkActivity r0 = r0.subscribe(r1, r2)
            r4.f3089x50fd9e4a = r0
            com.google.android.material.textfield.TextInputLayout r0 = r4.mInputAmountLayout
            java.lang.String r1 = ""
            r0.setHint(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r4.mInputUnitsLayout
            r0.setHint(r1)
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 1
            r3 = -1961848187(0xffffffff8b109285, float:-2.784362E-32)
            if (r0 == r3) goto L_0x005e
            r3 = -938489074(0xffffffffc80fcb0e, float:-147244.22)
            if (r0 == r3) goto L_0x0054
            r3 = -192886857(0xfffffffff480c7b7, float:-8.162411E31)
            if (r0 != r3) goto L_0x0068
            java.lang.String r0 = "ALL_TAB"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0068
            r6 = r1
            goto L_0x0069
        L_0x0054:
            java.lang.String r0 = "AMOUNT_TAB"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0068
            r6 = r7
            goto L_0x0069
        L_0x005e:
            java.lang.String r0 = "UNITS_TAB"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0068
            r6 = r2
            goto L_0x0069
        L_0x0068:
            r6 = -1
        L_0x0069:
            if (r6 == 0) goto L_0x00a7
            if (r6 == r2) goto L_0x0089
            if (r6 != r1) goto L_0x00cb
            android.widget.LinearLayout r6 = r4.mAllContainerLayout
            r6.setVisibility(r7)
            java.lang.String r6 = r4.IconCompatParcelizer
            if (r6 == 0) goto L_0x00cb
            java.lang.String r0 = r4.ParcelableVolumeInfo
            if (r0 == 0) goto L_0x00cb
            android.widget.TextView r0 = r4.mAmountTextView
            r0.setText(r6)
            android.widget.TextView r6 = r4.mUnitsTextView
            java.lang.String r0 = r4.ParcelableVolumeInfo
            r6.setText(r0)
            goto L_0x00cb
        L_0x0089:
            com.google.android.material.textfield.TextInputLayout r6 = r4.mInputUnitsLayout
            r6.setVisibility(r7)
            com.scb.phone.view.custom.common.UnitsEditText r6 = r4.mTextInputEditUnits
            java.lang.String r0 = "0.0000"
            r6.setHint(r0)
            com.scb.phone.view.custom.common.UnitsEditText r6 = r4.mTextInputEditUnits
            com.scb.phone.view.fragment.investment.redeem.AmountFragment$3 r0 = new com.scb.phone.view.fragment.investment.redeem.AmountFragment$3
            r0.<init>()
            r6.setOnUnitChangeListener(r0)
            com.scb.phone.view.custom.common.UnitsEditText r6 = r4.mTextInputEditUnits
            boolean r0 = r4.RatingCompat
            r6.setSpecificFilter(r0)
            goto L_0x00cb
        L_0x00a7:
            com.google.android.material.textfield.TextInputLayout r6 = r4.mInputAmountLayout
            r6.setVisibility(r7)
            com.google.android.material.textfield.TextInputLayout r6 = r4.mInputAmountLayout
            java.lang.String r0 = "0.00"
            r6.setHint(r0)
            com.scb.phone.view.custom.common.AmountEditText r6 = r4.mTextInputEditAmount
            com.scb.phone.view.fragment.investment.redeem.AmountFragment$1 r0 = new com.scb.phone.view.fragment.investment.redeem.AmountFragment$1
            r0.<init>()
            r6.setOnAmountChangeListener(r0)
            com.scb.phone.view.custom.common.AmountEditText r6 = r4.mTextInputEditAmount
            boolean r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x00c6
            r0 = 17
            goto L_0x00c8
        L_0x00c6:
            r0 = 10
        L_0x00c8:
            r6.setMaximumDecimalDigit(r0)
        L_0x00cb:
            java.lang.String r6 = r4.IconCompatParcelizer
            if (r6 == 0) goto L_0x011c
            java.lang.String r6 = r4.ParcelableVolumeInfo
            if (r6 == 0) goto L_0x011c
            boolean r6 = r4.RatingCompat
            if (r6 != 0) goto L_0x011c
            java.lang.String r6 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = "L"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x00fa
            r6 = 2131760312(0x7f1014b8, float:1.915164E38)
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r0 = r4.MediaDescriptionCompat
            android.widget.LinearLayout r1 = r4.llFundAvailableUnitSection
            r1.setVisibility(r7)
            android.widget.TextView r7 = r4.tvFundPeriodTitle
            r7.setText(r6)
            android.widget.TextView r6 = r4.tvFundAvailableUnit
            r6.setText(r0)
            goto L_0x011c
        L_0x00fa:
            java.lang.String r6 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = "S"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x011c
            r6 = 2131760316(0x7f1014bc, float:1.915165E38)
            java.lang.String r6 = r4.getString(r6)
            java.lang.String r0 = r4.MediaMetadataCompat
            android.widget.LinearLayout r1 = r4.llFundAvailableUnitSection
            r1.setVisibility(r7)
            android.widget.TextView r7 = r4.tvFundPeriodTitle
            r7.setText(r6)
            android.widget.TextView r6 = r4.tvFundAvailableUnit
            r6.setText(r0)
        L_0x011c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.redeem.AmountFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.f3089x50fd9e4a;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.f3089x50fd9e4a.dispose();
        }
        super.onDestroy();
    }

    public static /* synthetic */ void write(AmountFragment amountFragment) {
        amountFragment.mTextInputEditAmount.setText("");
        amountFragment.mTextInputEditUnits.setText("");
        amountFragment.mUnitsTextView.setText("");
        amountFragment.mAmountTextView.setText("");
    }
}
