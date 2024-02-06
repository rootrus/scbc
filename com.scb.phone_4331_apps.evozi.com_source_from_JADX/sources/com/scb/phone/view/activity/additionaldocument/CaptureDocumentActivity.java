package com.scb.phone.view.activity.additionaldocument;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentCaptureExperience;
import com.kofax.kmc.kui.uicontrols.captureanimations.DocumentCaptureExperienceCriteriaHolder;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.kmc.kut.utilities.Size;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.additionaldocument.CropDocumentActivity;
import com.scb.phone.view.activity.hml.HmlDocumentListActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import kotlin.TypeCastException;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4117x54b0e1e6;
import p040o.CheckSCBSEligibilityActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.buildFromJson;
import p040o.buildFromJson$MediaBrowserCompat$ItemReceiver;
import p040o.buildFromJson$MediaBrowserCompat$MediaItem;
import p040o.buildFromJson$MediaSessionCompat$QueueItem;
import p040o.getImageBytes;
import p040o.getUndersizeImage;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setAutoFocusEnabled;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class CaptureDocumentActivity extends BaseActivity implements getUndersizeImage {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    /* access modifiers changed from: private */
    public CountDownTimer MediaBrowserCompat$MediaItem;
    private DocumentCaptureExperience MediaBrowserCompat$SearchResultReceiver;
    private final CameraInitializationListener MediaMetadataCompat = new write(this);
    private final ImageCapturedListener MediaSessionCompat$ResultReceiverWrapper = new C5559x8d8da91d(this);
    private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
    @BindView
    public ImageView captureButton;
    @BindView
    public ImageView coachmarkImage;
    @BindView
    public ImageCaptureView imageCaptureView;
    @HmlPinActivity
    public buildFromJson presenter;
    @BindView
    public TextView seeInstructionsText;

    static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        read(buildFromJson buildfromjson) {
            super(1, buildfromjson);
        }

        public final String getName() {
            return "saveBitmapToFileSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(buildFromJson.class);
        }

        public final String getSignature() {
            return "saveBitmapToFileSuccess(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            buildFromJson buildfromjson = (buildFromJson) this.receiver;
            onGetStartedClick.write((Object) str, "path");
            boolean z = true;
            if (buildfromjson.RatingCompat != null) {
                buildfromjson.RatingCompat.aj_();
            }
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new buildFromJson.MediaMetadataCompat(buildfromjson, str);
            if (buildfromjson.RatingCompat == null) {
                z = false;
            }
            if (z) {
                mediaMetadataCompat.IconCompatParcelizer(buildfromjson.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write implements CameraInitializationListener {
        private /* synthetic */ CaptureDocumentActivity read;

        write(CaptureDocumentActivity captureDocumentActivity) {
            this.read = captureDocumentActivity;
        }

        public final void onCameraInitialized(CameraInitializationEvent cameraInitializationEvent) {
            CaptureDocumentActivity.write(this.read);
        }
    }

    @OnClick
    public final void onFlashLightClicked() {
        try {
            ImageCaptureView imageCaptureView2 = this.imageCaptureView;
            if (imageCaptureView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
            }
            ImageCaptureView imageCaptureView3 = this.imageCaptureView;
            if (imageCaptureView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
            }
            imageCaptureView2.setFlash(imageCaptureView3.getFlash() == Flash.TORCH ? Flash.OFF : Flash.TORCH);
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    @OnClick
    public final void onSeeInstructionsClicked() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String name = setAutoFocusEnabled.IconCompatParcelizer.HML.name();
        String str = buildfromjson.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        boolean z = true;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(name, str, true)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaBrowserCompat$MediaItem.IconCompatParcelizer;
            if (buildfromjson.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
            }
        }
    }

    @OnClick
    public final void onCaptureClicked() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (buildfromjson.IconCompatParcelizer) {
            boolean z = false;
            buildfromjson.IconCompatParcelizer = false;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaSessionCompat$QueueItem.read;
            if (buildfromjson.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
            }
        }
    }

    @OnClick
    public final void onBackClicked() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        buildfromjson.read();
    }

    @OnClick
    public final void onCoachMarkClicked() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaBrowserCompat$ItemReceiver.read;
        boolean z = true;
        if (buildfromjson.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = buildFromJson.ParcelableVolumeInfo.write;
        if (buildfromjson.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "applicationId");
            onGetStartedClick.write((Object) str2, "documentType");
            onGetStartedClick.write((Object) str3, "productType");
            onGetStartedClick.write((Object) str4, "flow");
            Intent intent = new Intent(context, CaptureDocumentActivity.class);
            intent.putExtra("APPLICATION_ID_TAG", str);
            intent.putExtra("DOCUMENT_TYPE_TAG", str2);
            intent.putExtra("PRODUCT_TYPE_TAG", str3);
            intent.putExtra("FLOW_TAG", str4);
            return intent;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76932131492918);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder = new DocumentCaptureExperienceCriteriaHolder();
        documentCaptureExperienceCriteriaHolder.setStabilityThreshold(95);
        boolean z = true;
        documentCaptureExperienceCriteriaHolder.setStabilityThresholdEnabled(true);
        documentCaptureExperienceCriteriaHolder.setFocusEnabled(true);
        DocumentDetectionSettings detectionSettings = documentCaptureExperienceCriteriaHolder.getDetectionSettings();
        onGetStartedClick.IconCompatParcelizer((Object) detectionSettings, "documentCaptureExperienc…aHolder.detectionSettings");
        detectionSettings.setTargetFrameAspectRatio(1.6d);
        DocumentDetectionSettings detectionSettings2 = documentCaptureExperienceCriteriaHolder.getDetectionSettings();
        onGetStartedClick.IconCompatParcelizer((Object) detectionSettings2, "documentCaptureExperienc…aHolder.detectionSettings");
        detectionSettings2.setTargetFramePaddingPercent(5.0d);
        ImageCaptureView imageCaptureView2 = this.imageCaptureView;
        if (imageCaptureView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
        }
        DocumentCaptureExperience documentCaptureExperience = new DocumentCaptureExperience(imageCaptureView2, documentCaptureExperienceCriteriaHolder);
        this.MediaBrowserCompat$SearchResultReceiver = documentCaptureExperience;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience.setGuidanceFrameColor(-1);
        DocumentCaptureExperience documentCaptureExperience2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience2.setSteadyGuidanceFrameColor(-16711936);
        DocumentCaptureExperience documentCaptureExperience3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage userInstructionMessage = documentCaptureExperience3.getUserInstructionMessage();
        onGetStartedClick.IconCompatParcelizer((Object) userInstructionMessage, "documentCaptureExperience.userInstructionMessage");
        userInstructionMessage.setMessage(getString(R.string.capture_document_instructions));
        DocumentCaptureExperience documentCaptureExperience4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage holdParallelMessage = documentCaptureExperience4.getHoldParallelMessage();
        onGetStartedClick.IconCompatParcelizer((Object) holdParallelMessage, "documentCaptureExperience.holdParallelMessage");
        holdParallelMessage.setMessage(getString(R.string.capture_document_hold_level));
        DocumentCaptureExperience documentCaptureExperience5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage zoomInMessage = documentCaptureExperience5.getZoomInMessage();
        onGetStartedClick.IconCompatParcelizer((Object) zoomInMessage, "documentCaptureExperience.zoomInMessage");
        zoomInMessage.setMessage(getString(R.string.capture_document_move_closer));
        DocumentCaptureExperience documentCaptureExperience6 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage holdSteadyMessage = documentCaptureExperience6.getHoldSteadyMessage();
        onGetStartedClick.IconCompatParcelizer((Object) holdSteadyMessage, "documentCaptureExperience.holdSteadyMessage");
        holdSteadyMessage.setMessage(getString(R.string.capture_document_hold_steady));
        DocumentCaptureExperience documentCaptureExperience7 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage centerMessage = documentCaptureExperience7.getCenterMessage();
        onGetStartedClick.IconCompatParcelizer((Object) centerMessage, "documentCaptureExperience.centerMessage");
        centerMessage.setMessage(getString(R.string.capture_document_center));
        DocumentCaptureExperience documentCaptureExperience8 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage rotateMessage = documentCaptureExperience8.getRotateMessage();
        onGetStartedClick.IconCompatParcelizer((Object) rotateMessage, "documentCaptureExperience.rotateMessage");
        rotateMessage.setMessage(getString(R.string.capture_document_rotate));
        DocumentCaptureExperience documentCaptureExperience9 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage zoomOutMessage = documentCaptureExperience9.getZoomOutMessage();
        onGetStartedClick.IconCompatParcelizer((Object) zoomOutMessage, "documentCaptureExperience.zoomOutMessage");
        zoomOutMessage.setMessage(getString(R.string.capture_document_move_back));
        DocumentCaptureExperience documentCaptureExperience10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage capturedMessage = documentCaptureExperience10.getCapturedMessage();
        onGetStartedClick.IconCompatParcelizer((Object) capturedMessage, "documentCaptureExperience.capturedMessage");
        capturedMessage.setMessage(getString(R.string.capture_document_done));
        DocumentCaptureExperience documentCaptureExperience11 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience11.addOnImageCapturedListener(this.MediaSessionCompat$ResultReceiverWrapper);
        ImageCaptureView imageCaptureView3 = this.imageCaptureView;
        if (imageCaptureView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
        }
        imageCaptureView3.addCameraInitializationListener(this.MediaMetadataCompat);
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        buildfromjson.MediaBrowserCompat$ItemReceiver(this);
        buildFromJson buildfromjson2 = this.presenter;
        if (buildfromjson2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(FLOW_TAG)");
        onGetStartedClick.write((Object) stringExtra, "applicationId");
        onGetStartedClick.write((Object) stringExtra2, "documentType");
        onGetStartedClick.write((Object) stringExtra3, "productType");
        onGetStartedClick.write((Object) stringExtra4, "flow");
        buildfromjson2.read = stringExtra;
        buildfromjson2.write = stringExtra2;
        buildfromjson2.MediaDescriptionCompat = stringExtra3;
        buildfromjson2.MediaBrowserCompat$MediaItem = -1;
        buildfromjson2.MediaBrowserCompat$ItemReceiver = stringExtra4;
        String name = setAutoFocusEnabled.IconCompatParcelizer.HML.name();
        String str = buildfromjson2.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(name, str, true)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaBrowserCompat$MediaItem.IconCompatParcelizer;
            if (buildfromjson2.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(buildfromjson2.RatingCompat);
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4117x54b0e1e6.MediaBrowserCompat$CustomActionResultReceiver;
            if (buildfromjson2.RatingCompat != null) {
                iconCompatParcelizer2.IconCompatParcelizer(buildfromjson2.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = buildFromJson.ParcelableVolumeInfo.write;
            if (buildfromjson2.RatingCompat != null) {
                iconCompatParcelizer3.IconCompatParcelizer(buildfromjson2.RatingCompat);
            }
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new buildFromJson.read(buildfromjson2);
        if (buildfromjson2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(buildfromjson2.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        DocumentCaptureExperience documentCaptureExperience = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience.takePictureContinually();
    }

    public final void MediaDescriptionCompat() {
        DocumentCaptureExperience documentCaptureExperience = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience.stopCapture();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.seeInstructionsText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("seeInstructionsText");
        }
        String string = getString(R.string.auto_kofax_camera_tips_text);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(string, 0));
        } else {
            textView.setText(Html.fromHtml(string));
        }
        DocumentCaptureExperience documentCaptureExperience = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        CaptureMessage capturedMessage = documentCaptureExperience.getCapturedMessage();
        onGetStartedClick.IconCompatParcelizer((Object) capturedMessage, "documentCaptureExperience.capturedMessage");
        capturedMessage.setMessage(getString(R.string.auto_kofax_camera_captured));
    }

    public void IconCompatParcelizer(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        CropDocumentActivity.read read2 = CropDocumentActivity.MediaBrowserCompat$MediaItem;
        String stringExtra = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(FLOW_TAG)");
        Intent read3 = CropDocumentActivity.read.read(this, str2, str, str3, str4, stringExtra, false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read4 = setTapText.write(this, read3).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read4.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(boolean z) {
        ImageCaptureView imageCaptureView2 = this.imageCaptureView;
        if (imageCaptureView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
        }
        imageCaptureView2.setVisibility(z ? 0 : 4);
    }

    public final void MediaBrowserCompat$ItemReceiver(Bitmap bitmap, String str) {
        onGetStartedClick.write((Object) bitmap, "imageBitmap");
        onGetStartedClick.write((Object) str, "documentType");
        BScanCNotificationDeepLinkActivity<String> write2 = FragmentBuilder_BindDepositSelectorFragment.write((Context) this, bitmap);
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        DebitCardMarketConductDeepLinkActivity getimagebytes = new getImageBytes(new read(buildfromjson));
        buildFromJson buildfromjson2 = this.presenter;
        if (buildfromjson2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.MediaSessionCompat$Token = write2.write(getimagebytes, new getImageBytes(new CaptureDocumentActivity$MediaBrowserCompat$ItemReceiver(buildfromjson2)));
    }

    public final void write() {
        ImageView imageView = this.captureButton;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("captureButton");
        }
        imageView.setVisibility(0);
    }

    public static final class MediaMetadataCompat extends CountDownTimer {
        private /* synthetic */ CaptureDocumentActivity MediaBrowserCompat$ItemReceiver;

        public final void onTick(long j) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(CaptureDocumentActivity captureDocumentActivity, long j) {
            super(j, 1000);
            this.MediaBrowserCompat$ItemReceiver = captureDocumentActivity;
        }

        public final void onFinish() {
            CountDownTimer IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            if (IconCompatParcelizer != null) {
                IconCompatParcelizer.cancel();
            }
            ImageView imageView = this.MediaBrowserCompat$ItemReceiver.captureButton;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("captureButton");
            }
            imageView.setVisibility(0);
        }
    }

    public final void RatingCompat() {
        this.MediaBrowserCompat$MediaItem = new MediaMetadataCompat(this, -1).start();
    }

    public final void read() {
        ImageCaptureView imageCaptureView2 = this.imageCaptureView;
        if (imageCaptureView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
        }
        imageCaptureView2.forceTakePicture();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        ImageView imageView = this.coachmarkImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("coachmarkImage");
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        finish();
    }

    public final void IconCompatParcelizer() {
        Intent MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        MediaSessionCompat$ResultReceiverWrapper2.setFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaSessionCompat$ResultReceiverWrapper2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Intent MediaSessionCompat$ResultReceiverWrapper() {
        return new Intent(this, HmlDocumentListActivity.class);
    }

    public void onPause() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (buildfromjson.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
        super.onPause();
    }

    public void onDestroy() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        buildfromjson.onDestroy();
        getWindow().clearFlags(128);
        DocumentCaptureExperience documentCaptureExperience = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience.removeOnImageCapturedListener(this.MediaSessionCompat$ResultReceiverWrapper);
        DocumentCaptureExperience documentCaptureExperience2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (documentCaptureExperience2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentCaptureExperience");
        }
        documentCaptureExperience2.destroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaSessionCompat$Token;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        CountDownTimer countDownTimer = this.MediaBrowserCompat$MediaItem;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    public void onBackPressed() {
        buildFromJson buildfromjson = this.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        buildfromjson.read();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(CaptureDocumentActivity captureDocumentActivity, Image image) {
        buildFromJson buildfromjson = captureDocumentActivity.presenter;
        if (buildfromjson == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bitmap imageBitmap = image.getImageBitmap();
        onGetStartedClick.IconCompatParcelizer((Object) imageBitmap, "image.imageBitmap");
        onGetStartedClick.write((Object) imageBitmap, "imageBitmap");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (buildfromjson.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
        if (buildfromjson.RatingCompat != null) {
            buildfromjson.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new buildFromJson.MediaDescriptionCompat(buildfromjson, imageBitmap);
        if (buildfromjson.RatingCompat == null) {
            z = false;
        }
        if (z) {
            mediaDescriptionCompat.IconCompatParcelizer(buildfromjson.RatingCompat);
        }
        image.imageClearBitmap();
        image.imageClearFileBuffer();
    }

    public static final /* synthetic */ void write(CaptureDocumentActivity captureDocumentActivity) {
        ImageCaptureView imageCaptureView2 = captureDocumentActivity.imageCaptureView;
        if (imageCaptureView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
        }
        imageCaptureView2.removeCameraInitializationListener(captureDocumentActivity.MediaMetadataCompat);
        Object systemService = captureDocumentActivity.getSystemService("activity");
        if (systemService != null) {
            int largeMemoryClass = ((ActivityManager) systemService).getLargeMemoryClass();
            int i = 4200;
            if (largeMemoryClass < 196) {
                i = 1920;
            } else if (largeMemoryClass < 512) {
                i = 3200;
            }
            ImageCaptureView imageCaptureView3 = captureDocumentActivity.imageCaptureView;
            if (imageCaptureView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
            }
            List<Size> allowableImageResolutions = imageCaptureView3.getAllowableImageResolutions();
            if (allowableImageResolutions != null && allowableImageResolutions.size() > 0) {
                Size size = allowableImageResolutions.get(allowableImageResolutions.size() - 1);
                for (Size next : allowableImageResolutions) {
                    if (next.width > size.width && next.height > size.height) {
                        size = next;
                    }
                }
                for (Size next2 : allowableImageResolutions) {
                    onGetStartedClick.IconCompatParcelizer((Object) next2, "size");
                    if ((next2.height >= i || next2.width >= i) && size.width > next2.width && size.height > next2.height) {
                        size = next2;
                    }
                }
                ImageCaptureView imageCaptureView4 = captureDocumentActivity.imageCaptureView;
                if (imageCaptureView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
                }
                imageCaptureView4.setImageResolution(size);
            }
            ImageCaptureView imageCaptureView5 = captureDocumentActivity.imageCaptureView;
            if (imageCaptureView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageCaptureView");
            }
            imageCaptureView5.setUseVideoFrame(false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
