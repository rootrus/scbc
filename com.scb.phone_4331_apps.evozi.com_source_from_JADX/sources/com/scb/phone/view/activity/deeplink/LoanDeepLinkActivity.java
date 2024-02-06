package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.deeplink.LoanDeepLinkActivity;
import com.scb.phone.view.activity.loan.LoanInputActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.entriesOnlyOnLeft;
import p040o.getInfoWindowAnchorU;
import p040o.transparency;

public class LoanDeepLinkActivity extends BaseDeepLinkActivity {
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public transparency accountSummaryCase;
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;
    @HmlPinActivity
    public entriesOnlyOnLeft loanDisplayMapper;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.MediaDescriptionCompat = "INBOX";
            mo13676d_("inboxnoti_loam_pmt_reminder");
        } else if (getIntent().getBooleanExtra("PUSH_TAG", false)) {
            this.MediaDescriptionCompat = "PUSH";
            mo13676d_("pushnoti_loan_pmt_reminder");
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        getInfoWindowAnchorU getinfowindowanchoru = this.deepLinkCase;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$ItemReceiver(str).map(new DirectDebitDeepLinkActivity() {
            public final Object write(Object obj) {
                LoanDeepLinkActivity loanDeepLinkActivity = LoanDeepLinkActivity.this;
                return loanDeepLinkActivity.loanDisplayMapper.MediaBrowserCompat$CustomActionResultReceiver((zzvn) obj, loanDeepLinkActivity.accountSummaryCase.MediaBrowserCompat$ItemReceiver.setItemInvoker());
            }
        }), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                LoanDeepLinkActivity.this.write((Futures.C34051) obj);
            }
        }, new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                LoanDeepLinkActivity.this.mo14215a_((Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void write(Futures.C34051 r2) throws Exception {
        aj_();
        read(LoanInputActivity.MediaBrowserCompat$ItemReceiver(this, r2, this.MediaDescriptionCompat));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.deepLinkCase.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        super.onActivityResult(i, i2, intent);
    }
}
