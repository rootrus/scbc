package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.CLSUUID;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.asFilePayload;
import p040o.onGetStartedClick;

public final class AccountEStatementViewHolder extends AccountHeaderViewHolder {
    private boolean PlaybackStateCompat = true;
    @BindView
    public CheckBox checkboxEStatement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountEStatementViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void write(asFilePayload asfilepayload, FundFactSheetActivity<? super Boolean, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) asfilepayload, "display");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onCheckedChanged");
        CLSUUID clsuuid = asfilepayload;
        onGetStartedClick.write((Object) clsuuid, "display");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.textHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
        }
        customEasyCashSectionLabel.setText(clsuuid.MediaBrowserCompat$CustomActionResultReceiver);
        CheckBox checkBox = this.checkboxEStatement;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("checkboxEStatement");
        }
        checkBox.setOnCheckedChangeListener(new write(fundFactSheetActivity));
        if (this.PlaybackStateCompat) {
            CheckBox checkBox2 = this.checkboxEStatement;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("checkboxEStatement");
            }
            checkBox2.setChecked(true);
            this.PlaybackStateCompat = false;
        }
    }

    static final class write implements CompoundButton.OnCheckedChangeListener {
        private /* synthetic */ FundFactSheetActivity write;

        write(FundFactSheetActivity fundFactSheetActivity) {
            this.write = fundFactSheetActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.write.invoke(Boolean.valueOf(z));
        }
    }
}
