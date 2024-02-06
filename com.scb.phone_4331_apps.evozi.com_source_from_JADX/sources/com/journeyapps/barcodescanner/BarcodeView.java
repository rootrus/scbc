package com.journeyapps.barcodescanner;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import p040o.CGERU;
import p040o.FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment;
import p040o.MapConstraints;
import p040o.getIIdDeserializerRtti;
import p040o.rsnIncContextCreate;
import p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.validateTRMV;
import p040o.validateTRSM;
import p040o.validateUplo;
import p040o.zzlr$MediaBrowserCompat$ItemReceiver;
import p040o.zzma;

public class BarcodeView extends CameraPreview {
    /* access modifiers changed from: package-private */
    public write IconCompatParcelizer = write.NONE;
    validateUplo MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: package-private */
    public getIIdDeserializerRtti MediaBrowserCompat$ItemReceiver = null;
    private final Handler.Callback MediaBrowserCompat$SearchResultReceiver = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode_succeeded) {
                zzlr$MediaBrowserCompat$ItemReceiver zzlr_mediabrowsercompat_itemreceiver = (zzlr$MediaBrowserCompat$ItemReceiver) message.obj;
                if (!(zzlr_mediabrowsercompat_itemreceiver == null || BarcodeView.this.MediaBrowserCompat$ItemReceiver == null || BarcodeView.this.IconCompatParcelizer == write.NONE)) {
                    BarcodeView.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(zzlr_mediabrowsercompat_itemreceiver);
                    if (BarcodeView.this.IconCompatParcelizer == write.SINGLE) {
                        BarcodeView barcodeView = BarcodeView.this;
                        barcodeView.IconCompatParcelizer = write.NONE;
                        barcodeView.MediaBrowserCompat$ItemReceiver = null;
                        validateUplo validateuplo = barcodeView.MediaBrowserCompat$CustomActionResultReceiver;
                        if (validateuplo != null) {
                            validateuplo.IconCompatParcelizer();
                            barcodeView.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    }
                }
                return true;
            } else if (message.what == rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_decode_failed) {
                return true;
            } else {
                if (message.what != rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.MediaBrowserCompat$ItemReceiver == null || BarcodeView.this.IconCompatParcelizer == write.NONE)) {
                    BarcodeView.this.MediaBrowserCompat$ItemReceiver.write(list);
                }
                return true;
            }
        }
    };
    private validateTRSM MediaDescriptionCompat = new validateTRMV();
    private Handler MediaMetadataCompat = new Handler(this.MediaBrowserCompat$SearchResultReceiver);

    enum write {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private zzma RatingCompat() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new validateTRMV();
        }
        FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment fragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment = new FragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment();
        HashMap hashMap = new HashMap();
        hashMap.put(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK, fragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment);
        zzma MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(hashMap);
        fragmentBuilder_BindHmlNtbBusinessOccupationInfoFragment.write = MediaBrowserCompat$CustomActionResultReceiver2;
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    /* access modifiers changed from: protected */
    public final void write() {
        super.write();
        read();
    }

    /* access modifiers changed from: package-private */
    public void read() {
        validateUplo validateuplo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (validateuplo != null) {
            validateuplo.IconCompatParcelizer();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        if (this.IconCompatParcelizer != write.NONE && MediaBrowserCompat$ItemReceiver()) {
            validateUplo validateuplo2 = new validateUplo(this.write, RatingCompat(), this.MediaMetadataCompat);
            this.MediaBrowserCompat$CustomActionResultReceiver = validateuplo2;
            validateuplo2.write = this.RatingCompat;
            validateUplo validateuplo3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                HandlerThread handlerThread = new HandlerThread(validateUplo.IconCompatParcelizer);
                validateuplo3.MediaMetadataCompat = handlerThread;
                handlerThread.start();
                validateuplo3.RatingCompat = new Handler(validateuplo3.MediaMetadataCompat.getLooper(), validateuplo3.MediaBrowserCompat$ItemReceiver);
                validateuplo3.MediaDescriptionCompat = true;
                CGERU cgeru = validateuplo3.read;
                cgeru.MediaDescriptionCompat.post(new Runnable(validateuplo3.MediaBrowserCompat$MediaItem) {
                    final /* synthetic */ IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r2;
                    }

                    public final void run() {
                        if (!CGERU.this.MediaMetadataCompat) {
                            Log.d(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Camera is closed, not requesting preview");
                            return;
                        }
                        MapConstraints.ConstrainedMultimap.C36372.write read = CGERU.this.MediaBrowserCompat$ItemReceiver;
                        C96741 r1 = new Runnable() {
                            public final void run() {
                                CHEMV MediaBrowserCompat$ItemReceiver2 = CGERU.this.write;
                                IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory idCaptureModule_GetIExceptionResponseDeserializerRttiFactory = C96731.this.IconCompatParcelizer;
                                Camera camera = MediaBrowserCompat$ItemReceiver2.write;
                                if (camera != null && MediaBrowserCompat$ItemReceiver2.MediaDescriptionCompat) {
                                    MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = idCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
                                    camera.setOneShotPreviewCallback(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$SearchResultReceiver);
                                }
                            }
                        };
                        synchronized (read.read) {
                            read.MediaBrowserCompat$CustomActionResultReceiver();
                            read.write.post(r1);
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        validateUplo validateuplo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (validateuplo != null) {
            validateuplo.IconCompatParcelizer();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        super.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void setDecoderFactory(validateTRSM validatetrsm) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.MediaDescriptionCompat = validatetrsm;
            validateUplo validateuplo = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (validateuplo != null) {
                validateuplo.MediaBrowserCompat$CustomActionResultReceiver = RatingCompat();
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
