package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.StreetViewPanoramaFragment */
public final class StreetViewPanoramaFragment {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String read;
    public String write;

    /* renamed from: o.StreetViewPanoramaFragment$zzb */
    public enum zzb {
        PROFILE,
        SCAN
    }

    /* renamed from: o.StreetViewPanoramaFragment$zza */
    public final class zza extends zzuk {
        public List<StreetViewPanoramaOptions> write = new ArrayList();

        public static zza MediaBrowserCompat$ItemReceiver() {
            return new zza();
        }
    }
}
