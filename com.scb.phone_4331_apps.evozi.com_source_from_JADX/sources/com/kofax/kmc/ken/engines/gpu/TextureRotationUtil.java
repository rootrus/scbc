package com.kofax.kmc.ken.engines.gpu;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class TextureRotationUtil {
    public static final float[] TEXTURE_NO_ROTATION = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED};
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f};
    public static final float[] TEXTURE_ROTATED_270 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};

    /* renamed from: c */
    private static float m314c(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private TextureRotationUtil() {
    }

    /* renamed from: com.kofax.kmc.ken.engines.gpu.TextureRotationUtil$1 */
    static /* synthetic */ class C04481 {

        /* renamed from: hs */
        static final /* synthetic */ int[] f388hs;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.kmc.ken.engines.gpu.Rotation[] r0 = com.kofax.kmc.ken.engines.gpu.Rotation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f388hs = r0
                com.kofax.kmc.ken.engines.gpu.Rotation r1 = com.kofax.kmc.ken.engines.gpu.Rotation.ROTATION_90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f388hs     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.gpu.Rotation r1 = com.kofax.kmc.ken.engines.gpu.Rotation.ROTATION_180     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f388hs     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.gpu.Rotation r1 = com.kofax.kmc.ken.engines.gpu.Rotation.ROTATION_270     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f388hs     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.ken.engines.gpu.Rotation r1 = com.kofax.kmc.ken.engines.gpu.Rotation.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.gpu.TextureRotationUtil.C04481.<clinit>():void");
        }
    }

    public static float[] getRotation(Rotation rotation, boolean z, boolean z2) {
        float[] fArr;
        int i = C04481.f388hs[rotation.ordinal()];
        if (i == 1) {
            fArr = TEXTURE_ROTATED_90;
        } else if (i == 2) {
            fArr = TEXTURE_ROTATED_180;
        } else if (i != 3) {
            fArr = TEXTURE_NO_ROTATION;
        } else {
            fArr = TEXTURE_ROTATED_270;
        }
        if (z) {
            fArr = new float[]{m314c(fArr[0]), fArr[1], m314c(fArr[2]), fArr[3], m314c(fArr[4]), fArr[5], m314c(fArr[6]), fArr[7]};
        }
        if (!z2) {
            return fArr;
        }
        return new float[]{fArr[0], m314c(fArr[1]), fArr[2], m314c(fArr[3]), fArr[4], m314c(fArr[5]), fArr[6], m314c(fArr[7])};
    }
}
