package com.scb.phone.view.activity.profilemanagement.promptpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.C4920kw;
import p040o.HmlPinActivity;
import p040o.ImmutableMultimap;
import p040o.QuickExtractor;
import p040o.getBaseAddress;
import p040o.getBinaries;
import p040o.getKernelIDDstIn;
import p040o.setExecution;
import p040o.split;

public class PromptPayOtpActivity extends BaseOtpActivity implements QuickExtractor.C12502 {
    @HmlPinActivity
    public C4920kw presenter;

    public static Intent IconCompatParcelizer(Activity activity, String str, setExecution setexecution, getBaseAddress getbaseaddress, int i) {
        return new Intent(activity, PromptPayOtpActivity.class).putExtra("EXTRA_OTP_POLICY_ID", str).putExtra("proxy", setexecution).putExtra("account", getbaseaddress).putExtra("rtp", i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new getKernelIDDstIn().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "managepromptpay_otp");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        C4920kw kwVar = this.presenter;
        int intExtra = intent.getIntExtra("rtp", 0);
        kwVar.read = (setExecution) intent.getParcelableExtra("proxy");
        kwVar.IconCompatParcelizer = (getBaseAddress) intent.getParcelableExtra("account");
        kwVar.MediaBrowserCompat$ItemReceiver = intExtra;
    }

    public final void write(String str, String str2) {
        C4920kw kwVar = this.presenter;
        if (kwVar.RatingCompat != null) {
            kwVar.RatingCompat.AlertController$RecycleListView();
        }
        split split = kwVar.write;
        ImmutableMultimap.Values.C35011.read read = ImmutableMultimap.Values.C35011.read();
        read.IconCompatParcelizer = kwVar.IconCompatParcelizer.write;
        read.write = kwVar.IconCompatParcelizer.read;
        read.MediaBrowserCompat$ItemReceiver = kwVar.read.read == 0 ? "MOB" : "CID";
        read.MediaBrowserCompat$CustomActionResultReceiver = kwVar.MediaBrowserCompat$ItemReceiver;
        read.read = kwVar.read.MediaMetadataCompat;
        split.MediaBrowserCompat$ItemReceiver(str2, str, new ImmutableMultimap.Values.C35011(read, (byte) 0));
        kwVar.write.IconCompatParcelizer(new C4920kw.IconCompatParcelizer(kwVar, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getBinaries getbinaries) {
        setResult(-1, new Intent());
        ManagePromptpaySuccessActivity.read(this, getbinaries, true);
        finish();
    }
}
