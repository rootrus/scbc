package p040o;

/* renamed from: o.setRecycledViewPool */
public enum setRecycledViewPool {
    Greyscale(0, "Greyscale", 1, 2, 4, 8, 16),
    TrueColor(2, "True Color", 8, 16),
    IndexedColor(3, "Indexed Color", 1, 2, 4, 8),
    GreyscaleWithAlpha(4, "Greyscale with Alpha", 8, 16),
    TrueColorWithAlpha(6, "True Color with Alpha", 8, 16);
    
    private final int[] _allowedBitDepths;
    public final String _description;
    final int _numericValue;

    public static setRecycledViewPool MediaBrowserCompat$ItemReceiver(int i) {
        for (setRecycledViewPool setrecycledviewpool : (setRecycledViewPool[]) setRecycledViewPool.class.getEnumConstants()) {
            if (setrecycledviewpool._numericValue == i) {
                return setrecycledviewpool;
            }
        }
        return null;
    }

    private setRecycledViewPool(int i, String str, int... iArr) {
        this._numericValue = i;
        this._description = str;
        this._allowedBitDepths = iArr;
    }
}
