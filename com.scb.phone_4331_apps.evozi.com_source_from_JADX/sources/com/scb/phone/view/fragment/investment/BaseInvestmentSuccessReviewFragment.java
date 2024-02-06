package com.scb.phone.view.fragment.investment;

import android.content.Context;
import android.view.View;
import butterknife.BindView;
import com.scb.phone.view.custom.transferandpay.CustomScheduleFundItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CrashlyticsFileMarker;
import p040o.isBuildIdValid;

public class BaseInvestmentSuccessReviewFragment extends BaseFragment {
    @BindView
    CustomTransferAndPaySource accountNo;
    @BindView
    CustomTransferAndPaySource clientNo;
    @BindView
    CustomTransferAndPayItem customAmount;
    @BindView
    CustomTransferAndPayItem customFees;
    @BindView
    CustomTransferAndPaySource funds;
    @BindView
    CustomScheduleFundItem scheduleInfo;
    @BindView
    CustomTransferAndPayItem transferDate;

    /* access modifiers changed from: protected */
    public void read(isBuildIdValid isbuildidvalid, View view, Context context, String str) {
        IconCompatParcelizer(isbuildidvalid, view, str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.isBuildIdValid r3, android.view.View r4, java.lang.String r5, boolean r6) {
        /*
            r2 = this;
            butterknife.ButterKnife.IconCompatParcelizer(r2, r4)
            r2.write(r3)
            r2.IconCompatParcelizer(r3)
            r2.write(r3, r5, r6)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.customAmount
            java.lang.String r5 = r3.write
            r4.setValue(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.customAmount
            java.lang.String r5 = r3.MediaBrowserCompat$SearchResultReceiver
            r4.setText(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.customFees
            java.lang.String r5 = r3.MediaSessionCompat$Token
            r4.setValue(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.customFees
            java.lang.String r5 = r3.MediaSessionCompat$QueueItem
            r4.setText(r5)
            java.lang.String r4 = r3.ParcelableVolumeInfo
            int r5 = r4.hashCode()
            r6 = 0
            r0 = 1
            r1 = -1575706677(0xffffffffa2149fcb, float:-2.0142334E-18)
            if (r5 == r1) goto L_0x0044
            r1 = 97916784(0x5d61770, float:2.0133073E-35)
            if (r5 != r1) goto L_0x004e
            java.lang.String r5 = "FUND_ACTION_PURCHASE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004f
        L_0x0044:
            java.lang.String r5 = "FUND_ACTION_REDEEM"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004e
            r4 = r0
            goto L_0x004f
        L_0x004e:
            r4 = -1
        L_0x004f:
            if (r4 == 0) goto L_0x006b
            if (r4 != r0) goto L_0x0072
            o.CrashlyticsFileMarker r4 = r3.setHasDecor
            if (r4 != 0) goto L_0x0072
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.transferDate
            r4.setVisibility(r6)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.transferDate
            java.lang.String r5 = r3.setContentView
            r4.setValue(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r4 = r2.transferDate
            java.lang.String r3 = r3.AppCompatDialogFragment
            r4.setText(r3)
            return
        L_0x006b:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r3 = r2.transferDate
            r4 = 8
            r3.setVisibility(r4)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment.IconCompatParcelizer(o.isBuildIdValid, android.view.View, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: protected */
    public final void read(CrashlyticsFileMarker crashlyticsFileMarker) {
        this.scheduleInfo.setVisibility(0);
        if (crashlyticsFileMarker.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.scheduleInfo.setEffectiveDateLabel(crashlyticsFileMarker.write);
            this.scheduleInfo.setEffectiveDate(crashlyticsFileMarker.MediaBrowserCompat$CustomActionResultReceiver, crashlyticsFileMarker.IconCompatParcelizer == 1);
        }
        if (crashlyticsFileMarker.IconCompatParcelizer == 1) {
            this.scheduleInfo.setEffectiveDescription(crashlyticsFileMarker.MediaBrowserCompat$ItemReceiver);
        } else if (crashlyticsFileMarker.MediaMetadataCompat != null) {
            this.scheduleInfo.transferLayout.setVisibility(0);
            this.scheduleInfo.setTransactionDateLabel(crashlyticsFileMarker.MediaBrowserCompat$SearchResultReceiver);
            this.scheduleInfo.setTransactionDate(crashlyticsFileMarker.MediaMetadataCompat);
        }
    }

    private void write(isBuildIdValid isbuildidvalid) {
        this.clientNo.setText(isbuildidvalid.MediaMetadataCompat);
        this.clientNo.setSourceName(isbuildidvalid.f2872x50fd9e4a);
        this.clientNo.setAccountNumber(isbuildidvalid.RatingCompat);
    }

    private void IconCompatParcelizer(isBuildIdValid isbuildidvalid) {
        this.funds.setText(isbuildidvalid.PlaybackStateCompat);
        this.funds.setSourceName(isbuildidvalid.MediaSessionCompat$ResultReceiverWrapper);
        this.funds.setAccountNumber(isbuildidvalid.Keep);
        this.funds.mSourceLinearLayout.setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(p040o.isBuildIdValid r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r0 = r4.accountNo
            java.lang.String r1 = r5.MediaBrowserCompat$ItemReceiver
            r0.setText(r1)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r0 = r4.accountNo
            java.lang.String r1 = r5.read
            r0.setSourceName(r1)
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 1
            r3 = -566678661(0xffffffffde392b7b, float:-3.33572339E18)
            if (r0 == r3) goto L_0x0037
            r3 = 847942355(0x328a92d3, float:1.6132082E-8)
            if (r0 == r3) goto L_0x002d
            r3 = 1844253640(0x6ded13c8, float:9.1714827E27)
            if (r0 != r3) goto L_0x0041
            java.lang.String r0 = "ACCOUNT_MASKING_SUCCESS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0041
            r6 = r2
            goto L_0x0042
        L_0x002d:
            java.lang.String r0 = "ACCOUNT_MASKING_REVIEW"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0041
            r6 = 0
            goto L_0x0042
        L_0x0037:
            java.lang.String r0 = "ACCOUNT_MASKING_SLIP"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0041
            r6 = r1
            goto L_0x0042
        L_0x0041:
            r6 = -1
        L_0x0042:
            if (r6 == 0) goto L_0x0050
            if (r6 == r2) goto L_0x0048
            if (r6 != r1) goto L_0x005c
        L_0x0048:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r6 = r4.accountNo
            java.lang.String r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r6.setAccountNumber(r7)
            goto L_0x005c
        L_0x0050:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r6 = r4.accountNo
            if (r7 == 0) goto L_0x0057
            java.lang.String r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0059
        L_0x0057:
            java.lang.String r7 = r5.IconCompatParcelizer
        L_0x0059:
            r6.setAccountNumber(r7)
        L_0x005c:
            java.lang.String r5 = r5.ParcelableVolumeInfo
            java.lang.String r6 = "FUND_ACTION_SWITCH"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x007b
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r5 = r4.accountNo
            android.content.Context r6 = r4.getContext()
            r7 = 2131230846(0x7f08007e, float:1.8077756E38)
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r6, (int) r7)
            java.lang.String r6 = r6.toString()
            r5.setAvatar(r6)
            return
        L_0x007b:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r5 = r4.accountNo
            android.widget.LinearLayout r5 = r5.mSourceLinearLayout
            r5.setOrientation(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.BaseInvestmentSuccessReviewFragment.write(o.isBuildIdValid, java.lang.String, boolean):void");
    }
}
