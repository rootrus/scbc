package p040o;

import android.database.Cursor;
import java.util.ArrayList;
import p040o.nAllocationGetStride;

/* renamed from: o.CTRSM */
public final class CTRSM implements nAllocationGetStride.write {
    public static final CTRSM MediaBrowserCompat$ItemReceiver = new CTRSM();

    private CTRSM() {
    }

    public final Object read(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }
}
