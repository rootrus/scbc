package p040o;

import com.drew.imaging.png.PngProcessingException;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: o.getViewLifecycleOwner */
public final class getViewLifecycleOwner {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$SearchResultReceiver;
    public final int MediaDescriptionCompat;
    public final int RatingCompat;
    public final int read;
    public final int write;

    public getViewLifecycleOwner(byte[] bArr) throws PngProcessingException {
        if (bArr.length == 32) {
            copyTo copyto = new copyTo(bArr);
            try {
                this.MediaDescriptionCompat = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.RatingCompat = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.IconCompatParcelizer = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$SearchResultReceiver = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.write = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$ItemReceiver = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$CustomActionResultReceiver = copyto.MediaBrowserCompat$CustomActionResultReceiver();
                this.read = copyto.MediaBrowserCompat$CustomActionResultReceiver();
            } catch (IOException e) {
                throw new PngProcessingException((Throwable) e);
            }
        } else {
            throw new PngProcessingException("Invalid number of bytes");
        }
    }

    public getViewLifecycleOwner() {
    }

    public static String IconCompatParcelizer(Iterable<? extends CharSequence> iterable, String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it = iterable.iterator();
        int i = 0;
        if (it.hasNext()) {
            i = 0 + ((CharSequence) it.next()).length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            sb.append((CharSequence) it2.next());
            while (it2.hasNext()) {
                sb.append(str);
                sb.append((CharSequence) it2.next());
            }
        }
        return sb.toString();
    }
}
