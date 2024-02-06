package p040o;

import p040o.PlaceEntity;

/* renamed from: o.radius */
public final /* synthetic */ class radius implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ setUserPropertyInternal MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ radius(setUserPropertyInternal setuserpropertyinternal, String str) {
        this.MediaBrowserCompat$ItemReceiver = setuserpropertyinternal;
        this.write = str;
    }

    public final Object read(Object obj, Object obj2) {
        setUserPropertyInternal setuserpropertyinternal = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        C7506tP tPVar = (C7506tP) obj;
        zzwi zzwi = (zzwi) obj2;
        if (tPVar.MediaSessionCompat$QueueItem != null) {
            setuserpropertyinternal.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
        }
        PlaceEntity.zzb IconCompatParcelizer = setuserpropertyinternal.IconCompatParcelizer(tPVar, zzwi, str);
        setuserpropertyinternal.MediaSessionCompat$QueueItem = IconCompatParcelizer;
        return IconCompatParcelizer;
    }
}
