package com.scb.phone.view.adapter.hml;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.changeCardBlockStatus;
import p040o.firebaseCrashExists;
import p040o.onGetStartedClick;

public final class CompanyItemViewHolder extends changeCardBlockStatus {
    public final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public final FundFactSheetActivity<firebaseCrashExists, HmlVerifyPhoneValidateOtpActivity> Keep;
    @BindView
    public TextView tvName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanyItemViewHolder(View view, FundFactSheetActivity<? super firebaseCrashExists, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        super(view, (byte) 0);
        onGetStartedClick.write((Object) view, "itemView");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onCompanyClicked");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onItemReached");
        this.Keep = fundFactSheetActivity;
        this.AlertController$RecycleListView = fundActionsSuccessActivity;
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public static final class write implements View.OnClickListener {
        private /* synthetic */ firebaseCrashExists MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ CompanyItemViewHolder write;

        public write(CompanyItemViewHolder companyItemViewHolder, firebaseCrashExists firebasecrashexists) {
            this.write = companyItemViewHolder;
            this.MediaBrowserCompat$ItemReceiver = firebasecrashexists;
        }

        public final void onClick(View view) {
            this.write.Keep.invoke(this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
