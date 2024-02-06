package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.populateMap */
public final class populateMap implements findFragmentByWho {
    private final /* synthetic */ doExecute read;

    private populateMap() {
    }

    public /* synthetic */ populateMap(doExecute doexecute) {
        this.read = doexecute;
    }

    public final Object IconCompatParcelizer(Object obj) {
        fromJsonReader fromjsonreader = (fromJsonReader) obj;
        zzvx write = zzvx.write();
        write.MediaBrowserCompat$ItemReceiver = fromjsonreader.read;
        write.read = FragmentBuilder_BindSummaryFragment.write(fromjsonreader.write, (OffsetDateTime) null);
        write.write = fromjsonreader.MediaBrowserCompat$ItemReceiver;
        write.MediaBrowserCompat$CustomActionResultReceiver = isFlat.read(fromjsonreader.IconCompatParcelizer);
        return write;
    }
}
