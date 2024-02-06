package p040o;

import p040o.SingletonImmutableMap;
import p040o.setGuidingLine;
import p040o.writeUInt64NoTag;

/* renamed from: o.onLevelnessChanged */
public final /* synthetic */ class onLevelnessChanged implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setNeedBle MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setGuidingLine.read read;

    public /* synthetic */ onLevelnessChanged(setGuidingLine.read read2, setNeedBle setneedble) {
        this.read = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = setneedble;
    }

    public final void IconCompatParcelizer(Object obj) {
        setGuidingLine.read read2 = this.read;
        setNeedBle setneedble = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = setneedble.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        String str2 = setneedble.MediaBrowserCompat$CustomActionResultReceiver.read;
        SingletonImmutableMap.Values unused = setGuidingLine.this.MediaDescriptionCompat;
        ((CheckParameters_Factory) obj).IconCompatParcelizer(str, str2, SingletonImmutableMap.Values.write(setneedble.MediaBrowserCompat$SearchResultReceiver, "O"));
    }
}
