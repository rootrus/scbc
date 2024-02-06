package com.kofax.mobile.sdk.capture;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.view.C8205af;
import com.kofax.mobile.sdk.capture.extraction.ExceptionResponse;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.parameter.ExtractionParameters;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public abstract class WorkflowActivity<T extends IParameters> extends Activity {
    public static final String CERTIFICATE_VALIDATOR_LISTENER = "_com.kofax.mobile.sdk.capture._certificate_validator_listener_";

    /* renamed from: YX */
    static final String f4530YX = "_com.kofax.mobile.sdk.capture.internal_parameters_";

    /* renamed from: YY */
    static final String f4531YY = "_com.kofax.mobile.sdk.capture.internal_extraction_result_";

    /* renamed from: YZ */
    static final String f4532YZ = "_com.kofax.mobile.sdk.capture.internal_image_id_";

    /* renamed from: Za */
    private static final String f4533Za = "_state_";

    /* renamed from: Zc */
    private static final int f4534Zc = 0;

    /* renamed from: Zd */
    private static final int f4535Zd = 1;

    /* renamed from: Ze */
    private static final int f4536Ze = 2;

    /* renamed from: Zf */
    private static final int f4537Zf = 3;

    /* renamed from: Zg */
    private static final int f4538Zg = 4;

    /* renamed from: Zh */
    private static final int f4539Zh = 5;

    /* renamed from: Zi */
    private static final int f4540Zi = 6;

    /* renamed from: JI */
    private CertificateValidatorListener f4541JI;

    /* renamed from: YA */
    private T f4542YA;

    /* renamed from: YK */
    private IImageStorage f4543YK = null;

    /* renamed from: Zb */
    private int f4544Zb = 0;

    /* renamed from: Zj */
    private Intent f4545Zj;

    /* renamed from: Zk */
    private ExtractorResponse f4546Zk = null;

    /* renamed from: Zl */
    private CaptureData f4547Zl;

    public abstract Class<? extends Activity> getCaptureActivityClass();

    public abstract String getDefaultProcessingString(T t);

    public abstract CaptureData getDefaultReturnObject();

    public abstract String getExceptionKey();

    public abstract Class<? extends Activity> getExtractActivityClass();

    public abstract T getParametersInstance();

    public abstract String getParametersKey();

    public abstract String getResultKey();

    /* access modifiers changed from: protected */
    public boolean isOdeSupported() {
        return false;
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody1$advice(WorkflowActivity workflowActivity, WorkflowActivity workflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((WorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody3$advice(WorkflowActivity workflowActivity, WorkflowActivity workflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((WorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody5$advice(WorkflowActivity workflowActivity, WorkflowActivity workflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((WorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody7$advice(WorkflowActivity workflowActivity, WorkflowActivity workflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((WorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody9$advice(WorkflowActivity workflowActivity, WorkflowActivity workflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((WorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4543YK = Injector.getInjector(this).getIImageStorage();
        tryRestoreState(bundle);
        this.f4541JI = m4694a(bundle, getIntent());
    }

    /* access modifiers changed from: protected */
    public void handleException(Throwable th) {
        Intent intent = getIntent();
        if (th != null) {
            intent.putExtra(getExceptionKey(), new C8308a(th));
        }
        setResult(0, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void tryRestoreState(Bundle bundle) {
        try {
            m4696a(bundle);
        } catch (Exception e) {
            handleException(e);
        }
    }

    /* renamed from: a */
    private void m4696a(Bundle bundle) {
        if (bundle != null) {
            this.f4544Zb = bundle.getInt(f4533Za);
        }
        T parameters = getParameters(bundle);
        this.f4542YA = parameters;
        this.f4547Zl = parameters.getProcessingParameters().captureData;
        if (ProcessingParameters.ProcessingType.OFF != this.f4542YA.getProcessingParameters().processingType && TextUtils.isEmpty(this.f4542YA.getProcessingParameters().operations)) {
            this.f4542YA.getProcessingParameters().operations = getDefaultProcessingString(this.f4542YA);
        }
    }

    public T getParameters(Bundle bundle) {
        if (this.f4542YA == null) {
            this.f4542YA = m4695a(bundle, getIntent(), getParametersKey());
        }
        if (this.f4542YA == null) {
            this.f4542YA = getParametersInstance();
        }
        return this.f4542YA;
    }

    /* renamed from: a */
    static <T extends IParameters> T m4695a(Bundle bundle, Intent intent, String str) {
        T t = bundle != null ? (IParameters) bundle.getSerializable(str) : null;
        return (t != null || intent == null) ? t : (IParameters) intent.getSerializableExtra(str);
    }

    /* renamed from: a */
    static CertificateValidatorListener m4694a(Bundle bundle, Intent intent) {
        CertificateValidatorListener certificateValidatorListener = bundle != null ? (CertificateValidatorListener) bundle.getSerializable("_com.kofax.mobile.sdk.capture._certificate_validator_listener_") : null;
        return (certificateValidatorListener != null || intent == null) ? certificateValidatorListener : (CertificateValidatorListener) intent.getSerializableExtra("_com.kofax.mobile.sdk.capture._certificate_validator_listener_");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f4542YA.getProcessingParameters().captureData = this.f4547Zl;
        bundle.putInt(f4533Za, this.f4544Zb);
        bundle.putSerializable(getParametersKey(), this.f4542YA);
        bundle.putSerializable("_com.kofax.mobile.sdk.capture._certificate_validator_listener_", this.f4541JI);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m4697tE();
    }

    /* renamed from: tE */
    private void m4697tE() {
        try {
            m4698tF();
        } catch (Exception e) {
            handleException(e);
        }
    }

    /* renamed from: tF */
    private void m4698tF() {
        int i = this.f4544Zb;
        if (i == 0) {
            captureImage();
        } else if (i == 1) {
            m4699tG();
        } else if (i == 2) {
            m4701tI();
        } else if (i == 3) {
            m4702tJ();
        } else if (i == 4) {
            m4703tK();
        } else if (i == 5) {
            m4704tL();
        }
    }

    public void captureImage() {
        Intent intent = new Intent(this, getCaptureActivityClass());
        intent.putExtra(f4530YX, this.f4542YA);
        startActivityForResult_aroundBody1$advice(this, this, intent, 0, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 0, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
    }

    /* renamed from: tG */
    private void m4699tG() {
        if (!m4700tH()) {
            m4705tM();
        } else if (!this.f4542YA.getLookAndFeelParameters().reviewCapturedImage) {
            m4706tN();
            m4698tF();
        } else {
            Intent intent = new Intent(this, ImageReviewActivity.class);
            intent.putExtra(f4530YX, this.f4542YA);
            intent.putExtra(f4532YZ, this.f4547Zl.capturedImageId);
            startActivityForResult_aroundBody3$advice(this, this, intent, 1, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 1, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
        }
    }

    /* renamed from: tH */
    private boolean m4700tH() {
        Intent intent = this.f4545Zj;
        return intent != null && intent.getIntExtra(CaptureActivity.RESULT_CODE, -1) == -42;
    }

    /* renamed from: tI */
    private void m4701tI() {
        if (ProcessingParameters.ProcessingType.ON_DEVICE == this.f4542YA.getProcessingParameters().processingType) {
            setContentView(new C8205af(this));
            Intent intent = new Intent(this, ProcessActivity.class);
            intent.putExtra(f4530YX, this.f4542YA);
            intent.putExtra(f4532YZ, this.f4547Zl.capturedImageId);
            startActivityForResult_aroundBody5$advice(this, this, intent, 2, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 2, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
            return;
        }
        CaptureData captureData = this.f4547Zl;
        captureData.processedImageId = captureData.capturedImageId;
        m4706tN();
        m4698tF();
    }

    /* renamed from: tJ */
    private void m4702tJ() {
        if (this.f4542YA.getLookAndFeelParameters().reviewProcessedImage) {
            Intent intent = new Intent(this, ImageReviewActivity.class);
            intent.putExtra(f4530YX, this.f4542YA);
            intent.putExtra(f4532YZ, this.f4547Zl.processedImageId);
            startActivityForResult_aroundBody7$advice(this, this, intent, 3, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 3, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
            return;
        }
        m4706tN();
        m4698tF();
    }

    /* renamed from: tK */
    private void m4703tK() {
        ExtractionParameters.ExtractionType extractionType = this.f4542YA.getExtractionParameters().getExtractionType();
        if (!isOdeSupported() && extractionType == ExtractionParameters.ExtractionType.ON_DEVICE) {
            handleException(new KmcException(ErrorInfo.KMC_UI_ODE_NOT_SUPPORTED_FOR_THE_DOCUMENT_TYPE));
        } else if (extractionType != ExtractionParameters.ExtractionType.OFF) {
            Intent intent = new Intent(this, getExtractActivityClass());
            intent.putExtra(f4530YX, this.f4542YA);
            intent.putExtra("_com.kofax.mobile.sdk.capture._certificate_validator_listener_", this.f4541JI);
            intent.putExtra(f4532YZ, this.f4547Zl.processedImageId);
            startActivityForResult_aroundBody9$advice(this, this, intent, 4, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 4, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
        } else {
            m4706tN();
            m4698tF();
        }
    }

    /* renamed from: tL */
    private void m4704tL() {
        Intent intent = new Intent();
        ExtractorResponse extractorResponse = this.f4546Zk;
        if (extractorResponse != null) {
            if (extractorResponse.results == null) {
                this.f4546Zk.results = getDefaultReturnObject();
            }
            ((CaptureData) this.f4546Zk.results).capturedImageId = this.f4547Zl.capturedImageId;
            ((CaptureData) this.f4546Zk.results).processedImageId = this.f4547Zl.processedImageId;
            intent.putExtra(getResultKey(), this.f4546Zk.results);
            intent.putExtra(getExceptionKey(), this.f4546Zk.exceptionResponse);
        } else {
            CaptureData defaultReturnObject = getDefaultReturnObject();
            defaultReturnObject.capturedImageId = this.f4547Zl.capturedImageId;
            defaultReturnObject.processedImageId = this.f4547Zl.processedImageId;
            intent.putExtra(getResultKey(), defaultReturnObject);
        }
        intent.putExtra(getParametersKey(), this.f4542YA);
        setResult(-1, intent);
        Injector.destroyInjector();
        finish();
    }

    /* renamed from: tM */
    private void m4705tM() {
        setResult(0);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == 1 || i == 3) && i2 == 0) {
            this.f4544Zb = 0;
            clearBitmap(this.f4547Zl.capturedImageId);
            clearBitmap(this.f4547Zl.processedImageId);
            return;
        }
        this.f4545Zj = intent;
        if (intent != null && intent.hasExtra(f4531YY)) {
            this.f4546Zk = (ExtractorResponse) intent.getSerializableExtra(f4531YY);
        }
        if (intent != null && intent.hasExtra(f4532YZ)) {
            if (i == 0) {
                this.f4547Zl.capturedImageId = intent.getStringExtra(f4532YZ);
            }
            this.f4547Zl.processedImageId = intent.getStringExtra(f4532YZ);
        }
        if (i2 == 0) {
            clearBitmap(this.f4547Zl.capturedImageId);
            clearBitmap(this.f4547Zl.processedImageId);
            finish();
            return;
        }
        m4706tN();
    }

    /* access modifiers changed from: protected */
    public void clearBitmap(String str) {
        Bitmap removeImage = this.f4543YK.removeImage(str);
        if (removeImage != null && !removeImage.isRecycled()) {
            removeImage.recycle();
        }
    }

    /* renamed from: tN */
    private void m4706tN() {
        int i = this.f4544Zb + 1;
        this.f4544Zb = i;
        this.f4544Zb = i % 6;
    }

    /* renamed from: com.kofax.mobile.sdk.capture.WorkflowActivity$a */
    static class C8308a implements ExceptionResponse {

        /* renamed from: Zm */
        private final Throwable f4548Zm;

        public ExceptionResponse innerException() {
            return null;
        }

        public C8308a(Throwable th) {
            this.f4548Zm = th;
        }

        public String exceptionMessage() {
            return this.f4548Zm.getMessage();
        }

        public String exceptionType() {
            return this.f4548Zm.getClass().toString();
        }

        public String message() {
            return exceptionMessage();
        }

        public String stackTrace() {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement obj : this.f4548Zm.getStackTrace()) {
                sb.append(obj.toString());
            }
            return sb.toString();
        }
    }
}
