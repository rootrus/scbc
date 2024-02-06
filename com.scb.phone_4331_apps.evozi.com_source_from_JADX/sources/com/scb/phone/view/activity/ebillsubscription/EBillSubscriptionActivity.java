package com.scb.phone.view.activity.ebillsubscription;

import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionFragment;
import com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment;
import com.scb.phone.view.fragment.requesttopay.RequireRequestToPayFragment;
import java.util.List;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CardView;
import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.HmlPinActivity;
import p040o.MapFragment;
import p040o.MapsInitializer;
import p040o.access$1600;
import p040o.getViewBoundariesImage;

public class EBillSubscriptionActivity extends BaseActivity implements CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer {
    private boolean MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    @HmlPinActivity
    public getViewBoundariesImage eBillSubscriptionPresenter;

    public static /* synthetic */ void MediaSessionCompat$QueueItem() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.app.Activity) r2)
            super.onCreate(r3)
            r3 = 2131492989(0x7f0c007d, float:1.8609445E38)
            r2.setContentView(r3)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r2)
            o.getViewBoundariesImage r3 = r2.eBillSubscriptionPresenter
            r3.MediaBrowserCompat$ItemReceiver(r2)
            android.content.Context r3 = r2.getBaseContext()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "com.scb.phone/BROADCAST_END_EBILL_SUBSCRIPTION_TUTORIAL"
            r0.<init>(r1)
            o.DebitCardResetOtpActivity r3 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r3, r0)
            o.pg r0 = new o.pg
            r0.<init>(r2)
            o.pf r1 = p040o.C7370pf.IconCompatParcelizer
            o.BulkTransferDeepLinkActivity r3 = r3.subscribe(r0, r1)
            r2.MediaDescriptionCompat = r3
            android.content.Intent r3 = r2.getIntent()
            if (r3 == 0) goto L_0x0056
            java.lang.String r0 = "EXTRA_LANDING_STATUS"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 != 0) goto L_0x0049
            o.getViewBoundariesImage r3 = r2.eBillSubscriptionPresenter
            r3.MediaBrowserCompat$CustomActionResultReceiver()
            o.getViewBoundariesImage r3 = r2.eBillSubscriptionPresenter
            r3.MediaBrowserCompat$ItemReceiver()
            goto L_0x0056
        L_0x0049:
            o.MapFragment r1 = p040o.MapFragment.NO_PROMPTPAY
            int r1 = r1.type
            int r3 = r3.getIntExtra(r0, r1)
            o.MapFragment r3 = p040o.MapFragment.IconCompatParcelizer(r3)
            goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            if (r3 == 0) goto L_0x005d
            r0 = 0
            r2.MediaBrowserCompat$CustomActionResultReceiver(r3, r0)
        L_0x005d:
            r2.setStackedBackground()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity.onCreate(android.os.Bundle):void");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("com.scb.phone.EXTRA_SUCCESS_EBILL_SUBSCRIPTION")) {
            this.MediaBrowserCompat$MediaItem = true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.MediaBrowserCompat$MediaItem) {
            getViewBoundariesImage getviewboundariesimage = this.eBillSubscriptionPresenter;
            if (getviewboundariesimage != null) {
                getviewboundariesimage.MediaBrowserCompat$CustomActionResultReceiver();
                this.eBillSubscriptionPresenter.MediaBrowserCompat$ItemReceiver();
            }
            this.MediaBrowserCompat$MediaItem = false;
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.manage_ebill_subscription_title));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    /* renamed from: com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity$3 */
    static /* synthetic */ class C10843 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.MapFragment[] r0 = p040o.MapFragment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.MapFragment r1 = p040o.MapFragment.NO_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.MapFragment r1 = p040o.MapFragment.NO_RTP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.MapFragment r1 = p040o.MapFragment.HAVE_PROMPTPAY_WITH_RTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity.C10843.<clinit>():void");
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(MapFragment mapFragment, boolean z) {
        CardView read = getSupportFragmentManager().read();
        int i = C10843.MediaBrowserCompat$ItemReceiver[mapFragment.ordinal()];
        if (i == 1) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequirePromptPayFragment.IconCompatParcelizer(z, MapsInitializer.EBILL_SUBSCRIPTION));
        } else if (i == 2) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequireRequestToPayFragment.IconCompatParcelizer(z, MapsInitializer.EBILL_SUBSCRIPTION));
        } else if (i == 3) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, EBillSubscriptionFragment.write());
        }
        read.write();
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        setResult(-1);
        super.onDestroy();
    }

    public final void write(MapFragment mapFragment, List<access$1600> list, boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver(mapFragment, z);
    }
}
