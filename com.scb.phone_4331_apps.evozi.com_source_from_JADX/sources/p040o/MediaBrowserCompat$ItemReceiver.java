package p040o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* renamed from: o.MediaBrowserCompat$ItemReceiver */
public interface MediaBrowserCompat$ItemReceiver extends IInterface {
    boolean IconCompatParcelizer(long j) throws RemoteException;

    boolean IconCompatParcelizer(write write2, Uri uri) throws RemoteException;

    boolean IconCompatParcelizer(write write2, Bundle bundle) throws RemoteException;

    Bundle MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle) throws RemoteException;

    boolean MediaBrowserCompat$ItemReceiver(write write2) throws RemoteException;

    boolean read(write write2, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean read(write write2, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    int write(write write2, String str, Bundle bundle) throws RemoteException;

    /* renamed from: o.MediaBrowserCompat$ItemReceiver$write */
    public static abstract class write extends Binder implements MediaBrowserCompat$ItemReceiver {
        public write() {
            attachInterface(this, "o.MediaBrowserCompat$ItemReceiver");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.net.Uri} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r2v1 */
        /* JADX WARNING: type inference failed for: r2v21 */
        /* JADX WARNING: type inference failed for: r2v22 */
        /* JADX WARNING: type inference failed for: r2v23 */
        /* JADX WARNING: type inference failed for: r2v24 */
        /* JADX WARNING: type inference failed for: r2v25 */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                java.lang.String r0 = "o.MediaBrowserCompat$ItemReceiver"
                r1 = 1
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r2) goto L_0x014b
                r2 = 0
                switch(r5) {
                    case 2: goto L_0x0139;
                    case 3: goto L_0x0123;
                    case 4: goto L_0x00e8;
                    case 5: goto L_0x00bd;
                    case 6: goto L_0x0098;
                    case 7: goto L_0x0073;
                    case 8: goto L_0x004a;
                    case 9: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0011:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                int r8 = r6.readInt()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x002f
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.net.Uri r0 = (android.net.Uri) r0
                goto L_0x0030
            L_0x002f:
                r0 = r2
            L_0x0030:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r2.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x003f:
                boolean r5 = r4.read((p040o.write) r5, (int) r8, (android.net.Uri) r0, (android.os.Bundle) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x004a:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0068
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0068:
                int r5 = r4.write(r5, r8, r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0073:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x008d
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.net.Uri r2 = (android.net.Uri) r2
            L_0x008d:
                boolean r5 = r4.IconCompatParcelizer((p040o.write) r5, (android.net.Uri) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0098:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00b2:
                boolean r5 = r4.IconCompatParcelizer((p040o.write) r5, (android.os.Bundle) r2)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00bd:
                r6.enforceInterface(r0)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d3
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00d3:
                android.os.Bundle r5 = r4.MediaBrowserCompat$CustomActionResultReceiver(r5, r2)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00e3
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x00e7
            L_0x00e3:
                r5 = 0
                r7.writeInt(r5)
            L_0x00e7:
                return r1
            L_0x00e8:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0102
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0103
            L_0x0102:
                r8 = r2
            L_0x0103:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0112
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                r2 = r0
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0112:
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r0)
                boolean r5 = r4.read((p040o.write) r5, (android.net.Uri) r8, (android.os.Bundle) r2, (java.util.List<android.os.Bundle>) r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0123:
                r6.enforceInterface(r0)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.write r5 = p040o.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r5)
                boolean r5 = r4.MediaBrowserCompat$ItemReceiver(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0139:
                r6.enforceInterface(r0)
                long r5 = r6.readLong()
                boolean r5 = r4.IconCompatParcelizer(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x014b:
                r7.writeString(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MediaBrowserCompat$ItemReceiver.write.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }
}
