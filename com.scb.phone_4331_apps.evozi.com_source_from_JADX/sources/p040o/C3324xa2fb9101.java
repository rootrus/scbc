package p040o;

/* renamed from: o.DocumentBaseOverlayView_Factory$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3324xa2fb9101 implements findFragmentByWho {
    private final /* synthetic */ getChimeraLifecycleFragmentImpl IconCompatParcelizer;

    private C3324xa2fb9101() {
    }

    public /* synthetic */ C3324xa2fb9101(getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
        this.IconCompatParcelizer = getchimeralifecyclefragmentimpl;
    }

    public final Object IconCompatParcelizer(Object obj) {
        MergePathsContent mergePathsContent = (MergePathsContent) obj;
        onStreetViewPanoramaChange onstreetviewpanoramachange = new onStreetViewPanoramaChange();
        onstreetviewpanoramachange.MediaBrowserCompat$ItemReceiver = mergePathsContent.IconCompatParcelizer;
        onstreetviewpanoramachange.write = mergePathsContent.MediaBrowserCompat$CustomActionResultReceiver;
        onstreetviewpanoramachange.IconCompatParcelizer = mergePathsContent.write;
        onstreetviewpanoramachange.MediaBrowserCompat$CustomActionResultReceiver = mergePathsContent.read;
        return onstreetviewpanoramachange;
    }
}
