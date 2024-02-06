package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.scb.phone.view.fragment.etb.ETBProductDetailFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.Iterables;

/* renamed from: o.saturatedCast */
public class saturatedCast extends constrainedSetMultimap<ETBProductDetailFragment.read, AutoValue_CrashlyticsReport_Session_OperatingSystem> {
    private ETBProductDetailFragment.read read;

    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        String str;
        int i;
        AutoValue_CrashlyticsReport_Session_OperatingSystem autoValue_CrashlyticsReport_Session_OperatingSystem;
        ETBProductDetailFragment.read read2 = (ETBProductDetailFragment.read) obj;
        this.read = read2;
        int i2 = read2.read;
        String str2 = "";
        switch (i2) {
            case 0:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_email);
                break;
            case 1:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_language);
                break;
            case 2:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_change_pin);
                break;
            case 3:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_account_settings);
                break;
            case 4:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_account);
                break;
            case 5:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_prompt_pay);
                break;
            case 6:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_e_bill);
                break;
            case 7:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_personal_limit);
                break;
            case 8:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_mask_account_no);
                break;
            case 9:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_app_settings);
                break;
            case 10:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_auto_save_slip);
                break;
            case 11:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_active_fingerprint);
                break;
            case 12:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_notification);
                break;
            case 13:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_devices);
                break;
            case 14:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_your_pages);
                break;
            case 15:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_favorite_label);
                break;
            case 16:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_label_top_up);
                break;
            case 17:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_label_payment);
                break;
            case 18:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_label_transfer);
                break;
            case 19:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_qr_scan_title);
                break;
            case 20:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_qr_settings);
                break;
            case 21:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_qr_payment_title);
                break;
            case 22:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_label_scb_connect);
                break;
            case 23:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_label_remittance);
                break;
            case 24:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_friends_get_friends);
                break;
            case 25:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_settings_menu_manage_mailling_address);
                break;
            case 26:
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_account_inbound);
                break;
            default:
                str = str2;
                break;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_active_language_label);
            } else if (i2 == 7) {
                str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_personal_limit_description);
            } else if (i2 != 8) {
                if (i2 == 11) {
                    str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_active_fingerprint_message);
                } else if (i2 == 19) {
                    str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(DiskLruCache.VERSION_1.equals(this.read.IconCompatParcelizer) ? Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_qr_scan_fastpay : Iterables$3$MediaBrowserCompat$MediaItem.settings_manage_qr_scan_standard);
                }
            } else if (this.read.write) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_mask_on_sample));
                sb.append("\n");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_mask_on_description));
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_mask_off_sample));
                sb2.append("\n");
                sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_mask_off_description));
                str2 = sb2.toString();
            }
        } else if (DiskLruCache.VERSION_1.equals(this.read.MediaBrowserCompat$ItemReceiver)) {
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_email_status_verified);
        } else if (DiskLruCache.VERSION_1.equals(this.read.MediaBrowserCompat$ItemReceiver) || TextUtils.isEmpty(this.read.MediaBrowserCompat$CustomActionResultReceiver)) {
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_email_status_none);
        } else {
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.settings_email_status_not_verified);
        }
        if (i2 != 0) {
            i = 0;
        } else if (DiskLruCache.VERSION_1.equals(this.read.MediaBrowserCompat$ItemReceiver)) {
            i = this.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.light_green);
        } else if (DiskLruCache.VERSION_1.equals(this.read.MediaBrowserCompat$ItemReceiver) || TextUtils.isEmpty(this.read.MediaBrowserCompat$CustomActionResultReceiver)) {
            i = this.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.light_gray);
        } else {
            i = this.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.dark_red);
        }
        if (8 == i2 || 11 == i2 || 10 == i2) {
            autoValue_CrashlyticsReport_Session_OperatingSystem = AutoValue_CrashlyticsReport_Session_Event_Log.C30971.write(i2, read2.write);
        } else if (i2 == 0) {
            autoValue_CrashlyticsReport_Session_OperatingSystem = setContent.read(i2, read2.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            autoValue_CrashlyticsReport_Session_OperatingSystem = AutoValue_CrashlyticsReport_Session_OperatingSystem.IconCompatParcelizer(i2);
        }
        autoValue_CrashlyticsReport_Session_OperatingSystem.RatingCompat = str;
        autoValue_CrashlyticsReport_Session_OperatingSystem.MediaBrowserCompat$ItemReceiver = str2;
        autoValue_CrashlyticsReport_Session_OperatingSystem.IconCompatParcelizer = i;
        return autoValue_CrashlyticsReport_Session_OperatingSystem;
    }

    @HmlPinActivity
    public saturatedCast(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
