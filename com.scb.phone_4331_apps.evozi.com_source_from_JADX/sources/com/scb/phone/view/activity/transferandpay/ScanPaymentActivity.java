package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.places.PlacesStatusCodes;
import com.google.gson.Gson;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitInputActivity;
import com.scb.phone.view.activity.fastpay.FastPayInputActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.purchase.PurchaseInputActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.camera.CameraSource;
import com.scb.phone.view.camera.CameraSource$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.camera.CameraSourcePreview;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.IOException;
import java.util.ArrayList;
import p040o.AlertController$RecycleListView;
import p040o.C10161ti;
import p040o.C7432sG;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositProductDetailFragment;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.access$lambda$3;
import p040o.forEachSrcOver;
import p040o.getTopLeftCornerWidth;
import p040o.isRelevant;
import p040o.onCheckBoxClick;
import p040o.setActiveTabAlpha;
import p040o.setRtlMode;
import p040o.setSelection;
import p040o.setTapText;
import p040o.setUnselectedColor;

public class ScanPaymentActivity extends BaseActivity implements getTopLeftCornerWidth.ActionMenuItemView, View.OnTouchListener {
    private CameraSource MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public Gson gson;
    @BindView
    RelativeLayout layoutCamera;
    @BindView
    CameraSourcePreview mPreview;
    @HmlPinActivity
    public C7432sG presenter;

