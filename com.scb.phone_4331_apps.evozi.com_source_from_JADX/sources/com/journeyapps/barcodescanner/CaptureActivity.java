package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.Map;
import java.util.Set;
import p040o.AppCompatRatingBar;
import p040o.CGERU;
import p040o.CHER;
import p040o.getIIdDeserializerRtti;
import p040o.rsnIncAllocationCreateTyped;
import p040o.rsnIncContextCreate;
import p040o.rsnSamplerCreate;
import p040o.rsnScriptIntrinsicBLAS_BNNM;
import p040o.rsnScriptIntrinsicBLAS_Z;
import p040o.rsnScriptInvokeV;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.rsnScriptKernelIDCreate;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateTRMV;
import p040o.validateTranspose;

public class CaptureActivity extends Activity {
    private validateTranspose IconCompatParcelizer;
    private DecoratedBarcodeView MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int intExtra;
        int i;
        super.onCreate(bundle);
        setContentView(rsnScriptInvokeV.write.zxing_capture);
        this.MediaBrowserCompat$CustomActionResultReceiver = (DecoratedBarcodeView) findViewById(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_barcode_scanner);
        validateTranspose validatetranspose = new validateTranspose(this, this.MediaBrowserCompat$CustomActionResultReceiver);
        this.IconCompatParcelizer = validatetranspose;
        Intent intent = getIntent();
        validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.getWindow().addFlags(128);
        if (bundle != null) {
            validatetranspose.MediaBrowserCompat$SearchResultReceiver = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (validatetranspose.MediaBrowserCompat$SearchResultReceiver == -1) {
                    int rotation = validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.getWindowManager().getDefaultDisplay().getRotation();
                    int i2 = validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.getResources().getConfiguration().orientation;
                    if (i2 == 2) {
                        if (!(rotation == 0 || rotation == 1)) {
                            i = 8;
                            validatetranspose.MediaBrowserCompat$SearchResultReceiver = i;
                        }
                    } else if (i2 == 1) {
                        i = (rotation == 0 || rotation == 3) ? 1 : 9;
                        validatetranspose.MediaBrowserCompat$SearchResultReceiver = i;
                    }
                    i = 0;
                    validatetranspose.MediaBrowserCompat$SearchResultReceiver = i;
                }
                validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.setRequestedOrientation(validatetranspose.MediaBrowserCompat$SearchResultReceiver);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                DecoratedBarcodeView decoratedBarcodeView = validatetranspose.MediaBrowserCompat$ItemReceiver;
                Set<rsnIncAllocationCreateTyped> IconCompatParcelizer2 = rsnScriptIntrinsicBLAS_BNNM.IconCompatParcelizer(intent);
                Map<rsnIncContextCreate, Object> read = rsnScriptIntrinsicBLAS_Z.read(intent);
                CHER cher = new CHER();
                if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                    cher.IconCompatParcelizer = intExtra;
                }
                String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                    decoratedBarcodeView.setStatusText(stringExtra);
                }
                int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
                String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
                new rsnSamplerCreate().MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) read);
                decoratedBarcodeView.read.setCameraSettings(cher);
                decoratedBarcodeView.read.setDecoderFactory(new validateTRMV(IconCompatParcelizer2, read, stringExtra2, intExtra2));
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                validatetranspose.write.IconCompatParcelizer = false;
            }
            if (intent.hasExtra("TIMEOUT")) {
                validatetranspose.MediaDescriptionCompat.postDelayed(new Runnable() {
                    public final void run() {
                        validateTranspose validatetranspose = validateTranspose.this;
                        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                        intent.putExtra("TIMEOUT", true);
                        validatetranspose.MediaBrowserCompat$CustomActionResultReceiver.setResult(0, intent);
                        validatetranspose.write();
                    }
                }, intent.getLongExtra("TIMEOUT", 0));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                validatetranspose.MediaSessionCompat$QueueItem = true;
            }
        }
        validateTranspose validatetranspose2 = this.IconCompatParcelizer;
        DecoratedBarcodeView decoratedBarcodeView2 = validatetranspose2.MediaBrowserCompat$ItemReceiver;
        getIIdDeserializerRtti getiiddeserializerrtti = validatetranspose2.MediaMetadataCompat;
        BarcodeView barcodeView = decoratedBarcodeView2.read;
        C7859x4b44cbfb decoratedBarcodeView$MediaBrowserCompat$CustomActionResultReceiver = new C7859x4b44cbfb(decoratedBarcodeView2, getiiddeserializerrtti);
        barcodeView.IconCompatParcelizer = BarcodeView.write.SINGLE;
        barcodeView.MediaBrowserCompat$ItemReceiver = decoratedBarcodeView$MediaBrowserCompat$CustomActionResultReceiver;
        barcodeView.read();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        validateTranspose validatetranspose = this.IconCompatParcelizer;
        if (Build.VERSION.SDK_INT < 23) {
            validatetranspose.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver();
        } else if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(validatetranspose.MediaBrowserCompat$CustomActionResultReceiver, "android.permission.CAMERA") == 0) {
            validatetranspose.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$SearchResultReceiver();
        } else if (!validatetranspose.IconCompatParcelizer) {
            AppCompatRatingBar.write(validatetranspose.MediaBrowserCompat$CustomActionResultReceiver, new String[]{"android.permission.CAMERA"}, validateTranspose.read);
            validatetranspose.IconCompatParcelizer = true;
        }
        rsnScriptKernelIDCreate rsnscriptkernelidcreate = validatetranspose.MediaBrowserCompat$MediaItem;
        if (!rsnscriptkernelidcreate.MediaBrowserCompat$MediaItem) {
            rsnscriptkernelidcreate.IconCompatParcelizer.registerReceiver(rsnscriptkernelidcreate.MediaBrowserCompat$CustomActionResultReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            rsnscriptkernelidcreate.MediaBrowserCompat$MediaItem = true;
        }
        rsnscriptkernelidcreate.write.removeCallbacksAndMessages((Object) null);
        if (rsnscriptkernelidcreate.MediaBrowserCompat$ItemReceiver) {
            rsnscriptkernelidcreate.write.postDelayed(rsnscriptkernelidcreate.read, 300000);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        validateTranspose validatetranspose = this.IconCompatParcelizer;
        validatetranspose.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        BarcodeView barcodeView = validatetranspose.MediaBrowserCompat$ItemReceiver.read;
        CGERU cgeru = barcodeView.write;
        barcodeView.MediaBrowserCompat$CustomActionResultReceiver();
        long nanoTime = System.nanoTime();
        while (cgeru != null && !cgeru.IconCompatParcelizer && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        validateTranspose validatetranspose = this.IconCompatParcelizer;
        validatetranspose.RatingCompat = true;
        validatetranspose.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        validatetranspose.MediaDescriptionCompat.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.IconCompatParcelizer.write(i, iArr);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }
}
