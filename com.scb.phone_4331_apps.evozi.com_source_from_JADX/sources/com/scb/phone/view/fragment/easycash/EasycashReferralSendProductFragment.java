package com.scb.phone.view.fragment.easycash;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.easycash.CustomPhone;
import p040o.CheckExtractActivity_MembersInjector$MediaSessionCompat$Token;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.INativeGuidance;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.serializeEvent;

public class EasycashReferralSendProductFragment extends BaseEasycashReferralSendFragment implements CheckExtractActivity_MembersInjector$MediaSessionCompat$Token, TakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver {
    @BindView
    TextView amountLabel;
    @HmlPinActivity
    public INativeGuidance easycashReferralSendProductPresenter;
    @BindView
    TextInputLayout errorIncome;
    @BindView
    TextView headerInfoReferral;
    @BindView
    AmountEditText incomeAmount;

    public static EasycashReferralSendProductFragment read(CrashlyticsBackgroundWorker.C32131 r3) {
        EasycashReferralSendProductFragment easycashReferralSendProductFragment = new EasycashReferralSendProductFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REFERRAL", r3);
        easycashReferralSendProductFragment.setArguments(bundle);
        return easycashReferralSendProductFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87082131493935, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.easycashReferralSendProductPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = this.easycashReferralSendProductPresenter;
        CrashlyticsBackgroundWorker.C32131 r6 = (CrashlyticsBackgroundWorker.C32131) getArguments().getParcelable("com.scb.phone.EXTRA_REFERRAL");
        this.easycashReferralSendProductPresenter.MediaBrowserCompat$CustomActionResultReceiver(r6);
        forEachClear foreachclear = this.tracker;
        String str = r6.MediaBrowserCompat$SearchResultReceiver;
        if ("COMMERCIAL_LOAN".equals(str)) {
            str = "BUSINESS_LOAN";
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_type", str));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_referral_input");
        }
        if ("COMMERCIAL_LOAN".equals(r6.MediaBrowserCompat$SearchResultReceiver)) {
            this.loansDetails.setMaxLength(40);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32131 r12) {
        super.IconCompatParcelizer(r12);
        if ("COMMERCIAL_LOAN".equals(r12.MediaBrowserCompat$SearchResultReceiver)) {
            this.headerInfoReferral.setText(R.string.easycash_commercial_referral_header_info);
            this.amountLabel.setText(R.string.easycash_amount_header);
        }
        this.incomeAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                EasycashReferralSendProductFragment.this.PlaybackStateCompat$CustomAction();
                EasycashReferralSendProductFragment.this.incomeAmount.requestFocus();
            }
        });
        AmountEditText amountEditText = this.incomeAmount;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.errorIncome, 9.9999999999E8d, 0.0d, getResources().getString(R.string.easycash_invalid_amount_transfer_input), (String) null, getResources().getString(R.string.easycash_invalid_amount_transfer_input)));
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashReferralSendProductPresenter.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r11 = this;
            o.INativeGuidance r0 = r11.easycashReferralSendProductPresenter
            com.scb.phone.view.custom.common.AmountEditText r1 = r11.amountEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            com.scb.phone.view.custom.common.InputText r2 = r11.loansDetails
            android.widget.EditText r2 = r2.inputEditText
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            com.scb.phone.view.custom.easycash.CustomPhone r3 = r11.phoneEditText
            boolean r3 = r3.write
            com.scb.phone.view.custom.common.AmountEditText r4 = r11.incomeAmount
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            com.scb.phone.view.custom.common.DefaultButton r5 = r11.buttonSend
            boolean r5 = r5.isEnabled()
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r6 == 0) goto L_0x0036
            r9 = r7
            goto L_0x003e
        L_0x0036:
            java.lang.Double r1 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r1)
            double r9 = r1.doubleValue()
        L_0x003e:
            boolean r1 = r0.read
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x004e
            java.lang.Double r4 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r4)
            double r7 = r4.doubleValue()
        L_0x004e:
            boolean r4 = r0.IconCompatParcelizer(r9)
            r6 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0082
            if (r1 == 0) goto L_0x0082
            if (r3 == 0) goto L_0x0082
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0072
            java.lang.String r1 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0072
            r1 = r9
            goto L_0x0073
        L_0x0072:
            r1 = r6
        L_0x0073:
            if (r1 == 0) goto L_0x0082
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x007d
            r1 = r6
            goto L_0x007e
        L_0x007d:
            r1 = r9
        L_0x007e:
            if (r1 == 0) goto L_0x0082
            r1 = r6
            goto L_0x0083
        L_0x0082:
            r1 = r9
        L_0x0083:
            if (r5 == r1) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r6 = r9
        L_0x0087:
            o.checkLicense r1 = p040o.checkLicense.MediaBrowserCompat$ItemReceiver
            r0.write(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.EasycashReferralSendProductFragment.MediaSessionCompat$ResultReceiverWrapper():void");
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSendButtonClick() {
        INativeGuidance iNativeGuidance = this.easycashReferralSendProductPresenter;
        String obj = this.amountEditText.getText().toString();
        String obj2 = this.loansDetails.inputEditText.getText().toString();
        CustomPhone customPhone = this.phoneEditText;
        iNativeGuidance.write(obj, obj2, TextUtils.isEmpty(customPhone.MediaBrowserCompat$ItemReceiver) ? "" : customPhone.MediaBrowserCompat$ItemReceiver, this.name.getText().toString(), this.incomeAmount.getText().toString());
    }

    public final void read(serializeEvent serializeevent) {
        EasycashSuccessDialogFragment.write(serializeevent).show(getChildFragmentManager().read(), "referral_dialog");
    }

    public final void write(String str) {
        this.easycashReferralSendProductPresenter.MediaBrowserCompat$MediaItem = str;
    }
}
