package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.synchronizedBiMap */
public final class synchronizedBiMap extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public synchronizedBiMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreference");
    }

    public final initializeAllApis MediaBrowserCompat$ItemReceiver(C5449version version, initializeApp initializeapp) {
        String str;
        String str2;
        String str3;
        onGetStartedClick.write((Object) version, "response");
        onGetStartedClick.write((Object) initializeapp, "displayModel");
        initializeAllApis initializeallapis = new initializeAllApis((byte) 0);
        String str4 = version.MediaSessionCompat$Token;
        String str5 = null;
        if (str4 != null) {
            str = IconCompatParcelizer("dd MMM yyyy - HH:mm", AlertController$RecycleListView.write(str4, (OffsetDateTime) null));
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        initializeallapis.AppCompatDelegateImpl$ListMenuDecorView = str;
        initializeallapis.ParcelableVolumeInfo = initializeapp.RatingCompat;
        initializeallapis.MediaDescriptionCompat = initializeapp.MediaBrowserCompat$ItemReceiver;
        String str6 = version.MediaBrowserCompat$SearchResultReceiver;
        if (str6 != null) {
            str2 = String.format("%s %s", new Object[]{ModifyQuickTopUpReviewActivity.IconCompatParcelizer(str6, "0"), this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.month_label)});
            onGetStartedClick.IconCompatParcelizer((Object) str2, "format(\"%s %s\",\n        …ng.month_label)\n        )");
        } else {
            str2 = null;
        }
        initializeallapis.MediaBrowserCompat$CustomActionResultReceiver = str2;
        String str7 = version.write;
        if (str7 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str7);
            sb.append('%');
            str3 = sb.toString();
        } else {
            str3 = null;
        }
        initializeallapis.MediaMetadataCompat = str3;
        String str8 = version.IconCompatParcelizer;
        if (str8 != null) {
            FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
            str5 = String.format("%s %s", Arrays.copyOf(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id_label), str8}, 2));
            onGetStartedClick.IconCompatParcelizer((Object) str5, "java.lang.String.format(format, *args)");
        }
        initializeallapis.f2867x50fd9e4a = str5;
        String write2 = write(version.MediaDescriptionCompat);
        onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(this)");
        initializeallapis.Keep = write2;
        String write3 = write(version.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) write3, "transformFund(this)");
        initializeallapis.MediaBrowserCompat$SearchResultReceiver = write3;
        initializeallapis.RatingCompat = version.MediaBrowserCompat$CustomActionResultReceiver;
        String write4 = write(version.f2975x50fd9e4a);
        onGetStartedClick.IconCompatParcelizer((Object) write4, "transformFund(this)");
        initializeallapis.setHasDecor = write4;
        String write5 = write(version.MediaMetadataCompat);
        onGetStartedClick.IconCompatParcelizer((Object) write5, "transformFund(this)");
        initializeallapis.MediaSessionCompat$ResultReceiverWrapper = write5;
        String write6 = write(version.MediaBrowserCompat$MediaItem);
        onGetStartedClick.IconCompatParcelizer((Object) write6, "transformFund(this)");
        initializeallapis.PlaybackStateCompat = write6;
        String write7 = write(version.RatingCompat);
        onGetStartedClick.IconCompatParcelizer((Object) write7, "transformFund(this)");
        initializeallapis.AlertController$RecycleListView = write7;
        String write8 = write(version.ParcelableVolumeInfo);
        onGetStartedClick.IconCompatParcelizer((Object) write8, "transformFund(this)");
        initializeallapis.PlaybackStateCompat$CustomAction = write8;
        initializeallapis.AppCompatActivity = version.MediaSessionCompat$QueueItem;
        synchronizedBiMap$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(version.read);
        initializeallapis.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver.write;
        initializeallapis.MediaSessionCompat$QueueItem = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        int i = MediaBrowserCompat$ItemReceiver.write;
        List<onStartJob> list = version.read;
        initializeallapis.read = list != null && i == list.size();
        int i2 = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        List<onStartJob> list2 = version.read;
        initializeallapis.IconCompatParcelizer = list2 != null && i2 == list2.size();
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.transaction_successful, new Object[]{String.valueOf(initializeallapis.MediaSessionCompat$QueueItem)});
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.transaction_failed, new Object[]{String.valueOf(initializeallapis.MediaBrowserCompat$ItemReceiver)});
        initializeallapis.MediaSessionCompat$Token = string;
        initializeallapis.write = string2;
        initializeallapis.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        return initializeallapis;
    }

    private final synchronizedBiMap$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(List<onStartJob> list) {
        String str;
        write write2;
        if (list == null) {
            return new synchronizedBiMap$MediaBrowserCompat$CustomActionResultReceiver(new ArrayList(), 0, 0);
        }
        Iterable<onStartJob> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        int i2 = 0;
        int i3 = 0;
        for (onStartJob onstartjob : iterable) {
            isDataCollectionDefaultEnabled isdatacollectiondefaultenabled = new isDataCollectionDefaultEnabled((byte) 0);
            isPreview ispreview = onstartjob.MediaDescriptionCompat;
            String str2 = null;
            isdatacollectiondefaultenabled.write = ispreview != null ? ispreview.MediaBrowserCompat$ItemReceiver : null;
            SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver = onstartjob.MediaBrowserCompat$ItemReceiver;
            if (sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null) {
                str = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.read;
            } else {
                str = null;
            }
            isdatacollectiondefaultenabled.MediaBrowserCompat$CustomActionResultReceiver = str;
            SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver2 = onstartjob.MediaBrowserCompat$ItemReceiver;
            if (sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver2 != null) {
                str2 = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            isdatacollectiondefaultenabled.MediaBrowserCompat$ItemReceiver = str2;
            String write3 = write(onstartjob.read);
            onGetStartedClick.IconCompatParcelizer((Object) write3, "transformFund(this)");
            isdatacollectiondefaultenabled.IconCompatParcelizer = write3;
            String write4 = write(onstartjob.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) write4, "transformFund(this)");
            isdatacollectiondefaultenabled.read = write4;
            String write5 = write(onstartjob.write);
            onGetStartedClick.IconCompatParcelizer((Object) write5, "transformFund(this)");
            isdatacollectiondefaultenabled.RatingCompat = write5;
            String write6 = write(onstartjob.RatingCompat);
            onGetStartedClick.IconCompatParcelizer((Object) write6, "transformFund(this)");
            isdatacollectiondefaultenabled.MediaMetadataCompat = write6;
            if (onstartjob.IconCompatParcelizer) {
                write2 = new write(isdatacollectiondefaultenabled, true);
            } else {
                write2 = new write(isdatacollectiondefaultenabled, false);
            }
            if (write2.IconCompatParcelizer) {
                i2++;
            } else {
                i3++;
            }
            arrayList.add(write2.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return new synchronizedBiMap$MediaBrowserCompat$CustomActionResultReceiver((List) arrayList, i2, i3);
    }

    /* renamed from: o.synchronizedBiMap$write */
    public static final class write {
        final boolean IconCompatParcelizer;
        final isDataCollectionDefaultEnabled MediaBrowserCompat$CustomActionResultReceiver;

        public write(isDataCollectionDefaultEnabled isdatacollectiondefaultenabled, boolean z) {
            onGetStartedClick.write((Object) isdatacollectiondefaultenabled, "data");
            this.MediaBrowserCompat$CustomActionResultReceiver = isdatacollectiondefaultenabled;
            this.IconCompatParcelizer = z;
        }
    }
}
