package org.beyka.tiffbitmapfactory;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import org.beyka.tiffbitmapfactory.exceptions.CantOpenFileException;
import org.beyka.tiffbitmapfactory.exceptions.NotEnoughtMemoryException;

public class TiffSaver {

    public static final class SaveOptions {
        public String author;
        public CompressionScheme compressionScheme = CompressionScheme.NONE;
        public String copyright;
        public String imageDescription;
        public long inAvailableMemory = 256000000;
        public boolean inThrowException = false;
        public Orientation orientation = Orientation.TOP_LEFT;
        public ResolutionUnit resUnit = ResolutionUnit.NONE;
        public float xResolution = BitmapDescriptorFactory.HUE_RED;
        public float yResolution = BitmapDescriptorFactory.HUE_RED;
    }

    private static native synchronized boolean save(String str, Bitmap bitmap, SaveOptions saveOptions, boolean z);

    static {
        System.loadLibrary("tiff");
        System.loadLibrary("tiffsaver");
    }

    public static boolean saveBitmap(File file, Bitmap bitmap) throws CantOpenFileException, NotEnoughtMemoryException {
        return saveBitmap(file.getAbsolutePath(), bitmap, new SaveOptions());
    }

    public static boolean saveBitmap(File file, Bitmap bitmap, SaveOptions saveOptions) throws CantOpenFileException {
        return saveBitmap(file.getAbsolutePath(), bitmap, saveOptions);
    }

    public static boolean saveBitmap(String str, Bitmap bitmap) throws CantOpenFileException {
        return saveBitmap(str, bitmap, new SaveOptions());
    }

    public static boolean saveBitmap(String str, Bitmap bitmap, SaveOptions saveOptions) throws CantOpenFileException {
        return save(str, bitmap, saveOptions, false);
    }

    public static boolean appendBitmap(File file, Bitmap bitmap) throws CantOpenFileException, NotEnoughtMemoryException {
        return appendBitmap(file.getAbsolutePath(), bitmap, new SaveOptions());
    }

    public static boolean appendBitmap(File file, Bitmap bitmap, SaveOptions saveOptions) throws CantOpenFileException {
        return appendBitmap(file.getAbsolutePath(), bitmap, saveOptions);
    }

    public static boolean appendBitmap(String str, int i, Bitmap bitmap) throws CantOpenFileException {
        return appendBitmap(str, bitmap, new SaveOptions());
    }

    public static boolean appendBitmap(String str, Bitmap bitmap, SaveOptions saveOptions) throws CantOpenFileException {
        return save(str, bitmap, saveOptions, true);
    }
}
