package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver */
public final class AppCompatSeekBar$MediaBrowserCompat$ItemReceiver {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
    public static final int compat_button_inset_horizontal_material = 2131165317;
    public static final int compat_button_inset_vertical_material = 2131165318;
    public static final int compat_button_padding_horizontal_material = 2131165319;
    public static final int compat_button_padding_vertical_material = 2131165320;
    public static final int compat_control_corner_material = 2131165321;
    public static final int compat_notification_large_icon_max_height = 2131165322;
    public static final int compat_notification_large_icon_max_width = 2131165323;
    public static final int notification_action_icon_size = 2131165789;
    public static final int notification_action_text_size = 2131165790;
    public static final int notification_big_circle_margin = 2131165791;
    public static final int notification_content_margin_start = 2131165792;
    public static final int notification_large_icon_height = 2131165793;
    public static final int notification_large_icon_width = 2131165794;
    public static final int notification_main_column_padding_top = 2131165795;
    public static final int notification_media_narrow_margin = 2131165796;
    public static final int notification_right_icon_size = 2131165797;
    public static final int notification_right_side_padding_top = 2131165798;
    public static final int notification_small_icon_background_padding = 2131165799;
    public static final int notification_small_icon_size_as_large = 2131165800;
    public static final int notification_subtext_size = 2131165801;
    public static final int notification_top_pad = 2131165802;
    public static final int notification_top_pad_large_text = 2131165803;
    public int IconCompatParcelizer = 0;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public int[] MediaBrowserCompat$MediaItem = null;
    public int MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat = 0;
    public int MediaMetadataCompat;
    public int ParcelableVolumeInfo;
    public boolean RatingCompat;
    AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver read;
    public final List<AppCompatSeekBar$MediaBrowserCompat$CustomActionResultReceiver> write = new ArrayList();

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatSeekBar$MediaBrowserCompat$ItemReceiver.<clinit>():void");
    }
}
