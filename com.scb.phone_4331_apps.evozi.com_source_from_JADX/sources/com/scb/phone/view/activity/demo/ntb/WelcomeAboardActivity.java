package com.scb.phone.view.activity.demo.ntb;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.view.activity.BaseActivity;
import p040o.Boundary;
import p040o.Boundary$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.Boundary$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPinActivity;
import p040o.IdParameters_MembersInjector;
import p040o.Iterables;
import p040o.RttiJsonBill_MembersInjector;
import p040o.forEachXor;
import p040o.writeUInt64NoTag;

public class WelcomeAboardActivity extends BaseActivity implements IdParameters_MembersInjector {
    private forEachXor MediaDescriptionCompat = new forEachXor();
    @BindView
    Button buttonLoan;
    @HmlPinActivity
    public Boundary presenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        return new Intent(context, WelcomeAboardActivity.class).putExtra("WELCOME_ABOARD_PAGE_LANDED", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r8.equals("registration_welcome") != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131493249(0x7f0c0181, float:1.8609973E38)
            r7.setContentView(r8)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r7)
            o.Boundary r8 = r7.presenter
            r8.MediaBrowserCompat$ItemReceiver(r7)
            o.Boundary r8 = r7.presenter
            o.Boundary$write r0 = new o.Boundary$write
            r0.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r8.RatingCompat
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0022
            r1 = r3
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            if (r1 == 0) goto L_0x002a
            T r8 = r8.RatingCompat
            r0.IconCompatParcelizer(r8)
        L_0x002a:
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "WELCOME_ABOARD_PAGE_LANDED"
            boolean r8 = r8.hasExtra(r0)
            if (r8 == 0) goto L_0x0083
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r8 = r8.getStringExtra(r0)
            r0 = -1
            int r1 = r8.hashCode()
            r4 = -2003197772(0xffffffff8899a0b4, float:-9.246134E-34)
            java.lang.String r5 = "registration_welcome"
            java.lang.String r6 = "registration_personalinfo"
            if (r1 == r4) goto L_0x0058
            r4 = 2090820060(0x7c9f61dc, float:6.62048E36)
            if (r1 != r4) goto L_0x0060
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0058:
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x0060
            r2 = r3
            goto L_0x0061
        L_0x0060:
            r2 = r0
        L_0x0061:
            java.lang.String r8 = "ntb_welcome"
            java.lang.String r0 = "source"
            if (r2 == 0) goto L_0x0077
            if (r2 == r3) goto L_0x0071
            o.forEachXor r0 = r7.MediaDescriptionCompat
            o.getKernelIDDst r1 = r7.scbAnalytics
            r0.MediaBrowserCompat$ItemReceiver(r1, r8)
            goto L_0x007c
        L_0x0071:
            o.forEachXor r1 = r7.MediaDescriptionCompat
            r1.read(r0, r6)
            goto L_0x007c
        L_0x0077:
            o.forEachXor r1 = r7.MediaDescriptionCompat
            r1.read(r0, r5)
        L_0x007c:
            o.forEachXor r0 = r7.MediaDescriptionCompat
            o.getKernelIDDst r1 = r7.scbAnalytics
            r0.MediaBrowserCompat$ItemReceiver(r1, r8)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.demo.ntb.WelcomeAboardActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNavigateBack() {
        Boundary boundary = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Boundary.read.IconCompatParcelizer;
        if (boundary.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(boundary.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void clickExplore() {
        Boundary boundary = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Boundary$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (boundary.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(boundary.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void clickOpenAccount() {
        Boundary boundary = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Boundary$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (boundary.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(boundary.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void clickLoan() {
        Boundary boundary = this.presenter;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Boundary.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (boundary.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(boundary.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.buttonLoan.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        finish();
    }

    public final void IconCompatParcelizer() {
        this.presenter.write.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35284.NTB_WELCOME_ABOARD.name());
        NtbUserInfoActivity.write(this, RttiJsonBill_MembersInjector.read.IconCompatParcelizer.OPEN_ACCOUNT);
    }

    public final void read() {
        NtbUserInfoActivity.write(this, RttiJsonBill_MembersInjector.read.IconCompatParcelizer.APPLY_FOR_LOAN);
    }

    public final void write() {
        NtbUserInfoActivity.write(this, RttiJsonBill_MembersInjector.read.IconCompatParcelizer.DEMO);
    }
}
