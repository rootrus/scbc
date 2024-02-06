package com.scb.phone.view.activity.requesttopay;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.requesttopay.RequestToPayLandingFragment;
import com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment;
import com.scb.phone.view.fragment.requesttopay.RequireRequestToPayFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AppstatsThresholdReachedListener;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.ICheckDeserializer$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MapFragment;
import p040o.MapsInitializer;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class RequestToPayActivity extends BaseActivity implements ICheckDeserializer$MediaBrowserCompat$CustomActionResultReceiver {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public AppstatsThresholdReachedListener moneyActionPresenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, RequestToPayActivity.class);
        intent.putExtra("source", str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.app.Activity) r2)
            super.onCreate(r3)
            r3 = 2131493190(0x7f0c0146, float:1.8609853E38)
            r2.setContentView(r3)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r2)
            java.lang.String r3 = "source"
            java.lang.String r0 = ""
            java.lang.String r3 = r2.read(r3, r0)
            r2.MediaDescriptionCompat = r3
            o.AppstatsThresholdReachedListener r3 = r2.moneyActionPresenter
            r3.MediaBrowserCompat$ItemReceiver(r2)
            android.content.Context r3 = r2.getBaseContext()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL"
            r0.<init>(r1)
            o.DebitCardResetOtpActivity r3 = p040o.setChildDrawingOrderCallback.IconCompatParcelizer(r3, r0)
            o.MonthPagerAdapter$Monthly r0 = new o.MonthPagerAdapter$Monthly
            r0.<init>(r2)
            o.MonthPagerAdapter r1 = p040o.MonthPagerAdapter.IconCompatParcelizer
            o.BulkTransferDeepLinkActivity r3 = r3.subscribe(r0, r1)
            r2.MediaBrowserCompat$MediaItem = r3
            android.content.Intent r3 = r2.getIntent()
            if (r3 == 0) goto L_0x005b
            java.lang.String r0 = "EXTRA_LANDING_STATUS"
            java.lang.String r1 = r3.getStringExtra(r0)
            if (r1 != 0) goto L_0x004e
            o.AppstatsThresholdReachedListener r3 = r2.moneyActionPresenter
            r3.read()
            goto L_0x005b
        L_0x004e:
            o.MapFragment r1 = p040o.MapFragment.NO_PROMPTPAY
            int r1 = r1.type
            int r3 = r3.getIntExtra(r0, r1)
            o.MapFragment r3 = p040o.MapFragment.IconCompatParcelizer(r3)
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x0078
            o.AppstatsThresholdReachedListener r0 = r2.moneyActionPresenter
            o.StreetViewPanoramaOrientation r1 = r0.MediaBrowserCompat$ItemReceiver
            o.findValueIteratorAndKey r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            boolean r1 = r1.MediaSessionCompat$Token()
            if (r1 != 0) goto L_0x0071
            o.StreetViewPanoramaOrientation r0 = r0.MediaBrowserCompat$ItemReceiver
            o.findValueIteratorAndKey r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r0.setShortcut()
        L_0x0071:
            r2.MediaBrowserCompat$SearchResultReceiver = r1
            r0 = r1 ^ 1
            r2.IconCompatParcelizer((p040o.MapFragment) r3, (boolean) r0)
        L_0x0078:
            r2.setStackedBackground()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.requesttopay.RequestToPayActivity.onCreate(android.os.Bundle):void");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.request_money_new));
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.f93052131558409, menu);
        Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_request_money).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(this, R.color.f71012131100257));
        menu.findItem(R.id.menu_action_request_money).setIcon(MediaBrowserCompat$MediaItem2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_request_money) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            Intent intent = new Intent(this, RequestToPayInfoActivity.class);
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
        } else {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            Intent intent2 = new Intent();
            intent2.setAction("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
            sendBroadcast(intent2);
        }
        return true;
    }

    private void IconCompatParcelizer(MapFragment mapFragment, boolean z) {
        CardView read = getSupportFragmentManager().read();
        int i = C11053.write[mapFragment.ordinal()];
        if (i == 1) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequirePromptPayFragment.IconCompatParcelizer(z, MapsInitializer.REQUEST_MONEY));
        } else if (i == 2) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequireRequestToPayFragment.IconCompatParcelizer(z, MapsInitializer.REQUEST_MONEY));
        } else if (i == 3) {
            read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, RequestToPayLandingFragment.MediaBrowserCompat$CustomActionResultReceiver(z, this.MediaDescriptionCompat));
        }
        read.write();
    }

    /* renamed from: com.scb.phone.view.activity.requesttopay.RequestToPayActivity$3 */
    static /* synthetic */ class C11053 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.MapFragment[] r0 = p040o.MapFragment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.MapFragment r1 = p040o.MapFragment.NO_PROMPTPAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.MapFragment r1 = p040o.MapFragment.NO_RTP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.MapFragment r1 = p040o.MapFragment.HAVE_PROMPTPAY_WITH_RTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.requesttopay.RequestToPayActivity.C11053.<clinit>():void");
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$MediaItem.dispose();
        }
        setResult(-1);
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(MapFragment mapFragment, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = !z;
        IconCompatParcelizer(mapFragment, z);
    }

    public static void IconCompatParcelizer(Context context, String str) {
        Intent intent = new Intent(context, RequestToPayActivity.class);
        intent.putExtra("source", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
