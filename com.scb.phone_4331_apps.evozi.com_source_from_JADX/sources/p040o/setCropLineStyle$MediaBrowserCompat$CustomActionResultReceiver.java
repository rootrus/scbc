package p040o;

import p040o.access$2300;

/* renamed from: o.setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver */
final class setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AutocompleteFilter> {
    final /* synthetic */ setCropLineStyle IconCompatParcelizer;

    private setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver(setCropLineStyle setcroplinestyle) {
        this.IconCompatParcelizer = setcroplinestyle;
    }

    /* synthetic */ setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver(setCropLineStyle setcroplinestyle, byte b) {
        this(setcroplinestyle);
    }

    public final /* synthetic */ void onNext(Object obj) {
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            setCropLineStyle setcroplinestyle = this.IconCompatParcelizer;
            C9860aw awVar = new C9860aw(this, autocompleteFilter);
            if (setcroplinestyle.RatingCompat == null) {
                z = false;
            }
            if (z) {
                awVar.IconCompatParcelizer(setcroplinestyle.RatingCompat);
            }
            setCropLineStyle.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer);
        }
    }

    public final void onComplete() {
        setCropLineStyle.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
