package com.scb.phone.view.activity.promptpay;

import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.promptpay.PromptPayQRInputFragment;
import com.scb.phone.view.fragment.promptpay.PromptPayQRSuccessFragment;
import com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10100p;
import p040o.HmlPinActivity;
import p040o.MapsInitializer;
import p040o.getBottomEdgeTearHeight$MediaBrowserCompat$ItemReceiver;
import p040o.onPoiClick;

public class PromptPayQRActivity extends BaseActivity implements getBottomEdgeTearHeight$MediaBrowserCompat$ItemReceiver {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C10100p.C51161 promptPayQRPresenter;

    public static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.app.Activity) r2)
            super.onCreate(r3)
            r3 = 2131493173(0x7f0c0135, float:1.8609819E38)
            r2.setContentView(r3)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r2)
            o.p$1 r3 = r2.promptPayQRPresenter
            r3.MediaBrowserCompat$ItemReceiver(r2)
            android.content.Context r3 = r2.getBaseContext()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "com.scb.phone/BROADCAST_END_PROMPTPAY_QR_TUTORIAL"
            r0.<init>(r1)
            o.DebitCardResetOtpActivity r3 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r3, r0)
            o.setTitleAnimationOrientation r0 = new o.setTitleAnimationOrientation
            r0.<init>(r2)
            o.MaterialCalendarView$2 r1 = p040o.MaterialCalendarView.C69492.MediaBrowserCompat$CustomActionResultReceiver
            o.BulkTransferDeepLinkActivity r3 = r3.subscribe(r0, r1)
            r2.MediaBrowserCompat$SearchResultReceiver = r3
            android.content.Intent r3 = r2.getIntent()
            if (r3 == 0) goto L_0x0056
            java.lang.String r0 = "EXTRA_LANDING_STATUS"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 != 0) goto L_0x0049
            o.p$1 r3 = r2.promptPayQRPresenter
            r3.MediaBrowserCompat$ItemReceiver()
            o.p$1 r3 = r2.promptPayQRPresenter
            r3.IconCompatParcelizer()
            goto L_0x0056
        L_0x0049:
            o.onPoiClick r1 = p040o.onPoiClick.NO_PROMPTPAY
            int r1 = r1.type
            int r3 = r3.getIntExtra(r0, r1)
            o.onPoiClick r3 = p040o.onPoiClick.MediaBrowserCompat$CustomActionResultReceiver(r3)
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            r2.MediaBrowserCompat$ItemReceiver(r3)
        L_0x005c:
            r2.setStackedBackground()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.promptpay.PromptPayQRActivity.onCreate(android.os.Bundle):void");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.create_promptpay_qr));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    /* renamed from: com.scb.phone.view.activity.promptpay.PromptPayQRActivity$4 */
    static /* synthetic */ class C11044 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.onPoiClick[] r0 = p040o.onPoiClick.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.onPoiClick r1 = p040o.onPoiClick.NO_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.onPoiClick r1 = p040o.onPoiClick.PROMPT_PAY_QR_EDIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.onPoiClick r1 = p040o.onPoiClick.PROMPT_PAY_QR_SUCCESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.onPoiClick r1 = p040o.onPoiClick.NO_RTP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.onPoiClick r1 = p040o.onPoiClick.HAVE_PROMPTPAY_WITH_RTP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.promptpay.PromptPayQRActivity.C11044.<clinit>():void");
        }
    }

    private void MediaBrowserCompat$ItemReceiver(onPoiClick onpoiclick) {
        int i = C11044.MediaBrowserCompat$ItemReceiver[onpoiclick.ordinal()];
        if (i == 1) {
            if (this.mToolbar != null) {
                this.mToolbar.setVisibility(0);
            }
            MediaSessionCompat$QueueItem(getString(R.string.qr_code_generation_create));
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequirePromptPayFragment.IconCompatParcelizer(false, MapsInitializer.PROMPTPAY_QR)).write();
        } else if (i == 2) {
            MediaSessionCompat$Token();
        } else if (i == 3) {
            MediaSessionCompat$QueueItem();
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        setResult(-1);
        this.ParcelableVolumeInfo.onDestroy();
        super.onDestroy();
    }

    public final void read(onPoiClick onpoiclick) {
        MediaBrowserCompat$ItemReceiver(onpoiclick);
    }

    public final void MediaSessionCompat$QueueItem() {
        AlertController$RecycleListView();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(8);
        }
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver("PROPMTPAY_QR_SUCCESS_FRAGMENT_TAG").IconCompatParcelizer(R.id.fragment_container, PromptPayQRSuccessFragment.IconCompatParcelizer(), "PROPMTPAY_QR_SUCCESS_FRAGMENT_TAG").write();
    }

    public final void MediaSessionCompat$Token() {
        AlertController$RecycleListView();
        if (this.mToolbar != null) {
            this.mToolbar.setVisibility(0);
        }
        MediaSessionCompat$QueueItem(getString(R.string.qr_edit_prompt_pay));
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver("PROPMTPAY_QR_INPUT_FRAGMENT_TAG").IconCompatParcelizer(R.id.fragment_container, PromptPayQRInputFragment.MediaBrowserCompat$CustomActionResultReceiver(), "PROPMTPAY_QR_INPUT_FRAGMENT_TAG").write();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("PROPMTPAY_QR_SUCCESS_FRAGMENT_TAG");
        Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("PROPMTPAY_QR_INPUT_FRAGMENT_TAG");
        if (findFragmentByTag == null || !findFragmentByTag.isVisible()) {
            if (findFragmentByTag2 != null && findFragmentByTag2.isVisible()) {
                if (this.mToolbar != null) {
                    this.mToolbar.setVisibility(8);
                }
                getSupportFragmentManager().RatingCompat();
                getSupportFragmentManager().IconCompatParcelizer();
                if (getSupportFragmentManager().write() != 0) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }
}
