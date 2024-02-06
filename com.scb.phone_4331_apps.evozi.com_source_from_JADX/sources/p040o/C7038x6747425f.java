package p040o;

import java.util.NoSuchElementException;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.RttiBillExtractor_Factory$MediaBrowserCompat$SearchResultReceiver */
public final class C7038x6747425f<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setTitle> {
    private /* synthetic */ isSupportFragmentClass MediaBrowserCompat$CustomActionResultReceiver;

    public C7038x6747425f(isSupportFragmentClass issupportfragmentclass) {
        this.MediaBrowserCompat$CustomActionResultReceiver = issupportfragmentclass;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth.setTitle settitle = (getTopLeftCornerWidth.setTitle) obj;
        T t = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (t != null) {
            settitle.MediaBrowserCompat$ItemReceiver((parseOs) t);
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}
