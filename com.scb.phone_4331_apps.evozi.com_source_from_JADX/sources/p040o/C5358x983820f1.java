package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestPassword$MediaBrowserCompat$MediaItem$MediaBrowserCompat$ItemReceiver */
final class C5358x983820f1<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor_Factory> {
    private /* synthetic */ List IconCompatParcelizer;
    private /* synthetic */ setRequestPassword$MediaBrowserCompat$MediaItem MediaBrowserCompat$CustomActionResultReceiver;

    C5358x983820f1(List list, setRequestPassword$MediaBrowserCompat$MediaItem setrequestpassword_mediabrowsercompat_mediaitem) {
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = setrequestpassword_mediabrowsercompat_mediaitem;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportExtractor_Factory passportExtractor_Factory = (PassportExtractor_Factory) obj;
        String str = setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$SearchResultReceiver;
        if (str == null) {
            str = "";
        }
        passportExtractor_Factory.write(str, this.IconCompatParcelizer, setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.IconCompatParcelizer.write.read() != null);
    }
}
