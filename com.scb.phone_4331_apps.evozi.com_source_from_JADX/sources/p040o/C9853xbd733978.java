package p040o;

/* renamed from: o.addBarCodeFoundEventListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9853xbd733978 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLatLng> {
    final /* synthetic */ addBarCodeFoundEventListener write;

    private C9853xbd733978(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        this.write = addbarcodefoundeventlistener;
    }

    public /* synthetic */ C9853xbd733978(addBarCodeFoundEventListener addbarcodefoundeventlistener, byte b) {
        this(addbarcodefoundeventlistener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        getLatLng getlatlng = (getLatLng) obj;
        addBarCodeFoundEventListener.MediaBrowserCompat$ItemReceiver(this.write);
        show IconCompatParcelizer = show.IconCompatParcelizer(new show(getlatlng.IconCompatParcelizer), show.IconCompatParcelizer(new show(getlatlng.MediaBrowserCompat$CustomActionResultReceiver), new show(getlatlng.read)));
        show show = new show(IconCompatParcelizer.write, new getNextTransition(IconCompatParcelizer.IconCompatParcelizer, new AboutToCaptureListener(this)));
        if (show.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            addBarCodeFoundEventListener addbarcodefoundeventlistener = this.write;
            imageIsAboutToCapture imageisabouttocapture = new imageIsAboutToCapture(this, issupportfragmentclass);
            if (addbarcodefoundeventlistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageisabouttocapture.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
                return;
            }
            return;
        }
        addBarCodeFoundEventListener addbarcodefoundeventlistener2 = this.write;
        getSearchDirection getsearchdirection = getSearchDirection.MediaBrowserCompat$ItemReceiver;
        if (addbarcodefoundeventlistener2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getsearchdirection.IconCompatParcelizer(addbarcodefoundeventlistener2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        addBarCodeFoundEventListener addbarcodefoundeventlistener = this.write;
        writeInstance writeinstance = new writeInstance(this, th);
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            writeinstance.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
        }
    }
}
