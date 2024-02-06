package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzbl;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzbq;
import com.google.android.gms.internal.vision.zzca;
import com.google.android.gms.internal.vision.zzcc;
import com.google.android.gms.internal.vision.zzch;
import com.google.android.gms.internal.vision.zzck;
import com.google.android.gms.internal.vision.zzfy;
import com.google.android.gms.internal.vision.zzjx;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

final class NativeFaceDetectorV2Impl extends zzh {
    private static final GmsLogger zzcs = new GmsLogger("NativeFaceDetectorV2Imp", "");
    private final long zzct;
    private final DynamiteClearcutLogger zzcu;
    private final zzca.zzd zzcv;
    private final FaceDetectorV2Jni zzcw;

    /* renamed from: com.google.android.gms.vision.face.NativeFaceDetectorV2Impl$1 */
    static /* synthetic */ class C76031 {
        static final /* synthetic */ int[] zzcx;
        static final /* synthetic */ int[] zzcy;

        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(68:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0129 */
        static {
            /*
                com.google.android.gms.internal.vision.zzca$zzb$zzc[] r0 = com.google.android.gms.internal.vision.zzca.zzb.zzc.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                zzcy = r0
                r1 = 1
                com.google.android.gms.internal.vision.zzca$zzb$zzc r2 = com.google.android.gms.internal.vision.zzca.zzb.zzc.FACE_OVAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = zzcy     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r3 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LEFT_EYEBROW_TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = zzcy     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r4 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LEFT_EYEBROW_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = zzcy     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r5 = com.google.android.gms.internal.vision.zzca.zzb.zzc.RIGHT_EYEBROW_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = zzcy     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r6 = com.google.android.gms.internal.vision.zzca.zzb.zzc.RIGHT_EYEBROW_BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = zzcy     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r7 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LEFT_EYE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = zzcy     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r8 = com.google.android.gms.internal.vision.zzca.zzb.zzc.RIGHT_EYE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = zzcy     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r9 = com.google.android.gms.internal.vision.zzca.zzb.zzc.UPPER_LIP_TOP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = zzcy     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r10 = com.google.android.gms.internal.vision.zzca.zzb.zzc.UPPER_LIP_BOTTOM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                r9 = 10
                int[] r10 = zzcy     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r11 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LOWER_LIP_TOP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r10 = 11
                int[] r11 = zzcy     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r12 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LOWER_LIP_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                r11 = 12
                int[] r12 = zzcy     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r13 = com.google.android.gms.internal.vision.zzca.zzb.zzc.NOSE_BRIDGE     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r12[r13] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r12 = zzcy     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r13 = com.google.android.gms.internal.vision.zzca.zzb.zzc.NOSE_BOTTOM     // Catch:{ NoSuchFieldError -> 0x009c }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r14 = 13
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r12 = zzcy     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r13 = com.google.android.gms.internal.vision.zzca.zzb.zzc.LEFT_CHEEK_CENTER     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r14 = 14
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r12 = zzcy     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.android.gms.internal.vision.zzca$zzb$zzc r13 = com.google.android.gms.internal.vision.zzca.zzb.zzc.RIGHT_CHEEK_CENTER     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r14 = 15
                r12[r13] = r14     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                com.google.android.gms.internal.vision.zzjx$zze$zzb[] r12 = com.google.android.gms.internal.vision.zzjx.zze.zzb.values()
                int r12 = r12.length
                int[] r12 = new int[r12]
                zzcx = r12
                com.google.android.gms.internal.vision.zzjx$zze$zzb r13 = com.google.android.gms.internal.vision.zzjx.zze.zzb.LEFT_EYE     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r12[r13] = r1     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r1 = zzcx     // Catch:{ NoSuchFieldError -> 0x00cf }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r12 = com.google.android.gms.internal.vision.zzjx.zze.zzb.RIGHT_EYE     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r1[r12] = r0     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x00d9 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.NOSE_TIP     // Catch:{ NoSuchFieldError -> 0x00d9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d9 }
            L_0x00d9:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x00e3 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.LOWER_LIP     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x00ed }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.MOUTH_LEFT     // Catch:{ NoSuchFieldError -> 0x00ed }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00ed }
            L_0x00ed:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.MOUTH_RIGHT     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x0101 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.LEFT_EAR_TRAGION     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x010b }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.RIGHT_EAR_TRAGION     // Catch:{ NoSuchFieldError -> 0x010b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010b }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x010b }
            L_0x010b:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x0115 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.LEFT_CHEEK_CENTER     // Catch:{ NoSuchFieldError -> 0x0115 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0115 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0115 }
            L_0x0115:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x011f }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.RIGHT_CHEEK_CENTER     // Catch:{ NoSuchFieldError -> 0x011f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011f }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x011f }
            L_0x011f:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x0129 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.LEFT_EAR_TOP     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r0[r1] = r10     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                int[] r0 = zzcx     // Catch:{ NoSuchFieldError -> 0x0133 }
                com.google.android.gms.internal.vision.zzjx$zze$zzb r1 = com.google.android.gms.internal.vision.zzjx.zze.zzb.RIGHT_EAR_TOP     // Catch:{ NoSuchFieldError -> 0x0133 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0133 }
                r0[r1] = r11     // Catch:{ NoSuchFieldError -> 0x0133 }
            L_0x0133:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.NativeFaceDetectorV2Impl.C76031.<clinit>():void");
        }
    }

    NativeFaceDetectorV2Impl(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze, FaceDetectorV2Jni faceDetectorV2Jni) {
        zzca.zzg zzg = (zzca.zzg) ((zzfy) zzca.zzg.zzbo().zzj("models").zzfg());
        zzca.zzd.zza zzf = zzca.zzd.zzbi().zzb((zzca.zze) ((zzfy) zzca.zze.zzbk().zzh(zzg).zzi(zzg).zzj(zzg).zzfg())).zzb((zzca.zza) ((zzfy) zzca.zza.zzaw().zzc(zzg).zzd(zzg).zzfg())).zzb((zzca.zzf) ((zzfy) zzca.zzf.zzbm().zzo(zzg).zzp(zzg).zzq(zzg).zzr(zzg).zzfg())).zzd(zze.zzcm).zze(zze.trackingEnabled).zze(zze.proportionalMinFaceSize).zzf(true);
        int i = zze.mode;
        if (i == 0) {
            zzf.zzb(zzck.FAST);
        } else if (i == 1) {
            zzf.zzb(zzck.ACCURATE);
        } else if (i == 2) {
            zzf.zzb(zzck.SELFIE);
        }
        int i2 = zze.landmarkType;
        if (i2 == 0) {
            zzf.zzb(zzch.NO_LANDMARK);
        } else if (i2 == 1) {
            zzf.zzb(zzch.ALL_LANDMARKS);
        } else if (i2 == 2) {
            zzf.zzb(zzch.CONTOUR_LANDMARKS);
        }
        int i3 = zze.zzcn;
        if (i3 == 0) {
            zzf.zzb(zzcc.NO_CLASSIFICATION);
        } else if (i3 == 1) {
            zzf.zzb(zzcc.ALL_CLASSIFICATIONS);
        }
        zzca.zzd zzd = (zzca.zzd) ((zzfy) zzf.zzfg());
        this.zzcv = zzd;
        this.zzct = faceDetectorV2Jni.zza(zzd, context.getAssets());
        this.zzcu = dynamiteClearcutLogger;
        this.zzcw = faceDetectorV2Jni;
    }

    public final boolean zzd(int i) throws RemoteException {
        return true;
    }

    public final void zzn() throws RemoteException {
        this.zzcw.zza(this.zzct);
    }

    public final FaceParcel[] zzc(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        zzbq zzbq;
        zzca.zzc zzc;
        float f;
        float f2;
        float f3;
        long j;
        zzcc zzcc;
        zzkf zzkf;
        LandmarkParcel[] landmarkParcelArr;
        zza[] zzaArr;
        int i;
        long j2;
        zzcc zzcc2;
        zzkf zzkf2;
        List<zzjx.zze> list;
        int i2;
        zzn zzn2 = zzn;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper);
            zzbo.zza zzj = zzbo.zzai().zzi(zzn2.width).zzj(zzn2.height);
            int i3 = zzn2.rotation;
            if (i3 == 0) {
                zzbq = zzbq.ROTATION_0;
            } else if (i3 == 1) {
                zzbq = zzbq.ROTATION_270;
            } else if (i3 == 2) {
                zzbq = zzbq.ROTATION_180;
            } else if (i3 == 3) {
                zzbq = zzbq.ROTATION_90;
            } else {
                throw new IllegalArgumentException("Unsupported rotation degree.");
            }
            zzbo.zza zzb = zzj.zzb(zzbq).zzb(zzbl.NV21);
            if (zzn2.zzat > 0) {
                zzb.zzc(zzn2.zzat);
            }
            zzbo zzbo = (zzbo) ((zzfy) zzb.zzfg());
            if (byteBuffer.isDirect()) {
                zzc = this.zzcw.zza(this.zzct, byteBuffer, zzbo);
            } else if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                zzc = this.zzcw.zza(this.zzct, bArr, zzbo);
            } else {
                zzc = this.zzcw.zza(this.zzct, byteBuffer.array(), zzbo);
            }
            zzcc zzbh = this.zzcv.zzbh();
            zzch zzbg = this.zzcv.zzbg();
            zzkf zzbe = zzc.zzbe();
            int zzip = zzbe.zzip();
            FaceParcel[] faceParcelArr = new FaceParcel[zzip];
            int i4 = 0;
            while (i4 < zzbe.zzip()) {
                zzjx zzcc3 = zzbe.zzcc(i4);
                zzjx.zzb zzhw = zzcc3.zzhw();
                float zzig = zzhw.zzig();
                float zzii = (zzhw.zzii() - zzhw.zzig()) / 2.0f;
                float zzih = zzhw.zzih();
                float zzij = (zzhw.zzij() - zzhw.zzih()) / 2.0f;
                float zzii2 = zzhw.zzii();
                float zzig2 = zzhw.zzig();
                float zzij2 = zzhw.zzij();
                float zzih2 = zzhw.zzih();
                float f4 = -1.0f;
                if (zzbh == zzcc.ALL_CLASSIFICATIONS) {
                    float f5 = -1.0f;
                    float f6 = -1.0f;
                    for (zzjx.zza next : zzcc3.zzib()) {
                        if (next.getName().equals("joy")) {
                            f4 = next.getConfidence();
                        } else if (next.getName().equals("left_eye_closed")) {
                            f5 = 1.0f - next.getConfidence();
                        } else if (next.getName().equals("right_eye_closed")) {
                            f6 = 1.0f - next.getConfidence();
                        }
                    }
                    f = f4;
                    f3 = f5;
                    f2 = f6;
                } else {
                    f3 = -1.0f;
                    f2 = -1.0f;
                    f = -1.0f;
                }
                if (zzbg == zzch.ALL_LANDMARKS) {
                    List<zzjx.zze> zzhx = zzcc3.zzhx();
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (i5 < zzhx.size()) {
                        zzjx.zze zze = zzhx.get(i5);
                        zzjx.zze.zzb zzin = zze.zzin();
                        switch (C76031.zzcx[zzin.ordinal()]) {
                            case 1:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 4;
                                break;
                            case 2:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 10;
                                break;
                            case 3:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 6;
                                break;
                            case 4:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 0;
                                break;
                            case 5:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 5;
                                break;
                            case 6:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 11;
                                break;
                            case 7:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 3;
                                break;
                            case 8:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 9;
                                break;
                            case 9:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 1;
                                break;
                            case 10:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 7;
                                break;
                            case 11:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 2;
                                break;
                            case 12:
                                j2 = elapsedRealtime;
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i2 = 8;
                                break;
                            default:
                                list = zzhx;
                                GmsLogger gmsLogger = zzcs;
                                zzkf2 = zzbe;
                                String valueOf = String.valueOf(zzin);
                                zzcc2 = zzbh;
                                j2 = elapsedRealtime;
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                                sb.append("Unknown landmark type: ");
                                sb.append(valueOf);
                                gmsLogger.mo4172d("NativeFaceDetectorV2Imp", sb.toString());
                                i2 = -1;
                                break;
                        }
                        if (i2 >= 0) {
                            arrayList.add(new LandmarkParcel(-1, zze.getX(), zze.getY(), i2));
                        }
                        i5++;
                        zzhx = list;
                        zzbe = zzkf2;
                        zzbh = zzcc2;
                        elapsedRealtime = j2;
                    }
                    j = elapsedRealtime;
                    zzkf = zzbe;
                    zzcc = zzbh;
                    landmarkParcelArr = (LandmarkParcel[]) arrayList.toArray(new LandmarkParcel[0]);
                } else {
                    j = elapsedRealtime;
                    zzkf = zzbe;
                    zzcc = zzbh;
                    landmarkParcelArr = new LandmarkParcel[0];
                }
                if (zzbg == zzch.CONTOUR_LANDMARKS) {
                    List list2 = (List) zzcc3.zzc(zzca.zziv);
                    zzaArr = new zza[list2.size()];
                    int i6 = 0;
                    while (i6 < list2.size()) {
                        zzca.zzb zzb2 = (zzca.zzb) list2.get(i6);
                        PointF[] pointFArr = new PointF[zzb2.zzba()];
                        int i7 = 0;
                        while (i7 < zzb2.zzba()) {
                            zzca.zzb.C10805zzb zzb3 = zzb2.zzaz().get(i7);
                            pointFArr[i7] = new PointF(zzb3.getX(), zzb3.getY());
                            i7++;
                            list2 = list2;
                        }
                        List list3 = list2;
                        zzca.zzb.zzc zzay = zzb2.zzay();
                        switch (C76031.zzcy[zzay.ordinal()]) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            case 3:
                                i = 3;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 5;
                                break;
                            case 6:
                                i = 6;
                                break;
                            case 7:
                                i = 7;
                                break;
                            case 8:
                                i = 8;
                                break;
                            case 9:
                                i = 9;
                                break;
                            case 10:
                                i = 10;
                                break;
                            case 11:
                                i = 11;
                                break;
                            case 12:
                                i = 12;
                                break;
                            case 13:
                                i = 13;
                                break;
                            case 14:
                            case 15:
                                GmsLogger gmsLogger2 = zzcs;
                                String valueOf2 = String.valueOf(zzay);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                                sb2.append("Intentionally ignore contour type: ");
                                sb2.append(valueOf2);
                                gmsLogger2.mo4172d("NativeFaceDetectorV2Imp", sb2.toString());
                                break;
                            default:
                                GmsLogger gmsLogger3 = zzcs;
                                String valueOf3 = String.valueOf(zzay);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                                sb3.append("Unknown contour type: ");
                                sb3.append(valueOf3);
                                gmsLogger3.mo4174e("NativeFaceDetectorV2Imp", sb3.toString());
                                break;
                        }
                        i = -1;
                        zzaArr[i6] = new zza(pointFArr, i);
                        i6++;
                        list2 = list3;
                    }
                } else {
                    zzaArr = new zza[0];
                }
                float zzhz = zzcc3.zzhz();
                faceParcelArr[i4] = new FaceParcel(3, (int) zzcc3.zzic(), zzig + zzii, zzih + zzij, zzii2 - zzig2, zzij2 - zzih2, zzhz, -zzcc3.zzhy(), zzcc3.zzia(), landmarkParcelArr, f3, f2, f, zzaArr);
                i4++;
                zzbe = zzkf;
                zzbh = zzcc;
                elapsedRealtime = j;
            }
            long j3 = elapsedRealtime;
            DynamiteClearcutLogger dynamiteClearcutLogger = this.zzcu;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzn2.f3239id <= 2 || zzip != 0) {
                dynamiteClearcutLogger.zza(3, zzl.zza(zzn2, faceParcelArr, (String) null, elapsedRealtime2 - j3));
            }
            return faceParcelArr;
        } catch (Exception e) {
            zzcs.mo4175e("NativeFaceDetectorV2Imp", "Native face detection v2 failed", e);
            return new FaceParcel[0];
        }
    }
}
