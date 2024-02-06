package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.beginObjectHeader */
public final /* synthetic */ class beginObjectHeader implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read read;

    public /* synthetic */ beginObjectHeader(DurationEmploymentForBusinessDialog.read read2) {
        this.read = read2;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        double d;
        streetNamesEnabled streetnamesenabled;
        setFatal setfatal = this.read.IconCompatParcelizer;
        Unbinder unbinder = (Unbinder) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) unbinder, "entity");
        String str3 = unbinder.MediaDescriptionCompat;
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(unbinder.MediaSessionCompat$ResultReceiverWrapper, (OffsetDateTime) null);
        if (write == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformStringToDateTim…ntity.timestamp , null)!!");
        String str4 = unbinder.IconCompatParcelizer;
        String str5 = unbinder.read;
        String str6 = unbinder.MediaSessionCompat$Token;
        String str7 = unbinder.f2560x50fd9e4a;
        String str8 = unbinder.RatingCompat;
        String str9 = unbinder.MediaMetadataCompat;
        String str10 = unbinder.MediaBrowserCompat$SearchResultReceiver;
        double d2 = unbinder.MediaBrowserCompat$ItemReceiver;
        double d3 = unbinder.MediaBrowserCompat$MediaItem;
        String str11 = unbinder.ParcelableVolumeInfo;
        String str12 = unbinder.MediaSessionCompat$QueueItem;
        findEntry findentry = unbinder.write;
        if (findentry != null) {
            d = d3;
            str2 = str12;
            str = str11;
            streetnamesenabled = new streetNamesEnabled(findentry.MediaBrowserCompat$CustomActionResultReceiver, findentry.MediaBrowserCompat$ItemReceiver, findentry.read, findentry.write, findentry.IconCompatParcelizer);
        } else {
            str2 = str12;
            str = str11;
            d = d3;
            streetnamesenabled = null;
        }
        return new StreetViewPanoramaView(str3, write, str4, str5, str6, str7, str8, str9, str10, d2, d, str, str2, streetnamesenabled, unbinder.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
