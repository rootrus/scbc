package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver */
class setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<getScaledPhoto>> {
    final /* synthetic */ setMessageIcons read;

    setMessageIcons$MediaBrowserCompat$CustomActionResultReceiver(setMessageIcons setmessageicons) {
        this.read = setmessageicons;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List<getScaledPhoto> list = (List) obj;
        setMessageIcons.IconCompatParcelizer(this.read);
        setMessageIcons setmessageicons = this.read;
        StandardTable.ColumnMap.ColumnMapEntrySet unused = setmessageicons.setHasDecor;
        ArrayList arrayList = new ArrayList();
        for (getScaledPhoto getscaledphoto : list) {
            arrayList.add(getscaledphoto.read);
        }
        List unused2 = setmessageicons.MediaSessionCompat$QueueItem = arrayList;
        setMessageIcons setmessageicons2 = this.read;
        StandardTable.ColumnMap.ColumnMapEntrySet unused3 = setmessageicons2.setHasDecor;
        List unused4 = setmessageicons2.ParcelableVolumeInfo = StandardTable.ColumnMap.ColumnMapEntrySet.MediaBrowserCompat$ItemReceiver(list);
        setMessageIcons setmessageicons3 = this.read;
        isPitchThresholdEnabled ispitchthresholdenabled = new isPitchThresholdEnabled(this);
        boolean z = true;
        if (setmessageicons3.RatingCompat != null) {
            ispitchthresholdenabled.IconCompatParcelizer(setmessageicons3.RatingCompat);
        }
        setMessageIcons setmessageicons4 = this.read;
        isRollThresholdEnabled isrollthresholdenabled = new isRollThresholdEnabled(this);
        if (setmessageicons4.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isrollthresholdenabled.IconCompatParcelizer(setmessageicons4.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
