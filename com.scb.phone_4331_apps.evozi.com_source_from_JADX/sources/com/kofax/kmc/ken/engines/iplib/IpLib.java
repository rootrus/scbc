package com.kofax.kmc.ken.engines.iplib;

import android.graphics.Bitmap;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;

public class IpLib {
    public static final String DO_90_DEGREE_ROTATION = "_Do90DegreeRotation_";
    public static final String DO_BACKGROUND_SMOOTHING = "_DoBackgroundSmoothing_";
    public static final String DO_BARCODE_DETECTION = "_DoBarcodeDetection_";
    public static final String DO_BINARIZATION = "_DoBinarization_";
    public static final String DO_BLANK_PAGE_DETECTION = "_DoBlankPageDetection_";
    public static final String DO_BLUR_AND_ILLUMINATION_CHECK = "_DoBlurAndIlluminationCheck_";
    public static final String DO_COLOR_DETECTION = "_DoColorDetection_";
    public static final String DO_CONTOUR_CLEANING = "_DoContourCleaning_";
    public static final String DO_CROP_CORRECTION = "_DoCropCorrection_";
    public static final String DO_DESPECK = "_DoDespeck_";
    public static final String DO_EDGE_CLEANUP = "_DoEdgeCleanup_";
    public static final String DO_ENHANCED_BINARIZATION = "_DoEnhancedBinarization_";
    public static final String DO_FIND_TEXT_LINES = "_DoFindTextLines_";
    public static final String DO_GRAY_OUTPUT = "_DoGrayOutput_";
    public static final String DO_HEALTH_ANALYSIS = "_DoHealthAnalysis_";
    public static final String DO_HOLE_FILL = "_DoHoleFill_";
    public static final String DO_ILLUMINATION_CORRECTION = "_DoIlluminationCorrection_";
    public static final String DO_MERGE_FRONT_BACK = "_DoMergeFrontBack_";
    public static final String DO_PREVIEW = "_DoPreview_";
    public static final String DO_RECOGNIZE_TEXT_MP = "_DoRecognizeTextMP_";
    public static final String DO_RECTANGULARIZATION = "_DoRectangularization_";
    public static final String DO_RECTANGULARIZATION_DETECTION = "_DoRectangularizationDetection_";
    public static final String DO_SCALE_IMAGE_TO_DPI = "_DoScaleImageToDPI_";
    public static final String DO_SCANNER_BKG_FILL = "_DoScannerBkgFill_";
    public static final String DO_SHARPEN = "_DoSharpen_";
    public static final String DO_SKEW_CORRECTION_ALT = "_DoSkewCorrectionAlt_";
    public static final String DO_SKEW_CORRECTION_PAGE = "_DoSkewCorrectionPage_";
    private static IpLib instance = null;
    protected int mInitResult;

    public interface ProcessingProgressClient {
        void handleIpProgressUpdate(int i, Object obj);
    }

    public native int nativeAllocateFileBuffer(int i, IpFileBuffer ipFileBuffer);

    public native int nativeCancelProcessing();

    public native int nativeCreateImage(IpImage ipImage, Bitmap bitmap);

    public native int nativeCreateImageFromRaw(IpImage ipImage, byte[] bArr, int i, int i2);

    public native int nativeFillBitmap(Bitmap bitmap, IpImage ipImage);

    public native String nativeGetVersion();

    public native int nativeInit(String str);

    public native int nativeInitImage(IpImage ipImage);

    public native int nativeProcessPage(ProcessPageResults processPageResults, IpImage ipImage, String str, ProcessPageOutRep processPageOutRep, int i, ProcessingProgressClient processingProgressClient, Object obj);

    public native int nativeReadImageFile(IpImage ipImage, String str, float f, IpImageMetadata ipImageMetadata);

    public native int nativeReadImageFromFileBuffer(IpImage ipImage, float f, IpFileBuffer ipFileBuffer);

    public native int nativeReleaseFileBuffer(IpFileBuffer ipFileBuffer);

    public native void nativeReleaseImage(IpImage ipImage);

    public native void nativeSetOutputFilePath(String str);

    public native void nativeShutdown();

    public native int nativeWriteImageToFileBuffer(IpImage ipImage, IpFileBuffer ipFileBuffer);

    public native int nativeWriteJpegImage(IpImage ipImage, int i, String str);

    public native int nativeWriteJpegImageWithMetaData(IpImage ipImage, int i, String str, String str2);

    public native int nativeWritePngImage(IpImage ipImage, String str);

    public native int nativeWriteTiffImage(IpImage ipImage, int i, String str);

    public native int nativeWriteTiffImageWithMetaData(IpImage ipImage, int i, String str, String str2);

    public int retrieveFileBufferBytes(IpFileBuffer ipFileBuffer) {
        return 0;
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
        System.loadLibrary("EvrsJniWrapper");
    }

    protected IpLib() {
    }

    public static void resetSingleton() {
        synchronized (IpLib.class) {
            instance = null;
        }
    }

