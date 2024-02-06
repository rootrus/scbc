package p040o;

import java.util.Arrays;

/* renamed from: o.setCredentialHintPickerConfig */
public final class setCredentialHintPickerConfig extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.setCredentialHintPickerConfig$write */
    public static final class write {
        public final byte[] IconCompatParcelizer;
        private final CharSequence MediaBrowserCompat$CustomActionResultReceiver;
        public final int read;
        public final int write;

        private write() {
        }

        public write(CharSequence charSequence, int i, int i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = charSequence;
            this.read = i;
            this.write = i2;
            byte[] bArr = new byte[(i * i2)];
            this.IconCompatParcelizer = bArr;
            Arrays.fill(bArr, (byte) -1);
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
            if (i < 0) {
                int i5 = this.write;
                i += i5;
                i2 += 4 - ((i5 + 4) % 8);
            }
            if (i2 < 0) {
                int i6 = this.read;
                i2 += i6;
                i += 4 - ((i6 + 4) % 8);
            }
            int i7 = 1;
            if ((this.MediaBrowserCompat$CustomActionResultReceiver.charAt(i3) & (1 << (8 - i4))) == 0) {
                i7 = 0;
            }
            this.IconCompatParcelizer[(i * this.read) + i2] = (byte) i7;
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3) {
            int i4 = i - 2;
            int i5 = i2 - 2;
            MediaBrowserCompat$CustomActionResultReceiver(i4, i5, i3, 1);
            int i6 = i2 - 1;
            MediaBrowserCompat$CustomActionResultReceiver(i4, i6, i3, 2);
            int i7 = i - 1;
            MediaBrowserCompat$CustomActionResultReceiver(i7, i5, i3, 3);
            MediaBrowserCompat$CustomActionResultReceiver(i7, i6, i3, 4);
            MediaBrowserCompat$CustomActionResultReceiver(i7, i2, i3, 5);
            MediaBrowserCompat$CustomActionResultReceiver(i, i5, i3, 6);
            MediaBrowserCompat$CustomActionResultReceiver(i, i6, i3, 7);
            MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, 8);
        }
    }
}
