package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.setTrafficEnabled */
public final class setTrafficEnabled extends zzuk {
    public BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver AlertController$RecycleListView;
    public int AppCompatDelegateImpl$ListMenuDecorView = -1;
    public List<C1133x65c1ec57> Keep = HmlNationalIdActivity.IconCompatParcelizer;
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver = "";
    public String MediaBrowserCompat$MediaItem = "";
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2961x50fd9e4a;
    public String MediaDescriptionCompat = "";
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem = "";
    public String MediaSessionCompat$ResultReceiverWrapper = "";
    public String MediaSessionCompat$Token = "";
    public String ParcelableVolumeInfo = "0.0";
    public int PlaybackStateCompat = -1;
    public String PlaybackStateCompat$CustomAction = "";
    public int RatingCompat = -1;
    public String read = "";
    public int setContentView = -1;
    public String setHasDecor = "";
    public String write;

    public setTrafficEnabled(int i, String str, BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, int i2, int i3, int i4, String str10, String str11, String str12, String str13, String str14) {
        String str15 = str2;
        String str16 = str3;
        List<String> list2 = list;
        String str17 = str7;
        String str18 = str12;
        String str19 = str13;
        String str20 = str14;
        onGetStartedClick.write((Object) billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, "productType");
        onGetStartedClick.write((Object) str15, "cardRefNo");
        onGetStartedClick.write((Object) str16, "cardMask");
        onGetStartedClick.write((Object) list2, "allowTag");
        onGetStartedClick.write((Object) str17, "prepaidBalance");
        onGetStartedClick.write((Object) str18, "billerId");
        onGetStartedClick.write((Object) str19, "prepaidCardType");
        onGetStartedClick.write((Object) str20, "filterMonthNo");
        this.PlaybackStateCompat = i;
        this.f2961x50fd9e4a = str;
        this.AlertController$RecycleListView = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = str15;
        this.write = str16;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        this.MediaDescriptionCompat = str5;
        this.setHasDecor = str6;
        this.ParcelableVolumeInfo = str17;
        this.read = str8;
        this.MediaSessionCompat$Token = str9;
        this.AppCompatDelegateImpl$ListMenuDecorView = i2;
        this.setContentView = i3;
        this.RatingCompat = i4;
        this.MediaSessionCompat$ResultReceiverWrapper = str10;
        this.MediaSessionCompat$QueueItem = str11;
        this.MediaBrowserCompat$ItemReceiver = str18;
        this.PlaybackStateCompat$CustomAction = str19;
        this.MediaBrowserCompat$MediaItem = str20;
    }

    public setTrafficEnabled(String str, String str2, String str3, BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, String str4, List<String> list) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "cardMask");
        onGetStartedClick.write((Object) billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, "productType");
        onGetStartedClick.write((Object) list, "allowTag");
        this.MediaMetadataCompat = str;
        this.write = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.AlertController$RecycleListView = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
        this.read = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
