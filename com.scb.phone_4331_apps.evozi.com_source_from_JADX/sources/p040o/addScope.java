package p040o;

import java.lang.reflect.Array;
import p040o.setHandler;

/* renamed from: o.addScope */
public final class addScope extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.addScope$write */
    public static final class write {
        private final int MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;
        public int read;
        public final setHandler.read[] write;

        private write() {
        }

        public write(int i, int i2) {
            this.write = new setHandler.read[i];
            for (int i3 = 0; i3 < i; i3++) {
                this.write[i3] = new setHandler.read(((i2 + 4) * 17) + 1);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i2 * 17;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = -1;
        }

        public final byte[][] MediaBrowserCompat$ItemReceiver(int i, int i2) {
            int i3 = this.MediaBrowserCompat$ItemReceiver;
            int[] iArr = new int[2];
            iArr[1] = this.MediaBrowserCompat$CustomActionResultReceiver * i;
            iArr[0] = i3 * i2;
            byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
            int i4 = this.MediaBrowserCompat$ItemReceiver * i2;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = (i4 - i5) - 1;
                setHandler.read read2 = this.write[i5 / i2];
                int length = read2.IconCompatParcelizer.length * i;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = read2.IconCompatParcelizer[i7 / i];
                }
                bArr[i6] = bArr2;
            }
            return bArr;
        }
    }

    @HmlPinActivity
    public addScope(registerConnectionCallbacks registerconnectioncallbacks, stopAutoManage stopautomanage, setHandler sethandler) {
        onGetStartedClick.write((Object) registerconnectioncallbacks, "accountFromEntityMapper");
        onGetStartedClick.write((Object) stopautomanage, "accountToEntityMapper");
        onGetStartedClick.write((Object) sethandler, "txnDetailsEntityMapper");
    }
}
