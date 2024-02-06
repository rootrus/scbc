package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.requestIdToken */
public final class requestIdToken extends FragmentBuilder_BindSummaryFragment {
    private final isSuccess IconCompatParcelizer;
    private final setAccount MediaBrowserCompat$CustomActionResultReceiver;
    private final getExtensionType MediaBrowserCompat$ItemReceiver;
    private final requestEmail read;
    private final requestServerAuthCode write;

    @HmlPinActivity
    public requestIdToken(getExtensionType getextensiontype, requestServerAuthCode requestserverauthcode, requestEmail requestemail, isSuccess issuccess, setAccount setaccount) {
        this.MediaBrowserCompat$ItemReceiver = getextensiontype;
        this.write = requestserverauthcode;
        this.read = requestemail;
        this.IconCompatParcelizer = issuccess;
        this.MediaBrowserCompat$CustomActionResultReceiver = setaccount;
    }

    public final getTriggeringLocation MediaBrowserCompat$ItemReceiver(getMaskMode getmaskmode) {
        getTriggeringLocation gettriggeringlocation;
        List<getEndCap> list;
        getMaskMode getmaskmode2 = getmaskmode;
        if (getmaskmode2 == null) {
            return new getTriggeringLocation();
        }
        getTriggeringLocation gettriggeringlocation2 = new getTriggeringLocation();
        gettriggeringlocation2.read = this.MediaBrowserCompat$ItemReceiver.read(getmaskmode2.MediaBrowserCompat$CustomActionResultReceiver);
        gettriggeringlocation2.write = this.write.MediaBrowserCompat$ItemReceiver(getmaskmode2.read);
        gettriggeringlocation2.MediaBrowserCompat$CustomActionResultReceiver = this.read.write(getmaskmode2.IconCompatParcelizer);
        gettriggeringlocation2.MediaBrowserCompat$MediaItem = this.IconCompatParcelizer.read(getmaskmode2.RatingCompat, true);
        gettriggeringlocation2.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.read(getmaskmode2.MediaBrowserCompat$ItemReceiver, false);
        List<pauseAnimation> list2 = getmaskmode2.write;
        if (list2 != null) {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                pauseAnimation pauseanimation = (pauseAnimation) it.next();
                int i2 = pauseanimation.read;
                String str = pauseanimation.IconCompatParcelizer;
                int i3 = pauseanimation.MediaMetadataCompat;
                String str2 = pauseanimation.MediaBrowserCompat$SearchResultReceiver;
                String str3 = pauseanimation.MediaDescriptionCompat;
                String str4 = pauseanimation.RatingCompat;
                String str5 = pauseanimation.MediaBrowserCompat$CustomActionResultReceiver;
                String str6 = pauseanimation.MediaBrowserCompat$ItemReceiver;
                removeAllAnimatorListeners removeallanimatorlisteners = pauseanimation.write;
                String str7 = removeallanimatorlisteners.RatingCompat;
                String str8 = removeallanimatorlisteners.MediaBrowserCompat$MediaItem;
                Iterator it2 = it;
                getTriggeringLocation gettriggeringlocation3 = gettriggeringlocation2;
                String str9 = str8;
                arrayList.add(new getEndCap(i2, str, i3, str2, str3, str4, str5, str6, new setMockLocation(str7, str9, removeallanimatorlisteners.MediaBrowserCompat$ItemReceiver, removeallanimatorlisteners.MediaBrowserCompat$CustomActionResultReceiver, removeallanimatorlisteners.read, removeallanimatorlisteners.write, removeallanimatorlisteners.IconCompatParcelizer)));
                it = it2;
                gettriggeringlocation2 = gettriggeringlocation3;
            }
            gettriggeringlocation = gettriggeringlocation2;
            list = (List) arrayList;
        } else {
            gettriggeringlocation = gettriggeringlocation2;
            list = null;
        }
        getTriggeringLocation gettriggeringlocation4 = gettriggeringlocation;
        gettriggeringlocation4.IconCompatParcelizer = list;
        return gettriggeringlocation4;
    }
}
