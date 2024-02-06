package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.FragmentBuilder_BindSCBSRiskLevelFragment;

/* renamed from: o.LifecycleDelegate */
public final /* synthetic */ class LifecycleDelegate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSCBSRiskLevelFragment.read write;

    public /* synthetic */ LifecycleDelegate(FragmentBuilder_BindSCBSRiskLevelFragment.read read) {
        this.write = read;
    }

    public final Object write(Object obj) {
        zam zam = this.write.read;
        setWebAlpha setwebalpha = (setWebAlpha) ((SingleDataEntity) obj).getData();
        useViewLifecycleInFragment write2 = useViewLifecycleInFragment.write();
        String str = setwebalpha.ParcelableVolumeInfo;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        write2.MediaSessionCompat$ResultReceiverWrapper = str;
        String str3 = setwebalpha.f5561x50fd9e4a;
        if (str3 == null) {
            str3 = str2;
        }
        write2.MediaSessionCompat$Token = FragmentBuilder_BindSummaryFragment.write(str3, (OffsetDateTime) null);
        String str4 = setwebalpha.MediaSessionCompat$ResultReceiverWrapper;
        if (str4 == null) {
            str4 = str2;
        }
        write2.MediaBrowserCompat$SearchResultReceiver = str4;
        String str5 = setwebalpha.MediaSessionCompat$Token;
        if (str5 == null) {
            str5 = str2;
        }
        write2.ParcelableVolumeInfo = str5;
        String str6 = setwebalpha.RatingCompat;
        if (str6 == null) {
            str6 = str2;
        }
        write2.MediaBrowserCompat$MediaItem = str6;
        String str7 = setwebalpha.MediaBrowserCompat$SearchResultReceiver;
        if (str7 == null) {
            str7 = str2;
        }
        write2.MediaDescriptionCompat = str7;
        String str8 = setwebalpha.MediaSessionCompat$QueueItem;
        if (str8 == null) {
            str8 = str2;
        }
        write2.MediaMetadataCompat = str8;
        String str9 = setwebalpha.MediaDescriptionCompat;
        if (str9 == null) {
            str9 = str2;
        }
        write2.RatingCompat = str9;
        String str10 = setwebalpha.IconCompatParcelizer;
        String str11 = "0.0";
        if (str10 == null) {
            str10 = str11;
        }
        write2.write = Double.valueOf(str10).doubleValue();
        String str12 = setwebalpha.read;
        if (str12 == null) {
            str12 = str11;
        }
        write2.MediaBrowserCompat$ItemReceiver = Double.valueOf(str12).doubleValue();
        String str13 = setwebalpha.MediaMetadataCompat;
        if (str13 != null) {
            str2 = str13;
        }
        write2.MediaBrowserCompat$CustomActionResultReceiver = str2;
        String str14 = setwebalpha.write;
        if (str14 != null) {
            str11 = str14;
        }
        write2.read = Double.valueOf(str11).doubleValue();
        return DebitCardResetOtpActivity.just(write2);
    }
}
