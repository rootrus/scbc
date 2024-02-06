package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.upperCaseFirstLetter$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5441xc0b16631<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.read> {
    private /* synthetic */ upperCaseFirstLetter IconCompatParcelizer;

    public C5441xc0b16631(upperCaseFirstLetter uppercasefirstletter) {
        this.IconCompatParcelizer = uppercasefirstletter;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.read read = (getFirstName.read) obj;
        read.MediaBrowserCompat$ItemReceiver();
        read.write();
        read.read();
        read.IconCompatParcelizer();
        read.MediaBrowserCompat$MediaItem();
        upperCaseFirstLetter.read(this.IconCompatParcelizer);
    }
}
