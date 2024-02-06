package p040o;

/* renamed from: o.setFromFieldPacker */
public final class setFromFieldPacker extends createCubemapFromCubeFaces<setSurface> {
    public setFromFieldPacker(setSurface setsurface) {
        super(setsurface);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 768) {
            return write(768, 1, "Fine", "Basic");
        }
        if (i == 770) {
            return write(768, 1, "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)");
        }
        if (i == 772) {
            return MediaBrowserCompat$CustomActionResultReceiver(772, "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", "Flash", "Cloudy", "Shadow");
        }
        if (i == 800) {
            return read(800, "%d C");
        }
        switch (i) {
            case 785:
                return MediaBrowserCompat$ItemReceiver(785);
            case 786:
                return MediaBrowserCompat$ItemReceiver(786);
            case 787:
                return MediaBrowserCompat$ItemReceiver(787);
            default:
                switch (i) {
                    case 802:
                    case 803:
                    case 804:
                        return MediaBrowserCompat$ItemReceiver(i);
                    default:
                        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
        }
    }
}
