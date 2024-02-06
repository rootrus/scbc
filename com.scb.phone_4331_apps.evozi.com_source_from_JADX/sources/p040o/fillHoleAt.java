package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.SignedBytes;

/* renamed from: o.fillHoleAt */
public final class fillHoleAt extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public fillHoleAt(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final CrashlyticsRegistrar$$Lambda$1 MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$GroupItemViewHolder depositTransactionAdapter$GroupItemViewHolder) {
        String str;
        Iterator it;
        String str2;
        String str3;
        DepositTransactionAdapter$GroupItemViewHolder depositTransactionAdapter$GroupItemViewHolder2 = depositTransactionAdapter$GroupItemViewHolder;
        onGetStartedClick.write((Object) depositTransactionAdapter$GroupItemViewHolder2, "entity");
        String str4 = depositTransactionAdapter$GroupItemViewHolder2.IconCompatParcelizer;
        String str5 = depositTransactionAdapter$GroupItemViewHolder2.write;
        Iterable iterable = depositTransactionAdapter$GroupItemViewHolder2.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            C6431x12296157 depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding = (C6431x12296157) it2.next();
            int i = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaSessionCompat$ResultReceiverWrapper;
            String str6 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaBrowserCompat$MediaItem;
            String str7 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            String str8 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaBrowserCompat$ItemReceiver;
            String str9 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.RatingCompat;
            String str10 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaMetadataCompat;
            String str11 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaBrowserCompat$SearchResultReceiver;
            String str12 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.Keep;
            String str13 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.AlertController$RecycleListView;
            DepositTransactionAdapter$GroupItemViewHolder_ViewBinding depositTransactionAdapter$GroupItemViewHolder_ViewBinding = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaDescriptionCompat;
            if (depositTransactionAdapter$GroupItemViewHolder_ViewBinding != null) {
                str = depositTransactionAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str = null;
            }
            if (depositTransactionAdapter$GroupItemViewHolder_ViewBinding != null) {
                str2 = depositTransactionAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                it = it2;
            } else {
                it = it2;
                str2 = null;
            }
            buildCrashlytics buildcrashlytics = new buildCrashlytics(str, str2);
            String[] strArr = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.write;
            int i2 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.PlaybackStateCompat$CustomAction;
            String str14 = str4;
            String c_ = mo26549c_(depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.read);
            String str15 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.PlaybackStateCompat;
            String str16 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaSessionCompat$QueueItem;
            String str17 = str5;
            String str18 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.IconCompatParcelizer;
            String str19 = str15;
            if (depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.setHasDecor != null) {
                String str20 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.setHasDecor;
                str3 = write(str20 != null ? Double.valueOf(Double.parseDouble(str20)) : null);
            } else {
                str3 = null;
            }
            String str21 = str19;
            arrayList.add(new Lazy(i, str6, str7, str8, str9, str10, str11, str12, str13, buildcrashlytics, strArr, i2, c_, str21, str16, str18, str3, depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.ParcelableVolumeInfo, depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.MediaSessionCompat$Token, true, depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType_ViewBinding.f3131x50fd9e4a));
            it2 = it;
            str4 = str14;
            str5 = str17;
        }
        String str22 = str4;
        String str23 = str5;
        return new CrashlyticsRegistrar$$Lambda$1(str4, str5, (List) arrayList);
    }
}
