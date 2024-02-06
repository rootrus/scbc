package p040o;

import p040o.PlaceEntity;

/* renamed from: o.CustomCap */
public final /* synthetic */ class CustomCap implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setUserPropertyInternal MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ CustomCap(setUserPropertyInternal setuserpropertyinternal, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setuserpropertyinternal;
        this.read = str;
    }

    public final Object write(Object obj) {
        setUserPropertyInternal setuserpropertyinternal = this.MediaBrowserCompat$CustomActionResultReceiver;
        return setuserpropertyinternal.RatingCompat.MediaBrowserCompat$ItemReceiver(this.read, ((PlaceEntity.zzb) obj).setExpandedFormat);
    }
}
