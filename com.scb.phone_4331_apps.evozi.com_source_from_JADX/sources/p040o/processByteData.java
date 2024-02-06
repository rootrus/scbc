package p040o;

import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.processByteData */
public final /* synthetic */ class processByteData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ColorPassThroughShader MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ processByteData(ColorPassThroughShader colorPassThroughShader, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = colorPassThroughShader;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ColorPassThroughShader colorPassThroughShader = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = colorPassThroughShader.MediaSessionCompat$Token;
        int i3 = colorPassThroughShader.ParcelableVolumeInfo;
        offset offset = colorPassThroughShader.f2688x50fd9e4a;
        ((setCvv.write) obj).write(i2, i3, String.format(offset.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.two_words_with_separator), new Object[]{offset.write(Double.valueOf((double) i2)), offset.write(Double.valueOf((double) i3))}), i);
    }
}
