package com.scb.phone.view.activity.partner.nsip;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.parntner.nsip.NsipPaymentAddAccountFragment;
import com.scb.phone.view.fragment.parntner.nsip.NsipPaymentAddAccountFragment$MediaBrowserCompat$ItemReceiver;
import p040o.C4337eF;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setOs;
import p040o.writeUInt64NoTag;

public final class NsipPaymentLandingActivity extends BaseActivity implements getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver {
    public static final C5686xe80e4bd9 MediaMetadataCompat = new C5686xe80e4bd9((byte) 0);
    private String MediaBrowserCompat$MediaItem = "";
    private setOs MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    @HmlPinActivity
    public C4337eF presenter;

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f79042131493129);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        C4337eF eFVar = this.presenter;
        if (eFVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eFVar.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.MediaDescriptionCompat = extras.getBoolean("KEY_IS_ELIGIBLE_ACCOUNT");
            setOs setos = (setOs) extras.getParcelable("KEY_NSIP_PARTNER_PAYMENT_DISPLAY");
            if (setos != null) {
                onGetStartedClick.IconCompatParcelizer((Object) setos, "it");
                this.MediaBrowserCompat$SearchResultReceiver = setos;
            }
            String string = extras.getString("KEY_DEEPLINK_ID");
            if (string != null) {
                onGetStartedClick.IconCompatParcelizer((Object) string, "it");
                this.MediaBrowserCompat$MediaItem = string;
            }
        }
        setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.nsip_payment_title));
        setTabContainer();
        C4337eF eFVar2 = this.presenter;
        if (eFVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (this.MediaDescriptionCompat) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4337eF.write.MediaBrowserCompat$ItemReceiver;
            if (eFVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(eFVar2.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4337eF.IconCompatParcelizer.IconCompatParcelizer;
        if (eFVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(eFVar2.RatingCompat);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "NSIP_TRACKER_FROM"
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0017
            o.forEachSrcOver$read$read r2 = p040o.forEachSrcOver.read
            java.lang.String r2 = r2.IconCompatParcelizer
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = ""
        L_0x001c:
            o.setTitleMarginStart r2 = r8.getSupportFragmentManager()
            o.CardView r2 = r2.read()
            com.scb.phone.view.fragment.parntner.nsip.NsipPaymentInputFragment$MediaBrowserCompat$CustomActionResultReceiver r3 = com.scb.phone.view.fragment.parntner.nsip.NsipPaymentInputFragment.IconCompatParcelizer
            o.setOs r3 = r8.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r4 = "nsipPaymentInputDisplay"
            if (r3 != 0) goto L_0x002f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x002f:
            java.lang.String r5 = r8.MediaBrowserCompat$MediaItem
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r4)
            java.lang.String r4 = "deepLinkId"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r4)
            java.lang.String r4 = "tracker"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            com.scb.phone.view.fragment.parntner.nsip.NsipPaymentInputFragment r4 = new com.scb.phone.view.fragment.parntner.nsip.NsipPaymentInputFragment
            r4.<init>()
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            java.lang.String r7 = "KEY_NSIP_PARTNER_PAYMENT_DISPLAY"
            r6.putParcelable(r7, r3)
            java.lang.String r3 = "KEY_DEEPLINK_ID"
            r6.putString(r3, r5)
            r6.putString(r1, r0)
            r4.setArguments(r6)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r0 = 2131297116(0x7f09035c, float:1.8212168E38)
            o.CardView r0 = r2.MediaBrowserCompat$ItemReceiver(r0, r4)
            r0.write()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.nsip.NsipPaymentLandingActivity.IconCompatParcelizer():void");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CardView read = getSupportFragmentManager().read();
        NsipPaymentAddAccountFragment$MediaBrowserCompat$ItemReceiver nsipPaymentAddAccountFragment$MediaBrowserCompat$ItemReceiver = NsipPaymentAddAccountFragment.MediaBrowserCompat$CustomActionResultReceiver;
        read.MediaBrowserCompat$ItemReceiver(R.id.container, new NsipPaymentAddAccountFragment()).write();
    }

    public final void onDestroy() {
        C4337eF eFVar = this.presenter;
        if (eFVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eFVar.onDestroy();
        super.onDestroy();
    }
}
