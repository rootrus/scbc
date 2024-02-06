package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C0767k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class Utility {
    public static final String AMAZON_FIRE = "SD4930UR";
    public static final String ASUS_Z00XS = "ASUS_Z00XS";
    public static final int ASUS_Z00XS_EV = 2;
    public static final String ASUS_ZENFONE_2E = "ASUS ZenFone 2E";
    public static final int ASUS_ZENFONE_2E_EV = 2;
    public static final String DROID_X = "DROIDX";
    public static final String GOOGLE_PIXEL = "Pixel";
    public static final String GOOGLE_PIXEL_C = "Pixel C";
    public static final String GOOGLE_PIXEL_XL = "Pixel XL";
    public static final String HTC_ONE_M9 = "HTC One M9";
    public static final String HTC_ONE_MAX = "HTC One max";
    public static final String HTC_THUNDERBOLT = "ADR6400L";
    public static final boolean IS_AMAZON_FIRE = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(AMAZON_FIRE));
    public static final boolean IS_DROID_X = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(DROID_X));
    public static final boolean IS_GOOGLE_PIXEL;
    public static final boolean IS_LG_G4 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(LG_G4));
    public static final boolean IS_MOTOROLA_TC70 = (Build.MODEL != null && Build.MODEL.contains("TC70"));
    public static final boolean IS_NEXUS_10 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(NEXUS_10));
    public static final boolean IS_NEXUS_4 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(NEXUS_4));
    public static final boolean IS_NEXUS_5 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(NEXUS_5));
    public static final boolean IS_NEXUS_6 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(NEXUS_6));
    public static final boolean IS_NEXUS_7 = (Build.MODEL != null && Build.MODEL.equalsIgnoreCase(NEXUS_7));
    public static final boolean IS_SAMSUNG_S5_MINI = (Build.MODEL != null && (Build.MODEL.equalsIgnoreCase(SAMSUNG_S5_MINI_F) || Build.MODEL.equalsIgnoreCase(SAMSUNG_S5_MINI_H) || Build.MODEL.equalsIgnoreCase(SAMSUNG_S5_MINI_M) || Build.MODEL.equalsIgnoreCase(SAMSUNG_S5_MINI_Y)));
    public static final String LENOVO_YOGA = "B8000-F";
    public static final String LG_G3 = "LG-D850";
    public static final String LG_G4 = "LG-H815";
    public static final String LG_OPTIMUS_G = "LG-E970";
    public static final String LG_OPTIMUS_G_PRO = "LG-E980";
    public static final String MOTO_G_1034 = "XT1034";
    public static final String MOTO_G_MODEL = "XT1032";
    public static final String NEXUS_10 = "Nexus 10";
    public static final String NEXUS_4 = "Nexus 4";
    public static final String NEXUS_5 = "Nexus 5";
    public static final String NEXUS_5X = "Nexus 5X";
    public static final String NEXUS_6 = "Nexus 6";
    public static final String NEXUS_7 = "Nexus 7";
    public static final String NEXUS_9 = "Nexus 9";
    public static final String SAMSUNG = "samsung";
    public static final String SAMSUNG_GALAXY_S5_A = "SAMSUNG-SM-G900A";
    public static final String SAMSUNG_GALAXY_S5_F = "SM-G900F";
    public static final String SAMSUNG_GALAXY_S5_H = "SM-G900H";
    public static final String SAMSUNG_GALAXY_S5_T = "SM-G900T";
    public static final String SAMSUNG_GALAXY_TAB_S3 = "SM-T820";
    public static final String SAMSUNG_MEGA_1 = "GT-I9205";
    public static final String SAMSUNG_MEGA_2 = "GT-I9200";
    public static final String SAMSUNG_MEGA_3 = "GT-I9152";
    public static final String SAMSUNG_MEGA_4 = "GT-I9150";
    public static final String SAMSUNG_NOTE_3 = "SAMSUNG-SM-N900V";
    public static final String SAMSUNG_S4 = "GT-I9505G";
    public static final String SAMSUNG_S4_MINI = "GT-I9195";
    public static final String SAMSUNG_S5_MINI_F = "SM-G800F";
    public static final String SAMSUNG_S5_MINI_H = "SM-G800H";
    public static final String SAMSUNG_S5_MINI_M = "SM-G800M";
    public static final String SAMSUNG_S5_MINI_Y = "SM-G800Y";
    public static final String SONY_XPERIA_TL = "LT30at";
    public static final String SONY_XPERIA_Z = "c6806_GPe";
    public static final String SONY_XPERIA_Z1S = "C6916";
    private static final String TAG = Utility.class.getSimpleName();

    static {
        boolean z = false;
        if (Build.MODEL != null && (Build.MODEL.equalsIgnoreCase(GOOGLE_PIXEL) || Build.MODEL.equalsIgnoreCase(GOOGLE_PIXEL_XL))) {
            z = true;
        }
        IS_GOOGLE_PIXEL = z;
    }

    public static Bitmap Rotate(Bitmap bitmap, float f) {
        if (f % 360.0f == BitmapDescriptorFactory.HUE_RED) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (!bitmap.equals(createBitmap)) {
                bitmap.recycle();
                System.gc();
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            System.gc();
            C0767k.m1820e(TAG, e.toString());
            e.printStackTrace();
            throw e;
        }
    }

    public static Bitmap createBitmap(Bitmap bitmap, int i) {
        if (i % 360 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    public static Bitmap Rotate(byte[] bArr, float f) {
        return Rotate(m501b(bArr), f);
    }

    public static Bitmap imageDataToBitmap(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i3 == 17) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new YuvImage(bArr, 17, i, i2, (int[]) null).compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        if (i4 != 0) {
            return Rotate(bArr, (float) i4);
        }
        return m501b(bArr);
    }

    public static byte[] imageToGray(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        byte[] bArr = new byte[(i << 2)];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = (i2 * width) + i3;
                bArr2[i4] = bArr[(i4 << 2) + 1];
            }
        }
        return bArr2;
    }

    public static byte[] imageToGray(Image image) throws KmcException {
        if (image.getImageRepresentation() != Image.ImageRep.IMAGE_REP_NONE) {
            boolean z = false;
            if (image.getImageRepresentation() == Image.ImageRep.IMAGE_REP_FILE) {
                z = true;
                image.imageReadFromFile();
            }
            try {
                return imageToGray(image.getImageBitmap());
            } finally {
                if (z) {
                    image.imageClearBitmap();
                }
            }
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_FILEPATH);
        }
    }

    public static float getDisplayToBitmapScalingFactor(Context context, int i, int i2) throws IOException {
        if (context != null) {
            float width = (float) (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth() - i2);
            if (i > 0) {
                return width / ((float) i);
            }
            return 1.0f;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public static byte[] getNv21(Image image) throws KmcException {
        if (!image.getImageRepresentation().equals(Image.ImageRep.IMAGE_REP_NONE)) {
            boolean z = false;
            if (image.getImageRepresentation().equals(Image.ImageRep.IMAGE_REP_FILE)) {
                z = true;
                image.imageReadFromFile();
            }
            Bitmap imageBitmap = image.getImageBitmap();
            try {
                int width = imageBitmap.getWidth();
                int height = imageBitmap.getHeight();
                int i = width * height;
                int[] iArr = new int[i];
                imageBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                byte[] bArr = new byte[((i * 3) / 2)];
                m500a(bArr, iArr, width, height);
                return bArr;
            } finally {
                if (z && imageBitmap != null) {
                    imageBitmap.recycle();
                }
            }
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_ED_FILEPATH);
        }
    }

    /* renamed from: a */
    static void m500a(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 * i4;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            while (i9 < i3) {
                int i10 = 255;
                int i11 = (iArr[i7] >> 16) & 255;
                int i12 = (iArr[i7] >> 8) & 255;
                int i13 = iArr[i7] & 255;
                int i14 = (((((i11 * 66) + (i12 * 129)) + (i13 * 25)) + 128) >> 8) + 16;
                int i15 = (((((i11 * -38) - (i12 * 74)) + (i13 * 112)) + 128) >> 8) + 128;
                int i16 = (((((i11 * 112) - (i12 * 94)) - (i13 * 18)) + 128) >> 8) + 128;
                if (i14 < 0) {
                    i14 = 0;
                } else if (i14 > 255) {
                    i14 = 255;
                }
                bArr[i6] = (byte) i14;
                if (i8 % 2 == 0 && i7 % 2 == 0) {
                    int i17 = i5 + 1;
                    if (i16 < 0) {
                        i16 = 0;
                    } else if (i16 > 255) {
                        i16 = 255;
                    }
                    bArr[i5] = (byte) i16;
                    i5 = i17 + 1;
                    if (i15 < 0) {
                        i10 = 0;
                    } else if (i15 <= 255) {
                        i10 = i15;
                    }
                    bArr[i17] = (byte) i10;
                }
                i7++;
                i9++;
                i6++;
            }
        }
    }

    public static long getDeviceRatio(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels > displayMetrics.widthPixels) {
            return Math.round((((double) displayMetrics.heightPixels) * 1000.0d) / ((double) displayMetrics.widthPixels));
        }
        return Math.round((((double) displayMetrics.widthPixels) * 1000.0d) / ((double) displayMetrics.heightPixels));
    }

    /* renamed from: b */
    private static Bitmap m501b(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }
}
