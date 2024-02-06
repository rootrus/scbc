package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.HmlSensitiveConsentActivity */
public final class HmlSensitiveConsentActivity implements PassportCaptureModule_GetUriRttiFactory {
    private FragmentBuilder_BindEasycashOccupationInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlSensitiveConsentActivity() {
    }

    protected static Bitmap IconCompatParcelizer(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return createBitmap;
    }

    public static Bitmap write(View view, lambda$onCreate$0$HmlSelectedOfferReviewActivity lambda_oncreate_0_hmlselectedofferreviewactivity) {
        Bitmap IconCompatParcelizer = IconCompatParcelizer(view);
        Bitmap read = read(view.getContext(), IconCompatParcelizer, lambda_oncreate_0_hmlselectedofferreviewactivity);
        IconCompatParcelizer.recycle();
        return read;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap read(android.content.Context r8, android.graphics.Bitmap r9, p040o.lambda$onCreate$0$HmlSelectedOfferReviewActivity r10) {
        /*
            int r0 = r10.read
            int r1 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r0 / r1
            int r1 = r10.write
            int r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1 / r2
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r1
            r6 = r4
        L_0x0014:
            if (r6 >= r2) goto L_0x001f
            r7 = r3[r6]
            if (r7 != 0) goto L_0x001c
            r4 = r5
            goto L_0x001f
        L_0x001c:
            int r6 = r6 + 1
            goto L_0x0014
        L_0x001f:
            if (r4 == 0) goto L_0x0023
            r8 = 0
            return r8
        L_0x0023:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 / r2
            int r4 = r10.MediaBrowserCompat$CustomActionResultReceiver
            float r4 = (float) r4
            float r3 = r3 / r4
            r1.scale(r2, r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r3 = 3
            r2.setFlags(r3)
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            int r4 = r10.MediaBrowserCompat$ItemReceiver
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r4, r6)
            r2.setColorFilter(r3)
            r3 = 0
            r1.drawBitmap(r9, r3, r3, r2)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 18
            if (r9 < r1) goto L_0x0062
            int r9 = r10.IconCompatParcelizer     // Catch:{ RSRuntimeException -> 0x0062 }
            android.graphics.Bitmap r8 = MediaBrowserCompat$CustomActionResultReceiver(r8, r0, r9)     // Catch:{ RSRuntimeException -> 0x0062 }
            goto L_0x0068
        L_0x0062:
            int r8 = r10.IconCompatParcelizer
            android.graphics.Bitmap r8 = MediaBrowserCompat$CustomActionResultReceiver(r0, r8)
        L_0x0068:
            int r9 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 != r5) goto L_0x006d
            return r8
        L_0x006d:
            int r9 = r10.read
            int r10 = r10.write
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r8, r9, r10, r5)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlSensitiveConsentActivity.read(android.content.Context, android.graphics.Bitmap, o.lambda$onCreate$0$HmlSelectedOfferReviewActivity):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap MediaBrowserCompat$CustomActionResultReceiver(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch:{ all -> 0x0053 }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            r5.setMessageHandler(r1)     // Catch:{ all -> 0x004d }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x004d }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x004d }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x004b }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x004b }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x0046 }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch:{ all -> 0x0046 }
            r0.setInput(r1)     // Catch:{ all -> 0x0046 }
            float r7 = (float) r7     // Catch:{ all -> 0x0046 }
            r0.setRadius(r7)     // Catch:{ all -> 0x0046 }
            r0.forEach(r2)     // Catch:{ all -> 0x0046 }
            r2.copyTo(r6)     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0036
            r5.destroy()
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.destroy()
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.destroy()
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.destroy()
        L_0x0045:
            return r6
        L_0x0046:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0057
        L_0x004b:
            r6 = move-exception
            goto L_0x004f
        L_0x004d:
            r6 = move-exception
            r1 = r0
        L_0x004f:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L_0x0057
        L_0x0053:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.destroy()
        L_0x005c:
            if (r1 == 0) goto L_0x0061
            r1.destroy()
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r2.destroy()
        L_0x0066:
            if (r5 == 0) goto L_0x006b
            r5.destroy()
        L_0x006b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlSensitiveConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    private static Bitmap MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        if (i2 <= 0) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 << 8;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(Integer.TYPE, iArr8);
        int i11 = i2 + 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            int i15 = -i2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i2) {
                int i25 = i5;
                int i26 = height;
                int i27 = iArr2[i13 + Math.min(i4, Math.max(i15, 0))];
                int[] iArr10 = iArr9[i15 + i2];
                int[] iArr11 = iArr2;
                iArr10[0] = (i27 >> 16) & 255;
                iArr10[1] = (i27 >> 8) & 255;
                iArr10[2] = i27 & 255;
                int abs = i11 - Math.abs(i15);
                i16 += iArr10[0] * abs;
                i20 += iArr10[1] * abs;
                i21 += iArr10[2] * abs;
                if (i15 > 0) {
                    i19 += iArr10[0];
                    i18 += iArr10[1];
                    i17 += iArr10[2];
                } else {
                    i22 += iArr10[0];
                    i23 += iArr10[1];
                    i24 += iArr10[2];
                }
                i15++;
                height = i26;
                i5 = i25;
                iArr2 = iArr11;
            }
            int i28 = i5;
            int i29 = height;
            int[] iArr12 = iArr2;
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i13] = iArr7[i16];
                iArr4[i13] = iArr7[i20];
                iArr5[i13] = iArr7[i21];
                int[] iArr13 = iArr9[((i30 - i2) + i6) % i6];
                int i32 = iArr13[0];
                int i33 = iArr13[1];
                int i34 = iArr13[2];
                if (i12 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i35 = iArr12[i14 + iArr6[i31]];
                iArr13[0] = (i35 >> 16) & 255;
                iArr13[1] = (i35 >> 8) & 255;
                iArr13[2] = i35 & 255;
                int i36 = i19 + iArr13[0];
                int i37 = i18 + iArr13[1];
                int i38 = i17 + iArr13[2];
                i16 = (i16 - i22) + i36;
                i20 = (i20 - i23) + i37;
                i21 = (i21 - i24) + i38;
                i30 = (i30 + 1) % i6;
                int[] iArr14 = iArr9[i30 % i6];
                i22 = (i22 - i32) + iArr14[0];
                i23 = (i23 - i33) + iArr14[1];
                i24 = (i24 - i34) + iArr14[2];
                i19 = i36 - iArr14[0];
                i18 = i37 - iArr14[1];
                i17 = i38 - iArr14[2];
                i13++;
                i31++;
                iArr7 = iArr;
            }
            int[] iArr15 = iArr7;
            i14 += width;
            i12++;
            height = i29;
            i5 = i28;
            iArr2 = iArr12;
        }
        int i39 = i5;
        int i40 = height;
        int[] iArr16 = iArr2;
        int[] iArr17 = iArr7;
        int i41 = 0;
        while (i41 < width) {
            int i42 = -i2;
            int i43 = i42 * width;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            while (i42 <= i2) {
                int[] iArr18 = iArr6;
                int max = Math.max(0, i43) + i41;
                int[] iArr19 = iArr9[i42 + i2];
                iArr19[0] = iArr3[max];
                iArr19[1] = iArr4[max];
                iArr19[2] = iArr5[max];
                int abs2 = i11 - Math.abs(i42);
                i45 += iArr3[max] * abs2;
                i44 += iArr4[max] * abs2;
                i49 += iArr5[max] * abs2;
                if (i42 > 0) {
                    i48 += iArr19[0];
                    i47 += iArr19[1];
                    i46 += iArr19[2];
                } else {
                    i50 += iArr19[0];
                    i51 += iArr19[1];
                    i52 += iArr19[2];
                }
                int i53 = i39;
                if (i42 < i53) {
                    i43 += width;
                }
                i42++;
                i39 = i53;
                iArr6 = iArr18;
            }
            int[] iArr20 = iArr6;
            int i54 = i39;
            int i55 = i2;
            int i56 = i41;
            int i57 = i40;
            int i58 = 0;
            while (i58 < i57) {
                iArr16[i56] = (iArr16[i56] & -16777216) | (iArr17[i45] << 16) | (iArr17[i44] << 8) | iArr17[i49];
                int[] iArr21 = iArr9[((i55 - i2) + i6) % i6];
                int i59 = iArr21[0];
                int i60 = iArr21[1];
                int i61 = iArr21[2];
                if (i41 == 0) {
                    iArr20[i58] = Math.min(i58 + i11, i54) * width;
                }
                int i62 = iArr20[i58] + i41;
                iArr21[0] = iArr3[i62];
                iArr21[1] = iArr4[i62];
                iArr21[2] = iArr5[i62];
                int i63 = i48 + iArr21[0];
                int i64 = i47 + iArr21[1];
                int i65 = i46 + iArr21[2];
                i45 = (i45 - i50) + i63;
                i44 = (i44 - i51) + i64;
                i49 = (i49 - i52) + i65;
                i55 = (i55 + 1) % i6;
                int[] iArr22 = iArr9[i55];
                i50 = (i50 - i59) + iArr22[0];
                i51 = (i51 - i60) + iArr22[1];
                i52 = (i52 - i61) + iArr22[2];
                i48 = i63 - iArr22[0];
                i47 = i64 - iArr22[1];
                i46 = i65 - iArr22[2];
                i56 += width;
                i58++;
                i2 = i;
            }
            i41++;
            i2 = i;
            i40 = i57;
            i39 = i54;
            iArr6 = iArr20;
        }
        bitmap.setPixels(iArr16, 0, width, 0, 0, width, i40);
        return bitmap;
    }

    @HmlPinActivity
    public HmlSensitiveConsentActivity(Context context) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindEasycashOccupationInfoFragment(context);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindEasycashOccupationInfoFragment fragmentBuilder_BindEasycashOccupationInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!fragmentBuilder_BindEasycashOccupationInfoFragment.IconCompatParcelizer(new ArrayList(Arrays.asList(FragmentBuilder_BindEasycashIssuerLandingFragment.MediaBrowserCompat$ItemReceiver)))) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(FragmentBuilder_BindEasycashIssuerLandingFragment.IconCompatParcelizer));
            if (!fragmentBuilder_BindEasycashOccupationInfoFragment.IconCompatParcelizer(arrayList) && !FragmentBuilder_BindEasycashOccupationInfoFragment.MediaBrowserCompat$ItemReceiver("su") && !FragmentBuilder_BindEasycashOccupationInfoFragment.read() && !FragmentBuilder_BindEasycashOccupationInfoFragment.IconCompatParcelizer()) {
                String str = Build.TAGS;
                if (!(str != null && str.contains("test-keys")) && !FragmentBuilder_BindEasycashOccupationInfoFragment.MediaBrowserCompat$CustomActionResultReceiver() && !fragmentBuilder_BindEasycashOccupationInfoFragment.write() && !FragmentBuilder_BindEasycashOccupationInfoFragment.MediaBrowserCompat$ItemReceiver()) {
                    return false;
                }
            }
        }
        return true;
    }
}
