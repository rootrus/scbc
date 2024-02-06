package org.beyka.tiffbitmapfactory;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import org.beyka.tiffbitmapfactory.exceptions.CantOpenFileException;
import org.beyka.tiffbitmapfactory.exceptions.DecodeTiffException;
import org.beyka.tiffbitmapfactory.exceptions.NotEnoughtMemoryException;

public class TiffBitmapFactory {
    private static native Bitmap nativeDecodePath(String str, Options options, IProgressListener iProgressListener);

    static {
        System.loadLibrary("tiff");
        System.loadLibrary("tifffactory");
    }

    public enum ImageConfig {
        ARGB_8888(2),
        RGB_565(4),
        ALPHA_8(8);
        
        final int ordinal;

        private ImageConfig(int i) {
            this.ordinal = i;
        }
    }

    public static Bitmap decodeFile(File file) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(file.getAbsolutePath());
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(file.getAbsolutePath(), new Options(), (IProgressListener) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(file.getAbsolutePath());
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static Bitmap decodeFile(File file, Options options) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(file.getAbsolutePath());
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(file.getAbsolutePath(), options, (IProgressListener) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(file.getAbsolutePath());
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static Bitmap decodeFile(File file, Options options, IProgressListener iProgressListener) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(file.getAbsolutePath());
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(file.getAbsolutePath(), options, iProgressListener);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(file.getAbsolutePath());
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static Bitmap decodePath(String str) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(str);
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(str, new Options(), (IProgressListener) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(str);
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static Bitmap decodePath(String str, Options options) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(str);
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(str, options, (IProgressListener) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(str);
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static Bitmap decodePath(String str, Options options, IProgressListener iProgressListener) throws CantOpenFileException, DecodeTiffException, NotEnoughtMemoryException {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("Starting decode ");
        sb.append(str);
        Log.i("THREAD", sb.toString());
        Bitmap nativeDecodePath = nativeDecodePath(str, options, iProgressListener);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("elapsed ms: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" for ");
        sb2.append(str);
        Log.w("THREAD", sb2.toString());
        return nativeDecodePath;
    }

    public static final class Options {
        public long inAvailableMemory = 256000000;
        public DecodeArea inDecodeArea;
        public int inDirectoryNumber = 0;
        public boolean inJustDecodeBounds = false;
        public ImageConfig inPreferredConfig = ImageConfig.ARGB_8888;
        public int inSampleSize = 1;
        public boolean inSwapRedBlueColors = false;
        public boolean inThrowException = false;
        public boolean inUseOrientationTag = false;
        private volatile boolean isStoped = false;
        public String outAuthor = "";
        public int outBitsPerSample;
        public CompressionScheme outCompressionScheme;
        public String outCopyright = "";
        public int outCurDirectoryNumber;
        public String outDatetime = "";
        public int outDirectoryCount = -1;
        public FillOrder outFillOrder;
        public int outHeight = -1;
        public String outHostComputer = "";
        public String outImageDescription = "";
        public Orientation outImageOrientation = Orientation.UNAVAILABLE;
        public int outNumberOfStrips;
        public Photometric outPhotometric;
        public PlanarConfig outPlanarConfig;
        public ResolutionUnit outResolutionUnit;
        public int outRowPerStrip;
        public int outSamplePerPixel;
        public String outSoftware = "";
        public int outStripSize;
        public int outTileHeight;
        public int outTileWidth;
        public int outWidth = -1;
        public float outXResolution;
        public float outYResolution;

        public final void stop() {
            this.isStoped = true;
        }
    }
}
