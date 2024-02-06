package p040o;

/* renamed from: o.forEachSrc */
public enum forEachSrc {
    AIS_CALL(4),
    DTAC_HAPPY_REFIL(5),
    TRUE_MOVE_PREPAID(6),
    PENGUIN_SIM_REFIL(16),
    AIS_POSTPAID(8),
    DTAC_TRINET(9),
    TRUE_GROUP_BILL(10),
    TRIPLET_INTERNET(11),
    AIS_ADD_ON(20),
    DTAC_ADD_ON(21),
    TRUE_MOVE_ADD_ON(22);
    
    private static final String AIS_ADD_ON_TAG = "ais_add_on";
    private static final String AIS_CALL_TAG = "ais_1_2_call";
    private static final String AIS_POSTPAID_TAG = "ais_postpaid";
    public static final forEachSrc$MediaBrowserCompat$ItemReceiver Companion = null;
    private static final String DTAC_ADD_ON_TAG = "dtac_add_on";
    private static final String DTAC_HAPPY_REFIL_TAG = "dtac_happy_refill";
    private static final String DTAC_TRINET_TAG = "dtac_trinet";
    private static final String MOBILE_INTERNET_TILE_EVENT_NAME = "mobileinternet_tile_click";
    private static final String MOBILE_INTERNET_TILE_EVENT_VALUE = "tile_name";
    private static final String PENGUIN_SIM_REFIL_TAG = "penguin_sim_refill";
    private static final String TRIPLET_INTERNET_TAG = "triple_t_internet";
    private static final String TRUE_GROUP_BILL_TAG = "true_group_bill";
    private static final String TRUE_MOVE_ADD_ON_TAG = "true_add_on";
    private static final String TRUE_MOVE_PREPAID_TAG = "truemoveh_prepaid";
    final long tileId;

    public static final String MediaBrowserCompat$CustomActionResultReceiver(long j) {
        return forEachSrc$MediaBrowserCompat$ItemReceiver.read(j);
    }

    public static final String read() {
        return forEachSrc$MediaBrowserCompat$ItemReceiver.write();
    }

    public static final String write() {
        return forEachSrc$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private forEachSrc(long j) {
        this.tileId = j;
    }

    static {
        Companion = new forEachSrc$MediaBrowserCompat$ItemReceiver((byte) 0);
    }
}
