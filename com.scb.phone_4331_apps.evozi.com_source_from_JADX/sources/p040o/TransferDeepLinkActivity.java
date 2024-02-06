package p040o;

import com.google.zxing.FormatException;
import p040o.ScriptGroup;

/* renamed from: o.TransferDeepLinkActivity */
public final class TransferDeepLinkActivity {
    public final rsnScriptSetVarI IconCompatParcelizer;
    public ScriptGroup.Binding MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public ScriptGroup read;

    @HmlPinActivity
    public TransferDeepLinkActivity() {
    }

    public TransferDeepLinkActivity(rsnScriptSetVarI rsnscriptsetvari) throws FormatException {
        int i = rsnscriptsetvari.write;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.read();
        }
        this.IconCompatParcelizer = rsnscriptsetvari;
    }

    private int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        return this.MediaBrowserCompat$ItemReceiver ? this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, i) : this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    public final ScriptGroup MediaBrowserCompat$CustomActionResultReceiver() throws FormatException {
        ScriptGroup scriptGroup = this.read;
        if (scriptGroup != null) {
            return scriptGroup;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = MediaBrowserCompat$ItemReceiver(i3, 8, i2);
        }
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(8, 7, MediaBrowserCompat$ItemReceiver(8, 8, MediaBrowserCompat$ItemReceiver(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(8, i4, MediaBrowserCompat$ItemReceiver2);
        }
        int i5 = this.IconCompatParcelizer.write;
        for (int i6 = i5 - 1; i6 >= i5 - 7; i6--) {
            i = MediaBrowserCompat$ItemReceiver(8, i6, i);
        }
        for (int i7 = i5 - 8; i7 < i5; i7++) {
            i = MediaBrowserCompat$ItemReceiver(i7, 8, i);
        }
        ScriptGroup write = ScriptGroup.write(MediaBrowserCompat$ItemReceiver2, i);
        this.read = write;
        if (write != null) {
            return write;
        }
        throw FormatException.read();
    }

    public final ScriptGroup.Binding write() throws FormatException {
        ScriptGroup.Binding binding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (binding != null) {
            return binding;
        }
        int i = this.IconCompatParcelizer.write;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return ScriptGroup.Binding.MediaBrowserCompat$ItemReceiver(i2);
        }
        int i3 = i - 11;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                i5 = MediaBrowserCompat$ItemReceiver(i7, i6, i5);
            }
        }
        ScriptGroup.Binding MediaBrowserCompat$CustomActionResultReceiver2 = ScriptGroup.Binding.MediaBrowserCompat$CustomActionResultReceiver(i5);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (MediaBrowserCompat$CustomActionResultReceiver2.read << 2) + 17 != i) {
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i - 9; i9 >= i3; i9--) {
                    i4 = MediaBrowserCompat$ItemReceiver(i8, i9, i4);
                }
            }
            ScriptGroup.Binding MediaBrowserCompat$CustomActionResultReceiver3 = ScriptGroup.Binding.MediaBrowserCompat$CustomActionResultReceiver(i4);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null || (MediaBrowserCompat$CustomActionResultReceiver3.read << 2) + 17 != i) {
                throw FormatException.read();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver3;
            return MediaBrowserCompat$CustomActionResultReceiver3;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }
}
