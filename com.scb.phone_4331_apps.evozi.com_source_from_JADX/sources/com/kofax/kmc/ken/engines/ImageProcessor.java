package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.android.abc.machine_vision.DetectedDocumentBoundary;
import com.kofax.android.abc.machine_vision.DocumentTracker;
import com.kofax.android.abc.machine_vision.GlareDetector;
import com.kofax.android.abc.machine_vision.ShadowDetector;
import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.android.abc.xvrs.XVrsBlur;
import com.kofax.android.abc.xvrs.XVrsImage;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.data.ImageSource;
import com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback;
import com.kofax.kmc.ken.engines.data.QuickAnalysisSettings;
import com.kofax.kmc.ken.engines.iplib.IpLib;
import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.ken.engines.processing.TargetFrameCropType;
import com.kofax.kmc.ken.engines.service.ImageService;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.async.ListenerCallbackThreadType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.detection.C0669c;
import com.kofax.mobile.sdk.p009ae.C0793c;
import com.kofax.mobile.sdk.p009ae.C0795d;
import com.kofax.mobile.sdk.p009ae.C0796f;
import com.kofax.mobile.sdk.p009ae.C0797g;
import com.kofax.mobile.sdk.p027r.C0990b;
import com.kofax.mobile.sdk.p028s.C0992a;
import com.kofax.mobile.sdk.p028s.C0993b;
import com.kofax.mobile.sdk.p028s.C0994c;
import com.kofax.mobile.sdk.p028s.C8467d;
import java.io.File;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.Callable;
import p040o.HmlPinActivity;
import p040o.ModifyQuickTopUpReviewActivity;

public class ImageProcessor {
    /* access modifiers changed from: private */
    public static final String TAG = ImageProcessor.class.getSimpleName();

    /* renamed from: aA */
    private static final String f79aA = "_UseLegacyProcessor_";

    /* renamed from: aB */
    private static final String f80aB = "_ProcessCheckFront_";

    /* renamed from: aC */
    private static final String f81aC = "_ProcessCheckBack_";

    /* renamed from: aD */
    private static final String f82aD = "_ProcessMrzDoc_";

    /* renamed from: aF */
    private static double f83aF = 0.2d;

    /* renamed from: aG */
    private static double f84aG = 1.0d;

    /* renamed from: aH */
    private static double f85aH = 0.02d;

    /* renamed from: aI */
    private static double f86aI = 50.0d;

    /* renamed from: aJ */
    private static double f87aJ = 0.02d;

    /* renamed from: az */
    private static final String f88az = "_DoDocumentDetectorBasedCrop_";
    /* access modifiers changed from: private */

    /* renamed from: bb */
    public static volatile long f89bb;
    private IBus _bus;
    /* access modifiers changed from: private */

    /* renamed from: aE */
    public final C0669c f90aE = Injector.getInjector(AppContextProvider.getContext()).getDetectorBasedCropper();

    /* renamed from: aK */
    private String f91aK = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"ErrorAnalysis\">    <Section name=\"ShadowDetection\">      <Parm name=\"ScaledSize\" type=\"int\" value=\"65536\"/>      <Parm name=\"MinimumShadowAreaFraction\" type=\"float\" value=\"0.1\"/>    </Section></Configuration>";

    /* renamed from: aL */
    private String f92aL = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"ErrorAnalysis\">    <Section name=\"ShadowDetection\">      <Parm name=\"ScaledSize\" type=\"int\" value=\"65536\"/>      <Parm name=\"MinimumShadowAreaFraction\" type=\"float\" value=\"0.1\"/>    </Section></Configuration>";

    /* renamed from: aM */
    private String f93aM = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"ErrorAnalysis\">    <Section name=\"DocumentTracker\">      <Parm name=\"DetectorConfig\" type=\"string\" value=\"GenericSingleConfig\" />      <Parm name=\"FrameHistorySize\" type=\"int\" value=\"50\" />      <Parm name=\"MaxTrackedDocuments\" type=\"int\" value=\"1\" />      <Parm name=\"IsUseReferenceFeature\" type=\"bool\" value=\"yes\" />    </Section>    <Section name=\"GenericSingleConfig\">      <Parm name=\"DetectorType\" type=\"string\" value=\"GenericSingleDetector\" />      <Parm name=\"SegmentationConfig\" type=\"string\" value=\"GenericSingleSegmentationConfig\" />      <Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/>      <Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"0.005\"/>      <Parm name=\"IsCornerDetection\" type=\"bool\" value=\"yes\"/>      <Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.01\"/>      <Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.01\"/>    </Section>    <Section name=\"GenericSingleSegmentationConfig\">      <Parm name=\"EdgeType\" type=\"string\" value=\"MainComponent\" />      <Parm name=\"ScaleFactor\" type=\"float\" value=\"0.2\" />      <Parm name=\"SmoothingSize\" type=\"int\" value=\"3\" />      <Parm name=\"FilterSize\" type=\"int\" value=\"3\" />      <Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\" />      <Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\" />      <Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/>    </Section></Configuration>";

    /* renamed from: aN */
    private String f94aN = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"ErrorAnalysis\">    <Section name=\"GlareDetection\">      <Parm name=\"IntensityFraction\" type=\"float\" value=\"0.03\"/>      <Parm name=\"IntensityThreshold\" type=\"int\" value=\"240\"/>      <Parm name=\"MinimumGlareAreaFraction\" type=\"int\" value=\"0.01\"/>      <Parm name=\"NumberOfTiles\" type=\"int\" value=\"100\"/>    </Section>    <Section name=\"DocumentTracker\">      <Parm name=\"DetectorConfig\" type=\"string\" value=\"GenericSingleConfig\" />      <Parm name=\"FrameHistorySize\" type=\"int\" value=\"50\" />      <Parm name=\"MaxTrackedDocuments\" type=\"int\" value=\"1\" />      <Parm name=\"IsUseReferenceFeature\" type=\"bool\" value=\"yes\" />    </Section>    <Section name=\"GenericSingleConfig\">      <Parm name=\"DetectorType\" type=\"string\" value=\"GenericSingleDetector\" />      <Parm name=\"SegmentationConfig\" type=\"string\" value=\"GenericSingleSegmentationConfig\" />      <Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/>      <Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"0.005\"/>      <Parm name=\"IsCornerDetection\" type=\"bool\" value=\"yes\"/>      <Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.01\"/>      <Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.01\"/>    </Section>    <Section name=\"GenericSingleSegmentationConfig\">      <Parm name=\"EdgeType\" type=\"string\" value=\"ColorEdge\" />      <Parm name=\"ScaleFactor\" type=\"float\" value=\"0.2\" />      <Parm name=\"SmoothingSize\" type=\"int\" value=\"3\" />      <Parm name=\"FilterSize\" type=\"int\" value=\"3\" />      <Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\" />      <Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\" />      <Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/>    </Section></Configuration>";

    /* renamed from: aO */
    private String f95aO = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><Configuration name=\"ErrorAnalysis\">    <Section name=\"DocumentTracker\">      <Parm name=\"DetectorConfig\" type=\"string\" value=\"GenericSingleConfig\" />      <Parm name=\"FrameHistorySize\" type=\"int\" value=\"50\" />      <Parm name=\"MaxTrackedDocuments\" type=\"int\" value=\"1\" />      <Parm name=\"IsUseReferenceFeature\" type=\"bool\" value=\"yes\" />    </Section>    <Section name=\"GenericSingleConfig\">      <Parm name=\"DetectorType\" type=\"string\" value=\"GenericSingleDetector\" />      <Parm name=\"SegmentationConfig\" type=\"string\" value=\"GenericSingleSegmentationConfig\" />      <Parm name=\"RelativeAreaRatio1\" type=\"float\" value=\"0.005\"/>      <Parm name=\"RelativeAreaRatio2\" type=\"float\" value=\"0.005\"/>      <Parm name=\"IsCornerDetection\" type=\"bool\" value=\"yes\"/>      <Parm name=\"RelativeImageMarginX\" type=\"float\" value=\"0.01\"/>      <Parm name=\"RelativeImageMarginY\" type=\"float\" value=\"0.01\"/>    </Section>    <Section name=\"GenericSingleSegmentationConfig\">      <Parm name=\"EdgeType\" type=\"string\" value=\"MainComponent\" />      <Parm name=\"ScaleFactor\" type=\"float\" value=\"0.2\" />      <Parm name=\"SmoothingSize\" type=\"int\" value=\"3\" />      <Parm name=\"FilterSize\" type=\"int\" value=\"3\" />      <Parm name=\"EdgeLowThreshold\" type=\"int\" value=\"30\" />      <Parm name=\"EdgeHighThreshold\" type=\"int\" value=\"255\" />      <Parm name=\"ContrastThreshold\" type=\"int\" value=\"50\"/>    </Section></Configuration>";

    /* renamed from: aP */
    private ImagePerfectionProfile f96aP;
    /* access modifiers changed from: private */

    /* renamed from: aQ */
    public BasicSettingsProfile f97aQ;

    /* renamed from: aR */
    private Image.ImageRep f98aR = Image.ImageRep.IMAGE_REP_BITMAP;

    /* renamed from: aS */
    private String f99aS;

    /* renamed from: aT */
    private Image.ImageMimeType f100aT = Image.ImageMimeType.MIMETYPE_UNKNOWN;

    /* renamed from: aU */
    private ListenerCallbackThreadType f101aU = ListenerCallbackThreadType.UI_THREAD;

    /* renamed from: aV */
    private ArrayList<ImageOutListener> f102aV = new ArrayList<>();

    /* renamed from: aW */
    private ArrayList<ProcessProgressListener> f103aW = new ArrayList<>();

    /* renamed from: aX */
    private ArrayList<AnalysisCompleteListener> f104aX = new ArrayList<>();

    /* renamed from: aY */
    private ArrayList<AnalysisProgressListener> f105aY = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: aZ */
    public TaskRunner f106aZ;

    /* renamed from: ba */
    private C0430b f107ba;
    /* access modifiers changed from: private */

    /* renamed from: bc */
    public boolean f108bc;
    private int processedImageJpegQuality = 90;

    public interface AnalysisCompleteListener {
        void analysisComplete(AnalysisCompleteEvent analysisCompleteEvent);
    }

    public interface ImageOutListener {
        void imageOut(ImageOutEvent imageOutEvent);
    }

    public interface AnalysisProgressListener {
        void analysisProgress(AnalysisProgressEvent analysisProgressEvent);
    }

    public interface ProcessProgressListener {
        void processProgress(ProcessProgressEvent processProgressEvent);
    }

