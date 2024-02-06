package p040o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p040o.Iterables;
import p040o.ZHEMM;
import p040o.nAllocationGetStride;

/* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment */
public final class FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment {
    public final List<zzge$zzh$zza$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer = new ArrayList();

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$read */
    public static final class read {
        public static final int abc_action_bar_embed_tabs = 2131034112;
        public static final int abc_allow_stacked_button_bar = 2131034113;
        public static final int abc_config_actionMenuItemAllCaps = 2131034114;
        public static final int mtrl_btn_textappearance_all_caps = 2131034117;
        public static final int th_boolean_is_tablet = 2131034118;
        public static final int th_pokerchip_center = 2131034119;
        public int MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final int abc_action_bar_content_inset_material = 2131165184;
        public static final int abc_action_bar_content_inset_with_nav = 2131165185;
        public static final int abc_action_bar_default_height_material = 2131165186;
        public static final int abc_action_bar_default_padding_end_material = 2131165187;
        public static final int abc_action_bar_default_padding_start_material = 2131165188;
        public static final int abc_action_bar_elevation_material = 2131165189;
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
        public static final int abc_alert_dialog_button_dimen = 2131165201;
        public static final int abc_button_inset_horizontal_material = 2131165202;
        public static final int abc_button_inset_vertical_material = 2131165203;
        public static final int abc_button_padding_horizontal_material = 2131165204;
        public static final int abc_button_padding_vertical_material = 2131165205;
        public static final int abc_cascading_menus_min_smallest_width = 2131165206;
        public static final int abc_config_prefDialogWidth = 2131165207;
        public static final int abc_control_corner_material = 2131165208;
        public static final int abc_control_inset_material = 2131165209;
        public static final int abc_control_padding_material = 2131165210;
        public static final int abc_dialog_corner_radius_material = 2131165211;
        public static final int abc_dialog_fixed_height_major = 2131165212;
        public static final int abc_dialog_fixed_height_minor = 2131165213;
        public static final int abc_dialog_fixed_width_major = 2131165214;
        public static final int abc_dialog_fixed_width_minor = 2131165215;
        public static final int abc_dialog_list_padding_bottom_no_buttons = 2131165216;
        public static final int abc_dialog_list_padding_top_no_title = 2131165217;
        public static final int abc_dialog_min_width_major = 2131165218;
        public static final int abc_dialog_min_width_minor = 2131165219;
        public static final int abc_dialog_padding_material = 2131165220;
        public static final int abc_dialog_padding_top_material = 2131165221;
        public static final int abc_dialog_title_divider_material = 2131165222;
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
        public static final int browser_actions_context_menu_max_width = 2131165286;
        public static final int browser_actions_context_menu_min_padding = 2131165287;
        public static final int cardview_compat_inset_shadow = 2131165300;
        public static final int cardview_default_elevation = 2131165301;
        public static final int cardview_default_radius = 2131165302;
        public static final int compat_button_inset_horizontal_material = 2131165317;
        public static final int compat_button_inset_vertical_material = 2131165318;
        public static final int compat_button_padding_horizontal_material = 2131165319;
        public static final int compat_button_padding_vertical_material = 2131165320;
        public static final int compat_control_corner_material = 2131165321;
        public static final int compat_notification_large_icon_max_height = 2131165322;
        public static final int compat_notification_large_icon_max_width = 2131165323;
        public static final int design_appbar_elevation = 2131165481;
        public static final int design_bottom_navigation_active_item_max_width = 2131165482;
        public static final int design_bottom_navigation_active_item_min_width = 2131165483;
        public static final int design_bottom_navigation_active_text_size = 2131165484;
        public static final int design_bottom_navigation_elevation = 2131165485;
        public static final int design_bottom_navigation_height = 2131165486;
        public static final int design_bottom_navigation_icon_size = 2131165487;
        public static final int design_bottom_navigation_item_max_width = 2131165488;
        public static final int design_bottom_navigation_item_min_width = 2131165489;
        public static final int design_bottom_navigation_margin = 2131165490;
        public static final int design_bottom_navigation_shadow_height = 2131165491;
        public static final int design_bottom_navigation_text_size = 2131165492;
        public static final int design_bottom_sheet_modal_elevation = 2131165493;
        public static final int design_bottom_sheet_peek_height_min = 2131165494;
        public static final int design_fab_border_width = 2131165495;
        public static final int design_fab_elevation = 2131165496;
        public static final int design_fab_image_size = 2131165497;
        public static final int design_fab_size_mini = 2131165498;
        public static final int design_fab_size_normal = 2131165499;
        public static final int design_fab_translation_z_hovered_focused = 2131165500;
        public static final int design_fab_translation_z_pressed = 2131165501;
        public static final int design_navigation_elevation = 2131165502;
        public static final int design_navigation_icon_padding = 2131165503;
        public static final int design_navigation_icon_size = 2131165504;
        public static final int design_navigation_item_horizontal_padding = 2131165505;
        public static final int design_navigation_item_icon_padding = 2131165506;
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
        public static final int design_textinput_caption_translate_y = 2131165524;
        public static final int disabled_alpha_material_dark = 2131165527;
        public static final int disabled_alpha_material_light = 2131165528;
        public static final int fastscroll_default_thickness = 2131165554;
        public static final int fastscroll_margin = 2131165555;
        public static final int fastscroll_minimum_range = 2131165556;
        public static final int highlight_alpha_material_colored = 2131165566;
        public static final int highlight_alpha_material_dark = 2131165567;
        public static final int highlight_alpha_material_light = 2131165568;
        public static final int hint_alpha_material_dark = 2131165569;
        public static final int hint_alpha_material_light = 2131165570;
        public static final int hint_pressed_alpha_material_dark = 2131165571;
        public static final int hint_pressed_alpha_material_light = 2131165572;
        public static final int item_touch_helper_max_drag_scroll_per_frame = 2131165599;
        public static final int item_touch_helper_swipe_escape_max_velocity = 2131165600;
        public static final int item_touch_helper_swipe_escape_velocity = 2131165601;
        public static final int mtrl_bottomappbar_fabOffsetEndMode = 2131165737;
        public static final int mtrl_bottomappbar_fab_cradle_margin = 2131165738;
        public static final int mtrl_bottomappbar_fab_cradle_rounded_corner_radius = 2131165739;
        public static final int mtrl_bottomappbar_fab_cradle_vertical_offset = 2131165740;
        public static final int mtrl_bottomappbar_height = 2131165741;
        public static final int mtrl_btn_corner_radius = 2131165742;
        public static final int mtrl_btn_dialog_btn_min_width = 2131165743;
        public static final int mtrl_btn_disabled_elevation = 2131165744;
        public static final int mtrl_btn_disabled_z = 2131165745;
        public static final int mtrl_btn_elevation = 2131165746;
        public static final int mtrl_btn_focused_z = 2131165747;
        public static final int mtrl_btn_hovered_z = 2131165748;
        public static final int mtrl_btn_icon_btn_padding_left = 2131165749;
        public static final int mtrl_btn_icon_padding = 2131165750;
        public static final int mtrl_btn_inset = 2131165751;
        public static final int mtrl_btn_letter_spacing = 2131165752;
        public static final int mtrl_btn_padding_bottom = 2131165753;
        public static final int mtrl_btn_padding_left = 2131165754;
        public static final int mtrl_btn_padding_right = 2131165755;
        public static final int mtrl_btn_padding_top = 2131165756;
        public static final int mtrl_btn_pressed_z = 2131165757;
        public static final int mtrl_btn_stroke_size = 2131165758;
        public static final int mtrl_btn_text_btn_icon_padding = 2131165759;
        public static final int mtrl_btn_text_btn_padding_left = 2131165760;
        public static final int mtrl_btn_text_btn_padding_right = 2131165761;
        public static final int mtrl_btn_text_size = 2131165762;
        public static final int mtrl_btn_z = 2131165763;
        public static final int mtrl_card_elevation = 2131165764;
        public static final int mtrl_card_spacing = 2131165765;
        public static final int mtrl_chip_pressed_translation_z = 2131165766;
        public static final int mtrl_chip_text_size = 2131165767;
        public static final int mtrl_fab_elevation = 2131165768;
        public static final int mtrl_fab_translation_z_hovered_focused = 2131165769;
        public static final int mtrl_fab_translation_z_pressed = 2131165770;
        public static final int mtrl_navigation_elevation = 2131165771;
        public static final int mtrl_navigation_item_horizontal_padding = 2131165772;
        public static final int mtrl_navigation_item_icon_padding = 2131165773;
        public static final int mtrl_snackbar_background_corner_radius = 2131165774;
        public static final int mtrl_snackbar_margin = 2131165775;
        public static final int mtrl_textinput_box_bottom_offset = 2131165776;
        public static final int mtrl_textinput_box_corner_radius_medium = 2131165777;
        public static final int mtrl_textinput_box_corner_radius_small = 2131165778;
        public static final int mtrl_textinput_box_label_cutout_padding = 2131165779;
        public static final int mtrl_textinput_box_padding_end = 2131165780;
        public static final int mtrl_textinput_box_stroke_width_default = 2131165781;
        public static final int mtrl_textinput_box_stroke_width_focused = 2131165782;
        public static final int mtrl_textinput_outline_box_expanded_padding = 2131165783;
        public static final int mtrl_toolbar_default_height = 2131165784;
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
        public static final int subtitle_corner_radius = 2131165905;
        public static final int subtitle_outline_width = 2131165906;
        public static final int subtitle_shadow_offset = 2131165907;
        public static final int subtitle_shadow_radius = 2131165908;
        public static final int th_activity_vertical_margin = 2131165926;
        public static final int th_admin_button_icon_left_scale_factor = 2131165927;
        public static final int th_admin_button_icon_right_scale_factor = 2131165928;
        public static final int th_admin_control_height = 2131165929;
        public static final int th_admin_control_margin_top = 2131165930;
        public static final int th_button_drawable_left_scale_factor = 2131165931;
        public static final int th_button_drawable_padding = 2131165932;
        public static final int th_button_drawable_right_scale_factor = 2131165933;
        public static final int th_button_list_padding_left = 2131165934;
        public static final int th_button_list_padding_right = 2131165935;
        public static final int th_button_margin_top = 2131165936;
        public static final int th_button_raised_corner_radius = 2131165937;
        public static final int th_dialog_logo = 2131165938;
        public static final int th_dialog_min_width = 2131165939;
        public static final int th_divider_height = 2131165940;
        public static final int th_global_left = 2131165941;
        public static final int th_global_right = 2131165942;
        public static final int th_interaction_name_dialog_edit_text_margins = 2131165943;
        public static final int th_login_activity_margin = 2131165944;
        public static final int th_login_linear_layout_bottom_padding = 2131165945;
        public static final int th_login_logo = 2131165946;
        public static final int th_login_logo_right_margin = 2131165947;
        public static final int th_logo_margin_top = 2131165948;
        public static final int th_menu_item_height = 2131165949;
        public static final int th_menu_item_width = 2131165950;
        public static final int th_password_margin_top = 2131165951;
        public static final int th_pokerchip_height = 2131165952;
        public static final int th_pokerchip_padding_bottom = 2131165953;
        public static final int th_pokerchip_padding_left = 2131165954;
        public static final int th_pokerchip_padding_right = 2131165955;
        public static final int th_pokerchip_padding_top = 2131165956;
        public static final int th_pokerchip_text_default = 2131165957;
        public static final int th_pokerchip_text_launchpad = 2131165958;
        public static final int th_pokerchip_text_live = 2131165959;
        public static final int th_pokerchip_text_works = 2131165960;
        public static final int th_pokerchip_width = 2131165961;
        public static final int th_popover_icon = 2131165962;
        public static final int th_popover_icon_height = 2131165963;
        public static final int th_popover_icon_width = 2131165964;
        public static final int th_popover_listitem_caption = 2131165965;
        public static final int th_popover_listitem_text = 2131165966;
        public static final int th_popover_radio_button_drawable_left_scale_factor = 2131165967;
        public static final int th_popover_radio_button_drawable_right_scale_factor = 2131165968;
        public static final int th_popover_radio_button_padding_left = 2131165969;
        public static final int th_popover_radio_button_padding_right = 2131165970;
        public static final int th_popover_width = 2131165971;
        public static final int th_preview_bottom_list_item_height = 2131165972;
        public static final int th_preview_bottom_list_item_icon_padding = 2131165973;
        public static final int th_preview_bottom_list_item_line_height_extra = 2131165974;
        public static final int th_preview_bottom_list_item_padding_left = 2131165975;
        public static final int th_preview_bottom_panel_height = 2131165976;
        public static final int th_preview_icon_point = 2131165977;
        public static final int th_radio_button_drawable_left_scale_factor = 2131165978;
        public static final int th_radio_button_drawable_padding = 2131165979;
        public static final int th_radio_button_drawable_right_scale_factor = 2131165980;
        public static final int th_radio_button_min_height = 2131165981;
        public static final int th_radio_button_min_width = 2131165982;
        public static final int th_radio_button_padding_left = 2131165983;
        public static final int th_radio_button_padding_right = 2131165984;
        public static final int th_search_background_alpha = 2131165985;
        public static final int th_switch_list_padding_left = 2131165986;
        public static final int th_switch_list_padding_right = 2131165987;
        public static final int th_switcher_margin_top = 2131165988;
        public static final int th_text = 2131165989;
        public static final int th_text_caption = 2131165990;
        public static final int th_text_drawable_left_scale_factor = 2131165991;
        public static final int th_text_drawable_right_scale_factor = 2131165992;
        public static final int th_text_header = 2131165993;
        public static final int th_text_icon = 2131165994;
        public static final int th_text_menu = 2131165995;
        public static final int th_username_margin_top = 2131165996;
        public static final int th_view_list_item_checkable_height = 2131165997;
        public static final int tooltip_corner_radius = 2131166004;
        public static final int tooltip_horizontal_padding = 2131166005;
        public static final int tooltip_margin = 2131166006;
        public static final int tooltip_precise_anchor_extra_offset = 2131166007;
        public static final int tooltip_precise_anchor_threshold = 2131166008;
        public static final int tooltip_vertical_padding = 2131166009;
        public static final int tooltip_y_offset_non_touch = 2131166010;
        public static final int tooltip_y_offset_touch = 2131166011;
        public int write;
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$write */
    public static final class write {
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
        public static final int browser_actions_bg_grey = 2131099697;
        public static final int browser_actions_divider_color = 2131099698;
        public static final int browser_actions_text_color = 2131099699;
        public static final int browser_actions_title_color = 2131099700;
        public static final int button_material_dark = 2131099701;
        public static final int button_material_light = 2131099702;
        public static final int cardview_dark_background = 2131099705;
        public static final int cardview_light_background = 2131099706;
        public static final int cardview_shadow_end_color = 2131099707;
        public static final int cardview_shadow_start_color = 2131099708;
        public static final int common_google_signin_btn_text_dark = 2131099717;
        public static final int common_google_signin_btn_text_dark_default = 2131099718;
        public static final int common_google_signin_btn_text_dark_disabled = 2131099719;
        public static final int common_google_signin_btn_text_dark_focused = 2131099720;
        public static final int common_google_signin_btn_text_dark_pressed = 2131099721;
        public static final int common_google_signin_btn_text_light = 2131099722;
        public static final int common_google_signin_btn_text_light_default = 2131099723;
        public static final int common_google_signin_btn_text_light_disabled = 2131099724;
        public static final int common_google_signin_btn_text_light_focused = 2131099725;
        public static final int common_google_signin_btn_text_light_pressed = 2131099726;
        public static final int common_google_signin_btn_tint = 2131099727;
        public static final int design_bottom_navigation_shadow_color = 2131099738;
        public static final int design_default_color_primary = 2131099739;
        public static final int design_default_color_primary_dark = 2131099740;
        public static final int design_error = 2131099741;
        public static final int design_fab_shadow_end_color = 2131099742;
        public static final int design_fab_shadow_mid_color = 2131099743;
        public static final int design_fab_shadow_start_color = 2131099744;
        public static final int design_fab_stroke_end_inner_color = 2131099745;
        public static final int design_fab_stroke_end_outer_color = 2131099746;
        public static final int design_fab_stroke_top_inner_color = 2131099747;
        public static final int design_fab_stroke_top_outer_color = 2131099748;
        public static final int design_snackbar_background_color = 2131099749;
        public static final int design_tint_password_toggle = 2131099750;
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
        public static final int mtrl_bottom_nav_colored_item_tint = 2131099819;
        public static final int mtrl_bottom_nav_item_tint = 2131099820;
        public static final int mtrl_btn_bg_color_disabled = 2131099821;
        public static final int mtrl_btn_bg_color_selector = 2131099822;
        public static final int mtrl_btn_ripple_color = 2131099823;
        public static final int mtrl_btn_stroke_color_selector = 2131099824;
        public static final int mtrl_btn_text_btn_ripple_color = 2131099825;
        public static final int mtrl_btn_text_color_disabled = 2131099826;
        public static final int mtrl_btn_text_color_selector = 2131099827;
        public static final int mtrl_btn_transparent_bg_color = 2131099828;
        public static final int mtrl_chip_background_color = 2131099829;
        public static final int mtrl_chip_close_icon_tint = 2131099830;
        public static final int mtrl_chip_ripple_color = 2131099831;
        public static final int mtrl_chip_text_color = 2131099832;
        public static final int mtrl_fab_ripple_color = 2131099833;
        public static final int mtrl_scrim_color = 2131099834;
        public static final int mtrl_tabs_colored_ripple_color = 2131099835;
        public static final int mtrl_tabs_icon_color_selector = 2131099836;
        public static final int mtrl_tabs_icon_color_selector_colored = 2131099837;
        public static final int mtrl_tabs_legacy_text_color_selector = 2131099838;
        public static final int mtrl_tabs_ripple_color = 2131099839;
        public static final int mtrl_text_btn_text_color_selector = 2131099840;
        public static final int mtrl_textinput_default_box_stroke_color = 2131099841;
        public static final int mtrl_textinput_disabled_color = 2131099842;
        public static final int mtrl_textinput_filled_box_default_background_color = 2131099843;
        public static final int mtrl_textinput_hovered_box_stroke_color = 2131099844;
        public static final int notification_action_color_filter = 2131099848;
        public static final int notification_icon_bg_color = 2131099849;
        public static final int notification_material_background_media_default_color = 2131099850;
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
        public static final int th_admin_screen_button_background = 2131099910;
        public static final int th_admin_screen_button_background_disabled = 2131099911;
        public static final int th_admin_screen_button_background_pressed = 2131099912;
        public static final int th_admin_screen_button_special = 2131099913;
        public static final int th_admin_screen_button_text = 2131099914;
        public static final int th_admin_screen_button_text_disabled = 2131099915;
        public static final int th_admin_screen_button_text_pressed = 2131099916;
        public static final int th_admin_screen_button_text_statelist = 2131099917;
        public static final int th_admin_screen_point_data_configured = 2131099918;
        public static final int th_admin_screen_point_data_unconfigured = 2131099919;
        public static final int th_dark_action_bar_subtitle = 2131099920;
        public static final int th_dark_action_bar_title = 2131099921;
        public static final int th_dark_background = 2131099922;
        public static final int th_dark_background_alt = 2131099923;
        public static final int th_dark_background_checked = 2131099924;
        public static final int th_dark_background_disabled = 2131099925;
        public static final int th_dark_background_pressed = 2131099926;
        public static final int th_dark_button_flat_background = 2131099927;
        public static final int th_dark_button_flat_background_disabled = 2131099928;
        public static final int th_dark_button_flat_background_pressed = 2131099929;
        public static final int th_dark_button_flat_text = 2131099930;
        public static final int th_dark_button_flat_text_disabled = 2131099931;
        public static final int th_dark_button_flat_text_pressed = 2131099932;
        public static final int th_dark_button_flat_text_statelist = 2131099933;
        public static final int th_dark_button_list_background = 2131099934;
        public static final int th_dark_button_list_background_disabled = 2131099935;
        public static final int th_dark_button_list_background_pressed = 2131099936;
        public static final int th_dark_button_list_text = 2131099937;
        public static final int th_dark_button_list_text_disabled = 2131099938;
        public static final int th_dark_button_list_text_pressed = 2131099939;
        public static final int th_dark_button_list_text_statelist = 2131099940;
        public static final int th_dark_button_raised_background = 2131099941;
        public static final int th_dark_button_raised_background_disabled = 2131099942;
        public static final int th_dark_button_raised_background_pressed = 2131099943;
        public static final int th_dark_button_raised_text = 2131099944;
        public static final int th_dark_button_raised_text_disabled = 2131099945;
        public static final int th_dark_button_raised_text_pressed = 2131099946;
        public static final int th_dark_button_raised_text_statelist = 2131099947;
        public static final int th_dark_color_accent = 2131099948;
        public static final int th_dark_color_control_activated = 2131099949;
        public static final int th_dark_color_control_highlight = 2131099950;
        public static final int th_dark_color_control_normal = 2131099951;
        public static final int th_dark_color_primary = 2131099952;
        public static final int th_dark_color_primary_dark = 2131099953;
        public static final int th_dark_dialog_alert_background = 2131099954;
        public static final int th_dark_divider = 2131099955;
        public static final int th_dark_edittext = 2131099956;
        public static final int th_dark_edittext_drawable_left_search = 2131099957;
        public static final int th_dark_edittext_drawable_right = 2131099958;
        public static final int th_dark_edittext_hint = 2131099959;
        public static final int th_dark_edittext_hint_disabled = 2131099960;
        public static final int th_dark_edittext_hint_statelist = 2131099961;
        public static final int th_dark_edittext_text_statelist = 2131099962;
        public static final int th_dark_icon_more = 2131099963;
        public static final int th_dark_icon_success = 2131099964;
        public static final int th_dark_menu_item = 2131099965;
        public static final int th_dark_menu_item_disabled = 2131099966;
        public static final int th_dark_menu_item_statelist = 2131099967;
        public static final int th_dark_progressbar_indicator = 2131099968;
        public static final int th_dark_radio_button_background_checked = 2131099969;
        public static final int th_dark_radio_button_background_unchecked = 2131099970;
        public static final int th_dark_radio_button_flat_background_checked = 2131099971;
        public static final int th_dark_radio_button_flat_background_unchecked = 2131099972;
        public static final int th_dark_radio_button_flat_text_checked = 2131099973;
        public static final int th_dark_radio_button_flat_text_statelist = 2131099974;
        public static final int th_dark_radio_button_flat_text_unchecked = 2131099975;
        public static final int th_dark_radio_button_icon_button_tint_checked = 2131099976;
        public static final int th_dark_radio_button_icon_button_tint_unchecked = 2131099977;
        public static final int th_dark_radio_button_icon_tint_statelist = 2131099978;
        public static final int th_dark_radio_button_list_background_checked = 2131099979;
        public static final int th_dark_radio_button_list_background_unchecked = 2131099980;
        public static final int th_dark_radio_button_list_text_checked = 2131099981;
        public static final int th_dark_radio_button_list_text_statelist = 2131099982;
        public static final int th_dark_radio_button_list_text_unchecked = 2131099983;
        public static final int th_dark_radio_button_raised_background_checked = 2131099984;
        public static final int th_dark_radio_button_raised_background_unchecked = 2131099985;
        public static final int th_dark_radio_button_raised_text_checked = 2131099986;
        public static final int th_dark_radio_button_raised_text_statelist = 2131099987;
        public static final int th_dark_radio_button_raised_text_unchecked = 2131099988;
        public static final int th_dark_radio_button_tab_background_checked = 2131099989;
        public static final int th_dark_radio_button_tab_background_unchecked = 2131099990;
        public static final int th_dark_radio_button_tab_background_underline_checked = 2131099991;
        public static final int th_dark_radio_button_tab_text_checked = 2131099992;
        public static final int th_dark_radio_button_tab_text_statelist = 2131099993;
        public static final int th_dark_radio_button_tab_text_unchecked = 2131099994;
        public static final int th_dark_radio_button_text_checked = 2131099995;
        public static final int th_dark_radio_button_text_statelist = 2131099996;
        public static final int th_dark_radio_button_text_unchecked = 2131099997;
        public static final int th_dark_radiogroup_raised_border = 2131099998;
        public static final int th_dark_switch_background = 2131099999;
        public static final int th_dark_switch_background_active = 2131100000;
        public static final int th_dark_switch_background_disabled = 2131100001;
        public static final int th_dark_switch_button = 2131100002;
        public static final int th_dark_switch_button_active = 2131100003;
        public static final int th_dark_switch_button_disabled = 2131100004;
        public static final int th_dark_switch_list_text = 2131100005;
        public static final int th_dark_switch_list_text_background = 2131100006;
        public static final int th_dark_switch_list_text_background_disabled = 2131100007;
        public static final int th_dark_switch_list_text_background_pressed = 2131100008;
        public static final int th_dark_switch_list_text_disabled = 2131100009;
        public static final int th_dark_switch_list_text_pressed = 2131100010;
        public static final int th_dark_switch_list_text_statelist = 2131100011;
        public static final int th_dark_switch_text_statelist = 2131100012;
        public static final int th_dark_switch_thumb_statelist = 2131100013;
        public static final int th_dark_switch_track_statelist = 2131100014;
        public static final int th_dark_tab_background = 2131100015;
        public static final int th_dark_tab_background_checked = 2131100016;
        public static final int th_dark_tab_border = 2131100017;
        public static final int th_dark_tab_border_checked = 2131100018;
        public static final int th_dark_tab_text = 2131100019;
        public static final int th_dark_tab_text_checked = 2131100020;
        public static final int th_dark_text = 2131100021;
        public static final int th_dark_text_caption = 2131100022;
        public static final int th_dark_text_caption_checked = 2131100023;
        public static final int th_dark_text_caption_disabled = 2131100024;
        public static final int th_dark_text_caption_pressed = 2131100025;
        public static final int th_dark_text_checked = 2131100026;
        public static final int th_dark_text_disabled = 2131100027;
        public static final int th_dark_text_pressed = 2131100028;
        public static final int th_dialog_logo = 2131100029;
        public static final int th_highlight_light_blue = 2131100030;
        public static final int th_highlight_light_blue_alpha_20 = 2131100031;
        public static final int th_highlight_light_green_a700 = 2131100032;
        public static final int th_highlight_light_green_a700_alpha_20 = 2131100033;
        public static final int th_highlight_orange_700 = 2131100034;
        public static final int th_highlight_orange_700_alpha_20 = 2131100035;
        public static final int th_icon_boolean = 2131100036;
        public static final int th_icon_numeric = 2131100037;
        public static final int th_icon_symbolic = 2131100038;
        public static final int th_is_background = 2131100039;
        public static final int th_is_background_alt_inverse = 2131100040;
        public static final int th_is_background_brand_primary = 2131100041;
        public static final int th_is_background_brand_primary_active = 2131100042;
        public static final int th_is_background_input = 2131100043;
        public static final int th_is_background_input_checkbox_disabled = 2131100044;
        public static final int th_is_background_input_checkbox_selected = 2131100045;
        public static final int th_is_background_input_disabled = 2131100046;
        public static final int th_is_background_inverse = 2131100047;
        public static final int th_is_background_scrollbar_track = 2131100048;
        public static final int th_is_background_shade_dark = 2131100049;
        public static final int th_is_background_success = 2131100050;
        public static final int th_is_background_toggle = 2131100051;
        public static final int th_is_background_toggle_active = 2131100052;
        public static final int th_is_background_toggle_disabled = 2131100053;
        public static final int th_is_border_input = 2131100054;
        public static final int th_is_border_input_active = 2131100055;
        public static final int th_is_border_input_disabled = 2131100056;
        public static final int th_is_border_separator_alt_2 = 2131100057;
        public static final int th_is_border_separator_inverse = 2131100058;
        public static final int th_is_border_tab_selected = 2131100059;
        public static final int th_is_brand = 2131100060;
        public static final int th_is_brand_dark = 2131100061;
        public static final int th_is_brand_darker = 2131100062;
        public static final int th_is_button_background_primary = 2131100063;
        public static final int th_is_button_text_primary = 2131100064;
        public static final int th_is_contrast_secondary = 2131100065;
        public static final int th_is_foreground_primary = 2131100066;
        public static final int th_is_stroke_header_button = 2131100067;
        public static final int th_is_text_action_label = 2131100068;
        public static final int th_is_text_brand_primary = 2131100069;
        public static final int th_is_text_button_default = 2131100070;
        public static final int th_is_text_button_default_disabled = 2131100071;
        public static final int th_is_text_default = 2131100072;
        public static final int th_is_text_icon_inverse = 2131100073;
        public static final int th_is_text_input_disabled = 2131100074;
        public static final int th_is_text_input_icon = 2131100075;
        public static final int th_is_text_link_inverse_disabled = 2131100076;
        public static final int th_is_text_link_primary = 2131100077;
        public static final int th_is_text_link_primary_focus = 2131100078;
        public static final int th_is_text_placeholder = 2131100079;
        public static final int th_is_text_tab_label_selected = 2131100080;
        public static final int th_is_text_tertiary = 2131100081;
        public static final int th_light_action_bar_subtitle = 2131100082;
        public static final int th_light_action_bar_title = 2131100083;
        public static final int th_light_background = 2131100084;
        public static final int th_light_background_alt = 2131100085;
        public static final int th_light_background_checked = 2131100086;
        public static final int th_light_background_disabled = 2131100087;
        public static final int th_light_background_pressed = 2131100088;
        public static final int th_light_button_flat_background = 2131100089;
        public static final int th_light_button_flat_background_disabled = 2131100090;
        public static final int th_light_button_flat_background_pressed = 2131100091;
        public static final int th_light_button_flat_text = 2131100092;
        public static final int th_light_button_flat_text_disabled = 2131100093;
        public static final int th_light_button_flat_text_pressed = 2131100094;
        public static final int th_light_button_flat_text_statelist = 2131100095;
        public static final int th_light_button_list_background = 2131100096;
        public static final int th_light_button_list_background_disabled = 2131100097;
        public static final int th_light_button_list_background_pressed = 2131100098;
        public static final int th_light_button_list_text = 2131100099;
        public static final int th_light_button_list_text_disabled = 2131100100;
        public static final int th_light_button_list_text_pressed = 2131100101;
        public static final int th_light_button_list_text_statelist = 2131100102;
        public static final int th_light_button_raised_background = 2131100103;
        public static final int th_light_button_raised_background_disabled = 2131100104;
        public static final int th_light_button_raised_background_pressed = 2131100105;
        public static final int th_light_button_raised_text = 2131100106;
        public static final int th_light_button_raised_text_disabled = 2131100107;
        public static final int th_light_button_raised_text_pressed = 2131100108;
        public static final int th_light_button_raised_text_statelist = 2131100109;
        public static final int th_light_color_accent = 2131100110;
        public static final int th_light_color_control_activated = 2131100111;
        public static final int th_light_color_control_highlight = 2131100112;
        public static final int th_light_color_control_normal = 2131100113;
        public static final int th_light_color_primary = 2131100114;
        public static final int th_light_color_primary_dark = 2131100115;
        public static final int th_light_dialog_alert_background = 2131100116;
        public static final int th_light_divider = 2131100117;
        public static final int th_light_edittext = 2131100118;
        public static final int th_light_edittext_drawable_left_search = 2131100119;
        public static final int th_light_edittext_drawable_right = 2131100120;
        public static final int th_light_edittext_hint = 2131100121;
        public static final int th_light_edittext_hint_disabled = 2131100122;
        public static final int th_light_edittext_hint_statelist = 2131100123;
        public static final int th_light_edittext_text_statelist = 2131100124;
        public static final int th_light_icon_more = 2131100125;
        public static final int th_light_icon_success = 2131100126;
        public static final int th_light_menu_item = 2131100127;
        public static final int th_light_menu_item_disabled = 2131100128;
        public static final int th_light_menu_item_statelist = 2131100129;
        public static final int th_light_progressbar_indicator = 2131100130;
        public static final int th_light_radio_button_background_checked = 2131100131;
        public static final int th_light_radio_button_background_unchecked = 2131100132;
        public static final int th_light_radio_button_flat_background_checked = 2131100133;
        public static final int th_light_radio_button_flat_background_unchecked = 2131100134;
        public static final int th_light_radio_button_flat_text_checked = 2131100135;
        public static final int th_light_radio_button_flat_text_statelist = 2131100136;
        public static final int th_light_radio_button_flat_text_unchecked = 2131100137;
        public static final int th_light_radio_button_icon_button_tint_checked = 2131100138;
        public static final int th_light_radio_button_icon_button_tint_unchecked = 2131100139;
        public static final int th_light_radio_button_icon_tint_statelist = 2131100140;
        public static final int th_light_radio_button_list_background_checked = 2131100141;
        public static final int th_light_radio_button_list_background_unchecked = 2131100142;
        public static final int th_light_radio_button_list_text_checked = 2131100143;
        public static final int th_light_radio_button_list_text_statelist = 2131100144;
        public static final int th_light_radio_button_list_text_unchecked = 2131100145;
        public static final int th_light_radio_button_raised_background_checked = 2131100146;
        public static final int th_light_radio_button_raised_background_unchecked = 2131100147;
        public static final int th_light_radio_button_raised_text_checked = 2131100148;
        public static final int th_light_radio_button_raised_text_statelist = 2131100149;
        public static final int th_light_radio_button_raised_text_unchecked = 2131100150;
        public static final int th_light_radio_button_tab_background_checked = 2131100151;
        public static final int th_light_radio_button_tab_background_unchecked = 2131100152;
        public static final int th_light_radio_button_tab_background_underline_checked = 2131100153;
        public static final int th_light_radio_button_tab_text_checked = 2131100154;
        public static final int th_light_radio_button_tab_text_statelist = 2131100155;
        public static final int th_light_radio_button_tab_text_unchecked = 2131100156;
        public static final int th_light_radio_button_text_checked = 2131100157;
        public static final int th_light_radio_button_text_statelist = 2131100158;
        public static final int th_light_radio_button_text_unchecked = 2131100159;
        public static final int th_light_radiogroup_raised_border = 2131100160;
        public static final int th_light_switch_background = 2131100161;
        public static final int th_light_switch_background_active = 2131100162;
        public static final int th_light_switch_background_disabled = 2131100163;
        public static final int th_light_switch_button = 2131100164;
        public static final int th_light_switch_button_active = 2131100165;
        public static final int th_light_switch_button_disabled = 2131100166;
        public static final int th_light_switch_list_text = 2131100167;
        public static final int th_light_switch_list_text_background = 2131100168;
        public static final int th_light_switch_list_text_background_disabled = 2131100169;
        public static final int th_light_switch_list_text_background_pressed = 2131100170;
        public static final int th_light_switch_list_text_disabled = 2131100171;
        public static final int th_light_switch_list_text_pressed = 2131100172;
        public static final int th_light_switch_list_text_statelist = 2131100173;
        public static final int th_light_switch_text_statelist = 2131100174;
        public static final int th_light_switch_thumb_statelist = 2131100175;
        public static final int th_light_switch_track_statelist = 2131100176;
        public static final int th_light_text = 2131100177;
        public static final int th_light_text_caption = 2131100178;
        public static final int th_light_text_caption_checked = 2131100179;
        public static final int th_light_text_caption_disabled = 2131100180;
        public static final int th_light_text_caption_pressed = 2131100181;
        public static final int th_light_text_checked = 2131100182;
        public static final int th_light_text_disabled = 2131100183;
        public static final int th_light_text_pressed = 2131100184;
        public static final int th_login_background = 2131100185;
        public static final int th_login_logo = 2131100186;
        public static final int th_pokerchip_off_background = 2131100187;
        public static final int th_pokerchip_off_foreground = 2131100188;
        public static final int th_pokerchip_on_background = 2131100189;
        public static final int th_pokerchip_on_foreground = 2131100190;
        public static final int th_pokerchip_preview_background = 2131100191;
        public static final int th_pokerchip_preview_foreground = 2131100192;
        public static final int th_popover_anchor = 2131100193;
        public static final int th_popover_background = 2131100194;
        public static final int th_popover_icon_create_statelist = 2131100195;
        public static final int th_popover_icon_existing = 2131100196;
        public static final int th_popover_icon_existing_pressed = 2131100197;
        public static final int th_popover_icon_new = 2131100198;
        public static final int th_popover_icon_new_pressed = 2131100199;
        public static final int th_popover_icon_update_statelist = 2131100200;
        public static final int th_popover_point_list_background = 2131100201;
        public static final int th_popover_point_list_background_pressed = 2131100202;
        public static final int th_popover_point_list_caption = 2131100203;
        public static final int th_popover_point_list_caption_pressed = 2131100204;
        public static final int th_popover_point_list_caption_statelist = 2131100205;
        public static final int th_popover_point_list_create_text = 2131100206;
        public static final int th_popover_point_list_create_text_pressed = 2131100207;
        public static final int th_popover_point_list_create_text_statelist = 2131100208;
        public static final int th_popover_point_list_update_text = 2131100209;
        public static final int th_popover_point_list_update_text_pressed = 2131100210;
        public static final int th_popover_point_list_update_text_statelist = 2131100211;
        public static final int th_popover_region_button_background = 2131100212;
        public static final int th_popover_region_button_background_pressed = 2131100213;
        public static final int th_popover_tab_background = 2131100214;
        public static final int th_popover_tab_background_selected = 2131100215;
        public static final int th_popover_tab_border = 2131100216;
        public static final int th_popover_tab_border_selected = 2131100217;
        public static final int th_popover_tab_text = 2131100218;
        public static final int th_popover_tab_text_selected = 2131100219;
        public static final int th_preview_background = 2131100220;
        public static final int th_preview_caption = 2131100221;
        public static final int th_preview_caption_checked = 2131100222;
        public static final int th_preview_caption_disabled = 2131100223;
        public static final int th_preview_caption_pressed = 2131100224;
        public static final int th_preview_exit = 2131100225;
        public static final int th_preview_icon = 2131100226;
        public static final int th_preview_list_item_background = 2131100227;
        public static final int th_preview_list_item_background_checked = 2131100228;
        public static final int th_preview_list_item_background_disabled = 2131100229;
        public static final int th_preview_list_item_background_pressed = 2131100230;
        public static final int th_preview_list_item_caption_statelist = 2131100231;
        public static final int th_preview_list_item_exit_background = 2131100232;
        public static final int th_preview_list_item_exit_background_checked = 2131100233;
        public static final int th_preview_list_item_exit_background_disabled = 2131100234;
        public static final int th_preview_list_item_exit_background_pressed = 2131100235;
        public static final int th_preview_list_item_icon = 2131100236;
        public static final int th_preview_list_item_icon_checked = 2131100237;
        public static final int th_preview_list_item_icon_disabled = 2131100238;
        public static final int th_preview_list_item_icon_pressed = 2131100239;
        public static final int th_preview_list_item_icon_statelist = 2131100240;
        public static final int th_preview_list_item_label_statelist = 2131100241;
        public static final int th_preview_text = 2131100242;
        public static final int th_preview_text_checked = 2131100243;
        public static final int th_preview_text_disabled = 2131100244;
        public static final int th_preview_text_pressed = 2131100245;
        public static final int th_preview_tid = 2131100246;
        public static final int th_search_button_clear = 2131100247;
        public static final int th_search_container_background = 2131100248;
        public static final int th_search_textview_border = 2131100249;
        public static final int th_search_textview_inner_background = 2131100250;
        public static final int th_web_view_domain_text_color = 2131100251;
        public static final int tooltip_background_dark = 2131100252;
        public static final int tooltip_background_light = 2131100253;
        public float MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
        public int MediaBrowserCompat$ItemReceiver;
        public float read = 1.0f;
        public float write = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat implements nAllocationGetStride.write {
        public static final int th_menu_admin_screen = 2131558416;
        public static final int th_menu_web_view = 2131558417;
        private final RenderScript read;
        private final nAllocationGetStride write;

        public MediaMetadataCompat() {
        }

        public static boolean MediaBrowserCompat$ItemReceiver() {
            try {
                Class.forName("cn.wind.smjce.crypto.engines.SM4Engine");
                try {
                    if (Security.getProvider("SM") != null) {
                        return true;
                    }
                    Security.addProvider((Provider) Class.forName("cn.wind.smjce.jce.provider.SMProvider").newInstance());
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            } catch (Exception unused2) {
                return false;
            }
        }

        public MediaMetadataCompat(nAllocationGetStride nallocationgetstride, RenderScript renderScript) {
            this.write = nallocationgetstride;
            this.read = renderScript;
        }

        public final Object read(Object obj) {
            nAllocationGetStride nallocationgetstride = this.write;
            Long MediaBrowserCompat$CustomActionResultReceiver = nAllocationGetStride.MediaBrowserCompat$CustomActionResultReceiver((SQLiteDatabase) obj, this.read);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return Boolean.FALSE;
            }
            return (Boolean) nAllocationGetStride.MediaBrowserCompat$ItemReceiver(((SQLiteDatabase) nallocationgetstride.MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(nallocationgetstride.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{MediaBrowserCompat$CustomActionResultReceiver.toString()}), ZHEMM.read);
        }
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat {
        public static final int abc_ab_share_pack_mtrl_alpha = 2131230728;
        public static final int abc_action_bar_item_background_material = 2131230729;
        public static final int abc_btn_borderless_material = 2131230730;
        public static final int abc_btn_check_material = 2131230731;
        public static final int abc_btn_check_to_on_mtrl_000 = 2131230732;
        public static final int abc_btn_check_to_on_mtrl_015 = 2131230733;
        public static final int abc_btn_colored_material = 2131230734;
        public static final int abc_btn_default_mtrl_shape = 2131230735;
        public static final int abc_btn_radio_material = 2131230736;
        public static final int abc_btn_radio_to_on_mtrl_000 = 2131230737;
        public static final int abc_btn_radio_to_on_mtrl_015 = 2131230738;
        public static final int abc_btn_switch_to_on_mtrl_00001 = 2131230739;
        public static final int abc_btn_switch_to_on_mtrl_00012 = 2131230740;
        public static final int abc_cab_background_internal_bg = 2131230741;
        public static final int abc_cab_background_top_material = 2131230742;
        public static final int abc_cab_background_top_mtrl_alpha = 2131230743;
        public static final int abc_control_background_material = 2131230744;
        public static final int abc_dialog_material_background = 2131230745;
        public static final int abc_edit_text_material = 2131230746;
        public static final int abc_ic_ab_back_material = 2131230747;
        public static final int abc_ic_arrow_drop_right_black_24dp = 2131230748;
        public static final int abc_ic_clear_material = 2131230749;
        public static final int abc_ic_commit_search_api_mtrl_alpha = 2131230750;
        public static final int abc_ic_go_search_api_material = 2131230751;
        public static final int abc_ic_menu_copy_mtrl_am_alpha = 2131230752;
        public static final int abc_ic_menu_cut_mtrl_alpha = 2131230753;
        public static final int abc_ic_menu_overflow_material = 2131230754;
        public static final int abc_ic_menu_paste_mtrl_am_alpha = 2131230755;
        public static final int abc_ic_menu_selectall_mtrl_alpha = 2131230756;
        public static final int abc_ic_menu_share_mtrl_alpha = 2131230757;
        public static final int abc_ic_search_api_material = 2131230758;
        public static final int abc_ic_star_black_16dp = 2131230759;
        public static final int abc_ic_star_black_36dp = 2131230760;
        public static final int abc_ic_star_black_48dp = 2131230761;
        public static final int abc_ic_star_half_black_16dp = 2131230762;
        public static final int abc_ic_star_half_black_36dp = 2131230763;
        public static final int abc_ic_star_half_black_48dp = 2131230764;
        public static final int abc_ic_voice_search_api_material = 2131230765;
        public static final int abc_item_background_holo_dark = 2131230766;
        public static final int abc_item_background_holo_light = 2131230767;
        public static final int abc_list_divider_material = 2131230768;
        public static final int abc_list_divider_mtrl_alpha = 2131230769;
        public static final int abc_list_focused_holo = 2131230770;
        public static final int abc_list_longpressed_holo = 2131230771;
        public static final int abc_list_pressed_holo_dark = 2131230772;
        public static final int abc_list_pressed_holo_light = 2131230773;
        public static final int abc_list_selector_background_transition_holo_dark = 2131230774;
        public static final int abc_list_selector_background_transition_holo_light = 2131230775;
        public static final int abc_list_selector_disabled_holo_dark = 2131230776;
        public static final int abc_list_selector_disabled_holo_light = 2131230777;
        public static final int abc_list_selector_holo_dark = 2131230778;
        public static final int abc_list_selector_holo_light = 2131230779;
        public static final int abc_menu_hardkey_panel_mtrl_mult = 2131230780;
        public static final int abc_popup_background_mtrl_mult = 2131230781;
        public static final int abc_ratingbar_indicator_material = 2131230782;
        public static final int abc_ratingbar_material = 2131230783;
        public static final int abc_ratingbar_small_material = 2131230784;
        public static final int abc_scrubber_control_off_mtrl_alpha = 2131230785;
        public static final int abc_scrubber_control_to_pressed_mtrl_000 = 2131230786;
        public static final int abc_scrubber_control_to_pressed_mtrl_005 = 2131230787;
        public static final int abc_scrubber_primary_mtrl_alpha = 2131230788;
        public static final int abc_scrubber_track_mtrl_alpha = 2131230789;
        public static final int abc_seekbar_thumb_material = 2131230790;
        public static final int abc_seekbar_tick_mark_material = 2131230791;
        public static final int abc_seekbar_track_material = 2131230792;
        public static final int abc_spinner_mtrl_am_alpha = 2131230793;
        public static final int abc_spinner_textfield_background_material = 2131230794;
        public static final int abc_switch_thumb_material = 2131230795;
        public static final int abc_switch_track_mtrl_alpha = 2131230796;
        public static final int abc_tab_indicator_material = 2131230797;
        public static final int abc_tab_indicator_mtrl_alpha = 2131230798;
        public static final int abc_text_cursor_material = 2131230799;
        public static final int abc_text_select_handle_left_mtrl_dark = 2131230800;
        public static final int abc_text_select_handle_left_mtrl_light = 2131230801;
        public static final int abc_text_select_handle_middle_mtrl_dark = 2131230802;
        public static final int abc_text_select_handle_middle_mtrl_light = 2131230803;
        public static final int abc_text_select_handle_right_mtrl_dark = 2131230804;
        public static final int abc_text_select_handle_right_mtrl_light = 2131230805;
        public static final int abc_textfield_activated_mtrl_alpha = 2131230806;
        public static final int abc_textfield_default_mtrl_alpha = 2131230807;
        public static final int abc_textfield_search_activated_mtrl_alpha = 2131230808;
        public static final int abc_textfield_search_default_mtrl_alpha = 2131230809;
        public static final int abc_textfield_search_material = 2131230810;
        public static final int abc_vector_test = 2131230811;
        public static final int avd_hide_password = 2131230837;
        public static final int avd_show_password = 2131230838;
        public static final int common_full_open_on_phone = 2131230963;
        public static final int common_google_signin_btn_icon_dark = 2131230964;
        public static final int common_google_signin_btn_icon_dark_focused = 2131230965;
        public static final int common_google_signin_btn_icon_dark_normal = 2131230966;
        public static final int common_google_signin_btn_icon_dark_normal_background = 2131230967;
        public static final int common_google_signin_btn_icon_disabled = 2131230968;
        public static final int common_google_signin_btn_icon_light = 2131230969;
        public static final int common_google_signin_btn_icon_light_focused = 2131230970;
        public static final int common_google_signin_btn_icon_light_normal = 2131230971;
        public static final int common_google_signin_btn_icon_light_normal_background = 2131230972;
        public static final int common_google_signin_btn_text_dark = 2131230973;
        public static final int common_google_signin_btn_text_dark_focused = 2131230974;
        public static final int common_google_signin_btn_text_dark_normal = 2131230975;
        public static final int common_google_signin_btn_text_dark_normal_background = 2131230976;
        public static final int common_google_signin_btn_text_disabled = 2131230977;
        public static final int common_google_signin_btn_text_light = 2131230978;
        public static final int common_google_signin_btn_text_light_focused = 2131230979;
        public static final int common_google_signin_btn_text_light_normal = 2131230980;
        public static final int common_google_signin_btn_text_light_normal_background = 2131230981;
        public static final int design_bottom_navigation_item_background = 2131231009;
        public static final int design_fab_background = 2131231010;
        public static final int design_ic_visibility = 2131231011;
        public static final int design_ic_visibility_off = 2131231012;
        public static final int design_password_eye = 2131231013;
        public static final int design_snackbar_background = 2131231014;
        public static final int googleg_disabled_color_18 = 2131231052;
        public static final int googleg_standard_color_18 = 2131231053;
        public static final int ic_mtrl_chip_checked_black = 2131231252;
        public static final int ic_mtrl_chip_checked_circle = 2131231253;
        public static final int ic_mtrl_chip_close_circle = 2131231254;
        public static final int mtrl_snackbar_background = 2131231472;
        public static final int mtrl_tabs_default_indicator = 2131231473;
        public static final int navigation_empty_icon = 2131231485;
        public static final int notification_action_background = 2131231489;
        public static final int notification_bg = 2131231490;
        public static final int notification_bg_low = 2131231491;
        public static final int notification_bg_low_normal = 2131231492;
        public static final int notification_bg_low_pressed = 2131231493;
        public static final int notification_bg_normal = 2131231494;
        public static final int notification_bg_normal_pressed = 2131231495;
        public static final int notification_icon_background = 2131231496;
        public static final int notification_template_icon_bg = 2131231497;
        public static final int notification_template_icon_low_bg = 2131231498;
        public static final int notification_tile_bg = 2131231499;
        public static final int notify_panel_notification_icon_bg = 2131231501;
        public static final int th_activity_dialog_rounded = 2131231645;
        public static final int th_admin_screen_button_background_statelist = 2131231646;
        public static final int th_blue_border_for_interaction = 2131231647;
        public static final int th_dark_button_flat_background_statelist = 2131231648;
        public static final int th_dark_button_list_background_statelist = 2131231649;
        public static final int th_dark_button_raised_background_statelist = 2131231650;
        public static final int th_dark_button_tab_background_statelist = 2131231651;
        public static final int th_dark_divider = 2131231652;
        public static final int th_dark_radio_button_background_statelist = 2131231653;
        public static final int th_dark_radio_button_flat_background_statelist = 2131231654;
        public static final int th_dark_radio_button_list_background_statelist = 2131231655;
        public static final int th_dark_radio_button_raised_background_statelist = 2131231656;
        public static final int th_dark_radio_button_raised_end_background_statelist = 2131231657;
        public static final int th_dark_radio_button_raised_start_background_statelist = 2131231658;
        public static final int th_dark_radio_button_tab_background_statelist = 2131231659;
        public static final int th_dark_radiogroup_raised_background_border = 2131231660;
        public static final int th_dark_switch_list_background_statelist = 2131231661;
        public static final int th_highlight_area_background = 2131231662;
        public static final int th_highlight_area_background_with_green_border = 2131231663;
        public static final int th_highlight_element_green_border = 2131231664;
        public static final int th_highlight_element_green_border_fill = 2131231665;
        public static final int th_highlight_element_orange_border = 2131231666;
        public static final int th_highlight_element_orange_border_fill = 2131231667;
        public static final int th_highlight_preview_mode_border = 2131231668;
        public static final int th_highlight_tracked_element_background = 2131231669;
        public static final int th_highlight_untracked_element_background = 2131231670;
        public static final int th_ic_action_next_item = 2131231671;
        public static final int th_ic_action_previous_item = 2131231672;
        public static final int th_ic_action_remove = 2131231673;
        public static final int th_ic_action_share = 2131231674;
        public static final int th_light_button_flat_background_statelist = 2131231675;
        public static final int th_light_button_list_background_statelist = 2131231676;
        public static final int th_light_button_raised_background_statelist = 2131231677;
        public static final int th_light_button_tab_background_statelist = 2131231678;
        public static final int th_light_divider = 2131231679;
        public static final int th_light_radio_button_background_statelist = 2131231680;
        public static final int th_light_radio_button_flat_background_statelist = 2131231681;
        public static final int th_light_radio_button_list_background_statelist = 2131231682;
        public static final int th_light_radio_button_raised_background_statelist = 2131231683;
        public static final int th_light_radio_button_raised_end_background_statelist = 2131231684;
        public static final int th_light_radio_button_raised_start_background_statelist = 2131231685;
        public static final int th_light_radio_button_tab_background_statelist = 2131231686;
        public static final int th_light_radiogroup_raised_background_border = 2131231687;
        public static final int th_light_switch_list_background_statelist = 2131231688;
        public static final int th_pokerchip_background = 2131231689;
        public static final int th_popover_point_list_point_background_statelist = 2131231690;
        public static final int th_popover_region_button_create_background_statelist = 2131231691;
        public static final int th_popover_tab_background_drawable = 2131231692;
        public static final int th_popover_tabs_background_selected = 2131231693;
        public static final int th_popover_tabs_text_color = 2131231694;
        public static final int th_preview_list_item_background_statelist = 2131231695;
        public static final int th_preview_list_item_exit_background_statelist = 2131231696;
        public static final int th_search_box_background = 2131231697;
        public static final int th_thdc_waves = 2131231698;
        public static final int tooltip_frame_dark = 2131231717;
        public static final int tooltip_frame_light = 2131231718;
        public int IconCompatParcelizer;
        public long[] MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver = -1;
        public int RatingCompat;
        public int[] read;
        public int write;

        public final void read(validateDiag validatediag, int i, boolean z) {
            validateDiag validatediag2 = validatediag;
            int i2 = i;
            int MediaBrowserCompat$ItemReceiver2 = validatediag.MediaBrowserCompat$ItemReceiver();
            int i3 = (MediaBrowserCompat$ItemReceiver2 + 511) & -256;
            long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            int[] iArr = this.read;
            if (jArr == null || jArr.length < MediaBrowserCompat$ItemReceiver2) {
                jArr = new long[i3];
            }
            if (iArr == null || iArr.length < MediaBrowserCompat$ItemReceiver2) {
                iArr = new int[i3];
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = jArr;
            this.read = iArr;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                boolean z2 = true;
                if (i4 < MediaBrowserCompat$ItemReceiver2) {
                    long write2 = validatediag2.write(i4);
                    int read2 = validatediag2.read(i4);
                    if (i2 != 1) {
                        z2 = false;
                    }
                    long[] jArr2 = jArr;
                    jArr2[i4] = ((long) read2) | (((long) (i4 + i6)) << 32) | (z2 ? 2147483648L : 0);
                    iArr[i4] = (int) (4294967295L & write2);
                    if (z2) {
                        i5++;
                        i6 += read2;
                    }
                    i4++;
                    jArr = jArr2;
                } else {
                    this.RatingCompat = MediaBrowserCompat$ItemReceiver2;
                    this.write = i5;
                    this.IconCompatParcelizer = i6;
                    this.MediaBrowserCompat$ItemReceiver = Math.max(0, MediaBrowserCompat$ItemReceiver2 - 1);
                    return;
                }
            }
        }

        public final boolean write(int i) {
            long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if ((jArr[i] & 2147483648L) == 0) {
                return false;
            }
            jArr[i] = jArr[i] & -2147483649L;
            this.write--;
            this.IconCompatParcelizer -= (int) (jArr[i] & 2147483647L);
            this.MediaBrowserCompat$ItemReceiver = Math.min(this.MediaBrowserCompat$ItemReceiver, i);
            return true;
        }

        public final boolean MediaBrowserCompat$ItemReceiver(int i) {
            long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if ((jArr[i] & 2147483648L) != 0) {
                return false;
            }
            jArr[i] = jArr[i] | 2147483648L;
            this.write++;
            this.IconCompatParcelizer += (int) (jArr[i] & 2147483647L);
            this.MediaBrowserCompat$ItemReceiver = Math.min(this.MediaBrowserCompat$ItemReceiver, i);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0092 A[EDGE_INSN: B:39:0x0092->B:33:0x0092 ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long MediaBrowserCompat$CustomActionResultReceiver(int r19) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = -1
                r4 = -1
                if (r1 != r4) goto L_0x000a
                return r2
            L_0x000a:
                int r4 = r0.RatingCompat
                long[] r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
                int r6 = r0.MediaBrowserCompat$ItemReceiver
                r7 = 32
                r8 = 0
                if (r6 > 0) goto L_0x0017
            L_0x0015:
                r6 = r8
                goto L_0x003b
            L_0x0017:
                r9 = r5[r8]
                long r9 = r9 >>> r7
                int r9 = (int) r9
                r10 = r5[r6]
                long r10 = r10 >>> r7
                int r10 = (int) r10
                if (r1 > r9) goto L_0x0022
                goto L_0x0015
            L_0x0022:
                if (r1 < r10) goto L_0x0025
                goto L_0x003b
            L_0x0025:
                r9 = r8
                r10 = r9
            L_0x0027:
                if (r10 >= r6) goto L_0x003a
                int r11 = r10 + r6
                int r11 = r11 >>> 1
                r12 = r5[r11]
                long r12 = r12 >>> r7
                int r12 = (int) r12
                if (r12 >= r1) goto L_0x0038
                int r11 = r11 + 1
                r9 = r10
                r10 = r11
                goto L_0x0027
            L_0x0038:
                r6 = r11
                goto L_0x0027
            L_0x003a:
                r6 = r9
            L_0x003b:
                int r5 = r0.MediaBrowserCompat$ItemReceiver
                if (r6 != 0) goto L_0x0040
                goto L_0x0047
            L_0x0040:
                long[] r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r9 = r8[r6]
                long r8 = r9 >>> r7
                int r8 = (int) r8
            L_0x0047:
                if (r6 >= r4) goto L_0x0092
                long[] r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r9 = r5[r6]
                long r11 = (long) r8
                long r11 = r11 << r7
                r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r15 = r9 & r13
                long r11 = r11 | r15
                r5[r6] = r11
                if (r8 < r1) goto L_0x0066
                long r1 = (long) r6
                long r1 = r1 & r13
                r3 = -4294967296(0xffffffff00000000, double:NaN)
                long r2 = r1 | r3
            L_0x0064:
                r5 = r6
                goto L_0x0092
            L_0x0066:
                int r8 = r8 + 1
                r11 = 2147483648(0x80000000, double:1.0609978955E-314)
                long r11 = r11 & r9
                r15 = 0
                int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r9 = r9 & r11
                int r5 = (int) r9
                if (r5 <= 0) goto L_0x0089
                int r9 = r8 + r5
                int r9 = r9 + -1
                if (r9 < r1) goto L_0x0089
                int r1 = r1 - r8
                long r1 = (long) r1
                long r3 = (long) r6
                long r3 = r3 & r13
                long r1 = r1 << r7
                long r2 = r3 | r1
                goto L_0x0064
            L_0x0089:
                int r8 = r8 + r5
            L_0x008a:
                int r5 = r6 + 1
                r17 = r6
                r6 = r5
                r5 = r17
                goto L_0x0047
            L_0x0092:
                int r1 = r0.MediaBrowserCompat$ItemReceiver
                int r1 = java.lang.Math.max(r1, r5)
                r0.MediaBrowserCompat$ItemReceiver = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(int):long");
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(long j) {
            long j2 = j;
            int i = -1;
            if (j2 == -1) {
                return -1;
            }
            int i2 = (int) j2;
            int i3 = (int) (j2 >>> 32);
            int i4 = this.RatingCompat;
            if (i2 >= 0 && i2 < i4) {
                if (i3 != -1) {
                    if (!((this.MediaBrowserCompat$CustomActionResultReceiver[i2] & 2147483648L) != 0)) {
                        return -1;
                    }
                }
                int max = Math.max(0, Math.min(i2, this.MediaBrowserCompat$ItemReceiver));
                int i5 = this.MediaBrowserCompat$ItemReceiver;
                int i6 = (int) (this.MediaBrowserCompat$CustomActionResultReceiver[max] >>> 32);
                while (true) {
                    if (max >= i4) {
                        max = i5;
                        break;
                    }
                    long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                    long j3 = jArr[max];
                    jArr[max] = (((long) i6) << 32) | (4294967295L & j3);
                    int i7 = (int) (2147483647L & j3);
                    if (max == i2) {
                        if (i3 != -1) {
                            if (i3 < i7) {
                                i6 = i6 + 1 + i3;
                            }
                        }
                        i = i6;
                    } else {
                        i6++;
                        if ((j3 & 2147483648L) != 0) {
                            i6 += i7;
                        }
                        i5 = max;
                        max++;
                    }
                }
                this.MediaBrowserCompat$ItemReceiver = Math.max(this.MediaBrowserCompat$ItemReceiver, max);
            }
            return i;
        }

        public final long[] IconCompatParcelizer() {
            long[] jArr = new long[this.RatingCompat];
            for (int i = 0; i < this.RatingCompat; i++) {
                jArr[i] = (this.MediaBrowserCompat$CustomActionResultReceiver[i] & 2147483648L) | (((long) this.read[i]) << 32);
            }
            Arrays.sort(jArr);
            return jArr;
        }

        public final void read(int i, int i2, int i3, int i4) {
            if (i != i3) {
                long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i5 = (int) (jArr[i] & 2147483647L);
                int i6 = (int) (jArr[i3] & 2147483647L);
                if (i5 != 0) {
                    jArr[i] = (jArr[i] & -2147483648L) | ((long) (i5 - 1));
                    jArr[i3] = ((long) (i6 + 1)) | (jArr[i3] & -2147483648L);
                    if ((jArr[i] & 2147483648L) != 0) {
                        this.IconCompatParcelizer--;
                    }
                    if ((this.MediaBrowserCompat$CustomActionResultReceiver[i3] & 2147483648L) != 0) {
                        this.IconCompatParcelizer++;
                    }
                    int min = Math.min(i, i3);
                    if (min > 0) {
                        this.MediaBrowserCompat$ItemReceiver = Math.min(this.MediaBrowserCompat$ItemReceiver, min - 1);
                    } else {
                        this.MediaBrowserCompat$ItemReceiver = -1;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("moveChildItem(fromGroupPosition = ");
                    sb.append(i);
                    sb.append(", fromChildPosition = ");
                    sb.append(i2);
                    sb.append(", toGroupPosition = ");
                    sb.append(i3);
                    sb.append(", toChildPosition = ");
                    sb.append(i4);
                    sb.append(")  --- may be a bug.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            if (i != i2) {
                long j = this.MediaBrowserCompat$CustomActionResultReceiver[i];
                int i3 = this.read[i];
                if (i2 < i) {
                    for (int i4 = i; i4 > i2; i4--) {
                        long[] jArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                        int i5 = i4 - 1;
                        jArr[i4] = jArr[i5];
                        int[] iArr = this.read;
                        iArr[i4] = iArr[i5];
                    }
                } else {
                    int i6 = i;
                    while (i6 < i2) {
                        long[] jArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        int i7 = i6 + 1;
                        jArr2[i6] = jArr2[i7];
                        int[] iArr2 = this.read;
                        iArr2[i6] = iArr2[i7];
                        i6 = i7;
                    }
                }
                this.MediaBrowserCompat$CustomActionResultReceiver[i2] = j;
                this.read[i2] = i3;
                int min = Math.min(i, i2);
                if (min > 0) {
                    this.MediaBrowserCompat$ItemReceiver = Math.min(this.MediaBrowserCompat$ItemReceiver, min - 1);
                } else {
                    this.MediaBrowserCompat$ItemReceiver = -1;
                }
            }
        }

        public final void read(long[] jArr) {
            if (jArr != null && jArr.length != 0 && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                int i = this.RatingCompat;
                long[] jArr2 = new long[i];
                for (int i2 = 0; i2 < this.RatingCompat; i2++) {
                    jArr2[i2] = (((long) this.read[i2]) << 32) | ((long) i2);
                }
                Arrays.sort(jArr2);
                int i3 = 0;
                int i4 = 0;
                while (i3 < jArr.length) {
                    int i5 = (int) (jArr[i3] >>> 32);
                    boolean z = (jArr[i3] & 2147483648L) != 0;
                    int i6 = i4;
                    while (i4 < i) {
                        int i7 = (int) (jArr2[i4] >>> 32);
                        int i8 = (int) (jArr2[i4] & 2147483647L);
                        if (i7 >= i5) {
                            if (i7 != i5) {
                                break;
                            }
                            if (z) {
                                boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i8);
                            } else {
                                write(i8);
                            }
                            i6 = i4 + 1;
                        } else {
                            i6 = i4;
                        }
                        i4++;
                    }
                    i3++;
                    i4 = i6;
                }
            }
        }
    }

    /* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$RatingCompat */
    public static final class RatingCompat implements nAllocationGetStride.write {
        public static final int action0 = 2131296303;
        public static final int action_bar = 2131296304;
        public static final int action_bar_activity_content = 2131296305;
        public static final int action_bar_container = 2131296306;
        public static final int action_bar_root = 2131296307;
        public static final int action_bar_spinner = 2131296308;
        public static final int action_bar_subtitle = 2131296309;
        public static final int action_bar_title = 2131296310;
        public static final int action_close = 2131296312;
        public static final int action_container = 2131296313;
        public static final int action_context_bar = 2131296314;
        public static final int action_divider = 2131296315;
        public static final int action_image = 2131296316;
        public static final int action_menu_divider = 2131296317;
        public static final int action_menu_presenter = 2131296318;
        public static final int action_mode_bar = 2131296319;
        public static final int action_mode_bar_stub = 2131296320;
        public static final int action_mode_close_button = 2131296321;
        public static final int action_share = 2131296325;
        public static final int action_text = 2131296326;
        public static final int actions = 2131296327;
        public static final int activity_chooser_view_content = 2131296332;
        public static final int add = 2131296335;
        public static final int add_optimization_point_item = 2131296342;
        public static final int add_tracking_point_item = 2131296345;
        public static final int adjust_height = 2131296358;
        public static final int adjust_width = 2131296359;
        public static final int alertTitle = 2131296375;
        public static final int all = 2131296378;
        public static final int arrow_down = 2131296419;
        public static final int arrow_up = 2131296422;
        public static final int async = 2131296431;
        public static final int attributeName = 2131296433;
        public static final int auto = 2131296437;
        public static final int blocking = 2131296572;
        public static final int bottom = 2131296590;
        public static final int browser_actions_header_text = 2131296603;
        public static final int browser_actions_menu_item_icon = 2131296604;
        public static final int browser_actions_menu_item_text = 2131296605;
        public static final int browser_actions_menu_items = 2131296606;
        public static final int browser_actions_menu_view = 2131296607;
        public static final int btn_cancel = 2131296713;
        public static final int btn_positive = 2131296760;
        public static final int btn_sign_in = 2131296781;
        public static final int buttonPanel = 2131296807;
        public static final int button_add = 2131296821;
        public static final int button_element = 2131296848;
        public static final int button_group = 2131296853;
        public static final int button_optimization_points = 2131296867;
        public static final int button_region = 2131296874;
        public static final int button_tracking_points = 2131296888;
        public static final int cancel_action = 2131296912;
        public static final int captureName = 2131296916;
        public static final int capture_count = 2131296918;
        public static final int center = 2131297006;
        public static final int chains = 2131297013;
        public static final int checkbox = 2131297017;
        public static final int chronometer = 2131297036;
        public static final int close_button = 2131297085;
        public static final int container = 2131297116;
        public static final int content = 2131297129;
        public static final int contentPanel = 2131297130;
        public static final int coordinator = 2131297144;
        public static final int custom = 2131297227;
        public static final int customPanel = 2131297228;
        public static final int dark = 2131297327;
        public static final int decor_content_parent = 2131297356;
        public static final int defaultTrack = 2131297371;
        public static final int default_activity_button = 2131297372;
        public static final int design_bottom_sheet = 2131297406;
        public static final int design_menu_item_action_area = 2131297407;
        public static final int design_menu_item_action_area_stub = 2131297408;
        public static final int design_menu_item_text = 2131297409;
        public static final int design_navigation_view = 2131297410;
        public static final int dialog_buttons_container = 2131297432;
        public static final int dialog_edit_text = 2131297434;
        public static final int dialog_message = 2131297441;
        public static final int dialog_title = 2131297449;
        public static final int dynamically = 2131297521;
        public static final int edit_query = 2131297589;
        public static final int enableBlockText = 2131297634;
        public static final int end = 2131297635;
        public static final int end_padder = 2131297640;
        public static final int eventTypeName = 2131297709;
        public static final int expand_activities_button = 2131297713;
        public static final int expanded_menu = 2131297717;
        public static final int fill = 2131297751;
        public static final int filled = 2131297754;
        public static final int fixed = 2131297768;
        public static final int footer = 2131297797;
        public static final int forever = 2131297802;
        public static final int fragment_capture_point_crud_button_choose_attribute = 2131297813;
        public static final int fragment_capture_point_crud_constraint_container = 2131297814;
        public static final int fragment_capture_point_crud_edittext_capture_point_name = 2131297815;
        public static final int fragment_capture_point_crud_switch_enable = 2131297816;
        public static final int fragment_capture_point_crud_textview_attribute_label = 2131297817;
        public static final int fragment_container = 2131297822;
        public static final int fragment_tracking_point_constraint_container = 2131297894;
        public static final int fragment_tracking_point_crud_button_choose_activity = 2131297895;
        public static final int fragment_tracking_point_crud_button_choose_proposition = 2131297896;
        public static final int fragment_tracking_point_crud_edittext_tracking_point_name = 2131297897;
        public static final int fragment_tracking_point_crud_switch_completion = 2131297898;
        public static final int fragment_tracking_point_crud_switch_enable = 2131297899;
        public static final int fragment_tracking_point_crud_textview_activity_label = 2131297900;
        public static final int fragment_tracking_point_crud_textview_proposition_label = 2131297901;
        public static final int ghost_view = 2131297974;
        public static final int group_divider = 2131298047;
        public static final int header2 = 2131298066;
        public static final int home = 2131298105;
        public static final int icon = 2131298138;
        public static final int icon_group = 2131298145;
        public static final int icon_only = 2131298150;
        public static final int image = 2131298163;
        public static final int image_one_logo = 2131298208;
        public static final int info = 2131298278;
        public static final int internal_container = 2131298315;
        public static final int italic = 2131298360;
        public static final int item_touch_helper_previous_elevation = 2131298379;
        public static final int labelNegative = 2131298636;
        public static final int labelNeutral = 2131298637;
        public static final int labeled = 2131298684;
        public static final int largeLabel = 2131298698;
        public static final int layout_container = 2131298775;
        public static final int left = 2131298906;
        public static final int light = 2131298922;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int listMode = 2131298971;
        public static final int list_item = 2131298972;
        public static final int login_image_view_wave = 2131299174;
        public static final int logo = 2131299175;
        public static final int manually = 2131299213;
        public static final int masked = 2131299220;
        public static final int media_actions = 2131299224;
        public static final int message = 2131299248;
        public static final int message_text = 2131299250;
        public static final int mini = 2131299258;
        public static final int mtrl_child_content_container = 2131299316;
        public static final int mtrl_internal_children_alpha_tag = 2131299317;
        public static final int multiply = 2131299319;
        public static final int navigation_header_container = 2131299340;
        public static final int none = 2131299386;
        public static final int normal = 2131299387;
        public static final int notificationContent = 2131299392;
        public static final int notification_background = 2131299393;
        public static final int notification_main_column = 2131299394;
        public static final int notification_main_column_container = 2131299395;
        public static final int oneres_loading_dialog_message = 2131299446;
        public static final int oneres_loading_dialog_progress_bar = 2131299447;
        public static final int optimise_count = 2131299452;
        public static final int optimizationContainer = 2131299453;
        public static final int optimizationName = 2131299454;
        public static final int outline = 2131299464;
        public static final int packed = 2131299483;
        public static final int parallax = 2131299491;
        public static final int parent = 2131299492;
        public static final int parentPanel = 2131299493;
        public static final int parent_matrix = 2131299494;
        public static final int pin = 2131299535;
        public static final int preview_panel_bottom_radiobutton_exit = 2131299587;
        public static final int preview_panel_bottom_radiobutton_launchpad = 2131299588;
        public static final int preview_panel_bottom_radiobutton_live = 2131299589;
        public static final int preview_panel_bottom_radiobutton_works = 2131299590;
        public static final int preview_panel_bottom_radiogroup_modes = 2131299591;
        public static final int preview_panel_tid_text = 2131299592;
        public static final int preview_top_panel_content = 2131299593;
        public static final int preview_top_panel_separator = 2131299594;
        public static final int progress_circular = 2131299616;
        public static final int progress_horizontal = 2131299617;
        public static final int propositionName = 2131299627;
        public static final int radio = 2131299671;
        public static final int region_layout = 2131299812;
        public static final int region_points_toggle = 2131299813;
        public static final int remember_me_block = 2131299836;
        public static final int remember_me_container = 2131299837;
        public static final int right = 2131299897;
        public static final int right_icon = 2131299901;
        public static final int right_side = 2131299902;
        public static final int save_image_matrix = 2131300023;
        public static final int save_non_transition_alpha = 2131300024;
        public static final int save_scale_type = 2131300026;
        public static final int screen = 2131300061;
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
        public static final int segmented_control = 2131300101;
        public static final int select_dialog_listview = 2131300112;
        public static final int selected = 2131300129;
        public static final int shortcut = 2131300174;
        public static final int smallLabel = 2131300196;
        public static final int snackbar_action = 2131300198;
        public static final int snackbar_text = 2131300199;
        public static final int spacer = 2131300247;
        public static final int split_action_bar = 2131300259;
        public static final int spread = 2131300270;
        public static final int spread_inside = 2131300271;
        public static final int src_atop = 2131300273;
        public static final int src_in = 2131300274;
        public static final int src_over = 2131300275;
        public static final int standard = 2131300276;
        public static final int start = 2131300277;
        public static final int status_bar_latest_event_content = 2131300288;
        public static final int stretch = 2131300298;
        public static final int submenuarrow = 2131300304;
        public static final int submit_area = 2131300306;
        public static final int switch_remember_me = 2131300337;
        public static final int tabMode = 2131300347;
        public static final int tag_transition_group = 2131300355;
        public static final int tag_unhandled_key_event_manager = 2131300356;
        public static final int tag_unhandled_key_listeners = 2131300357;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int textSpacerNoButtons = 2131300383;
        public static final int textSpacerNoTitle = 2131300384;
        public static final int text_element_name = 2131300457;
        public static final int text_element_name_container = 2131300458;
        public static final int text_input_password_toggle = 2131300499;
        public static final int textinput_counter = 2131300629;
        public static final int textinput_error = 2131300630;
        public static final int textinput_helper_text = 2131300631;
        public static final int th_activity_list_data_attributes_button_create_attribute = 2131300641;
        public static final int th_activity_list_data_attributes_recyclerview_attributes = 2131300642;
        public static final int th_activity_list_data_attributes_textview_no_results = 2131300643;
        public static final int th_activity_login_scrollview_login_scrollview = 2131300644;
        public static final int th_activity_login_textinputedittext_password = 2131300645;
        public static final int th_activity_login_textinputedittext_username = 2131300646;
        public static final int th_activity_login_textinputlayout_password_container = 2131300647;
        public static final int th_activity_login_textinputlayout_username_container = 2131300648;
        public static final int th_activity_new_data_attribute_recycler_attributes = 2131300649;
        public static final int th_backpressed_window_id = 2131300650;
        public static final int th_button_no_config_dismiss = 2131300651;
        public static final int th_divider = 2131300652;
        public static final int th_fragment_activity_types_list_body_recycler_activitytypes = 2131300653;
        public static final int th_fragment_propositions_list_body_recycler_propositions = 2131300654;
        public static final int th_fragment_propositions_root_list_attribute_recycler = 2131300655;
        public static final int th_ignore_interaction_tag_key = 2131300656;
        public static final int th_interaction_path_tag_key = 2131300657;
        public static final int th_layout_invalid_configuration = 2131300658;
        public static final int th_layout_menuitem_submit_text_icon_check = 2131300659;
        public static final int th_layout_no_config_title = 2131300660;
        public static final int th_layout_popover_point_list_capture_update_textview_icon = 2131300661;
        public static final int th_layout_popover_point_list_track_create_textview_icon = 2131300662;
        public static final int th_menu_admin_screen_item_submit = 2131300663;
        public static final int th_one_view_tag_key = 2131300664;
        public static final int th_textview_no_config_message = 2131300665;
        public static final int th_textview_no_config_title = 2131300666;
        public static final int th_view_list_item_checkable_radiobutton = 2131300667;
        public static final int th_view_search_box_container = 2131300668;
        public static final int th_view_search_box_edittext_search_input = 2131300669;
        public static final int th_view_search_box_text_clear = 2131300670;
        public static final int th_view_separator = 2131300671;
        public static final int thunderhead_notification_root = 2131300680;
        public static final int thunderhead_one_poker_chip = 2131300681;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public static final int titleDividerNoCustom = 2131300690;
        public static final int title_template = 2131300703;
        public static final int title_text = 2131300704;
        public static final int top = 2131300717;
        public static final int topPanel = 2131300719;
        public static final int touch_outside = 2131300746;
        public static final int trackContainer = 2131300750;
        public static final int track_count = 2131300751;
        public static final int track_element_layout = 2131300752;
        public static final int trackingPointName = 2131300753;
        public static final int transition_current_scene = 2131300802;
        public static final int transition_layout_save = 2131300803;
        public static final int transition_position = 2131300804;
        public static final int transition_scene_layoutid_cache = 2131300805;
        public static final int transition_transform = 2131300806;
        public static final int uniform = 2131302087;
        public static final int unlabeled = 2131302089;

        /* renamed from: up */
        public static final int f2545up = 2131302096;
        public static final int viewPointName = 2131302154;
        public static final int view_offset_helper = 2131302220;
        public static final int visible = 2131302265;
        public static final int web_view = 2131302332;
        public static final int web_view_btn_back = 2131302334;
        public static final int web_view_btn_forward = 2131302335;
        public static final int web_view_domain = 2131302337;
        public static final int web_view_progress_bar = 2131302339;
        public static final int web_view_title = 2131302341;
        public static final int wide = 2131302348;
        public static final int wrap = 2131302362;
        public static final int wrap_content = 2131302363;
        private final loadProjectionNormalized IconCompatParcelizer;
        private final RenderScript MediaBrowserCompat$CustomActionResultReceiver;
        private final nAllocationGetStride read;

        public RatingCompat() {
        }

        public static int IconCompatParcelizer(int i) {
            switch (i) {
                case -1:
                    return -1;
                case 0:
                case 2:
                case 4:
                    return 0;
                case 1:
                case 3:
                case 5:
                    return 1;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown layout type (= ");
                    sb.append(i);
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
            }
        }

        public static View write(ViewGroup viewGroup, float f, float f2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (f >= ((float) childAt.getLeft()) && f <= ((float) childAt.getRight()) && f2 >= ((float) childAt.getTop()) && f2 <= ((float) childAt.getBottom())) {
                    return childAt;
                }
            }
            return null;
        }

        public static int read(RecyclerView recyclerView, boolean z) {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
            if (!(recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof LinearLayoutManager)) {
                return -1;
            }
            if (!z) {
                return ((LinearLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat();
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver;
            View write = write(linearLayoutManager, 0, linearLayoutManager.MediaSessionCompat$ResultReceiverWrapper());
            if (write == null) {
                return -1;
            }
            return LinearLayoutManager.MediaMetadataCompat(write);
        }

        public static View write(LinearLayoutManager linearLayoutManager, int i, int i2) {
            int i3;
            int i4 = 1;
            boolean z = linearLayoutManager.MediaMetadataCompat == 1;
            if (z) {
                i3 = linearLayoutManager.ParcelableVolumeInfo;
            } else {
                i3 = linearLayoutManager.setBackgroundResource;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            while (i != i2) {
                View MediaDescriptionCompat = linearLayoutManager.MediaDescriptionCompat(i);
                int top2 = z ? MediaDescriptionCompat.getTop() : MediaDescriptionCompat.getLeft();
                int bottom2 = z ? MediaDescriptionCompat.getBottom() : MediaDescriptionCompat.getRight();
                if (top2 < i3 && bottom2 > 0) {
                    return MediaDescriptionCompat;
                }
                i += i4;
            }
            return null;
        }

        public static Rect write(View view, Rect rect) {
            rect.left = RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat(view);
            rect.right = RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem(view);
            rect.top = RecyclerView$MediaBrowserCompat$SearchResultReceiver.RatingCompat(view);
            rect.bottom = RecyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(view);
            return rect;
        }

        public static Rect MediaBrowserCompat$ItemReceiver(View view, Rect rect) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                rect.left = marginLayoutParams.leftMargin;
                rect.right = marginLayoutParams.rightMargin;
                rect.top = marginLayoutParams.topMargin;
                rect.bottom = marginLayoutParams.bottomMargin;
            } else {
                rect.bottom = 0;
                rect.top = 0;
                rect.right = 0;
                rect.left = 0;
            }
            return rect;
        }

        public static int IconCompatParcelizer(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof GridLayoutManager) {
                return ((GridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat == 0 ? 2 : 3;
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat == 0 ? 0 : 1;
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$ItemReceiver == 0 ? 4 : 5;
            }
            return -1;
        }

        public static int write(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof GridLayoutManager) {
                return ((GridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat;
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat;
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$ItemReceiver;
            }
            return -1;
        }

        public static int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView) {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof GridLayoutManager) {
                return ((GridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).write;
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) recyclerView$MediaBrowserCompat$SearchResultReceiver).IconCompatParcelizer;
            }
            return 1;
        }

        public static int read(RecyclerView.setContentView setcontentview) {
            View view = null;
            if (setcontentview != null) {
                View view2 = setcontentview.write;
                if (SwitchCompat.setCheckable(view2)) {
                    view = view2;
                }
            }
            if (view == null) {
                return -1;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.IconCompatParcelizer) {
                return 1;
            }
            if (layoutParams instanceof GridLayoutManager$MediaBrowserCompat$ItemReceiver) {
                return ((GridLayoutManager$MediaBrowserCompat$ItemReceiver) layoutParams).write;
            }
            if (layoutParams instanceof RecyclerView.MediaDescriptionCompat) {
                return 1;
            }
            return -1;
        }

        public RatingCompat(nAllocationGetStride nallocationgetstride, RenderScript renderScript, loadProjectionNormalized loadprojectionnormalized) {
            this.read = nallocationgetstride;
            this.MediaBrowserCompat$CustomActionResultReceiver = renderScript;
            this.IconCompatParcelizer = loadprojectionnormalized;
        }

        public final Object read(Object obj) {
            long j;
            nAllocationGetStride nallocationgetstride = this.read;
            RenderScript renderScript = this.MediaBrowserCompat$CustomActionResultReceiver;
            loadProjectionNormalized loadprojectionnormalized = this.IconCompatParcelizer;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            if (((SQLiteDatabase) nallocationgetstride.MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(nallocationgetstride.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).compileStatement("PRAGMA page_count").simpleQueryForLong() * ((SQLiteDatabase) nallocationgetstride.MediaBrowserCompat$ItemReceiver(new Iterables.C35273.IconCompatParcelizer(nallocationgetstride.MediaBrowserCompat$ItemReceiver), ZHEMM.write.MediaBrowserCompat$ItemReceiver)).compileStatement("PRAGMA page_size").simpleQueryForLong() >= nallocationgetstride.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                return -1L;
            }
            Long MediaBrowserCompat$CustomActionResultReceiver2 = nAllocationGetStride.MediaBrowserCompat$CustomActionResultReceiver(sQLiteDatabase, renderScript);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                j = MediaBrowserCompat$CustomActionResultReceiver2.longValue();
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("backend_name", renderScript.write());
                contentValues.put("priority", Integer.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read())));
                contentValues.put("next_request_ms", 0);
                if (renderScript.MediaBrowserCompat$ItemReceiver() != null) {
                    contentValues.put("extras", Base64.encodeToString(renderScript.MediaBrowserCompat$ItemReceiver(), 0));
                }
                j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
            }
            int write = nallocationgetstride.MediaBrowserCompat$CustomActionResultReceiver.write();
            byte[] bArr = loadprojectionnormalized.IconCompatParcelizer().write;
            boolean z = bArr.length <= write;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("context_id", Long.valueOf(j));
            contentValues2.put("transport_name", loadprojectionnormalized.MediaBrowserCompat$CustomActionResultReceiver());
            contentValues2.put("timestamp_ms", Long.valueOf(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver()));
            contentValues2.put("uptime_ms", Long.valueOf(loadprojectionnormalized.RatingCompat()));
            contentValues2.put("payload_encoding", loadprojectionnormalized.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
            contentValues2.put("code", loadprojectionnormalized.read());
            contentValues2.put("num_attempts", 0);
            contentValues2.put("inline", Boolean.valueOf(z));
            contentValues2.put("payload", z ? bArr : new byte[0]);
            long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
            if (!z) {
                int ceil = (int) Math.ceil(((double) bArr.length) / ((double) write));
                for (int i = 1; i <= ceil; i++) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * write, Math.min(i * write, bArr.length));
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("event_id", Long.valueOf(insert));
                    contentValues3.put("sequence_num", Integer.valueOf(i));
                    contentValues3.put("bytes", copyOfRange);
                    sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                }
            }
            for (Map.Entry next : loadprojectionnormalized.MediaBrowserCompat$SearchResultReceiver().entrySet()) {
                ContentValues contentValues4 = new ContentValues();
                contentValues4.put("event_id", Long.valueOf(insert));
                contentValues4.put("name", (String) next.getKey());
                contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) next.getValue());
                sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
            }
            return Long.valueOf(insert);
        }
    }
}
