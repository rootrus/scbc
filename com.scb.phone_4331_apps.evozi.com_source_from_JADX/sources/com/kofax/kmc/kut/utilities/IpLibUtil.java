package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.HashMap;

public class IpLibUtil {
    public static final int EVRSJNI_ALLOC_IMAGE_DATA_FAILED = -9998;
    public static final int EVRSJNI_EXCEPTION_CALLING_GETPIXELS = -9920;
    public static final int EVRSJNI_IMAGE_CREATED_IS_NOT_BITONAL = -9900;
    public static final int EVRSJNI_IMAGE_CREATED_IS_NOT_GRAY = -9901;
    public static final int EVRSJNI_INVALID_IPIMAGE_INDEX = -9997;
    public static final int EVRSJNI_NO_FREE_IMAGE_AVAIL = -9999;
    public static final int KIPP_BAD_FILE_FORMAT_INTERNALS = -14;
    public static final int KIPP_BAD_FILE_TO_APPEND_TO = -15;
    public static final int KIPP_BAD_HANDLE = -23;
    public static final int KIPP_BAD_HISTOGRAM = -101;
    public static final int KIPP_BAD_PDF = -17;
    public static final int KIPP_BAD_POINTER = -102;
    public static final int KIPP_BAD_SPEED_ACCURACY_ERROR = -20;
    public static final int KIPP_BARCODE_DRIVER_FAIL = -104;
    public static final int KIPP_CANNOT_APPEND_TO_FILETYPE = -16;
    public static final int KIPP_ENCRYPTED_APPEND_ERROR = -18;
    public static final int KIPP_FILE_METADATA_ERROR = -22;
    public static final int KIPP_IMAGE_DOES_NOT_EXIST = -13;
    public static final int KIPP_INCONSISTENT_BW_TRANSITIONS_ERROR = -66;
    public static final int KIPP_IP_BAD_CHANNEL_ERROR = -6;
    public static final int KIPP_IP_BAD_DPI_ERROR = -3;
    public static final int KIPP_IP_BAD_EXTERNAL_PAGE = -88;
    public static final int KIPP_IP_BAD_LINEWIDTH_ERROR = -5;
    public static final int KIPP_IP_BAD_WIDTH_HEIGHT_ERROR = -4;
    public static final int KIPP_IP_FILE_IO_ACCESS_BUSY = -1003;
    public static final int KIPP_IP_FILE_OPEN_ERROR = -2;
    public static final int KIPP_IP_FILE_READ_ERROR = -8;
    public static final int KIPP_IP_IMAGE_PARAM_ERROR = -9;
    public static final int KIPP_IP_IMAGE_PROCESSING_ERROR = -10;
    public static final int KIPP_IP_IMAGE_WRITE_ERROR = -11;
    public static final int KIPP_IP_LICENSE_EXPIRATION_ERROR = -1001;
    public static final int KIPP_IP_LICENSING_FAILURE = -1000;
    public static final int KIPP_IP_MEMORY_ALLOC_ERROR = -1;
    public static final int KIPP_IP_SUCCESS = 0;
    public static final int KIPP_METADATA_OVERFLOW = -7;
    public static final int KIPP_OPERATIONS_STRING_ERROR = -1007;
    public static final int KIPP_PDF_TOO_LARGE_TO_APPEND = -19;
    public static final int KIPP_READING_USER_NETWORK_ERROR = -21;
    public static final int KIPP_UNKNOWN_FILETYPE = -12;
    public static final int KIPP_USER_ABORT = -1005;
    public static IpErrHashMap<Integer, ErrorInfo> ipErrHashMap = new IpErrHashMap<>(ErrorInfo.KMC_GN_UNKNOWN_ERROR);

    private static native String nativeGetPermissions();

    private static native String nativeGetVersion();

    private static native int nativeInit(String str);

    private static native int nativeIsLicensed();

    public static class IpErrHashMap<K, V> extends HashMap<K, V> {
        private static final long serialVersionUID = -2662920799829846535L;
        protected V defaultValue;

        public IpErrHashMap(V v) {
            this.defaultValue = v;
        }

