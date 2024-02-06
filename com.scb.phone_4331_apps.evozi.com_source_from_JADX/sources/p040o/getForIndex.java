package p040o;

/* renamed from: o.getForIndex */
public final /* synthetic */ class getForIndex {
    public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[GeofencingClient.values().length];
        MediaBrowserCompat$CustomActionResultReceiver = iArr;
        iArr[GeofencingClient.CAR.ordinal()] = 1;
        MediaBrowserCompat$CustomActionResultReceiver[GeofencingClient.FIRE.ordinal()] = 2;
        MediaBrowserCompat$CustomActionResultReceiver[GeofencingClient.HEALTH.ordinal()] = 3;
        int[] iArr2 = new int[GeofencingClient.values().length];
        read = iArr2;
        iArr2[GeofencingClient.CAR.ordinal()] = 1;
        read[GeofencingClient.FIRE.ordinal()] = 2;
        read[GeofencingClient.HEALTH.ordinal()] = 3;
        int[] iArr3 = new int[GeofencingClient.values().length];
        write = iArr3;
        iArr3[GeofencingClient.CAR.ordinal()] = 1;
        write[GeofencingClient.FIRE.ordinal()] = 2;
        write[GeofencingClient.HEALTH.ordinal()] = 3;
    }
}
