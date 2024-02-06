package p040o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Settings;
import p040o.CheckParameters;

/* renamed from: o.onBackPressed */
public final class onBackPressed implements ImageHeaderParser {
    private static byte[] MediaBrowserCompat$ItemReceiver = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] read = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: o.onBackPressed$IconCompatParcelizer */
    interface IconCompatParcelizer {
        short IconCompatParcelizer() throws IOException;

        int MediaBrowserCompat$ItemReceiver() throws IOException;

        long MediaBrowserCompat$ItemReceiver(long j) throws IOException;

        int write() throws IOException;

        int write(byte[] bArr, int i) throws IOException;
    }

    public final ImageHeaderParser.ImageType read(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            return read((IconCompatParcelizer) new onBackPressed$MediaBrowserCompat$ItemReceiver(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final ImageHeaderParser.ImageType IconCompatParcelizer(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            return read((IconCompatParcelizer) new write(byteBuffer));
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, CheckParameters.CheckCountry checkCountry) throws IOException {
        if (inputStream != null) {
            onBackPressed$MediaBrowserCompat$ItemReceiver onbackpressed_mediabrowsercompat_itemreceiver = new onBackPressed$MediaBrowserCompat$ItemReceiver(inputStream);
            if (checkCountry != null) {
                return MediaBrowserCompat$ItemReceiver(onbackpressed_mediabrowsercompat_itemreceiver, checkCountry);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private static ImageHeaderParser.ImageType read(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int MediaBrowserCompat$ItemReceiver3 = ((MediaBrowserCompat$ItemReceiver2 << 16) & -65536) | (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        if (MediaBrowserCompat$ItemReceiver3 == -1991225785) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(21);
            return iconCompatParcelizer.write() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((MediaBrowserCompat$ItemReceiver3 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (MediaBrowserCompat$ItemReceiver3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4);
            if ((((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() << 16) & -65536) | (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int MediaBrowserCompat$ItemReceiver4 = ((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() << 16) & -65536) | (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            if ((MediaBrowserCompat$ItemReceiver4 & -256) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = MediaBrowserCompat$ItemReceiver4 & 255;
            if (i == 88) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4);
                return (iconCompatParcelizer.write() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(4);
                return (iconCompatParcelizer.write() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    private int MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer, CheckParameters.CheckCountry checkCountry) throws IOException {
        int MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        int i = -1;
        if (!((MediaBrowserCompat$ItemReceiver2 & 65496) == 65496 || MediaBrowserCompat$ItemReceiver2 == 19789 || MediaBrowserCompat$ItemReceiver2 == 18761)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(MediaBrowserCompat$ItemReceiver2);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            return -1;
        }
        int write2 = write(iconCompatParcelizer);
        if (write2 == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) checkCountry.read(write2, byte[].class);
        try {
            int write3 = iconCompatParcelizer.write(bArr, write2);
            if (write3 != write2) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to read exif segment data, length: ");
                    sb2.append(write2);
                    sb2.append(", actually read: ");
                    sb2.append(write3);
                    Log.d("DfltImageHeaderParser", sb2.toString());
                }
            } else if (write(bArr, write2)) {
                i = IconCompatParcelizer(new onBackPressed$MediaBrowserCompat$CustomActionResultReceiver(bArr, write2));
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return i;
        } finally {
            checkCountry.MediaBrowserCompat$CustomActionResultReceiver(bArr);
        }
    }

    private static boolean write(byte[] bArr, int i) {
        boolean z = bArr != null && i > MediaBrowserCompat$ItemReceiver.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = MediaBrowserCompat$ItemReceiver;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private static int write(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        short IconCompatParcelizer2;
        int MediaBrowserCompat$ItemReceiver2;
        long j;
        long MediaBrowserCompat$ItemReceiver3;
        do {
            short IconCompatParcelizer3 = iconCompatParcelizer.IconCompatParcelizer();
            if (IconCompatParcelizer3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(IconCompatParcelizer3);
                    Log.d("DfltImageHeaderParser", sb.toString());
                }
                return -1;
            }
            IconCompatParcelizer2 = iconCompatParcelizer.IconCompatParcelizer();
            if (IconCompatParcelizer2 == 218) {
                return -1;
            }
            if (IconCompatParcelizer2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver() - 2;
            if (IconCompatParcelizer2 == 225) {
                return MediaBrowserCompat$ItemReceiver2;
            }
            j = (long) MediaBrowserCompat$ItemReceiver2;
            MediaBrowserCompat$ItemReceiver3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(j);
        } while (MediaBrowserCompat$ItemReceiver3 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(IconCompatParcelizer2);
            sb2.append(", wanted to skip: ");
            sb2.append(MediaBrowserCompat$ItemReceiver2);
            sb2.append(", but actually skipped: ");
            sb2.append(MediaBrowserCompat$ItemReceiver3);
            Log.d("DfltImageHeaderParser", sb2.toString());
        }
        return -1;
    }

    /* renamed from: o.onBackPressed$write */
    static final class write implements IconCompatParcelizer {
        private final ByteBuffer MediaBrowserCompat$CustomActionResultReceiver;

        write(ByteBuffer byteBuffer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long MediaBrowserCompat$ItemReceiver(long j) {
            int min = (int) Math.min((long) this.MediaBrowserCompat$CustomActionResultReceiver.remaining(), j);
            ByteBuffer byteBuffer = this.MediaBrowserCompat$CustomActionResultReceiver;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        public final int write(byte[] bArr, int i) {
            int min = Math.min(i, this.MediaBrowserCompat$CustomActionResultReceiver.remaining());
            if (min == 0) {
                return -1;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.get(bArr, 0, min);
            return min;
        }

        public final int write() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.remaining() <= 0) {
                return -1;
            }
            return this.MediaBrowserCompat$CustomActionResultReceiver.get();
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            byte b;
            byte b2 = -1;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.remaining() <= 0) {
                b = -1;
            } else {
                b = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            }
            byte b3 = (b << 8) & 65280;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.remaining() > 0) {
                b2 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            }
            return b3 | (b2 & 255);
        }

        public final short IconCompatParcelizer() {
            byte b;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.remaining() <= 0) {
                b = -1;
            } else {
                b = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            }
            return (short) (b & 255);
        }
    }

    private static int IconCompatParcelizer(onBackPressed$MediaBrowserCompat$CustomActionResultReceiver onbackpressed_mediabrowsercompat_customactionresultreceiver) {
        ByteOrder byteOrder;
        onBackPressed$MediaBrowserCompat$CustomActionResultReceiver onbackpressed_mediabrowsercompat_customactionresultreceiver2 = onbackpressed_mediabrowsercompat_customactionresultreceiver;
        short s = onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - 6 >= 2 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getShort(6) : -1;
        if (s == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(s);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.order(byteOrder);
        int i = (onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - 10 >= 4 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getInt(10) : -1) + 6;
        short s2 = onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - i >= 2 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getShort(i) : -1;
        for (int i2 = 0; i2 < s2; i2++) {
            int i3 = i + 2 + (i2 * 12);
            short s3 = onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - i3 >= 2 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getShort(i3) : -1;
            if (s3 == 274) {
                int i4 = i3 + 2;
                short s4 = onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - i4 >= 2 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getShort(i4) : -1;
                if (s4 > 0 && s4 <= 12) {
                    int i5 = i3 + 4;
                    int i6 = onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - i5 >= 4 ? onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getInt(i5) : -1;
                    if (i6 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i2);
                            sb2.append(" tagType=");
                            sb2.append(s3);
                            sb2.append(" formatCode=");
                            sb2.append(s4);
                            sb2.append(" componentCount=");
                            sb2.append(i6);
                            Log.d("DfltImageHeaderParser", sb2.toString());
                        }
                        int i7 = i6 + read[s4];
                        if (i7 <= 4) {
                            int i8 = i3 + 8;
                            if (i8 < 0 || i8 > onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i8);
                                    sb3.append(" tagType=");
                                    sb3.append(s3);
                                    Log.d("DfltImageHeaderParser", sb3.toString());
                                }
                            } else if (i7 >= 0 && i7 + i8 <= onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining()) {
                                if (onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.remaining() - i8 >= 2) {
                                    return onbackpressed_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver.getShort(i8);
                                }
                                return -1;
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Illegal number of bytes for TI tag data tagType=");
                                sb4.append(s3);
                                Log.d("DfltImageHeaderParser", sb4.toString());
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(s4);
                            Log.d("DfltImageHeaderParser", sb5.toString());
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(s4);
                    Log.d("DfltImageHeaderParser", sb6.toString());
                }
            }
        }
        return -1;
    }
}
