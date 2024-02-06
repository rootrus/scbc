package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ComponentDiscovery;
import p040o.GoogleMap;

/* renamed from: o.matchesWildcardPublicSuffix */
public final class matchesWildcardPublicSuffix extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public matchesWildcardPublicSuffix(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    private static List<ComponentDiscovery.RegistrarNameRetriever> MediaBrowserCompat$CustomActionResultReceiver(List<onPolygonClick> list) {
        Iterable<onPolygonClick> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (onPolygonClick onpolygonclick : iterable) {
            ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever = r3;
            ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever2 = new ComponentDiscovery.RegistrarNameRetriever(onpolygonclick.MediaBrowserCompat$ItemReceiver, onpolygonclick.RatingCompat, onpolygonclick.IconCompatParcelizer, onpolygonclick.read, onpolygonclick.MediaBrowserCompat$CustomActionResultReceiver, onpolygonclick.MediaBrowserCompat$SearchResultReceiver, onpolygonclick.MediaDescriptionCompat, onpolygonclick.write);
            arrayList.add(registrarNameRetriever);
        }
        return (List) arrayList;
    }

    public final lambda$processSetComponents$1 MediaBrowserCompat$ItemReceiver(createFromAttributes createfromattributes) {
        ComponentFactory componentFactory;
        createFromAttributes createfromattributes2 = createfromattributes;
        onGetStartedClick.write((Object) createfromattributes2, "purchaseSourceOfFund");
        GoogleMap.OnPoiClickListener onPoiClickListener = createfromattributes2.MediaBrowserCompat$ItemReceiver;
        List list = null;
        ComponentDiscovery.MetadataRegistrarNameRetriever metadataRegistrarNameRetriever = onPoiClickListener != null ? new ComponentDiscovery.MetadataRegistrarNameRetriever(MediaBrowserCompat$CustomActionResultReceiver(onPoiClickListener.MediaBrowserCompat$CustomActionResultReceiver), MediaBrowserCompat$CustomActionResultReceiver(onPoiClickListener.MediaBrowserCompat$MediaItem), onPoiClickListener.write, onPoiClickListener.MediaDescriptionCompat, onPoiClickListener.IconCompatParcelizer, onPoiClickListener.MediaMetadataCompat, onPoiClickListener.read, onPoiClickListener.MediaBrowserCompat$ItemReceiver) : null;
        String str = createfromattributes2.read;
        String str2 = createfromattributes2.MediaMetadataCompat;
        String str3 = createfromattributes2.MediaBrowserCompat$MediaItem;
        String str4 = createfromattributes2.MediaDescriptionCompat;
        List<String> list2 = createfromattributes2.MediaBrowserCompat$SearchResultReceiver;
        onMyLocationClick onmylocationclick = createfromattributes2.IconCompatParcelizer;
        getProvider getprovider = onmylocationclick != null ? new getProvider(onmylocationclick.IconCompatParcelizer, onmylocationclick.MediaBrowserCompat$ItemReceiver, onmylocationclick.write, onmylocationclick.MediaBrowserCompat$CustomActionResultReceiver, onmylocationclick.read, onmylocationclick.MediaBrowserCompat$MediaItem) : null;
        GoogleMap.OnPolygonClickListener onPolygonClickListener = createfromattributes2.write;
        retrieve retrieve = onPolygonClickListener != null ? new retrieve(onPolygonClickListener.read, onPolygonClickListener.MediaBrowserCompat$ItemReceiver, onPolygonClickListener.IconCompatParcelizer, onPolygonClickListener.MediaBrowserCompat$CustomActionResultReceiver) : null;
        onSnapshotReady onsnapshotready = createfromattributes2.MediaBrowserCompat$CustomActionResultReceiver;
        if (onsnapshotready != null) {
            String str5 = onsnapshotready.IconCompatParcelizer;
            GoogleMap.OnPolylineClickListener onPolylineClickListener = onsnapshotready.read;
            processInstanceComponents processinstancecomponents = onPolylineClickListener != null ? new processInstanceComponents(onPolylineClickListener.MediaBrowserCompat$ItemReceiver, onPolylineClickListener.read, onPolylineClickListener.MediaBrowserCompat$CustomActionResultReceiver, onPolylineClickListener.IconCompatParcelizer, onPolylineClickListener.MediaBrowserCompat$SearchResultReceiver, onPolylineClickListener.write) : null;
            List<onPolylineClick> list3 = onsnapshotready.write;
            if (list3 != null) {
                Iterable<onPolylineClick> iterable = list3;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (onPolylineClick onpolylineclick : iterable) {
                    ComponentRuntime componentRuntime = r15;
                    ComponentRuntime componentRuntime2 = new ComponentRuntime(onpolylineclick.MediaBrowserCompat$ItemReceiver, onpolylineclick.MediaBrowserCompat$CustomActionResultReceiver, onpolylineclick.IconCompatParcelizer, onpolylineclick.write, onpolylineclick.read);
                    arrayList.add(componentRuntime);
                }
                list = (List) arrayList;
            }
            componentFactory = new ComponentFactory(str5, processinstancecomponents, list);
        } else {
            componentFactory = null;
        }
        return new lambda$processSetComponents$1(metadataRegistrarNameRetriever, (String) null, (String) null, (String) null, (String) null, str, str2, str3, str4, list2, getprovider, retrieve, componentFactory);
    }
}
