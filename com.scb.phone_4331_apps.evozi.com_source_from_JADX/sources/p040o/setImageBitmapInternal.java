package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.LinkedHashMultimap;

/* renamed from: o.setImageBitmapInternal */
public class setImageBitmapInternal extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setItemInvoker> {
    public endAdUnitExposure IconCompatParcelizer;
    public LinkedHashMultimap.SetDecorator MediaBrowserCompat$ItemReceiver;
    double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver = "0";

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2943x50fd9e4a;
    nullsLast MediaDescriptionCompat;
    String MediaMetadataCompat;
    leastOf ParcelableVolumeInfo;
    getResourcesIdentifier read;
    public String write = "0";

    @HmlPinActivity
    setImageBitmapInternal(RegularImmutableBiMap regularImmutableBiMap, LinkedHashMultimap.SetDecorator setDecorator, nullsLast nullslast, usingToString usingtostring, leastOf leastof, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = setDecorator;
        this.MediaDescriptionCompat = nullslast;
        this.ParcelableVolumeInfo = leastof;
        this.f2943x50fd9e4a = str;
    }

    public void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaDescriptionCompat = null;
        this.ParcelableVolumeInfo = null;
        super.onDestroy();
    }

    public void MediaBrowserCompat$ItemReceiver(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap.SetDecorator setDecorator = this.MediaBrowserCompat$ItemReceiver;
        C3341F f = new C3341F(this);
        C3432H h = new C3432H(this);
        nextInTable nextintable = new nextInTable("0", this.MediaBrowserCompat$SearchResultReceiver, this.write, this.f2943x50fd9e4a, str);
        onGetStartedClick.write((Object) f, "onSuccess");
        onGetStartedClick.write((Object) h, "onError");
        onGetStartedClick.write((Object) nextintable, "request");
        setDecorator.IconCompatParcelizer(setDecorator.MediaBrowserCompat$CustomActionResultReceiver, f, h, new MultiProcessor$MediaBrowserCompat$CustomActionResultReceiver(nextintable));
    }
}
