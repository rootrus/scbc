package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.SignedBytes;

/* renamed from: o.createEntryArray */
public final class createEntryArray extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public createEntryArray(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    public final List<access$2600> read(defaultReportUploader defaultreportuploader, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        access$2600 IconCompatParcelizer = access$2600.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_opening_deposit_index_1_title);
        if (str != null) {
            str2 = mo26549c_(str);
        } else {
            str2 = null;
        }
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str2;
        IconCompatParcelizer.IconCompatParcelizer = defaultreportuploader.PlaybackStateCompat$CustomAction;
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(defaultreportuploader.PlaybackStateCompat, true);
        arrayList.add(IconCompatParcelizer);
        access$2600 IconCompatParcelizer2 = access$2600.IconCompatParcelizer();
        IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_opening_deposit_index_2_title);
        IconCompatParcelizer2.IconCompatParcelizer = write(Double.valueOf(defaultreportuploader.MediaSessionCompat$QueueItem));
        arrayList.add(IconCompatParcelizer2);
        access$2600 IconCompatParcelizer3 = access$2600.IconCompatParcelizer();
        IconCompatParcelizer3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_opening_deposit_index_3_title);
        IconCompatParcelizer3.IconCompatParcelizer = write(Double.valueOf((double) defaultreportuploader.Keep));
        arrayList.add(IconCompatParcelizer3);
        return arrayList;
    }

    public final List<access$2600> MediaBrowserCompat$ItemReceiver(access$1900 access_1900, defaultReportUploader defaultreportuploader, cacheUserData cacheuserdata, String str, String str2) {
        String str3;
        boolean z;
        ArrayList arrayList = new ArrayList();
        access$2600 IconCompatParcelizer = access$2600.IconCompatParcelizer();
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_monthly_deduction_index_1_title);
        if (str != null) {
            str3 = mo26549c_(str);
        } else {
            str3 = null;
        }
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str3;
        IconCompatParcelizer.IconCompatParcelizer = defaultreportuploader.MediaBrowserCompat$MediaItem;
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(defaultreportuploader.MediaMetadataCompat, true);
        arrayList.add(IconCompatParcelizer);
        if (access_1900 == null) {
            z = false;
        } else {
            z = "0".equals(access_1900.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (z) {
            access$2600 IconCompatParcelizer2 = access$2600.IconCompatParcelizer();
            IconCompatParcelizer2.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_monthly_deduction_index_2_title);
            IconCompatParcelizer2.IconCompatParcelizer = write(Double.valueOf(defaultreportuploader.IconCompatParcelizer));
            arrayList.add(IconCompatParcelizer2);
            access$2600 IconCompatParcelizer3 = access$2600.IconCompatParcelizer();
            IconCompatParcelizer3.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_monthly_deduction_index_3_title);
            IconCompatParcelizer3.IconCompatParcelizer = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_success_info_monthly_deduction_index_3_detail), new Object[]{CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, cacheuserdata.MediaBrowserCompat$MediaItem), defaultreportuploader.RatingCompat});
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_success_info_monthly_deduction_index_3_sub);
            Object[] objArr = new Object[2];
            StringBuilder sb = new StringBuilder();
            sb.append(defaultreportuploader.MediaBrowserCompat$SearchResultReceiver);
            int i = defaultreportuploader.MediaBrowserCompat$SearchResultReceiver;
            String str4 = "th";
            if (i == 0 || str4.equals(str2)) {
                str4 = "";
            } else if (i == 1 || i == 21 || i == 31) {
                str4 = "st";
            } else if (i == 2 || i == 22) {
                str4 = "nd";
            } else if (i == 3 || i == 23) {
                str4 = "rd";
            }
            sb.append(str4);
            objArr[0] = sb.toString();
            objArr[1] = Integer.valueOf(defaultreportuploader.MediaDescriptionCompat);
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver = String.format(string, objArr);
            arrayList.add(IconCompatParcelizer3);
        }
        return arrayList;
    }

    public final copyToCodedOutputStream read(cacheUserData cacheuserdata) {
        if (TextUtils.isEmpty(cacheuserdata.f2803x50fd9e4a)) {
            cacheuserdata.f2803x50fd9e4a = String.valueOf(System.currentTimeMillis());
        }
        copyToCodedOutputStream copytocodedoutputstream = new copyToCodedOutputStream();
        copytocodedoutputstream.IconCompatParcelizer = cacheuserdata.MediaDescriptionCompat;
        copytocodedoutputstream.RatingCompat = String.format(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_review_info_ref_id), new Object[]{cacheuserdata.f2803x50fd9e4a});
        copytocodedoutputstream.read = cacheuserdata.MediaBrowserCompat$ItemReceiver;
        copytocodedoutputstream.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(cacheuserdata.read, false);
        copytocodedoutputstream.MediaBrowserCompat$ItemReceiver = cacheuserdata.MediaBrowserCompat$CustomActionResultReceiver;
        copytocodedoutputstream.MediaMetadataCompat = cacheuserdata.MediaBrowserCompat$SearchResultReceiver;
        copytocodedoutputstream.MediaBrowserCompat$MediaItem = cacheuserdata.MediaMetadataCompat;
        copytocodedoutputstream.MediaDescriptionCompat = cacheuserdata.RatingCompat;
        return copytocodedoutputstream;
    }

    public final String IconCompatParcelizer(access$1900 access_1900) {
        boolean z;
        boolean z2 = false;
        if (access_1900 == null) {
            z = false;
        } else {
            z = DiskLruCache.VERSION_1.equals(access_1900.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (z) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_success_fixed);
        }
        if (access_1900 != null) {
            z2 = "2".equals(access_1900.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (z2) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_success_saving);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_success_contractual);
    }
}
