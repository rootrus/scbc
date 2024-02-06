package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.getPlaceId;

/* renamed from: o.getPosY */
public class getPosY extends writeUInt64NoTag<RttiPassportExtractor_Factory> {
    public final setHelperText IconCompatParcelizer;
    public List<MoreExecutors> MediaBrowserCompat$ItemReceiver;
    public MoreExecutors MediaBrowserCompat$MediaItem;
    public lambda$getSortedCustomAttributes$0 MediaBrowserCompat$SearchResultReceiver;
    public List<getPlaceId.IconCompatParcelizer> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private final MapMaker MediaSessionCompat$QueueItem;
    public final setPasswordVisibilityToggleEnabled read;
    public final setTypeface write;

    @HmlPinActivity
    public getPosY(RegularImmutableBiMap regularImmutableBiMap, MapMaker mapMaker, setHelperText sethelpertext, setTypeface settypeface, setPasswordVisibilityToggleEnabled setpasswordvisibilitytoggleenabled) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = sethelpertext;
        this.MediaSessionCompat$QueueItem = mapMaker;
        this.write = settypeface;
        this.read = setpasswordvisibilitytoggleenabled;
    }

    public void onDestroy() {
        setHelperText sethelpertext = this.IconCompatParcelizer;
        if (!sethelpertext.MediaBrowserCompat$MediaItem.isDisposed()) {
            sethelpertext.MediaBrowserCompat$MediaItem.dispose();
        }
        setPasswordVisibilityToggleEnabled setpasswordvisibilitytoggleenabled = this.read;
        if (!setpasswordvisibilitytoggleenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            setpasswordvisibilitytoggleenabled.MediaBrowserCompat$MediaItem.dispose();
        }
        setTypeface settypeface = this.write;
        if (!settypeface.MediaBrowserCompat$MediaItem.isDisposed()) {
            settypeface.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getPosY getposy) {
        if (getposy.RatingCompat != null) {
            getposy.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getPosY getposy) {
        ArrayList arrayList = new ArrayList();
        for (getPlaceId.IconCompatParcelizer iconCompatParcelizer : getposy.MediaDescriptionCompat) {
            arrayList.add(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        }
        proxyProvideIDocumentBaseOverlayView proxyprovideidocumentbaseoverlayview = new proxyProvideIDocumentBaseOverlayView(arrayList);
        if (getposy.RatingCompat != null) {
            proxyprovideidocumentbaseoverlayview.IconCompatParcelizer(getposy.RatingCompat);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getPosY getposy) {
        if (getposy.RatingCompat != null) {
            getposy.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getPosY getposy) {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (MoreExecutors next : getposy.MediaBrowserCompat$ItemReceiver) {
            if (next.MediaBrowserCompat$ItemReceiver.equalsIgnoreCase("TH")) {
                i = getposy.MediaBrowserCompat$ItemReceiver.indexOf(next);
            }
            arrayList.add(next.IconCompatParcelizer);
        }
        boolean z = true;
        provideIDocumentBaseOverlayView provideidocumentbaseoverlayview = new provideIDocumentBaseOverlayView(arrayList, i + 1);
        if (getposy.RatingCompat == null) {
            z = false;
        }
        if (z) {
            provideidocumentbaseoverlayview.IconCompatParcelizer(getposy.RatingCompat);
        }
    }

    static /* synthetic */ void read(getPosY getposy) {
        if (getposy.RatingCompat != null) {
            getposy.RatingCompat.aj_();
        }
    }
}
