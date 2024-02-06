package p040o;

import com.scb.phone.view.activity.chequemanagement.C5579x61d4c5a4;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import java.util.NoSuchElementException;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.CharMatcher;
import p040o.WellBehavedMap;
import p040o.getProject;

/* renamed from: o.ErrorInfo */
public class ErrorInfo extends getOCRDescription<getProject.write> {
    private String IconCompatParcelizer = "";
    private final UnmodifiableIterator read;

    @HmlPinActivity
    public ErrorInfo(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, AppendableWriter appendableWriter, WellBehavedMap.KeyToEntryConverter.C39541 r4, UnmodifiableIterator unmodifiableIterator) {
        super(regularImmutableBiMap, appendableWriter, lookupTable, r4);
        this.read = unmodifiableIterator;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, getProject.write write) {
        write.write(z && write.write());
    }

    public final String IconCompatParcelizer() {
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() == null || this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo == null || this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo.isEmpty()) {
            return null;
        }
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo.get(0).MediaBrowserCompat$ItemReceiver.read;
    }

    static /* synthetic */ void read(boolean z, getProject.write write) {
        write.write(z && write.write());
    }

    public final /* synthetic */ void read(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder, getProject.write write) {
        write.read(crashlyticsReportSessionUserEncoder.read);
        write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.write(), this.IconCompatParcelizer);
    }

    public final /* synthetic */ void IconCompatParcelizer(C5579x61d4c5a4 chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver) throws Exception {
        isSupportFragmentClass issupportfragmentclass;
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        UnmodifiableIterator unmodifiableIterator = this.read;
        onGetStartedClick.write((Object) chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver, "merchantCategory");
        for (AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadEncoder next : new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionApplicationOrganizationEncoder(unmodifiableIterator.read(chequeAnnouncementActivity$MediaBrowserCompat$CustomActionResultReceiver.write)).IconCompatParcelizer) {
            if (next.read.equalsIgnoreCase(this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
                this.IconCompatParcelizer = next.IconCompatParcelizer;
            }
        }
        String str = this.MediaBrowserCompat$ItemReceiver.write().MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        show show = new show(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem().write);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new ImageDao(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            setSessionEventID setsessioneventid = new setSessionEventID(this, this.write.write((JuristicRequestFormActivity.read) t));
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setsessioneventid.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        throw new NoSuchElementException("No value present");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver("DepartmentType", (String) null), new setFileSize(this), new setIsValid(this));
    }
}