        public V get(Object obj) {
            V v = super.get(obj);
            return (v != null || containsKey(obj)) ? v : this.defaultValue;
        }
    }

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
        System.loadLibrary("EvrsJniWrapper");
        ipErrHashMap.put(0, ErrorInfo.KMC_SUCCESS);
        ipErrHashMap.put(-1, ErrorInfo.KMC_EV_MEMORY);
        ipErrHashMap.put(-2, ErrorInfo.KMC_EV_FILEOPEN);
        ipErrHashMap.put(-3, ErrorInfo.KMC_EV_BAD_DPI);
        ipErrHashMap.put(-4, ErrorInfo.KMC_EV_BAD_WIDTH_HEIGHT);
        ipErrHashMap.put(-5, ErrorInfo.KMC_EV_BAD_LINEWIDTH);
        ipErrHashMap.put(-6, ErrorInfo.KMC_EV_BAD_CHANNEL);
        ipErrHashMap.put(-7, ErrorInfo.KMC_EV_METADATA_OVERFLOW);
        ipErrHashMap.put(-8, ErrorInfo.KMC_EV_FILE_READ_FAILED);
        ipErrHashMap.put(-9, ErrorInfo.KMC_EV_IMAGE_PARM);
        ipErrHashMap.put(-10, ErrorInfo.KMC_EV_IMAGE_PROCESSING);
        ipErrHashMap.put(-11, ErrorInfo.KMC_EV_IMAGE_WRITE_FAILED);
        ipErrHashMap.put(-12, ErrorInfo.KMC_EV_UNKNOWN_FILETYPE);
        ipErrHashMap.put(-13, ErrorInfo.KMC_EV_NONEXISTANT_IMAGE);
        ipErrHashMap.put(-14, ErrorInfo.KMC_EV_BAD_FILE_FORMAT);
        ipErrHashMap.put(-15, ErrorInfo.KMC_EV_APPEND_TO_FILE);
        ipErrHashMap.put(-16, ErrorInfo.KMC_EV_CANNOT_APPEND);
        ipErrHashMap.put(-17, ErrorInfo.KMC_EV_PDF_BAD);
        ipErrHashMap.put(-18, ErrorInfo.KMC_EV_APPEND_ENCRYPTED);
        ipErrHashMap.put(-19, ErrorInfo.KMC_EV_PDF_TOO_LARGE);
        ipErrHashMap.put(-20, ErrorInfo.KMC_EV_SPEED_ACCURACY);
        ipErrHashMap.put(-21, ErrorInfo.KMC_EV_NETWORK_READ);
        ipErrHashMap.put(-22, ErrorInfo.KMC_EV_FILE_METADATA);
        ipErrHashMap.put(-23, ErrorInfo.KMC_EV_INVALID_HANDLE);
        ipErrHashMap.put(-66, ErrorInfo.KMC_SUCCESS);
        ipErrHashMap.put(-88, ErrorInfo.KMC_EV_EXTERNAL_PAGE);
        ipErrHashMap.put(Integer.valueOf(KIPP_BAD_HISTOGRAM), ErrorInfo.KMC_EV_HISTOGRAM);
        ipErrHashMap.put(Integer.valueOf(KIPP_BAD_POINTER), ErrorInfo.KMC_EV_INVALID_POINTER);
        ipErrHashMap.put(Integer.valueOf(KIPP_BARCODE_DRIVER_FAIL), ErrorInfo.KMC_EV_BARCODE_DRIVER);
        ipErrHashMap.put(Integer.valueOf(KIPP_IP_LICENSING_FAILURE), ErrorInfo.KMC_EV_LICENSING);
        ipErrHashMap.put(Integer.valueOf(KIPP_IP_LICENSE_EXPIRATION_ERROR), ErrorInfo.KMC_EV_LICENSE_EXPIRED);
        ipErrHashMap.put(Integer.valueOf(KIPP_IP_FILE_IO_ACCESS_BUSY), ErrorInfo.KMC_EV_FILE_IO_ACCESS_BUSY);
        ipErrHashMap.put(Integer.valueOf(KIPP_USER_ABORT), ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS);
        ipErrHashMap.put(Integer.valueOf(KIPP_OPERATIONS_STRING_ERROR), ErrorInfo.KMC_EV_OP_STRING_ERROR);
    }

    private IpLibUtil() {
    }

    public static String getKippVersion() {
        return nativeGetVersion();
    }

    public static boolean isIpLicensed() {
        return nativeIsLicensed() == 0;
    }

    /* renamed from: aG */
    static String m512aG() {
        return nativeGetPermissions();
    }

    static int init(String str) {
        return nativeInit(str);
    }
}
