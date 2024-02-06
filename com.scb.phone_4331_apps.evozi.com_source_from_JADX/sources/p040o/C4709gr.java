package p040o;

import java.util.Map;
import p040o.withKeyValueSeparator;

/* renamed from: o.gr */
public final /* synthetic */ class C4709gr implements findFragmentByWho {
    private final /* synthetic */ C4746he MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Map read;
    private final /* synthetic */ withKeyValueSeparator.IconCompatParcelizer write;

    public /* synthetic */ C4709gr(C4746he heVar, Map map, withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = heVar;
        this.read = map;
        this.write = iconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        C4746he heVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Map map = this.read;
        return heVar.MediaBrowserCompat$CustomActionResultReceiver((isSimulator) map.get(((isSimulator) obj).RatingCompat), this.write);
    }
}
