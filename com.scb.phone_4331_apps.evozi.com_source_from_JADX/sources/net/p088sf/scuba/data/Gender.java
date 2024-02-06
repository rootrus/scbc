package net.p088sf.scuba.data;

/* renamed from: net.sf.scuba.data.Gender */
public enum Gender {
    ;

    public abstract int IconCompatParcelizer();

    public static Gender MediaBrowserCompat$ItemReceiver(int i) {
        for (Gender gender : values()) {
            if (gender.IconCompatParcelizer() == i) {
                return gender;
            }
        }
        return UNKNOWN;
    }
}
