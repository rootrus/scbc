package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ActionBarOverlayLayout */
public final class ActionBarOverlayLayout {
    private static final int[] IconCompatParcelizer = {AlertController$RecycleListView.write.abc_textfield_activated_mtrl_alpha, AlertController$RecycleListView.write.abc_textfield_search_activated_mtrl_alpha, AlertController$RecycleListView.write.abc_cab_background_top_mtrl_alpha, AlertController$RecycleListView.write.abc_text_cursor_material, AlertController$RecycleListView.write.abc_text_select_handle_left_mtrl_dark, AlertController$RecycleListView.write.abc_text_select_handle_middle_mtrl_dark, AlertController$RecycleListView.write.abc_text_select_handle_right_mtrl_dark, AlertController$RecycleListView.write.abc_text_select_handle_left_mtrl_light, AlertController$RecycleListView.write.abc_text_select_handle_middle_mtrl_light, AlertController$RecycleListView.write.abc_text_select_handle_right_mtrl_light};
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {AlertController$RecycleListView.write.abc_popup_background_mtrl_mult, AlertController$RecycleListView.write.abc_cab_background_internal_bg, AlertController$RecycleListView.write.abc_menu_hardkey_panel_mtrl_mult};
    private static final read MediaBrowserCompat$ItemReceiver = new read(6);
    private static final int[] MediaBrowserCompat$MediaItem = {AlertController$RecycleListView.write.abc_ic_commit_search_api_mtrl_alpha, AlertController$RecycleListView.write.abc_seekbar_tick_mark_material, AlertController$RecycleListView.write.abc_ic_menu_share_mtrl_alpha, AlertController$RecycleListView.write.abc_ic_menu_copy_mtrl_am_alpha, AlertController$RecycleListView.write.abc_ic_menu_cut_mtrl_alpha, AlertController$RecycleListView.write.abc_ic_menu_selectall_mtrl_alpha, AlertController$RecycleListView.write.abc_ic_menu_paste_mtrl_am_alpha};
    private static ActionBarOverlayLayout MediaDescriptionCompat;
    private static final int[] MediaMetadataCompat = {AlertController$RecycleListView.write.abc_btn_check_material, AlertController$RecycleListView.write.abc_btn_radio_material};
    private static final int[] RatingCompat = {AlertController$RecycleListView.write.abc_tab_indicator_material, AlertController$RecycleListView.write.abc_textfield_search_material};
    private static final int[] read = {AlertController$RecycleListView.write.abc_textfield_search_default_mtrl_alpha, AlertController$RecycleListView.write.abc_textfield_default_mtrl_alpha, AlertController$RecycleListView.write.abc_ab_share_pack_mtrl_alpha};
    private static final PorterDuff.Mode write = PorterDuff.Mode.SRC_IN;
    private setTextAppearance<String, C1127x32570a8a> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final WeakHashMap<Context, setAutoSizeTextTypeWithDefaults<WeakReference<Drawable.ConstantState>>> f2527x50fd9e4a = new WeakHashMap<>(0);
    private setButtonDrawable<String> MediaSessionCompat$QueueItem;
    private TypedValue MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private WeakHashMap<Context, setButtonDrawable<ColorStateList>> ParcelableVolumeInfo;

