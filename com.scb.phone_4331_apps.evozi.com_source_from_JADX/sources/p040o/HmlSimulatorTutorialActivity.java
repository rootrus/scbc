package p040o;

/* renamed from: o.HmlSimulatorTutorialActivity */
public final class HmlSimulatorTutorialActivity implements Comparable<HmlSimulatorTutorialActivity> {
    public static final HmlSimulatorTutorialActivity read = new HmlSimulatorTutorialActivity();
    private final int IconCompatParcelizer = 72;
    private final int MediaBrowserCompat$CustomActionResultReceiver = 66376;
    private final int MediaBrowserCompat$ItemReceiver = 1;
    private final int write = 3;

    public final int hashCode() {
        return 66376;
    }

    private HmlSimulatorTutorialActivity() {
    }

    public final /* synthetic */ int compareTo(Object obj) {
        onGetStartedClick.write((Object) (HmlSimulatorTutorialActivity) obj, "other");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append('.');
        sb.append(3);
        sb.append('.');
        sb.append(72);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HmlSimulatorTutorialActivity)) {
            obj = null;
        }
        if (((HmlSimulatorTutorialActivity) obj) != null) {
            return true;
        }
        return false;
    }
}