    static {
        System.loadLibrary("iconv");
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, ScanPaymentActivity.class);
    }

    public static Intent IconCompatParcelizer(Context context, isRelevant isrelevant) {
        Intent intent = new Intent(context, ScanPaymentActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", isrelevant);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79802131493205);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.scan_bill);
        setTabContainer();
        isRelevant isrelevant = (isRelevant) getIntent().getSerializableExtra("EXTRA_FLOW_TYPE");
        if (isrelevant == null) {
            isrelevant = isRelevant.PAYMENT;
        }
        String stringExtra = getIntent().getStringExtra("QR_DATA");
        if (stringExtra == null || stringExtra.isEmpty()) {
            C7432sG sGVar = this.presenter;
            sGVar.write = isrelevant;
            sGVar.MediaMetadataCompat.write(isrelevant).MediaBrowserCompat$CustomActionResultReceiver(false);
            setActiveTabAlpha.read(this);
            this.mPreview.setOnTouchListener(this);
            return;
        }
        C7432sG sGVar2 = this.presenter;
        sGVar2.write = isrelevant;
        sGVar2.MediaMetadataCompat.write(isrelevant).MediaBrowserCompat$CustomActionResultReceiver(true);
        this.layoutCamera.setVisibility(8);
        C7432sG sGVar3 = this.presenter;
        sGVar3.MediaMetadataCompat.write(sGVar3.write).MediaBrowserCompat$ItemReceiver(stringExtra);
    }

    public void onResume() {
        CameraSource cameraSource;
        super.onResume();
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getApplicationContext());
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().getErrorDialog(this, isGooglePlayServicesAvailable, PlacesStatusCodes.USAGE_LIMIT_EXCEEDED).show();
        }
        CameraSource cameraSource2 = this.MediaBrowserCompat$MediaItem;
        if (cameraSource2 != null) {
            try {
                CameraSourcePreview cameraSourcePreview = this.mPreview;
                if (cameraSource2 == null && (cameraSource = cameraSourcePreview.read) != null) {
                    cameraSource.IconCompatParcelizer();
                }
                cameraSourcePreview.read = cameraSource2;
                if (cameraSource2 != null) {
                    cameraSourcePreview.MediaBrowserCompat$ItemReceiver = true;
                    cameraSourcePreview.write();
                }
            } catch (IOException unused) {
                CameraSource cameraSource3 = this.MediaBrowserCompat$MediaItem;
                synchronized (cameraSource3.read) {
                    cameraSource3.IconCompatParcelizer();
                    this.MediaBrowserCompat$MediaItem = null;
                }
            }
        }
    }

    public void onPause() {
        CameraSource cameraSource;
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.mPreview;
        if (cameraSourcePreview != null && (cameraSource = cameraSourcePreview.read) != null) {
            cameraSource.IconCompatParcelizer();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        CameraSourcePreview cameraSourcePreview = this.mPreview;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.setOnTouchListener((View.OnTouchListener) null);
        }
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.scan_bill);
        setTabContainer();
    }

    public final void MediaSessionCompat$Token() {
        setSelection setselection = new setSelection(this);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        CameraSource$MediaBrowserCompat$CustomActionResultReceiver cameraSource$MediaBrowserCompat$CustomActionResultReceiver = new CameraSource$MediaBrowserCompat$CustomActionResultReceiver(getApplicationContext(), setselection);
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.MediaDescriptionCompat = 0;
        int max = Math.max(1600, point.x);
        int max2 = Math.max(1024, point.y);
        if (max <= 0 || max > 1000000 || max2 <= 0 || max2 > 1000000) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid preview size: ");
            sb.append(max);
            sb.append("x");
            sb.append(max2);
            throw new IllegalArgumentException(sb.toString());
        }
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.ParcelableVolumeInfo = max;
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.MediaSessionCompat$QueueItem = max2;
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.f3068x50fd9e4a = 15.0f;
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$SearchResultReceiver = "continuous-picture";
        cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write.RatingCompat = new CameraSource.write(cameraSource$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$MediaItem = cameraSource$MediaBrowserCompat$CustomActionResultReceiver.write;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        setActiveTabAlpha.IconCompatParcelizer(this, i, iArr);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static void m3017x50fd9e4a() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaSessionCompat$QueueItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public final void write(String str) {
        Intent intent = new Intent(this, FavouriteSelectedActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD", StreetViewPanoramaFragment.zzb.SCAN);
        intent.putExtra("source", str);
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution execution, String str) {
        Intent putExtra = new Intent(this, EDonationConsentActivity.class).putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution).putExtra("source", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder, boolean z) {
        onCheckBoxClick.read("navigateToFastPay %s", this.gson.toJson((Object) builder));
        FastPayInputActivity.IconCompatParcelizer(this, builder, z);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder, access$lambda$3 access_lambda_3) {
        Intent MediaBrowserCompat$ItemReceiver = PullSlipActivity.MediaBrowserCompat$ItemReceiver(this, builder, access_lambda_3);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void IconCompatParcelizer(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.putExtra("IS_NEED_HISTORY_STACK", true);
        intent.putExtra("NSIP_TRACKER_FROM", forEachSrcOver.read.write);
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

    public final void read(String str) {
        Intent putExtra = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((Context) this, str).putExtra("IS_NEED_HISTORY_STACK", true);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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

    public final void IconCompatParcelizer(byte[] bArr) {
        C7432sG sGVar = this.presenter;
        String write = FragmentBuilder_BindDepositProductDetailFragment.write(bArr);
        boolean z = true;
        if (sGVar.RatingCompat != null) {
            sGVar.RatingCompat.aj_();
        }
        if (!(write == null || write.length() == 0)) {
            z = false;
        }
        if (!z) {
            sGVar.MediaMetadataCompat.write(sGVar.write).MediaBrowserCompat$ItemReceiver(write);
        } else {
            sGVar.write();
        }
    }

    public final void write(int i, int i2, byte[] bArr) {
        C7432sG sGVar = this.presenter;
        sGVar.MediaMetadataCompat.write(sGVar.write).MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindDepositProductDetailFragment.MediaBrowserCompat$ItemReceiver(i, i2, bArr));
    }

    @OnClick
    public void onFlashButtonClick() {
        CameraSource cameraSource = this.MediaBrowserCompat$MediaItem;
        if (cameraSource == null) {
            return;
        }
        if ("off".equalsIgnoreCase(cameraSource.MediaMetadataCompat)) {
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer("torch");
        } else {
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer("off");
        }
    }

    public final void AlertController$RecycleListView() {
        runOnUiThread(new setRtlMode(this));
    }

    public final void aj_() {
        runOnUiThread(new setUnselectedColor(this));
    }

    @OnClick
    public void onAlbumButtonClicked() {
        C7432sG sGVar = this.presenter;
        boolean z = true;
        sGVar.MediaBrowserCompat$ItemReceiver = true;
        C10161ti tiVar = C10161ti.MediaBrowserCompat$ItemReceiver;
        if (sGVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            tiVar.IconCompatParcelizer(sGVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setActiveTabAlpha.IconCompatParcelizer(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
        Intent intent = new Intent(this, PurchaseInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_DISPLAY", builder);
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
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read, PlacesStatusCodes.KEY_INVALID);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9002 && i2 == -1) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.presenter.IconCompatParcelizer(intent.getData(), displayMetrics.heightPixels, displayMetrics.widthPixels);
        } else if (i != 9002) {
            super.onActivityResult(i, i2, intent);
            finish();
        }
    }

    public final void MediaSessionCompat$QueueItem(LogFileManager.DirectoryProvider directoryProvider) {
        super.MediaSessionCompat$QueueItem(directoryProvider);
        C7432sG sGVar = this.presenter;
        sGVar.MediaBrowserCompat$ItemReceiver = false;
        Uri uri = sGVar.read;
        if (uri != null) {
            sGVar.IconCompatParcelizer(uri, sGVar.MediaBrowserCompat$MediaItem, sGVar.MediaDescriptionCompat);
        }
    }

    public final void ac_() {
        super.ac_();
        C7432sG sGVar = this.presenter;
        sGVar.MediaBrowserCompat$ItemReceiver = false;
        Uri uri = sGVar.read;
        if (uri != null) {
            sGVar.IconCompatParcelizer(uri, sGVar.MediaBrowserCompat$MediaItem, sGVar.MediaDescriptionCompat);
        }
    }

    public final void MediaSessionCompat$Token(boolean z) {
        if (!"ACTION_DEEP_LINK_SCAN".equalsIgnoreCase(getIntent().getAction())) {
            super.MediaSessionCompat$Token(z);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !"ACTION_DEEP_LINK_SCAN".equalsIgnoreCase(getIntent().getAction())) {
            return super.onOptionsItemSelected(menuItem);
        }
        setContentView();
        return true;
    }

    private void setContentView() {
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        intent.addFlags(268468224);
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

    public void onBackPressed() {
        if ("ACTION_DEEP_LINK_SCAN".equalsIgnoreCase(getIntent().getAction())) {
            setContentView();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        CameraSource cameraSource;
        if (motionEvent.getAction() != 0 || (cameraSource = this.MediaBrowserCompat$MediaItem) == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int width = this.mPreview.getWidth();
        int height = this.mPreview.getHeight();
        Camera camera = cameraSource.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera == null) {
            return true;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
            return true;
        }
        if (!parameters.getSupportedFocusModes().contains("auto") || parameters.getMaxNumMeteringAreas() <= 0) {
            cameraSource.MediaBrowserCompat$CustomActionResultReceiver.autoFocus(cameraSource.write);
            return true;
        }
        cameraSource.MediaBrowserCompat$CustomActionResultReceiver.cancelAutoFocus();
        int read = CameraSource.read((int) (((x / ((float) width)) * 2000.0f) - 1000.0f));
        int read2 = CameraSource.read((int) (((y / ((float) height)) * 2000.0f) - 1000.0f));
        Rect rect = new Rect(read, read2, read + 300, read2 + 300);
        parameters.setFocusMode("auto");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, 800));
        parameters.setFocusAreas(arrayList);
        try {
            cameraSource.MediaBrowserCompat$CustomActionResultReceiver.setParameters(parameters);
        } catch (RuntimeException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        cameraSource.MediaBrowserCompat$CustomActionResultReceiver.autoFocus(cameraSource.write);
        return true;
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = DirectDebitInputActivity.MediaBrowserCompat$CustomActionResultReceiver(this, execution, "");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void read(CrashlyticsReport.Session.Event.Application.Execution execution, String str) {
        boolean z;
        if (execution == null || execution.setHasDecor == null) {
            z = true;
        } else {
            z = execution.setHasDecor.read;
        }
        BillPaymentActivity.MediaBrowserCompat$ItemReceiver(this, StreetViewPanoramaFragment.zzb.SCAN, execution, str, z);
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }
}
