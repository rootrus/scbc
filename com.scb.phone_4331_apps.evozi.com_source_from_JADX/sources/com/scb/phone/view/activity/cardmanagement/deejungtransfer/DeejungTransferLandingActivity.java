package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import p040o.C1389kI;
import p040o.C7187kJ;
import p040o.C7188kK;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FirebaseAnalytics;
import p040o.FragmentBuilder_BindDeejungTransferSlipFragment;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.getAddress6;

public class DeejungTransferLandingActivity extends CCRBaseActivity implements AccountSourceSelectFragment.write, getAddress6, C1389kI {
    private CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public ScrollView scrollView;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public static Intent read(Context context, chain chain, FirebaseAnalytics firebaseAnalytics) {
        Intent intent = new Intent(context, DeejungTransferLandingActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY", chain);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_DEEJUNG_TRANSFER_LANDING_DISPLAY_MODEL", firebaseAnalytics);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77322131492957);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.scbAnalytics.write("deejung_transfer_landing", new ZSYR2K("source", "services_tab"));
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.deejung_transfer);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        CardView read = getSupportFragmentManager().read();
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.DEEJUNG_TRANSFER_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = true;
        write.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.deejung_transfer_to_label);
        write.MediaBrowserCompat$MediaItem = " ";
        write.IconCompatParcelizer = false;
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0)));
        read.write();
        this.scrollView.setDescendantFocusability(131072);
        this.scrollView.setFocusable(true);
        this.scrollView.setFocusableInTouchMode(true);
        if (FragmentBuilder_BindDeejungTransferSlipFragment.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.scrollView.setDefaultFocusHighlightEnabled(false);
        }
        this.scrollView.setOnTouchListener(C7188kK.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.deejung_transfer);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.MediaBrowserCompat$SearchResultReceiver = builder;
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
        Fragment findFragmentById;
        if (!z && (findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fragment_deejung_transfer_landing_bottom)) != null) {
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(findFragmentById).write();
        }
    }

    public final CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final void write(int i) {
        this.scrollView.postDelayed(new C7187kJ(this), (long) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if ((r0 != null && r0.endsWith("SPD")) != false) goto L_0x0025;
     */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAboutClick() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r3 = "com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY"
            android.os.Parcelable r0 = r0.getParcelableExtra(r3)
            o.chain r0 = (p040o.chain) r0
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = r0.setShortcut
            if (r0 == 0) goto L_0x0020
            java.lang.String r3 = "SPD"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x0020
            r0 = r1
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            o.UncheckedTimeoutException r0 = p040o.UncheckedTimeoutException.DEEJUNG_TRANSFER_SPEEDY_CASH
            goto L_0x002c
        L_0x002a:
            o.UncheckedTimeoutException r0 = p040o.UncheckedTimeoutException.DEEJUNG_TRANSFER
        L_0x002c:
            android.content.Intent r0 = com.scb.phone.view.activity.cardmanagement.CCAboutActivity.IconCompatParcelizer(r4, r0)
            com.thunderhead.android.aspects.IntentTidInjectionContextAspect.aspectOf()
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r4, r0)     // Catch:{ all -> 0x0065 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x0065 }
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "Uri intercepted on Context.startActivity(Intent), modified: "
            r2.<init>(r3)     // Catch:{ all -> 0x0065 }
            android.net.Uri r3 = r0.getData()     // Catch:{ all -> 0x0065 }
            r2.append(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "\n with context "
            r2.append(r3)     // Catch:{ all -> 0x0065 }
            int r3 = r4.hashCode()     // Catch:{ all -> 0x0065 }
            r2.append(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0065 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0065 }
            r1 = r4
            com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferLandingActivity r1 = (com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferLandingActivity) r1     // Catch:{ all -> 0x0065 }
            r1.startActivity(r0)     // Catch:{ all -> 0x0065 }
            return
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferLandingActivity.onAboutClick():void");
    }
}