    public static IpLib getInstance() throws KmcException {
        IpLib ipLib;
        synchronized (IpLib.class) {
            if (instance == null) {
                if (IpLibUtil.isIpLicensed()) {
                    instance = new IpLib();
                } else {
                    throw new KmcException(ErrorInfo.KMC_EV_LICENSING);
                }
            }
            ipLib = instance;
        }
        return ipLib;
    }

    /* access modifiers changed from: protected */
    public int init(String str) {
        return nativeInit(str);
    }

    public String getIpVersion() {
        return nativeGetVersion();
    }

    public void shutdown() {
        nativeShutdown();
    }

    public void setOutputFilePath(String str) {
        nativeSetOutputFilePath(str);
    }

    public int initImage(IpImage ipImage) {
        return nativeInitImage(ipImage);
    }

    public int createImage(IpImage ipImage, Bitmap bitmap, int i, int i2, int i3, int i4) {
        ipImage.mChannels = i;
        ipImage.mBitDepth = i2;
        ipImage.mDpiX = i3;
        ipImage.mDpiY = i4;
        if (bitmap.isRecycled()) {
            return IpLibUtil.EVRSJNI_EXCEPTION_CALLING_GETPIXELS;
        }
        return nativeCreateImage(ipImage, bitmap);
    }

    public int createImageRaw(IpImage ipImage, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        ipImage.mChannels = i;
        ipImage.mBitDepth = i2;
        ipImage.mDpiX = i5;
        ipImage.mDpiY = i6;
        return nativeCreateImageFromRaw(ipImage, bArr, i3, i4);
    }

    public void releaseImage(IpImage ipImage) {
        nativeReleaseImage(ipImage);
    }

    public Bitmap createBitmap(IpImage ipImage) {
        Bitmap createBitmap = Bitmap.createBitmap(ipImage.mWidth, ipImage.mHeight, Bitmap.Config.ARGB_8888);
        nativeFillBitmap(createBitmap, ipImage);
        createBitmap.setDensity(ipImage.getDpiX());
        return createBitmap;
    }

    public int writeJpegImage(IpImage ipImage, int i, String str) {
        return nativeWriteJpegImage(ipImage, i, str);
    }

    public int writeJpegImage(IpImage ipImage, int i, String str, String str2) {
        return nativeWriteJpegImageWithMetaData(ipImage, i, str, str2);
    }

    public int writeToFileBuffer(byte[] bArr, IpFileBuffer ipFileBuffer) {
        int nativeAllocateFileBuffer = nativeAllocateFileBuffer(bArr.length, ipFileBuffer);
        if (nativeAllocateFileBuffer == 0) {
            ipFileBuffer.mByteBuffer.put(bArr);
            ipFileBuffer.mByteBuffer.flip();
        }
        return nativeAllocateFileBuffer;
    }

    public int writeImageToFileBuffer(IpImage ipImage, IpFileBuffer ipFileBuffer) {
        ipFileBuffer.mHeight = ipImage.getHeight();
        ipFileBuffer.mWidth = ipImage.getWidth();
        return nativeWriteImageToFileBuffer(ipImage, ipFileBuffer);
    }

    public int writeTiffImage(IpImage ipImage, int i, String str) {
        return nativeWriteTiffImage(ipImage, i, str);
    }

    public int writeTiffImage(IpImage ipImage, int i, String str, String str2) {
        return nativeWriteTiffImageWithMetaData(ipImage, i, str, str2);
    }

    public int writePngImage(IpImage ipImage, String str) {
        return nativeWritePngImage(ipImage, str);
    }

    public int readImageFile(IpImage ipImage, String str, float f, IpImageMetadata ipImageMetadata) {
        return nativeReadImageFile(ipImage, str, f, ipImageMetadata);
    }

    public int readImageFromFileBuffer(IpImage ipImage, float f, IpFileBuffer ipFileBuffer) {
        return nativeReadImageFromFileBuffer(ipImage, f, ipFileBuffer);
    }

    public int releaseFileBuffer(IpFileBuffer ipFileBuffer) {
        return nativeReleaseFileBuffer(ipFileBuffer);
    }

    public int processPage(ProcessPageResults processPageResults, IpImage ipImage, String str, ProcessPageOutRep processPageOutRep, int i, ProcessingProgressClient processingProgressClient, Object obj) {
        if (processPageResults.processedImg.mJniImageHandle == -1) {
            nativeInitImage(processPageResults.processedImg);
        }
        return nativeProcessPage(processPageResults, ipImage, str, processPageOutRep, i, processingProgressClient, obj);
    }

    public int processPage(ProcessPageResults processPageResults, IpImage ipImage, String str, ProcessPageOutRep processPageOutRep, int i, ProcessingProgressClient processingProgressClient) {
        return processPage(processPageResults, ipImage, str, processPageOutRep, i, processingProgressClient, (Object) null);
    }

    public int processPage(ProcessPageResults processPageResults, IpImage ipImage, String str, ProcessPageOutRep processPageOutRep, int i) {
        return processPage(processPageResults, ipImage, str, processPageOutRep, i, (ProcessingProgressClient) null, (Object) null);
    }

    public int cancelProcessing() {
        return nativeCancelProcessing();
    }
}
