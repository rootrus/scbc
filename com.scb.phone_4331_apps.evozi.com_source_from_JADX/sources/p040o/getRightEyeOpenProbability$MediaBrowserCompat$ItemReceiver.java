package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver */
public final class getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IExtractorListener> {
    public static final getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver();

    getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final IExtractorListener iExtractorListener = (IExtractorListener) obj;
        iExtractorListener.IconCompatParcelizer(new IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaBrowserCompat$ItemReceiver() {
                iExtractorListener.read();
            }
        });
    }
}
