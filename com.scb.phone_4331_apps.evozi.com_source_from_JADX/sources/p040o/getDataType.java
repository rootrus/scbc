package p040o;

import java.util.HashMap;

/* renamed from: o.getDataType */
public final class getDataType extends createFromBitmapResource {
    private static HashMap<Integer, String> write;
    private final setOnScrollListener read;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(2, "Image Height");
        write.put(1, "Image Width");
        write.put(3, "Bits Per Sample");
        write.put(4, "Color Type");
        write.put(5, "Compression Type");
        write.put(6, "Filter Method");
        write.put(7, "Interlace Method");
        write.put(8, "Palette Size");
        write.put(9, "Palette Has Transparency");
        write.put(10, "sRGB Rendering Intent");
        write.put(11, "Image Gamma");
        write.put(12, "ICC Profile Name");
        write.put(13, "Textual Data");
        write.put(14, "Last Modification Time");
        write.put(15, "Background Color");
        write.put(16, "Pixels Per Unit X");
        write.put(17, "Pixels Per Unit Y");
        write.put(18, "Unit Specifier");
        write.put(19, "Significant Bits");
    }

    public getDataType(setOnScrollListener setonscrolllistener) {
        this.read = setonscrolllistener;
        read((createCubemapFromCubeFaces) new getSubElement(this));
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append("PNG-");
        sb.append(this.read.read());
        return sb.toString();
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
