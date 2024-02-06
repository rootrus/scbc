package p040o;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.supportInvalidateOptionsMenu */
public final class supportInvalidateOptionsMenu<T> implements isVisible<T, Bitmap> {
    public static final noteStateNotSaved<Long> IconCompatParcelizer = noteStateNotSaved.read("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<Long>() {
        private final ByteBuffer MediaBrowserCompat$ItemReceiver = ByteBuffer.allocate(8);

        public final /* synthetic */ void write(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.position(0);
                messageDigest.update(this.MediaBrowserCompat$ItemReceiver.putLong(l.longValue()).array());
            }
        }
    });
    private static final read read = new read();
    private static noteStateNotSaved<Integer> write = noteStateNotSaved.read("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<Integer>() {
        private final ByteBuffer MediaBrowserCompat$CustomActionResultReceiver = ByteBuffer.allocate(4);

        public final /* synthetic */ void write(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.position(0);
                    messageDigest.update(this.MediaBrowserCompat$CustomActionResultReceiver.putInt(num.intValue()).array());
                }
            }
        }
    });
    private final CheckParameters_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;
    private final supportInvalidateOptionsMenu$MediaBrowserCompat$ItemReceiver<T> MediaBrowserCompat$ItemReceiver;

    public final boolean IconCompatParcelizer(T t, onActivityResult onactivityresult) {
        return true;
    }

    public static isVisible<AssetFileDescriptor, Bitmap> write(CheckParameters_MembersInjector checkParameters_MembersInjector) {
        return new supportInvalidateOptionsMenu(checkParameters_MembersInjector, new write((byte) 0));
    }

    public static isVisible<ParcelFileDescriptor, Bitmap> read(CheckParameters_MembersInjector checkParameters_MembersInjector) {
        return new supportInvalidateOptionsMenu(checkParameters_MembersInjector, new IconCompatParcelizer());
    }

    private supportInvalidateOptionsMenu(CheckParameters_MembersInjector checkParameters_MembersInjector, supportInvalidateOptionsMenu$MediaBrowserCompat$ItemReceiver<T> supportinvalidateoptionsmenu_mediabrowsercompat_itemreceiver) {
        this(checkParameters_MembersInjector, supportinvalidateoptionsmenu_mediabrowsercompat_itemreceiver, read);
    }

    private supportInvalidateOptionsMenu(CheckParameters_MembersInjector checkParameters_MembersInjector, supportInvalidateOptionsMenu$MediaBrowserCompat$ItemReceiver<T> supportinvalidateoptionsmenu_mediabrowsercompat_itemreceiver, read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = checkParameters_MembersInjector;
        this.MediaBrowserCompat$ItemReceiver = supportinvalidateoptionsmenu_mediabrowsercompat_itemreceiver;
    }

    public final performOptionsMenuClosed<Bitmap> MediaBrowserCompat$CustomActionResultReceiver(T t, int i, int i2, onActivityResult onactivityresult) throws IOException {
        Bitmap bitmap;
        noteStateNotSaved<Long> notestatenotsaved = IconCompatParcelizer;
        long longValue = ((Long) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read)).longValue();
        if (longValue >= 0 || longValue == -1) {
            noteStateNotSaved<Integer> notestatenotsaved2 = write;
            Integer num = (Integer) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved2) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved2) : notestatenotsaved2.read);
            if (num == null) {
                num = 2;
            }
            noteStateNotSaved<onCreatePanelMenu> notestatenotsaved3 = onCreatePanelMenu.MediaBrowserCompat$SearchResultReceiver;
            onCreatePanelMenu oncreatepanelmenu = (onCreatePanelMenu) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved3) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved3) : notestatenotsaved3.read);
            if (oncreatepanelmenu == null) {
                oncreatepanelmenu = onCreatePanelMenu.MediaBrowserCompat$ItemReceiver;
            }
            onCreatePanelMenu oncreatepanelmenu2 = oncreatepanelmenu;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(mediaMetadataRetriever, t);
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT < 27 || i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || oncreatepanelmenu2 == onCreatePanelMenu.MediaDescriptionCompat) {
                    bitmap = null;
                } else {
                    bitmap = write(mediaMetadataRetriever, longValue, intValue, i, i2, oncreatepanelmenu2);
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                mediaMetadataRetriever.release();
                CheckParameters_MembersInjector checkParameters_MembersInjector = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (bitmap == null) {
                    return null;
                }
                return new getLastCustomNonConfigurationInstance(bitmap, checkParameters_MembersInjector);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static Bitmap write(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, onCreatePanelMenu oncreatepanelmenu) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float MediaBrowserCompat$ItemReceiver2 = oncreatepanelmenu.MediaBrowserCompat$ItemReceiver(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * MediaBrowserCompat$ItemReceiver2), Math.round(MediaBrowserCompat$ItemReceiver2 * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: o.supportInvalidateOptionsMenu$read */
    static class read {
        read() {
        }
    }

    /* renamed from: o.supportInvalidateOptionsMenu$write */
    static final class write implements supportInvalidateOptionsMenu$MediaBrowserCompat$ItemReceiver<AssetFileDescriptor> {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ void IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: o.supportInvalidateOptionsMenu$IconCompatParcelizer */
    static final class IconCompatParcelizer implements supportInvalidateOptionsMenu$MediaBrowserCompat$ItemReceiver<ParcelFileDescriptor> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }
}
