package com.scb.phone.view.activity.ndid;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.TypedValue;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.pingan.p031ai.face.common.PaFaceConstants;
import com.pingan.p031ai.face.entity.PaFaceDetectFrame;
import com.pingan.p031ai.face.manager.PaFaceDetectorManager;
import com.pingan.p031ai.face.manager.impl.OnPaFaceDetectorListener;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.ndid.C1112x3acc57ff;
import com.scb.phone.view.custom.ndid.OverlayWithCircleFocus;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4066bA;
import p040o.CalendarPagerView;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.IOException;
import p040o.KmcException;
import p040o.KmcRuntimeException;
import p040o.MediaImageService;
import p040o.ProxySourceAdapter$ItemViewHolder;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getExtractSignatureImage;
import p040o.newLatLngBounds;
import p040o.newLatLngBounds$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onCheckBoxClick;
import p040o.onInitializeAccessibilityEvent;
import p040o.setSelectedDates;

public abstract class BaseLivenessCheckActivity extends BaseActivity implements MediaImageService.IconCompatParcelizer, C1112x3acc57ff, getExtractSignatureImage {
    private BulkTransferDeepLinkActivity AlertController$RecycleListView;
    private MediaImageService MediaBrowserCompat$MediaItem;
    private List<Integer> MediaBrowserCompat$SearchResultReceiver = new ArrayList();
    public boolean MediaDescriptionCompat;
    private PaFaceDetectorManager MediaMetadataCompat;
    private OnPaFaceDetectorListener MediaSessionCompat$ResultReceiverWrapper = new OnPaFaceDetectorListener() {
        public final void onDetectTips(int i) {
            boolean z = false;
            int i2 = R.string.ndid_liveness_check_tips_noface;
            switch (i) {
                case PaFaceConstants.EnvironmentalTips.NORMAL /*2001*/:
                    i2 = R.string.ndid_liveness_check_tips_normal;
                    break;
                case PaFaceConstants.EnvironmentalTips.NO_FACE /*2002*/:
                case PaFaceConstants.EnvironmentalTips.FACE_NO_CENTER /*2004*/:
                    break;
                case PaFaceConstants.EnvironmentalTips.MULTI_FACE /*2003*/:
                    i2 = R.string.ndid_liveness_check_tips_multiface;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_YAW_LEFT /*2005*/:
                    i2 = R.string.ndid_liveness_check_tips_yawleft;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_YAW_RIGHT /*2006*/:
                    i2 = R.string.ndid_liveness_check_tips_yawright;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_ROLL_LEFT /*2007*/:
                    i2 = R.string.ndid_liveness_check_tips_rollleft;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_ROLL_RIGHT /*2008*/:
                    i2 = R.string.ndid_liveness_check_tips_rollright;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_PITCH_UP /*2009*/:
                    i2 = R.string.ndid_liveness_check_tips_pitchup;
                    break;
                case PaFaceConstants.EnvironmentalTips.FACE_PITCH_DOWN /*2010*/:
                    i2 = R.string.ndid_liveness_check_tips_pitchdown;
                    break;
                case PaFaceConstants.EnvironmentalTips.TOO_DARK /*2011*/:
                    i2 = R.string.ndid_liveness_check_tips_toodark;
                    break;
                case PaFaceConstants.EnvironmentalTips.TOO_BRIGHT /*2012*/:
                    i2 = R.string.ndid_liveness_check_tips_toobright;
                    break;
                case PaFaceConstants.EnvironmentalTips.TOO_FUZZY /*2013*/:
                    i2 = R.string.ndid_liveness_check_tips_toofuzzy;
                    break;
                case PaFaceConstants.EnvironmentalTips.TOO_CLOSE /*2014*/:
                    i2 = R.string.ndid_liveness_check_tips_tooclose;
                    break;
                case PaFaceConstants.EnvironmentalTips.TOO_FAR /*2015*/:
                    i2 = R.string.ndid_liveness_check_tips_toofar;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            C4066bA MediaSessionCompat$Token = BaseLivenessCheckActivity.this.MediaSessionCompat$Token();
            KmcException kmcException = new KmcException(i2);
            if (MediaSessionCompat$Token.RatingCompat != null) {
                z = true;
            }
            if (z) {
                kmcException.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
            }
        }

        public final void onDetectMotionTips(int i) {
            C4066bA MediaSessionCompat$Token = BaseLivenessCheckActivity.this.MediaSessionCompat$Token();
            KmcException kmcException = new KmcException(R.string.ndid_liveness_check_tips_normal);
            if (MediaSessionCompat$Token.RatingCompat != null) {
                kmcException.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
            }
        }

        public final void onDetectMotionDone(int i) {
            if (i == 1003 || i == 1004 || i == 1005) {
                C4066bA MediaSessionCompat$Token = BaseLivenessCheckActivity.this.MediaSessionCompat$Token();
                boolean z = true;
                MediaSessionCompat$Token.write++;
                KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(MediaSessionCompat$Token);
                if (MediaSessionCompat$Token.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kmcRuntimeException.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
                }
            }
        }

        public final void onInterruptError(int i) {
            BaseLivenessCheckActivity baseLivenessCheckActivity = BaseLivenessCheckActivity.this;
            BaseLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(baseLivenessCheckActivity, baseLivenessCheckActivity.getString(R.string.fixed_account_details_load_error_description));
        }

        public final void onDetectComplete(int i, PaFaceDetectFrame[] paFaceDetectFrameArr) {
            if (i != 4001 || paFaceDetectFrameArr == null || paFaceDetectFrameArr.length <= 0) {
                BaseLivenessCheckActivity baseLivenessCheckActivity = BaseLivenessCheckActivity.this;
                BaseLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(baseLivenessCheckActivity, baseLivenessCheckActivity.getString(R.string.ndid_liveness_check_error_timeout_description));
                return;
            }
            PaFaceDetectFrame paFaceDetectFrame = paFaceDetectFrameArr[0];
            newLatLngBounds$MediaBrowserCompat$CustomActionResultReceiver newlatlngbounds_mediabrowsercompat_customactionresultreceiver = new newLatLngBounds$MediaBrowserCompat$CustomActionResultReceiver();
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.ParcelableVolumeInfo = paFaceDetectFrame.rectX;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token = paFaceDetectFrame.rectY;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem = paFaceDetectFrame.rectW;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.f2900x50fd9e4a = paFaceDetectFrame.rectH;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = paFaceDetectFrame.faceNum;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat$CustomAction = paFaceDetectFrame.yaw;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = paFaceDetectFrame.pitch;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$ResultReceiverWrapper = paFaceDetectFrame.roll;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = paFaceDetectFrame.blurness;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = paFaceDetectFrame.brightness;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.write = paFaceDetectFrame.imageFrame;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat = paFaceDetectFrame.frameWidth;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.read = BitmapDescriptorFactory.HUE_RED;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem = paFaceDetectFrame.frameHeight;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat = paFaceDetectFrame.frameOri;
            newlatlngbounds_mediabrowsercompat_customactionresultreceiver.RatingCompat = paFaceDetectFrame.liveScore;
            BaseLivenessCheckActivity.this.MediaSessionCompat$Token().MediaBrowserCompat$CustomActionResultReceiver(new newLatLngBounds(newlatlngbounds_mediabrowsercompat_customactionresultreceiver, (byte) 0));
            BaseLivenessCheckActivity.write(BaseLivenessCheckActivity.this);
        }
    };
    private int MediaSessionCompat$Token;
    private CountDownTimer PlaybackStateCompat$CustomAction = new CountDownTimer() {
        public final void onTick(long j) {
        }

        public final void onFinish() {
            BaseLivenessCheckActivity baseLivenessCheckActivity = BaseLivenessCheckActivity.this;
            BaseLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(baseLivenessCheckActivity, baseLivenessCheckActivity.getString(R.string.ndid_liveness_check_error_timeout_description));
        }
    };
    @BindView
    Button buttonStart;
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fileDir")
    @HmlPinActivity
    public File cacheFileDir;
    @BindView
    FrameLayout framePreview;
    @BindView
    LinearLayout layoutBlink;
    @BindView
    OverlayWithCircleFocus owcfFocus;
    @BindView
    TextView tvFeedback;
    @BindView
    TextView tvInstruction;
    @BindView
    TextView tvMotionCount;

    /* access modifiers changed from: protected */
    public abstract C4066bA MediaSessionCompat$Token();

    static {
        System.loadLibrary("face_detect");
        System.loadLibrary("nllvm1606287625");
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79012131493126);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver(this);
        C4066bA MediaSessionCompat$Token2 = MediaSessionCompat$Token();
        IOException iOException = IOException.MediaBrowserCompat$CustomActionResultReceiver;
        if (MediaSessionCompat$Token2.RatingCompat != null) {
            iOException.IconCompatParcelizer(MediaSessionCompat$Token2.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver(this.framePreview);
        setContentView();
        this.buttonStart.setEnabled(false);
        this.buttonStart.setVisibility(0);
        this.tvInstruction.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNavigateBack() {
        finish();
    }

    public void MediaSessionCompat$ResultReceiverWrapper() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public void MediaSessionCompat$QueueItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public void onResume() {
        super.onResume();
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(this, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE")) {
            AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public void AppCompatDelegateImpl$ListMenuDecorView() {
        this.buttonStart.setEnabled(true);
        this.owcfFocus.setLineFocus(true);
        this.buttonStart.setVisibility(0);
        this.tvInstruction.setVisibility(8);
        MediaImageService mediaImageService = this.MediaBrowserCompat$MediaItem;
        mediaImageService.RatingCompat.addCallback(mediaImageService);
        if (mediaImageService.MediaBrowserCompat$CustomActionResultReceiver != null) {
            try {
                if (mediaImageService.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    mediaImageService.MediaBrowserCompat$CustomActionResultReceiver.release();
                    mediaImageService.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } catch (Exception e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = 0;
        while (true) {
            if (i >= numberOfCameras) {
                break;
            }
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == mediaImageService.MediaBrowserCompat$ItemReceiver) {
                mediaImageService.MediaBrowserCompat$CustomActionResultReceiver = Camera.open(i);
                break;
            }
            if (numberOfCameras == 1) {
                mediaImageService.MediaBrowserCompat$CustomActionResultReceiver = Camera.open(i);
                mediaImageService.MediaBrowserCompat$ItemReceiver = i;
            }
            i++;
        }
        Camera camera = mediaImageService.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            mediaImageService.IconCompatParcelizer = parameters;
            parameters.setPreviewFormat(17);
            mediaImageService.IconCompatParcelizer.setPreviewSize(640, C0608h.f1447Az);
            List<String> supportedFocusModes = mediaImageService.IconCompatParcelizer.getSupportedFocusModes();
            if (supportedFocusModes.contains("continuous-picture")) {
                mediaImageService.IconCompatParcelizer.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("fixed")) {
                mediaImageService.IconCompatParcelizer.setFocusMode("fixed");
            } else if (supportedFocusModes.contains("infinity")) {
                mediaImageService.IconCompatParcelizer.setFocusMode("infinity");
            } else if (supportedFocusModes.contains("continuous-video")) {
                mediaImageService.IconCompatParcelizer.setFocusMode("continuous-video");
            } else {
                mediaImageService.IconCompatParcelizer.setFocusMode(supportedFocusModes.get(0));
            }
            mediaImageService.IconCompatParcelizer.setPreviewFrameRate(30);
            mediaImageService.MediaBrowserCompat$CustomActionResultReceiver.setParameters(mediaImageService.IconCompatParcelizer);
        }
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        this.tvFeedback.setText(R.string.ndid_liveness_check_instruction_1);
        this.tvInstruction.setText("");
    }

    public final void write(byte[] bArr) {
        PaFaceDetectorManager paFaceDetectorManager;
        int i = this.MediaSessionCompat$Token + 1;
        this.MediaSessionCompat$Token = i;
        if (i > 15 && (paFaceDetectorManager = this.MediaMetadataCompat) != null) {
            paFaceDetectorManager.detectPreviewFrame(i, bArr, this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem.read, 640, C0608h.f1447Az);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(FrameLayout frameLayout) {
        MediaImageService mediaImageService = new MediaImageService(this);
        this.MediaBrowserCompat$MediaItem = mediaImageService;
        mediaImageService.MediaBrowserCompat$ItemReceiver = 1;
        Display defaultDisplay = ((WindowManager) mediaImageService.write.getSystemService("window")).getDefaultDisplay();
        SurfaceView surfaceView = new SurfaceView(mediaImageService.write);
        SurfaceHolder holder = surfaceView.getHolder();
        mediaImageService.RatingCompat = holder;
        holder.setType(3);
        int max = Math.max(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) ((((float) max) * 3.0f) / 4.0f), max);
        surfaceView.setLayoutParams(layoutParams);
        frameLayout.addView(surfaceView);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams2.width = layoutParams.width;
        layoutParams2.height = layoutParams.height;
        frameLayout.setLayoutParams(layoutParams2);
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem = this;
        this.owcfFocus.setOnStateChangeListener(this);
    }

    private void setContentView() {
        PaFaceDetectorManager instance = PaFaceDetectorManager.getInstance();
        this.MediaMetadataCompat = instance;
        instance.initFaceDetector(this);
        this.MediaMetadataCompat.setOnFaceDetectorListener(this.MediaSessionCompat$ResultReceiverWrapper);
        this.MediaBrowserCompat$SearchResultReceiver.clear();
        this.MediaBrowserCompat$SearchResultReceiver.addAll(Arrays.asList(new Integer[]{1003, 1005, 1004}));
        Collections.shuffle(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaMetadataCompat.setMotions(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaMetadataCompat.setLoggerEnable(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        if (i < this.MediaBrowserCompat$SearchResultReceiver.size()) {
            read(this.MediaBrowserCompat$SearchResultReceiver.get(i).intValue());
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(newLatLngBounds newlatlngbounds) {
        this.AlertController$RecycleListView = FragmentBuilder_BindDepositSelectorFragment.write(this.cacheFileDir, newlatlngbounds.MediaBrowserCompat$CustomActionResultReceiver).write(new setSelectedDates(MediaSessionCompat$Token()), new onInitializeAccessibilityEvent(MediaSessionCompat$Token()));
    }

    private void read(int i) {
        String IconCompatParcelizer = IconCompatParcelizer(i);
        this.tvInstruction.setVisibility(0);
        this.tvInstruction.setText(IconCompatParcelizer);
        this.tvInstruction.startAnimation(AnimationUtils.loadAnimation(this, R.anim.f64472130772014));
    }

    private String IconCompatParcelizer(int i) {
        if (i == 1003) {
            return getString(R.string.ndid_liveness_check_instruction_blink_eye);
        }
        if (i == 1004) {
            return getString(R.string.ndid_liveness_check_instruction_shake_head);
        }
        return i == 1005 ? getString(R.string.ndid_liveness_check_instruction_nod_head) : "";
    }

    public final void write(int i) {
        this.tvFeedback.setText(i == 0 ? "" : getString(i));
    }

    private access$2300 AppCompatActivity() {
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        CalendarPagerView calendarPagerView = new CalendarPagerView(this);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = calendarPagerView;
        return access_2300;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14922x50fd9e4a() {
        this.MediaMetadataCompat.stopFaceDetect();
        this.MediaMetadataCompat.release();
        MediaSessionCompat$Token().write = 0;
        MediaBrowserCompat$CustomActionResultReceiver(this.framePreview);
        setContentView();
        if (!this.MediaDescriptionCompat) {
            AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public final void write(access$2200 access_2200) {
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = AppCompatActivity();
        this.MediaDescriptionCompat = true;
        super.write(access_2200);
    }

    public final void IconCompatParcelizer() {
        setResult(-1, new Intent());
        finish();
    }

    public void onPause() {
        super.onPause();
        this.MediaMetadataCompat.stopFaceDetect();
        Camera camera = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            camera.stopPreview();
        }
        this.PlaybackStateCompat$CustomAction.cancel();
    }

    public void onDestroy() {
        this.MediaMetadataCompat.release();
        MediaImageService mediaImageService = this.MediaBrowserCompat$MediaItem;
        if (mediaImageService.write != null) {
            mediaImageService.write = null;
        }
        if (mediaImageService.MediaBrowserCompat$MediaItem != null) {
            mediaImageService.MediaBrowserCompat$MediaItem = null;
        }
        MediaSessionCompat$Token().onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.AlertController$RecycleListView;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        super.onDestroy();
    }

    public final void read(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.tvFeedback.getLayoutParams();
        layoutParams.topMargin = i + i2 + ((int) TypedValue.applyDimension(1, 36.0f, getApplicationContext().getResources().getDisplayMetrics()));
        this.tvFeedback.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.layoutBlink.getLayoutParams();
        layoutParams2.height = layoutParams.topMargin;
        this.layoutBlink.setLayoutParams(layoutParams2);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(BaseLivenessCheckActivity baseLivenessCheckActivity, String str) {
        baseLivenessCheckActivity.MediaMetadataCompat.stopFaceDetect();
        Camera camera = baseLivenessCheckActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            camera.stopPreview();
        }
        baseLivenessCheckActivity.PlaybackStateCompat$CustomAction.cancel();
        baseLivenessCheckActivity.tvMotionCount.setText("");
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = baseLivenessCheckActivity.getString(R.string.ndid_liveness_check_error_timeout_header);
        access_2200.IconCompatParcelizer = str;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = baseLivenessCheckActivity.AppCompatActivity();
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = baseLivenessCheckActivity.AppCompatActivity();
        baseLivenessCheckActivity.MediaDescriptionCompat = true;
        super.write(access_2200);
    }

    static /* synthetic */ void write(BaseLivenessCheckActivity baseLivenessCheckActivity) {
        baseLivenessCheckActivity.MediaMetadataCompat.stopFaceDetect();
        Camera camera = baseLivenessCheckActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            camera.stopPreview();
        }
        baseLivenessCheckActivity.PlaybackStateCompat$CustomAction.cancel();
    }

    @OnClick
    public void onButtonStartClick() {
        if (!this.MediaDescriptionCompat) {
            this.MediaMetadataCompat.startFaceDetect();
            this.PlaybackStateCompat$CustomAction.start();
        }
        this.buttonStart.setVisibility(8);
        this.tvInstruction.setVisibility(0);
        this.owcfFocus.setLineFocus(false);
        this.tvFeedback.setText("");
        if (this.MediaBrowserCompat$SearchResultReceiver.size() > 0) {
            read(this.MediaBrowserCompat$SearchResultReceiver.get(0).intValue());
        }
    }
}
