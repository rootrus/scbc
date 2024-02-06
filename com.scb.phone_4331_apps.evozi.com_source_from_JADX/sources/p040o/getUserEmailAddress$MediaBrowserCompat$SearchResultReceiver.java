package p040o;

import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUserEmailAddress$MediaBrowserCompat$SearchResultReceiver */
public final class getUserEmailAddress$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ getUserEmailAddress IconCompatParcelizer;
    private /* synthetic */ String read;

    public getUserEmailAddress$MediaBrowserCompat$SearchResultReceiver(getUserEmailAddress getuseremailaddress, String str) {
        this.IconCompatParcelizer = getuseremailaddress;
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractionParameters.ExtractionType extractionType = (ExtractionParameters.ExtractionType) obj;
        extractionType.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.IconCompatParcelizer);
        extractionType.write(this.read.length() > 0);
    }
}
