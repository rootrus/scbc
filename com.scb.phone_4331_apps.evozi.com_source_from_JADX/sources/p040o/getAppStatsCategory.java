package p040o;

import com.scb.phone.view.activity.investment.assessment.C5639xa36eeabf;
import p040o.AppStatsDao;
import p040o.GoogleMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAppStatsCategory */
public final /* synthetic */ class getAppStatsCategory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsOCRType IconCompatParcelizer;
    private final /* synthetic */ GoogleMap.OnMarkerDragListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ getAppStatsCategory(AppStatsOCRType appStatsOCRType, String str, String str2, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.IconCompatParcelizer = appStatsOCRType;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = onMarkerDragListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsOCRType appStatsOCRType = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.write;
        GoogleMap.OnMarkerDragListener onMarkerDragListener = this.MediaBrowserCompat$CustomActionResultReceiver;
        getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver = (getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj;
        getfrontexception_mediabrowsercompat_customactionresultreceiver.AlertController$RecycleListView();
        boolean z = false;
        getfrontexception_mediabrowsercompat_customactionresultreceiver.write(false);
        getfrontexception_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(str, str2);
        if (!(onMarkerDragListener == null || onMarkerDragListener.MediaDescriptionCompat == null)) {
            getfrontexception_mediabrowsercompat_customactionresultreceiver.read(onMarkerDragListener.MediaDescriptionCompat);
        }
        C5639xa36eeabf questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver = appStatsOCRType.read;
        if (questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver == null || questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem == null || appStatsOCRType.read.MediaSessionCompat$QueueItem.equals("")) {
            getfrontexception_mediabrowsercompat_customactionresultreceiver.read();
            AppStatsDao.C3030c cVar = new AppStatsDao.C3030c(appStatsOCRType, false);
            if (appStatsOCRType.RatingCompat != null) {
                z = true;
            }
            if (z) {
                cVar.IconCompatParcelizer(appStatsOCRType.RatingCompat);
                return;
            }
            return;
        }
        getfrontexception_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver(appStatsOCRType.read.MediaSessionCompat$QueueItem);
        AppStatsDao.C3030c cVar2 = new AppStatsDao.C3030c(appStatsOCRType, true);
        if (appStatsOCRType.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cVar2.IconCompatParcelizer(appStatsOCRType.RatingCompat);
        }
    }
}
