package p040o;

/* renamed from: o.forEachSrc$MediaBrowserCompat$ItemReceiver */
public final class forEachSrc$MediaBrowserCompat$ItemReceiver {
    public static String MediaBrowserCompat$CustomActionResultReceiver() {
        return "mobileinternet_tile_click";
    }

    public static String write() {
        return "tile_name";
    }

    private forEachSrc$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ forEachSrc$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static String read(long j) {
        if (j == forEachSrc.AIS_CALL.tileId) {
            return "ais_1_2_call";
        }
        if (j == forEachSrc.DTAC_HAPPY_REFIL.tileId) {
            return "dtac_happy_refill";
        }
        if (j == forEachSrc.TRUE_MOVE_PREPAID.tileId) {
            return "truemoveh_prepaid";
        }
        if (j == forEachSrc.PENGUIN_SIM_REFIL.tileId) {
            return "penguin_sim_refill";
        }
        if (j == forEachSrc.AIS_POSTPAID.tileId) {
            return "ais_postpaid";
        }
        if (j == forEachSrc.DTAC_TRINET.tileId) {
            return "dtac_trinet";
        }
        if (j == forEachSrc.TRUE_GROUP_BILL.tileId) {
            return "true_group_bill";
        }
        if (j == forEachSrc.TRIPLET_INTERNET.tileId) {
            return "triple_t_internet";
        }
        if (j == forEachSrc.AIS_ADD_ON.tileId) {
            return "ais_add_on";
        }
        if (j == forEachSrc.DTAC_ADD_ON.tileId) {
            return "dtac_add_on";
        }
        if (j == forEachSrc.TRUE_MOVE_ADD_ON.tileId) {
            return "true_add_on";
        }
        return null;
    }
}
