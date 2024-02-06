package p040o;

/* renamed from: o.getMicrData */
public final /* synthetic */ class getMicrData implements Runnable {
    private final /* synthetic */ setImageFileRepresentation MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMicrData(setImageFileRepresentation setimagefilerepresentation) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagefilerepresentation;
    }

    public final void run() {
        setImageFileRepresentation setimagefilerepresentation = this.MediaBrowserCompat$CustomActionResultReceiver;
        setInputDocShortEdge setinputdocshortedge = setInputDocShortEdge.write;
        if (setimagefilerepresentation.RatingCompat != null) {
            setinputdocshortedge.IconCompatParcelizer(setimagefilerepresentation.RatingCompat);
        }
    }
}
