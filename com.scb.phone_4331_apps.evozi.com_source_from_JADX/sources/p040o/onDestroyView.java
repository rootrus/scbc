package p040o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.drew.imaging.riff.RiffProcessingException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p040o.isComplex;

/* renamed from: o.onDestroyView */
public final class onDestroyView implements ICheckDeserializer {

    /* renamed from: o.onDestroyView$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements loadInBackground {
        public static final int abc_fade_in = 2130771968;
        public static final int abc_fade_out = 2130771969;
        public static final int abc_grow_fade_in_from_bottom = 2130771970;
        public static final int abc_popup_enter = 2130771971;
        public static final int abc_popup_exit = 2130771972;
        public static final int abc_shrink_fade_out_from_bottom = 2130771973;
        public static final int abc_slide_in_bottom = 2130771974;
        public static final int abc_slide_in_top = 2130771975;
        public static final int abc_slide_out_bottom = 2130771976;
        public static final int abc_slide_out_top = 2130771977;
        public static final int design_bottom_sheet_slide_in = 2130771985;
        public static final int design_bottom_sheet_slide_out = 2130771986;
        public static final int design_snackbar_in = 2130771987;
        public static final int design_snackbar_out = 2130771988;
        public static final int top_in = 2130772012;
        public static final int top_out = 2130772013;

        public final void onDestroy() {
        }

        public final void onStart() {
        }

        public final void onStop() {
        }
    }

    @Deprecated
    /* renamed from: o.onDestroyView$write */
    public static final class write {
        public static final int abc_action_bar_title_item = 2131492864;
        public static final int abc_action_bar_up_container = 2131492865;
        public static final int abc_action_menu_item_layout = 2131492866;
        public static final int abc_action_menu_layout = 2131492867;
        public static final int abc_action_mode_bar = 2131492868;
        public static final int abc_action_mode_close_item_material = 2131492869;
        public static final int abc_activity_chooser_view = 2131492870;
        public static final int abc_activity_chooser_view_list_item = 2131492871;
        public static final int abc_alert_dialog_button_bar_material = 2131492872;
        public static final int abc_alert_dialog_material = 2131492873;
        public static final int abc_dialog_title_material = 2131492876;
        public static final int abc_expanded_menu_layout = 2131492877;
        public static final int abc_list_menu_item_checkbox = 2131492878;
        public static final int abc_list_menu_item_icon = 2131492879;
        public static final int abc_list_menu_item_layout = 2131492880;
        public static final int abc_list_menu_item_radio = 2131492881;
        public static final int abc_popup_menu_header_item_layout = 2131492882;
        public static final int abc_popup_menu_item_layout = 2131492883;
        public static final int abc_screen_content_include = 2131492884;
        public static final int abc_screen_simple = 2131492885;
        public static final int abc_screen_simple_overlay_action_mode = 2131492886;
        public static final int abc_screen_toolbar = 2131492887;
        public static final int abc_search_dropdown_item_icons_2line = 2131492888;
        public static final int abc_search_view = 2131492889;
        public static final int abc_select_dialog_material = 2131492890;
        public static final int design_bottom_sheet_dialog = 2131493748;
        public static final int design_layout_snackbar = 2131493749;
        public static final int design_layout_snackbar_include = 2131493750;
        public static final int design_layout_tab_icon = 2131493751;
        public static final int design_layout_tab_text = 2131493752;
        public static final int design_menu_item_action_area = 2131493753;
        public static final int design_navigation_item = 2131493754;
        public static final int design_navigation_item_header = 2131493755;
        public static final int design_navigation_item_separator = 2131493756;
        public static final int design_navigation_item_subheader = 2131493757;
        public static final int design_navigation_menu = 2131493758;
        public static final int design_navigation_menu_item = 2131493759;
        public static final int notification_media_action = 2131494437;
        public static final int notification_media_cancel_action = 2131494438;
        public static final int notification_template_big_media = 2131494439;
        public static final int notification_template_big_media_narrow = 2131494441;
        public static final int notification_template_media = 2131494446;
        public static final int notification_template_part_chronometer = 2131494448;
        public static final int notification_template_part_time = 2131494449;
        public static final int select_dialog_item_material = 2131494469;
        public static final int select_dialog_multichoice_material = 2131494470;
        public static final int select_dialog_singlechoice_material = 2131494471;
        public static final int support_simple_spinner_dropdown_item = 2131494475;
        public static final int tsnackbar_layout = 2131494522;
        public static final int tsnackbar_layout_include = 2131494523;
        private final Context MediaBrowserCompat$ItemReceiver;

