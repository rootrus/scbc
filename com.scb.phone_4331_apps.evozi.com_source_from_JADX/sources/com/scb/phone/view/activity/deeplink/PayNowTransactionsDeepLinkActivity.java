package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.paynow.PayNowSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4824x33ffba94;
import p040o.C6914xcb5eb61;
import p040o.HmlPinActivity;
import p040o.Joiner$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.isGuidanceAvailable;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PayNowTransactionsDeepLinkActivity extends BaseDeepLinkActivity implements C6914xcb5eb61 {
    @HmlPinActivity
    public isGuidanceAvailable presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        isGuidanceAvailable isguidanceavailable = this.presenter;
        if (isguidanceavailable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isguidanceavailable.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        isGuidanceAvailable isguidanceavailable = this.presenter;
        if (isguidanceavailable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (str != null) {
            if (isguidanceavailable.RatingCompat == null) {
                z = false;
            }
            if (z) {
                isguidanceavailable.RatingCompat.AlertController$RecycleListView();
            }
            isguidanceavailable.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(new isGuidanceAvailable.IconCompatParcelizer(isguidanceavailable), new Joiner$MediaBrowserCompat$CustomActionResultReceiver(str), isguidanceavailable.read);
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer isguidanceavailable_mediabrowsercompat_customactionresultreceiver = new C4824x33ffba94(isguidanceavailable);
        if (isguidanceavailable.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isguidanceavailable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(isguidanceavailable.RatingCompat);
        }
    }

    public final void write(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successDisplay");
        PayNowSuccessActivity.IconCompatParcelizer iconCompatParcelizer = PayNowSuccessActivity.MediaDescriptionCompat;
        Intent read = PayNowSuccessActivity.IconCompatParcelizer.read(this, standardstartandwait);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }

    public final void read() {
        mo13676d_("outward_remittance_pp_noti_success");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        mo13676d_("outward_remittance_pp_noti_fail");
    }

    public final void onDestroy() {
        isGuidanceAvailable isguidanceavailable = this.presenter;
        if (isguidanceavailable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isguidanceavailable.onDestroy();
        super.onDestroy();
    }
}
