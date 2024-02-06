package p040o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.p044v4.media.MediaDescriptionCompat;
import android.support.p044v4.media.MediaMetadataCompat;
import android.support.p044v4.media.RatingCompat;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.support.p044v4.media.session.ParcelableVolumeInfo;
import android.support.p044v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: o.MediaBrowserCompat$MediaItem */
public interface MediaBrowserCompat$MediaItem extends IInterface {
    boolean AlertController$RecycleListView() throws RemoteException;

    void AppCompatActivity() throws RemoteException;

    void AppCompatDelegateImpl$ListMenuDecorView() throws RemoteException;

    MediaMetadataCompat IconCompatParcelizer() throws RemoteException;

    void IconCompatParcelizer(int i) throws RemoteException;

    void IconCompatParcelizer(int i, int i2, String str) throws RemoteException;

    void IconCompatParcelizer(Uri uri, Bundle bundle) throws RemoteException;

    void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void IconCompatParcelizer(String str, Bundle bundle) throws RemoteException;

    void IconCompatParcelizer(boolean z) throws RemoteException;

    void Keep() throws RemoteException;

    long MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(int i) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(Uri uri, Bundle bundle) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    Bundle MediaBrowserCompat$ItemReceiver() throws RemoteException;

    void MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    void MediaBrowserCompat$ItemReceiver(RatingCompat ratingCompat) throws RemoteException;

    void MediaBrowserCompat$ItemReceiver(String str, Bundle bundle) throws RemoteException;

    boolean MediaBrowserCompat$ItemReceiver(KeyEvent keyEvent) throws RemoteException;

    String MediaBrowserCompat$MediaItem() throws RemoteException;

    int MediaBrowserCompat$SearchResultReceiver() throws RemoteException;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    int mo42800x50fd9e4a() throws RemoteException;

    CharSequence MediaDescriptionCompat() throws RemoteException;

    PlaybackStateCompat MediaMetadataCompat() throws RemoteException;

    ParcelableVolumeInfo MediaSessionCompat$QueueItem() throws RemoteException;

    int MediaSessionCompat$ResultReceiverWrapper() throws RemoteException;

    boolean MediaSessionCompat$Token() throws RemoteException;

    String ParcelableVolumeInfo() throws RemoteException;

    boolean PlaybackStateCompat() throws RemoteException;

    void PlaybackStateCompat$CustomAction() throws RemoteException;

    List<MediaSessionCompat.QueueItem> RatingCompat() throws RemoteException;

    void read() throws RemoteException;

    void read(int i) throws RemoteException;

    void read(int i, int i2, String str) throws RemoteException;

    void read(long j) throws RemoteException;

