package p040o;

import android.app.RemoteInput;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.security.cert.CertStoreParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.superDispatchKeyEvent;

/* renamed from: o.AlertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1133x65c1ec57 implements Window.Callback, Closeable, CertStoreParameters {
    public static final Map<Integer, String> MediaDescriptionCompat = new HashMap();
    public static final Map<Integer, String> RatingCompat = new HashMap();
    public static final int abc_background_cache_hint_selector_material_dark = 2131099648;
    public static final int abc_background_cache_hint_selector_material_light = 2131099649;
    public static final int abc_btn_colored_borderless_text_material = 2131099650;
    public static final int abc_btn_colored_text_material = 2131099651;
    public static final int abc_color_highlight_material = 2131099652;
    public static final int abc_hint_foreground_material_dark = 2131099653;
    public static final int abc_hint_foreground_material_light = 2131099654;
    public static final int abc_input_method_navigation_guard = 2131099655;
    public static final int abc_primary_text_disable_only_material_dark = 2131099656;
    public static final int abc_primary_text_disable_only_material_light = 2131099657;
    public static final int abc_primary_text_material_dark = 2131099658;
    public static final int abc_primary_text_material_light = 2131099659;
    public static final int abc_search_url_text = 2131099660;
    public static final int abc_search_url_text_normal = 2131099661;
    public static final int abc_search_url_text_pressed = 2131099662;
    public static final int abc_search_url_text_selected = 2131099663;
    public static final int abc_secondary_text_material_dark = 2131099664;
    public static final int abc_secondary_text_material_light = 2131099665;
    public static final int abc_tint_btn_checkable = 2131099666;
    public static final int abc_tint_default = 2131099667;
    public static final int abc_tint_edittext = 2131099668;
    public static final int abc_tint_seek_thumb = 2131099669;
    public static final int abc_tint_spinner = 2131099670;
    public static final int abc_tint_switch_track = 2131099671;
    public static final int accent_material_dark = 2131099672;
    public static final int accent_material_light = 2131099673;
    public static final int background_floating_material_dark = 2131099675;
    public static final int background_floating_material_light = 2131099676;
    public static final int background_material_dark = 2131099677;
    public static final int background_material_light = 2131099678;
    public static final int bright_foreground_disabled_material_dark = 2131099691;
    public static final int bright_foreground_disabled_material_light = 2131099692;
    public static final int bright_foreground_inverse_material_dark = 2131099693;
    public static final int bright_foreground_inverse_material_light = 2131099694;
    public static final int bright_foreground_material_dark = 2131099695;
    public static final int bright_foreground_material_light = 2131099696;
    public static final int button_material_dark = 2131099701;
    public static final int button_material_light = 2131099702;
    public static final int dim_foreground_disabled_material_dark = 2131099753;
    public static final int dim_foreground_disabled_material_light = 2131099754;
    public static final int dim_foreground_material_dark = 2131099755;
    public static final int dim_foreground_material_light = 2131099756;
    public static final int error_color_material_dark = 2131099762;
    public static final int error_color_material_light = 2131099763;
    public static final int foreground_material_dark = 2131099771;
    public static final int foreground_material_light = 2131099772;
    public static final int highlighted_text_material_dark = 2131099777;
    public static final int highlighted_text_material_light = 2131099778;
    public static final int material_blue_grey_800 = 2131099803;
    public static final int material_blue_grey_900 = 2131099804;
    public static final int material_blue_grey_950 = 2131099805;
    public static final int material_deep_teal_200 = 2131099806;
    public static final int material_deep_teal_500 = 2131099807;
    public static final int material_grey_100 = 2131099808;
    public static final int material_grey_300 = 2131099809;
    public static final int material_grey_50 = 2131099810;
    public static final int material_grey_600 = 2131099811;
    public static final int material_grey_800 = 2131099812;
    public static final int material_grey_850 = 2131099813;
    public static final int material_grey_900 = 2131099814;
    public static final int notification_action_color_filter = 2131099848;
    public static final int notification_icon_bg_color = 2131099849;
    public static final int primary_dark_material_dark = 2131099863;
    public static final int primary_dark_material_light = 2131099864;
    public static final int primary_material_dark = 2131099865;
    public static final int primary_material_light = 2131099866;
    public static final int primary_text_default_material_dark = 2131099867;
    public static final int primary_text_default_material_light = 2131099868;
    public static final int primary_text_disabled_material_dark = 2131099869;
    public static final int primary_text_disabled_material_light = 2131099870;
    public static final int ripple_material_dark = 2131099875;
    public static final int ripple_material_light = 2131099876;
    public static final int secondary_text_default_material_dark = 2131099891;
    public static final int secondary_text_default_material_light = 2131099892;
    public static final int secondary_text_disabled_material_dark = 2131099893;
    public static final int secondary_text_disabled_material_light = 2131099894;
    public static final int switch_thumb_disabled_material_dark = 2131099897;
    public static final int switch_thumb_disabled_material_light = 2131099898;
    public static final int switch_thumb_material_dark = 2131099899;
    public static final int switch_thumb_material_light = 2131099900;
    public static final int switch_thumb_normal_material_dark = 2131099901;
    public static final int switch_thumb_normal_material_light = 2131099902;
    public static final int tooltip_background_dark = 2131100252;
    public static final int tooltip_background_light = 2131100253;
    public final Bundle IconCompatParcelizer;
    public final Set<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final CharSequence[] MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int f2531x50fd9e4a;
    public final CharSequence MediaMetadataCompat;
    private ArrayList<String> MediaSessionCompat$QueueItem;
    public final int MediaSessionCompat$Token;
    public final int ParcelableVolumeInfo;
    public final boolean read;
    final Window.Callback write;

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Map<String, GiftingSelectRecipientActivity_ViewBinding> map, String str, GiftingSelectRecipientActivity_ViewBinding giftingSelectRecipientActivity_ViewBinding) {
        return false;
    }

    public Object clone() {
        return this;
    }

    public C1133x65c1ec57(Window.Callback callback) {
        if (callback != null) {
            this.write = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.write.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.write.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.write.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.write.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.write.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.write.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.write.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.write.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.write.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.write.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.write.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.write.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.write.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.write.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.write.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.write.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.write.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.write.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.write.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.write.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.write.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.write.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.write.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.write.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.write.onWindowStartingActionMode(callback, i);
    }

    public C1133x65c1ec57() {
        this.MediaSessionCompat$QueueItem = new ArrayList<>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n*** Metrics ***\nmeasures: ");
        sb.append(0);
        sb.append("\nadditionalMeasures: ");
        sb.append(0);
        sb.append("\nresolutions passes: ");
        sb.append(0);
        sb.append("\ntable increases: ");
        sb.append(0);
        sb.append("\nmaxTableSize: ");
        sb.append(0);
        sb.append("\nmaxVariables: ");
        sb.append(0);
        sb.append("\nmaxRows: ");
        sb.append(0);
        sb.append("\n\nminimize: ");
        sb.append(0);
        sb.append("\nminimizeGoal: ");
        sb.append(0);
        sb.append("\nconstraints: ");
        sb.append(0);
        sb.append("\nsimpleconstraints: ");
        sb.append(0);
        sb.append("\noptimize: ");
        sb.append(0);
        sb.append("\niterations: ");
        sb.append(0);
        sb.append("\npivots: ");
        sb.append(0);
        sb.append("\nbfs: ");
        sb.append(0);
        sb.append("\nvariables: ");
        sb.append(0);
        sb.append("\nerrors: ");
        sb.append(0);
        sb.append("\nslackvariables: ");
        sb.append(0);
        sb.append("\nextravariables: ");
        sb.append(0);
        sb.append("\nfullySolved: ");
        sb.append(0);
        sb.append("\ngraphOptimizer: ");
        sb.append(0);
        sb.append("\nresolvedWidgets: ");
        sb.append(0);
        sb.append("\noldresolvedWidgets: ");
        sb.append(0);
        sb.append("\nnonresolvedWidgets: ");
        sb.append(0);
        sb.append("\ncenterConnectionResolved: ");
        sb.append(0);
        sb.append("\nmatchConnectionResolved: ");
        sb.append(0);
        sb.append("\nchainConnectionResolved: ");
        sb.append(0);
        sb.append("\nbarrierConnectionResolved: ");
        sb.append(0);
        sb.append("\nproblematicsLayouts: ");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append("\n");
        return sb.toString();
    }

    public static RemoteInput[] MediaBrowserCompat$CustomActionResultReceiver(C1133x65c1ec57[] alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr) {
        if (alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr.length];
        for (int i = 0; i < alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr.length; i++) {
            C1133x65c1ec57 alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver = alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiverArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem).setLabel(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat).setChoices(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver).setAllowFreeFormInput(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.read).addExtras(alertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).build();
        }
        return remoteInputArr;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        View view = null;
        view.getTag(superDispatchKeyEvent.read.transition_current_scene);
    }

    public void close() throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        abstractInterruptibleChannel.close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX WARNING: type inference failed for: r2v0, types: [float[], o.rsnScriptInvokeV$IconCompatParcelizer, android.graphics.Matrix] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.Float3 read(float r6, float r7) {
        /*
            r5 = this;
            r0 = 0
            o.Float3 r0 = p040o.Float3.IconCompatParcelizer(r0, r0)
            r1 = 0
            r2 = 0
            r2[r1] = r6
            r6 = 1
            r2[r6] = r7
            r2.reset()
            r2.invert(r2)
            r2.mapPoints(r2)
            android.graphics.Matrix r7 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r7.invert(r2)
            r2.mapPoints(r2)
            r2.invert(r2)
            r2.mapPoints(r2)
            r7 = r2[r1]
            double r3 = (double) r7
            r0.MediaBrowserCompat$CustomActionResultReceiver = r3
            r6 = r2[r6]
            double r6 = (double) r6
            r0.IconCompatParcelizer = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C1133x65c1ec57.read(float, float):o.Float3");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.rsnScriptInvokeV$IconCompatParcelizer, android.graphics.Matrix] */
    public static void MediaBrowserCompat$CustomActionResultReceiver(float[] fArr) {
        ? r0 = 0;
        r0.mapPoints(fArr);
        r0.MediaBrowserCompat$CustomActionResultReceiver.mapPoints(fArr);
        r0.mapPoints(fArr);
    }

    static {
        MediaDescriptionCompat.put(1, "No error occurred; only some types of update flow are allowed, while others are forbidden.");
        MediaDescriptionCompat.put(-2, "An unknown error occurred.");
        MediaDescriptionCompat.put(-3, "The API is not available on this device.");
        MediaDescriptionCompat.put(-4, "The request that was sent by the app is malformed.");
        MediaDescriptionCompat.put(-5, "The install is unavailable to this user or device.");
        MediaDescriptionCompat.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        MediaDescriptionCompat.put(-7, "The install/update has not been (fully) downloaded yet.");
        MediaDescriptionCompat.put(-8, "The install is already in progress and there is no UI flow to resume.");
        MediaDescriptionCompat.put(-100, "An internal error happened in the Play Store.");
        RatingCompat.put(1, "NO_ERROR_PARTIALLY_ALLOWED");
        RatingCompat.put(-2, "ERROR_UNKNOWN");
        RatingCompat.put(-3, "ERROR_API_NOT_AVAILABLE");
        RatingCompat.put(-4, "ERROR_INVALID_REQUEST");
        RatingCompat.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        RatingCompat.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        RatingCompat.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        RatingCompat.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        RatingCompat.put(-100, "ERROR_INTERNAL_ERROR");
    }

    public static <T> T IconCompatParcelizer(T t, String str, Object obj) {
        String str2;
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            if (obj instanceof Class) {
                str2 = ((Class) obj).getCanonicalName();
            } else {
                str2 = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace("%s", str2));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }
}
