package p040o;

import java.util.List;
import p040o.ContactUsActivity_ViewBinding;

/* renamed from: o.IMapViewDelegate */
public final /* synthetic */ class IMapViewDelegate implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ MapStyleOptions write;

    public /* synthetic */ IMapViewDelegate(MapStyleOptions mapStyleOptions) {
        this.write = mapStyleOptions;
    }

    public final Object read(Object obj, Object obj2) {
        MapStyleOptions mapStyleOptions = this.write;
        LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver = (LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver) obj;
        List list = (List) obj2;
        show show = new show(lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat);
        navigate$MediaBrowserCompat$CustomActionResultReceiver navigate_mediabrowsercompat_customactionresultreceiver = new navigate$MediaBrowserCompat$CustomActionResultReceiver(mapStyleOptions, list);
        while (show.IconCompatParcelizer.hasNext()) {
            navigate_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver(show.IconCompatParcelizer.next());
        }
        show show2 = new show(lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
        ContactUsActivity_ViewBinding.read read = new ContactUsActivity_ViewBinding.read(mapStyleOptions, list);
        while (show2.IconCompatParcelizer.hasNext()) {
            read.MediaBrowserCompat$ItemReceiver(show2.IconCompatParcelizer.next());
        }
        show show3 = new show(lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.RatingCompat);
        getMap getmap = new getMap(mapStyleOptions, list);
        while (show3.IconCompatParcelizer.hasNext()) {
            getmap.MediaBrowserCompat$ItemReceiver(show3.IconCompatParcelizer.next());
        }
        return lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver;
    }
}