        public write(Context context) {
            this.MediaBrowserCompat$ItemReceiver = context;
        }

        private static setUpdateThrottle write(String str) {
            try {
                Class<?> cls = Class.forName(str);
                Object obj = null;
                try {
                    obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (InstantiationException e) {
                    MediaBrowserCompat$ItemReceiver(cls, e);
                } catch (IllegalAccessException e2) {
                    MediaBrowserCompat$ItemReceiver(cls, e2);
                } catch (NoSuchMethodException e3) {
                    MediaBrowserCompat$ItemReceiver(cls, e3);
                } catch (InvocationTargetException e4) {
                    MediaBrowserCompat$ItemReceiver(cls, e4);
                }
                if (obj instanceof setUpdateThrottle) {
                    return (setUpdateThrottle) obj;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(obj);
                throw new RuntimeException(sb.toString());
            } catch (ClassNotFoundException e5) {
                throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
            }
        }

        private static void MediaBrowserCompat$ItemReceiver(Class<?> cls, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate GlideModule implementation for ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), exc);
        }

        public final List<setUpdateThrottle> IconCompatParcelizer() {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = this.MediaBrowserCompat$ItemReceiver.getPackageManager().getApplicationInfo(this.MediaBrowserCompat$ItemReceiver.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                    return arrayList;
                }
                if (Log.isLoggable("ManifestParser", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got app info metadata: ");
                    sb.append(applicationInfo.metaData);
                    Log.v("ManifestParser", sb.toString());
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(write(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Loaded Glide module: ");
                            sb2.append(str);
                            Log.d("ManifestParser", sb2.toString());
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                return arrayList;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        }

        public write() {
        }

        public static getSubElementOffsetBytes MediaBrowserCompat$ItemReceiver(InputStream inputStream) throws IOException, RiffProcessingException {
            getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
            C1454x8d0f0ffb.read(new copyFromUnchecked(inputStream), new isComplex.C13581(getsubelementoffsetbytes));
            return getsubelementoffsetbytes;
        }
    }

    /* renamed from: o.onDestroyView$read */
    public static final class read implements executePendingTask {
        public static final int action0 = 2131296303;
        public static final int action_bar = 2131296304;
        public static final int action_bar_activity_content = 2131296305;
        public static final int action_bar_container = 2131296306;
        public static final int action_bar_root = 2131296307;
        public static final int action_bar_spinner = 2131296308;
        public static final int action_bar_subtitle = 2131296309;
        public static final int action_bar_title = 2131296310;
        public static final int action_context_bar = 2131296314;
        public static final int action_divider = 2131296315;
        public static final int action_menu_divider = 2131296317;
        public static final int action_menu_presenter = 2131296318;
        public static final int action_mode_bar = 2131296319;
        public static final int action_mode_bar_stub = 2131296320;
        public static final int action_mode_close_button = 2131296321;
        public static final int activity_chooser_view_content = 2131296332;
        public static final int add = 2131296335;
        public static final int alertTitle = 2131296375;
        public static final int always = 2131296382;
        public static final int auto = 2131296437;
        public static final int beginning = 2131296487;
        public static final int bottom = 2131296590;
        public static final int buttonPanel = 2131296807;
        public static final int cancel_action = 2131296912;
        public static final int center = 2131297006;
        public static final int center_horizontal = 2131297008;
        public static final int center_vertical = 2131297009;
        public static final int checkbox = 2131297017;
        public static final int chronometer = 2131297036;
        public static final int clip_horizontal = 2131297082;
        public static final int clip_vertical = 2131297083;
        public static final int collapseActionView = 2131297093;
        public static final int contentPanel = 2131297130;
        public static final int custom = 2131297227;
        public static final int customPanel = 2131297228;
        public static final int decor_content_parent = 2131297356;
        public static final int default_activity_button = 2131297372;
        public static final int design_bottom_sheet = 2131297406;
        public static final int design_menu_item_action_area = 2131297407;
        public static final int design_menu_item_action_area_stub = 2131297408;
        public static final int design_menu_item_text = 2131297409;
        public static final int design_navigation_view = 2131297410;
        public static final int disableHome = 2131297458;
        public static final int edit_query = 2131297589;
        public static final int end = 2131297635;
        public static final int end_padder = 2131297640;
        public static final int enterAlways = 2131297643;
        public static final int enterAlwaysCollapsed = 2131297644;
        public static final int exitUntilCollapsed = 2131297712;
        public static final int expand_activities_button = 2131297713;
        public static final int expanded_menu = 2131297717;
        public static final int fill = 2131297751;
        public static final int fill_horizontal = 2131297752;
        public static final int fill_vertical = 2131297753;
        public static final int fixed = 2131297768;
        public static final int home = 2131298105;
        public static final int homeAsUp = 2131298106;
        public static final int icon = 2131298138;
        public static final int ifRoom = 2131298162;
        public static final int image = 2131298163;
        public static final int info = 2131298278;
        public static final int item_touch_helper_previous_elevation = 2131298379;
        public static final int left = 2131298906;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int listMode = 2131298971;
        public static final int list_item = 2131298972;
        public static final int media_actions = 2131299224;
        public static final int middle = 2131299252;
        public static final int mini = 2131299258;
        public static final int multiply = 2131299319;
        public static final int navigation_header_container = 2131299340;
        public static final int never = 2131299345;
        public static final int none = 2131299386;
        public static final int normal = 2131299387;
        public static final int parallax = 2131299491;
        public static final int parentPanel = 2131299493;
        public static final int pin = 2131299535;
        public static final int progress_circular = 2131299616;
        public static final int progress_horizontal = 2131299617;
        public static final int radio = 2131299671;
        public static final int right = 2131299897;
        public static final int screen = 2131300061;
        public static final int scroll = 2131300062;
        public static final int scrollIndicatorDown = 2131300064;
        public static final int scrollIndicatorUp = 2131300065;
        public static final int scrollView = 2131300066;
        public static final int scrollable = 2131300070;
        public static final int search_badge = 2131300071;
        public static final int search_bar = 2131300072;
        public static final int search_button = 2131300074;
        public static final int search_close_btn = 2131300075;
        public static final int search_edit_frame = 2131300078;
        public static final int search_go_btn = 2131300081;
        public static final int search_mag_icon = 2131300084;
        public static final int search_plate = 2131300085;
        public static final int search_src_text = 2131300086;
        public static final int search_voice_btn = 2131300087;
        public static final int select_dialog_listview = 2131300112;
        public static final int shortcut = 2131300174;
        public static final int showCustom = 2131300175;
        public static final int showHome = 2131300176;
        public static final int showTitle = 2131300177;
        public static final int snackbar_action = 2131300198;
        public static final int snackbar_text = 2131300199;
        public static final int snap = 2131300200;
        public static final int spacer = 2131300247;
        public static final int split_action_bar = 2131300259;
        public static final int src_atop = 2131300273;
        public static final int src_in = 2131300274;
        public static final int src_over = 2131300275;
        public static final int start = 2131300277;
        public static final int status_bar_latest_event_content = 2131300288;
        public static final int submenuarrow = 2131300304;
        public static final int submit_area = 2131300306;
        public static final int tabMode = 2131300347;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int textSpacerNoButtons = 2131300383;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public static final int title_template = 2131300703;
        public static final int top = 2131300717;
        public static final int topPanel = 2131300719;
        public static final int touch_outside = 2131300746;

        /* renamed from: up */
        public static final int f2612up = 2131302096;
        public static final int useLogo = 2131302099;
        public static final int view_offset_helper = 2131302220;
        public static final int withText = 2131302352;
        public static final int wrap_content = 2131302363;
        public final Set<onAbandon<?>> MediaBrowserCompat$ItemReceiver = Collections.newSetFromMap(new WeakHashMap());

        public final void onDestroy() {
            for (T onDestroy : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
                onDestroy.onDestroy();
            }
        }

        public final void onStart() {
            for (T onStart : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
                onStart.onStart();
            }
        }

        public final void onStop() {
            for (T onStop : LinearLayoutManager.write(this.MediaBrowserCompat$ItemReceiver)) {
                onStop.onStop();
            }
        }
    }
}
