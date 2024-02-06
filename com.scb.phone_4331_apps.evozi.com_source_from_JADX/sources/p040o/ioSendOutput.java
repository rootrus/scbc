package p040o;

/* renamed from: o.ioSendOutput */
public final class ioSendOutput extends createCubemapFromCubeFaces<BaseObj> {
    public ioSendOutput(BaseObj baseObj) {
        super(baseObj);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 1037) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        byte[] IconCompatParcelizer = ((BaseObj) this.write).IconCompatParcelizer(1037);
        if (IconCompatParcelizer == null || IconCompatParcelizer.length < 4) {
            return null;
        }
        String format = String.format("%d %d %d %d", new Object[]{Byte.valueOf(IconCompatParcelizer[0]), Byte.valueOf(IconCompatParcelizer[1]), Byte.valueOf(IconCompatParcelizer[2]), Byte.valueOf(IconCompatParcelizer[3])});
        if (format.equals("0 0 0 0")) {
            return "Program AE";
        }
        if (format.equals("1 0 0 0")) {
            return "Aperture-priority AE";
        }
        if (format.equals("1 1 0 0")) {
            return "Aperture-priority AE (1)";
        }
        if (format.equals("2 0 0 0")) {
            return "Shutter speed priority AE";
        }
        if (format.equals("3 0 0 0")) {
            return "Manual";
        }
        return String.format("Unknown (%s)", new Object[]{format});
    }
}
