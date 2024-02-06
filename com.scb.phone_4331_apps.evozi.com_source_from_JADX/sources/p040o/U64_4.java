package p040o;

/* renamed from: o.U64_4 */
public final class U64_4 extends createCubemapFromCubeFaces<createPixel> {
    public U64_4(createPixel createpixel) {
        super(createpixel);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 1) {
            return MediaBrowserCompat$CustomActionResultReceiver(1, "2.5 with fixed EGA palette information", null, "2.8 with modifiable EGA palette information", "2.8 without palette information (default palette)", "PC Paintbrush for Windows", "3.0 or better");
        }
        if (i == 10) {
            return write(10, 3, "24-bit color", "16 colors");
        }
        if (i != 12) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        return write(12, 1, "Color or B&W", "Grayscale");
    }
}