    void read(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void read(String str, Bundle bundle) throws RemoteException;

    void read(boolean z) throws RemoteException;

    void setBackgroundResource() throws RemoteException;

    void setContentView() throws RemoteException;

    void setHasDecor() throws RemoteException;

    PendingIntent write() throws RemoteException;

    void write(long j) throws RemoteException;

    void write(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void write(String str, Bundle bundle) throws RemoteException;

    void write(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    /* renamed from: o.MediaBrowserCompat$MediaItem$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer extends Binder implements MediaBrowserCompat$MediaItem {
        public IconCompatParcelizer() {
            attachInterface(this, "o.MediaBrowserCompat$MediaItem");
        }

        public static MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("o.MediaBrowserCompat$MediaItem");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MediaBrowserCompat$MediaItem)) {
                return new C6953x1e38495a(iBinder);
            }
            return (MediaBrowserCompat$MediaItem) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: type inference failed for: r0v45 */
        /* JADX WARNING: type inference failed for: r0v46 */
        /* JADX WARNING: type inference failed for: r0v47 */
        /* JADX WARNING: type inference failed for: r0v48 */
        /* JADX WARNING: type inference failed for: r0v49 */
        /* JADX WARNING: type inference failed for: r0v50 */
        /* JADX WARNING: type inference failed for: r0v51 */
        /* JADX WARNING: type inference failed for: r0v52 */
        /* JADX WARNING: type inference failed for: r0v53 */
        /* JADX WARNING: type inference failed for: r0v54 */
        /* JADX WARNING: type inference failed for: r0v55 */
        /* JADX WARNING: type inference failed for: r0v56 */
        /* JADX WARNING: type inference failed for: r0v57 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 0
                java.lang.String r1 = "o.MediaBrowserCompat$MediaItem"
                r2 = 1
                r3 = 51
                if (r5 == r3) goto L_0x03cd
                r3 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r3) goto L_0x03c9
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x039c;
                    case 2: goto L_0x037f;
                    case 3: goto L_0x036d;
                    case 4: goto L_0x035b;
                    case 5: goto L_0x034d;
                    case 6: goto L_0x033f;
                    case 7: goto L_0x0331;
                    case 8: goto L_0x031a;
                    case 9: goto L_0x030c;
                    case 10: goto L_0x02f5;
                    case 11: goto L_0x02df;
                    case 12: goto L_0x02c9;
                    case 13: goto L_0x02bf;
                    case 14: goto L_0x02a2;
                    case 15: goto L_0x0285;
                    case 16: goto L_0x025c;
                    case 17: goto L_0x024e;
                    case 18: goto L_0x0244;
                    case 19: goto L_0x023a;
                    case 20: goto L_0x0230;
                    case 21: goto L_0x0226;
                    case 22: goto L_0x021c;
                    case 23: goto L_0x0212;
                    case 24: goto L_0x0204;
                    case 25: goto L_0x01eb;
                    case 26: goto L_0x01ce;
                    case 27: goto L_0x01b7;
                    case 28: goto L_0x01a0;
                    case 29: goto L_0x0192;
                    case 30: goto L_0x017b;
                    case 31: goto L_0x0164;
                    case 32: goto L_0x0156;
                    case 33: goto L_0x014c;
                    case 34: goto L_0x012f;
                    case 35: goto L_0x0112;
                    case 36: goto L_0x00e9;
                    case 37: goto L_0x00db;
                    case 38: goto L_0x00cd;
                    case 39: goto L_0x00bf;
                    case 40: goto L_0x00ae;
                    case 41: goto L_0x0095;
                    case 42: goto L_0x0078;
                    case 43: goto L_0x005f;
                    case 44: goto L_0x0051;
                    case 45: goto L_0x0043;
                    case 46: goto L_0x0032;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.read((int) r5)
                r7.writeNoException()
                return r2
            L_0x0024:
                r6.enforceInterface(r1)
                int r5 = r4.MediaSessionCompat$ResultReceiverWrapper()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0032:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r3 = r2
            L_0x003c:
                r4.read((boolean) r3)
                r7.writeNoException()
                return r2
            L_0x0043:
                r6.enforceInterface(r1)
                boolean r5 = r4.MediaSessionCompat$Token()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0051:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.IconCompatParcelizer((int) r5)
                r7.writeNoException()
                return r2
            L_0x005f:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0071
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p044v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.support.v4.media.MediaDescriptionCompat r0 = (android.support.p044v4.media.MediaDescriptionCompat) r0
            L_0x0071:
                r4.IconCompatParcelizer((android.support.p044v4.media.MediaDescriptionCompat) r0)
                r7.writeNoException()
                return r2
            L_0x0078:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x008a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p044v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.support.v4.media.MediaDescriptionCompat r0 = (android.support.p044v4.media.MediaDescriptionCompat) r0
            L_0x008a:
                int r5 = r6.readInt()
                r4.MediaBrowserCompat$ItemReceiver((android.support.p044v4.media.MediaDescriptionCompat) r0, (int) r5)
                r7.writeNoException()
                return r2
            L_0x0095:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00a7
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p044v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.support.v4.media.MediaDescriptionCompat r0 = (android.support.p044v4.media.MediaDescriptionCompat) r0
            L_0x00a7:
                r4.read((android.support.p044v4.media.MediaDescriptionCompat) r0)
                r7.writeNoException()
                return r2
            L_0x00ae:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00b8
                r3 = r2
            L_0x00b8:
                r4.IconCompatParcelizer((boolean) r3)
                r7.writeNoException()
                return r2
            L_0x00bf:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                r4.MediaBrowserCompat$CustomActionResultReceiver((int) r5)
                r7.writeNoException()
                return r2
            L_0x00cd:
                r6.enforceInterface(r1)
                boolean r5 = r4.PlaybackStateCompat()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x00db:
                r6.enforceInterface(r1)
                int r5 = r4.mo42800x50fd9e4a()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x00e9:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00fb
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x00fc
            L_0x00fb:
                r5 = r0
            L_0x00fc:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x010b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x010b:
                r4.MediaBrowserCompat$CustomActionResultReceiver((android.net.Uri) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x0112:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0128
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0128:
                r4.read(r5, r0)
                r7.writeNoException()
                return r2
            L_0x012f:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0145
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0145:
                r4.IconCompatParcelizer((java.lang.String) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x014c:
                r6.enforceInterface(r1)
                r4.setBackgroundResource()
                r7.writeNoException()
                return r2
            L_0x0156:
                r6.enforceInterface(r1)
                int r5 = r4.MediaBrowserCompat$SearchResultReceiver()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0164:
                r6.enforceInterface(r1)
                android.os.Bundle r5 = r4.MediaBrowserCompat$ItemReceiver()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0177
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x017a
            L_0x0177:
                r7.writeInt(r3)
            L_0x017a:
                return r2
            L_0x017b:
                r6.enforceInterface(r1)
                java.lang.CharSequence r5 = r4.MediaDescriptionCompat()
                r7.writeNoException()
                if (r5 == 0) goto L_0x018e
                r7.writeInt(r2)
                android.text.TextUtils.writeToParcel(r5, r7, r2)
                goto L_0x0191
            L_0x018e:
                r7.writeInt(r3)
            L_0x0191:
                return r2
            L_0x0192:
                r6.enforceInterface(r1)
                java.util.List r5 = r4.RatingCompat()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r2
            L_0x01a0:
                r6.enforceInterface(r1)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.MediaMetadataCompat()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01b3
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x01b6
            L_0x01b3:
                r7.writeInt(r3)
            L_0x01b6:
                return r2
            L_0x01b7:
                r6.enforceInterface(r1)
                android.support.v4.media.MediaMetadataCompat r5 = r4.IconCompatParcelizer()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01ca
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x01cd
            L_0x01ca:
                r7.writeInt(r3)
            L_0x01cd:
                return r2
            L_0x01ce:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x01e4
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x01e4:
                r4.MediaBrowserCompat$ItemReceiver((java.lang.String) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x01eb:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01fd
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p044v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.support.v4.media.RatingCompat r0 = (android.support.p044v4.media.RatingCompat) r0
            L_0x01fd:
                r4.MediaBrowserCompat$ItemReceiver((android.support.p044v4.media.RatingCompat) r0)
                r7.writeNoException()
                return r2
            L_0x0204:
                r6.enforceInterface(r1)
                long r5 = r6.readLong()
                r4.read((long) r5)
                r7.writeNoException()
                return r2
            L_0x0212:
                r6.enforceInterface(r1)
                r4.AppCompatActivity()
                r7.writeNoException()
                return r2
            L_0x021c:
                r6.enforceInterface(r1)
                r4.read()
                r7.writeNoException()
                return r2
            L_0x0226:
                r6.enforceInterface(r1)
                r4.setContentView()
                r7.writeNoException()
                return r2
            L_0x0230:
                r6.enforceInterface(r1)
                r4.Keep()
                r7.writeNoException()
                return r2
            L_0x023a:
                r6.enforceInterface(r1)
                r4.AppCompatDelegateImpl$ListMenuDecorView()
                r7.writeNoException()
                return r2
            L_0x0244:
                r6.enforceInterface(r1)
                r4.PlaybackStateCompat$CustomAction()
                r7.writeNoException()
                return r2
            L_0x024e:
                r6.enforceInterface(r1)
                long r5 = r6.readLong()
                r4.write((long) r5)
                r7.writeNoException()
                return r2
            L_0x025c:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x026e
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x026f
            L_0x026e:
                r5 = r0
            L_0x026f:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x027e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x027e:
                r4.IconCompatParcelizer((android.net.Uri) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x0285:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x029b
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x029b:
                r4.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x02a2:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x02b8:
                r4.write((java.lang.String) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            L_0x02bf:
                r6.enforceInterface(r1)
                r4.setHasDecor()
                r7.writeNoException()
                return r2
            L_0x02c9:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.IconCompatParcelizer(r5, r8, r6)
                r7.writeNoException()
                return r2
            L_0x02df:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.read(r5, r8, r6)
                r7.writeNoException()
                return r2
            L_0x02f5:
                r6.enforceInterface(r1)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.MediaSessionCompat$QueueItem()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0308
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x030b
            L_0x0308:
                r7.writeInt(r3)
            L_0x030b:
                return r2
            L_0x030c:
                r6.enforceInterface(r1)
                long r5 = r4.MediaBrowserCompat$CustomActionResultReceiver()
                r7.writeNoException()
                r7.writeLong(r5)
                return r2
            L_0x031a:
                r6.enforceInterface(r1)
                android.app.PendingIntent r5 = r4.write()
                r7.writeNoException()
                if (r5 == 0) goto L_0x032d
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x0330
            L_0x032d:
                r7.writeInt(r3)
            L_0x0330:
                return r2
            L_0x0331:
                r6.enforceInterface(r1)
                java.lang.String r5 = r4.ParcelableVolumeInfo()
                r7.writeNoException()
                r7.writeString(r5)
                return r2
            L_0x033f:
                r6.enforceInterface(r1)
                java.lang.String r5 = r4.MediaBrowserCompat$MediaItem()
                r7.writeNoException()
                r7.writeString(r5)
                return r2
            L_0x034d:
                r6.enforceInterface(r1)
                boolean r5 = r4.AlertController$RecycleListView()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x035b:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.MediaMetadataCompat r5 = p040o.C6955xfad3cc42.MediaBrowserCompat$CustomActionResultReceiver(r5)
                r4.MediaBrowserCompat$CustomActionResultReceiver((p040o.MediaMetadataCompat) r5)
                r7.writeNoException()
                return r2
            L_0x036d:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                o.MediaMetadataCompat r5 = p040o.C6955xfad3cc42.MediaBrowserCompat$CustomActionResultReceiver(r5)
                r4.write((p040o.MediaMetadataCompat) r5)
                r7.writeNoException()
                return r2
            L_0x037f:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0391
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r0 = r5
                android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            L_0x0391:
                boolean r5 = r4.MediaBrowserCompat$ItemReceiver((android.view.KeyEvent) r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x039c:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03b2
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03b3
            L_0x03b2:
                r8 = r0
            L_0x03b3:
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x03c2
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p044v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r0 = (android.support.p044v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r0
            L_0x03c2:
                r4.MediaBrowserCompat$CustomActionResultReceiver(r5, r8, r0)
                r7.writeNoException()
                return r2
            L_0x03c9:
                r7.writeString(r1)
                return r2
            L_0x03cd:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03df
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p044v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p044v4.media.RatingCompat) r5
                goto L_0x03e0
            L_0x03df:
                r5 = r0
            L_0x03e0:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03ef
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x03ef:
                r4.write((android.support.p044v4.media.RatingCompat) r5, (android.os.Bundle) r0)
                r7.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MediaBrowserCompat$MediaItem.IconCompatParcelizer.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }
}
