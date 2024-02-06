package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.onDestroyView$MediaBrowserCompat$CustomActionResultReceiver */
public final class onDestroyView$MediaBrowserCompat$CustomActionResultReceiver {
    public static final int abc_action_bar_content_inset_material = 2131165184;
    public static final int abc_action_bar_content_inset_with_nav = 2131165185;
    public static final int abc_action_bar_default_height_material = 2131165186;
    public static final int abc_action_bar_default_padding_end_material = 2131165187;
    public static final int abc_action_bar_default_padding_start_material = 2131165188;
    public static final int abc_action_bar_icon_vertical_padding_material = 2131165190;
    public static final int abc_action_bar_overflow_padding_end_material = 2131165191;
    public static final int abc_action_bar_overflow_padding_start_material = 2131165192;
    public static final int abc_action_bar_stacked_max_height = 2131165193;
    public static final int abc_action_bar_stacked_tab_max_width = 2131165194;
    public static final int abc_action_bar_subtitle_bottom_margin_material = 2131165195;
    public static final int abc_action_bar_subtitle_top_margin_material = 2131165196;
    public static final int abc_action_button_min_height_material = 2131165197;
    public static final int abc_action_button_min_width_material = 2131165198;
    public static final int abc_action_button_min_width_overflow_material = 2131165199;
    public static final int abc_alert_dialog_button_bar_height = 2131165200;
    public static final int abc_button_inset_horizontal_material = 2131165202;
    public static final int abc_button_inset_vertical_material = 2131165203;
    public static final int abc_button_padding_horizontal_material = 2131165204;
    public static final int abc_button_padding_vertical_material = 2131165205;
    public static final int abc_cascading_menus_min_smallest_width = 2131165206;
    public static final int abc_config_prefDialogWidth = 2131165207;
    public static final int abc_control_corner_material = 2131165208;
    public static final int abc_control_inset_material = 2131165209;
    public static final int abc_control_padding_material = 2131165210;
    public static final int abc_dialog_fixed_height_major = 2131165212;
    public static final int abc_dialog_fixed_height_minor = 2131165213;
    public static final int abc_dialog_fixed_width_major = 2131165214;
    public static final int abc_dialog_fixed_width_minor = 2131165215;
    public static final int abc_dialog_min_width_major = 2131165218;
    public static final int abc_dialog_min_width_minor = 2131165219;
    public static final int abc_dialog_padding_material = 2131165220;
    public static final int abc_dialog_padding_top_material = 2131165221;
    public static final int abc_disabled_alpha_material_dark = 2131165223;
    public static final int abc_disabled_alpha_material_light = 2131165224;
    public static final int abc_dropdownitem_icon_width = 2131165225;
    public static final int abc_dropdownitem_text_padding_left = 2131165226;
    public static final int abc_dropdownitem_text_padding_right = 2131165227;
    public static final int abc_edit_text_inset_bottom_material = 2131165228;
    public static final int abc_edit_text_inset_horizontal_material = 2131165229;
    public static final int abc_edit_text_inset_top_material = 2131165230;
    public static final int abc_floating_window_z = 2131165231;
    public static final int abc_list_item_padding_horizontal_material = 2131165232;
    public static final int abc_panel_menu_list_width = 2131165233;
    public static final int abc_progress_bar_height_material = 2131165234;
    public static final int abc_search_view_preferred_height = 2131165235;
    public static final int abc_search_view_preferred_width = 2131165236;
    public static final int abc_seekbar_track_background_height_material = 2131165237;
    public static final int abc_seekbar_track_progress_height_material = 2131165238;
    public static final int abc_select_dialog_padding_start_material = 2131165239;
    public static final int abc_switch_padding = 2131165240;
    public static final int abc_text_size_body_1_material = 2131165241;
    public static final int abc_text_size_body_2_material = 2131165242;
    public static final int abc_text_size_button_material = 2131165243;
    public static final int abc_text_size_caption_material = 2131165244;
    public static final int abc_text_size_display_1_material = 2131165245;
    public static final int abc_text_size_display_2_material = 2131165246;
    public static final int abc_text_size_display_3_material = 2131165247;
    public static final int abc_text_size_display_4_material = 2131165248;
    public static final int abc_text_size_headline_material = 2131165249;
    public static final int abc_text_size_large_material = 2131165250;
    public static final int abc_text_size_medium_material = 2131165251;
    public static final int abc_text_size_menu_header_material = 2131165252;
    public static final int abc_text_size_menu_material = 2131165253;
    public static final int abc_text_size_small_material = 2131165254;
    public static final int abc_text_size_subhead_material = 2131165255;
    public static final int abc_text_size_subtitle_material_toolbar = 2131165256;
    public static final int abc_text_size_title_material = 2131165257;
    public static final int abc_text_size_title_material_toolbar = 2131165258;
    public static final int design_appbar_elevation = 2131165481;
    public static final int design_bottom_sheet_modal_elevation = 2131165493;
    public static final int design_fab_border_width = 2131165495;
    public static final int design_fab_elevation = 2131165496;
    public static final int design_fab_image_size = 2131165497;
    public static final int design_fab_size_mini = 2131165498;
    public static final int design_fab_size_normal = 2131165499;
    public static final int design_fab_translation_z_pressed = 2131165501;
    public static final int design_navigation_elevation = 2131165502;
    public static final int design_navigation_icon_padding = 2131165503;
    public static final int design_navigation_icon_size = 2131165504;
    public static final int design_navigation_max_width = 2131165507;
    public static final int design_navigation_padding_bottom = 2131165508;
    public static final int design_navigation_separator_vertical_padding = 2131165509;
    public static final int design_snackbar_action_inline_max_width = 2131165510;
    public static final int design_snackbar_background_corner_radius = 2131165511;
    public static final int design_snackbar_elevation = 2131165512;
    public static final int design_snackbar_extra_spacing_horizontal = 2131165513;
    public static final int design_snackbar_max_width = 2131165514;
    public static final int design_snackbar_min_width = 2131165515;
    public static final int design_snackbar_padding_horizontal = 2131165516;
    public static final int design_snackbar_padding_vertical = 2131165517;
    public static final int design_snackbar_padding_vertical_2lines = 2131165518;
    public static final int design_snackbar_text_size = 2131165519;
    public static final int design_tab_max_width = 2131165520;
    public static final int design_tab_scrollable_min_width = 2131165521;
    public static final int design_tab_text_size = 2131165522;
    public static final int design_tab_text_size_2line = 2131165523;
    public static final int disabled_alpha_material_dark = 2131165527;
    public static final int disabled_alpha_material_light = 2131165528;
    public static final int highlight_alpha_material_colored = 2131165566;
    public static final int highlight_alpha_material_dark = 2131165567;
    public static final int highlight_alpha_material_light = 2131165568;
    public static final int item_touch_helper_max_drag_scroll_per_frame = 2131165599;
    public static final int item_touch_helper_swipe_escape_max_velocity = 2131165600;
    public static final int item_touch_helper_swipe_escape_velocity = 2131165601;
    public static final int notification_large_icon_height = 2131165793;
    public static final int notification_large_icon_width = 2131165794;
    public static final int notification_subtext_size = 2131165801;
    public boolean IconCompatParcelizer;
    public final Set<commitContentChanged> MediaBrowserCompat$CustomActionResultReceiver = Collections.newSetFromMap(new WeakHashMap());
    public final List<commitContentChanged> read = new ArrayList();

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(commitContentChanged commitcontentchanged) {
        boolean z = true;
        if (commitcontentchanged == null) {
            return true;
        }
        boolean remove = this.MediaBrowserCompat$CustomActionResultReceiver.remove(commitcontentchanged);
        if (!this.read.remove(commitcontentchanged) && !remove) {
            z = false;
        }
        if (z) {
            commitcontentchanged.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.size());
        sb.append(", isPaused=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
