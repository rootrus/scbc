package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: o.rsnScriptCCreate */
public final class rsnScriptCCreate {
    private static final int[] read = {3808, 476, 2107, 1799};
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$SearchResultReceiver;
    private int RatingCompat;
    private final rsnScriptSetVarI write;

    public rsnScriptCCreate(rsnScriptSetVarI rsnscriptsetvari) {
        this.write = rsnscriptsetvari;
    }

    public final rsnScriptForEachClipped write(boolean z) throws NotFoundException {
        long j;
        long j2;
        rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver;
        rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver read2 = read();
        int i = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = 1;
        rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2 = read2;
        rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2;
        rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3;
        boolean z2 = true;
        while (this.MediaBrowserCompat$CustomActionResultReceiver < 9) {
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer2 = IconCompatParcelizer(read2, z2, i, -1);
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer3 = IconCompatParcelizer(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2, z2, i, i);
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer4 = IconCompatParcelizer(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3, z2, -1, i);
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer5 = IconCompatParcelizer(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4, z2, -1, -1);
            if (this.MediaBrowserCompat$CustomActionResultReceiver > 2) {
                double IconCompatParcelizer6 = (double) ((IconCompatParcelizer(IconCompatParcelizer5, IconCompatParcelizer2) * ((float) this.MediaBrowserCompat$CustomActionResultReceiver)) / (IconCompatParcelizer(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4, read2) * ((float) (this.MediaBrowserCompat$CustomActionResultReceiver + 2))));
                if (IconCompatParcelizer6 < 0.75d || IconCompatParcelizer6 > 1.25d) {
                    break;
                }
                rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver5 = new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2.IconCompatParcelizer - 3, IconCompatParcelizer2.write + 3);
                rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver6 = new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3.IconCompatParcelizer - 3, IconCompatParcelizer3.write - 3);
                rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver7 = new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer4.IconCompatParcelizer + 3, IconCompatParcelizer4.write - 3);
                rsnscriptccreate_mediabrowsercompat_customactionresultreceiver = IconCompatParcelizer2;
                rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver8 = new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer5.IconCompatParcelizer + 3, IconCompatParcelizer5.write + 3);
                int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver8, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver5);
                if (!(MediaBrowserCompat$ItemReceiver2 != 0 && MediaBrowserCompat$ItemReceiver(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver5, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver6) == MediaBrowserCompat$ItemReceiver2 && MediaBrowserCompat$ItemReceiver(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver6, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver7) == MediaBrowserCompat$ItemReceiver2 && MediaBrowserCompat$ItemReceiver(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver7, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver8) == MediaBrowserCompat$ItemReceiver2)) {
                    break;
                }
            } else {
                rsnscriptccreate_mediabrowsercompat_customactionresultreceiver = IconCompatParcelizer2;
            }
            z2 = !z2;
            this.MediaBrowserCompat$CustomActionResultReceiver++;
            rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4 = IconCompatParcelizer5;
            rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2 = IconCompatParcelizer3;
            rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3 = IconCompatParcelizer4;
            read2 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver;
            i = 1;
        }
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 == 5 || i2 == 7) {
            this.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver == 5;
            float f = 0.5f;
            rsnScriptForEach[] rsnscriptforeachArr = {new rsnScriptForEach(((float) read2.IconCompatParcelizer) + 0.5f, ((float) read2.write) - 0.5f), new rsnScriptForEach(((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer) + 0.5f, ((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.write) + 0.5f), new rsnScriptForEach(((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3.IconCompatParcelizer) - 0.5f, ((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver3.write) + 0.5f), new rsnScriptForEach(((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4.IconCompatParcelizer) - 0.5f, ((float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver4.write) - 0.5f)};
            int i3 = this.MediaBrowserCompat$CustomActionResultReceiver << 1;
            rsnScriptForEach[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(rsnscriptforeachArr, (float) (i3 - 3), (float) i3);
            if (z) {
                rsnScriptForEach rsnscriptforeach = MediaBrowserCompat$CustomActionResultReceiver2[0];
                MediaBrowserCompat$CustomActionResultReceiver2[0] = MediaBrowserCompat$CustomActionResultReceiver2[2];
                MediaBrowserCompat$CustomActionResultReceiver2[2] = rsnscriptforeach;
            }
            rsnScriptForEach rsnscriptforeach2 = MediaBrowserCompat$CustomActionResultReceiver2[0];
            float f2 = rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver;
            int i4 = (int) (f2 + (f2 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
            float f3 = rsnscriptforeach2.read;
            if (IconCompatParcelizer(i4, (int) (f3 + (f3 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f)))) {
                rsnScriptForEach rsnscriptforeach3 = MediaBrowserCompat$CustomActionResultReceiver2[1];
                float f4 = rsnscriptforeach3.MediaBrowserCompat$CustomActionResultReceiver;
                int i5 = (int) (f4 + (f4 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
                float f5 = rsnscriptforeach3.read;
                if (IconCompatParcelizer(i5, (int) (f5 + (f5 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f)))) {
                    rsnScriptForEach rsnscriptforeach4 = MediaBrowserCompat$CustomActionResultReceiver2[2];
                    float f6 = rsnscriptforeach4.MediaBrowserCompat$CustomActionResultReceiver;
                    int i6 = (int) (f6 + (f6 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
                    float f7 = rsnscriptforeach4.read;
                    if (IconCompatParcelizer(i6, (int) (f7 + (f7 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f)))) {
                        rsnScriptForEach rsnscriptforeach5 = MediaBrowserCompat$CustomActionResultReceiver2[3];
                        float f8 = rsnscriptforeach5.MediaBrowserCompat$CustomActionResultReceiver;
                        int i7 = (int) (f8 + (f8 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
                        float f9 = rsnscriptforeach5.read;
                        if (f9 < BitmapDescriptorFactory.HUE_RED) {
                            f = -0.5f;
                        }
                        if (IconCompatParcelizer(i7, (int) (f9 + f))) {
                            int i8 = this.MediaBrowserCompat$CustomActionResultReceiver << 1;
                            int[] iArr = {IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2[0], MediaBrowserCompat$CustomActionResultReceiver2[1], i8), IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2[1], MediaBrowserCompat$CustomActionResultReceiver2[2], i8), IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2[2], MediaBrowserCompat$CustomActionResultReceiver2[3], i8), IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2[3], MediaBrowserCompat$CustomActionResultReceiver2[0], i8)};
                            int i9 = 0;
                            for (int i10 = 0; i10 < 4; i10++) {
                                int i11 = iArr[i10];
                                i9 = (i9 << 3) + ((i11 >> (i8 - 2)) << 1) + (i11 & 1);
                            }
                            for (int i12 = 0; i12 < 4; i12++) {
                                if (Integer.bitCount(read[i12] ^ (((i9 & 1) << 11) + (i9 >> 1))) <= 2) {
                                    this.RatingCompat = i12;
                                    long j3 = 0;
                                    for (int i13 = 0; i13 < 4; i13++) {
                                        int i14 = iArr[(this.RatingCompat + i13) % 4];
                                        if (this.IconCompatParcelizer) {
                                            j2 = j3 << 7;
                                            j = (long) ((i14 >> 1) & 127);
                                        } else {
                                            j2 = j3 << 10;
                                            j = (long) (((i14 >> 2) & 992) + ((i14 >> 1) & 31));
                                        }
                                        j3 = j2 + j;
                                    }
                                    int MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(j3, this.IconCompatParcelizer);
                                    if (this.IconCompatParcelizer) {
                                        this.MediaBrowserCompat$SearchResultReceiver = (MediaBrowserCompat$CustomActionResultReceiver3 >> 6) + 1;
                                        this.MediaBrowserCompat$ItemReceiver = (MediaBrowserCompat$CustomActionResultReceiver3 & 63) + 1;
                                    } else {
                                        this.MediaBrowserCompat$SearchResultReceiver = (MediaBrowserCompat$CustomActionResultReceiver3 >> 11) + 1;
                                        this.MediaBrowserCompat$ItemReceiver = (MediaBrowserCompat$CustomActionResultReceiver3 & 2047) + 1;
                                    }
                                    rsnScriptSetVarI rsnscriptsetvari = this.write;
                                    int i15 = this.RatingCompat;
                                    rsnScriptForEach rsnscriptforeach6 = MediaBrowserCompat$CustomActionResultReceiver2[i15 % 4];
                                    rsnScriptForEach rsnscriptforeach7 = MediaBrowserCompat$CustomActionResultReceiver2[(i15 + 1) % 4];
                                    rsnScriptForEach rsnscriptforeach8 = MediaBrowserCompat$CustomActionResultReceiver2[(i15 + 2) % 4];
                                    rsnScriptForEach rsnscriptforeach9 = MediaBrowserCompat$CustomActionResultReceiver2[(i15 + 3) % 4];
                                    rsnScriptReduce MediaBrowserCompat$CustomActionResultReceiver4 = rsnScriptReduce.MediaBrowserCompat$CustomActionResultReceiver();
                                    int MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver();
                                    int i16 = MediaBrowserCompat$CustomActionResultReceiver5;
                                    int i17 = MediaBrowserCompat$CustomActionResultReceiver5;
                                    float f10 = ((float) MediaBrowserCompat$CustomActionResultReceiver5) / 2.0f;
                                    float f11 = (float) this.MediaBrowserCompat$CustomActionResultReceiver;
                                    float f12 = f10 - f11;
                                    float f13 = f10 + f11;
                                    return new rsnScriptForEachClipped(MediaBrowserCompat$CustomActionResultReceiver4.IconCompatParcelizer(rsnscriptsetvari, i17, i16, f12, f12, f13, f12, f13, f13, f12, f13, rsnscriptforeach6.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach6.read, rsnscriptforeach7.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach7.read, rsnscriptforeach8.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach8.read, rsnscriptforeach9.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach9.read), MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2, (float) (this.MediaBrowserCompat$CustomActionResultReceiver << 1), (float) MediaBrowserCompat$CustomActionResultReceiver()), this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver);
                                }
                            }
                            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                }
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int[] iArr = new int[i];
        for (int i3 = i - 1; i3 >= 0; i3--) {
            iArr[i3] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new setLogLevel$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarObj.read).MediaBrowserCompat$ItemReceiver(iArr, i - i2);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 = (i4 << 4) + iArr[i5];
            }
            return i4;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver read() {
        rsnScriptForEach rsnscriptforeach;
        rsnScriptForEach rsnscriptforeach2;
        rsnScriptForEach rsnscriptforeach3;
        rsnScriptForEach rsnscriptforeach4;
        rsnScriptForEach rsnscriptforeach5;
        rsnScriptForEach rsnscriptforeach6;
        rsnScriptForEach rsnscriptforeach7;
        rsnScriptForEach rsnscriptforeach8;
        try {
            rsnScriptForEach[] write2 = new onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver(this.write).write();
            rsnscriptforeach3 = write2[0];
            rsnscriptforeach2 = write2[1];
            rsnscriptforeach = write2[2];
            rsnscriptforeach4 = write2[3];
        } catch (NotFoundException unused) {
            int i = this.write.IconCompatParcelizer / 2;
            int i2 = this.write.write / 2;
            int i3 = i + 7;
            int i4 = i2 - 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer2 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i3, i4), false, 1, -1);
            rsnScriptForEach rsnscriptforeach9 = new rsnScriptForEach((float) IconCompatParcelizer2.IconCompatParcelizer, (float) IconCompatParcelizer2.write);
            int i5 = i2 + 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer3 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i3, i5), false, 1, 1);
            rsnScriptForEach rsnscriptforeach10 = new rsnScriptForEach((float) IconCompatParcelizer3.IconCompatParcelizer, (float) IconCompatParcelizer3.write);
            int i6 = i - 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer4 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i6, i5), false, -1, 1);
            rsnScriptForEach rsnscriptforeach11 = new rsnScriptForEach((float) IconCompatParcelizer4.IconCompatParcelizer, (float) IconCompatParcelizer4.write);
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer5 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i6, i4), false, -1, -1);
            rsnscriptforeach4 = new rsnScriptForEach((float) IconCompatParcelizer5.IconCompatParcelizer, (float) IconCompatParcelizer5.write);
            rsnscriptforeach = rsnscriptforeach11;
            rsnscriptforeach2 = rsnscriptforeach10;
            rsnscriptforeach3 = rsnscriptforeach9;
        }
        float f = (((rsnscriptforeach3.MediaBrowserCompat$CustomActionResultReceiver + rsnscriptforeach4.MediaBrowserCompat$CustomActionResultReceiver) + rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver) + rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver) / 4.0f;
        float f2 = -0.5f;
        int i7 = (int) (f + (f < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
        float f3 = (((rsnscriptforeach3.read + rsnscriptforeach4.read) + rsnscriptforeach2.read) + rsnscriptforeach.read) / 4.0f;
        int i8 = (int) (f3 + (f3 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
        try {
            rsnScriptForEach[] write3 = new onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver(this.write, 15, i7, i8).write();
            rsnscriptforeach6 = write3[0];
            rsnscriptforeach5 = write3[1];
            rsnscriptforeach7 = write3[2];
            rsnscriptforeach8 = write3[3];
        } catch (NotFoundException unused2) {
            int i9 = i7 + 7;
            int i10 = i8 - 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer6 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i9, i10), false, 1, -1);
            rsnscriptforeach6 = new rsnScriptForEach((float) IconCompatParcelizer6.IconCompatParcelizer, (float) IconCompatParcelizer6.write);
            int i11 = i8 + 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer7 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i9, i11), false, 1, 1);
            rsnscriptforeach5 = new rsnScriptForEach((float) IconCompatParcelizer7.IconCompatParcelizer, (float) IconCompatParcelizer7.write);
            int i12 = i7 - 7;
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer8 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i12, i11), false, -1, 1);
            rsnScriptForEach rsnscriptforeach12 = new rsnScriptForEach((float) IconCompatParcelizer8.IconCompatParcelizer, (float) IconCompatParcelizer8.write);
            rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer9 = IconCompatParcelizer(new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i12, i10), false, -1, -1);
            rsnscriptforeach8 = new rsnScriptForEach((float) IconCompatParcelizer9.IconCompatParcelizer, (float) IconCompatParcelizer9.write);
            rsnscriptforeach7 = rsnscriptforeach12;
        }
        float f4 = (((rsnscriptforeach6.MediaBrowserCompat$CustomActionResultReceiver + rsnscriptforeach8.MediaBrowserCompat$CustomActionResultReceiver) + rsnscriptforeach5.MediaBrowserCompat$CustomActionResultReceiver) + rsnscriptforeach7.MediaBrowserCompat$CustomActionResultReceiver) / 4.0f;
        int i13 = (int) (f4 + (f4 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
        float f5 = (((rsnscriptforeach6.read + rsnscriptforeach8.read) + rsnscriptforeach5.read) + rsnscriptforeach7.read) / 4.0f;
        if (f5 >= BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.5f;
        }
        return new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i13, (int) (f5 + f2));
    }

    private int IconCompatParcelizer(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2, int i) {
        float write2 = write(rsnscriptforeach, rsnscriptforeach2);
        float f = write2 / ((float) i);
        float f2 = rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver;
        float f3 = rsnscriptforeach.read;
        float f4 = ((rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver - rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver) * f) / write2;
        float f5 = (f * (rsnscriptforeach2.read - rsnscriptforeach.read)) / write2;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            rsnScriptSetVarI rsnscriptsetvari = this.write;
            float f6 = (float) i3;
            float f7 = (f6 * f4) + f2;
            float f8 = -0.5f;
            int i4 = (int) (f7 + (f7 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
            float f9 = (f6 * f5) + f3;
            if (f9 >= BitmapDescriptorFactory.HUE_RED) {
                f8 = 0.5f;
            }
            if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i4, (int) (f9 + f8))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private int MediaBrowserCompat$ItemReceiver(rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver, rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2) {
        float IconCompatParcelizer2 = IconCompatParcelizer(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2);
        float f = ((float) (rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer - rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer)) / IconCompatParcelizer2;
        float f2 = ((float) (rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.write - rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.write)) / IconCompatParcelizer2;
        float f3 = (float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        float f4 = (float) rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.write;
        boolean MediaBrowserCompat$ItemReceiver2 = this.write.MediaBrowserCompat$ItemReceiver(rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer, rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.write);
        int ceil = (int) Math.ceil((double) IconCompatParcelizer2);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            f3 += f;
            f4 += f2;
            rsnScriptSetVarI rsnscriptsetvari = this.write;
            float f5 = -0.5f;
            int i3 = (int) ((f3 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f) + f3);
            if (f4 >= BitmapDescriptorFactory.HUE_RED) {
                f5 = 0.5f;
            }
            if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i3, (int) (f5 + f4)) != MediaBrowserCompat$ItemReceiver2) {
                i++;
            }
        }
        float f6 = ((float) i) / IconCompatParcelizer2;
        if (f6 > 0.1f && f6 < 0.9f) {
            return 0;
        }
        if (f6 <= 0.1f) {
            z = true;
        }
        return z == MediaBrowserCompat$ItemReceiver2 ? 1 : -1;
    }

    private static rsnScriptForEach[] MediaBrowserCompat$CustomActionResultReceiver(rsnScriptForEach[] rsnscriptforeachArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float f4 = rsnscriptforeachArr[0].MediaBrowserCompat$CustomActionResultReceiver;
        float f5 = rsnscriptforeachArr[2].MediaBrowserCompat$CustomActionResultReceiver;
        float f6 = rsnscriptforeachArr[0].read;
        float f7 = rsnscriptforeachArr[2].read;
        float f8 = (rsnscriptforeachArr[0].MediaBrowserCompat$CustomActionResultReceiver + rsnscriptforeachArr[2].MediaBrowserCompat$CustomActionResultReceiver) / 2.0f;
        float f9 = (rsnscriptforeachArr[0].read + rsnscriptforeachArr[2].read) / 2.0f;
        float f10 = (f4 - f5) * f3;
        float f11 = (f6 - f7) * f3;
        rsnScriptForEach rsnscriptforeach = new rsnScriptForEach(f8 + f10, f9 + f11);
        rsnScriptForEach rsnscriptforeach2 = new rsnScriptForEach(f8 - f10, f9 - f11);
        float f12 = rsnscriptforeachArr[1].MediaBrowserCompat$CustomActionResultReceiver;
        float f13 = rsnscriptforeachArr[3].MediaBrowserCompat$CustomActionResultReceiver;
        float f14 = rsnscriptforeachArr[1].read;
        float f15 = rsnscriptforeachArr[3].read;
        float f16 = (rsnscriptforeachArr[1].MediaBrowserCompat$CustomActionResultReceiver + rsnscriptforeachArr[3].MediaBrowserCompat$CustomActionResultReceiver) / 2.0f;
        float f17 = (rsnscriptforeachArr[1].read + rsnscriptforeachArr[3].read) / 2.0f;
        float f18 = (f12 - f13) * f3;
        float f19 = f3 * (f14 - f15);
        return new rsnScriptForEach[]{rsnscriptforeach, new rsnScriptForEach(f16 + f18, f17 + f19), rsnscriptforeach2, new rsnScriptForEach(f16 - f18, f17 - f19)};
    }

    private boolean IconCompatParcelizer(int i, int i2) {
        return i >= 0 && i < this.write.IconCompatParcelizer && i2 > 0 && i2 < this.write.write;
    }

    private int MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.IconCompatParcelizer) {
            return (this.MediaBrowserCompat$SearchResultReceiver << 2) + 11;
        }
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        if (i <= 4) {
            return (i << 2) + 15;
        }
        return (i << 2) + ((((i - 4) / 8) + 1) << 1) + 15;
    }

    private static float write(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2) {
        float f = rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver;
        float f2 = rsnscriptforeach.read;
        float f3 = f - rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver;
        float f4 = f2 - rsnscriptforeach2.read;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    private static float IconCompatParcelizer(rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver, rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2) {
        int i = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        int i2 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.write;
        int i3 = i - rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer;
        int i4 = i2 - rsnscriptccreate_mediabrowsercompat_customactionresultreceiver2.write;
        return (float) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
    }

    private rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver rsnscriptccreate_mediabrowsercompat_customactionresultreceiver, boolean z, int i, int i2) {
        int i3 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer + i;
        int i4 = rsnscriptccreate_mediabrowsercompat_customactionresultreceiver.write;
        while (true) {
            i4 += i2;
            if (!IconCompatParcelizer(i3, i4) || this.write.MediaBrowserCompat$ItemReceiver(i3, i4) != z) {
                int i5 = i3 - i;
                int i6 = i4 - i2;
            } else {
                i3 += i;
            }
        }
        int i52 = i3 - i;
        int i62 = i4 - i2;
        while (IconCompatParcelizer(i52, i62) && this.write.MediaBrowserCompat$ItemReceiver(i52, i62) == z) {
            i52 += i;
        }
        int i7 = i52 - i;
        while (IconCompatParcelizer(i7, i62) && this.write.MediaBrowserCompat$ItemReceiver(i7, i62) == z) {
            i62 += i2;
        }
        return new rsnScriptCCreate$MediaBrowserCompat$CustomActionResultReceiver(i7, i62 - i2);
    }
}
