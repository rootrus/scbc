package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public class AccountRepaymentSelectorViewHolder extends AccountSelectorViewHolder {
    @BindView
    public RadioButton radioButtonCash;
    @BindView
    public RadioButton radioButtonDirectDebit;
    @BindView
    public RadioGroup radioGroup;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountRepaymentSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(List<? extends CrashlyticsReport.FilesPayload.File.Builder> list, FundFactSheetActivity<? super CrashlyticsReport.FilesPayload.File.Builder, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) list, "accountDisplays");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onSelectedRepaymentAccount");
        CustomAccountSelector customAccountSelector = this.accountSelector;
        if (customAccountSelector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
        }
        customAccountSelector.setVisibility(0);
        if (this.PlaybackStateCompat) {
            CustomAccountSelector customAccountSelector2 = this.accountSelector;
            if (customAccountSelector2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
            }
            customAccountSelector2.IconCompatParcelizer(list, new C5747x29a3ab92(list, fundFactSheetActivity));
            fundFactSheetActivity.invoke(list.get(0));
            RadioButton radioButton = this.radioButtonDirectDebit;
            if (radioButton == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonDirectDebit");
            }
            radioButton.setChecked(true);
            this.PlaybackStateCompat = false;
        }
    }
}
