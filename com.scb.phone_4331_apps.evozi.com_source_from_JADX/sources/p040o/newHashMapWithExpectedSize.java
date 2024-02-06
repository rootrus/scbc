package p040o;

/* renamed from: o.newHashMapWithExpectedSize */
public final /* synthetic */ class newHashMapWithExpectedSize implements findFragmentByWho {
    private final /* synthetic */ safeGet read;

    public /* synthetic */ newHashMapWithExpectedSize(safeGet safeget) {
        this.read = safeget;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getJobId getjobid;
        FirebaseException firebaseException = (FirebaseException) obj;
        systemExit systemexit = firebaseException.IconCompatParcelizer;
        onStartCommand onstartcommand = null;
        if (systemexit != null) {
            getjobid = new getJobId(systemexit.MediaBrowserCompat$CustomActionResultReceiver, systemexit.MediaBrowserCompat$SearchResultReceiver, systemexit.MediaMetadataCompat, systemexit.write, systemexit.read, systemexit.MediaBrowserCompat$ItemReceiver, systemexit.IconCompatParcelizer);
        } else {
            getjobid = null;
        }
        FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = firebaseException.read;
        if (firebaseApp$$Lambda$1 != null) {
            onstartcommand = new onStartCommand(Double.valueOf(firebaseApp$$Lambda$1.MediaBrowserCompat$ItemReceiver), Double.valueOf(firebaseApp$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver), Double.valueOf(firebaseApp$$Lambda$1.IconCompatParcelizer));
        }
        return new getContainerId(getjobid, onstartcommand);
    }
}
