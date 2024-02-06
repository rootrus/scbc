package com.kofax.mobile.sdk.capture;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.CameraInitializationEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationFailedEvent;
import com.kofax.kmc.kui.uicontrols.CameraInitializationFailedListener;
import com.kofax.kmc.kui.uicontrols.CameraInitializationListener;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0514c;
import com.kofax.mobile.sdk._internal.capture.CaptureCriteria;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.ICaptureMenuListener;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.LookAndFeelParameters;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.HmlPinActivity;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public abstract class CaptureActivity extends Activity implements ICaptureMenuListener {
    public static final int IMAGE_CAPTURED = -42;
    public static final int NO_IMAGE_CAPTURED = -1;
    public static final String RESULT_CODE = "__result_code__";

    /* renamed from: Yu */
    private static final int f4477Yu = 33;

    /* renamed from: Yv */
    private static final String f4478Yv = "com.kofax.mobile.sdk.capture/CaptureActivity.STATE_IS_TORCH_BUTTON_CHECKED";
    @HmlPinActivity

    /* renamed from: Ub */
    C0854b f4479Ub = null;
    /* access modifiers changed from: private */

    /* renamed from: YA */
    public IParameters f4480YA;

    /* renamed from: YB */
    private ViewGroup f4481YB;
    @HmlPinActivity

    /* renamed from: Yw */
    IImageStorage f4482Yw = null;
    @HmlPinActivity

    /* renamed from: Yx */
    C7898e f4483Yx = null;
    @HmlPinActivity

    /* renamed from: Yy */
    C8234b f4484Yy = null;
    @HmlPinActivity

    /* renamed from: Yz */
    C7921h f4485Yz = null;
    @HmlPinActivity
    C0513a _captureController = null;

    private static final /* synthetic */ void startActivityForResult_aroundBody1$advice(CaptureActivity captureActivity, CaptureActivity captureActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((CaptureActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        m4681tA();
        super.onCreate(bundle);
        this.f4480YA = getParameters(bundle);
        m4683tC();
        LookAndFeelParameters lookAndFeelParameters = this.f4480YA.getLookAndFeelParameters();
        this.f4484Yy.mo54662a(lookAndFeelParameters.forceCaptureEnabled, lookAndFeelParameters.manualCaptureTimer);
        this.f4484Yy.setExitButtonEnabled(lookAndFeelParameters.exitEnabled);
        this.f4484Yy.setGalleryButtonEnabled(m4682tB());
        LookAndFeelParameters.TorchMode torchMode = lookAndFeelParameters.torch;
        boolean z = true;
        this.f4484Yy.setTorchButtonEnabled(torchMode != LookAndFeelParameters.TorchMode.AUTO);
        if (bundle == null) {
            C8234b bVar = this.f4484Yy;
            if (torchMode != LookAndFeelParameters.TorchMode.ON) {
                z = false;
            }
            bVar.setTorchButtonChecked(z);
        } else {
            this.f4484Yy.setTorchButtonChecked(bundle.getBoolean(f4478Yv));
        }
        this.f4484Yy.setListener(this);
        setCaptureCriteria(new CaptureCriteria());
        this._captureController.addOnImageCapturedListener(new ImageCapturedListener() {
            public void onImageCaptured(ImageCapturedEvent imageCapturedEvent) {
                CaptureActivity.this.saveResultAndFinish(imageCapturedEvent.getImage(), (Bundle) null);
            }
        });
        this._captureController.mo11273d(false);
        setResult(-1);
    }

    public void setCaptureCriteria(CaptureCriteria captureCriteria) {
        this._captureController.setCaptureCriteria(captureCriteria);
    }

    public <T extends IParameters> T getParameters(Bundle bundle) {
        return WorkflowActivity.m4695a(bundle, getIntent(), "_com.kofax.mobile.sdk.capture.internal_parameters_");
    }

    /* renamed from: tA */
    private void m4681tA() {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f4479Ub.mo11933a("android.permission.CAMERA")) {
            Intent intent = new Intent();
            intent.putExtra(RESULT_CODE, -1);
            setResult(0, intent);
            finish();
            return;
        }
        this.f4484Yy.setGalleryButtonEnabled(m4682tB());
        setupCameraView(this.f4481YB);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        m4684tD();
    }

    /* renamed from: tB */
    private boolean m4682tB() {
        LookAndFeelParameters lookAndFeelParameters = this.f4480YA.getLookAndFeelParameters();
        if (Build.VERSION.SDK_INT >= 16) {
            return lookAndFeelParameters.galleryEnabled && this.f4479Ub.mo11933a("android.permission.READ_EXTERNAL_STORAGE");
        }
        return lookAndFeelParameters.galleryEnabled;
    }

    /* access modifiers changed from: protected */
    public C0500f getCameraView() {
        return Injector.getInjector(this).getICameraView();
    }

    /* renamed from: tC */
    private void m4683tC() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f4481YB = relativeLayout;
        linearLayout.addView(relativeLayout, layoutParams);
        setupButtonBarView(linearLayout);
        setContentView(linearLayout);
    }

    /* access modifiers changed from: protected */
    public void setupCameraView(ViewGroup viewGroup) {
        C0500f cameraView = getCameraView();
        new C8303a() {
            /* access modifiers changed from: protected */
            public void setup() {
                if (CaptureActivity.this.f4480YA.getLookAndFeelParameters().torch == LookAndFeelParameters.TorchMode.AUTO) {
                    CaptureActivity.this.getCameraView().setFlash(Flash.AUTOTORCH);
                    return;
                }
                CaptureActivity captureActivity = CaptureActivity.this;
                captureActivity.onTorchChange(captureActivity.f4484Yy.mo54664rH());
            }
        }.mo54780c(cameraView);
        viewGroup.addView(cameraView.getViewGroup());
    }

    /* renamed from: tD */
    private void m4684tD() {
        this.f4481YB.removeAllViews();
    }

    /* access modifiers changed from: protected */
    public void setupButtonBarView(LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f4484Yy.getView().setLayoutParams(layoutParams);
        linearLayout.addView(this.f4484Yy.getView(), layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("_com.kofax.mobile.sdk.capture.internal_parameters_", this.f4480YA);
        bundle.putBoolean(f4478Yv, this.f4484Yy.mo54664rH());
    }

    /* access modifiers changed from: protected */
    public void initController(IOverlayView iOverlayView, C0514c cVar) {
        this._captureController.mo11267a(cVar, getCameraView(), iOverlayView);
    }

    public void saveResultAndFinish(Image image, Bundle bundle) {
        String bf = this.f4485Yz.mo54329bf();
        this.f4482Yw.setImage(image.getImageBitmap(), bf);
        this.f4483Yx.mo54256a(bf, image.getImageDPI().intValue());
        this.f4483Yx.mo54258a(bf, image.getImageMimeType());
        this.f4483Yx.mo54259a(bf, image.getImageOutputColor());
        this.f4483Yx.mo54257a(bf, image.getTargetFrame());
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra(RESULT_CODE, -42);
        intent.putExtra("_com.kofax.mobile.sdk.capture.internal_image_id_", bf);
        setResult(-1, intent);
        finish();
    }

    public void finish() {
        super.finish();
        this._captureController.destroy();
    }

    public void onExitButtonClick() {
        finish();
    }

    public void onForceCaptureButtonClick() {
        getCameraView().forceTakePicture();
    }

    public void onGalleryButtonClick() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult_aroundBody1$advice(this, this, intent, 33, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 33, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
    }

    public void onTorchChange(boolean z) {
        if (z) {
            getCameraView().setFlash(Flash.TORCH);
        } else {
            getCameraView().setFlash(Flash.OFF);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 33) {
            Bitmap a = m4679a(intent.getData());
            if (a != null) {
                saveResultAndFinish(new Image(a), (Bundle) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra(RESULT_CODE, -1);
            setResult(0, intent2);
            finish();
        }
    }

    /* renamed from: a */
    private Bitmap m4679a(Uri uri) {
        try {
            String[] strArr = {"_data"};
            Cursor query = getContentResolver().query(uri, strArr, (String) null, (String[]) null, (String) null);
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex(strArr[0]));
            query.close();
            return BitmapFactory.decodeFile(string);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.CaptureActivity$a */
    static abstract class C8303a implements CameraInitializationFailedListener, CameraInitializationListener {

        /* renamed from: YD */
        private C0500f f4488YD;

        /* access modifiers changed from: protected */
        public abstract void setup();

        private C8303a() {
        }

        /* renamed from: c */
        public void mo54780c(C0500f fVar) {
            if (this.f4488YD == null) {
                this.f4488YD = fVar;
                fVar.addCameraInitializationListener(this);
                this.f4488YD.addCameraInitializationFailedListener(this);
                return;
            }
            throw new IllegalStateException("already listening");
        }

        public void stopListening() {
            C0500f fVar = this.f4488YD;
            if (fVar != null) {
                fVar.removeCameraInitializationListener(this);
                this.f4488YD.removeCameraInitializationFailedListener(this);
                this.f4488YD = null;
                return;
            }
            throw new IllegalStateException("not listening");
        }

        public void onCameraInitialized(CameraInitializationEvent cameraInitializationEvent) {
            stopListening();
            if (cameraInitializationEvent.getCameraInitStatus() == CameraInitializationEvent.CameraInitStatus.CAMERA_VIEW_CREATED) {
                setup();
            }
        }

        public void onCameraInitializationFailed(CameraInitializationFailedEvent cameraInitializationFailedEvent) {
            stopListening();
        }
    }
}