    public static ActionBarOverlayLayout IconCompatParcelizer() {
        ActionBarOverlayLayout actionBarOverlayLayout;
        synchronized (ActionBarOverlayLayout.class) {
            if (MediaDescriptionCompat == null) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = new ActionBarOverlayLayout();
                MediaDescriptionCompat = actionBarOverlayLayout2;
                read(actionBarOverlayLayout2);
            }
            actionBarOverlayLayout = MediaDescriptionCompat;
        }
        return actionBarOverlayLayout;
    }

    private static void read(ActionBarOverlayLayout actionBarOverlayLayout) {
        if (Build.VERSION.SDK_INT < 24) {
            actionBarOverlayLayout.write("vector", (C1127x32570a8a) new IconCompatParcelizer());
            actionBarOverlayLayout.write("animated-vector", (C1127x32570a8a) new ActionBarOverlayLayout$MediaBrowserCompat$ItemReceiver());
            actionBarOverlayLayout.write("animated-selector", (C1127x32570a8a) new write());
        }
    }

    public final Drawable MediaBrowserCompat$ItemReceiver(Context context, int i) {
        Drawable MediaBrowserCompat$ItemReceiver2;
        synchronized (this) {
            MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(context, i, false);
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final Drawable MediaBrowserCompat$ItemReceiver(Context context, int i, boolean z) {
        Drawable MediaDescriptionCompat2;
        synchronized (this) {
            write(context);
            MediaDescriptionCompat2 = MediaDescriptionCompat(context, i);
            if (MediaDescriptionCompat2 == null) {
                MediaDescriptionCompat2 = IconCompatParcelizer(context, i);
            }
            if (MediaDescriptionCompat2 == null) {
                MediaDescriptionCompat2 = setLastBaselineToBottomHeight.write(context, i);
            }
            if (MediaDescriptionCompat2 != null) {
                MediaDescriptionCompat2 = IconCompatParcelizer(context, i, z, MediaDescriptionCompat2);
            }
            if (MediaDescriptionCompat2 != null) {
                setWindowTitle.write(MediaDescriptionCompat2);
            }
        }
        return MediaDescriptionCompat2;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        synchronized (this) {
            setAutoSizeTextTypeWithDefaults setautosizetexttypewithdefaults = this.f2527x50fd9e4a.get(context);
            if (setautosizetexttypewithdefaults != null) {
                setautosizetexttypewithdefaults.IconCompatParcelizer();
            }
        }
    }

    private static long read(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable IconCompatParcelizer(Context context, int i) {
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = new TypedValue();
        }
        TypedValue typedValue = this.MediaSessionCompat$ResultReceiverWrapper;
        context.getResources().getValue(i, typedValue, true);
        long read2 = read(typedValue);
        Drawable write2 = write(context, read2);
        if (write2 != null) {
            return write2;
        }
        if (i == AlertController$RecycleListView.write.abc_cab_background_top_material) {
            write2 = new LayerDrawable(new Drawable[]{MediaBrowserCompat$ItemReceiver(context, AlertController$RecycleListView.write.abc_cab_background_internal_bg), MediaBrowserCompat$ItemReceiver(context, AlertController$RecycleListView.write.abc_cab_background_top_mtrl_alpha)});
        }
        if (write2 != null) {
            write2.setChangingConfigurations(typedValue.changingConfigurations);
            IconCompatParcelizer(context, read2, write2);
        }
        return write2;
    }

    private Drawable IconCompatParcelizer(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList write2 = write(context, i);
        if (write2 != null) {
            if (setWindowTitle.IconCompatParcelizer(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(drawable);
            setBaselineAligned.read(MediaBrowserCompat$MediaItem2, write2);
            PorterDuff.Mode write3 = write(i);
            if (write3 == null) {
                return MediaBrowserCompat$MediaItem2;
            }
            setBaselineAligned.IconCompatParcelizer(MediaBrowserCompat$MediaItem2, write3);
            return MediaBrowserCompat$MediaItem2;
        } else if (i == AlertController$RecycleListView.write.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable.findDrawableByLayerId(16908288), setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlNormal), write);
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable.findDrawableByLayerId(16908303), setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlNormal), write);
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable.findDrawableByLayerId(16908301), setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlActivated), write);
            return drawable;
        } else if (i == AlertController$RecycleListView.write.abc_ratingbar_material || i == AlertController$RecycleListView.write.abc_ratingbar_indicator_material || i == AlertController$RecycleListView.write.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable2.findDrawableByLayerId(16908288), setExpandedActionViewsExclusive.IconCompatParcelizer(context, AlertController$RecycleListView.read.colorControlNormal), write);
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable2.findDrawableByLayerId(16908303), setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlActivated), write);
            MediaBrowserCompat$CustomActionResultReceiver(layerDrawable2.findDrawableByLayerId(16908301), setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlActivated), write);
            return drawable;
        } else if (IconCompatParcelizer(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    private Drawable MediaDescriptionCompat(Context context, int i) {
        int next;
        setTextAppearance<String, C1127x32570a8a> settextappearance = this.MediaBrowserCompat$SearchResultReceiver;
        if (settextappearance == null || settextappearance.isEmpty()) {
            return null;
        }
        setButtonDrawable<String> setbuttondrawable = this.MediaSessionCompat$QueueItem;
        if (setbuttondrawable != null) {
            String MediaBrowserCompat$CustomActionResultReceiver2 = setbuttondrawable.MediaBrowserCompat$CustomActionResultReceiver(i);
            if ("appcompat_skip_skip".equals(MediaBrowserCompat$CustomActionResultReceiver2) || (MediaBrowserCompat$CustomActionResultReceiver2 != null && this.MediaBrowserCompat$SearchResultReceiver.get(MediaBrowserCompat$CustomActionResultReceiver2) == null)) {
                return null;
            }
        } else {
            this.MediaSessionCompat$QueueItem = new setButtonDrawable<>();
        }
        if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = new TypedValue();
        }
        TypedValue typedValue = this.MediaSessionCompat$ResultReceiverWrapper;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long read2 = read(typedValue);
        Drawable write2 = write(context, read2);
        if (write2 != null) {
            return write2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.MediaSessionCompat$QueueItem.IconCompatParcelizer(i, name);
                    C1127x32570a8a actionBarOverlayLayout$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver.get(name);
                    if (actionBarOverlayLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        write2 = actionBarOverlayLayout$MediaBrowserCompat$CustomActionResultReceiver.write(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (write2 != null) {
                        write2.setChangingConfigurations(typedValue.changingConfigurations);
                        IconCompatParcelizer(context, read2, write2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (write2 == null) {
            this.MediaSessionCompat$QueueItem.IconCompatParcelizer(i, "appcompat_skip_skip");
        }
        return write2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable write(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.setAutoSizeTextTypeWithDefaults<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f2527x50fd9e4a     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            o.setAutoSizeTextTypeWithDefaults r0 = (p040o.setAutoSizeTextTypeWithDefaults) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.MediaBrowserCompat$ItemReceiver(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.write     // Catch:{ all -> 0x0041 }
            int r2 = r0.IconCompatParcelizer     // Catch:{ all -> 0x0041 }
            int r4 = p040o.setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$ItemReceiver(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = p040o.setAutoSizeTextTypeWithDefaults.read     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ActionBarOverlayLayout.write(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private boolean IconCompatParcelizer(Context context, long j, Drawable drawable) {
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            setAutoSizeTextTypeWithDefaults setautosizetexttypewithdefaults = this.f2527x50fd9e4a.get(context);
            if (setautosizetexttypewithdefaults == null) {
                setautosizetexttypewithdefaults = new setAutoSizeTextTypeWithDefaults();
                this.f2527x50fd9e4a.put(context, setautosizetexttypewithdefaults);
            }
            setautosizetexttypewithdefaults.read(j, new WeakReference(constantState));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Drawable MediaBrowserCompat$CustomActionResultReceiver(Context context, setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable, int i) {
        synchronized (this) {
            Drawable MediaDescriptionCompat2 = MediaDescriptionCompat(context, i);
            if (MediaDescriptionCompat2 == null) {
                MediaDescriptionCompat2 = setexpandactivityoverflowbuttondrawable.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
            if (MediaDescriptionCompat2 == null) {
                return null;
            }
            Drawable IconCompatParcelizer2 = IconCompatParcelizer(context, i, false, MediaDescriptionCompat2);
            return IconCompatParcelizer2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean IconCompatParcelizer(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = write
            int[] r1 = read
            boolean r1 = MediaBrowserCompat$ItemReceiver((int[]) r1, (int) r7)
            r2 = 1
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            r4 = 0
            r5 = -1
            if (r1 == 0) goto L_0x0013
            int r3 = p040o.AlertController$RecycleListView.read.colorControlNormal
            goto L_0x003c
        L_0x0013:
            int[] r1 = IconCompatParcelizer
            boolean r1 = MediaBrowserCompat$ItemReceiver((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x001e
            int r3 = p040o.AlertController$RecycleListView.read.colorControlActivated
            goto L_0x003c
        L_0x001e:
            int[] r1 = MediaBrowserCompat$CustomActionResultReceiver
            boolean r1 = MediaBrowserCompat$ItemReceiver((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x0029
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x003c
        L_0x0029:
            int r1 = p040o.AlertController$RecycleListView.write.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x0038
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r1 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r1)
            goto L_0x003e
        L_0x0038:
            int r1 = p040o.AlertController$RecycleListView.write.abc_dialog_material_background
            if (r7 != r1) goto L_0x0040
        L_0x003c:
            r7 = r3
            r1 = r5
        L_0x003e:
            r3 = r2
            goto L_0x0043
        L_0x0040:
            r7 = r4
            r3 = r7
            r1 = r5
        L_0x0043:
            if (r3 == 0) goto L_0x0060
            boolean r3 = p040o.setWindowTitle.IconCompatParcelizer(r8)
            if (r3 == 0) goto L_0x004f
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004f:
            int r6 = p040o.setExpandedActionViewsExclusive.read(r6, r7)
            android.graphics.PorterDuffColorFilter r6 = MediaBrowserCompat$ItemReceiver((int) r6, (android.graphics.PorterDuff.Mode) r0)
            r8.setColorFilter(r6)
            if (r1 == r5) goto L_0x005f
            r8.setAlpha(r1)
        L_0x005f:
            return r2
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ActionBarOverlayLayout.IconCompatParcelizer(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void write(String str, C1127x32570a8a actionBarOverlayLayout$MediaBrowserCompat$CustomActionResultReceiver) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new setTextAppearance<>();
        }
        this.MediaBrowserCompat$SearchResultReceiver.put(str, actionBarOverlayLayout$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private static boolean MediaBrowserCompat$ItemReceiver(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    static PorterDuff.Mode write(int i) {
        if (i == AlertController$RecycleListView.write.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final ColorStateList write(Context context, int i) {
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2;
        synchronized (this) {
            MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(context, i);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                if (i == AlertController$RecycleListView.write.abc_edit_text_material) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_edittext);
                } else if (i == AlertController$RecycleListView.write.abc_switch_track_mtrl_alpha) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_switch_track);
                } else if (i == AlertController$RecycleListView.write.abc_switch_thumb_material) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$MediaItem(context);
                } else if (i == AlertController$RecycleListView.write.abc_btn_default_mtrl_shape) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$ItemReceiver(context);
                } else if (i == AlertController$RecycleListView.write.abc_btn_borderless_material) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = IconCompatParcelizer(context);
                } else if (i == AlertController$RecycleListView.write.abc_btn_colored_material) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = read(context);
                } else {
                    if (i != AlertController$RecycleListView.write.abc_spinner_mtrl_am_alpha) {
                        if (i != AlertController$RecycleListView.write.abc_spinner_textfield_background_material) {
                            if (MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, i)) {
                                MediaBrowserCompat$CustomActionResultReceiver2 = setExpandedActionViewsExclusive.MediaBrowserCompat$CustomActionResultReceiver(context, AlertController$RecycleListView.read.colorControlNormal);
                            } else if (MediaBrowserCompat$ItemReceiver(RatingCompat, i)) {
                                MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_default);
                            } else if (MediaBrowserCompat$ItemReceiver(MediaMetadataCompat, i)) {
                                MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_btn_checkable);
                            } else if (i == AlertController$RecycleListView.write.abc_seekbar_thumb_material) {
                                MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_seek_thumb);
                            }
                        }
                    }
                    MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, C1133x65c1ec57.abc_tint_spinner);
                }
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    IconCompatParcelizer(context, i, MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private ColorStateList MediaBrowserCompat$CustomActionResultReceiver(Context context, int i) {
        setButtonDrawable setbuttondrawable;
        WeakHashMap<Context, setButtonDrawable<ColorStateList>> weakHashMap = this.ParcelableVolumeInfo;
        if (weakHashMap == null || (setbuttondrawable = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) setbuttondrawable.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    private void IconCompatParcelizer(Context context, int i, ColorStateList colorStateList) {
        if (this.ParcelableVolumeInfo == null) {
            this.ParcelableVolumeInfo = new WeakHashMap<>();
        }
        setButtonDrawable setbuttondrawable = this.ParcelableVolumeInfo.get(context);
        if (setbuttondrawable == null) {
            setbuttondrawable = new setButtonDrawable();
            this.ParcelableVolumeInfo.put(context, setbuttondrawable);
        }
        setbuttondrawable.IconCompatParcelizer(i, colorStateList);
    }

    private ColorStateList MediaBrowserCompat$ItemReceiver(Context context) {
        return read(context, setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorButtonNormal));
    }

    private ColorStateList IconCompatParcelizer(Context context) {
        return read(context, 0);
    }

    private ColorStateList read(Context context) {
        return read(context, setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorAccent));
    }

    private ColorStateList read(Context context, int i) {
        int read2 = setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlHighlight);
        int IconCompatParcelizer2 = setExpandedActionViewsExclusive.IconCompatParcelizer(context, AlertController$RecycleListView.read.colorButtonNormal);
        return new ColorStateList(new int[][]{setExpandedActionViewsExclusive.MediaBrowserCompat$ItemReceiver, setExpandedActionViewsExclusive.IconCompatParcelizer, setExpandedActionViewsExclusive.MediaBrowserCompat$CustomActionResultReceiver, setExpandedActionViewsExclusive.read}, new int[]{IconCompatParcelizer2, AlertController$RecycleListView.IconCompatParcelizer(read2, i), AlertController$RecycleListView.IconCompatParcelizer(read2, i), i});
    }

    private ColorStateList MediaBrowserCompat$MediaItem(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = setExpandedActionViewsExclusive.MediaBrowserCompat$CustomActionResultReceiver(context, AlertController$RecycleListView.read.colorSwitchThumbNormal);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || !MediaBrowserCompat$CustomActionResultReceiver2.isStateful()) {
            iArr[0] = setExpandedActionViewsExclusive.MediaBrowserCompat$ItemReceiver;
            iArr2[0] = setExpandedActionViewsExclusive.IconCompatParcelizer(context, AlertController$RecycleListView.read.colorSwitchThumbNormal);
            iArr[1] = setExpandedActionViewsExclusive.write;
            iArr2[1] = setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlActivated);
            iArr[2] = setExpandedActionViewsExclusive.read;
            iArr2[2] = setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorSwitchThumbNormal);
        } else {
            iArr[0] = setExpandedActionViewsExclusive.MediaBrowserCompat$ItemReceiver;
            iArr2[0] = MediaBrowserCompat$CustomActionResultReceiver2.getColorForState(iArr[0], 0);
            iArr[1] = setExpandedActionViewsExclusive.write;
            iArr2[1] = setExpandedActionViewsExclusive.read(context, AlertController$RecycleListView.read.colorControlActivated);
            iArr[2] = setExpandedActionViewsExclusive.read;
            iArr2[2] = MediaBrowserCompat$CustomActionResultReceiver2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: o.ActionBarOverlayLayout$read */
    static class read extends setSupportAllCaps<Integer, PorterDuffColorFilter> {
        public read(int i) {
            super(i);
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter read(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(write(i, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter write(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(write(i, mode)), porterDuffColorFilter);
        }

        private static int write(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void MediaBrowserCompat$ItemReceiver(Drawable drawable, AlertController$RecycleListView.write write2, int[] iArr) {
        if (!setWindowTitle.IconCompatParcelizer(drawable) || drawable.mutate() == drawable) {
            if (write2.read || write2.write) {
                drawable.setColorFilter(read(write2.read ? write2.MediaBrowserCompat$ItemReceiver : null, write2.write ? write2.IconCompatParcelizer : write, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter read(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return MediaBrowserCompat$ItemReceiver(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static PorterDuffColorFilter MediaBrowserCompat$ItemReceiver(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter read2;
        synchronized (ActionBarOverlayLayout.class) {
            read2 = MediaBrowserCompat$ItemReceiver.read(i, mode);
            if (read2 == null) {
                read2 = new PorterDuffColorFilter(i, mode);
                MediaBrowserCompat$ItemReceiver.write(i, mode, read2);
            }
        }
        return read2;
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (setWindowTitle.IconCompatParcelizer(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = write;
        }
        drawable.setColorFilter(MediaBrowserCompat$ItemReceiver(i, mode));
    }

    private void write(Context context) {
        if (!this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = true;
            Drawable MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(context, AlertController$RecycleListView.write.abc_vector_test);
            if (MediaBrowserCompat$ItemReceiver2 == null || !read(MediaBrowserCompat$ItemReceiver2)) {
                this.MediaSessionCompat$Token = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static boolean read(Drawable drawable) {
        return (drawable instanceof getTheme) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: o.ActionBarOverlayLayout$IconCompatParcelizer */
    static class IconCompatParcelizer implements C1127x32570a8a {
        IconCompatParcelizer() {
        }

        public Drawable write(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return getTheme.IconCompatParcelizer(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: o.ActionBarOverlayLayout$write */
    static class write implements C1127x32570a8a {
        write() {
        }

        public Drawable write(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return setCheckable.write(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }
}
