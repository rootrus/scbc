package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.AutocompleteFilter;

/* renamed from: o.obtainAndWriteInterfaceToken */
public final /* synthetic */ class obtainAndWriteInterfaceToken implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment read;

    public /* synthetic */ obtainAndWriteInterfaceToken(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.read = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        List<String> list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        getTimeStretch gettimestretch = (getTimeStretch) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) gettimestretch, "addressEntity");
        drawCharacterAsGlyph drawcharacterasglyph = gettimestretch.MediaBrowserCompat$MediaItem;
        if (drawcharacterasglyph == null || (list = drawcharacterasglyph.MediaBrowserCompat$ItemReceiver) == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        getSecondaryText getsecondarytext = new getSecondaryText(list);
        getPrimaryText MediaBrowserCompat$ItemReceiver = onNotNowClick.MediaBrowserCompat$ItemReceiver(gettimestretch.write);
        getPrimaryText MediaBrowserCompat$ItemReceiver2 = onNotNowClick.MediaBrowserCompat$ItemReceiver(gettimestretch.IconCompatParcelizer);
        getPrimaryText MediaBrowserCompat$ItemReceiver3 = onNotNowClick.MediaBrowserCompat$ItemReceiver(gettimestretch.MediaSessionCompat$QueueItem);
        String str9 = gettimestretch.MediaBrowserCompat$SearchResultReceiver;
        String str10 = str9 == null ? "0" : str9;
        String str11 = gettimestretch.MediaSessionCompat$Token;
        if (str11 == null) {
            str = "0";
        } else {
            str = str11;
        }
        String str12 = gettimestretch.f2856x50fd9e4a;
        if (str12 == null) {
            str2 = "0";
        } else {
            str2 = str12;
        }
        String str13 = gettimestretch.read;
        if (str13 == null) {
            str3 = "0";
        } else {
            str3 = str13;
        }
        String str14 = gettimestretch.MediaBrowserCompat$ItemReceiver;
        if (str14 == null) {
            str4 = "0";
        } else {
            str4 = str14;
        }
        String str15 = gettimestretch.MediaBrowserCompat$CustomActionResultReceiver;
        if (str15 == null) {
            str5 = "0";
        } else {
            str5 = str15;
        }
        String str16 = gettimestretch.MediaMetadataCompat;
        if (str16 == null) {
            str6 = "0";
        } else {
            str6 = str16;
        }
        String str17 = gettimestretch.MediaDescriptionCompat;
        if (str17 == null) {
            str7 = "0";
        } else {
            str7 = str17;
        }
        String str18 = gettimestretch.RatingCompat;
        if (str18 == null) {
            str8 = "0";
        } else {
            str8 = str18;
        }
        return DebitCardResetOtpActivity.just(new AutocompleteFilter.Builder(getsecondarytext, MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3, str10, str, str2, str3, str4, str5, str6, str7, str8));
    }
}
