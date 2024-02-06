package com.scb.phone.view.fragment.easycash;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomPhone;
import p040o.C6392xfcabe75c;
import p040o.CrashlyticsBackgroundWorker;
import p040o.HmlPinActivity;
import p040o.IGlareDetector;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.hmlUploadCidPhoto;

public class EasycashReferralSendDfwFragment extends BaseEasycashReferralSendFragment implements C6392xfcabe75c {
    @HmlPinActivity
    public IGlareDetector easycashReferralSendDfwPresenter;

    public static EasycashReferralSendDfwFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32131 r3) {
        EasycashReferralSendDfwFragment easycashReferralSendDfwFragment = new EasycashReferralSendDfwFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REFERRAL", r3);
        easycashReferralSendDfwFragment.setArguments(bundle);
        return easycashReferralSendDfwFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87072131493934, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.easycashReferralSendDfwPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = this.easycashReferralSendDfwPresenter;
        this.easycashReferralSendDfwPresenter.MediaBrowserCompat$CustomActionResultReceiver((CrashlyticsBackgroundWorker.C32131) getArguments().getParcelable("com.scb.phone.EXTRA_REFERRAL"));
        forEachClear foreachclear = this.tracker;
        String str = "DFWYN";
        if ("COMMERCIAL_LOAN".equals(str)) {
            str = "BUSINESS_LOAN";
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_type", str));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_referral_input");
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashReferralSendDfwPresenter.onDestroy();
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        this.loansDetails.setOnFocusChangeListener(new hmlUploadCidPhoto(this));
    }

    public final void MediaSessionCompat$Token() {
        this.loansDetails.read(getResources().getString(R.string.easycash_invalid_amount_transfer_input));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r8 = this;
            o.IGlareDetector r0 = r8.easycashReferralSendDfwPresenter
            com.scb.phone.view.custom.common.AmountEditText r1 = r8.amountEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            com.scb.phone.view.custom.common.InputText r2 = r8.loansDetails
            android.widget.EditText r2 = r2.inputEditText
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            com.scb.phone.view.custom.easycash.CustomPhone r3 = r8.phoneEditText
            boolean r3 = r3.write
            com.scb.phone.view.custom.common.DefaultButton r4 = r8.buttonSend
            boolean r4 = r4.isEnabled()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x002b
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0033
        L_0x002b:
            java.lang.Double r1 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r1)
            double r5 = r1.doubleValue()
        L_0x0033:
            boolean r1 = r0.read
            boolean r5 = r0.IconCompatParcelizer(r5)
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            if (r3 == 0) goto L_0x005e
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0059
            r1 = r6
            goto L_0x005a
        L_0x0059:
            r1 = r7
        L_0x005a:
            if (r1 == 0) goto L_0x005e
            r1 = r6
            goto L_0x005f
        L_0x005e:
            r1 = r7
        L_0x005f:
            if (r4 == r1) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r6 = r7
        L_0x0063:
            o.removeBarcodeReadCompleteEventListener r1 = p040o.removeBarcodeReadCompleteEventListener.IconCompatParcelizer
            r0.write(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.EasycashReferralSendDfwFragment.MediaSessionCompat$ResultReceiverWrapper():void");
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSendButtonClick() {
        IGlareDetector iGlareDetector = this.easycashReferralSendDfwPresenter;
        String obj = this.amountEditText.getText().toString();
        String obj2 = this.loansDetails.inputEditText.getText().toString();
        CustomPhone customPhone = this.phoneEditText;
        iGlareDetector.IconCompatParcelizer(obj, obj2, TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver, this.name.getText().toString());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 7134) {
            IGlareDetector iGlareDetector = this.easycashReferralSendDfwPresenter;
            String obj = this.amountEditText.getText().toString();
            String obj2 = this.loansDetails.inputEditText.getText().toString();
            CustomPhone customPhone = this.phoneEditText;
            iGlareDetector.MediaBrowserCompat$ItemReceiver(obj, obj2, TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver, this.name.getText().toString());
        }
    }
}
