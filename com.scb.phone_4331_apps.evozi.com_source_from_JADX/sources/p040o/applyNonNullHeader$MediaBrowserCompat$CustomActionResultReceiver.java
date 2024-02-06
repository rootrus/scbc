package p040o;

/* renamed from: o.applyNonNullHeader$MediaBrowserCompat$CustomActionResultReceiver */
public final class applyNonNullHeader$MediaBrowserCompat$CustomActionResultReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String IconCompatParcelizer;

    private applyNonNullHeader$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ applyNonNullHeader$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.IconCompatParcelizer = str;
    }

    public boolean write(Object obj) {
        return ((PlaceAutocompleteFragment) obj).code.equals(this.IconCompatParcelizer);
    }
}
