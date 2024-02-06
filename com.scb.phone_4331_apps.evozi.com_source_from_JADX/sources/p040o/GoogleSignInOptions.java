package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.GoogleSignInOptions */
public final class GoogleSignInOptions extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.GoogleSignInOptions$Builder */
    public final class Builder extends FragmentBuilder_BindSummaryFragment {
    }

    @HmlPinActivity
    public GoogleSignInOptions(revokeAccess revokeaccess, zae zae, requestExtraScopes requestextrascopes) {
        onGetStartedClick.write((Object) revokeaccess, "merchantInfoEntityMapper");
        onGetStartedClick.write((Object) zae, "paymentInfoEntityMapper");
        onGetStartedClick.write((Object) requestextrascopes, "extraDataEntityMapper");
    }

    public static GeofencingEvent MediaBrowserCompat$ItemReceiver(getDashOffset getdashoffset) {
        setRequestId setrequestid;
        setLoiteringDelay setloiteringdelay;
        String str;
        String str2;
        String str3;
        String str4;
        onGetStartedClick.write((Object) getdashoffset, "entity");
        String str5 = getdashoffset.IconCompatParcelizer;
        GradientStroke gradientStroke = getdashoffset.write;
        List list = null;
        if (gradientStroke != null) {
            onGetStartedClick.write((Object) gradientStroke, "entity");
            String str6 = gradientStroke.MediaBrowserCompat$CustomActionResultReceiver;
            String str7 = str6 == null ? "" : str6;
            String str8 = gradientStroke.MediaBrowserCompat$ItemReceiver;
            if (str8 == null) {
                str = "";
            } else {
                str = str8;
            }
            String str9 = gradientStroke.write;
            if (str9 == null) {
                str2 = "";
            } else {
                str2 = str9;
            }
            String str10 = gradientStroke.read;
            if (str10 == null) {
                str3 = "";
            } else {
                str3 = str10;
            }
            String str11 = gradientStroke.IconCompatParcelizer;
            if (str11 == null) {
                str4 = "";
            } else {
                str4 = str11;
            }
            setrequestid = new setRequestId(str7, str, str2, str3, str4);
        } else {
            setrequestid = null;
        }
        getJoinType getjointype = getdashoffset.MediaBrowserCompat$ItemReceiver;
        if (getjointype != null) {
            onGetStartedClick.write((Object) getjointype, "entity");
            setloiteringdelay = new setLoiteringDelay(getjointype.write, getjointype.read, getjointype.MediaBrowserCompat$CustomActionResultReceiver, getjointype.IconCompatParcelizer, getjointype.MediaMetadataCompat, getjointype.MediaBrowserCompat$ItemReceiver);
        } else {
            setloiteringdelay = null;
        }
        List<getLineDashPattern> list2 = getdashoffset.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            Iterable<getLineDashPattern> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getLineDashPattern getlinedashpattern : iterable) {
                onGetStartedClick.write((Object) getlinedashpattern, "entity");
                arrayList.add(new GeofencingApi(getlinedashpattern.MediaDescriptionCompat, getlinedashpattern.IconCompatParcelizer, getlinedashpattern.MediaBrowserCompat$ItemReceiver, getlinedashpattern.write, getlinedashpattern.read, getlinedashpattern.MediaBrowserCompat$CustomActionResultReceiver));
            }
            list = (List) arrayList;
        }
        return new GeofencingEvent(str5, setrequestid, setloiteringdelay, list);
    }
}
