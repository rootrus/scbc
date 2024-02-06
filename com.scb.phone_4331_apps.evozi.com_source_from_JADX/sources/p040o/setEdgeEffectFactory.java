package p040o;

import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.IOException;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;

/* renamed from: o.setEdgeEffectFactory */
public final class setEdgeEffectFactory {
    private static final setScrollingTouchSlop<setItemViewCacheSize> IconCompatParcelizer;

    static {
        setScrollingTouchSlop<setItemViewCacheSize> setscrollingtouchslop = new setScrollingTouchSlop<>();
        IconCompatParcelizer = setscrollingtouchslop;
        T t = setItemViewCacheSize.Unknown;
        C1535x28237973<T> setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver = setscrollingtouchslop.write;
        if (setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write == null) {
            setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write = t;
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Jpeg, new byte[]{-1, ISO7816.INS_LOAD_KEY_FILE});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Tiff, "II".getBytes(), new byte[]{ISO7816.INS_PSO, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Tiff, "MM".getBytes(), new byte[]{0, ISO7816.INS_PSO});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Psd, "8BPS".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Png, new byte[]{-119, 80, 78, 71, 13, 10, Ascii.SUB, 10, 0, 0, 0, 13, 73, 72, ISO7816.INS_REHABILITATE_CHV, 82});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Bmp, "BM".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Gif, "GIF87a".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Gif, "GIF89a".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Ico, new byte[]{0, 0, 1, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Pcx, new byte[]{10, 0, 1});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Pcx, new byte[]{10, 2, 1});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Pcx, new byte[]{10, 3, 1});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Pcx, new byte[]{10, 5, 1});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Riff, "RIFF".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Arw, "II".getBytes(), new byte[]{ISO7816.INS_PSO, 0, 8, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Crw, "II".getBytes(), new byte[]{Ascii.SUB, 0, 0, 0}, "HEAPCCDR".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Cr2, "II".getBytes(), new byte[]{ISO7816.INS_PSO, 0, 16, 0, 0, 0, 67, 82});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Nef, "MM".getBytes(), new byte[]{0, ISO7816.INS_PSO, 0, 0, 0, ISOFileInfo.DATA_BYTES1, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Orf, "IIRO".getBytes(), new byte[]{8, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Orf, "MMOR".getBytes(), new byte[]{0, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Orf, "IIRS".getBytes(), new byte[]{8, 0});
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Raf, "FUJIFILMCCD-RAW".getBytes());
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setItemViewCacheSize.Rw2, "II".getBytes(), new byte[]{85, 0});
            return;
        }
        throw new RuntimeException("Value already set for this trie node");
    }

    public static setItemViewCacheSize write(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.markSupported()) {
            int i = IconCompatParcelizer.read;
            bufferedInputStream.mark(i);
            byte[] bArr = new byte[i];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                C1535x28237973<T> setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver = IconCompatParcelizer.write;
                T t = setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write;
                for (int i2 = 0; i2 < i; i2++) {
                    setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver = setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.read.get(Byte.valueOf(bArr[i2]));
                    if (setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver == null) {
                        break;
                    }
                    if (setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write != null) {
                        t = setscrollingtouchslop_mediabrowsercompat_customactionresultreceiver.write;
                    }
                }
                return (setItemViewCacheSize) t;
            }
            throw new IOException("Stream ended before file's magic number could be determined.");
        }
        throw new IOException("Stream must support mark/reset");
    }
}
