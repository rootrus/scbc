package p040o;

import android.content.Context;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;

/* renamed from: o.getImageOriginalDateTime */
public class getImageOriginalDateTime extends setImageDPI<CheckExtractActivity_MembersInjector.setVisibility> {
    protected final unmodifiableMultiset MediaBrowserCompat$ItemReceiver;
    private isRooted MediaBrowserCompat$MediaItem;
    public extractFieldFromSystemFile MediaBrowserCompat$SearchResultReceiver;
    protected final explicit MediaDescriptionCompat;
    private leastOf MediaMetadataCompat;
    public Detector read;
    Multisets.C36841 write;

    @HmlPinActivity
    public getImageOriginalDateTime(RegularImmutableBiMap regularImmutableBiMap, leastOf leastof, explicit explicit, unmodifiableMultiset unmodifiablemultiset, Detector detector, Multisets.C36841 r6) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = leastof;
        this.MediaDescriptionCompat = explicit;
        this.MediaBrowserCompat$ItemReceiver = unmodifiablemultiset;
        this.read = detector;
        this.write = r6;
    }

    public final void write(int i, boolean z) {
        extractFieldFromSystemFile extractfieldfromsystemfile = this.MediaBrowserCompat$MediaItem.RatingCompat.get(i);
        this.MediaBrowserCompat$SearchResultReceiver = extractfieldfromsystemfile;
        super.read(extractfieldfromsystemfile, i, z);
    }

    public final void read(String str, Context context) {
        double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue();
        if (this.IconCompatParcelizer.read != doubleValue) {
            boolean z = true;
            if (doubleValue > getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.AlertController$RecycleListView).doubleValue()) {
                getImageBarCodes getimagebarcodes = new getImageBarCodes(this, context);
                if (this.RatingCompat != null) {
                    getimagebarcodes.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (doubleValue < getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction).doubleValue()) {
                createScaledBitmap createscaledbitmap = new createScaledBitmap(this, context);
                if (this.RatingCompat != null) {
                    createscaledbitmap.IconCompatParcelizer(this.RatingCompat);
                }
            } else {
                imageDeleteFile imagedeletefile = imageDeleteFile.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat != null) {
                    imagedeletefile.IconCompatParcelizer(this.RatingCompat);
                }
            }
            C10178z zVar = new C10178z(doubleValue);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                zVar.IconCompatParcelizer(this.RatingCompat);
            }
            this.IconCompatParcelizer.read = doubleValue;
        }
    }

    static /* synthetic */ void write(double d, CheckExtractActivity_MembersInjector.setVisibility setvisibility) {
        setvisibility.aI_();
        setvisibility.write(d);
        setvisibility.MediaBrowserCompat$ItemReceiver();
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(CheckExtractActivity_MembersInjector.setVisibility setvisibility) {
        setvisibility.write(0.0d);
        this.IconCompatParcelizer.read = 0.0d;
    }

    static /* synthetic */ void write(getImageOriginalDateTime getimageoriginaldatetime) {
        if (getimageoriginaldatetime.RatingCompat != null) {
            getimageoriginaldatetime.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isRooted isrooted, String str) {
        if (isrooted != null && isrooted.RatingCompat != null && !isrooted.RatingCompat.isEmpty()) {
            this.IconCompatParcelizer = new isEmulator();
            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$MediaItem = isrooted;
            boolean z = false;
            extractFieldFromSystemFile extractfieldfromsystemfile = isrooted.RatingCompat.get(0);
            this.MediaBrowserCompat$SearchResultReceiver = extractfieldfromsystemfile;
            super.read(extractfieldfromsystemfile, 0, false);
            C5465y yVar = new C5465y(this, isrooted);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                yVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
