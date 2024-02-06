package p040o;

import java.util.ArrayList;

/* renamed from: o.getSupportBackgroundTintList */
public final class getSupportBackgroundTintList {
    int IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    ArrayList<getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    int read;
    int write;

    public getSupportBackgroundTintList(setImageResource setimageresource) {
        int i;
        int i2;
        this.read = setimageresource.setHasNonEmbeddedTabs;
        this.write = setimageresource.setActionBarHideOffset;
        if (setimageresource.setTitleOptional == 8) {
            i = 0;
        } else {
            i = setimageresource.ActionBarContextView;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        if (setimageresource.setTitleOptional == 8) {
            i2 = 0;
        } else {
            i2 = setimageresource.PlaybackStateCompat;
        }
        this.IconCompatParcelizer = i2;
        ArrayList<setSupportImageTintList> IconCompatParcelizer2 = setimageresource.IconCompatParcelizer();
        int size = IconCompatParcelizer2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.MediaBrowserCompat$ItemReceiver.add(new getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.get(i3)));
        }
    }

    public final void read(setImageResource setimageresource) {
        setimageresource.setHasNonEmbeddedTabs = this.read;
        setimageresource.setActionBarHideOffset = this.write;
        setimageresource.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        setimageresource.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        int size = this.MediaBrowserCompat$ItemReceiver.size();
        for (int i = 0; i < size; i++) {
            getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver.get(i);
            setimageresource.write(getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver).read(getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver.IconCompatParcelizer, -1, getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver.write, getsupportbackgroundtintlist_mediabrowsercompat_itemreceiver.read, false);
        }
    }
}
