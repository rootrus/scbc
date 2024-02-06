package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.partner.nsip.C5686xe80e4bd9;
import com.scb.phone.view.activity.partner.nsip.NsipPaymentLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C4685x36c39180;
import p040o.C6913xcf1d2597;
import p040o.DebitCardResetOtpActivity;
import p040o.Functions;
import p040o.Functions$ForMapWithDefault$MediaBrowserCompat$ItemReceiver;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanorama;
import p040o.getVerticalMovementGuidance;
import p040o.getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setOs;
import p040o.setTapText;

public final class NsipPartnerPaymentDeepLinkActivity extends BaseDeepLinkActivity implements C6913xcf1d2597 {
    @HmlPinActivity
    public getVerticalMovementGuidance presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getVerticalMovementGuidance getverticalmovementguidance = this.presenter;
        if (getverticalmovementguidance == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getverticalmovementguidance.MediaBrowserCompat$ItemReceiver(this);
        if (str != null) {
            getVerticalMovementGuidance getverticalmovementguidance2 = this.presenter;
            if (getverticalmovementguidance2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "deepLinkId");
            if (getverticalmovementguidance2.RatingCompat != null) {
                getverticalmovementguidance2.RatingCompat.AlertController$RecycleListView();
            }
            Functions.ConstantFunction constantFunction = getverticalmovementguidance2.write;
            DebitCardResetOtpActivity<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> MediaBrowserCompat$ItemReceiver = constantFunction.read.MediaBrowserCompat$ItemReceiver("TRANSFER_AND_FIXED_TRANSFER");
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "depositRepositoryContrac…_FIXED_TRANSFER_FUNCTION)");
            constantFunction.read(MediaBrowserCompat$ItemReceiver, new getVerticalMovementGuidance.IconCompatParcelizer(getverticalmovementguidance2, str), new C4685x36c39180(getverticalmovementguidance2, str));
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "deepLinkId");
        getVerticalMovementGuidance getverticalmovementguidance = this.presenter;
        if (getverticalmovementguidance == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "deepLinkId");
        if (getverticalmovementguidance.RatingCompat != null) {
            getverticalmovementguidance.RatingCompat.AlertController$RecycleListView();
        }
        ListMultimap listMultimap = getverticalmovementguidance.read;
        FundFactSheetActivity write = new getVerticalMovementGuidance.write(getverticalmovementguidance, str);
        FundFactSheetActivity getverticalmovementguidance_mediabrowsercompat_itemreceiver = new getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver(getverticalmovementguidance);
        onGetStartedClick.write((Object) write, "onSuccess");
        onGetStartedClick.write((Object) getverticalmovementguidance_mediabrowsercompat_itemreceiver, "onError");
        onGetStartedClick.write((Object) str, "request");
        listMultimap.IconCompatParcelizer(listMultimap.MediaBrowserCompat$CustomActionResultReceiver, write, getverticalmovementguidance_mediabrowsercompat_itemreceiver, new Functions$ForMapWithDefault$MediaBrowserCompat$ItemReceiver(str));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C5686xe80e4bd9 nsipPaymentLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = NsipPaymentLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, NsipPaymentLandingActivity.class);
        intent.putExtra("KEY_IS_ELIGIBLE_ACCOUNT", false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setOs setos, String str) {
        onGetStartedClick.write((Object) setos, "nsipPaymentInputDisplay");
        onGetStartedClick.write((Object) str, "deepLinkId");
        C5686xe80e4bd9 nsipPaymentLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = NsipPaymentLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, NsipPaymentLandingActivity.class);
        intent.putExtra("KEY_IS_ELIGIBLE_ACCOUNT", true);
        intent.putExtra("KEY_NSIP_PARTNER_PAYMENT_DISPLAY", setos);
        intent.putExtra("KEY_DEEPLINK_ID", str);
        intent.putExtras(getIntent());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void IconCompatParcelizer() {
        super.mo14210S_();
    }
}
