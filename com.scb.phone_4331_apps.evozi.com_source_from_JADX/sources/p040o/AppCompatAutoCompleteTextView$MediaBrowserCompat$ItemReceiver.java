package p040o;

import java.io.Serializable;
import java.security.cert.CertStoreParameters;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver */
public final class AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver implements Serializable, CertStoreParameters {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
    public static final int browser_actions_context_menu_max_width = 2131165286;
    public static final int browser_actions_context_menu_min_padding = 2131165287;
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
    public HashSet<AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> write = new HashSet<>(2);

    public void IconCompatParcelizer() {
    }

    public Object clone() {
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public final void write() {
        this.IconCompatParcelizer = 1;
        Iterator<AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().IconCompatParcelizer();
        }
    }

    public final void read() {
        this.IconCompatParcelizer = 0;
        Iterator<AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> it = this.write.iterator();
        while (it.hasNext()) {
            it.next().read();
        }
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer = 0;
        this.write.clear();
    }

    public String toString() {
        CharSequence charSequence = null;
        return charSequence.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.<clinit>():void");
    }
}
