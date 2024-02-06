package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageFileHeight$MediaSessionCompat$ResultReceiverWrapper */
final class setImageFileHeight$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.setIcon> {
    private /* synthetic */ getSharedPrefs IconCompatParcelizer;
    private /* synthetic */ setImageFileHeight MediaBrowserCompat$ItemReceiver;

    setImageFileHeight$MediaSessionCompat$ResultReceiverWrapper(setImageFileHeight setimagefileheight, getSharedPrefs getsharedprefs) {
        this.MediaBrowserCompat$ItemReceiver = setimagefileheight;
        this.IconCompatParcelizer = getsharedprefs;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckExtractActivity_MembersInjector.setIcon seticon = (CheckExtractActivity_MembersInjector.setIcon) obj;
        leastOf unused = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
        seticon.read(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) this.IconCompatParcelizer));
        usingToString unused2 = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem;
        seticon.read(usingToString.read(this.IconCompatParcelizer));
        seticon.read(this.IconCompatParcelizer.read);
        seticon.write(setImageFileHeight.RatingCompat(this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer);
    }
}
