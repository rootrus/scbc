package p040o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.MediaMetadataCompat$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C6955xfad3cc42 extends Binder implements MediaMetadataCompat {
    public IBinder asBinder() {
        return this;
    }

    public C6955xfad3cc42() {
        attachInterface(this, "o.MediaMetadataCompat");
    }

    public static MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("o.MediaMetadataCompat");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof MediaMetadataCompat)) {
            return new C6956x4ab2fe5e(iBinder);
        }
        return (MediaMetadataCompat) queryLocalInterface;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
        /*
            r4 = this;
            java.lang.String r0 = "o.MediaMetadataCompat"
            r1 = 1
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 == r2) goto L_0x00e7
            r2 = 0
            r3 = 0
            switch(r5) {
                case 1: goto L_0x00cd;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00b0;
                case 4: goto L_0x009a;
                case 5: goto L_0x008d;
                case 6: goto L_0x0077;
                case 7: goto L_0x0061;
                case 8: goto L_0x004b;
                case 9: goto L_0x0040;
                case 10: goto L_0x0032;
                case 11: goto L_0x0024;
                case 12: goto L_0x0019;
                case 13: goto L_0x0012;
                default: goto L_0x000d;
            }
        L_0x000d:
            boolean r5 = super.onTransact(r5, r6, r7, r8)
            return r5
        L_0x0012:
            r6.enforceInterface(r0)
            r4.MediaBrowserCompat$CustomActionResultReceiver()
            return r1
        L_0x0019:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            r4.MediaBrowserCompat$ItemReceiver((int) r5)
            return r1
        L_0x0024:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x002e
            r2 = r1
        L_0x002e:
            r4.IconCompatParcelizer((boolean) r2)
            return r1
        L_0x0032:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x003c
            r2 = r1
        L_0x003c:
            r4.read((boolean) r2)
            return r1
        L_0x0040:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            r4.write(r5)
            return r1
        L_0x004b:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x005d
            android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.p044v4.media.session.ParcelableVolumeInfo.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.p044v4.media.session.ParcelableVolumeInfo) r3
        L_0x005d:
            r4.IconCompatParcelizer((android.support.p044v4.media.session.ParcelableVolumeInfo) r3)
            return r1
        L_0x0061:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x0073
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.os.Bundle r3 = (android.os.Bundle) r3
        L_0x0073:
            r4.read((android.os.Bundle) r3)
            return r1
        L_0x0077:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x0089
            android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L_0x0089:
            r4.read((java.lang.CharSequence) r3)
            return r1
        L_0x008d:
            r6.enforceInterface(r0)
            android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.p044v4.media.session.MediaSessionCompat.QueueItem.CREATOR
            java.util.ArrayList r5 = r6.createTypedArrayList(r5)
            r4.read((java.util.List<android.support.p044v4.media.session.MediaSessionCompat.QueueItem>) r5)
            return r1
        L_0x009a:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x00ac
            android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.p044v4.media.MediaMetadataCompat.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.support.v4.media.MediaMetadataCompat r3 = (android.support.p044v4.media.MediaMetadataCompat) r3
        L_0x00ac:
            r4.IconCompatParcelizer((android.support.p044v4.media.MediaMetadataCompat) r3)
            return r1
        L_0x00b0:
            r6.enforceInterface(r0)
            int r5 = r6.readInt()
            if (r5 == 0) goto L_0x00c2
            android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.p044v4.media.session.PlaybackStateCompat.CREATOR
            java.lang.Object r5 = r5.createFromParcel(r6)
            r3 = r5
            android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.p044v4.media.session.PlaybackStateCompat) r3
        L_0x00c2:
            r4.MediaBrowserCompat$ItemReceiver((android.support.p044v4.media.session.PlaybackStateCompat) r3)
            return r1
        L_0x00c6:
            r6.enforceInterface(r0)
            r4.write()
            return r1
        L_0x00cd:
            r6.enforceInterface(r0)
            java.lang.String r5 = r6.readString()
            int r7 = r6.readInt()
            if (r7 == 0) goto L_0x00e3
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            java.lang.Object r6 = r7.createFromParcel(r6)
            r3 = r6
            android.os.Bundle r3 = (android.os.Bundle) r3
        L_0x00e3:
            r4.read(r5, r3)
            return r1
        L_0x00e7:
            r7.writeString(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6955xfad3cc42.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
