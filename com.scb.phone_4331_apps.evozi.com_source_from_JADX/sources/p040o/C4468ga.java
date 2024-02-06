package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.withKeyValueSeparator;

/* renamed from: o.ga */
public final /* synthetic */ class C4468ga implements findFragmentByWho {
    private final /* synthetic */ withKeyValueSeparator.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ C4468ga(List list, withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer) {
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        List list = this.read;
        withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        show read2 = new show(list).read();
        show show = new show(read2.write, new getNextTransition(read2.IconCompatParcelizer, new C4703gi(iconCompatParcelizer)));
        show show2 = new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, C4462gT.IconCompatParcelizer));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (Integer) t;
        }
        throw new NoSuchElementException("No value present");
    }
}
