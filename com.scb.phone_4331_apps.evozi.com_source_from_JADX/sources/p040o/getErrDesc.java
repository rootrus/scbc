package p040o;

import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import java.util.NoSuchElementException;
import p040o.CharMatcher;
import p040o.WellBehavedMap;
import p040o.getProject;

/* renamed from: o.getErrDesc */
public class getErrDesc extends getOCRDescription<getProject.IconCompatParcelizer> {
    @HmlPinActivity
    public getErrDesc(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, AppendableWriter appendableWriter, WellBehavedMap.KeyToEntryConverter.C39541 r4) {
        super(regularImmutableBiMap, appendableWriter, lookupTable, r4);
    }

    static /* synthetic */ void IconCompatParcelizer(boolean z, getProject.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.write(z && iconCompatParcelizer.write());
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, getProject.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.write(z && iconCompatParcelizer.write());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        isSupportFragmentClass issupportfragmentclass;
        if ("LANDING".equals(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read)) {
            super.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        String str = this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem() != null && !this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem().write.isEmpty()) {
            show show = new show(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem().write);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getEndTime(str)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                getProcessingProfile getprocessingprofile = new getProcessingProfile(this.write.write((JuristicRequestFormActivity.read) t));
                if (this.RatingCompat != null) {
                    getprocessingprofile.IconCompatParcelizer(this.RatingCompat);
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaDescriptionCompat(), new setSourceImage(this), new ImageProcessEventDao(this));
    }
}
