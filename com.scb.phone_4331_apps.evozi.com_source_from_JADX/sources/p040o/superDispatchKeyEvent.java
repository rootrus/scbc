package p040o;

import android.content.Context;
import android.util.Log;
import p040o.loadInBackground;
import p040o.onDestroyView;

/* renamed from: o.superDispatchKeyEvent */
public final class superDispatchKeyEvent implements ICheckExtractorListener {
    public final void write(executePendingTask executependingtask) {
    }

    public final void read(executePendingTask executependingtask) {
        executependingtask.onStart();
    }

    /* renamed from: o.superDispatchKeyEvent$read */
    public static final class read implements getUsable {
        public static final int action_container = 2131296313;
        public static final int action_divider = 2131296315;
        public static final int action_image = 2131296316;
        public static final int action_text = 2131296326;
        public static final int actions = 2131296327;
        public static final int async = 2131296431;
        public static final int blocking = 2131296572;
        public static final int chronometer = 2131297036;
        public static final int forever = 2131297802;
        public static final int ghost_view = 2131297974;
        public static final int icon = 2131298138;
        public static final int icon_group = 2131298145;
        public static final int info = 2131298278;
        public static final int italic = 2131298360;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int normal = 2131299387;
        public static final int notification_background = 2131299393;
        public static final int notification_main_column = 2131299394;
        public static final int notification_main_column_container = 2131299395;
        public static final int parent_matrix = 2131299494;
        public static final int right_icon = 2131299901;
        public static final int right_side = 2131299902;
        public static final int save_image_matrix = 2131300023;
        public static final int save_non_transition_alpha = 2131300024;
        public static final int save_scale_type = 2131300026;
        public static final int tag_transition_group = 2131300355;
        public static final int tag_unhandled_key_event_manager = 2131300356;
        public static final int tag_unhandled_key_listeners = 2131300357;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public static final int transition_current_scene = 2131300802;
        public static final int transition_layout_save = 2131300803;
        public static final int transition_position = 2131300804;
        public static final int transition_scene_layoutid_cache = 2131300805;
        public static final int transition_transform = 2131300806;

        public final loadInBackground MediaBrowserCompat$CustomActionResultReceiver(Context context, loadInBackground.write write) {
            boolean z = setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
            }
            if (z) {
                return new dispatchOnCancelled(context, write);
            }
            return new onDestroyView.IconCompatParcelizer();
        }
    }
}
