package com.scb.phone.view.activity.ndid;

import android.content.ContentResolver;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.camera.CameraApi2;
import com.scb.phone.view.custom.ndid.OverlayNationalIdFocus;
import com.scb.phone.view.custom.ndid.OverlayNationalIdFocus$MediaBrowserCompat$ItemReceiver;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4111bp;
import p040o.C4114bu;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.buildDayViews;
import p040o.copyDateTo;
import p040o.getBackBarcodes;
import p040o.getCameraSourceType;
import p040o.requestCreditPowerLoan;
import p040o.setOnCompleteListener;
import p040o.setSelectionColor;
import p040o.setTitleFormatter;
import p040o.verifyCommercialReferral;

public class NationalIdCameraActivity extends BaseActivity implements verifyCommercialReferral, getBackBarcodes, OverlayNationalIdFocus$MediaBrowserCompat$ItemReceiver {
    private Uri AlertController$RecycleListView;
    public boolean MediaBrowserCompat$MediaItem = false;
    public int MediaBrowserCompat$SearchResultReceiver;
    public CameraApi2 MediaDescriptionCompat;
    public requestCreditPowerLoan MediaMetadataCompat;
    private float MediaSessionCompat$ResultReceiverWrapper = 1.0f;
    public int MediaSessionCompat$Token;
    private BulkTransferDeepLinkActivity PlaybackStateCompat$CustomAction;
    @BindView
    public ImageView ivArrowBack;
    @BindView
    public ImageView ivCapture;
    @HmlPinActivity
    public C4114bu ndidNationalIdCameraPresenter;
    @BindView
    public OverlayNationalIdFocus overlay;
    @BindView
    public SurfaceView surfaceView;
    @BindView
    public TextureView textureView;
    @BindView
    public TextView tvTitle;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78982131493123);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent() != null) {
            Uri uri = (Uri) getIntent().getParcelableExtra("output");
            this.AlertController$RecycleListView = uri;
            if (uri != null) {
                this.MediaSessionCompat$ResultReceiverWrapper = getIntent().getFloatExtra("EXTRA_CROP_RATIO", 1.0f);
            } else {
                throw new IllegalArgumentException("Please specify Uri via EXTRA_OUTPUT");
            }
        }
        this.ndidNationalIdCameraPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4114bu buVar = this.ndidNationalIdCameraPresenter;
        C4111bp bpVar = C4111bp.MediaBrowserCompat$ItemReceiver;
        if (buVar.RatingCompat != null) {
            bpVar.IconCompatParcelizer(buVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        if (!this.MediaBrowserCompat$MediaItem) {
            this.textureView.setVisibility(0);
            this.surfaceView.setVisibility(8);
            CameraApi2 cameraApi2 = new CameraApi2(this);
            this.MediaDescriptionCompat = cameraApi2;
            cameraApi2.read = this;
        } else {
            this.textureView.setVisibility(8);
            this.surfaceView.setVisibility(0);
            requestCreditPowerLoan requestcreditpowerloan = new requestCreditPowerLoan(this);
            this.MediaMetadataCompat = requestcreditpowerloan;
            requestcreditpowerloan.IconCompatParcelizer = this;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.MediaBrowserCompat$SearchResultReceiver = displayMetrics.heightPixels;
        this.MediaSessionCompat$Token = displayMetrics.widthPixels;
        this.overlay.setOnStateChangeListener(this);
    }

    public void onResume() {
        super.onResume();
        copyDateTo.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @OnClick
    public void onClick() {
        CaptureRequest.Builder builder;
        if (!this.MediaBrowserCompat$MediaItem) {
            CameraApi2 cameraApi2 = this.MediaDescriptionCompat;
            if (!(cameraApi2.MediaBrowserCompat$CustomActionResultReceiver == null || (builder = cameraApi2.MediaBrowserCompat$SearchResultReceiver) == null || cameraApi2.IconCompatParcelizer == null)) {
                builder.set(CaptureRequest.JPEG_ORIENTATION, cameraApi2.MediaBrowserCompat$ItemReceiver.get(CameraCharacteristics.SENSOR_ORIENTATION));
                try {
                    cameraApi2.MediaBrowserCompat$CustomActionResultReceiver.capture(cameraApi2.MediaBrowserCompat$SearchResultReceiver.build(), (CameraCaptureSession.CaptureCallback) null, cameraApi2.IconCompatParcelizer);
                } catch (CameraAccessException e) {
                    e.getMessage();
                }
            }
        } else {
            requestCreditPowerLoan requestcreditpowerloan = this.MediaMetadataCompat;
            Camera camera = requestcreditpowerloan.read;
            if (camera != null) {
                camera.takePicture(requestcreditpowerloan.MediaBrowserCompat$MediaItem, requestcreditpowerloan.MediaDescriptionCompat, requestcreditpowerloan.write);
            }
        }
        this.ivCapture.setEnabled(false);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo34100x50fd9e4a() {
        CaptureRequest.Builder builder;
        if (!this.MediaBrowserCompat$MediaItem) {
            CameraApi2 cameraApi2 = this.MediaDescriptionCompat;
            CaptureRequest.Key key = CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE;
            CaptureRequest.Builder builder2 = cameraApi2.RatingCompat;
            if (!(builder2 == null || cameraApi2.MediaBrowserCompat$SearchResultReceiver == null)) {
                builder2.set(key, 2);
                cameraApi2.MediaBrowserCompat$SearchResultReceiver.set(key, 2);
            }
            CameraApi2 cameraApi22 = this.MediaDescriptionCompat;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            CaptureRequest.Builder builder3 = cameraApi22.RatingCompat;
            if (!(builder3 == null || cameraApi22.MediaBrowserCompat$SearchResultReceiver == null)) {
                builder3.set(key2, 4);
                cameraApi22.MediaBrowserCompat$SearchResultReceiver.set(key2, 4);
            }
            CameraApi2 cameraApi23 = this.MediaDescriptionCompat;
            CameraCaptureSession cameraCaptureSession = cameraApi23.MediaBrowserCompat$CustomActionResultReceiver;
            if (cameraCaptureSession != null && (builder = cameraApi23.RatingCompat) != null && cameraApi23.IconCompatParcelizer != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(builder.build(), (CameraCaptureSession.CaptureCallback) null, cameraApi23.IconCompatParcelizer);
                } catch (CameraAccessException e) {
                    e.getMessage();
                }
            }
        } else {
            this.MediaMetadataCompat.read.startPreview();
        }
    }

    public final void read(Image image) {
        CameraCaptureSession cameraCaptureSession = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                e.getMessage();
            }
        }
        if (this.AlertController$RecycleListView != null) {
            int rotation = getWindowManager().getDefaultDisplay().getRotation();
            C4114bu buVar = this.ndidNationalIdCameraPresenter;
            ContentResolver contentResolver = getContentResolver();
            Uri uri = this.AlertController$RecycleListView;
            float f = this.MediaSessionCompat$ResultReceiverWrapper;
            boolean z = true;
            if (buVar.RatingCompat != null) {
                buVar.RatingCompat.AlertController$RecycleListView();
            }
            getCameraSourceType getcamerasourcetype = new getCameraSourceType(buVar, contentResolver, image, uri, f, rotation);
            if (buVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getcamerasourcetype.IconCompatParcelizer(buVar.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        this.MediaMetadataCompat.read.stopPreview();
        if (this.AlertController$RecycleListView != null) {
            int rotation = getWindowManager().getDefaultDisplay().getRotation();
            C4114bu buVar = this.ndidNationalIdCameraPresenter;
            ContentResolver contentResolver = getContentResolver();
            Uri uri = this.AlertController$RecycleListView;
            float f = this.MediaSessionCompat$ResultReceiverWrapper;
            boolean z = true;
            if (buVar.RatingCompat != null) {
                buVar.RatingCompat.AlertController$RecycleListView();
            }
            setOnCompleteListener setoncompletelistener = new setOnCompleteListener(buVar, contentResolver, bArr, uri, f, rotation);
            if (buVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setoncompletelistener.IconCompatParcelizer(buVar.RatingCompat);
            }
        }
    }

    private void MediaSessionCompat$QueueItem() {
        if (!this.MediaBrowserCompat$MediaItem) {
            CameraApi2 cameraApi2 = this.MediaDescriptionCompat;
            CameraDevice cameraDevice = cameraApi2.MediaBrowserCompat$MediaItem;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            HandlerThread handlerThread = cameraApi2.write;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                try {
                    cameraApi2.write.join();
                    cameraApi2.write = null;
                    cameraApi2.IconCompatParcelizer = null;
                } catch (InterruptedException e) {
                    e.getMessage();
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            requestCreditPowerLoan requestcreditpowerloan = this.MediaMetadataCompat;
            Camera camera = requestcreditpowerloan.read;
            if (camera != null) {
                camera.stopPreview();
                requestcreditpowerloan.read.release();
                requestcreditpowerloan.read = null;
            }
        }
    }

    public void onDestroy() {
        MediaSessionCompat$QueueItem();
        this.ndidNationalIdCameraPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.PlaybackStateCompat$CustomAction;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    @OnClick
    public void onNavigateBack() {
        MediaSessionCompat$QueueItem();
        setResult(0);
        finish();
    }

    public final void read() {
        MediaSessionCompat$QueueItem();
        runOnUiThread(new buildDayViews(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        onNavigateBack();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ContentResolver contentResolver, Image image, Uri uri, float f, int i) {
        this.PlaybackStateCompat$CustomAction = FragmentBuilder_BindDepositSelectorFragment.write(contentResolver, getResources(), image, uri, f, i).write(new setTitleFormatter(this.ndidNationalIdCameraPresenter), new setSelectionColor(this.ndidNationalIdCameraPresenter));
    }

    public final void read(ContentResolver contentResolver, byte[] bArr, Uri uri, float f, int i) {
        this.PlaybackStateCompat$CustomAction = FragmentBuilder_BindDepositSelectorFragment.read(contentResolver, getResources(), bArr, uri, f, i).write(new setTitleFormatter(this.ndidNationalIdCameraPresenter), new setSelectionColor(this.ndidNationalIdCameraPresenter));
    }

    public final void read(int i, int i2) {
        this.tvTitle.setX((float) (((int) (((float) (i2 - this.tvTitle.getWidth())) / 2.0f)) + i));
    }
}
