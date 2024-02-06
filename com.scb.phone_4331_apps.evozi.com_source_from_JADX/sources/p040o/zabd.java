package p040o;

import p040o.MapFragment;

/* renamed from: o.zabd */
public final /* synthetic */ class zabd implements findFragmentByWho {
    public static final /* synthetic */ zabd read = new zabd();

    private /* synthetic */ zabd() {
    }

    public final Object IconCompatParcelizer(Object obj) {
        ExecutionModule executionModule = (ExecutionModule) obj;
        MapFragment.zzb zzb = new MapFragment.zzb();
        zzb.MediaBrowserCompat$MediaItem = executionModule.MediaBrowserCompat$MediaItem;
        zzb.MediaBrowserCompat$ItemReceiver = executionModule.MediaBrowserCompat$CustomActionResultReceiver;
        zzb.write = executionModule.read;
        zzb.MediaDescriptionCompat = executionModule.MediaBrowserCompat$ItemReceiver;
        zzb.read = Double.valueOf(executionModule.write).doubleValue();
        zzb.MediaBrowserCompat$CustomActionResultReceiver = executionModule.IconCompatParcelizer;
        return zzb;
    }
}
