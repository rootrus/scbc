package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import com.kofax.android.abc.image_classification.ResultPair;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p078p.C8461a;
import com.kofax.mobile.sdk.p078p.C8462b;
import com.kofax.mobile.sdk.p078p.C8463c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.HmlPinActivity;

@Deprecated
public class ImageClassifier {
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public static volatile ImageClassificationStatus f3316ap = ImageClassificationStatus.COMPLETE;
    /* access modifiers changed from: private */
    public IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public com.kofax.android.abc.image_classification.ImageClassifier f3317ak = new com.kofax.android.abc.image_classification.ImageClassifier();
    /* access modifiers changed from: private */

    /* renamed from: al */
    public final Handler f3318al = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: am */
    public CopyOnWriteArrayList<ImageClassificationCompletedListener> f3319am = new CopyOnWriteArrayList<>();

    /* renamed from: an */
    private String f3320an;

    /* renamed from: ao */
    private String f3321ao;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public int f3322aq = 20;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public Image f3323ar = null;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public boolean f3324as = false;

    /* renamed from: at */
    final Runnable f3325at = new Runnable() {
        public void run() {
            List<ImageClassificationResult> list;
            try {
                list = m3723a(ImageClassifier.this.f3317ak.getClassificationResults());
            } catch (Exception unused) {
                ImageClassificationStatus unused2 = ImageClassifier.f3316ap = ImageClassificationStatus.ERROR;
                list = null;
            }
            if (ImageClassifier.this.f3323ar != null) {
                ImageClassifier.this.f3323ar.setImageClassifyResults(list);
                if (ImageClassifier.this.f3324as) {
                    ImageClassifier.this.f3323ar.imageClearBitmap();
                    boolean unused3 = ImageClassifier.this.f3324as = false;
                }
            }
            ImageClassificationStatus unused4 = ImageClassifier.f3316ap = ImageClassificationStatus.COMPLETE;
            ImageClassifier.this._bus.post(new ImageClassificationCompleteEvent(this, ImageClassifier.this.f3323ar));
            m3724a(ImageClassifier.this.f3323ar, ImageClassifier.this.f3319am);
        }

        /* renamed from: a */
        private List<ImageClassificationResult> m3723a(Vector<ResultPair> vector) {
            ArrayList arrayList = new ArrayList();
            if (vector == null) {
                return arrayList;
            }
            for (int i = 0; i < vector.size(); i++) {
                ResultPair resultPair = vector.get(i);
                if (resultPair != null) {
                    arrayList.add(new ImageClassificationResult(resultPair.classID, resultPair.confidence, resultPair.orientation));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m3724a(Image image, List<ImageClassificationCompletedListener> list) {
            if (list != null) {
                for (ImageClassificationCompletedListener next : list) {
                    if (next != null) {
                        next.onImageClassified(new ImageClassificationCompleteEvent(this, image));
                    }
                }
            }
        }
    };

    public enum ImageClassificationStatus {
        IN_PROGRESS,
        COMPLETE,
        ERROR
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    @HmlPinActivity
    public ImageClassifier() {
        m3711a();
        IBus iBus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
        this._bus = iBus;
        iBus.post(new C8462b());
    }

    public void doCleanup() {
        this._bus.post(new C8463c());
        com.kofax.android.abc.image_classification.ImageClassifier imageClassifier = this.f3317ak;
        if (imageClassifier != null) {
            imageClassifier.dispose();
            this.f3317ak = null;
        }
        CopyOnWriteArrayList<ImageClassificationCompletedListener> copyOnWriteArrayList = this.f3319am;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f3319am = null;
        }
        this.f3323ar = null;
    }

    private ImageClassifier(boolean z) {
    }

    /* renamed from: a */
    private static void m3711a() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
        }
    }

    public ImageClassificationStatus getStatus() {
        return f3316ap;
    }

    public void addImageClassificationCompletedEventListener(ImageClassificationCompletedListener imageClassificationCompletedListener) {
        if (imageClassificationCompletedListener != null) {
            this.f3319am.add(imageClassificationCompletedListener);
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_CL_LISTENER_NULL);
    }

    public void removeImageClassificationCompletedEventListener(ImageClassificationCompletedListener imageClassificationCompletedListener) {
        if (imageClassificationCompletedListener != null) {
            this.f3319am.remove(imageClassificationCompletedListener);
        }
    }

    public void setMaxNumberOfResults(int i) {
        if (i <= 0 || i > 64) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MAX_NUM_RESULTS_INVALID);
        }
        this.f3322aq = i;
    }

    public int getMaxNumberOfResults() {
        return this.f3322aq;
    }

    public int loadConfigurationFile(String str) {
        if (str == null || str.length() == 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_CONFIG_NULL);
        } else if (new File(str).exists()) {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            try {
                this.f3317ak.loadConfigurationFile(str);
                this.f3320an = str;
            } catch (Exception unused) {
                errorInfo = ErrorInfo.KMC_CL_CONFIG_NOT_LOADED;
            }
            return errorInfo.getErr();
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
        }
    }

    public int loadModel(String str) {
        if (str == null || str.length() == 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MODEL_NULL);
        } else if (new File(str).exists()) {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            try {
                this.f3317ak.loadModel(str);
                this.f3321ao = str;
            } catch (Exception unused) {
                errorInfo = ErrorInfo.KMC_CL_MODEL_NOT_LOADED;
            }
            return errorInfo.getErr();
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
        }
    }

    /* renamed from: k */
    private void m3722k() {
        m3711a();
        String str = this.f3320an;
        if (str == null || str.length() == 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_CONFIG_NOT_LOADED);
        }
        String str2 = this.f3321ao;
        if (str2 == null || str2.length() == 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_MODEL_NOT_LOADED);
        }
    }

    public int classifyImage(Image image) {
        if (image == null) {
            return ErrorInfo.KMC_CL_NO_IMAGE_SUPPLIED.getErr();
        }
        m3722k();
        if (f3316ap == ImageClassificationStatus.IN_PROGRESS) {
            return ErrorInfo.KMC_CL_CLASSIFIER_BUSY.getErr();
        }
        this._bus.post(new C8461a(image));
        this.f3323ar = image;
        f3316ap = ImageClassificationStatus.IN_PROGRESS;
        Image.ImageRep imageRepresentation = image.getImageRepresentation();
        if (imageRepresentation == null || imageRepresentation.equals(Image.ImageRep.IMAGE_REP_NONE)) {
            f3316ap = ImageClassificationStatus.ERROR;
            return ErrorInfo.KMC_CL_NO_IMAGE_SUPPLIED.getErr();
        }
        if (imageRepresentation.equals(Image.ImageRep.IMAGE_REP_BITMAP)) {
            m3715b(image.getImageBitmap());
        } else if (imageRepresentation.equals(Image.ImageRep.IMAGE_REP_FILE)) {
            if (image.getImageMimeType() == Image.ImageMimeType.MIMETYPE_TIFF) {
                this.f3324as = true;
                try {
                    image.imageReadFromFile();
                } catch (KmcRuntimeException e) {
                    e.printStackTrace();
                } catch (KmcException e2) {
                    e2.printStackTrace();
                }
                m3715b(image.getImageBitmap());
            } else {
                m3712a(image.getImageFilePath());
            }
        } else if (imageRepresentation.equals(Image.ImageRep.IMAGE_REP_BOTH)) {
            if (m3717c(image)) {
                m3712a(image.getImageFilePath());
            } else {
                m3715b(image.getImageBitmap());
            }
        }
        return ErrorInfo.KMC_SUCCESS.getErr();
    }

    /* renamed from: c */
    private boolean m3717c(Image image) {
        return image.getImageBitmapHeight().intValue() * image.getImageBitmapWidth().intValue() < image.getImageFileHeight().intValue() * image.getImageFileWidth().intValue();
    }

    /* renamed from: a */
    private void m3712a(final String str) {
        new Thread() {
            public void run() {
                ImageClassifier.this.f3317ak.classify(str, ImageClassifier.this.f3322aq);
                ImageClassifier.this.f3318al.post(ImageClassifier.this.f3325at);
            }
        }.start();
    }

    /* renamed from: b */
    private void m3715b(final Bitmap bitmap) {
        new Thread() {
            public void run() {
                ImageClassifier.this.f3317ak.classify(bitmap, ImageClassifier.this.f3322aq);
                ImageClassifier.this.f3318al.post(ImageClassifier.this.f3325at);
            }
        }.start();
    }
}
