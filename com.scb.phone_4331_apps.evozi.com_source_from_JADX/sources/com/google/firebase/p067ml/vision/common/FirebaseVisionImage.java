package com.google.firebase.p067ml.vision.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzpv;
import com.google.android.gms.internal.firebase_ml.zzpx;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImageMetadata;
import java.nio.ByteBuffer;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImage */
public class FirebaseVisionImage {
    private static zzpx zzaxa = zzpx.zznk();
    private volatile Bitmap zzaxb;
    private volatile ByteBuffer zzaxc;
    private volatile FirebaseVisionImageMetadata zzaxd;
    private volatile Frame zzaxe;
    private volatile byte[] zzaxf;
    private final long zzaxg = SystemClock.elapsedRealtime();

    public static FirebaseVisionImage fromByteBuffer(ByteBuffer byteBuffer, FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        return new FirebaseVisionImage(byteBuffer, firebaseVisionImageMetadata);
    }

    private FirebaseVisionImage(ByteBuffer byteBuffer, FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.zzaxc = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        this.zzaxd = (FirebaseVisionImageMetadata) Preconditions.checkNotNull(firebaseVisionImageMetadata);
    }

    public Bitmap getBitmapForDebugging() {
        return zznj();
    }

    private final Bitmap zznj() {
        if (this.zzaxb != null) {
            return this.zzaxb;
        }
        synchronized (this) {
            if (this.zzaxb == null) {
                byte[] zzae = zzae(false);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(zzae, 0, zzae.length);
                if (this.zzaxd != null) {
                    decodeByteArray = zza(decodeByteArray, this.zzaxd.getRotation());
                }
                this.zzaxb = decodeByteArray;
            }
        }
        return this.zzaxb;
    }

    private static Bitmap zza(Bitmap bitmap, int i) {
        int zzbm = zzpv.zzbm(i);
        if (zzbm == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) zzbm);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final Pair<byte[], Float> zze(int i, int i2) {
        int i3;
        int i4;
        byte[] bArr;
        if (this.zzaxd != null) {
            boolean z = this.zzaxd.getRotation() == 1 || this.zzaxd.getRotation() == 3;
            FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.zzaxd;
            i3 = z ? firebaseVisionImageMetadata.getHeight() : firebaseVisionImageMetadata.getWidth();
            i4 = z ? this.zzaxd.getWidth() : this.zzaxd.getHeight();
        } else {
            i3 = zznj().getWidth();
            i4 = zznj().getHeight();
        }
        float min = Math.min(((float) i) / ((float) i3), ((float) i2) / ((float) i4));
        if (min < 1.0f) {
            Bitmap zznj = zznj();
            Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            bArr = zzpx.zza(Bitmap.createBitmap(zznj, 0, 0, this.zzaxb.getWidth(), this.zzaxb.getHeight(), matrix, true));
        } else {
            bArr = zzae(true);
            min = 1.0f;
        }
        return Pair.create(bArr, Float.valueOf(min));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] zzae(boolean r3) {
        /*
            r2 = this;
            byte[] r0 = r2.zzaxf
            if (r0 == 0) goto L_0x0007
            byte[] r3 = r2.zzaxf
            return r3
        L_0x0007:
            monitor-enter(r2)
            byte[] r0 = r2.zzaxf     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0010
            byte[] r3 = r2.zzaxf     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            return r3
        L_0x0010:
            java.nio.ByteBuffer r0 = r2.zzaxc     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x001e
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r3 = r2.zzaxd     // Catch:{ all -> 0x0068 }
            int r3 = r3.getRotation()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x005c
        L_0x001e:
            java.nio.ByteBuffer r3 = r2.zzaxc     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzpx.zza((java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzaxd     // Catch:{ all -> 0x0068 }
            int r0 = r0.getFormat()     // Catch:{ all -> 0x0068 }
            r1 = 17
            if (r0 == r1) goto L_0x0040
            r1 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 != r1) goto L_0x0038
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzpx.zzf(r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0040
        L_0x0038:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12"
            r3.<init>(r0)     // Catch:{ all -> 0x0068 }
            throw r3     // Catch:{ all -> 0x0068 }
        L_0x0040:
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzaxd     // Catch:{ all -> 0x0068 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r1 = r2.zzaxd     // Catch:{ all -> 0x0068 }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzpx.zza((byte[]) r3, (int) r0, (int) r1)     // Catch:{ all -> 0x0068 }
            com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r0 = r2.zzaxd     // Catch:{ all -> 0x0068 }
            int r0 = r0.getRotation()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x005a
            r2.zzaxf = r3     // Catch:{ all -> 0x0068 }
        L_0x005a:
            monitor-exit(r2)
            return r3
        L_0x005c:
            android.graphics.Bitmap r3 = r2.zznj()     // Catch:{ all -> 0x0068 }
            byte[] r3 = com.google.android.gms.internal.firebase_ml.zzpx.zza((android.graphics.Bitmap) r3)     // Catch:{ all -> 0x0068 }
            r2.zzaxf = r3     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)
            return r3
        L_0x0068:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.p067ml.vision.common.FirebaseVisionImage.zzae(boolean):byte[]");
    }

    public final Frame zza(boolean z, boolean z2) {
        Frame frame;
        synchronized (this) {
            int i = 0;
            Preconditions.checkArgument(!z || !z2, "Can't restrict to bitmap-only and NV21 byte buffer-only");
            if (this.zzaxe == null) {
                Frame.Builder builder = new Frame.Builder();
                if (this.zzaxc == null || z) {
                    builder.setBitmap(zznj());
                } else {
                    int i2 = 842094169;
                    if (z2 && this.zzaxd.getFormat() != 17) {
                        if (this.zzaxd.getFormat() == 842094169) {
                            this.zzaxc = ByteBuffer.wrap(zzpx.zzf(zzpx.zza(this.zzaxc)));
                            this.zzaxd = new FirebaseVisionImageMetadata.Builder().setFormat(17).setWidth(this.zzaxd.getWidth()).setHeight(this.zzaxd.getHeight()).setRotation(this.zzaxd.getRotation()).build();
                        } else {
                            throw new IllegalStateException("Must be one of: IMAGE_FORMAT_NV21, IMAGE_FORMAT_YV12");
                        }
                    }
                    ByteBuffer byteBuffer = this.zzaxc;
                    int width = this.zzaxd.getWidth();
                    int height = this.zzaxd.getHeight();
                    int format = this.zzaxd.getFormat();
                    if (format == 17) {
                        i2 = 17;
                    } else if (format != 842094169) {
                        i2 = 0;
                    }
                    builder.setImageData(byteBuffer, width, height, i2);
                    int rotation = this.zzaxd.getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i = 1;
                        } else if (rotation == 2) {
                            i = 2;
                        } else if (rotation == 3) {
                            i = 3;
                        } else {
                            StringBuilder sb = new StringBuilder(29);
                            sb.append("Invalid rotation: ");
                            sb.append(rotation);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    builder.setRotation(i);
                }
                builder.setTimestampMillis(this.zzaxg);
                this.zzaxe = builder.build();
            }
            frame = this.zzaxe;
        }
        return frame;
    }
}
