package p040o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import java.util.ArrayList;
import java.util.List;
import p040o.AppStatsDao;
import p040o.CharMatcher;
import p040o.IIdExtractor;
import p040o.WellBehavedMap;

/* renamed from: o.getPropTypeDescrip */
public final class getPropTypeDescrip extends writeUInt64NoTag<IIdExtractor.write> implements IIdExtractor$MediaBrowserCompat$CustomActionResultReceiver {
    final WellBehavedMap.KeyToEntryConverter IconCompatParcelizer;
    private final Resources read;
    final CharMatcher.LookupTable write;

    public final /* synthetic */ void IconCompatParcelizer(IIdExtractor.write write2) {
        super.MediaBrowserCompat$ItemReceiver(write2);
    }

    @HmlPinActivity
    public getPropTypeDescrip(RegularImmutableBiMap regularImmutableBiMap, Resources resources, CharMatcher.LookupTable lookupTable, WellBehavedMap.KeyToEntryConverter keyToEntryConverter) {
        super(regularImmutableBiMap);
        this.read = resources;
        this.write = lookupTable;
        this.IconCompatParcelizer = keyToEntryConverter;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        scrollBy scrollby = this.write.read;
        boolean z = true;
        if (scrollby == null) {
            thresholdReached thresholdreached = thresholdReached.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                thresholdreached.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        Bitmap MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(scrollby.write, BitmapFactory.decodeResource(this.read, Iterables$3$MediaBrowserCompat$ItemReceiver.thai_qr_logo), 5.0d);
        if (write()) {
            setDocumentType setdocumenttype = new setDocumentType(this, this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo.get(0));
            if (this.RatingCompat != null) {
                setdocumenttype.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            SessEventDao sessEventDao = SessEventDao.write;
            if (this.RatingCompat != null) {
                sessEventDao.IconCompatParcelizer(this.RatingCompat);
            }
        }
        getCreationTime getcreationtime = new getCreationTime(this, MediaBrowserCompat$ItemReceiver, scrollby);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getcreationtime.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final String read() {
        scrollBy scrollby = this.write.read;
        if (scrollby != null) {
            return scrollby.write;
        }
        return null;
    }

    public final void write(String str) {
        scrollBy scrollby = this.write.read;
        if (scrollby != null) {
            onGetStartedClick.write((Object) str, "<set-?>");
            scrollby.write = str;
        }
    }

    public final getBuildVersion MediaBrowserCompat$ItemReceiver() {
        if (!write()) {
            return null;
        }
        return this.IconCompatParcelizer.read(this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo.get(0));
    }

    private boolean write() {
        List arrayList = new ArrayList();
        MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            arrayList = MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        }
        return arrayList != null && !arrayList.isEmpty();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        AppStatsDao.C3029b bVar = new AppStatsDao.C3029b(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str, BitmapFactory.decodeResource(this.read, Iterables$3$MediaBrowserCompat$ItemReceiver.thai_qr_logo), 5.0d), str2, str3);
        if (this.RatingCompat != null) {
            bVar.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
