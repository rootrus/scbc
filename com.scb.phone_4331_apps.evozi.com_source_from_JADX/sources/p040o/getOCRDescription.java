package p040o;

import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import java.util.NoSuchElementException;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.CharMatcher;
import p040o.WellBehavedMap;
import p040o.getProject;
import p040o.getProject.write;

/* renamed from: o.getOCRDescription */
public abstract class getOCRDescription<V extends getProject.write> extends writeUInt64NoTag<V> {
    protected final CharMatcher.LookupTable MediaBrowserCompat$ItemReceiver;
    protected final AppendableWriter write;

    public getOCRDescription(RegularImmutableBiMap regularImmutableBiMap, AppendableWriter appendableWriter, CharMatcher.LookupTable lookupTable, WellBehavedMap.KeyToEntryConverter.C39541 r4) {
        super(regularImmutableBiMap);
        this.write = appendableWriter;
        this.MediaBrowserCompat$ItemReceiver = lookupTable;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        isSupportFragmentClass issupportfragmentclass;
        String str = this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        show show = new show(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem().write);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new addAppStatsDaoCalcObjSizeListener(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            C3988aZ aZVar = new C3988aZ(this, this.write.write((JuristicRequestFormActivity.read) t));
            if (this.RatingCompat != null) {
                aZVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        throw new NoSuchElementException("No value present");
    }

    public final unsafeCompare write() {
        return this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver;
    }

    public final standardSize MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.write().IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(unsafeCompare unsafecompare, standardSize standardsize) {
        if (unsafecompare != null) {
            this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver = unsafecompare;
        }
        if (standardsize != null) {
            this.MediaBrowserCompat$ItemReceiver.write().IconCompatParcelizer = standardsize;
        }
        boolean z = true;
        if ("ONBOARD".equalsIgnoreCase(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read)) {
            setAltClassificationResult setaltclassificationresult = setAltClassificationResult.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setaltclassificationresult.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.LookupTable lookupTable = this.MediaBrowserCompat$ItemReceiver;
        lookupTable.read(lookupTable.IconCompatParcelizer.write(new standardPoll((String) null, lookupTable.write.read, lookupTable.write.write, lookupTable.MediaBrowserCompat$CustomActionResultReceiver())), new C9867ba(this), new C9849aY(this));
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder, getProject.write write2) {
        write2.read(crashlyticsReportSessionUserEncoder.read);
        write2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.write(), "");
    }
}