    public void cancel() {
        C0767k.m1807c(TAG, "cancelCalledExternalApi");
        C0430b bVar = this.f107ba;
        if (bVar != null) {
            boolean unused = bVar.f133bt = true;
        }
        ImageService.cancelImageProcessing();
    }

    public static class ImageOutEvent extends EventObject {
        private static final long serialVersionUID = 3442216892248828021L;

        /* renamed from: be */
        private ErrorInfo f111be;
        private Image image;

        public ImageOutEvent(Object obj, ErrorInfo errorInfo, Image image2) {
            super(obj);
            this.f111be = errorInfo;
            this.image = image2;
        }

        public ErrorInfo getStatus() {
            return this.f111be;
        }

        public Image getImage() {
            return this.image;
        }
    }

    public static class ProcessProgressEvent extends EventObject {
        private static final long serialVersionUID = 3442216892248828021L;

        /* renamed from: be */
        private ErrorInfo f142be;

        /* renamed from: bf */
        private int f143bf;
        private String imageID;

        public ProcessProgressEvent(Object obj, ErrorInfo errorInfo, String str, int i) {
            super(obj);
            this.f142be = errorInfo;
            this.imageID = str;
            this.f143bf = i;
        }

        public ErrorInfo getStatus() {
            return this.f142be;
        }

        public String getImageID() {
            return this.imageID;
        }

        public int getProgressPct() {
            return this.f143bf;
        }
    }

    public static class AnalysisCompleteEvent extends EventObject {
        private static final long serialVersionUID = 5180886074104600189L;

        /* renamed from: be */
        private ErrorInfo f110be;
        private Image image;

        public AnalysisCompleteEvent(Object obj, ErrorInfo errorInfo, Image image2) {
            super(obj);
            this.f110be = errorInfo;
            this.image = image2;
        }

        public ErrorInfo getStatus() {
            return this.f110be;
        }

        public Image getImage() {
            return this.image;
        }
    }

    public static class AnalysisProgressEvent extends EventObject {
        private static final long serialVersionUID = 9007021929022931498L;

        /* renamed from: be */
        private ErrorInfo f140be;

        /* renamed from: bf */
        private int f141bf;
        private String imageID;

        public AnalysisProgressEvent(Object obj, ErrorInfo errorInfo, String str, int i) {
            super(obj);
            this.f140be = errorInfo;
            this.imageID = str;
            this.f141bf = i;
        }

        public ErrorInfo getStatus() {
            return this.f140be;
        }

        public String getImageID() {
            return this.imageID;
        }

        public int getProgressPct() {
            return this.f141bf;
        }
    }

    @HmlPinActivity
    public ImageProcessor() {
        m148l();
        IBus iBus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
        this._bus = iBus;
        iBus.post(new C0994c());
    }

