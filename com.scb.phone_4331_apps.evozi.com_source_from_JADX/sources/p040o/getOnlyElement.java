package p040o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: o.getOnlyElement */
public final class getOnlyElement implements findFragmentByWho {
    private final /* synthetic */ zzai write;

    public getOnlyElement() {
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            simpleDateFormat.setLenient(false);
            Date parse = simpleDateFormat.parse(str);
            Calendar.getInstance().setTime(parse);
            return simpleDateFormat.format(parse);
        } catch (ParseException e) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(e.getMessage(), new Object[0]);
            return "";
        }
    }

    public static String IconCompatParcelizer(String str, String str2, String str3) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3);
        try {
            simpleDateFormat2.setLenient(false);
            Date parse = simpleDateFormat2.parse(str);
            simpleDateFormat.setLenient(false);
            return simpleDateFormat.format(parse);
        } catch (ParseException e) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(e.getMessage(), new Object[0]);
            return "";
        }
    }

    public static String read(String str, String str2) {
        String[] split = str.split(str2);
        if (split.length != 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]);
        sb.append(str2);
        sb.append(split[1]);
        sb.append(str2);
        int parseInt = Integer.parseInt(split[2]);
        int i = parseInt - 543;
        if (i + 100 > Calendar.getInstance().get(1)) {
            parseInt = i;
        }
        sb.append(parseInt);
        return sb.toString();
    }

    public /* synthetic */ getOnlyElement(zzai zzai) {
        this.write = zzai;
    }

    public final Object IconCompatParcelizer(Object obj) {
        addValueCallback addvaluecallback = (addValueCallback) obj;
        getAction getaction = new getAction();
        getaction.MediaBrowserCompat$ItemReceiver = addvaluecallback.MediaBrowserCompat$CustomActionResultReceiver;
        getaction.read = addvaluecallback.MediaBrowserCompat$ItemReceiver;
        getaction.write = addvaluecallback.write;
        getaction.RatingCompat = addvaluecallback.MediaBrowserCompat$MediaItem;
        getaction.MediaBrowserCompat$CustomActionResultReceiver = addvaluecallback.IconCompatParcelizer;
        getaction.IconCompatParcelizer = addvaluecallback.read;
        getaction.MediaBrowserCompat$MediaItem = addvaluecallback.MediaMetadataCompat;
        return getaction;
    }
}
