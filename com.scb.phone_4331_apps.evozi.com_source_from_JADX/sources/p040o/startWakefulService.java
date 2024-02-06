package p040o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p040o.CheckParameters;

/* renamed from: o.startWakefulService */
public final class startWakefulService implements isVisible<InputStream, setUseDefaultMargins> {
    private final isVisible<ByteBuffer, setUseDefaultMargins> IconCompatParcelizer;
    private final CheckParameters.CheckCountry MediaBrowserCompat$ItemReceiver;
    private final List<ImageHeaderParser> write;

    public final /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        InputStream inputStream = (InputStream) obj;
        noteStateNotSaved<Boolean> notestatenotsaved = Space.IconCompatParcelizer;
        return !((Boolean) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read)).booleanValue() && AlertController$RecycleListView.read(this.write, inputStream, this.MediaBrowserCompat$ItemReceiver) == ImageHeaderParser.ImageType.GIF;
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$CustomActionResultReceiver(Object obj, int i, int i2, onActivityResult onactivityresult) throws IOException {
        byte[] MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver((InputStream) obj);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(ByteBuffer.wrap(MediaBrowserCompat$CustomActionResultReceiver), i, i2, onactivityresult);
    }

    public startWakefulService(List<ImageHeaderParser> list, isVisible<ByteBuffer, setUseDefaultMargins> isvisible, CheckParameters.CheckCountry checkCountry) {
        this.write = list;
        this.IconCompatParcelizer = isvisible;
        this.MediaBrowserCompat$ItemReceiver = checkCountry;
    }

    private static byte[] MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }
}
