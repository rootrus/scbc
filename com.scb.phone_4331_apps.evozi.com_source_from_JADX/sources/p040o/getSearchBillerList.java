package p040o;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.adapter.easycash.viewholder.AccountRepaymentSelectorViewHolder;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.CrashlyticsReport;

/* renamed from: o.getSearchBillerList */
public final class getSearchBillerList extends AccountRepaymentSelectorViewHolder {
    public static final /* synthetic */ String MediaBrowserCompat$ItemReceiver(boolean z) {
        return z ? "DIRECT_DEBIT" : "CASH";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getSearchBillerList(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void write(populateSequenceNumber populatesequencenumber, boolean z, FundFactSheetActivity<? super CrashlyticsReport.FilesPayload.File.Builder, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundFactSheetActivity<? super String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity2) {
        onGetStartedClick.write((Object) populatesequencenumber, "display");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onSelectedRepaymentAccount");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "onChangedPaymentMethod");
        CLSUUID clsuuid = populatesequencenumber;
        onGetStartedClick.write((Object) clsuuid, "display");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.textHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
        }
        customEasyCashSectionLabel.setText(clsuuid.MediaBrowserCompat$CustomActionResultReceiver);
        if (populatesequencenumber.read) {
            RadioButton radioButton = this.radioButtonCash;
            if (radioButton == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonCash");
            }
            radioButton.setChecked(true);
            RadioButton radioButton2 = this.radioButtonDirectDebit;
            if (radioButton2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonDirectDebit");
            }
            radioButton2.setEnabled(false);
            CustomAccountSelector customAccountSelector = this.accountSelector;
            if (customAccountSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
            }
            customAccountSelector.setVisibility(8);
            return;
        }
        RadioButton radioButton3 = this.radioButtonDirectDebit;
        if (radioButton3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioButtonDirectDebit");
        }
        radioButton3.setEnabled(true);
        RadioGroup radioGroup = this.radioGroup;
        if (radioGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("radioGroup");
        }
        radioGroup.setOnCheckedChangeListener(new C7124x72a5197d(this, fundFactSheetActivity2));
        if (z) {
            CustomAccountSelector customAccountSelector2 = this.accountSelector;
            if (customAccountSelector2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
            }
            customAccountSelector2.setVisibility(8);
            return;
        }
        MediaBrowserCompat$ItemReceiver(populatesequencenumber.write, fundFactSheetActivity);
    }
}
