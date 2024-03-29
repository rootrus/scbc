package androidx.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.renderscript.Element;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RenderScript {
    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static final int SUPPORT_LIB_API = 23;
    static final int SUPPORT_LIB_VERSION = 2301;
    static Object lock = new Object();
    private static String mBlackList = "";
    static String mCachePath;
    private static ArrayList<RenderScript> mProcessContextList = new ArrayList<>();
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    private static int sNative = -1;
    static int sPointerSize;
    static Object sRuntime;
    private static int sSdkVersion = -1;
    static boolean sUseGCHooks;
    private static boolean useIOlib = false;
    private static boolean useNative;
    private Context mApplicationContext;
    long mContext;
    private int mContextFlags = 0;
    private int mContextSdkVersion = 0;
    ContextType mContextType = ContextType.NORMAL;
    private boolean mDestroyed = false;
    private int mDispatchAPILevel = 0;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    private boolean mEnableMultiInput = false;
    RSErrorHandler mErrorCallback = null;
    long mIncCon;
    boolean mIncLoaded;
    private boolean mIsProcessContext = false;
    RSMessageHandler mMessageCallback = null;
    MessageThread mMessageThread;
    private String mNativeLibDir;
    ReentrantReadWriteLock mRWLock;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;

    public static class RSErrorHandler implements Runnable {
        protected String mErrorMessage;
        protected int mErrorNum;

        public void run() {
        }
    }

    public static class RSMessageHandler implements Runnable {
        protected int[] mData;
        protected int mID;
        protected int mLength;

        public void run() {
        }
    }

    static native int rsnSystemGetPointerSize();

    /* access modifiers changed from: package-private */
    public native void nContextDeinitToClient(long j);

    /* access modifiers changed from: package-private */
    public native String nContextGetErrorMessage(long j);

    /* access modifiers changed from: package-private */
    public native int nContextGetUserMessage(long j, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void nContextInitToClient(long j);

    /* access modifiers changed from: package-private */
    public native int nContextPeekMessage(long j, int[] iArr);

    /* access modifiers changed from: package-private */
    public native long nDeviceCreate();

    /* access modifiers changed from: package-private */
    public native void nDeviceDestroy(long j);

    /* access modifiers changed from: package-private */
    public native void nDeviceSetConfig(long j, int i, int i2);

    /* access modifiers changed from: package-private */
    public native long nIncDeviceCreate();

    /* access modifiers changed from: package-private */
    public native void nIncDeviceDestroy(long j);

    /* access modifiers changed from: package-private */
    public native boolean nIncLoadSO(int i, String str);

    /* access modifiers changed from: package-private */
    public native boolean nLoadIOSO();

    /* access modifiers changed from: package-private */
    public native boolean nLoadSO(boolean z, int i, String str);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationCopyFromBitmap(long j, long j2, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationCopyToBitmap(long j, long j2, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCreateBitmapBackedAllocation(long j, long j2, int i, Bitmap bitmap, int i2);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCreateBitmapRef(long j, long j2, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCreateFromAssetStream(long j, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCreateTyped(long j, long j2, int i, int i2, long j3);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationCubeCreateFromBitmap(long j, long j2, int i, Bitmap bitmap, int i2);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, long j3, int i7, int i8, int i9, int i10);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData2D(long j, long j2, int i, int i2, int i3, int i4, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, int i9, int i10, int i11);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationData3D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationElementData1D(long j, long j2, int i, int i2, int i3, byte[] bArr, int i4);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationGenerateMipmaps(long j, long j2);

    /* access modifiers changed from: package-private */
    public native ByteBuffer rsnAllocationGetByteBuffer(long j, long j2, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationGetStride(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long rsnAllocationGetType(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationIoReceive(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationIoSend(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationRead(long j, long j2, Object obj, int i, int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationRead1D(long j, long j2, int i, int i2, int i3, Object obj, int i4, int i5, int i6, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationRead2D(long j, long j2, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationResize1D(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationResize2D(long j, long j2, int i, int i2);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationSetSurface(long j, long j2, Surface surface);

    /* access modifiers changed from: package-private */
    public native void rsnAllocationSyncAll(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native long rsnClosureCreate(long j, long j2, long j3, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4);

    /* access modifiers changed from: package-private */
    public native void rsnClosureSetArg(long j, long j2, int i, long j3, int i2);

    /* access modifiers changed from: package-private */
    public native void rsnClosureSetGlobal(long j, long j2, long j3, long j4, int i);

    /* access modifiers changed from: package-private */
    public native long rsnContextCreate(long j, int i, int i2, int i3, String str);

    /* access modifiers changed from: package-private */
    public native void rsnContextDestroy(long j);

    /* access modifiers changed from: package-private */
    public native void rsnContextDump(long j, int i);

    /* access modifiers changed from: package-private */
    public native void rsnContextFinish(long j);

    /* access modifiers changed from: package-private */
    public native void rsnContextSendMessage(long j, int i, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnContextSetPriority(long j, int i);

    /* access modifiers changed from: package-private */
    public native long rsnElementCreate(long j, long j2, int i, boolean z, int i2);

    /* access modifiers changed from: package-private */
    public native long rsnElementCreate2(long j, long[] jArr, String[] strArr, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnElementGetNativeData(long j, long j2, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnElementGetSubElements(long j, long j2, long[] jArr, String[] strArr, int[] iArr);

    /* access modifiers changed from: package-private */
    public native long rsnIncAllocationCreateTyped(long j, long j2, long j3, long j4, int i);

    /* access modifiers changed from: package-private */
    public native long rsnIncContextCreate(long j, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    public native void rsnIncContextDestroy(long j);

    /* access modifiers changed from: package-private */
    public native void rsnIncContextFinish(long j);

    /* access modifiers changed from: package-private */
    public native long rsnIncElementCreate(long j, long j2, int i, boolean z, int i2);

    /* access modifiers changed from: package-private */
    public native void rsnIncObjDestroy(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long rsnIncTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    /* access modifiers changed from: package-private */
    public native long rsnInvokeClosureCreate(long j, long j2, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnObjDestroy(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long rsnSamplerCreate(long j, int i, int i2, int i3, int i4, int i5, float f);

    /* access modifiers changed from: package-private */
    public native void rsnScriptBindAllocation(long j, long j2, long j3, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnScriptCCreate(long j, String str, String str2, byte[] bArr, int i);

    /* access modifiers changed from: package-private */
    public native long rsnScriptFieldIDCreate(long j, long j2, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptForEach(long j, long j2, int i, long[] jArr, long j3, byte[] bArr, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptForEach(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptForEachClipped(long j, long j2, long j3, int i, long j4, long j5, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnScriptGroup2Create(long j, String str, String str2, long[] jArr);

    /* access modifiers changed from: package-private */
    public native void rsnScriptGroup2Execute(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long rsnScriptGroupCreate(long j, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5);

    /* access modifiers changed from: package-private */
    public native void rsnScriptGroupExecute(long j, long j2);

    /* access modifiers changed from: package-private */
    public native void rsnScriptGroupSetInput(long j, long j2, long j3, long j4);

    /* access modifiers changed from: package-private */
    public native void rsnScriptGroupSetOutput(long j, long j2, long j3, long j4);

    /* access modifiers changed from: package-private */
    public native void rsnScriptIntrinsicBLAS_BNNM(long j, long j2, long j3, int i, int i2, int i3, long j4, int i4, long j5, int i5, long j6, int i6, int i7, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptIntrinsicBLAS_Complex(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, long j4, long j5, float f3, float f4, long j6, int i10, int i11, int i12, int i13, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptIntrinsicBLAS_Double(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, long j4, long j5, double d2, long j6, int i10, int i11, int i12, int i13, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptIntrinsicBLAS_Single(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, long j4, long j5, float f2, long j6, int i10, int i11, int i12, int i13, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptIntrinsicBLAS_Z(long j, long j2, long j3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, long j4, long j5, double d3, double d4, long j6, int i10, int i11, int i12, int i13, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnScriptIntrinsicCreate(long j, int i, long j2, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptInvoke(long j, long j2, int i, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnScriptInvokeIDCreate(long j, long j2, int i);

    /* access modifiers changed from: package-private */
    public native void rsnScriptInvokeV(long j, long j2, int i, byte[] bArr, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnScriptKernelIDCreate(long j, long j2, int i, int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptReduce(long j, long j2, int i, long[] jArr, long j3, int[] iArr);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetTimeZone(long j, long j2, byte[] bArr, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarD(long j, long j2, int i, double d, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarF(long j, long j2, int i, float f, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarI(long j, long j2, int i, int i2, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarJ(long j, long j2, int i, long j3, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarObj(long j, long j2, int i, long j3, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarV(long j, long j2, int i, byte[] bArr, boolean z);

    /* access modifiers changed from: package-private */
    public native void rsnScriptSetVarVE(long j, long j2, int i, byte[] bArr, long j3, int[] iArr, boolean z);

    /* access modifiers changed from: package-private */
    public native long rsnTypeCreate(long j, long j2, int i, int i2, int i3, boolean z, boolean z2, int i4);

    /* access modifiers changed from: package-private */
    public native void rsnTypeGetNativeData(long j, long j2, long[] jArr);

    public static void setBlackList(String str) {
        if (str != null) {
            mBlackList = str;
        }
    }

    public static void forceCompat() {
        sNative = 0;
    }

    /* access modifiers changed from: package-private */
    public int getDispatchAPILevel() {
        return this.mDispatchAPILevel;
    }

    /* access modifiers changed from: package-private */
    public boolean isUseNative() {
        return useNative;
    }

    public static int getPointerSize() {
        synchronized (lock) {
            if (!sInitialized) {
                throw new RSInvalidStateException("Calling getPointerSize() before any RenderScript instantiated");
            }
        }
        return sPointerSize;
    }

    private static boolean setupNative(int i, Context context) {
        int i2;
        long j;
        if (Build.VERSION.SDK_INT < i && Build.VERSION.SDK_INT < 21) {
            sNative = 0;
        }
        if (sNative == -1) {
            try {
                i2 = ((Integer) Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{"debug.rs.forcecompat", new Integer(0)})).intValue();
            } catch (Exception unused) {
                i2 = 0;
            }
            if (Build.VERSION.SDK_INT < 19 || i2 != 0) {
                sNative = 0;
            } else {
                sNative = 1;
            }
            if (sNative == 1) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    try {
                        j = ((Long) Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID", new Class[0]).invoke((Object) null, new Object[0])).longValue();
                    } catch (Exception unused2) {
                        j = 0;
                    }
                    if (applicationInfo.metaData != null) {
                        if (applicationInfo.metaData.getBoolean("androidx.renderscript.EnableAsyncTeardown") && j == 0) {
                            sNative = 0;
                        }
                        if (applicationInfo.metaData.getBoolean("androidx.renderscript.EnableBlurWorkaround") && Build.VERSION.SDK_INT <= 19) {
                            sNative = 0;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    return true;
                }
            }
        }
        if (sNative != 1) {
            return false;
        }
        if (mBlackList.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(Build.MANUFACTURER);
            sb.append(':');
            sb.append(Build.PRODUCT);
            sb.append(':');
            sb.append(Build.MODEL);
            sb.append(')');
            if (mBlackList.contains(sb.toString())) {
                sNative = 0;
                return false;
            }
        }
        return true;
    }

    public static void setupDiskCache(File file) {
        File file2 = new File(file, CACHE_PATH);
        mCachePath = file2.getAbsolutePath();
        file2.mkdirs();
    }

    public enum ContextType {
        NORMAL(0),
        DEBUG(1),
        PROFILE(2);
        
        int mID;

        private ContextType(int i) {
            this.mID = i;
        }
    }

    /* access modifiers changed from: package-private */
    public long nContextCreate(long j, int i, int i2, int i3, String str) {
        long rsnContextCreate;
        synchronized (this) {
            rsnContextCreate = rsnContextCreate(j, i, i2, i3, str);
        }
        return rsnContextCreate;
    }

    /* access modifiers changed from: package-private */
    public void nContextDestroy() {
        synchronized (this) {
            validate();
            ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
            writeLock.lock();
            long j = this.mContext;
            this.mContext = 0;
            writeLock.unlock();
            rsnContextDestroy(j);
        }
    }

    /* access modifiers changed from: package-private */
    public void nContextSetPriority(int i) {
        synchronized (this) {
            validate();
            rsnContextSetPriority(this.mContext, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void nContextDump(int i) {
        synchronized (this) {
            validate();
            rsnContextDump(this.mContext, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void nContextFinish() {
        synchronized (this) {
            validate();
            rsnContextFinish(this.mContext);
        }
    }

    /* access modifiers changed from: package-private */
    public void nContextSendMessage(int i, int[] iArr) {
        synchronized (this) {
            validate();
            rsnContextSendMessage(this.mContext, i, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public void nObjDestroy(long j) {
        long j2 = this.mContext;
        if (j2 != 0) {
            rsnObjDestroy(j2, j);
        }
    }

    /* access modifiers changed from: package-private */
    public long nElementCreate(long j, int i, boolean z, int i2) {
        long rsnElementCreate;
        synchronized (this) {
            validate();
            rsnElementCreate = rsnElementCreate(this.mContext, j, i, z, i2);
        }
        return rsnElementCreate;
    }

    /* access modifiers changed from: package-private */
    public long nElementCreate2(long[] jArr, String[] strArr, int[] iArr) {
        long rsnElementCreate2;
        synchronized (this) {
            validate();
            rsnElementCreate2 = rsnElementCreate2(this.mContext, jArr, strArr, iArr);
        }
        return rsnElementCreate2;
    }

    /* access modifiers changed from: package-private */
    public void nElementGetNativeData(long j, int[] iArr) {
        synchronized (this) {
            validate();
            rsnElementGetNativeData(this.mContext, j, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public void nElementGetSubElements(long j, long[] jArr, String[] strArr, int[] iArr) {
        synchronized (this) {
            validate();
            rsnElementGetSubElements(this.mContext, j, jArr, strArr, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public long nTypeCreate(long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        long rsnTypeCreate;
        synchronized (this) {
            validate();
            rsnTypeCreate = rsnTypeCreate(this.mContext, j, i, i2, i3, z, z2, i4);
        }
        return rsnTypeCreate;
    }

    /* access modifiers changed from: package-private */
    public void nTypeGetNativeData(long j, long[] jArr) {
        synchronized (this) {
            validate();
            rsnTypeGetNativeData(this.mContext, j, jArr);
        }
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCreateTyped(long j, int i, int i2, long j2) {
        long rsnAllocationCreateTyped;
        synchronized (this) {
            validate();
            rsnAllocationCreateTyped = rsnAllocationCreateTyped(this.mContext, j, i, i2, j2);
        }
        return rsnAllocationCreateTyped;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCreateFromBitmap(long j, int i, Bitmap bitmap, int i2) {
        long rsnAllocationCreateFromBitmap;
        synchronized (this) {
            validate();
            rsnAllocationCreateFromBitmap = rsnAllocationCreateFromBitmap(this.mContext, j, i, bitmap, i2);
        }
        return rsnAllocationCreateFromBitmap;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCreateBitmapBackedAllocation(long j, int i, Bitmap bitmap, int i2) {
        long rsnAllocationCreateBitmapBackedAllocation;
        synchronized (this) {
            validate();
            rsnAllocationCreateBitmapBackedAllocation = rsnAllocationCreateBitmapBackedAllocation(this.mContext, j, i, bitmap, i2);
        }
        return rsnAllocationCreateBitmapBackedAllocation;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCubeCreateFromBitmap(long j, int i, Bitmap bitmap, int i2) {
        long rsnAllocationCubeCreateFromBitmap;
        synchronized (this) {
            validate();
            rsnAllocationCubeCreateFromBitmap = rsnAllocationCubeCreateFromBitmap(this.mContext, j, i, bitmap, i2);
        }
        return rsnAllocationCubeCreateFromBitmap;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCreateBitmapRef(long j, Bitmap bitmap) {
        long rsnAllocationCreateBitmapRef;
        synchronized (this) {
            validate();
            rsnAllocationCreateBitmapRef = rsnAllocationCreateBitmapRef(this.mContext, j, bitmap);
        }
        return rsnAllocationCreateBitmapRef;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationCreateFromAssetStream(int i, int i2, int i3) {
        long rsnAllocationCreateFromAssetStream;
        synchronized (this) {
            validate();
            rsnAllocationCreateFromAssetStream = rsnAllocationCreateFromAssetStream(this.mContext, i, i2, i3);
        }
        return rsnAllocationCreateFromAssetStream;
    }

    /* access modifiers changed from: package-private */
    public void nAllocationCopyToBitmap(long j, Bitmap bitmap) {
        synchronized (this) {
            validate();
            rsnAllocationCopyToBitmap(this.mContext, j, bitmap);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationSyncAll(long j, int i) {
        synchronized (this) {
            validate();
            rsnAllocationSyncAll(this.mContext, j, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationSetSurface(long j, Surface surface) {
        synchronized (this) {
            validate();
            rsnAllocationSetSurface(this.mContext, j, surface);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationIoSend(long j) {
        synchronized (this) {
            validate();
            rsnAllocationIoSend(this.mContext, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationIoReceive(long j) {
        synchronized (this) {
            validate();
            rsnAllocationIoReceive(this.mContext, j);
        }
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer nAllocationGetByteBuffer(long j, int i, int i2, int i3) {
        ByteBuffer rsnAllocationGetByteBuffer;
        synchronized (this) {
            validate();
            rsnAllocationGetByteBuffer = rsnAllocationGetByteBuffer(this.mContext, j, i, i2, i3);
        }
        return rsnAllocationGetByteBuffer;
    }

    /* access modifiers changed from: package-private */
    public long nAllocationGetStride(long j) {
        long rsnAllocationGetStride;
        synchronized (this) {
            validate();
            rsnAllocationGetStride = rsnAllocationGetStride(this.mContext, j);
        }
        return rsnAllocationGetStride;
    }

    /* access modifiers changed from: package-private */
    public void nAllocationGenerateMipmaps(long j) {
        synchronized (this) {
            validate();
            rsnAllocationGenerateMipmaps(this.mContext, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationCopyFromBitmap(long j, Bitmap bitmap) {
        synchronized (this) {
            validate();
            rsnAllocationCopyFromBitmap(this.mContext, j, bitmap);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData1D(long j, int i, int i2, int i3, Object obj, int i4, Element.DataType dataType, int i5, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData1D(this.mContext, j, i, i2, i3, obj, i4, dataType.mID, i5, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationElementData1D(long j, int i, int i2, int i3, byte[] bArr, int i4) {
        synchronized (this) {
            validate();
            rsnAllocationElementData1D(this.mContext, j, i, i2, i3, bArr, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData2D(long j, int i, int i2, int i3, int i4, int i5, int i6, long j2, int i7, int i8, int i9, int i10) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, i5, i6, j2, i7, i8, i9, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData2D(long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, Element.DataType dataType, int i8, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, i5, i6, obj, i7, dataType.mID, i8, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData2D(long j, int i, int i2, int i3, int i4, Bitmap bitmap) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j, i, i2, i3, i4, bitmap);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData3D(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, int i9, int i10, int i11) {
        synchronized (this) {
            validate();
            rsnAllocationData3D(this.mContext, j, i, i2, i3, i4, i5, i6, i7, j2, i8, i9, i10, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationData3D(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, Element.DataType dataType, int i9, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData3D(this.mContext, j, i, i2, i3, i4, i5, i6, i7, obj, i8, dataType.mID, i9, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationRead(long j, Object obj, Element.DataType dataType, int i, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationRead(this.mContext, j, obj, dataType.mID, i, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationRead1D(long j, int i, int i2, int i3, Object obj, int i4, Element.DataType dataType, int i5, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationRead1D(this.mContext, j, i, i2, i3, obj, i4, dataType.mID, i5, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationRead2D(long j, int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, Element.DataType dataType, int i8, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationRead2D(this.mContext, j, i, i2, i3, i4, i5, i6, obj, i7, dataType.mID, i8, z);
        }
    }

    /* access modifiers changed from: package-private */
    public long nAllocationGetType(long j) {
        long rsnAllocationGetType;
        synchronized (this) {
            validate();
            rsnAllocationGetType = rsnAllocationGetType(this.mContext, j);
        }
        return rsnAllocationGetType;
    }

    /* access modifiers changed from: package-private */
    public void nAllocationResize1D(long j, int i) {
        synchronized (this) {
            validate();
            rsnAllocationResize1D(this.mContext, j, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void nAllocationResize2D(long j, int i, int i2) {
        synchronized (this) {
            validate();
            rsnAllocationResize2D(this.mContext, j, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptBindAllocation(long j, long j2, int i, boolean z) {
        synchronized (this) {
            validate();
            long j3 = this.mContext;
            if (z) {
                j3 = this.mIncCon;
            }
            rsnScriptBindAllocation(j3, j, j2, i, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetTimeZone(long j, byte[] bArr, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptSetTimeZone(j2, j, bArr, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptInvoke(long j, int i, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptInvoke(j2, j, i, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptForEach(long j, int i, long j2, long j3, byte[] bArr, boolean z) {
        synchronized (this) {
            validate();
            if (bArr == null) {
                rsnScriptForEach(this.mContext, this.mIncCon, j, i, j2, j3, z);
            } else {
                rsnScriptForEach(this.mContext, this.mIncCon, j, i, j2, j3, bArr, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptForEachClipped(long j, int i, long j2, long j3, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        synchronized (this) {
            validate();
            if (bArr == null) {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j, i, j2, j3, i2, i3, i4, i5, i6, i7, z);
            } else {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j, i, j2, j3, bArr, i2, i3, i4, i5, i6, i7, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptForEach(long j, int i, long[] jArr, long j2, byte[] bArr, int[] iArr) {
        synchronized (this) {
            if (this.mEnableMultiInput) {
                validate();
                rsnScriptForEach(this.mContext, j, i, jArr, j2, bArr, iArr);
            } else {
                Log.e(LOG_TAG, "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
                throw new RSRuntimeException("Multi-input kernels are not supported before API 23)");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptReduce(long j, int i, long[] jArr, long j2, int[] iArr) {
        synchronized (this) {
            validate();
            rsnScriptReduce(this.mContext, j, i, jArr, j2, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptInvokeV(long j, int i, byte[] bArr, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptInvokeV(j2, j, i, bArr, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarI(long j, int i, int i2, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptSetVarI(j2, j, i, i2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarJ(long j, int i, long j2, boolean z) {
        synchronized (this) {
            validate();
            long j3 = this.mContext;
            if (z) {
                j3 = this.mIncCon;
            }
            rsnScriptSetVarJ(j3, j, i, j2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarF(long j, int i, float f, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptSetVarF(j2, j, i, f, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarD(long j, int i, double d, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptSetVarD(j2, j, i, d, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarV(long j, int i, byte[] bArr, boolean z) {
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptSetVarV(j2, j, i, bArr, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarVE(long j, int i, byte[] bArr, long j2, int[] iArr, boolean z) {
        synchronized (this) {
            validate();
            long j3 = this.mContext;
            if (z) {
                j3 = this.mIncCon;
            }
            rsnScriptSetVarVE(j3, j, i, bArr, j2, iArr, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptSetVarObj(long j, int i, long j2, boolean z) {
        synchronized (this) {
            validate();
            long j3 = this.mContext;
            if (z) {
                j3 = this.mIncCon;
            }
            rsnScriptSetVarObj(j3, j, i, j2, z);
        }
    }

    /* access modifiers changed from: package-private */
    public long nScriptCCreate(String str, String str2, byte[] bArr, int i) {
        long rsnScriptCCreate;
        synchronized (this) {
            validate();
            rsnScriptCCreate = rsnScriptCCreate(this.mContext, str, str2, bArr, i);
        }
        return rsnScriptCCreate;
    }

    /* access modifiers changed from: package-private */
    public long nScriptIntrinsicCreate(int i, long j, boolean z) {
        synchronized (this) {
            validate();
            if (!z) {
                long rsnScriptIntrinsicCreate = rsnScriptIntrinsicCreate(this.mContext, i, j, z);
                return rsnScriptIntrinsicCreate;
            } else if (Build.VERSION.SDK_INT >= 21) {
                if (!this.mIncLoaded) {
                    try {
                        System.loadLibrary("RSSupport");
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.mNativeLibDir);
                        sb.append("/libRSSupport.so");
                        if (nIncLoadSO(23, sb.toString())) {
                            this.mIncLoaded = true;
                        } else {
                            throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
                        }
                    } catch (UnsatisfiedLinkError e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error loading RS Compat library for Incremental Intrinsic Support: ");
                        sb2.append(e);
                        Log.e(LOG_TAG, sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Error loading RS Compat library for Incremental Intrinsic Support: ");
                        sb3.append(e);
                        throw new RSRuntimeException(sb3.toString());
                    }
                }
                if (this.mIncCon == 0) {
                    this.mIncCon = nIncContextCreate(nIncDeviceCreate(), 0, 0, 0);
                }
                long rsnScriptIntrinsicCreate2 = rsnScriptIntrinsicCreate(this.mIncCon, i, j, z);
                return rsnScriptIntrinsicCreate2;
            } else {
                Log.e(LOG_TAG, "Incremental Intrinsics are not supported, please change targetSdkVersion to >= 21");
                throw new RSRuntimeException("Incremental Intrinsics are not supported before Lollipop (API 21)");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public long nScriptKernelIDCreate(long j, int i, int i2, boolean z) {
        long rsnScriptKernelIDCreate;
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptKernelIDCreate = rsnScriptKernelIDCreate(j2, j, i, i2, z);
        }
        return rsnScriptKernelIDCreate;
    }

    /* access modifiers changed from: package-private */
    public long nScriptInvokeIDCreate(long j, int i) {
        long rsnScriptInvokeIDCreate;
        synchronized (this) {
            validate();
            rsnScriptInvokeIDCreate = rsnScriptInvokeIDCreate(this.mContext, j, i);
        }
        return rsnScriptInvokeIDCreate;
    }

    /* access modifiers changed from: package-private */
    public long nScriptFieldIDCreate(long j, int i, boolean z) {
        long rsnScriptFieldIDCreate;
        synchronized (this) {
            validate();
            long j2 = this.mContext;
            if (z) {
                j2 = this.mIncCon;
            }
            rsnScriptFieldIDCreate = rsnScriptFieldIDCreate(j2, j, i, z);
        }
        return rsnScriptFieldIDCreate;
    }

    /* access modifiers changed from: package-private */
    public long nScriptGroupCreate(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        long rsnScriptGroupCreate;
        synchronized (this) {
            validate();
            rsnScriptGroupCreate = rsnScriptGroupCreate(this.mContext, jArr, jArr2, jArr3, jArr4, jArr5);
        }
        return rsnScriptGroupCreate;
    }

    /* access modifiers changed from: package-private */
    public void nScriptGroupSetInput(long j, long j2, long j3) {
        synchronized (this) {
            validate();
            rsnScriptGroupSetInput(this.mContext, j, j2, j3);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptGroupSetOutput(long j, long j2, long j3) {
        synchronized (this) {
            validate();
            rsnScriptGroupSetOutput(this.mContext, j, j2, j3);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptGroupExecute(long j) {
        synchronized (this) {
            validate();
            rsnScriptGroupExecute(this.mContext, j);
        }
    }

    /* access modifiers changed from: package-private */
    public long nSamplerCreate(int i, int i2, int i3, int i4, int i5, float f) {
        long rsnSamplerCreate;
        synchronized (this) {
            validate();
            rsnSamplerCreate = rsnSamplerCreate(this.mContext, i, i2, i3, i4, i5, f);
        }
        return rsnSamplerCreate;
    }

    /* access modifiers changed from: package-private */
    public long nClosureCreate(long j, long j2, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4) {
        long rsnClosureCreate;
        synchronized (this) {
            validate();
            rsnClosureCreate = rsnClosureCreate(this.mContext, j, j2, jArr, jArr2, iArr, jArr3, jArr4);
            if (rsnClosureCreate == 0) {
                throw new RSRuntimeException("Failed creating closure.");
            }
        }
        return rsnClosureCreate;
    }

    /* access modifiers changed from: package-private */
    public long nInvokeClosureCreate(long j, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr) {
        long rsnInvokeClosureCreate;
        synchronized (this) {
            validate();
            rsnInvokeClosureCreate = rsnInvokeClosureCreate(this.mContext, j, bArr, jArr, jArr2, iArr);
            if (rsnInvokeClosureCreate == 0) {
                throw new RSRuntimeException("Failed creating closure.");
            }
        }
        return rsnInvokeClosureCreate;
    }

    /* access modifiers changed from: package-private */
    public void nClosureSetArg(long j, int i, long j2, int i2) {
        synchronized (this) {
            validate();
            rsnClosureSetArg(this.mContext, j, i, j2, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void nClosureSetGlobal(long j, long j2, long j3, int i) {
        synchronized (this) {
            validate();
            rsnClosureSetGlobal(this.mContext, j, j2, j3, i);
        }
    }

    /* access modifiers changed from: package-private */
    public long nScriptGroup2Create(String str, String str2, long[] jArr) {
        long rsnScriptGroup2Create;
        synchronized (this) {
            validate();
            rsnScriptGroup2Create = rsnScriptGroup2Create(this.mContext, str, str2, jArr);
        }
        return rsnScriptGroup2Create;
    }

    /* access modifiers changed from: package-private */
    public void nScriptGroup2Execute(long j) {
        synchronized (this) {
            validate();
            rsnScriptGroup2Execute(this.mContext, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptIntrinsicBLAS_Single(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, long j2, long j3, float f2, long j4, int i10, int i11, int i12, int i13, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, f, j2, j3, f2, j4, i10, i11, i12, i13, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptIntrinsicBLAS_Double(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, long j2, long j3, double d2, long j4, int i10, int i11, int i12, int i13, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, d, j2, j3, d2, j4, i10, i11, i12, i13, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptIntrinsicBLAS_Complex(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, float f2, long j2, long j3, float f3, float f4, long j4, int i10, int i11, int i12, int i13, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, f, f2, j2, j3, f3, f4, j4, i10, i11, i12, i13, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptIntrinsicBLAS_Z(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d, double d2, long j2, long j3, double d3, double d4, long j4, int i10, int i11, int i12, int i13, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, j, i, i2, i3, i4, i5, i6, i7, i8, i9, d, d2, j2, j3, d3, d4, j4, i10, i11, i12, i13, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void nScriptIntrinsicBLAS_BNNM(long j, int i, int i2, int i3, long j2, int i4, long j3, int i5, long j4, int i6, int i7, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, j, i, i2, i3, j2, i4, j3, i5, j4, i6, i7, z);
        }
    }

    /* access modifiers changed from: package-private */
    public long nIncContextCreate(long j, int i, int i2, int i3) {
        long rsnIncContextCreate;
        synchronized (this) {
            rsnIncContextCreate = rsnIncContextCreate(j, i, i2, i3);
        }
        return rsnIncContextCreate;
    }

    /* access modifiers changed from: package-private */
    public void nIncContextDestroy() {
        synchronized (this) {
            validate();
            ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
            writeLock.lock();
            long j = this.mIncCon;
            this.mIncCon = 0;
            writeLock.unlock();
            rsnIncContextDestroy(j);
        }
    }

    /* access modifiers changed from: package-private */
    public void nIncContextFinish() {
        synchronized (this) {
            validate();
            rsnIncContextFinish(this.mIncCon);
        }
    }

    /* access modifiers changed from: package-private */
    public void nIncObjDestroy(long j) {
        long j2 = this.mIncCon;
        if (j2 != 0) {
            rsnIncObjDestroy(j2, j);
        }
    }

    /* access modifiers changed from: package-private */
    public long nIncElementCreate(long j, int i, boolean z, int i2) {
        long rsnIncElementCreate;
        synchronized (this) {
            validate();
            rsnIncElementCreate = rsnIncElementCreate(this.mIncCon, j, i, z, i2);
        }
        return rsnIncElementCreate;
    }

    /* access modifiers changed from: package-private */
    public long nIncTypeCreate(long j, int i, int i2, int i3, boolean z, boolean z2, int i4) {
        long rsnIncTypeCreate;
        synchronized (this) {
            validate();
            rsnIncTypeCreate = rsnIncTypeCreate(this.mIncCon, j, i, i2, i3, z, z2, i4);
        }
        return rsnIncTypeCreate;
    }

    /* access modifiers changed from: package-private */
    public long nIncAllocationCreateTyped(long j, long j2, int i) {
        long rsnIncAllocationCreateTyped;
        synchronized (this) {
            validate();
            rsnIncAllocationCreateTyped = rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, j, j2, i);
        }
        return rsnIncAllocationCreateTyped;
    }

    public void setMessageHandler(RSMessageHandler rSMessageHandler) {
        this.mMessageCallback = rSMessageHandler;
    }

    public RSMessageHandler getMessageHandler() {
        return this.mMessageCallback;
    }

    public void sendMessage(int i, int[] iArr) {
        nContextSendMessage(i, iArr);
    }

    public void setErrorHandler(RSErrorHandler rSErrorHandler) {
        this.mErrorCallback = rSErrorHandler;
    }

    public RSErrorHandler getErrorHandler() {
        return this.mErrorCallback;
    }

    public enum Priority {
        LOW(15),
        NORMAL(-4);
        
        int mID;

        private Priority(int i) {
            this.mID = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void validateObject(BaseObj baseObj) {
        if (baseObj != null && baseObj.mRS != this) {
            throw new RSIllegalArgumentException("Attempting to use an object across contexts.");
        }
    }

    /* access modifiers changed from: package-private */
    public void validate() {
        if (this.mContext == 0) {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean usingIO() {
        return useIOlib;
    }

    public void setPriority(Priority priority) {
        validate();
        nContextSetPriority(priority.mID);
    }

    static class MessageThread extends Thread {
        static final int RS_ERROR_FATAL_DEBUG = 2048;
        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        int[] mAuxData = new int[2];
        RenderScript mRS;
        boolean mRun = true;

        MessageThread(RenderScript renderScript) {
            super("RSMessageThread");
            this.mRS = renderScript;
        }

        public void run() {
            int[] iArr = new int[16];
            RenderScript renderScript = this.mRS;
            renderScript.nContextInitToClient(renderScript.mContext);
            while (this.mRun) {
                iArr[0] = 0;
                RenderScript renderScript2 = this.mRS;
                int nContextPeekMessage = renderScript2.nContextPeekMessage(renderScript2.mContext, this.mAuxData);
                int[] iArr2 = this.mAuxData;
                int i = iArr2[1];
                int i2 = iArr2[0];
                if (nContextPeekMessage == 4) {
                    if ((i >> 2) >= iArr.length) {
                        iArr = new int[((i + 3) >> 2)];
                    }
                    RenderScript renderScript3 = this.mRS;
                    if (renderScript3.nContextGetUserMessage(renderScript3.mContext, iArr) != 4) {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    } else if (this.mRS.mMessageCallback != null) {
                        this.mRS.mMessageCallback.mData = iArr;
                        this.mRS.mMessageCallback.mID = i2;
                        this.mRS.mMessageCallback.mLength = i;
                        this.mRS.mMessageCallback.run();
                    } else {
                        throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                    }
                } else if (nContextPeekMessage == 3) {
                    RenderScript renderScript4 = this.mRS;
                    String nContextGetErrorMessage = renderScript4.nContextGetErrorMessage(renderScript4.mContext);
                    if (i2 >= 4096 || (i2 >= 2048 && (this.mRS.mContextType != ContextType.DEBUG || this.mRS.mErrorCallback == null))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("fatal RS error, ");
                        sb.append(nContextGetErrorMessage);
                        Log.e(RenderScript.LOG_TAG, sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Fatal error ");
                        sb2.append(i2);
                        sb2.append(", details: ");
                        sb2.append(nContextGetErrorMessage);
                        throw new RSRuntimeException(sb2.toString());
                    } else if (this.mRS.mErrorCallback != null) {
                        this.mRS.mErrorCallback.mErrorMessage = nContextGetErrorMessage;
                        this.mRS.mErrorCallback.mErrorNum = i2;
                        this.mRS.mErrorCallback.run();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("non fatal RS error, ");
                        sb3.append(nContextGetErrorMessage);
                        Log.e(RenderScript.LOG_TAG, sb3.toString());
                    }
                } else {
                    try {
                        sleep(1, 0);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    RenderScript(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.mApplicationContext = applicationContext;
            this.mNativeLibDir = applicationContext.getApplicationInfo().nativeLibraryDir;
        }
        this.mIncCon = 0;
        this.mIncLoaded = false;
        this.mRWLock = new ReentrantReadWriteLock();
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    private static RenderScript internalCreate(Context context, int i, ContextType contextType, int i2) {
        String str;
        RenderScript renderScript = new RenderScript(context);
        int i3 = sSdkVersion;
        if (i3 == -1) {
            sSdkVersion = i;
        } else if (i3 != i) {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        useNative = setupNative(sSdkVersion, context);
        synchronized (lock) {
            str = null;
            if (!sInitialized) {
                try {
                    Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                    sRuntime = cls.getDeclaredMethod("getRuntime", new Class[0]).invoke((Object) null, new Object[0]);
                    registerNativeAllocation = cls.getDeclaredMethod("registerNativeAllocation", new Class[]{Integer.TYPE});
                    registerNativeFree = cls.getDeclaredMethod("registerNativeFree", new Class[]{Integer.TYPE});
                    sUseGCHooks = true;
                } catch (UnsatisfiedLinkError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error loading RS jni library: ");
                    sb.append(e);
                    Log.e(LOG_TAG, sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error loading RS jni library: ");
                    sb2.append(e);
                    sb2.append(" Support lib API: ");
                    sb2.append(SUPPORT_LIB_VERSION);
                    throw new RSRuntimeException(sb2.toString());
                } catch (Exception unused) {
                    Log.e(LOG_TAG, "No GC methods");
                    sUseGCHooks = false;
                }
                if (Build.VERSION.SDK_INT >= 23 || renderScript.mNativeLibDir == null) {
                    System.loadLibrary("rsjni_androidx");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(renderScript.mNativeLibDir);
                    sb3.append("/librsjni_androidx.so");
                    System.load(sb3.toString());
                }
                sInitialized = true;
                sPointerSize = rsnSystemGetPointerSize();
            }
        }
        if (useNative) {
            Log.v(LOG_TAG, "RS native mode");
        } else {
            Log.v(LOG_TAG, "RS compat mode");
        }
        if (Build.VERSION.SDK_INT >= 14) {
            useIOlib = true;
        }
        int i4 = i < Build.VERSION.SDK_INT ? Build.VERSION.SDK_INT : i;
        if (Build.VERSION.SDK_INT < 23 && renderScript.mNativeLibDir != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(renderScript.mNativeLibDir);
            sb4.append("/libRSSupport.so");
            str = sb4.toString();
        }
        if (!renderScript.nLoadSO(useNative, i4, str)) {
            if (useNative) {
                Log.v(LOG_TAG, "Unable to load libRS.so, falling back to compat mode");
                useNative = false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 23 || renderScript.mNativeLibDir == null) {
                    System.loadLibrary("RSSupport");
                } else {
                    System.load(str);
                }
                if (!renderScript.nLoadSO(false, i4, str)) {
                    Log.e(LOG_TAG, "Error loading RS Compat library: nLoadSO() failed; Support lib version: 2301");
                    throw new RSRuntimeException("Error loading libRSSupport library, Support lib version: 2301");
                }
            } catch (UnsatisfiedLinkError e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error loading RS Compat library: ");
                sb5.append(e2);
                sb5.append(" Support lib version: ");
                sb5.append(SUPPORT_LIB_VERSION);
                Log.e(LOG_TAG, sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Error loading RS Compat library: ");
                sb6.append(e2);
                sb6.append(" Support lib version: ");
                sb6.append(SUPPORT_LIB_VERSION);
                throw new RSRuntimeException(sb6.toString());
            }
        }
        if (useIOlib) {
            try {
                System.loadLibrary("RSSupportIO");
            } catch (UnsatisfiedLinkError unused2) {
                useIOlib = false;
            }
            if (!useIOlib || !renderScript.nLoadIOSO()) {
                Log.v(LOG_TAG, "Unable to load libRSSupportIO.so, USAGE_IO not supported");
                useIOlib = false;
            }
        }
        if (i4 >= 23) {
            renderScript.mEnableMultiInput = true;
            try {
                System.loadLibrary("blasV8");
            } catch (UnsatisfiedLinkError e3) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Unable to load BLAS lib, ONLY BNNM will be supported: ");
                sb7.append(e3);
                Log.v(LOG_TAG, sb7.toString());
            }
        }
        long nContextCreate = renderScript.nContextCreate(renderScript.nDeviceCreate(), 0, i, contextType.mID, renderScript.mNativeLibDir);
        renderScript.mContext = nContextCreate;
        renderScript.mContextType = contextType;
        renderScript.mContextFlags = i2;
        renderScript.mContextSdkVersion = i;
        renderScript.mDispatchAPILevel = i4;
        if (nContextCreate != 0) {
            MessageThread messageThread = new MessageThread(renderScript);
            renderScript.mMessageThread = messageThread;
            messageThread.start();
            return renderScript;
        }
        throw new RSDriverException("Failed to create RS context.");
    }

    public static RenderScript create(Context context) {
        return create(context, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, ContextType contextType) {
        return create(context, contextType, 0);
    }

    public static RenderScript create(Context context, ContextType contextType, int i) {
        return create(context, context.getApplicationInfo().targetSdkVersion, contextType, i);
    }

    public static RenderScript create(Context context, int i) {
        return create(context, i, ContextType.NORMAL, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contextType) {
        return create(context, i, contextType, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contextType, int i2) {
        synchronized (mProcessContextList) {
            Iterator<RenderScript> it = mProcessContextList.iterator();
            while (it.hasNext()) {
                RenderScript next = it.next();
                if (next.mContextType == contextType && next.mContextFlags == i2 && next.mContextSdkVersion == i) {
                    return next;
                }
            }
            RenderScript internalCreate = internalCreate(context, i, contextType, i2);
            internalCreate.mIsProcessContext = true;
            mProcessContextList.add(internalCreate);
            return internalCreate;
        }
    }

    public static void releaseAllContexts() {
        ArrayList<RenderScript> arrayList;
        synchronized (mProcessContextList) {
            arrayList = mProcessContextList;
            mProcessContextList = new ArrayList<>();
        }
        Iterator<RenderScript> it = arrayList.iterator();
        while (it.hasNext()) {
            RenderScript next = it.next();
            next.mIsProcessContext = false;
            next.destroy();
        }
        arrayList.clear();
    }

    public static RenderScript createMultiContext(Context context, ContextType contextType, int i, int i2) {
        return internalCreate(context, i2, contextType, i);
    }

    public void contextDump() {
        validate();
        nContextDump(0);
    }

    public void finish() {
        nContextFinish();
    }

    private void helpDestroy() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            if (!this.mDestroyed) {
                this.mDestroyed = true;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            nContextFinish();
            if (this.mIncCon != 0) {
                nIncContextFinish();
                nIncContextDestroy();
                this.mIncCon = 0;
            }
            nContextDeinitToClient(this.mContext);
            this.mMessageThread.mRun = false;
            this.mMessageThread.interrupt();
            boolean z3 = false;
            while (!z) {
                try {
                    this.mMessageThread.join();
                    z = true;
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
            if (z3) {
                Log.v(LOG_TAG, "Interrupted during wait for MessageThread to join");
                Thread.currentThread().interrupt();
            }
            nContextDestroy();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        helpDestroy();
        super.finalize();
    }

    public void destroy() {
        if (!this.mIsProcessContext) {
            validate();
            helpDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAlive() {
        return this.mContext != 0;
    }

    /* access modifiers changed from: package-private */
    public long safeID(BaseObj baseObj) {
        if (baseObj != null) {
            return baseObj.getID(this);
        }
        return 0;
    }
}
