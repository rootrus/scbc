package p040o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.setOnCloseListener;

/* renamed from: o.setEnterSharedElementCallback */
public final class setEnterSharedElementCallback {
    private final AudioAttributesCompat<isStateSaved, String> IconCompatParcelizer = new AudioAttributesCompat<>(1000);
    private final setOnCloseListener.read<setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver> read = setAccessibilityDelegateCompat.MediaBrowserCompat$ItemReceiver(10, new C1446x798357e0<setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object read() {
            return MediaBrowserCompat$ItemReceiver();
        }

        private static setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
            try {
                return new setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    public final String write(isStateSaved isstatesaved) {
        String IconCompatParcelizer2;
        synchronized (this.IconCompatParcelizer) {
            IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(isstatesaved);
        }
        if (IconCompatParcelizer2 == null) {
            IconCompatParcelizer2 = read(isstatesaved);
        }
        synchronized (this.IconCompatParcelizer) {
            this.IconCompatParcelizer.read(isstatesaved, IconCompatParcelizer2);
        }
        return IconCompatParcelizer2;
    }

    private String read(isStateSaved isstatesaved) {
        setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver read2 = this.read.read();
        if (read2 != null) {
            setEnterSharedElementCallback$MediaBrowserCompat$ItemReceiver setentersharedelementcallback_mediabrowsercompat_itemreceiver = read2;
            try {
                isstatesaved.MediaBrowserCompat$CustomActionResultReceiver(setentersharedelementcallback_mediabrowsercompat_itemreceiver.read);
                return LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver(setentersharedelementcallback_mediabrowsercompat_itemreceiver.read.digest());
            } finally {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(setentersharedelementcallback_mediabrowsercompat_itemreceiver);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }
}
