package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

/* renamed from: o.isCancelable */
public final class isCancelable extends VersionedParcel {
    private int IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final Parcel MediaBrowserCompat$ItemReceiver;
    private final SparseIntArray MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final int read;
    private int write;

    public isCancelable(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    private isCancelable(Parcel parcel, int i, int i2, String str) {
        this.MediaDescriptionCompat = new SparseIntArray();
        this.IconCompatParcelizer = -1;
        this.write = 0;
        this.MediaBrowserCompat$ItemReceiver = parcel;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = i2;
        this.write = i;
        this.MediaMetadataCompat = str;
    }

    public final void IconCompatParcelizer(int i) {
        read();
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat.put(i, this.MediaBrowserCompat$ItemReceiver.dataPosition());
        this.MediaBrowserCompat$ItemReceiver.writeInt(0);
        this.MediaBrowserCompat$ItemReceiver.writeInt(i);
    }

    public final void read() {
        int i = this.IconCompatParcelizer;
        if (i >= 0) {
            int i2 = this.MediaDescriptionCompat.get(i);
            int dataPosition = this.MediaBrowserCompat$ItemReceiver.dataPosition();
            this.MediaBrowserCompat$ItemReceiver.setDataPosition(i2);
            this.MediaBrowserCompat$ItemReceiver.writeInt(dataPosition - i2);
            this.MediaBrowserCompat$ItemReceiver.setDataPosition(dataPosition);
        }
    }

    public final VersionedParcel write() {
        Parcel parcel = this.MediaBrowserCompat$ItemReceiver;
        int dataPosition = parcel.dataPosition();
        int i = this.write;
        if (i == this.MediaBrowserCompat$CustomActionResultReceiver) {
            i = this.read;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaMetadataCompat);
        sb.append("  ");
        return new isCancelable(parcel, dataPosition, i, sb.toString());
    }

    public final void MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        if (bArr != null) {
            this.MediaBrowserCompat$ItemReceiver.writeInt(bArr.length);
            this.MediaBrowserCompat$ItemReceiver.writeByteArray(bArr);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver.writeInt(-1);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.MediaBrowserCompat$ItemReceiver.writeInt(i);
    }

    public final void write(String str) {
        this.MediaBrowserCompat$ItemReceiver.writeString(str);
    }

    public final void write(Parcelable parcelable) {
        this.MediaBrowserCompat$ItemReceiver.writeParcelable(parcelable, 0);
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.readInt();
    }

    public final String RatingCompat() {
        return this.MediaBrowserCompat$ItemReceiver.readString();
    }

    public final byte[] MediaBrowserCompat$CustomActionResultReceiver() {
        int readInt = this.MediaBrowserCompat$ItemReceiver.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.MediaBrowserCompat$ItemReceiver.readByteArray(bArr);
        return bArr;
    }

    public final <T extends Parcelable> T IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.readParcelable(getClass().getClassLoader());
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.write
            int r1 = r4.read
            r2 = -1
            if (r0 >= r1) goto L_0x0026
            android.os.Parcel r1 = r4.MediaBrowserCompat$ItemReceiver
            r1.setDataPosition(r0)
            android.os.Parcel r0 = r4.MediaBrowserCompat$ItemReceiver
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.MediaBrowserCompat$ItemReceiver
            int r1 = r1.readInt()
            int r3 = r4.write
            int r3 = r3 + r0
            r4.write = r3
            if (r1 != r5) goto L_0x0000
            android.os.Parcel r5 = r4.MediaBrowserCompat$ItemReceiver
            int r5 = r5.dataPosition()
            goto L_0x0027
        L_0x0026:
            r5 = r2
        L_0x0027:
            if (r5 != r2) goto L_0x002b
            r5 = 0
            return r5
        L_0x002b:
            android.os.Parcel r0 = r4.MediaBrowserCompat$ItemReceiver
            r0.setDataPosition(r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isCancelable.read(int):boolean");
    }
}
