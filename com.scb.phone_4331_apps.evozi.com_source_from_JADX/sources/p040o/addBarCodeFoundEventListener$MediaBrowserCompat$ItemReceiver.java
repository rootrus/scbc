package p040o;

/* renamed from: o.addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver */
public final class addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<addLocationRequest> {
    final /* synthetic */ addBarCodeFoundEventListener IconCompatParcelizer;

    private addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        this.IconCompatParcelizer = addbarcodefoundeventlistener;
    }

    public /* synthetic */ addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver(addBarCodeFoundEventListener addbarcodefoundeventlistener, byte b) {
        this(addbarcodefoundeventlistener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        addBarCodeFoundEventListener.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer);
        show show = new show(((addLocationRequest) obj).MediaBrowserCompat$ItemReceiver);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new C9854aj(this)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z = true;
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            addBarCodeFoundEventListener addbarcodefoundeventlistener = this.IconCompatParcelizer;
            C9856ak akVar = new C9856ak(this, issupportfragmentclass);
            if (addbarcodefoundeventlistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                akVar.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
                return;
            }
            return;
        }
        addBarCodeFoundEventListener addbarcodefoundeventlistener2 = this.IconCompatParcelizer;
        onAutoFocus onautofocus = onAutoFocus.IconCompatParcelizer;
        if (addbarcodefoundeventlistener2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            onautofocus.IconCompatParcelizer(addbarcodefoundeventlistener2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        addBarCodeFoundEventListener addbarcodefoundeventlistener = this.IconCompatParcelizer;
        BarCodeCaptureView barCodeCaptureView = new BarCodeCaptureView(this, th);
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            barCodeCaptureView.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
        }
    }
}
