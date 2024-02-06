package p040o;

import com.drew.imaging.png.PngProcessingException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.setOnScrollListener */
public final class setOnScrollListener {
    public static final setOnScrollListener IconCompatParcelizer;
    private static final Set<String> Keep = new HashSet(Arrays.asList(new String[]{"IDAT", "sPLT", "iTXt", "tEXt", "zTXt"}));
    public static final setOnScrollListener MediaBrowserCompat$CustomActionResultReceiver;
    public static final setOnScrollListener MediaBrowserCompat$ItemReceiver;
    public static final setOnScrollListener MediaBrowserCompat$MediaItem;
    public static final setOnScrollListener MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static final setOnScrollListener f2636x50fd9e4a;
    public static final setOnScrollListener MediaDescriptionCompat;
    public static final setOnScrollListener MediaMetadataCompat;
    public static final setOnScrollListener MediaSessionCompat$QueueItem;
    public static final setOnScrollListener MediaSessionCompat$ResultReceiverWrapper;
    public static final setOnScrollListener MediaSessionCompat$Token;
    public static final setOnScrollListener ParcelableVolumeInfo;
    public static final setOnScrollListener RatingCompat;
    public static final setOnScrollListener read;
    public static final setOnScrollListener write;
    final boolean PlaybackStateCompat;
    private final byte[] PlaybackStateCompat$CustomAction;

    static {
        try {
            MediaBrowserCompat$ItemReceiver = new setOnScrollListener("IHDR");
            IconCompatParcelizer = new setOnScrollListener("PLTE");
            new setOnScrollListener("IDAT", true);
            write = new setOnScrollListener("IEND");
            read = new setOnScrollListener("cHRM");
            MediaBrowserCompat$SearchResultReceiver = new setOnScrollListener("gAMA");
            MediaDescriptionCompat = new setOnScrollListener("iCCP");
            MediaBrowserCompat$MediaItem = new setOnScrollListener("sBIT");
            MediaSessionCompat$Token = new setOnScrollListener("sRGB");
            MediaBrowserCompat$CustomActionResultReceiver = new setOnScrollListener("bKGD");
            new setOnScrollListener("hIST");
            ParcelableVolumeInfo = new setOnScrollListener("tRNS");
            RatingCompat = new setOnScrollListener("pHYs");
            new setOnScrollListener("sPLT", true);
            MediaSessionCompat$QueueItem = new setOnScrollListener("tIME");
            MediaMetadataCompat = new setOnScrollListener("iTXt", true);
            f2636x50fd9e4a = new setOnScrollListener("tEXt", true);
            MediaSessionCompat$ResultReceiverWrapper = new setOnScrollListener("zTXt", true);
        } catch (PngProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private setOnScrollListener(String str) throws PngProcessingException {
        this(str, false);
    }

    private setOnScrollListener(String str, boolean z) throws PngProcessingException {
        this.PlaybackStateCompat = z;
        try {
            byte[] bytes = str.getBytes("ASCII");
            IconCompatParcelizer(bytes);
            this.PlaybackStateCompat$CustomAction = bytes;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException("Unable to convert string code to bytes.");
        }
    }

    public setOnScrollListener(byte[] bArr) throws PngProcessingException {
        IconCompatParcelizer(bArr);
        this.PlaybackStateCompat$CustomAction = bArr;
        this.PlaybackStateCompat = Keep.contains(read());
    }

    private static void IconCompatParcelizer(byte[] bArr) throws PngProcessingException {
        if (bArr.length == 4) {
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                byte b = bArr[i];
                if ((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) {
                    i++;
                } else {
                    throw new PngProcessingException("PNG chunk type identifier may only contain alphabet characters");
                }
            }
            return;
        }
        throw new PngProcessingException("PNG chunk type identifier must be four bytes in length");
    }

    public final String read() {
        try {
            return new String(this.PlaybackStateCompat$CustomAction, "ASCII");
        } catch (UnsupportedEncodingException unused) {
            return "Invalid object instance";
        }
    }

    public final String toString() {
        return read();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.PlaybackStateCompat$CustomAction, ((setOnScrollListener) obj).PlaybackStateCompat$CustomAction);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PlaybackStateCompat$CustomAction);
    }
}
