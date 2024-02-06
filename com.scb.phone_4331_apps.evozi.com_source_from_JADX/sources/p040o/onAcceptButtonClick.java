package p040o;

import android.text.TextUtils;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanorama;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.onAcceptButtonClick */
public class onAcceptButtonClick extends writeUInt64NoTag<getTopLeftCornerWidth.read> {
    public CrashlyticsReport.FilesPayload.File IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    /* access modifiers changed from: private */
    public final allPrimitiveTypes MediaBrowserCompat$MediaItem;
    public final VisibleRegion MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener> MediaDescriptionCompat;
    public boolean read = false;
    String write;

    @HmlPinActivity
    public onAcceptButtonClick(VisibleRegion visibleRegion, allPrimitiveTypes allprimitivetypes, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = visibleRegion;
        this.MediaBrowserCompat$MediaItem = allprimitivetypes;
    }

    public final void read(CrashlyticsReport.FilesPayload.File file, String str, boolean z, boolean z2) {
        this.IconCompatParcelizer = file;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.read = z2;
        boolean z3 = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        if (!file.read) {
            if (str == null || str.length() == 0) {
                this.write = this.MediaBrowserCompat$SearchResultReceiver.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.toString());
            } else {
                this.write = str;
            }
        } else {
            this.write = this.MediaBrowserCompat$SearchResultReceiver.write.read(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.toString());
        }
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.toString());
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new C5093x84279d7c(this, z));
        C5195rK rKVar = new C5195rK(file);
        if (this.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            rKVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(onAcceptButtonClick onacceptbuttonclick) {
        if (onacceptbuttonclick.RatingCompat != null) {
            onacceptbuttonclick.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(onAcceptButtonClick onacceptbuttonclick) {
        if (onacceptbuttonclick.RatingCompat != null) {
            onacceptbuttonclick.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(onAcceptButtonClick onacceptbuttonclick) {
        String str = onacceptbuttonclick.write;
        boolean z = true;
        if (!(str != null && !str.isEmpty())) {
            setBorderColor setbordercolor = setBorderColor.MediaBrowserCompat$ItemReceiver;
            if (onacceptbuttonclick.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setbordercolor.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(onAcceptButtonClick onacceptbuttonclick) {
        if (onacceptbuttonclick.RatingCompat != null) {
            onacceptbuttonclick.RatingCompat.ay_();
        }
    }

    static /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaLongClickListener MediaDescriptionCompat(onAcceptButtonClick onacceptbuttonclick) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(onacceptbuttonclick.MediaDescriptionCompat);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new C5197rM(onacceptbuttonclick)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return null;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (StreetViewPanorama.OnStreetViewPanoramaLongClickListener) t;
        }
        throw new NoSuchElementException("No value present");
    }

    static /* synthetic */ int MediaBrowserCompat$ItemReceiver(onAcceptButtonClick onacceptbuttonclick, List list, String str) {
        instantiate instantiate;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        showNow MediaBrowserCompat$ItemReceiver2 = showNow.MediaBrowserCompat$ItemReceiver(0, onacceptbuttonclick.MediaDescriptionCompat.size());
        showNow shownow = new showNow(MediaBrowserCompat$ItemReceiver2.read, new getFragmentManager(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, new getViewBitmap(list, str)));
        if (shownow.IconCompatParcelizer.hasNext()) {
            instantiate = instantiate.write(shownow.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        } else {
            instantiate = instantiate.write();
        }
        if (!instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
            return 0;
        }
        if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
            return instantiate.write;
        }
        throw new NoSuchElementException("No value present");
    }
}
