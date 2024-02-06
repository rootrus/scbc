package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AutoValue_CrashlyticsReport_Session_Device;
import p040o.SignedBytes;

/* renamed from: o.newOutputStreamSupplier */
public final class newOutputStreamSupplier extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public newOutputStreamSupplier(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final isSimulator IconCompatParcelizer(setTrafficEnabled settrafficenabled) {
        String str;
        newOutputStreamSupplier newoutputstreamsupplier = this;
        setTrafficEnabled settrafficenabled2 = settrafficenabled;
        int i = settrafficenabled2.PlaybackStateCompat;
        String str2 = settrafficenabled2.f2961x50fd9e4a;
        BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = settrafficenabled2.AlertController$RecycleListView;
        AutoValue_CrashlyticsReport_Session_Device.C30661 r5 = new AutoValue_CrashlyticsReport_Session_Device.C30661(billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        String str3 = settrafficenabled2.MediaMetadataCompat;
        String str4 = settrafficenabled2.write;
        String str5 = settrafficenabled2.MediaBrowserCompat$SearchResultReceiver;
        List<String> list = settrafficenabled2.MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = settrafficenabled2.MediaDescriptionCompat;
        String str7 = settrafficenabled2.setHasDecor;
        String write = write(Double.valueOf(Double.parseDouble(settrafficenabled2.ParcelableVolumeInfo)));
        onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(this.prepaidBalance.toDouble())");
        String c_ = newoutputstreamsupplier.mo26549c_(settrafficenabled2.read);
        String str8 = settrafficenabled2.MediaSessionCompat$Token;
        int i2 = settrafficenabled2.AppCompatDelegateImpl$ListMenuDecorView;
        int i3 = settrafficenabled2.setContentView;
        int i4 = i2;
        int i5 = settrafficenabled2.RatingCompat;
        String str9 = settrafficenabled2.MediaSessionCompat$ResultReceiverWrapper;
        String str10 = settrafficenabled2.MediaSessionCompat$QueueItem;
        String str11 = settrafficenabled2.MediaBrowserCompat$ItemReceiver;
        int i6 = i3;
        Iterable iterable = settrafficenabled2.Keep;
        String str12 = str11;
        String str13 = str8;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            String write2 = write(Double.valueOf(Double.parseDouble((String) null)));
            Iterator it2 = it;
            String str14 = c_;
            String str15 = write;
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((String) null, "C", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append('+');
                sb.append(write2);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('-');
                sb2.append(write2);
                str = sb2.toString();
            }
            String IconCompatParcelizer = newoutputstreamsupplier.IconCompatParcelizer("dd MMM", (OffsetDateTime) null);
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonth(this.txnDate)");
            arrayList.add(new setManufacturer(IconCompatParcelizer, str, (String) null, ""));
            newoutputstreamsupplier = this;
            it = it2;
            c_ = str14;
            write = str15;
        }
        String str16 = write;
        String str17 = c_;
        return new isSimulator(i, str2, r5, str3, str4, str5, list, str6, str7, write, c_, str13, i4, i6, i5, str9, str10, str12, (List) arrayList, true, settrafficenabled2.PlaybackStateCompat$CustomAction, settrafficenabled2.MediaBrowserCompat$MediaItem);
    }
}
