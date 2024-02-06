package p040o;

/* renamed from: o.forEachDstOut */
public enum forEachDstOut {
    FAMILY_FRIENDS_LANDING(1),
    MOBILE_INTERNET_LANDING(2),
    EASY_PASS_LANDING(12),
    UTILITIES_LANDING(13);
    
    private int tileType;

    private forEachDstOut(int i) {
        this.tileType = i;
    }

    public static String IconCompatParcelizer(int i) {
        if (MOBILE_INTERNET_LANDING.tileType == i) {
            return "mobileinternet_landing";
        }
        if (FAMILY_FRIENDS_LANDING.tileType == i) {
            return "friendsfamily_landing";
        }
        if (EASY_PASS_LANDING.tileType == i) {
            return "easypass_landing";
        }
        if (UTILITIES_LANDING.tileType == i) {
            return "utilities_landing";
        }
        return null;
    }
}
