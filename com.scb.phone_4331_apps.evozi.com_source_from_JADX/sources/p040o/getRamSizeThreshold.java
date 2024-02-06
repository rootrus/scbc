package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRamSizeThreshold */
public final /* synthetic */ class getRamSizeThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ removeAppStatsWriteFileListener IconCompatParcelizer;
    private final /* synthetic */ expandIfNecessary MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List MediaBrowserCompat$MediaItem;
    private final /* synthetic */ expandIfNecessary read;
    private final /* synthetic */ expandIfNecessary write;

    public /* synthetic */ getRamSizeThreshold(removeAppStatsWriteFileListener removeappstatswritefilelistener, List list, expandIfNecessary expandifnecessary, expandIfNecessary expandifnecessary2, expandIfNecessary expandifnecessary3, List list2) {
        this.IconCompatParcelizer = removeappstatswritefilelistener;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = expandifnecessary;
        this.MediaBrowserCompat$CustomActionResultReceiver = expandifnecessary2;
        this.write = expandifnecessary3;
        this.MediaBrowserCompat$MediaItem = list2;
    }

    public final void IconCompatParcelizer(Object obj) {
        removeAppStatsWriteFileListener removeappstatswritefilelistener = this.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$ItemReceiver;
        expandIfNecessary expandifnecessary = this.read;
        expandIfNecessary expandifnecessary2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        expandIfNecessary expandifnecessary3 = this.write;
        List list2 = this.MediaBrowserCompat$MediaItem;
        C10883getLar getlar = (C10883getLar) obj;
        getlar.IconCompatParcelizer(removeAppStatsWriteFileListener.MediaBrowserCompat$CustomActionResultReceiver((List<expandIfNecessary>) list));
        getlar.read(expandifnecessary, expandifnecessary2);
        boolean z = true;
        if (removeappstatswritefilelistener.write) {
            initAppStats initappstats = initAppStats.write;
            if (removeappstatswritefilelistener.RatingCompat != null) {
                initappstats.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
            }
            addAppStatsExportListener addappstatsexportlistener = addAppStatsExportListener.write;
            if (removeappstatswritefilelistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                addappstatsexportlistener.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
                return;
            }
            return;
        }
        expandIfNecessary IconCompatParcelizer2 = removeAppStatsWriteFileListener.IconCompatParcelizer(removeappstatswritefilelistener.IconCompatParcelizer, "CARDLESS_ATM");
        expandIfNecessary IconCompatParcelizer3 = removeAppStatsWriteFileListener.IconCompatParcelizer(removeappstatswritefilelistener.IconCompatParcelizer, "CARDLESS_ATM_CC");
        expandIfNecessary IconCompatParcelizer4 = removeAppStatsWriteFileListener.IconCompatParcelizer(removeappstatswritefilelistener.IconCompatParcelizer, "CARDLESS_ATM_SC");
        if (IconCompatParcelizer2 == null && IconCompatParcelizer3 == null && IconCompatParcelizer4 == null) {
            initAppStats initappstats2 = initAppStats.write;
            if (removeappstatswritefilelistener.RatingCompat != null) {
                initappstats2.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
            }
        } else {
            getlar.write(IconCompatParcelizer2, IconCompatParcelizer3, IconCompatParcelizer4);
        }
        if (expandifnecessary3 != null) {
            getlar.MediaBrowserCompat$ItemReceiver();
            getlar.IconCompatParcelizer(expandifnecessary3);
        }
        if (!list2.isEmpty()) {
            getlar.write(list2);
            return;
        }
        addAppStatsExportListener addappstatsexportlistener2 = addAppStatsExportListener.write;
        if (removeappstatswritefilelistener.RatingCompat == null) {
            z = false;
        }
        if (z) {
            addappstatsexportlistener2.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
        }
    }
}
