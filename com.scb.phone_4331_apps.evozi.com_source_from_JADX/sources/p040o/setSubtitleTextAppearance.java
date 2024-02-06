package p040o;

import android.content.res.AssetManager;
import android.util.Log;
import com.kofax.kmc.ken.engines.service.ImageService;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import net.p088sf.scuba.smartcards.ISO7816;

/* renamed from: o.setSubtitleTextAppearance */
public final class setSubtitleTextAppearance {
    private static final write[] AlertController$RecycleListView = {new write("ThumbnailImage", 256, 7), new write("CameraSettingsIFDPointer", 8224, 4), new write("ImageProcessingIFDPointer", 8256, 4)};
    private static final HashMap<Integer, Integer> AppCompatActivity = new HashMap<>();
    private static final HashMap<String, write>[] AppCompatDelegateImpl$ListMenuDecorView;
    private static final HashMap<Integer, write>[] AppCompatDialogFragment;
    static final int[] IconCompatParcelizer = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] Keep = {79, 76, 89, 77, 80, 0};
    static final byte[] MediaBrowserCompat$CustomActionResultReceiver = {65, 83, 67, 73, 73, 0, 0, 0};
    private static int[] MediaBrowserCompat$ItemReceiver = {8};
    private static byte[] MediaBrowserCompat$MediaItem;
    private static final write[] MediaBrowserCompat$SearchResultReceiver = {new write("ExposureTime", 33434, 5), new write("FNumber", 33437, 5), new write("ExposureProgram", 34850, 3), new write("SpectralSensitivity", 34852, 2), new write("PhotographicSensitivity", 34855, 3), new write("OECF", 34856, 7), new write("ExifVersion", 36864, 2), new write("DateTimeOriginal", 36867, 2), new write("DateTimeDigitized", 36868, 2), new write("ComponentsConfiguration", 37121, 7), new write("CompressedBitsPerPixel", 37122, 5), new write("ShutterSpeedValue", 37377, 10), new write("ApertureValue", 37378, 5), new write("BrightnessValue", 37379, 10), new write("ExposureBiasValue", 37380, 10), new write("MaxApertureValue", 37381, 5), new write("SubjectDistance", 37382, 5), new write("MeteringMode", 37383, 3), new write("LightSource", 37384, 3), new write("Flash", 37385, 3), new write("FocalLength", 37386, 5), new write("SubjectArea", 37396, 3), new write("MakerNote", 37500, 7), new write("UserComment", 37510, 7), new write("SubSecTime", 37520, 2), new write("SubSecTimeOriginal", 37521, 2), new write("SubSecTimeDigitized", 37522, 2), new write("FlashpixVersion", 40960, 7), new write("ColorSpace", 40961, 3), new write("PixelXDimension", 40962), new write("PixelYDimension", 40963), new write("RelatedSoundFile", 40964, 2), new write("InteroperabilityIFDPointer", 40965, 4), new write("FlashEnergy", 41483, 5), new write("SpatialFrequencyResponse", 41484, 7), new write("FocalPlaneXResolution", 41486, 5), new write("FocalPlaneYResolution", 41487, 5), new write("FocalPlaneResolutionUnit", 41488, 3), new write("SubjectLocation", 41492, 3), new write("ExposureIndex", 41493, 5), new write("SensingMethod", 41495, 3), new write("FileSource", 41728, 7), new write("SceneType", 41729, 7), new write("CFAPattern", 41730, 7), new write("CustomRendered", 41985, 3), new write("ExposureMode", 41986, 3), new write("WhiteBalance", 41987, 3), new write("DigitalZoomRatio", 41988, 5), new write("FocalLengthIn35mmFilm", 41989, 3), new write("SceneCaptureType", 41990, 3), new write("GainControl", 41991, 3), new write("Contrast", 41992, 3), new write("Saturation", 41993, 3), new write("Sharpness", 41994, 3), new write("DeviceSettingDescription", 41995, 7), new write("SubjectDistanceRange", 41996, 3), new write("ImageUniqueID", 42016, 2), new write("DNGVersion", 50706, 1), new write("DefaultCropSize", 50720)};

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static byte[] f2642x50fd9e4a = {-1, ISO7816.INS_LOAD_KEY_FILE, -1};
    private static int[] MediaDescriptionCompat = {8, 8, 8};
    private static write[][] MediaMetadataCompat;
    private static final write[] MediaSessionCompat$QueueItem = {new write("NewSubfileType", 254, 4), new write("SubfileType", 255, 4), new write("ImageWidth", 256), new write("ImageLength", 257), new write("BitsPerSample", 258, 3), new write("Compression", 259, 3), new write("PhotometricInterpretation", 262, 3), new write("ImageDescription", 270, 2), new write("Make", 271, 2), new write("Model", 272, 2), new write("StripOffsets", 273), new write("Orientation", 274, 3), new write("SamplesPerPixel", 277, 3), new write("RowsPerStrip", 278), new write("StripByteCounts", 279), new write("XResolution", 282, 5), new write("YResolution", 283, 5), new write("PlanarConfiguration", 284, 3), new write("ResolutionUnit", 296, 3), new write("TransferFunction", 301, 3), new write("Software", 305, 2), new write("DateTime", 306, 2), new write("Artist", 315, 2), new write("WhitePoint", 318, 5), new write("PrimaryChromaticities", 319, 5), new write("SubIFDPointer", 330, 4), new write("JPEGInterchangeFormat", 513, 4), new write("JPEGInterchangeFormatLength", 514, 4), new write("YCbCrCoefficients", 529, 5), new write("YCbCrSubSampling", 530, 3), new write("YCbCrPositioning", 531, 3), new write("ReferenceBlackWhite", 532, 5), new write("Copyright", 33432, 2), new write("ExifIFDPointer", 34665, 4), new write("GPSInfoIFDPointer", 34853, 4), new write("SensorTopBorder", 4, 4), new write("SensorLeftBorder", 5, 4), new write("SensorBottomBorder", 6, 4), new write("SensorRightBorder", 7, 4), new write("ISO", 23, 3), new write("JpgFromRaw", 46, 7)};
    private static final write[] MediaSessionCompat$ResultReceiverWrapper = {new write("GPSVersionID", 0, 1), new write("GPSLatitudeRef", 1, 2), new write("GPSLatitude", 2, 5), new write("GPSLongitudeRef", 3, 2), new write("GPSLongitude", 4, 5), new write("GPSAltitudeRef", 5, 1), new write("GPSAltitude", 6, 5), new write("GPSTimeStamp", 7, 5), new write("GPSSatellites", 8, 2), new write("GPSStatus", 9, 2), new write("GPSMeasureMode", 10, 2), new write("GPSDOP", 11, 5), new write("GPSSpeedRef", 12, 2), new write("GPSSpeed", 13, 5), new write("GPSTrackRef", 14, 2), new write("GPSTrack", 15, 5), new write("GPSImgDirectionRef", 16, 2), new write("GPSImgDirection", 17, 5), new write("GPSMapDatum", 18, 2), new write("GPSDestLatitudeRef", 19, 2), new write("GPSDestLatitude", 20, 5), new write("GPSDestLongitudeRef", 21, 2), new write("GPSDestLongitude", 22, 5), new write("GPSDestBearingRef", 23, 2), new write("GPSDestBearing", 24, 5), new write("GPSDestDistanceRef", 25, 2), new write("GPSDestDistance", 26, 5), new write("GPSProcessingMethod", 27, 7), new write("GPSAreaInformation", 28, 7), new write("GPSDateStamp", 29, 2), new write("GPSDifferential", 30, 3)};
    private static final write[] MediaSessionCompat$Token = {new write("NewSubfileType", 254, 4), new write("SubfileType", 255, 4), new write("ThumbnailImageWidth", 256), new write("ThumbnailImageLength", 257), new write("BitsPerSample", 258, 3), new write("Compression", 259, 3), new write("PhotometricInterpretation", 262, 3), new write("ImageDescription", 270, 2), new write("Make", 271, 2), new write("Model", 272, 2), new write("StripOffsets", 273), new write("Orientation", 274, 3), new write("SamplesPerPixel", 277, 3), new write("RowsPerStrip", 278), new write("StripByteCounts", 279), new write("XResolution", 282, 5), new write("YResolution", 283, 5), new write("PlanarConfiguration", 284, 3), new write("ResolutionUnit", 296, 3), new write("TransferFunction", 301, 3), new write("Software", 305, 2), new write("DateTime", 306, 2), new write("Artist", 315, 2), new write("WhitePoint", 318, 5), new write("PrimaryChromaticities", 319, 5), new write("SubIFDPointer", 330, 4), new write("JPEGInterchangeFormat", 513, 4), new write("JPEGInterchangeFormatLength", 514, 4), new write("YCbCrCoefficients", 529, 5), new write("YCbCrSubSampling", 530, 3), new write("YCbCrPositioning", 531, 3), new write("ReferenceBlackWhite", 532, 5), new write("Copyright", 33432, 2), new write("ExifIFDPointer", 34665, 4), new write("GPSInfoIFDPointer", 34853, 4), new write("DNGVersion", 50706, 1), new write("DefaultCropSize", 50720)};
    private static final write[] ParcelableVolumeInfo = {new write("InteroperabilityIndex", 1, 2)};
    private static final byte[] PlaybackStateCompat = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final write[] PlaybackStateCompat$CustomAction = {new write("PreviewImageStart", 257, 4), new write("PreviewImageLength", 258, 4)};
    private static final write[] RatingCompat = {new write("SubIFDPointer", 330, 4), new write("ExifIFDPointer", 34665, 4), new write("GPSInfoIFDPointer", 34853, 4), new write("InteroperabilityIFDPointer", 40965, 4), new write("CameraSettingsIFDPointer", 8224, 1), new write("ImageProcessingIFDPointer", 8256, 1)};
    static final Charset read;
    private static final HashSet<String> setBackgroundResource = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final write setContentView = new write("StripOffsets", 273, 3);
    private static final write[] setHasDecor = {new write("AspectFrame", 4371, 3)};
    static final String[] write = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    private final AssetManager.AssetInputStream ActionMenuItemView;
    private int AppCompatViewInflater;
    private final HashMap<String, C1546xeda7e7f8>[] setCheckable = new HashMap[MediaMetadataCompat.length];
    private Set<Integer> setChecked = new HashSet(MediaMetadataCompat.length);
    private ByteOrder setExpandedFormat = ByteOrder.BIG_ENDIAN;
    private int setForceShowIcon;
    private final String setIcon;
    private int setItemInvoker;
    private int setPadding;
    private int setPopupCallback;
    private int setShortcut;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        write[] writeArr = {new write("ColorSpace", 55, 3)};
        write[] writeArr2 = MediaSessionCompat$QueueItem;
        MediaMetadataCompat = new write[][]{writeArr2, MediaBrowserCompat$SearchResultReceiver, MediaSessionCompat$ResultReceiverWrapper, ParcelableVolumeInfo, MediaSessionCompat$Token, writeArr2, AlertController$RecycleListView, PlaybackStateCompat$CustomAction, setHasDecor, writeArr};
        new write("JPEGInterchangeFormat", 513, 4);
        new write("JPEGInterchangeFormatLength", 514, 4);
        write[][] writeArr3 = MediaMetadataCompat;
        AppCompatDialogFragment = new HashMap[writeArr3.length];
        AppCompatDelegateImpl$ListMenuDecorView = new HashMap[writeArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        read = forName;
        MediaBrowserCompat$MediaItem = "Exif\u0000\u0000".getBytes(forName);
        new SimpleDateFormat(ImageService.EXIF_TIME_FORMAT).setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < MediaMetadataCompat.length; i++) {
            AppCompatDialogFragment[i] = new HashMap<>();
            AppCompatDelegateImpl$ListMenuDecorView[i] = new HashMap<>();
            for (write write2 : MediaMetadataCompat[i]) {
                AppCompatDialogFragment[i].put(Integer.valueOf(write2.read), write2);
                AppCompatDelegateImpl$ListMenuDecorView[i].put(write2.write, write2);
            }
        }
        AppCompatActivity.put(Integer.valueOf(RatingCompat[0].read), 5);
        AppCompatActivity.put(Integer.valueOf(RatingCompat[1].read), 1);
        AppCompatActivity.put(Integer.valueOf(RatingCompat[2].read), 2);
        AppCompatActivity.put(Integer.valueOf(RatingCompat[3].read), 3);
        AppCompatActivity.put(Integer.valueOf(RatingCompat[4].read), 7);
        AppCompatActivity.put(Integer.valueOf(RatingCompat[5].read), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* renamed from: o.setSubtitleTextAppearance$IconCompatParcelizer */
    static class IconCompatParcelizer {
        public final long MediaBrowserCompat$CustomActionResultReceiver;
        public final long write;

        IconCompatParcelizer(long j, long j2) {
            if (j2 == 0) {
                this.write = 0;
                this.MediaBrowserCompat$CustomActionResultReceiver = 1;
                return;
            }
            this.write = j;
            this.MediaBrowserCompat$CustomActionResultReceiver = j2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.write);
            sb.append("/");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            return sb.toString();
        }
    }

    /* renamed from: o.setSubtitleTextAppearance$write */
    static class write {
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompat$CustomActionResultReceiver;
        public final int read;
        public final String write;

        write(String str, int i, int i2) {
            this.write = str;
            this.read = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.IconCompatParcelizer = -1;
        }

        write(String str, int i) {
            this.write = str;
            this.read = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = 3;
            this.IconCompatParcelizer = 4;
        }

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
            int i2;
            int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.IconCompatParcelizer) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.MediaBrowserCompat$CustomActionResultReceiver == 9 || this.IconCompatParcelizer == 9) && i == 8) {
                return true;
            }
            if ((this.MediaBrowserCompat$CustomActionResultReceiver == 12 || this.IconCompatParcelizer == 12) && i == 11) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[SYNTHETIC, Splitter:B:16:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setSubtitleTextAppearance(java.lang.String r3) throws java.io.IOException {
        /*
            r2 = this;
            r2.<init>()
            o.setSubtitleTextAppearance$write[][] r0 = MediaMetadataCompat
            int r0 = r0.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r2.setCheckable = r0
            java.util.HashSet r0 = new java.util.HashSet
            o.setSubtitleTextAppearance$write[][] r1 = MediaMetadataCompat
            int r1 = r1.length
            r0.<init>(r1)
            r2.setChecked = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.setExpandedFormat = r0
            if (r3 == 0) goto L_0x003a
            r0 = 0
            r2.ActionMenuItemView = r0
            r2.setIcon = r3
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0030 }
            r1.<init>(r3)     // Catch:{ all -> 0x0030 }
            r2.IconCompatParcelizer((java.io.InputStream) r1)     // Catch:{ all -> 0x002d }
            r1.close()     // Catch:{ RuntimeException -> 0x002b, Exception -> 0x002a }
        L_0x002a:
            return
        L_0x002b:
            r3 = move-exception
            throw r3
        L_0x002d:
            r3 = move-exception
            r0 = r1
            goto L_0x0031
        L_0x0030:
            r3 = move-exception
        L_0x0031:
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ RuntimeException -> 0x0037, Exception -> 0x0039 }
            goto L_0x0039
        L_0x0037:
            r3 = move-exception
            throw r3
        L_0x0039:
            throw r3
        L_0x003a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filename cannot be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSubtitleTextAppearance.<init>(java.lang.String):void");
    }

    public setSubtitleTextAppearance(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            this.setIcon = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.ActionMenuItemView = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.ActionMenuItemView = null;
            }
            IconCompatParcelizer(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    private C1546xeda7e7f8 write(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < MediaMetadataCompat.length; i++) {
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[i].get(str);
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null) {
                return setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver;
            }
        }
        return null;
    }

    private String MediaBrowserCompat$ItemReceiver(String str) {
        double d;
        C1546xeda7e7f8 write2 = write(str);
        if (write2 != null) {
            if (!setBackgroundResource.contains(str)) {
                return write2.read(this.setExpandedFormat);
            }
            if (!str.equals("GPSTimeStamp")) {
                try {
                    Object MediaBrowserCompat$CustomActionResultReceiver2 = write2.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                        if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof String) {
                            d = Double.parseDouble((String) MediaBrowserCompat$CustomActionResultReceiver2);
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof long[]) {
                            long[] jArr = (long[]) MediaBrowserCompat$CustomActionResultReceiver2;
                            if (jArr.length == 1) {
                                d = (double) jArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof int[]) {
                            int[] iArr = (int[]) MediaBrowserCompat$CustomActionResultReceiver2;
                            if (iArr.length == 1) {
                                d = (double) iArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof double[]) {
                            double[] dArr = (double[]) MediaBrowserCompat$CustomActionResultReceiver2;
                            if (dArr.length == 1) {
                                d = dArr[0];
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof IconCompatParcelizer[]) {
                            IconCompatParcelizer[] iconCompatParcelizerArr = (IconCompatParcelizer[]) MediaBrowserCompat$CustomActionResultReceiver2;
                            if (iconCompatParcelizerArr.length == 1) {
                                IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[0];
                                d = ((double) iconCompatParcelizer.write) / ((double) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                            } else {
                                throw new NumberFormatException("There are more than one component");
                            }
                        } else {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                        return Double.toString(d);
                    }
                    throw new NumberFormatException("NULL can't be converted to a double value");
                } catch (NumberFormatException unused) {
                }
            } else if (write2.write == 5 || write2.write == 10) {
                IconCompatParcelizer[] iconCompatParcelizerArr2 = (IconCompatParcelizer[]) write2.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                if (iconCompatParcelizerArr2 == null || iconCompatParcelizerArr2.length != 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid GPS Timestamp array. array=");
                    sb.append(Arrays.toString(iconCompatParcelizerArr2));
                    Log.w("ExifInterface", sb.toString());
                    return null;
                }
                return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) iconCompatParcelizerArr2[0].write) / ((float) iconCompatParcelizerArr2[0].MediaBrowserCompat$CustomActionResultReceiver))), Integer.valueOf((int) (((float) iconCompatParcelizerArr2[1].write) / ((float) iconCompatParcelizerArr2[1].MediaBrowserCompat$CustomActionResultReceiver))), Integer.valueOf((int) (((float) iconCompatParcelizerArr2[2].write) / ((float) iconCompatParcelizerArr2[2].MediaBrowserCompat$CustomActionResultReceiver)))});
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(write2.write);
                Log.w("ExifInterface", sb2.toString());
                return null;
            }
        }
        return null;
    }

    public final int read(String str, int i) {
        C1546xeda7e7f8 write2 = write(str);
        if (write2 == null) {
            return 1;
        }
        try {
            return write2.write(this.setExpandedFormat);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    private void IconCompatParcelizer(InputStream inputStream) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver;
        boolean z = false;
        int i = 0;
        while (i < MediaMetadataCompat.length) {
            try {
                this.setCheckable[i] = new HashMap<>();
                i++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                write();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.setPopupCallback = MediaBrowserCompat$ItemReceiver(bufferedInputStream);
        setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver = new setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver((InputStream) bufferedInputStream);
        switch (this.setPopupCallback) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
                break;
            case 4:
                read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, 0, 0);
                break;
            case 7:
                read(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
                break;
            case 9:
                MediaBrowserCompat$CustomActionResultReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
                break;
            case 10:
                write(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
                break;
        }
        HashMap<String, C1546xeda7e7f8> hashMap = this.setCheckable[4];
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = hashMap.get("Compression");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 != null) {
            int write2 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2.write(this.setExpandedFormat);
            if (write2 != 1) {
                if (write2 == 6) {
                    read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, (HashMap) hashMap);
                } else if (write2 != 7) {
                }
            }
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 = hashMap.get("BitsPerSample");
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 != null) {
                int[] iArr = (int[]) setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                if (!Arrays.equals(MediaDescriptionCompat, iArr)) {
                    if (this.setPopupCallback == 3 && (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = hashMap.get("PhotometricInterpretation")) != null) {
                        int write3 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.write(this.setExpandedFormat);
                        if (write3 != 1 || !Arrays.equals(iArr, MediaBrowserCompat$ItemReceiver)) {
                            if (write3 == 6 && Arrays.equals(iArr, MediaDescriptionCompat)) {
                            }
                        }
                    }
                }
                z = true;
            }
            if (z) {
                write(setsubtitletextappearance_mediabrowsercompat_itemreceiver, (HashMap) hashMap);
            }
        } else {
            read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, (HashMap) hashMap);
        }
        write();
    }

    private int MediaBrowserCompat$ItemReceiver(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr2 = f2642x50fd9e4a;
            z = true;
            if (i >= bArr2.length) {
                z2 = true;
                break;
            } else if (bArr[i] != bArr2[i]) {
                z2 = false;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i2 = 0;
        while (true) {
            if (i2 >= bytes.length) {
                z3 = true;
                break;
            } else if (bArr[i2] != bytes[i2]) {
                z3 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z3) {
            return 9;
        }
        setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver = new setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(bArr);
        ByteOrder IconCompatParcelizer2 = IconCompatParcelizer(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
        this.setExpandedFormat = IconCompatParcelizer2;
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        short readShort = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readShort();
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver2 = new setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(bArr);
        ByteOrder IconCompatParcelizer3 = IconCompatParcelizer(setsubtitletextappearance_mediabrowsercompat_itemreceiver2);
        this.setExpandedFormat = IconCompatParcelizer3;
        setsubtitletextappearance_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        short readShort2 = setsubtitletextappearance_mediabrowsercompat_itemreceiver2.readShort();
        setsubtitletextappearance_mediabrowsercompat_itemreceiver2.close();
        if (readShort2 != 85) {
            z = false;
        }
        if (z) {
            return 10;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0103 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(p040o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r11.MediaBrowserCompat$CustomActionResultReceiver = r0
            long r0 = (long) r12
            r11.write(r0)
            byte r0 = r11.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x015e
            byte r3 = r11.readByte()
            r4 = -40
            if (r3 != r4) goto L_0x0143
            r0 = 1
            int r12 = r12 + r0
            int r12 = r12 + r0
        L_0x001c:
            byte r1 = r11.readByte()
            if (r1 != r2) goto L_0x0126
            byte r1 = r11.readByte()
            r3 = -39
            if (r1 == r3) goto L_0x0121
            r3 = -38
            if (r1 == r3) goto L_0x0121
            int r3 = r11.readUnsignedShort()
            int r3 = r3 + -2
            int r12 = r12 + r0
            int r12 = r12 + r0
            int r12 = r12 + 2
            java.lang.String r4 = "Invalid length"
            if (r3 < 0) goto L_0x011b
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r1 == r5) goto L_0x00be
            r5 = -2
            if (r1 == r5) goto L_0x0095
            switch(r1) {
                case -64: goto L_0x0054;
                case -63: goto L_0x0054;
                case -62: goto L_0x0054;
                case -61: goto L_0x0054;
                default: goto L_0x0049;
            }
        L_0x0049:
            switch(r1) {
                case -59: goto L_0x0054;
                case -58: goto L_0x0054;
                case -57: goto L_0x0054;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r1) {
                case -55: goto L_0x0054;
                case -54: goto L_0x0054;
                case -53: goto L_0x0054;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r1) {
                case -51: goto L_0x0054;
                case -50: goto L_0x0054;
                case -49: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x00f0
        L_0x0054:
            int r1 = r11.skipBytes(r0)
            if (r1 != r0) goto L_0x008d
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r1 = r10.setCheckable
            r1 = r1[r13]
            int r5 = r11.readUnsignedShort()
            long r7 = (long) r5
            java.nio.ByteOrder r5 = r10.setExpandedFormat
            long[] r9 = new long[r0]
            r9[r6] = r7
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r5 = p040o.C1546xeda7e7f8.read((long[]) r9, (java.nio.ByteOrder) r5)
            java.lang.String r7 = "ImageLength"
            r1.put(r7, r5)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r1 = r10.setCheckable
            r1 = r1[r13]
            int r5 = r11.readUnsignedShort()
            long r7 = (long) r5
            java.nio.ByteOrder r5 = r10.setExpandedFormat
            long[] r9 = new long[r0]
            r9[r6] = r7
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r5 = p040o.C1546xeda7e7f8.read((long[]) r9, (java.nio.ByteOrder) r5)
            java.lang.String r6 = "ImageWidth"
            r1.put(r6, r5)
            int r3 = r3 + -5
            goto L_0x00f0
        L_0x008d:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid SOFx"
            r11.<init>(r12)
            throw r11
        L_0x0095:
            byte[] r1 = new byte[r3]
            int r5 = r11.read(r1)
            if (r5 != r3) goto L_0x00b8
            java.lang.String r3 = "UserComment"
            java.lang.String r5 = r10.MediaBrowserCompat$ItemReceiver((java.lang.String) r3)
            if (r5 != 0) goto L_0x00ef
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r5 = r10.setCheckable
            r5 = r5[r0]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = read
            r7.<init>(r1, r8)
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.C1546xeda7e7f8.IconCompatParcelizer(r7)
            r5.put(r3, r1)
            goto L_0x00ef
        L_0x00b8:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r7)
            throw r11
        L_0x00be:
            r1 = 6
            if (r3 >= r1) goto L_0x00c2
            goto L_0x00f0
        L_0x00c2:
            byte[] r5 = new byte[r1]
            int r8 = r11.read(r5)
            if (r8 != r1) goto L_0x0115
            int r12 = r12 + 6
            int r3 = r3 + -6
            byte[] r1 = MediaBrowserCompat$MediaItem
            boolean r1 = java.util.Arrays.equals(r5, r1)
            if (r1 != 0) goto L_0x00d7
            goto L_0x00f0
        L_0x00d7:
            if (r3 <= 0) goto L_0x010f
            r10.AppCompatViewInflater = r12
            byte[] r1 = new byte[r3]
            int r5 = r11.read(r1)
            if (r5 != r3) goto L_0x0109
            int r12 = r12 + r3
            o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver r5 = new o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver
            r5.<init>((byte[]) r1)
            r10.write((p040o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver) r5, (int) r3)
            r10.read((p040o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver) r5, (int) r13)
        L_0x00ef:
            r3 = r6
        L_0x00f0:
            if (r3 < 0) goto L_0x0103
            int r1 = r11.skipBytes(r3)
            if (r1 != r3) goto L_0x00fb
            int r12 = r12 + r3
            goto L_0x001c
        L_0x00fb:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Invalid JPEG segment"
            r11.<init>(r12)
            throw r11
        L_0x0103:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r4)
            throw r11
        L_0x0109:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r7)
            throw r11
        L_0x010f:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r7)
            throw r11
        L_0x0115:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r7)
            throw r11
        L_0x011b:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r4)
            throw r11
        L_0x0121:
            java.nio.ByteOrder r12 = r10.setExpandedFormat
            r11.MediaBrowserCompat$CustomActionResultReceiver = r12
            return
        L_0x0126:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x0143:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x015e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSubtitleTextAppearance.read(o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver, int, int):void");
    }

    private void MediaBrowserCompat$ItemReceiver(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver;
        write(setsubtitletextappearance_mediabrowsercompat_itemreceiver, setsubtitletextappearance_mediabrowsercompat_itemreceiver.available());
        read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, 0);
        MediaBrowserCompat$CustomActionResultReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver, 0);
        MediaBrowserCompat$CustomActionResultReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver, 5);
        MediaBrowserCompat$CustomActionResultReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver, 4);
        MediaBrowserCompat$CustomActionResultReceiver();
        if (this.setPopupCallback == 8 && (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[1].get("MakerNote")) != null) {
            setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver2 = new setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.read);
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$CustomActionResultReceiver = this.setExpandedFormat;
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.write(6);
            read(setsubtitletextappearance_mediabrowsercompat_itemreceiver2, 9);
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[9].get("ColorSpace");
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 != null) {
                this.setCheckable[1].put("ColorSpace", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver) throws IOException {
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.read(bArr);
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.skipBytes(4);
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, i, 5);
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.write((long) i2);
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = ByteOrder.BIG_ENDIAN;
        int readInt = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readUnsignedShort();
            int readUnsignedShort2 = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readUnsignedShort();
            if (readUnsignedShort == setContentView.read) {
                int readShort = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readShort();
                int readShort2 = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readShort();
                C1546xeda7e7f8 IconCompatParcelizer2 = C1546xeda7e7f8.IconCompatParcelizer(new int[]{readShort}, this.setExpandedFormat);
                C1546xeda7e7f8 IconCompatParcelizer3 = C1546xeda7e7f8.IconCompatParcelizer(new int[]{readShort2}, this.setExpandedFormat);
                this.setCheckable[0].put("ImageLength", IconCompatParcelizer2);
                this.setCheckable[0].put("ImageWidth", IconCompatParcelizer3);
                return;
            }
            setsubtitletextappearance_mediabrowsercompat_itemreceiver.skipBytes(readUnsignedShort2);
        }
    }

    private void read(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver) throws IOException {
        MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[1].get("MakerNote");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null) {
            setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver2 = new setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.read);
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$CustomActionResultReceiver = this.setExpandedFormat;
            byte[] bArr = new byte[Keep.length];
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.readFully(bArr);
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.write(0);
            byte[] bArr2 = new byte[PlaybackStateCompat.length];
            setsubtitletextappearance_mediabrowsercompat_itemreceiver2.readFully(bArr2);
            if (Arrays.equals(bArr, Keep)) {
                setsubtitletextappearance_mediabrowsercompat_itemreceiver2.write(8);
            } else if (Arrays.equals(bArr2, PlaybackStateCompat)) {
                setsubtitletextappearance_mediabrowsercompat_itemreceiver2.write(12);
            }
            read(setsubtitletextappearance_mediabrowsercompat_itemreceiver2, 6);
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[7].get("PreviewImageStart");
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 = this.setCheckable[7].get("PreviewImageLength");
            if (!(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 == null)) {
                this.setCheckable[5].put("JPEGInterchangeFormat", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2);
                this.setCheckable[5].put("JPEGInterchangeFormatLength", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3);
            }
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 = this.setCheckable[8].get("AspectFrame");
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 != null) {
                int[] iArr = (int[]) setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    int[] iArr2 = {i};
                    C1546xeda7e7f8 IconCompatParcelizer2 = C1546xeda7e7f8.IconCompatParcelizer(iArr2, this.setExpandedFormat);
                    int[] iArr3 = {i2};
                    C1546xeda7e7f8 IconCompatParcelizer3 = C1546xeda7e7f8.IconCompatParcelizer(iArr3, this.setExpandedFormat);
                    this.setCheckable[0].put("ImageWidth", IconCompatParcelizer2);
                    this.setCheckable[0].put("ImageLength", IconCompatParcelizer3);
                }
            }
        }
    }

    private void write(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver) throws IOException {
        MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
        if (this.setCheckable[0].get("JpgFromRaw") != null) {
            read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, this.setForceShowIcon, 5);
        }
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[0].get("ISO");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[1].get("PhotographicSensitivity");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 == null) {
            this.setCheckable[1].put("PhotographicSensitivity", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver);
        }
    }

    private void write() {
        String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver("DateTimeOriginal");
        if (MediaBrowserCompat$ItemReceiver2 != null && MediaBrowserCompat$ItemReceiver("DateTime") == null) {
            this.setCheckable[0].put("DateTime", C1546xeda7e7f8.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2));
        }
        if (MediaBrowserCompat$ItemReceiver("ImageWidth") == null) {
            long[] jArr = {0};
            this.setCheckable[0].put("ImageWidth", C1546xeda7e7f8.read(jArr, this.setExpandedFormat));
        }
        if (MediaBrowserCompat$ItemReceiver("ImageLength") == null) {
            long[] jArr2 = {0};
            this.setCheckable[0].put("ImageLength", C1546xeda7e7f8.read(jArr2, this.setExpandedFormat));
        }
        if (MediaBrowserCompat$ItemReceiver("Orientation") == null) {
            long[] jArr3 = {0};
            this.setCheckable[0].put("Orientation", C1546xeda7e7f8.read(jArr3, this.setExpandedFormat));
        }
        if (MediaBrowserCompat$ItemReceiver("LightSource") == null) {
            long[] jArr4 = {0};
            this.setCheckable[1].put("LightSource", C1546xeda7e7f8.read(jArr4, this.setExpandedFormat));
        }
    }

    private static ByteOrder IconCompatParcelizer(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver) throws IOException {
        short readShort = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    private void write(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver, int i) throws IOException {
        ByteOrder IconCompatParcelizer2 = IconCompatParcelizer(setsubtitletextappearance_mediabrowsercompat_itemreceiver);
        this.setExpandedFormat = IconCompatParcelizer2;
        setsubtitletextappearance_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        int readUnsignedShort = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readUnsignedShort();
        int i2 = this.setPopupCallback;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = setsubtitletextappearance_mediabrowsercompat_itemreceiver.readInt();
            if (readInt < 8 || readInt >= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i3 = readInt - 8;
            if (i3 > 0 && setsubtitletextappearance_mediabrowsercompat_itemreceiver.skipBytes(i3) != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i3);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
        if (r6.write(r0.setExpandedFormat) == 65535) goto L_0x02a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(p040o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r4 = r25
        L_0x0006:
            java.util.Set<java.lang.Integer> r5 = r0.setChecked
            int r6 = r1.IconCompatParcelizer
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            int r5 = r1.IconCompatParcelizer
            int r5 = r5 + 2
            int r6 = r1.read
            if (r5 <= r6) goto L_0x001a
            return
        L_0x001a:
            short r5 = r24.readShort()
            int r6 = r1.IconCompatParcelizer
            int r7 = r5 * 12
            int r6 = r6 + r7
            int r7 = r1.read
            if (r6 > r7) goto L_0x031f
            if (r5 <= 0) goto L_0x031f
            r7 = 0
        L_0x002a:
            java.lang.String r10 = "ExifInterface"
            if (r7 >= r5) goto L_0x02b5
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readUnsignedShort()
            int r13 = r24.readInt()
            int r14 = r1.IconCompatParcelizer
            long r14 = (long) r14
            r16 = 4
            long r14 = r14 + r16
            java.util.HashMap<java.lang.Integer, o.setSubtitleTextAppearance$write>[] r18 = AppCompatDialogFragment
            r6 = r18[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r6.get(r2)
            o.setSubtitleTextAppearance$write r2 = (p040o.setSubtitleTextAppearance.write) r2
            r6 = 7
            if (r2 != 0) goto L_0x006a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Skip the tag entry since tag number is not defined: "
            r3.append(r8)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r10, r3)
        L_0x0066:
            r19 = r7
            goto L_0x00e1
        L_0x006a:
            if (r12 <= 0) goto L_0x00cb
            int[] r3 = IconCompatParcelizer
            int r3 = r3.length
            if (r12 >= r3) goto L_0x00cb
            boolean r3 = r2.MediaBrowserCompat$CustomActionResultReceiver(r12)
            if (r3 != 0) goto L_0x009a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Skip the tag entry since data format ("
            r3.append(r8)
            java.lang.String[] r8 = write
            r8 = r8[r12]
            r3.append(r8)
            java.lang.String r8 = ") is unexpected for tag: "
            r3.append(r8)
            java.lang.String r8 = r2.write
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r10, r3)
            goto L_0x0066
        L_0x009a:
            if (r12 != r6) goto L_0x009e
            int r12 = r2.MediaBrowserCompat$CustomActionResultReceiver
        L_0x009e:
            long r8 = (long) r13
            int[] r3 = IconCompatParcelizer
            r3 = r3[r12]
            r19 = r7
            long r6 = (long) r3
            long r6 = r6 * r8
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x00b6
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x00b6
            r3 = 1
            goto L_0x00e4
        L_0x00b6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Skip the tag entry since the number of components is invalid: "
            r3.append(r8)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r10, r3)
            goto L_0x00e3
        L_0x00cb:
            r19 = r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Skip the tag entry since data format is invalid: "
            r3.append(r6)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r10, r3)
        L_0x00e1:
            r6 = 0
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            if (r3 != 0) goto L_0x00ef
            r1.write(r14)
            r21 = r4
            r16 = r5
            goto L_0x02ac
        L_0x00ef:
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            java.lang.String r8 = "Compression"
            if (r3 <= 0) goto L_0x019d
            int r3 = r24.readInt()
            int r9 = r0.setPopupCallback
            r16 = r5
            r5 = 7
            if (r9 != r5) goto L_0x015e
            java.lang.String r5 = r2.write
            java.lang.String r9 = "MakerNote"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0113
            r0.setItemInvoker = r3
        L_0x010c:
            r21 = r4
            r20 = r12
            r17 = r13
            goto L_0x0174
        L_0x0113:
            r5 = 6
            if (r4 != r5) goto L_0x010c
            java.lang.String r9 = r2.write
            java.lang.String r5 = "ThumbnailImage"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x010c
            r0.setShortcut = r3
            r0.setPadding = r13
            java.nio.ByteOrder r5 = r0.setExpandedFormat
            r9 = 6
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r5 = p040o.C1546xeda7e7f8.read((int) r9, (java.nio.ByteOrder) r5)
            int r9 = r0.setShortcut
            r20 = r12
            r17 = r13
            long r12 = (long) r9
            java.nio.ByteOrder r9 = r0.setExpandedFormat
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.C1546xeda7e7f8.IconCompatParcelizer((long) r12, (java.nio.ByteOrder) r9)
            int r12 = r0.setPadding
            long r12 = (long) r12
            r21 = r4
            java.nio.ByteOrder r4 = r0.setExpandedFormat
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r4 = p040o.C1546xeda7e7f8.IconCompatParcelizer((long) r12, (java.nio.ByteOrder) r4)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r12 = r0.setCheckable
            r13 = 4
            r12 = r12[r13]
            r12.put(r8, r5)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r5 = r0.setCheckable
            r5 = r5[r13]
            java.lang.String r12 = "JPEGInterchangeFormat"
            r5.put(r12, r9)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r5 = r0.setCheckable
            r5 = r5[r13]
            java.lang.String r9 = "JPEGInterchangeFormatLength"
            r5.put(r9, r4)
            goto L_0x0174
        L_0x015e:
            r21 = r4
            r20 = r12
            r17 = r13
            r4 = 10
            if (r9 != r4) goto L_0x0174
            java.lang.String r4 = r2.write
            java.lang.String r5 = "JpgFromRaw"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0174
            r0.setForceShowIcon = r3
        L_0x0174:
            long r4 = (long) r3
            long r12 = r4 + r6
            int r9 = r1.read
            r22 = r8
            long r8 = (long) r9
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0184
            r1.write(r4)
            goto L_0x01a7
        L_0x0184:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            r1.write(r14)
            goto L_0x02ac
        L_0x019d:
            r21 = r4
            r16 = r5
            r22 = r8
            r20 = r12
            r17 = r13
        L_0x01a7:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = AppCompatActivity
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 8
            r5 = 3
            if (r3 == 0) goto L_0x0245
            r6 = -1
            r12 = r20
            if (r12 == r5) goto L_0x01e1
            r2 = 4
            if (r12 == r2) goto L_0x01d5
            if (r12 == r4) goto L_0x01d0
            r2 = 9
            if (r12 == r2) goto L_0x01cb
            r2 = 13
            if (r12 != r2) goto L_0x01e6
        L_0x01cb:
            int r2 = r24.readInt()
            goto L_0x01e5
        L_0x01d0:
            short r2 = r24.readShort()
            goto L_0x01e5
        L_0x01d5:
            int r2 = r24.readInt()
            long r4 = (long) r2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r4
            goto L_0x01e6
        L_0x01e1:
            int r2 = r24.readUnsignedShort()
        L_0x01e5:
            long r6 = (long) r2
        L_0x01e6:
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x022d
            int r2 = r1.read
            long r4 = (long) r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x022d
            java.util.Set<java.lang.Integer> r2 = r0.setChecked
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x020b
            r1.write(r6)
            int r2 = r3.intValue()
            r0.read((p040o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver) r1, (int) r2)
            goto L_0x0241
        L_0x020b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " (at "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            goto L_0x0241
        L_0x022d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
        L_0x0241:
            r1.write(r14)
            goto L_0x02ac
        L_0x0245:
            r12 = r20
            int r3 = (int) r6
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver r6 = new o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver
            r7 = r17
            r6.<init>(r12, r7, r3)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r3 = r0.setCheckable
            r3 = r3[r21]
            java.lang.String r7 = r2.write
            r3.put(r7, r6)
            java.lang.String r3 = r2.write
            java.lang.String r7 = "DNGVersion"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0269
            r0.setPopupCallback = r5
        L_0x0269:
            java.lang.String r3 = r2.write
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x027d
            java.lang.String r3 = r2.write
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x028b
        L_0x027d:
            java.nio.ByteOrder r3 = r0.setExpandedFormat
            java.lang.String r3 = r6.read(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x02a0
        L_0x028b:
            java.lang.String r2 = r2.write
            r3 = r22
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02a2
            java.nio.ByteOrder r2 = r0.setExpandedFormat
            int r2 = r6.write(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x02a2
        L_0x02a0:
            r0.setPopupCallback = r4
        L_0x02a2:
            int r2 = r1.IconCompatParcelizer
            long r2 = (long) r2
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x02ac
            r1.write(r14)
        L_0x02ac:
            int r7 = r19 + 1
            short r7 = (short) r7
            r5 = r16
            r4 = r21
            goto L_0x002a
        L_0x02b5:
            int r2 = r1.IconCompatParcelizer
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.read
            if (r2 > r3) goto L_0x031f
            int r2 = r24.readInt()
            long r3 = (long) r2
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x030b
            int r5 = r1.read
            if (r2 >= r5) goto L_0x030b
            java.util.Set<java.lang.Integer> r5 = r0.setChecked
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02f6
            r1.write(r3)
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r2 = r0.setCheckable
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02e9
            r4 = r3
            goto L_0x0006
        L_0x02e9:
            java.util.HashMap<java.lang.String, o.setSubtitleTextAppearance$MediaBrowserCompat$CustomActionResultReceiver>[] r2 = r0.setCheckable
            r4 = 5
            r2 = r2[r4]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x031f
            goto L_0x0006
        L_0x02f6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r10, r1)
            return
        L_0x030b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r10, r1)
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSubtitleTextAppearance.read(o.setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver, int):void");
    }

    private void MediaBrowserCompat$ItemReceiver(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver, int i) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver;
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[i].get("ImageLength");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 = this.setCheckable[i].get("ImageWidth");
        if ((setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 == null) && (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[i].get("JPEGInterchangeFormat")) != null) {
            read(setsubtitletextappearance_mediabrowsercompat_itemreceiver, setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.write(this.setExpandedFormat), i);
        }
    }

    private void read(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver, HashMap hashMap) throws IOException {
        int i;
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = (C1546xeda7e7f8) hashMap.get("JPEGInterchangeFormat");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = (C1546xeda7e7f8) hashMap.get("JPEGInterchangeFormatLength");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 != null) {
            int write2 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.write(this.setExpandedFormat);
            int min = Math.min(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2.write(this.setExpandedFormat), setsubtitletextappearance_mediabrowsercompat_itemreceiver.available() - write2);
            int i2 = this.setPopupCallback;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.AppCompatViewInflater;
            } else {
                if (i2 == 7) {
                    i = this.setItemInvoker;
                }
                if (write2 > 0 && min > 0 && this.setIcon == null && this.ActionMenuItemView == null) {
                    setsubtitletextappearance_mediabrowsercompat_itemreceiver.write((long) write2);
                    setsubtitletextappearance_mediabrowsercompat_itemreceiver.readFully(new byte[min]);
                    return;
                }
                return;
            }
            write2 += i;
            if (write2 > 0) {
            }
        }
    }

    private void write(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver, HashMap hashMap) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = (C1546xeda7e7f8) hashMap.get("StripOffsets");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = (C1546xeda7e7f8) hashMap.get("StripByteCounts");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 != null) {
            long[] write2 = write(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat));
            long[] write3 = write(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat));
            if (write2 == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
            } else if (write3 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
            } else {
                long j = 0;
                for (long j2 : write3) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < write2.length; i3++) {
                    int i4 = (int) write3[i3];
                    int i5 = ((int) write2[i3]) - i;
                    if (i5 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    setsubtitletextappearance_mediabrowsercompat_itemreceiver.write((long) i5);
                    byte[] bArr2 = new byte[i4];
                    setsubtitletextappearance_mediabrowsercompat_itemreceiver.read(bArr2);
                    i = i + i5 + i4;
                    System.arraycopy(bArr2, 0, bArr, i2, i4);
                    i2 += i4;
                }
            }
        }
    }

    private boolean read(HashMap hashMap) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = (C1546xeda7e7f8) hashMap.get("ImageLength");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = (C1546xeda7e7f8) hashMap.get("ImageWidth");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 == null) {
            return false;
        }
        return setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.write(this.setExpandedFormat) <= 512 && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2.write(this.setExpandedFormat) <= 512;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        MediaBrowserCompat$CustomActionResultReceiver(0, 5);
        MediaBrowserCompat$CustomActionResultReceiver(0, 4);
        MediaBrowserCompat$CustomActionResultReceiver(5, 4);
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[1].get("PixelXDimension");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[1].get("PixelYDimension");
        if (!(setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 == null)) {
            this.setCheckable[0].put("ImageWidth", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver);
            this.setCheckable[0].put("ImageLength", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2);
        }
        if (this.setCheckable[4].isEmpty() && read((HashMap) this.setCheckable[5])) {
            HashMap<String, C1546xeda7e7f8>[] hashMapArr = this.setCheckable;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!read((HashMap) this.setCheckable[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(setSubtitleTextAppearance$MediaBrowserCompat$ItemReceiver setsubtitletextappearance_mediabrowsercompat_itemreceiver, int i) throws IOException {
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver;
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2;
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 = this.setCheckable[i].get("DefaultCropSize");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 = this.setCheckable[i].get("SensorTopBorder");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver5 = this.setCheckable[i].get("SensorLeftBorder");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver6 = this.setCheckable[i].get("SensorBottomBorder");
        C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver7 = this.setCheckable[i].get("SensorRightBorder");
        if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 != null) {
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3.write == 5) {
                IconCompatParcelizer[] iconCompatParcelizerArr = (IconCompatParcelizer[]) setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                if (iconCompatParcelizerArr == null || iconCompatParcelizerArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(iconCompatParcelizerArr));
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[0];
                IconCompatParcelizer[] iconCompatParcelizerArr2 = {iconCompatParcelizer};
                setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = C1546xeda7e7f8.IconCompatParcelizer(iconCompatParcelizerArr2, this.setExpandedFormat);
                IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizerArr[1];
                IconCompatParcelizer[] iconCompatParcelizerArr3 = {iconCompatParcelizer2};
                setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = C1546xeda7e7f8.IconCompatParcelizer(iconCompatParcelizerArr3, this.setExpandedFormat);
            } else {
                int[] iArr = (int[]) setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3.MediaBrowserCompat$CustomActionResultReceiver(this.setExpandedFormat);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = C1546xeda7e7f8.read(iArr[0], this.setExpandedFormat);
                setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = C1546xeda7e7f8.read(iArr[1], this.setExpandedFormat);
            }
            this.setCheckable[i].put("ImageWidth", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2);
            this.setCheckable[i].put("ImageLength", setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver);
        } else if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver5 == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver6 == null || setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver7 == null) {
            MediaBrowserCompat$ItemReceiver(setsubtitletextappearance_mediabrowsercompat_itemreceiver, i);
        } else {
            int write2 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4.write(this.setExpandedFormat);
            int write3 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver6.write(this.setExpandedFormat);
            int write4 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver7.write(this.setExpandedFormat);
            int write5 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver5.write(this.setExpandedFormat);
            if (write3 > write2 && write4 > write5) {
                C1546xeda7e7f8 read2 = C1546xeda7e7f8.read(write3 - write2, this.setExpandedFormat);
                C1546xeda7e7f8 read3 = C1546xeda7e7f8.read(write4 - write5, this.setExpandedFormat);
                this.setCheckable[i].put("ImageLength", read2);
                this.setCheckable[i].put("ImageWidth", read3);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) throws IOException {
        if (!this.setCheckable[i].isEmpty() && !this.setCheckable[i2].isEmpty()) {
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver = this.setCheckable[i].get("ImageLength");
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 = this.setCheckable[i].get("ImageWidth");
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 = this.setCheckable[i2].get("ImageLength");
            C1546xeda7e7f8 setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 = this.setCheckable[i2].get("ImageWidth");
            if (setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2 != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3 != null && setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4 != null) {
                int write2 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver.write(this.setExpandedFormat);
                int write3 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver2.write(this.setExpandedFormat);
                int write4 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver3.write(this.setExpandedFormat);
                int write5 = setsubtitletextappearance_mediabrowsercompat_customactionresultreceiver4.write(this.setExpandedFormat);
                if (write2 < write4 && write3 < write5) {
                    HashMap<String, C1546xeda7e7f8>[] hashMapArr = this.setCheckable;
                    HashMap<String, C1546xeda7e7f8> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    private static long[] write(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
