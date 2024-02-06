package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.FirebaseApp;

/* renamed from: o.unmodifiableBiMap */
public final class unmodifiableBiMap extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public unmodifiableBiMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final getOptions MediaBrowserCompat$ItemReceiver(List<callServiceStopSelfResult> list, FirebaseApp.BackgroundStateChangeListener backgroundStateChangeListener) {
        List<getPersistenceKey> list2;
        onGetStartedClick.write((Object) backgroundStateChangeListener, "selectedTransactionsDto");
        getOptions getoptions = new getOptions();
        if (list != null) {
            Iterable<callServiceStopSelfResult> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (callServiceStopSelfResult MediaBrowserCompat$ItemReceiver : iterable) {
                arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
            }
            list2 = (List) arrayList;
        } else {
            list2 = null;
        }
        getoptions.MediaBrowserCompat$ItemReceiver = list2;
        getoptions.read = new ArrayList(backgroundStateChangeListener.IconCompatParcelizer).size();
        getoptions.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(backgroundStateChangeListener.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        return getoptions;
    }

    private final getPersistenceKey MediaBrowserCompat$ItemReceiver(callServiceStopSelfResult callservicestopselfresult) {
        List list;
        double d;
        double d2;
        double d3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        callServiceStopSelfResult callservicestopselfresult2 = callservicestopselfresult;
        List<getContainerId> list2 = callservicestopselfresult2.write;
        if (list2 != null) {
            Iterable<getContainerId> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getContainerId getcontainerid : iterable) {
                FirebaseException firebaseException = new FirebaseException((byte) 0);
                onStartCommand onstartcommand = getcontainerid.read;
                FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = new FirebaseApp$$Lambda$1((byte) 0);
                double d8 = 0.0d;
                if (onstartcommand == null || (d7 = onstartcommand.read) == null) {
                    d = 0.0d;
                } else {
                    d = d7.doubleValue();
                }
                firebaseApp$$Lambda$1.MediaBrowserCompat$ItemReceiver = d;
                if (onstartcommand == null || (d6 = onstartcommand.MediaBrowserCompat$ItemReceiver) == null) {
                    d2 = 0.0d;
                } else {
                    d2 = d6.doubleValue();
                }
                firebaseApp$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver = d2;
                if (onstartcommand == null || (d5 = onstartcommand.write) == null) {
                    d3 = 0.0d;
                } else {
                    d3 = d5.doubleValue();
                }
                firebaseApp$$Lambda$1.IconCompatParcelizer = d3;
                firebaseException.read = firebaseApp$$Lambda$1;
                getJobId getjobid = getcontainerid.write;
                systemExit systemexit = new systemExit((byte) 0);
                String str7 = "";
                if (getjobid == null || (str = getjobid.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                    str = str7;
                }
                systemexit.MediaBrowserCompat$CustomActionResultReceiver = str;
                if (getjobid == null || (str2 = getjobid.MediaBrowserCompat$SearchResultReceiver) == null) {
                    str2 = str7;
                }
                systemexit.MediaBrowserCompat$SearchResultReceiver = str2;
                if (!(getjobid == null || (d4 = getjobid.MediaDescriptionCompat) == null)) {
                    d8 = d4.doubleValue();
                }
                systemexit.MediaMetadataCompat = Double.valueOf(d8);
                if (getjobid == null || (str3 = getjobid.IconCompatParcelizer) == null) {
                    str3 = str7;
                }
                systemexit.write = str3;
                if (getjobid == null || (str4 = getjobid.read) == null) {
                    str4 = str7;
                }
                systemexit.read = str4;
                if (getjobid == null || (str5 = getjobid.MediaBrowserCompat$ItemReceiver) == null) {
                    str5 = str7;
                }
                systemexit.MediaBrowserCompat$ItemReceiver = str5;
                if (!(getjobid == null || (str6 = getjobid.write) == null)) {
                    str7 = str6;
                }
                systemexit.IconCompatParcelizer = str7;
                firebaseException.IconCompatParcelizer = systemexit;
                arrayList.add(firebaseException);
            }
            list = (List) arrayList;
        } else {
            list = new ArrayList();
        }
        List list3 = list;
        SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver = callservicestopselfresult2.MediaBrowserCompat$CustomActionResultReceiver;
        String str8 = null;
        String str9 = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null ? sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.read : null;
        String str10 = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null ? sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver : null;
        if (sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null) {
            str8 = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        }
        return new getPersistenceKey(list3, new FirebaseApp.UiExecutor(str9, str10, str8), callservicestopselfresult2.RatingCompat, callservicestopselfresult2.MediaDescriptionCompat, callservicestopselfresult2.MediaSessionCompat$ResultReceiverWrapper, callservicestopselfresult2.MediaSessionCompat$Token, callservicestopselfresult2.ParcelableVolumeInfo, callservicestopselfresult2.MediaMetadataCompat, callservicestopselfresult2.MediaBrowserCompat$SearchResultReceiver, callservicestopselfresult2.MediaSessionCompat$QueueItem);
    }
}
