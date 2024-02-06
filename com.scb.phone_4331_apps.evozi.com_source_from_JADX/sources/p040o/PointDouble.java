package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p040o.getConnectionStatusCode;
import p040o.getMaskAnimations;
import p040o.safeID;
import p040o.zzct;

/* renamed from: o.PointDouble */
public interface PointDouble extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
    void MediaBrowserCompat$CustomActionResultReceiver(immediateFailedFuture immediatefailedfuture);

    void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    void MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$ItemReceiver(immediateFailedCheckedFuture immediatefailedcheckedfuture, zzct.zza zza);

    void MediaBrowserCompat$ItemReceiver(boolean z);

    void read();

    void read(immediateFailedCheckedFuture immediatefailedcheckedfuture, zzct.zza zza);

    void write();

    /* renamed from: o.PointDouble$read */
    public static final class read {
        private final setLogLevel$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new setLogLevel$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarObj.MediaBrowserCompat$SearchResultReceiver);

        private void write(byte[] bArr, int i) throws ChecksumException {
            int length = bArr.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = bArr[i2] & 255;
            }
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(iArr, bArr.length - i);
                for (int i3 = 0; i3 < i; i3++) {
                    bArr[i3] = (byte) iArr[i3];
                }
            } catch (ReedSolomonException unused) {
                throw ChecksumException.write();
            }
        }

        public final getMaskAnimations.read MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari) throws FormatException, ChecksumException {
            getConnectionStatusCode.read read = new getConnectionStatusCode.read(rsnscriptsetvari);
            safeID safeid = read.read;
            byte[] IconCompatParcelizer = read.IconCompatParcelizer();
            safeID$MediaBrowserCompat$ItemReceiver safeid_mediabrowsercompat_itemreceiver = safeid.IconCompatParcelizer;
            safeID.IconCompatParcelizer[] iconCompatParcelizerArr = safeid_mediabrowsercompat_itemreceiver.read;
            int i = 0;
            for (safeID.IconCompatParcelizer iconCompatParcelizer : iconCompatParcelizerArr) {
                i += iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            }
            getFamilyName$MediaBrowserCompat$ItemReceiver[] getfamilyname_mediabrowsercompat_itemreceiverArr = new getFamilyName$MediaBrowserCompat$ItemReceiver[i];
            int i2 = 0;
            for (safeID.IconCompatParcelizer iconCompatParcelizer2 : iconCompatParcelizerArr) {
                int i3 = 0;
                while (i3 < iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver) {
                    int i4 = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
                    getfamilyname_mediabrowsercompat_itemreceiverArr[i2] = new getFamilyName$MediaBrowserCompat$ItemReceiver(i4, new byte[(safeid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver + i4)]);
                    i3++;
                    i2++;
                }
            }
            int length = getfamilyname_mediabrowsercompat_itemreceiverArr[0].IconCompatParcelizer.length - safeid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
            int i5 = length - 1;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    getfamilyname_mediabrowsercompat_itemreceiverArr[i8].IconCompatParcelizer[i7] = IconCompatParcelizer[i6];
                    i8++;
                    i6++;
                }
            }
            boolean z = safeid.MediaMetadataCompat == 24;
            int i9 = z ? 8 : i2;
            int i10 = 0;
            while (i10 < i9) {
                getfamilyname_mediabrowsercompat_itemreceiverArr[i10].IconCompatParcelizer[i5] = IconCompatParcelizer[i6];
                i10++;
                i6++;
            }
            int length2 = getfamilyname_mediabrowsercompat_itemreceiverArr[0].IconCompatParcelizer.length;
            while (length < length2) {
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i11 + 8) % i2 : i11;
                    getfamilyname_mediabrowsercompat_itemreceiverArr[i12].IconCompatParcelizer[(!z || i12 <= 7) ? length : length - 1] = IconCompatParcelizer[i6];
                    i11++;
                    i6++;
                }
                length++;
            }
            if (i6 == IconCompatParcelizer.length) {
                int i13 = 0;
                for (int i14 = 0; i14 < i; i14++) {
                    i13 += getfamilyname_mediabrowsercompat_itemreceiverArr[i14].write;
                }
                byte[] bArr = new byte[i13];
                for (int i15 = 0; i15 < i; i15++) {
                    getFamilyName$MediaBrowserCompat$ItemReceiver getfamilyname_mediabrowsercompat_itemreceiver = getfamilyname_mediabrowsercompat_itemreceiverArr[i15];
                    byte[] bArr2 = getfamilyname_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                    int i16 = getfamilyname_mediabrowsercompat_itemreceiver.write;
                    write(bArr2, i16);
                    for (int i17 = 0; i17 < i16; i17++) {
                        bArr[(i17 * i) + i15] = bArr2[i17];
                    }
                }
                return rsnScriptSetVarVE.MediaBrowserCompat$ItemReceiver(bArr);
            }
            throw new IllegalArgumentException();
        }
    }
}
