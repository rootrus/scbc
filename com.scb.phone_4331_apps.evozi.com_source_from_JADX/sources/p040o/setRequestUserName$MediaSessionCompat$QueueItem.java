package p040o;

import java.util.Collection;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaSessionCompat$QueueItem */
final class setRequestUserName$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
    private /* synthetic */ setRequestUserName write;

    setRequestUserName$MediaSessionCompat$QueueItem(setRequestUserName setrequestusername) {
        this.write = setrequestusername;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List<captureReportData> list;
        HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity;
        String str;
        populateSignalData populatesignaldata;
        HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity2;
        String str2;
        populateSignalData populatesignaldata2;
        PassportExtractor passportExtractor = (PassportExtractor) obj;
        populateFramesList populateframeslist = this.write.write;
        List<captureReportData> list2 = null;
        if (populateframeslist == null || (populatesignaldata2 = populateframeslist.IconCompatParcelizer) == null) {
            list = null;
        } else {
            list = populatesignaldata2.read;
        }
        Collection collection = list;
        boolean z = false;
        boolean z2 = collection == null || collection.isEmpty();
        populateThreadData populatethreaddata = this.write.MediaDescriptionCompat;
        boolean z3 = (populatethreaddata == null || (hmlVerifyEmailSuccessfulActivity2 = populatethreaddata.MediaDescriptionCompat) == null || (str2 = (String) hmlVerifyEmailSuccessfulActivity2.write) == null || str2.length() <= 0) ? false : true;
        populateFramesList populateframeslist2 = this.write.write;
        if (!(populateframeslist2 == null || (populatesignaldata = populateframeslist2.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
            list2 = populatesignaldata.read;
        }
        Collection collection2 = list2;
        boolean z4 = collection2 == null || collection2.isEmpty();
        populateThreadData populatethreaddata2 = this.write.MediaDescriptionCompat;
        if (!(populatethreaddata2 == null || (hmlVerifyEmailSuccessfulActivity = populatethreaddata2.write) == null || (str = (String) hmlVerifyEmailSuccessfulActivity.write) == null || str.length() <= 0)) {
            z = true;
        }
        passportExtractor.write((!z2) | z3 | (!z4) | z);
    }
}
