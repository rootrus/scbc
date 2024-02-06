package p040o;

/* renamed from: o.setRecyclerListener */
public final class setRecyclerListener {
    private static int[] MediaBrowserCompat$CustomActionResultReceiver = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean read(int i, int i2, int i3) {
        return i >= 0 && i < 24 && i2 >= 0 && i2 < 60 && i3 >= 0 && i3 < 60;
    }

    public static boolean write(int i, int i2, int i3) {
        if (i > 0 && i <= 9999 && i2 >= 0 && i2 <= 11) {
            int i4 = MediaBrowserCompat$CustomActionResultReceiver[i2];
            if (i2 == 1) {
                if (i % 4 == 0 && (i % 100 != 0 || i % TitleChanger.DEFAULT_ANIMATION_DELAY == 0)) {
                    i4++;
                }
            }
            if (i3 > 0 && i3 <= i4) {
                return true;
            }
        }
        return false;
    }
}
