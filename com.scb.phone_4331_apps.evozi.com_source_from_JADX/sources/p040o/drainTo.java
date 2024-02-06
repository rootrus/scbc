package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;

/* renamed from: o.drainTo */
public final class drainTo extends constrainedListMultimap {
    @HmlPinActivity
    public drainTo(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static parseSession IconCompatParcelizer(removeDependent removedependent, animateCameraWithCallback animatecamerawithcallback) {
        String str;
        int i;
        String str2;
        String str3 = "";
        if (removedependent instanceof parseNdkPayload) {
            str = ((parseNdkPayload) removedependent).MediaBrowserCompat$ItemReceiver;
            if (str == null || str.equals(str3)) {
                str2 = str;
            } else {
                str2 = str.replace("-", str3);
            }
            i = Iterables$3$MediaBrowserCompat$ItemReceiver.icon_prompt_pay_cid;
        } else if (removedependent instanceof reportFromJson) {
            reportFromJson reportfromjson = (reportFromJson) removedependent;
            String str4 = reportfromjson.MediaBrowserCompat$CustomActionResultReceiver;
            str = reportfromjson.MediaBrowserCompat$ItemReceiver;
            String replaceAll = str != null ? str.replaceAll("[()+\\-\\s]", str3) : null;
            if (!TextUtils.isEmpty(str4)) {
                str3 = str;
                str = str4;
            }
            String str5 = replaceAll;
            i = Iterables$3$MediaBrowserCompat$ItemReceiver.icon_prompt_pay_mobile;
            str2 = str5;
        } else {
            i = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        String obj = getICheckDeserializerRtti.write((Context) null, i).toString();
        eventFromJson eventfromjson = new eventFromJson();
        eventfromjson.MediaBrowserCompat$ItemReceiver = str2;
        eventfromjson.MediaBrowserCompat$MediaItem = animatecamerawithcallback;
        eventfromjson.RatingCompat = IGoogleMapDelegate.PROMPTPAY;
        eventfromjson.MediaDescriptionCompat = str;
        eventfromjson.write = str3;
        eventfromjson.read = obj;
        return eventfromjson;
    }
}
