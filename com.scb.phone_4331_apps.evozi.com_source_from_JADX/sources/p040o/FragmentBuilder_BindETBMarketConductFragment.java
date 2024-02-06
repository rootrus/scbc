package p040o;

/* renamed from: o.FragmentBuilder_BindETBMarketConductFragment */
public enum FragmentBuilder_BindETBMarketConductFragment {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;
    
    public float mCoordinate;

    public static float write() {
        return RIGHT.mCoordinate - LEFT.mCoordinate;
    }

    public static float IconCompatParcelizer() {
        return BOTTOM.mCoordinate - TOP.mCoordinate;
    }
}
