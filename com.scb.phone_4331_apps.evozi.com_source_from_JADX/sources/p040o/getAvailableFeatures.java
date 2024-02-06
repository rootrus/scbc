package p040o;

import com.scb.phone.view.activity.cardmanagement.ExportCardStatementActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.getAvailableFeatures */
public final class getAvailableFeatures extends FragmentBuilder_BindSummaryFragment {
    public static List<ExportCardStatementActivity.write> MediaBrowserCompat$ItemReceiver(List<skipToEndOfBlockComment> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        onGetStartedClick.write((Object) list, "$this$toCategoryList");
        Iterable<skipToEndOfBlockComment> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (skipToEndOfBlockComment skiptoendofblockcomment : iterable) {
            onGetStartedClick.write((Object) skiptoendofblockcomment, "$this$toCategory");
            String str8 = skiptoendofblockcomment.MediaDescriptionCompat;
            String str9 = str8 == null ? "" : str8;
            String str10 = skiptoendofblockcomment.MediaBrowserCompat$ItemReceiver;
            if (str10 == null) {
                str = "";
            } else {
                str = str10;
            }
            int i = skiptoendofblockcomment.MediaBrowserCompat$SearchResultReceiver;
            String str11 = skiptoendofblockcomment.MediaBrowserCompat$CustomActionResultReceiver;
            if (str11 == null) {
                str2 = "";
            } else {
                str2 = str11;
            }
            String str12 = skiptoendofblockcomment.write;
            if (str12 == null) {
                str3 = "";
            } else {
                str3 = str12;
            }
            String str13 = skiptoendofblockcomment.RatingCompat;
            if (str13 == null) {
                str4 = "";
            } else {
                str4 = str13;
            }
            String str14 = skiptoendofblockcomment.MediaBrowserCompat$MediaItem;
            if (str14 == null) {
                str5 = "";
            } else {
                str5 = str14;
            }
            String str15 = skiptoendofblockcomment.IconCompatParcelizer;
            if (str15 == null) {
                str6 = "";
            } else {
                str6 = str15;
            }
            String str16 = skiptoendofblockcomment.read;
            if (str16 == null) {
                str7 = "";
            } else {
                str7 = str16;
            }
            arrayList.add(new ExportCardStatementActivity.write(str9, str, i, str2, str3, str4, str5, str6, str7));
        }
        return (List) arrayList;
    }
}
