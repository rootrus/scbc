package p040o;

import java.lang.ref.ReferenceQueue;

/* renamed from: o.HmlNTBOperatingAccountActivity */
public final class HmlNTBOperatingAccountActivity {
    private static final Thread MediaBrowserCompat$ItemReceiver = new Thread(new HmlNTBOccupationInfoActivity(read));
    public static final ReferenceQueue<HmlNTBMonthlyIncomeAboutActivity> read = new ReferenceQueue<>();
    public static final HmlNTBOperatingAccountActivity write = new HmlNTBOperatingAccountActivity();

    static {
        MediaBrowserCompat$ItemReceiver.setName("RealmFinalizingDaemon");
        MediaBrowserCompat$ItemReceiver.start();
    }
}