    public void doCleanup() {
        this._bus.post(new C8467d());
        this.f96aP = null;
        this.f97aQ = null;
        ArrayList<ImageOutListener> arrayList = this.f102aV;
        if (arrayList != null) {
            arrayList.clear();
            this.f102aV = null;
        }
        ArrayList<ProcessProgressListener> arrayList2 = this.f103aW;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.f103aW = null;
        }
        ArrayList<AnalysisCompleteListener> arrayList3 = this.f104aX;
        if (arrayList3 != null) {
            arrayList3.clear();
            this.f104aX = null;
        }
        TaskRunner taskRunner = this.f106aZ;
        if (taskRunner != null) {
            taskRunner.shutdown();
        }
        this.f107ba = null;
    }

    @Deprecated
    public ImagePerfectionProfile getImagePerfectionProfile() {
        ImagePerfectionProfile imagePerfectionProfile = this.f96aP;
        if (imagePerfectionProfile != null) {
            return imagePerfectionProfile.clone();
        }
        return null;
    }

    @Deprecated
    public void setImagePerfectionProfile(ImagePerfectionProfile imagePerfectionProfile) {
        if (imagePerfectionProfile != null) {
            imagePerfectionProfile = imagePerfectionProfile.clone();
        }
        this.f96aP = imagePerfectionProfile;
    }

    @Deprecated
    public BasicSettingsProfile getBasicSettingsProfile() {
        BasicSettingsProfile basicSettingsProfile = this.f97aQ;
        if (basicSettingsProfile != null) {
            return basicSettingsProfile.clone();
        }
        return null;
    }

    @Deprecated
    public void setBasicSettingsProfile(BasicSettingsProfile basicSettingsProfile) {
        if (basicSettingsProfile != null) {
            basicSettingsProfile = basicSettingsProfile.clone();
        }
        this.f97aQ = basicSettingsProfile;
    }

    public Image.ImageRep getProcessedImageRepresentation() {
        return this.f98aR;
    }

    public void setProcessedImageRepresentation(Image.ImageRep imageRep) {
        this.f98aR = imageRep;
    }

    public String getProcessedImageFilePath() {
        return this.f99aS;
    }

    public void setProcessedImageFilePath(String str) {
        this.f99aS = str;
    }

    public Image.ImageMimeType getProcessedImageMimeType() {
        return this.f100aT;
    }

    public void setProcessedImageMimeType(Image.ImageMimeType imageMimeType) {
        this.f100aT = imageMimeType;
    }

    public int getProcessedImageJpegQuality() {
        return this.processedImageJpegQuality;
    }

    public void setProcessedImageJpegQuality(int i) {
        if (i <= 0 || i > 100) {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_JPEG_QUALITY_VALUE);
        }
        this.processedImageJpegQuality = i;
    }

    public ListenerCallbackThreadType getListenerCallbackThreadType() {
        return this.f101aU;
    }

    public void setListenerCallbackThreadType(ListenerCallbackThreadType listenerCallbackThreadType) {
        this.f101aU = listenerCallbackThreadType;
    }

    @Deprecated
    public void processImage(Image image) throws KmcException {
        m129a((Object) image, "image");
        m128a(image, false, false, (QuickAnalysisSettings) null, (ImageProcessorConfiguration) null);
    }

    public void processImage(Image image, ImageProcessorConfiguration imageProcessorConfiguration) throws KmcException {
        m129a((Object) image, "image");
        C0795d.m1881b(imageProcessorConfiguration);
        m128a(image, false, false, (QuickAnalysisSettings) null, imageProcessorConfiguration.clone());
    }

    public void addImageOutEventListener(ImageOutListener imageOutListener) {
        if (imageOutListener == null) {
            throw new NullPointerException("addImageOutEventListener: listener parameter is null");
        } else if (!this.f102aV.contains(imageOutListener)) {
            this.f102aV.add(imageOutListener);
        }
    }

    public void removeImageOutEventListener(ImageOutListener imageOutListener) {
        this.f102aV.remove(imageOutListener);
    }

    public void addProcessProgressEventListener(ProcessProgressListener processProgressListener) {
        this.f103aW.add(processProgressListener);
    }

    public void removeProcessProgressEventListener(ProcessProgressListener processProgressListener) {
        this.f103aW.remove(processProgressListener);
    }

    public void doQuickAnalysis(Image image, boolean z) throws KmcException {
        m129a((Object) image, "image");
        this.f108bc = z;
        doQuickAnalysis(image, z, (QuickAnalysisSettings) null);
    }

    public void doQuickAnalysis(Image image, boolean z, QuickAnalysisSettings quickAnalysisSettings) throws KmcException {
        m129a((Object) image, "image");
        this.f108bc = z;
        if (quickAnalysisSettings == null) {
            quickAnalysisSettings = new QuickAnalysisSettings();
        }
        m128a(image, true, z, quickAnalysisSettings, (ImageProcessorConfiguration) null);
    }

    public void addAnalysisCompleteEventListener(AnalysisCompleteListener analysisCompleteListener) {
        ArrayList<AnalysisCompleteListener> arrayList = this.f104aX;
        if (arrayList != null) {
            arrayList.add(analysisCompleteListener);
        }
    }

    public void removeAnalysisCompleteEventListener(AnalysisCompleteListener analysisCompleteListener) {
        this.f104aX.remove(analysisCompleteListener);
    }

    public void addAnalysisProgressEventListener(AnalysisProgressListener analysisProgressListener) {
        this.f105aY.add(analysisProgressListener);
    }

    public void removeAnalysisProgressEventListener(AnalysisProgressListener analysisProgressListener) {
        this.f105aY.remove(analysisProgressListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10051a(ErrorInfo errorInfo, Image image, ImageProcessorConfiguration imageProcessorConfiguration) {
        String str;
        if (imageProcessorConfiguration != null) {
            str = C0793c.m1872a(imageProcessorConfiguration).f1898TP;
        } else {
            ImagePerfectionProfile imagePerfectionProfile = this.f96aP;
            if (imagePerfectionProfile != null) {
                try {
                    str = new ImagePerfectionProfile.FriendIPP(BuildConfig.APPLICATION_ID).toFinalOpString();
                } catch (KmcException e) {
                    e.printStackTrace();
                } catch (KmcRuntimeException e2) {
                    e2.printStackTrace();
                }
            }
            str = null;
        }
        if (!(image == null || image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_NONE)) {
            this._bus.post(new C0990b(image, ImageSource.PROCESSOR));
        }
        this._bus.post(new C0992a(errorInfo, image, str));
        ArrayList<ImageOutListener> arrayList = this.f102aV;
        if (arrayList == null) {
            C0767k.m1814d(TAG, "Called back after this object has been destroyed");
            return;
        }
        Iterator<ImageOutListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().imageOut(new ImageOutEvent(this, errorInfo, image));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10052a(ErrorInfo errorInfo, String str, int i) {
        ArrayList<ProcessProgressListener> arrayList = this.f103aW;
        if (arrayList == null) {
            C0767k.m1814d(TAG, "Called back after this object has been destroyed");
            return;
        }
        Iterator<ProcessProgressListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().processProgress(new ProcessProgressEvent(this, errorInfo, str, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10050a(ErrorInfo errorInfo, Image image) {
        ArrayList<AnalysisCompleteListener> arrayList = this.f104aX;
        if (arrayList == null) {
            C0767k.m1814d(TAG, "Called back after this object has been destroyed");
            return;
        }
        Iterator<AnalysisCompleteListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().analysisComplete(new AnalysisCompleteEvent(this, errorInfo, image));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10057b(ErrorInfo errorInfo, String str, int i) {
        ArrayList<AnalysisProgressListener> arrayList = this.f105aY;
        if (arrayList == null) {
            C0767k.m1814d(TAG, "Called back after this object has been destroyed");
            return;
        }
        Iterator<AnalysisProgressListener> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().analysisProgress(new AnalysisProgressEvent(this, errorInfo, str, i));
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.ImageProcessor$c */
    class C0431c implements TaskRunner.TaskCompletedListener {
        /* access modifiers changed from: private */

        /* renamed from: bo */
        public ProcessPageOutRep f136bo;

        /* renamed from: bv */
        private final C0430b f137bv;
        /* access modifiers changed from: private */

        /* renamed from: bw */
        public ImageProcessor f138bw;

        public C0431c(C0430b bVar) {
            this.f137bv = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0142 A[SYNTHETIC, Splitter:B:35:0x0142] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x016b  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x020c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedEvent r13) {
            /*
                r12 = this;
                com.kofax.kmc.ken.engines.ImageProcessor r0 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.kut.utilities.async.TaskRunner r0 = r0.f106aZ
                com.kofax.kmc.ken.engines.ImageProcessor$b r1 = r12.f137bv
                r0.removeOnTaskCompletedListener(r12, r1)
                long r0 = r13.getTaskID()
                java.lang.String r2 = com.kofax.kmc.ken.engines.ImageProcessor.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Task "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = " completed."
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r2, (java.lang.String) r3)
                com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = r13.getTaskError()
                com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r2 != r3) goto L_0x0067
                java.lang.String r3 = com.kofax.kmc.ken.engines.ImageProcessor.TAG
                java.lang.String r4 = "No Task Error. Good."
                com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r3, (java.lang.String) r4)
                long r3 = com.kofax.kmc.ken.engines.ImageProcessor.f89bb
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0083
                java.lang.String r0 = com.kofax.kmc.ken.engines.ImageProcessor.TAG
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unexpected: Task "
                r1.append(r3)
                long r3 = com.kofax.kmc.ken.engines.ImageProcessor.f89bb
                r1.append(r3)
                java.lang.String r3 = " was running."
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r0, (java.lang.String) r1)
                goto L_0x0083
            L_0x0067:
                java.lang.String r0 = com.kofax.kmc.ken.engines.ImageProcessor.TAG
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Task Error: "
                r1.append(r3)
                java.lang.String r3 = r2.toString()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r0, (java.lang.String) r1)
            L_0x0083:
                r0 = 0
                long unused = com.kofax.kmc.ken.engines.ImageProcessor.f89bb = r0
                java.lang.Object r13 = r13.getTaskReturnValue()
                com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults r13 = (com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults) r13
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r0 = r12.f136bo
                boolean r0 = r0.isQuickAnalysisEnabled()
                java.lang.String r1 = "com.kofax"
                r3 = 0
                r4 = 0
                if (r0 == 0) goto L_0x0250
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r2 != r0) goto L_0x0248
                com.kofax.kmc.ken.engines.data.Image r0 = r13.image
                if (r0 == 0) goto L_0x0248
                com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback r0 = new com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback
                r0.<init>()
                com.kofax.kmc.ken.engines.data.Image r2 = r13.image
                java.lang.String r2 = r2.getImageMetaData()
                r5 = 1
                com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback$FriendQAF r6 = new com.kofax.kmc.ken.engines.data.QuickAnalysisFeedback$FriendQAF     // Catch:{ KmcException -> 0x010d }
                r6.<init>(r1)     // Catch:{ KmcException -> 0x010d }
                com.kofax.kmc.ken.engines.ImageProcessor r7 = com.kofax.kmc.ken.engines.ImageProcessor.this     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.ImageProcessor$b r8 = r12.f137bv     // Catch:{ KmcException -> 0x010b }
                android.graphics.Point r8 = r8.f132bs     // Catch:{ KmcException -> 0x010b }
                java.lang.String r2 = r7.m123a((android.graphics.Point) r8, (java.lang.String) r2)     // Catch:{ KmcException -> 0x010b }
                r6.setMetadata(r2)     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r2 = r12.f136bo     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r2 = r2.quickAnalysisSettings     // Catch:{ KmcException -> 0x010b }
                boolean r2 = r2.getBlurDetection()     // Catch:{ KmcException -> 0x010b }
                if (r2 == 0) goto L_0x00dd
                com.kofax.kmc.ken.engines.ImageProcessor$b r2 = r12.f137bv     // Catch:{ KmcException -> 0x010b }
                float r2 = r2.f134bu     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r7 = r12.f136bo     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r7 = r7.quickAnalysisSettings     // Catch:{ KmcException -> 0x010b }
                int r7 = r7.getBlurThreshold()     // Catch:{ KmcException -> 0x010b }
                float r7 = (float) r7     // Catch:{ KmcException -> 0x010b }
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 <= 0) goto L_0x00dd
                r2 = r5
                goto L_0x00de
            L_0x00dd:
                r2 = r4
            L_0x00de:
                r6.setBlurry(r2)     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r2 = r12.f136bo     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r2 = r2.quickAnalysisSettings     // Catch:{ KmcException -> 0x010b }
                boolean r2 = r2.getSaturationDetection()     // Catch:{ KmcException -> 0x010b }
                if (r2 != 0) goto L_0x00f1
                r6.setOversaturated(r4)     // Catch:{ KmcException -> 0x010b }
                r6.setUndersaturated(r4)     // Catch:{ KmcException -> 0x010b }
            L_0x00f1:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r2 = r12.f136bo     // Catch:{ KmcException -> 0x010b }
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r2 = r2.quickAnalysisSettings     // Catch:{ KmcException -> 0x010b }
                boolean r2 = r2.getSkewDetection()     // Catch:{ KmcException -> 0x010b }
                if (r2 != 0) goto L_0x00fe
                r6.setOverlySkewed(r4)     // Catch:{ KmcException -> 0x010b }
            L_0x00fe:
                r6.setMissingBorder(r4)     // Catch:{ KmcException -> 0x010b }
                r6.setLowContrastBackground(r4)     // Catch:{ KmcException -> 0x010b }
                r6.setIsShadowed(r4)     // Catch:{ KmcException -> 0x010b }
                r6.setGlareDetected(r4)     // Catch:{ KmcException -> 0x010b }
                goto L_0x0112
            L_0x010b:
                r2 = move-exception
                goto L_0x010f
            L_0x010d:
                r2 = move-exception
                r6 = r3
            L_0x010f:
                r2.printStackTrace()
            L_0x0112:
                com.kofax.kmc.ken.engines.data.BoundingTetragon r2 = r0.getTetragonCorners()
                java.util.Vector r4 = new java.util.Vector
                r7 = 4
                r4.<init>(r7)
                android.graphics.Point r7 = r2.getTopLeft()
                r4.add(r7)
                android.graphics.Point r7 = r2.getTopRight()
                r4.add(r7)
                android.graphics.Point r7 = r2.getBottomRight()
                r4.add(r7)
                android.graphics.Point r2 = r2.getBottomLeft()
                r4.add(r2)
                com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                com.kofax.kmc.ken.engines.data.Image r7 = r13.originalImage
                android.graphics.Bitmap r7 = r7.getImageBitmap()
                if (r7 != 0) goto L_0x016b
                com.kofax.kmc.ken.engines.data.Image$FriendI r2 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x014f }
                com.kofax.kmc.ken.engines.data.Image r8 = r13.originalImage     // Catch:{ KmcException -> 0x014f }
                r2.<init>(r1)     // Catch:{ KmcException -> 0x014f }
                r2.clearBitmapWithoutRecycle()     // Catch:{ KmcException -> 0x014d }
                goto L_0x0155
            L_0x014d:
                r8 = move-exception
                goto L_0x0152
            L_0x014f:
                r2 = move-exception
                r8 = r2
                r2 = r3
            L_0x0152:
                r8.printStackTrace()
            L_0x0155:
                com.kofax.kmc.ken.engines.ImageProcessor r8 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r9 = r13.originalImage
                com.kofax.kmc.kut.utilities.error.ErrorInfo r8 = r8.m122a((com.kofax.kmc.ken.engines.data.Image) r9, (com.kofax.kmc.ken.engines.data.Image.FriendI) r2)
                com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r8 == r9) goto L_0x016d
                com.kofax.kmc.kut.utilities.error.ErrorInfo r9 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
                if (r8 == r9) goto L_0x016d
                com.kofax.kmc.ken.engines.ImageProcessor r13 = r12.f138bw
                r13.mo10050a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r8, (com.kofax.kmc.ken.engines.data.Image) r3)
                return
            L_0x016b:
                r8 = r2
                r2 = r3
            L_0x016d:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r9 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r9 = r9.quickAnalysisSettings
                boolean r9 = r9.getMissingBordersDetection()
                if (r9 == 0) goto L_0x0184
                com.kofax.kmc.ken.engines.ImageProcessor r9 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r10 = r13.originalImage
                boolean r9 = r9.m143d((com.kofax.kmc.ken.engines.data.Image) r10)
                if (r9 == 0) goto L_0x0184
                r6.setMissingBorder(r5)
            L_0x0184:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r9 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r9 = r9.quickAnalysisSettings
                boolean r9 = r9.getGlareDetection()
                if (r9 == 0) goto L_0x01a5
                boolean r9 = r0.isGlareDetected()
                if (r9 != 0) goto L_0x01a5
                com.kofax.kmc.ken.engines.ImageProcessor r9 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r10 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r10 = r10.quickAnalysisSettings
                com.kofax.kmc.ken.engines.data.Image r11 = r13.originalImage
                boolean r9 = r9.m134a((com.kofax.kmc.ken.engines.data.QuickAnalysisSettings) r10, (com.kofax.kmc.ken.engines.data.Image) r11, (java.util.Vector<android.graphics.Point>) r4)
                if (r9 == 0) goto L_0x01a5
                r6.setGlareDetected(r5)
            L_0x01a5:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r9 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r9 = r9.quickAnalysisSettings
                boolean r9 = r9.getLowContrastBackgroundDetection()
                if (r9 == 0) goto L_0x01bc
                com.kofax.kmc.ken.engines.ImageProcessor r9 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r10 = r13.originalImage
                boolean r9 = r9.m133a((com.kofax.kmc.ken.engines.data.Image) r10, (java.util.Vector<android.graphics.Point>) r4)
                if (r9 == 0) goto L_0x01bc
                r6.setLowContrastBackground(r5)
            L_0x01bc:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r9 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r9 = r9.quickAnalysisSettings
                boolean r9 = r9.getShadowDetection()
                if (r9 == 0) goto L_0x01d3
                com.kofax.kmc.ken.engines.ImageProcessor r9 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r10 = r13.originalImage
                boolean r4 = r9.m139b((com.kofax.kmc.ken.engines.data.Image) r10, (java.util.Vector<android.graphics.Point>) r4)
                if (r4 == 0) goto L_0x01d3
                r6.setIsShadowed(r5)
            L_0x01d3:
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r4 = r12.f136bo
                com.kofax.kmc.ken.engines.data.QuickAnalysisSettings r4 = r4.quickAnalysisSettings
                boolean r4 = r4.getSaturationDetection()
                if (r4 == 0) goto L_0x01f6
                boolean r4 = r0.isUndersaturated()
                if (r4 != 0) goto L_0x01f6
                boolean r4 = r0.isOversaturated()
                if (r4 != 0) goto L_0x01f6
                com.kofax.kmc.ken.engines.ImageProcessor r4 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r9 = r13.originalImage
                boolean r4 = r4.m144e(r9)
                if (r4 == 0) goto L_0x01f6
                r6.setUndersaturated(r5)
            L_0x01f6:
                com.kofax.kmc.kut.utilities.error.ErrorInfo r4 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r8 == r4) goto L_0x01fe
                com.kofax.kmc.kut.utilities.error.ErrorInfo r4 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
                if (r8 != r4) goto L_0x0211
            L_0x01fe:
                com.kofax.kmc.ken.engines.data.Image r4 = r13.originalImage
                android.graphics.Bitmap r4 = r4.getImageBitmap()
                if (r7 != 0) goto L_0x020c
                com.kofax.kmc.ken.engines.data.Image r2 = r13.originalImage
                r2.imageClearBitmap()
                goto L_0x0211
            L_0x020c:
                if (r7 == r4) goto L_0x0211
                r2.setImageBitmapInternal(r7)
            L_0x0211:
                com.kofax.kmc.ken.engines.ImageProcessor r2 = com.kofax.kmc.ken.engines.ImageProcessor.this
                boolean r2 = r2.f108bc
                if (r2 == 0) goto L_0x0223
                com.kofax.kmc.ken.engines.data.Image r2 = r13.image
                if (r2 == 0) goto L_0x0223
                com.kofax.kmc.ken.engines.data.Image r2 = r13.image
                android.graphics.Bitmap r3 = r2.getImageBitmap()
            L_0x0223:
                r6.setViewBoundariesImage(r3)
                com.kofax.kmc.ken.engines.data.Image$FriendI r2 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x023a }
                com.kofax.kmc.ken.engines.data.Image r3 = r13.originalImage     // Catch:{ KmcException -> 0x023a }
                r2.<init>(r1)     // Catch:{ KmcException -> 0x023a }
                r2.setImageQuickAnalysisFeedBack(r0)     // Catch:{ KmcException -> 0x023a }
                com.kofax.kmc.ken.engines.data.Image r0 = r13.image     // Catch:{ KmcException -> 0x023a }
                java.lang.String r0 = r0.getImageMetaData()     // Catch:{ KmcException -> 0x023a }
                r2.setImageMetaData(r0)     // Catch:{ KmcException -> 0x023a }
                goto L_0x023e
            L_0x023a:
                r0 = move-exception
                r0.printStackTrace()
            L_0x023e:
                com.kofax.kmc.ken.engines.ImageProcessor r0 = r12.f138bw
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = r13.errorInfo
                com.kofax.kmc.ken.engines.data.Image r13 = r13.originalImage
                r0.mo10050a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r1, (com.kofax.kmc.ken.engines.data.Image) r13)
                return
            L_0x0248:
                com.kofax.kmc.kut.utilities.error.ErrorInfo r13 = r13.errorInfo
                com.kofax.kmc.ken.engines.ImageProcessor r0 = r12.f138bw
                r0.mo10050a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r13, (com.kofax.kmc.ken.engines.data.Image) r3)
                return
            L_0x0250:
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r2 != r0) goto L_0x02ba
                com.kofax.kmc.ken.engines.data.Image r0 = r13.image
                if (r0 == 0) goto L_0x02ae
                java.lang.String r2 = r0.getImageMetaData()
                if (r2 == 0) goto L_0x02ae
                com.kofax.kmc.ken.engines.ImageProcessor$b r2 = r12.f137bv
                com.kofax.kmc.ken.engines.data.BoundingTetragon r2 = r2.f131br
                if (r2 == 0) goto L_0x0283
                com.kofax.kmc.ken.engines.ImageProcessor r2 = com.kofax.kmc.ken.engines.ImageProcessor.this     // Catch:{ KmcException -> 0x027f }
                com.kofax.kmc.ken.engines.ImageProcessor$b r3 = r12.f137bv     // Catch:{ KmcException -> 0x027f }
                com.kofax.kmc.ken.engines.data.BoundingTetragon r3 = r3.f131br     // Catch:{ KmcException -> 0x027f }
                java.lang.String r5 = r0.getImageMetaData()     // Catch:{ KmcException -> 0x027f }
                java.lang.String r2 = r2.m126a((com.kofax.kmc.ken.engines.data.BoundingTetragon) r3, (java.lang.String) r5)     // Catch:{ KmcException -> 0x027f }
                com.kofax.kmc.ken.engines.data.Image$FriendI r3 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x027f }
                r3.<init>(r1)     // Catch:{ KmcException -> 0x027f }
                r3.setImageMetaData(r2)     // Catch:{ KmcException -> 0x027f }
                goto L_0x0283
            L_0x027f:
                r2 = move-exception
                r2.printStackTrace()
            L_0x0283:
                com.kofax.kmc.ken.engines.ImageProcessor$b r2 = r12.f137bv
                android.graphics.Point r2 = r2.f132bs
                if (r2 == 0) goto L_0x02ae
                com.kofax.kmc.ken.engines.ImageProcessor$b r2 = r12.f137bv
                android.graphics.Point r2 = r2.f132bs
                boolean r2 = r2.equals(r4, r4)
                if (r2 != 0) goto L_0x02ae
                com.kofax.kmc.ken.engines.ImageProcessor r2 = com.kofax.kmc.ken.engines.ImageProcessor.this     // Catch:{ KmcException -> 0x02aa }
                com.kofax.kmc.ken.engines.ImageProcessor$b r3 = r12.f137bv     // Catch:{ KmcException -> 0x02aa }
                android.graphics.Point r3 = r3.f132bs     // Catch:{ KmcException -> 0x02aa }
                java.lang.String r4 = r0.getImageMetaData()     // Catch:{ KmcException -> 0x02aa }
                java.lang.String r2 = r2.m123a((android.graphics.Point) r3, (java.lang.String) r4)     // Catch:{ KmcException -> 0x02aa }
                com.kofax.kmc.ken.engines.data.Image$FriendI r3 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x02aa }
                r3.<init>(r1)     // Catch:{ KmcException -> 0x02aa }
                r3.setImageMetaData(r2)     // Catch:{ KmcException -> 0x02aa }
                goto L_0x02ae
            L_0x02aa:
                r1 = move-exception
                r1.printStackTrace()
            L_0x02ae:
                com.kofax.kmc.ken.engines.ImageProcessor r1 = r12.f138bw
                com.kofax.kmc.kut.utilities.error.ErrorInfo r13 = r13.errorInfo
                com.kofax.kmc.ken.engines.ImageProcessor$b r2 = r12.f137bv
                com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration r2 = r2.f126bm
                r1.mo10051a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r13, (com.kofax.kmc.ken.engines.data.Image) r0, (com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration) r2)
                return
            L_0x02ba:
                com.kofax.kmc.ken.engines.ImageProcessor r13 = r12.f138bw
                com.kofax.kmc.ken.engines.ImageProcessor$b r0 = r12.f137bv
                com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration r0 = r0.f126bm
                r13.mo10051a((com.kofax.kmc.kut.utilities.error.ErrorInfo) r2, (com.kofax.kmc.ken.engines.data.Image) r3, (com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ImageProcessor.C0431c.onTaskCompleted(com.kofax.kmc.kut.utilities.async.TaskRunner$TaskCompletedEvent):void");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m143d(Image image) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        DocumentTracker documentTracker = new DocumentTracker();
        try {
            documentTracker.initializeString(this.f93aM, "DocumentTracker");
            documentTracker.reset();
            documentTracker.startup();
            Bitmap imageBitmap = image.getImageBitmap();
            documentTracker.grabImageFrame(imageBitmap);
            documentTracker.processFrame();
            documentTracker.releaseFrame();
            Vector<TrackedDocument> Documents = documentTracker.Documents();
            String str2 = "docs.size() < 1, returning null detection";
            if (Documents != null) {
                if (Documents.size() > 0) {
                    TrackedDocument trackedDocument = Documents.get(0);
                    if (trackedDocument != null) {
                        if (trackedDocument.Boundary().Corners().size() != 0) {
                            int width = imageBitmap.getWidth();
                            int height = imageBitmap.getHeight();
                            if (trackedDocument.Boundary().BoundaryType() == DetectedDocumentBoundary.DetectedBoundaryType.PARTIAL_OBJECT) {
                                Iterator<Point> it = trackedDocument.Boundary().Corners().iterator();
                                z = false;
                                while (it.hasNext()) {
                                    Point next = it.next();
                                    Iterator<Point> it2 = it;
                                    String str3 = str2;
                                    double d = (double) width;
                                    if (((double) next.x) >= d * 0.03d && ((double) next.x) <= d * 0.97d) {
                                        double d2 = (double) height;
                                        if (((double) next.y) >= d2 * 0.03d) {
                                            if (((double) next.y) <= d2 * 0.97d) {
                                                z3 = false;
                                                z |= z3;
                                                str2 = str3;
                                                it = it2;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    z |= z3;
                                    str2 = str3;
                                    it = it2;
                                }
                                str = str2;
                            } else {
                                str = str2;
                                z = false;
                            }
                            if (!z) {
                                documentTracker.initializeString(this.f94aN, "DocumentTracker");
                                documentTracker.reset();
                                documentTracker.startup();
                                documentTracker.grabImageFrame(imageBitmap);
                                documentTracker.processFrame();
                                documentTracker.releaseFrame();
                                Vector<TrackedDocument> Documents2 = documentTracker.Documents();
                                if (Documents2 != null) {
                                    if (Documents2.size() > 0) {
                                        TrackedDocument trackedDocument2 = Documents2.get(0);
                                        if (trackedDocument2 != null) {
                                            if (trackedDocument2.Boundary().Corners().size() != 0) {
                                                if (!z && trackedDocument2.Boundary().BoundaryType() == DetectedDocumentBoundary.DetectedBoundaryType.PARTIAL_OBJECT) {
                                                    Iterator<Point> it3 = trackedDocument2.Boundary().Corners().iterator();
                                                    while (it3.hasNext()) {
                                                        Point next2 = it3.next();
                                                        double d3 = (double) width;
                                                        if (((double) next2.x) >= d3 * 0.03d && ((double) next2.x) <= d3 * 0.97d) {
                                                            double d4 = (double) height;
                                                            if (((double) next2.y) >= d4 * 0.03d) {
                                                                if (((double) next2.y) <= d4 * 0.97d) {
                                                                    z2 = false;
                                                                    z |= z2;
                                                                }
                                                                z2 = true;
                                                                z |= z2;
                                                            }
                                                        }
                                                        z2 = true;
                                                        z |= z2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0767k.m1801b(TAG, str);
                            }
                            documentTracker.dispose();
                            return z;
                        }
                    }
                    documentTracker.dispose();
                    return true;
                }
            }
            C0767k.m1801b(TAG, str2);
            documentTracker.dispose();
            return true;
        } catch (Throwable th) {
            documentTracker.dispose();
            throw th;
        }
    }

    /* renamed from: a */
    private String m127a(QuickAnalysisSettings quickAnalysisSettings) {
        double glareDetectionIntensityFraction = quickAnalysisSettings.getGlareDetectionIntensityFraction();
        int glareDetectionIntensityThreshold = quickAnalysisSettings.getGlareDetectionIntensityThreshold();
        double glareDetectionMinimumGlareAreaFraction = quickAnalysisSettings.getGlareDetectionMinimumGlareAreaFraction();
        int glareDetectionNumberOfTiles = quickAnalysisSettings.getGlareDetectionNumberOfTiles();
        return String.format(Locale.US, " <?xml version=\"1.0\" encoding=\"iso-8859-1\"?> <Configuration name=\"Cadence\"> <Section name=\"GlareDetection\"> <Parm name=\"IntensityFraction\" type=\"float\" value=\"%f\"/> <Parm name=\"IntensityThreshold\" type=\"int\" value=\"%d\"/> <Parm name=\"MinimumGlareAreaFraction\" type=\"float\" value=\"%f\"/> <Parm name=\"NumberOfTiles\" type=\"int\" value=\"%d\"/> </Section> </Configuration>", new Object[]{Double.valueOf(glareDetectionIntensityFraction), Integer.valueOf(glareDetectionIntensityThreshold), Double.valueOf(glareDetectionMinimumGlareAreaFraction), Integer.valueOf(glareDetectionNumberOfTiles)});
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m134a(QuickAnalysisSettings quickAnalysisSettings, Image image, Vector<Point> vector) {
        GlareDetector glareDetector = new GlareDetector();
        glareDetector.loadConfigurationString(m127a(quickAnalysisSettings), "GlareDetection");
        glareDetector.grabImageFrame(image.getImageBitmap());
        double detectGlare = glareDetector.detectGlare();
        glareDetector.releaseFrame();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Detected glare fraction = ");
        sb.append(detectGlare);
        Log.i(str, sb.toString());
        boolean z = true;
        boolean z2 = detectGlare >= quickAnalysisSettings.getGlareDetectedThreshold();
        if (z2) {
            return z2;
        }
        if (glareDetector.getGlareFraction(vector) < f87aJ) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private double m140c(Point point, Point point2) {
        double d = (double) (point.x - point2.x);
        double d2 = (double) (point.y - point2.y);
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007f A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f A[Catch:{ all -> 0x00d6 }, LOOP:0: B:19:0x008c->B:21:0x008f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2 A[EDGE_INSN: B:38:0x00d2->B:32:0x00d2 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m133a(com.kofax.kmc.ken.engines.data.Image r12, java.util.Vector<android.graphics.Point> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "DocumentTracker"
            com.kofax.android.abc.machine_vision.DocumentTracker r1 = new com.kofax.android.abc.machine_vision.DocumentTracker
            r1.<init>()
            java.lang.String r2 = r11.f94aN     // Catch:{ all -> 0x00d6 }
            r1.initializeString(r2, r0)     // Catch:{ all -> 0x00d6 }
            r1.reset()     // Catch:{ all -> 0x00d6 }
            r1.startup()     // Catch:{ all -> 0x00d6 }
            android.graphics.Bitmap r2 = r12.getImageBitmap()     // Catch:{ all -> 0x00d6 }
            r1.grabImageFrame(r2)     // Catch:{ all -> 0x00d6 }
            r1.processFrame()     // Catch:{ all -> 0x00d6 }
            r1.releaseFrame()     // Catch:{ all -> 0x00d6 }
            java.util.Vector r2 = r1.Documents()     // Catch:{ all -> 0x00d6 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0048
            int r5 = r2.size()     // Catch:{ all -> 0x00d6 }
            if (r5 != r4) goto L_0x0048
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.TrackedDocument r2 = (com.kofax.android.abc.machine_vision.TrackedDocument) r2     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r5 = r2.Boundary()     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary$DetectedBoundaryType r5 = r5.BoundaryType()     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary$DetectedBoundaryType r6 = com.kofax.android.abc.machine_vision.DetectedDocumentBoundary.DetectedBoundaryType.WHOLE_OBJECT     // Catch:{ all -> 0x00d6 }
            if (r5 != r6) goto L_0x0048
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r2 = r2.Boundary()     // Catch:{ all -> 0x00d6 }
            java.util.Vector r2 = r2.Corners()     // Catch:{ all -> 0x00d6 }
            goto L_0x0049
        L_0x0048:
            r2 = r13
        L_0x0049:
            java.lang.String r5 = r11.f95aO     // Catch:{ all -> 0x00d6 }
            r1.initializeString(r5, r0)     // Catch:{ all -> 0x00d6 }
            r1.reset()     // Catch:{ all -> 0x00d6 }
            r1.startup()     // Catch:{ all -> 0x00d6 }
            android.graphics.Bitmap r12 = r12.getImageBitmap()     // Catch:{ all -> 0x00d6 }
            r1.grabImageFrame(r12)     // Catch:{ all -> 0x00d6 }
            r1.processFrame()     // Catch:{ all -> 0x00d6 }
            r1.releaseFrame()     // Catch:{ all -> 0x00d6 }
            java.util.Vector r12 = r1.Documents()     // Catch:{ all -> 0x00d6 }
            if (r12 == 0) goto L_0x0088
            int r0 = r12.size()     // Catch:{ all -> 0x00d6 }
            if (r0 != r4) goto L_0x0088
            java.lang.Object r12 = r12.get(r3)     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.TrackedDocument r12 = (com.kofax.android.abc.machine_vision.TrackedDocument) r12     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r0 = r12.Boundary()     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary$DetectedBoundaryType r0 = r0.BoundaryType()     // Catch:{ all -> 0x00d6 }
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary$DetectedBoundaryType r5 = com.kofax.android.abc.machine_vision.DetectedDocumentBoundary.DetectedBoundaryType.WHOLE_OBJECT     // Catch:{ all -> 0x00d6 }
            if (r0 != r5) goto L_0x0088
            com.kofax.android.abc.machine_vision.DetectedDocumentBoundary r12 = r12.Boundary()     // Catch:{ all -> 0x00d6 }
            java.util.Vector r12 = r12.Corners()     // Catch:{ all -> 0x00d6 }
            goto L_0x0089
        L_0x0088:
            r12 = r13
        L_0x0089:
            r5 = 0
            r0 = r3
        L_0x008c:
            r7 = 4
            if (r0 >= r7) goto L_0x00a5
            java.lang.Object r7 = r13.get(r0)     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r7 = (android.graphics.Point) r7     // Catch:{ all -> 0x00d6 }
            int r0 = r0 + 1
            int r8 = r0 % 4
            java.lang.Object r8 = r13.get(r8)     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r8 = (android.graphics.Point) r8     // Catch:{ all -> 0x00d6 }
            double r7 = r11.m140c(r7, r8)     // Catch:{ all -> 0x00d6 }
            double r5 = r5 + r7
            goto L_0x008c
        L_0x00a5:
            double r8 = f85aH     // Catch:{ all -> 0x00d6 }
            double r5 = r5 * r8
            r0 = r3
        L_0x00a9:
            if (r0 >= r7) goto L_0x00d2
            java.lang.Object r8 = r13.get(r0)     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r8 = (android.graphics.Point) r8     // Catch:{ all -> 0x00d6 }
            java.lang.Object r9 = r2.get(r0)     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r9 = (android.graphics.Point) r9     // Catch:{ all -> 0x00d6 }
            double r9 = r11.m140c(r8, r9)     // Catch:{ all -> 0x00d6 }
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            java.lang.Object r9 = r12.get(r0)     // Catch:{ all -> 0x00d6 }
            android.graphics.Point r9 = (android.graphics.Point) r9     // Catch:{ all -> 0x00d6 }
            double r8 = r11.m140c(r8, r9)     // Catch:{ all -> 0x00d6 }
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x00d1
            int r0 = r0 + 1
            goto L_0x00a9
        L_0x00d1:
            r3 = r4
        L_0x00d2:
            r1.dispose()
            return r3
        L_0x00d6:
            r12 = move-exception
            r1.dispose()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ImageProcessor.m133a(com.kofax.kmc.ken.engines.data.Image, java.util.Vector):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ErrorInfo m122a(Image image, Image.FriendI friendI) {
        ErrorInfo errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.KMC_SUCCESS;
        String imageMetaData = image.getImageMetaData();
        Integer imageDPI = image.getImageDPI();
        Image.ImageFileRep imageFileRep = image.getImageFileRep();
        try {
            errorInfo = image.imageReadFromFile();
        } catch (KmcRuntimeException e) {
            errorInfo = e.getErrorInfo();
        } catch (KmcException e2) {
            errorInfo = e2.getErrorInfo();
        }
        friendI.setImageMetaData(imageMetaData);
        friendI.setImageDPI(imageDPI);
        friendI.setImageFileRepresentation(imageFileRep);
        return errorInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m139b(Image image, Vector<Point> vector) {
        ShadowDetector shadowDetector = new ShadowDetector();
        shadowDetector.loadConfigurationString(this.f92aL, "ShadowDetection");
        shadowDetector.grabImageFrame(image.getImageBitmap());
        double detectShadows = shadowDetector.detectShadows(vector);
        shadowDetector.releaseFrame();
        return detectShadows > f83aF && detectShadows < f84aG;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m144e(Image image) {
        ShadowDetector shadowDetector = new ShadowDetector();
        shadowDetector.loadConfigurationString(this.f91aK, "ShadowDetection");
        shadowDetector.grabImageFrame(image.getImageBitmap());
        int averageLightness = shadowDetector.averageLightness();
        shadowDetector.releaseFrame();
        return ((double) averageLightness) < f86aI;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = com.kofax.kmc.ken.engines.service.ImageService.getCornersJsonFromMetaData(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m123a(android.graphics.Point r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            boolean r0 = r6.equals(r0, r0)
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = com.kofax.kmc.ken.engines.service.ImageService.getCornersJsonFromMetaData(r7)
            com.kofax.kmc.ken.engines.data.BoundingTetragon r1 = com.kofax.kmc.ken.engines.service.ImageService.getCornersTetragonFromJson(r0)
            if (r1 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00af
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "{ \"BLx\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getBottomLeft()
            int r3 = r3.x
            int r4 = r6.x
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"BLy\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getBottomLeft()
            int r3 = r3.y
            int r4 = r6.y
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"BRx\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getBottomRight()
            int r3 = r3.x
            int r4 = r6.x
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"BRy\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getBottomRight()
            int r3 = r3.y
            int r4 = r6.y
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"TLx\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getTopLeft()
            int r3 = r3.x
            int r4 = r6.x
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"TLy\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getTopLeft()
            int r3 = r3.y
            int r4 = r6.y
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"TRx\": "
            r2.append(r3)
            android.graphics.Point r3 = r1.getTopRight()
            int r3 = r3.x
            int r4 = r6.x
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r3 = ", \"TRy\": "
            r2.append(r3)
            android.graphics.Point r1 = r1.getTopRight()
            int r1 = r1.y
            int r6 = r6.y
            int r1 = r1 + r6
            r2.append(r1)
            java.lang.String r6 = " }"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r6 = r7.replace(r0, r6)
            return r6
        L_0x00af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ImageProcessor.m123a(android.graphics.Point, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m126a(BoundingTetragon boundingTetragon, String str) {
        String cornersJsonFromMetaData = ImageService.getCornersJsonFromMetaData(str);
        if (ImageService.getCornersTetragonFromJson(cornersJsonFromMetaData) == null || cornersJsonFromMetaData == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ \"BLx\": ");
        sb.append(boundingTetragon.getBottomLeft().x);
        sb.append(", \"BLy\": ");
        sb.append(boundingTetragon.getBottomLeft().y);
        sb.append(", \"BRx\": ");
        sb.append(boundingTetragon.getBottomRight().x);
        sb.append(", \"BRy\": ");
        sb.append(boundingTetragon.getBottomRight().y);
        sb.append(", \"TLx\": ");
        sb.append(boundingTetragon.getTopLeft().x);
        sb.append(", \"TLy\": ");
        sb.append(boundingTetragon.getTopLeft().y);
        sb.append(", \"TRx\": ");
        sb.append(boundingTetragon.getTopRight().x);
        sb.append(", \"TRy\": ");
        sb.append(boundingTetragon.getTopRight().y);
        sb.append(" }");
        return str.replace(cornersJsonFromMetaData, sb.toString());
    }

    /* renamed from: com.kofax.kmc.ken.engines.ImageProcessor$a */
    class C0429a {

        /* renamed from: bg */
        public ErrorInfo f120bg = ErrorInfo.KMC_SUCCESS;

        /* renamed from: bh */
        public boolean f121bh = false;

        public C0429a(ErrorInfo errorInfo, boolean z) {
            this.f120bg = errorInfo;
            this.f121bh = z;
        }
    }

    public class IpProgressClient implements IpLib.ProcessingProgressClient {
        public IpProgressClient() {
        }

        public void handleIpProgressUpdate(final int i, Object obj) {
            final ProcessPageOutRep processPageOutRep = (ProcessPageOutRep) obj;
            Handler handler = new Handler(Looper.getMainLooper());
            if (processPageOutRep.callbackOnWorkerThread) {
                ImageProcessor.this.mo10052a(ErrorInfo.KMC_SUCCESS, processPageOutRep.imageID, i);
            } else {
                handler.post(new Runnable() {
                    public void run() {
                        ImageProcessor.this.mo10052a(ErrorInfo.KMC_SUCCESS, processPageOutRep.imageID, i);
                    }
                });
            }
        }
    }

    public class QaProgressClient implements IpLib.ProcessingProgressClient {
        public QaProgressClient() {
        }

        public void handleIpProgressUpdate(final int i, Object obj) {
            final ProcessPageOutRep processPageOutRep = (ProcessPageOutRep) obj;
            Handler handler = new Handler(Looper.getMainLooper());
            if (processPageOutRep.callbackOnWorkerThread) {
                ImageProcessor.this.mo10057b(ErrorInfo.KMC_SUCCESS, processPageOutRep.imageID, i);
            } else {
                handler.post(new Runnable() {
                    public void run() {
                        ImageProcessor.this.mo10057b(ErrorInfo.KMC_SUCCESS, processPageOutRep.imageID, i);
                    }
                });
            }
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.ImageProcessor$b */
    class C0430b implements Callable<ImageService.EnhancementResults> {

        /* renamed from: aP */
        public ImagePerfectionProfile f123aP;

        /* renamed from: bh */
        public boolean f124bh;

        /* renamed from: bm */
        public ImageProcessorConfiguration f126bm;

        /* renamed from: bn */
        public Image f127bn;

        /* renamed from: bo */
        public ProcessPageOutRep f128bo;

        /* renamed from: bp */
        public IpLib.ProcessingProgressClient f129bp;

        /* renamed from: bq */
        private ImageService.EnhancementResults f130bq;
        /* access modifiers changed from: private */

        /* renamed from: br */
        public BoundingTetragon f131br;

        /* renamed from: bs */
        public Point f132bs;
        /* access modifiers changed from: private */

        /* renamed from: bt */
        public boolean f133bt;

        /* renamed from: bu */
        public float f134bu;
        public Image originalImage;

        private C0430b() {
            this.f123aP = null;
            this.f126bm = null;
            this.originalImage = null;
            this.f127bn = null;
            this.f124bh = false;
            this.f129bp = null;
            this.f130bq = null;
            this.f131br = null;
            this.f132bs = new Point();
            this.f133bt = false;
            this.f134bu = BitmapDescriptorFactory.HUE_RED;
        }

        /* synthetic */ C0430b(ImageProcessor imageProcessor, C04261 r2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.kofax.kmc.ken.engines.service.ImageService.EnhancementResults call() throws java.lang.Exception {
            /*
                r4 = this;
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep r0 = r4.f128bo
                com.kofax.kmc.ken.engines.data.Image r1 = r4.originalImage
                java.lang.String r1 = r1.getImageID()
                r0.imageID = r1
                com.kofax.kmc.ken.engines.data.ImagePerfectionProfile r0 = r4.f123aP
                if (r0 != 0) goto L_0x0018
                com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration r0 = r4.f126bm
                if (r0 != 0) goto L_0x0018
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_IP_NO_PROFILE
                goto L_0x00a0
            L_0x0018:
                boolean r0 = r4.f124bh
                if (r0 == 0) goto L_0x0040
                com.kofax.kmc.ken.engines.data.Image r0 = r4.originalImage
                android.graphics.Bitmap r0 = r0.getImageBitmap()
                if (r0 != 0) goto L_0x002d
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NOIMAGE
                java.lang.String r1 = "imageBitmap field is null"
                r0.setErrCause(r1)
                goto L_0x00a0
            L_0x002d:
                boolean r1 = r0.isRecycled()
                if (r1 == 0) goto L_0x003b
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NOIMAGE
                java.lang.String r1 = "imageBitmap has been recycled"
                r0.setErrCause(r1)
                goto L_0x00a0
            L_0x003b:
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = r4.m159c(r0)
                goto L_0x00a0
            L_0x0040:
                com.kofax.kmc.ken.engines.data.Image r0 = r4.originalImage
                java.lang.String r0 = r0.getImageFilePath()
                if (r0 != 0) goto L_0x004f
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILEPATH
                java.lang.String r2 = "imageFilePath field is null"
                r1.setErrCause(r2)
            L_0x004f:
                java.io.File r1 = new java.io.File
                r1.<init>(r0)
                boolean r0 = r1.exists()
                if (r0 != 0) goto L_0x005c
                com.kofax.kmc.kut.utilities.error.ErrorInfo r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NONEXISTENT_FILE
            L_0x005c:
                com.kofax.kmc.ken.engines.data.Image r0 = r4.originalImage
                android.graphics.Bitmap r0 = r0.getImageBitmap()
                com.kofax.kmc.ken.engines.data.Image$FriendI r1 = new com.kofax.kmc.ken.engines.data.Image$FriendI     // Catch:{ KmcException -> 0x0071 }
                com.kofax.kmc.ken.engines.data.Image r2 = r4.originalImage     // Catch:{ KmcException -> 0x0071 }
                java.lang.String r3 = "com.kofax"
                r1.<init>(r3)     // Catch:{ KmcException -> 0x0071 }
                r1.clearBitmapWithoutRecycle()     // Catch:{ KmcException -> 0x006f }
                goto L_0x0077
            L_0x006f:
                r2 = move-exception
                goto L_0x0074
            L_0x0071:
                r1 = move-exception
                r2 = r1
                r1 = 0
            L_0x0074:
                r2.printStackTrace()
            L_0x0077:
                com.kofax.kmc.ken.engines.ImageProcessor r2 = com.kofax.kmc.ken.engines.ImageProcessor.this
                com.kofax.kmc.ken.engines.data.Image r3 = r4.originalImage
                com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = r2.m122a((com.kofax.kmc.ken.engines.data.Image) r3, (com.kofax.kmc.ken.engines.data.Image.FriendI) r1)
                com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_SUCCESS
                if (r2 == r3) goto L_0x008a
                com.kofax.kmc.kut.utilities.error.ErrorInfo r3 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_ALTERNATE_FILEIO_ENGINE
                if (r2 != r3) goto L_0x0088
                goto L_0x008a
            L_0x0088:
                r0 = r2
                goto L_0x00a0
            L_0x008a:
                com.kofax.kmc.ken.engines.data.Image r2 = r4.originalImage
                android.graphics.Bitmap r2 = r2.getImageBitmap()
                com.kofax.kmc.kut.utilities.error.ErrorInfo r2 = r4.m159c(r2)
                if (r0 != 0) goto L_0x009c
                com.kofax.kmc.ken.engines.data.Image r0 = r4.originalImage
                r0.imageClearBitmap()
                goto L_0x0088
            L_0x009c:
                r1.setImageBitmapInternal(r0)
                goto L_0x0088
            L_0x00a0:
                com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults r1 = r4.f130bq
                if (r1 != 0) goto L_0x00ab
                com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults r1 = new com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults
                r1.<init>(r0)
                r4.f130bq = r1
            L_0x00ab:
                com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults r0 = r4.f130bq
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ImageProcessor.C0430b.call():com.kofax.kmc.ken.engines.service.ImageService$EnhancementResults");
        }

        /* renamed from: c */
        private ErrorInfo m159c(Bitmap bitmap) {
            Integer num;
            Bitmap bitmap2;
            ImagePerfectionProfile imagePerfectionProfile;
            Bitmap bitmap3 = bitmap;
            if (this.f133bt) {
                return ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS;
            }
            QuickAnalysisSettings quickAnalysisSettings = this.f128bo.quickAnalysisSettings;
            C0432d dVar = new C0432d(this.f123aP, this.f126bm);
            if (quickAnalysisSettings != null && quickAnalysisSettings.getBlurDetection()) {
                System.loadLibrary("gnustl_shared");
                System.loadLibrary("opencv_java3");
                System.loadLibrary("XVrs");
                XVrsImage xVrsImage = new XVrsImage(bitmap3);
                this.f134bu = new XVrsBlur().detect(xVrsImage);
                xVrsImage.dispose();
            }
            ImagePerfectionProfile imagePerfectionProfile2 = this.f123aP;
            if ((imagePerfectionProfile2 != null && imagePerfectionProfile2.getUseTargetFrameCrop() == ImagePerfectionProfile.UseTargetFrameCrop.ON) || ((quickAnalysisSettings != null && quickAnalysisSettings.getUseTargetFrameCrop() == ImagePerfectionProfile.UseTargetFrameCrop.ON) || (this.f126bm != null && TargetFrameCropType.TARGET_FRAME_CROP_ON.equals(this.f126bm.targetFrameCropType)))) {
                Point point = new Point();
                bitmap3 = m156a(bitmap3, point);
                this.f132bs.x += point.x;
                this.f132bs.y += point.y;
            }
            if ((this.f126bm == null && dVar.contains(ImageProcessor.f88az)) || (((imagePerfectionProfile = this.f123aP) != null && imagePerfectionProfile.getUseDocumentDetectionBasedCrop() == ImagePerfectionProfile.UseDocumentDetectionBasedCrop.ON) || m160q())) {
                C0669c.C0670a i = ImageProcessor.this.f90aE.mo11599i(bitmap3);
                Bitmap bitmap4 = i.bitmap;
                if (i.f1593Ho != null) {
                    this.f132bs.x += i.f1593Ho.left;
                    this.f132bs.y += i.f1593Ho.top;
                }
                bitmap3 = bitmap4;
            }
            boolean z = false;
            Integer num2 = null;
            if (this.f126bm != null) {
                C0796f fVar = new C0796f();
                C0797g a = fVar.mo11938a(this.f126bm, bitmap3);
                Bitmap processedImage = a.getProcessedImage();
                this.f131br = a.getBounds();
                if (a.mo11942lR()) {
                    this.f126bm.documentDimensions = null;
                    Integer num3 = this.f126bm.outputDPI;
                    if (num3 != null && num3.intValue() > 0) {
                        this.f126bm.outputDPI = 0;
                        num2 = num3;
                    }
                }
                fVar.doCleanUp();
                num = num2;
                bitmap2 = processedImage;
            } else {
                bitmap2 = bitmap3;
                num = null;
            }
            if (this.f133bt) {
                return ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS;
            }
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            this.f127bn = new Image();
            try {
                Image.FriendI friendI = new Image.FriendI(BuildConfig.APPLICATION_ID);
                Image.FriendI friendI2 = new Image.FriendI(BuildConfig.APPLICATION_ID);
                friendI2.setImageOriginalDateTime(friendI.getImageOriginalDateTime());
                friendI2.setImageLatitude(this.originalImage.getImageLatitude());
                friendI2.setImageLongitude(this.originalImage.getImageLongitude());
                this.f128bo.exifMetadataStr = ImageService.createMetadataFromImage(this.f127bn, Image.FileRestriction.NONE);
                if (this.f123aP != null) {
                    friendI2.setImagePerfectProfileUsed(this.f123aP);
                } else if (ImageProcessor.this.f97aQ != null) {
                    friendI2.setBasicSettingsProfileUsed(ImageProcessor.this.f97aQ);
                }
            } catch (KmcException e) {
                errorInfo = e.getErrorInfo();
            }
            this.f127bn.setTargetFrame(this.originalImage.getTargetFrame());
            boolean z2 = dVar.contains(IpLib.DO_RECOGNIZE_TEXT_MP) || dVar.contains("_DoRemoveGraphicLines_") || dVar.contains("_DoFindTextHP_") || dVar.contains("_UseLargeMetadataBuffer_");
            if (dVar.contains("_DoPreview_2") || dVar.contains("_DoPreview_4") || dVar.contains("_DoPreview_6")) {
                z = true;
            }
            int i2 = z2 ? 102400 : 10240;
            if (z) {
                try {
                    this.f128bo.imageRep = Image.ImageRep.IMAGE_REP_NONE;
                } catch (KmcException e2) {
                    return e2.getErrorInfo();
                } catch (KmcRuntimeException e3) {
                    return e3.getErrorInfo();
                }
            }
            if (this.f133bt) {
                return ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS;
            }
            this.f130bq = ImageService.enhanceImage(bitmap2, this.f123aP, this.f126bm, (BoundingTetragon) null, this.originalImage, i2, this.f128bo, this.f129bp, this.f127bn, num);
            return errorInfo;
        }

        /* renamed from: a */
        private Bitmap m156a(Bitmap bitmap, Point point) {
            if (this.originalImage.getTargetFrame() == null) {
                return bitmap;
            }
            Rect targetFrame = this.originalImage.getTargetFrame();
            C0767k.m1792D(String.format(Locale.US, "targetFrameCrop (x: %d  y: %d, w: %d h: %d)", new Object[]{Integer.valueOf(targetFrame.left), Integer.valueOf(targetFrame.top), Integer.valueOf(targetFrame.width()), Integer.valueOf(targetFrame.height())}));
            int i = targetFrame.left;
            int i2 = targetFrame.left;
            int width = targetFrame.width();
            int i3 = targetFrame.top;
            int i4 = targetFrame.top;
            int height = targetFrame.height();
            int max = Math.max(0, i);
            int max2 = Math.max(0, i3);
            int min = Math.min(bitmap.getWidth(), i2 + width);
            int min2 = Math.min(bitmap.getHeight(), i4 + height);
            if (point != null) {
                point.set(max, max2);
            }
            return Bitmap.createBitmap(bitmap, max, max2, min - max, min2 - max2);
        }

        /* renamed from: q */
        private boolean m160q() {
            QuickAnalysisSettings quickAnalysisSettings = this.f128bo.quickAnalysisSettings;
            return quickAnalysisSettings != null && quickAnalysisSettings.getUseDocumentDetectionBasedCrop() == ImagePerfectionProfile.UseDocumentDetectionBasedCrop.ON;
        }
    }

    /* renamed from: l */
    private void m148l() {
        if (!Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_PROCESSING)) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_LICENSE_IMAGE_PROCESSING);
        }
    }

    /* renamed from: a */
    private void m129a(Object obj, String str) {
        if (obj != null) {
            boolean z = false;
            if ((obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) || (obj.getClass().getSimpleName().equals("Float") && ((Float) obj).floatValue() < BitmapDescriptorFactory.HUE_RED)) {
                z = true;
            }
            if (z) {
                ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
                StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(str);
                sb.append("' parameter is negative");
                errorInfo.setErrCause(sb.toString());
                throw new KmcRuntimeException(errorInfo);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(str);
        sb2.append("' parameter is null");
        throw new NullPointerException(sb2.toString());
    }

    /* renamed from: com.kofax.kmc.ken.engines.ImageProcessor$1 */
    static /* synthetic */ class C04261 {

        /* renamed from: bd */
        static final /* synthetic */ int[] f109bd;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.kmc.kut.utilities.error.ErrorInfo[] r0 = com.kofax.kmc.kut.utilities.error.ErrorInfo.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f109bd = r0
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_FILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f109bd     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_NONEXISTENT_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f109bd     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_GN_OUT_OF_MEMORY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f109bd     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_STILL_REMAINS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f109bd     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_ED_FILE_EXISTS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f109bd     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.kofax.kmc.kut.utilities.error.ErrorInfo r1 = com.kofax.kmc.kut.utilities.error.ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.ImageProcessor.C04261.<clinit>():void");
        }
    }

    /* renamed from: a */
    private boolean m135a(ErrorInfo errorInfo) {
        switch (C04261.f109bd[errorInfo.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m */
    private TaskRunner m149m() {
        if (this.f106aZ == null) {
            this.f106aZ = new TaskRunner(1);
        }
        return this.f106aZ;
    }

    /* renamed from: f */
    private C0429a m145f(Image image) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        boolean z = false;
        boolean z2 = image.getImageBitmapScaling().floatValue() < 1.0f;
        if (f89bb != 0) {
            errorInfo = ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY;
        } else if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BITMAP) {
            if (z2) {
                errorInfo = ErrorInfo.KMC_IP_NO_REPRESENTATION;
                errorInfo.setErrCause("Only representation is bitmap but it is scaled down");
            } else {
                z = true;
            }
        } else if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE) {
            if (image.getImageFileRep() == Image.ImageFileRep.FILE_BUFFERED) {
                errorInfo = ErrorInfo.KMC_IP_FILE_AND_BUFFERED_REPRESENTATION;
            }
        } else if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_BOTH) {
            z = !z2;
        } else {
            errorInfo = ErrorInfo.KMC_IP_NO_REPRESENTATION;
        }
        if (errorInfo == ErrorInfo.KMC_SUCCESS) {
            if (!z) {
                String imageFilePath = image.getImageFilePath();
                if (imageFilePath == null) {
                    errorInfo = ErrorInfo.KMC_ED_FILEPATH;
                    errorInfo.setErrCause("imageFilePath field is null");
                } else if (!new File(imageFilePath).exists()) {
                    errorInfo = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                }
            } else if (image.getImageBitmap() == null) {
                errorInfo = ErrorInfo.KMC_ED_NOIMAGE;
                errorInfo.setErrCause("imageBitmap field is null");
            }
        }
        return new C0429a(errorInfo, z);
    }

    /* renamed from: g */
    private String m146g(Image image) {
        if (!image.getImageMetaData().isEmpty()) {
            return image.getImageMetaData();
        }
        return (image.getImageLatitude() == null || image.getImageLongitude() == null) ? "" : ImageService.createGPSMetadata(image);
    }

    /* renamed from: a */
    private ProcessPageOutRep m118a(boolean z, boolean z2) {
        ProcessPageOutRep processPageOutRep = new ProcessPageOutRep();
        processPageOutRep.setQuickAnalysisMode(z, z2);
        processPageOutRep.callbackOnWorkerThread = getListenerCallbackThreadType() == ListenerCallbackThreadType.WORKER_THREAD;
        if (!z) {
            processPageOutRep.setImageMimeType(getProcessedImageMimeType());
            processPageOutRep.setImageRep(getProcessedImageRepresentation());
            processPageOutRep.processedFilePathStr = getProcessedImageFilePath();
            processPageOutRep.processedImageJpegQuality = getProcessedImageJpegQuality();
        }
        return processPageOutRep;
    }

    /* renamed from: a */
    private ProcessPageOutRep m119a(boolean z, boolean z2, QuickAnalysisSettings quickAnalysisSettings) {
        ProcessPageOutRep a = m118a(z, z2);
        a.setQuickAnalysisSettings(quickAnalysisSettings);
        return a;
    }

    /* renamed from: a */
    private void m128a(Image image, boolean z, boolean z2, QuickAnalysisSettings quickAnalysisSettings, ImageProcessorConfiguration imageProcessorConfiguration) throws KmcException {
        IpLib.ProcessingProgressClient processingProgressClient;
        Image image2 = image;
        boolean z3 = z;
        boolean z4 = z2;
        ImageProcessorConfiguration imageProcessorConfiguration2 = imageProcessorConfiguration;
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        C0429a f = m145f(image);
        ErrorInfo errorInfo2 = f.f120bg;
        if (!z3) {
            if (ErrorInfo.KMC_SUCCESS == errorInfo2 && this.f97aQ == null && this.f96aP == null && imageProcessorConfiguration2 == null) {
                errorInfo2 = ErrorInfo.KMC_IP_NO_PROFILE;
            }
            if (ErrorInfo.KMC_SUCCESS == errorInfo2 && (this.f98aR == Image.ImageRep.IMAGE_REP_FILE || this.f98aR == Image.ImageRep.IMAGE_REP_BOTH)) {
                if (this.f100aT == Image.ImageMimeType.MIMETYPE_UNKNOWN) {
                    errorInfo2 = ErrorInfo.KMC_ED_MIMETYPE;
                    errorInfo2.setErrCause("processedImageMimeType set to MIMETYPE_UNKNOWN");
                } else if (ModifyQuickTopUpReviewActivity.write(this.f99aS)) {
                    errorInfo2 = ErrorInfo.KMC_ED_FILEPATH;
                    errorInfo2.setErrCause("processedImageFilePath field is whitespace, empty, or null");
                } else {
                    File file = new File(this.f99aS);
                    if (file.getParentFile() == null || !file.getParentFile().exists()) {
                        errorInfo2 = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                        errorInfo2.setErrCause("File path is incorrect");
                    } else if (!file.getParentFile().exists()) {
                        errorInfo2 = ErrorInfo.KMC_GN_FILE_NOT_FOUND;
                        StringBuilder sb = new StringBuilder();
                        sb.append("processedImageFilePath parent directory");
                        sb.append(file.getParent());
                        sb.append(" does not exist");
                        errorInfo2.setErrCause(sb.toString());
                    } else if (file.exists()) {
                        errorInfo2 = ErrorInfo.KMC_ED_FILE_EXISTS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("processedImageFilePath ");
                        sb2.append(file.getAbsolutePath());
                        sb2.append(" already exists");
                        errorInfo2.setErrCause(sb2.toString());
                    }
                }
            }
        }
        if (errorInfo2 == ErrorInfo.KMC_SUCCESS) {
            this._bus.post(new C0993b(image2));
            this.f107ba = new C0430b(this, (C04261) null);
            boolean z5 = false;
            if (z3) {
                ImagePerfectionProfile imagePerfectionProfile = new ImagePerfectionProfile();
                if (z4) {
                    imagePerfectionProfile.setIpOperations("_DeviceType_2__DoPreview__LoadSetting_<Property Name=\"CSkewDetect.do_blur_check.Bool\" Value=\"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.side_angle_diff_thr.double\" Value=\"50.0\" Comment=\"DEFAULT 1\" />_LoadSetting_<Property Name=\"CSkewDetect.Undersaturated_Threshold.Int\" Value=\"18.0\"/>_LoadSetting_<Property Name=\"CSkewDetect.Undersaturation_Count_Perc_Threshold.Int\" Value=\"49.0\"/>");
                } else {
                    imagePerfectionProfile.setIpOperations("_DeviceType_2__DoPreview_6_LoadSetting_<Property Name=\"CSkewDetect.do_blur_check.Bool\" Value=\"0\"/>_LoadSetting_<Property Name=\"CSkewDetect.side_angle_diff_thr.double\" Value=\"50.0\" Comment=\"DEFAULT 1\" />_LoadSetting_<Property Name=\"CSkewDetect.Undersaturated_Threshold.Int\" Value=\"18.0\"/>_LoadSetting_<Property Name=\"CSkewDetect.Undersaturation_Count_Perc_Threshold.Int\" Value=\"49.0\"/>");
                }
                if (quickAnalysisSettings.getUseMRZPassportDetection() == ImagePerfectionProfile.UseMRZPassportDetection.ON) {
                    imagePerfectionProfile.setUseMRZPassportDetection(ImagePerfectionProfile.UseMRZPassportDetection.ON);
                }
                this.f107ba.f123aP = imagePerfectionProfile;
            } else {
                if (getBasicSettingsProfile() != null) {
                    BasicSettingsProfile basicSettingsProfile = getBasicSettingsProfile();
                    String finalOpString = new BasicSettingsProfile.FriendBSP(BuildConfig.APPLICATION_ID).toFinalOpString();
                    if (basicSettingsProfile.getCropType() == BasicSettingsProfile.CropType.CROP_QUICKANALYSIS) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(finalOpString);
                        sb3.append(m147h(image));
                        finalOpString = sb3.toString();
                    }
                    if (imageProcessorConfiguration2 == null && basicSettingsProfile.getCropType() == BasicSettingsProfile.CropType.CROP_TETRAGON) {
                        ImagePerfectionProfile imagePerfectionProfile2 = new ImagePerfectionProfile();
                        imagePerfectionProfile2.setIpOperations(finalOpString);
                        this.f107ba.f123aP = imagePerfectionProfile2;
                        this.f107ba.f126bm = null;
                    } else {
                        this.f107ba.f126bm = new ImageProcessorConfiguration(finalOpString);
                    }
                }
                if (getImagePerfectionProfile() != null) {
                    ImagePerfectionProfile imagePerfectionProfile3 = getImagePerfectionProfile();
                    String finalOpString2 = new ImagePerfectionProfile.FriendIPP(BuildConfig.APPLICATION_ID).toFinalOpString();
                    if (finalOpString2.contains(f79aA) || finalOpString2.contains(f80aB) || finalOpString2.contains(f81aC)) {
                        this.f107ba.f123aP = imagePerfectionProfile3;
                    } else {
                        this.f107ba.f126bm = new ImageProcessorConfiguration(finalOpString2.replaceAll(f82aD, "").replaceAll(f88az, ""));
                        if (imagePerfectionProfile3.getUseTargetFrameCrop() == ImagePerfectionProfile.UseTargetFrameCrop.ON) {
                            this.f107ba.f126bm.targetFrameCropType = TargetFrameCropType.TARGET_FRAME_CROP_ON;
                        }
                    }
                }
                if (imageProcessorConfiguration2 != null) {
                    String str = C0793c.m1872a(imageProcessorConfiguration).ippString;
                    if (str.contains(f80aB) || str.contains(f81aC) || str.contains(f79aA)) {
                        this.f107ba.f123aP = new ImagePerfectionProfile();
                        this.f107ba.f123aP.setIpOperations(C0793c.m1873a(imageProcessorConfiguration2, true, false).ippString);
                        this.f107ba.f126bm = null;
                    } else {
                        this.f107ba.f126bm = imageProcessorConfiguration2;
                    }
                }
            }
            if (this.f107ba.f123aP != null) {
                String str2 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Op String:");
                sb4.append(this.f107ba.f123aP.getIpOperations());
                C0767k.m1807c(str2, sb4.toString());
            }
            this.f107ba.originalImage = image2;
            this.f107ba.f124bh = f.f121bh;
            this.f107ba.f128bo = m119a(z3, z4, quickAnalysisSettings);
            if (z3) {
                processingProgressClient = new QaProgressClient();
            } else {
                processingProgressClient = new IpProgressClient();
            }
            this.f107ba.f129bp = processingProgressClient;
            TaskRunner m = m149m();
            C0431c cVar = new C0431c(this.f107ba);
            ImageProcessor unused = cVar.f138bw = this;
            ProcessPageOutRep unused2 = cVar.f136bo = this.f107ba.f128bo;
            TaskRunner taskRunner = this.f106aZ;
            C0430b bVar = this.f107ba;
            if (this.f101aU == ListenerCallbackThreadType.UI_THREAD) {
                z5 = true;
            }
            taskRunner.addOnTaskCompletedListener(cVar, bVar, z5);
            f89bb = m.submit(this.f107ba);
        } else if (m135a(errorInfo2)) {
            throw new KmcException(errorInfo2);
        } else {
            throw new KmcRuntimeException(errorInfo2);
        }
    }

    /* renamed from: com.kofax.kmc.ken.engines.ImageProcessor$d */
    static class C0432d {

        /* renamed from: bx */
        private final String f139bx;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0432d(ImagePerfectionProfile imagePerfectionProfile, ImageProcessorConfiguration imageProcessorConfiguration) {
            this(imagePerfectionProfile == null ? C0793c.m1872a(imageProcessorConfiguration).ippString : imagePerfectionProfile.getIpOperations());
        }

        public C0432d(String str) {
            this.f139bx = (str == null ? "" : str).toLowerCase(Locale.US);
        }

        public boolean contains(String str) {
            return this.f139bx.contains(str.toLowerCase(Locale.US));
        }
    }

    /* renamed from: h */
    private static String m147h(Image image) {
        QuickAnalysisFeedback imageQuickAnalysisFeedBack = image.getImageQuickAnalysisFeedBack();
        StringBuilder sb = new StringBuilder("");
        if (imageQuickAnalysisFeedBack != null) {
            try {
                try {
                    BoundingTetragon.FriendBT friendBT = new BoundingTetragon.FriendBT(BuildConfig.APPLICATION_ID);
                    sb.append(IpLib.DO_CROP_CORRECTION);
                    sb.append(friendBT.toExtCornersOpString("_LoadSetting_"));
                } catch (KmcException e) {
                    C0767k.m1823e(e);
                }
            } catch (KmcException e2) {
                C0767k.m1823e(e2);
            }
        }
        return sb.toString();
    }
}
