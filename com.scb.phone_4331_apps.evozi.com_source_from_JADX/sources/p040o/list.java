package p040o;

/* renamed from: o.list */
public final /* synthetic */ class list implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ list write = new list();

    private /* synthetic */ list() {
    }

    public final boolean write(Object obj) {
        PlaceDetectionClient placeDetectionClient = (PlaceDetectionClient) obj;
        if (placeDetectionClient == null) {
            return false;
        }
        String str = placeDetectionClient.MediaBrowserCompat$CustomActionResultReceiver;
        if (!(!(str == null || str.length() == 0))) {
            return false;
        }
        String str2 = placeDetectionClient.IconCompatParcelizer;
        if (!(str2 == null || str2.length() == 0)) {
            return true;
        }
        return false;
    }
}
