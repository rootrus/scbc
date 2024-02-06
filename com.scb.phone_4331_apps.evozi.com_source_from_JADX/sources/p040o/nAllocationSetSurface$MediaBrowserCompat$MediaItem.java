package p040o;

import java.io.IOException;
import java.util.Arrays;
import p040o.rsnAllocationRead1D;

/* renamed from: o.nAllocationSetSurface$MediaBrowserCompat$MediaItem */
public final class nAllocationSetSurface$MediaBrowserCompat$MediaItem implements getCarbonStrip {
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
    public static final int abc_alert_dialog_title_material = 2131492874;
    public static final int abc_cascading_menu_item_layout = 2131492875;
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
    public static final int abc_tooltip = 2131492891;
    public static final int design_bottom_navigation_item = 2131493747;
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
    public static final int design_text_input_password_icon = 2131493760;
    public static final int mtrl_layout_snackbar = 2131494431;
    public static final int mtrl_layout_snackbar_include = 2131494432;
    public static final int notification_action = 2131494435;
    public static final int notification_action_tombstone = 2131494436;
    public static final int notification_template_custom_big = 2131494443;
    public static final int notification_template_icon_group = 2131494444;
    public static final int notification_template_part_chronometer = 2131494448;
    public static final int notification_template_part_time = 2131494449;
    public static final int select_dialog_item_material = 2131494469;
    public static final int select_dialog_multichoice_material = 2131494470;
    public static final int select_dialog_singlechoice_material = 2131494471;
    public static final int support_simple_spinner_dropdown_item = 2131494475;

    public final Iterable<setItemAnimator> MediaBrowserCompat$ItemReceiver() {
        return Arrays.asList(new setItemAnimator[]{setItemAnimator.SOF0, setItemAnimator.SOF1, setItemAnimator.SOF2, setItemAnimator.SOF3, setItemAnimator.SOF5, setItemAnimator.SOF6, setItemAnimator.SOF7, setItemAnimator.SOF9, setItemAnimator.SOF10, setItemAnimator.SOF11, setItemAnimator.SOF13, setItemAnimator.SOF14, setItemAnimator.SOF15});
    }

    public final void IconCompatParcelizer(Iterable<byte[]> iterable, getSubElementOffsetBytes getsubelementoffsetbytes, setItemAnimator setitemanimator) {
        for (byte[] copyto : iterable) {
            C1293U8 u8 = new C1293U8();
            getsubelementoffsetbytes.IconCompatParcelizer.add(u8);
            u8.IconCompatParcelizer(-3, Integer.valueOf(setitemanimator.byteValue - setItemAnimator.SOF0.byteValue));
            copyTo copyto2 = new copyTo(copyto);
            try {
                u8.IconCompatParcelizer(0, Integer.valueOf((short) (copyto2.MediaBrowserCompat$ItemReceiver() & 255)));
                u8.IconCompatParcelizer(1, Integer.valueOf(copyto2.RatingCompat()));
                u8.IconCompatParcelizer(3, Integer.valueOf(copyto2.RatingCompat()));
                short MediaBrowserCompat$ItemReceiver = (short) (copyto2.MediaBrowserCompat$ItemReceiver() & 255);
                u8.IconCompatParcelizer(5, Integer.valueOf(MediaBrowserCompat$ItemReceiver));
                for (int i = 0; i < MediaBrowserCompat$ItemReceiver; i++) {
                    u8.IconCompatParcelizer(i + 6, new rsnAllocationRead1D.IconCompatParcelizer((short) (copyto2.MediaBrowserCompat$ItemReceiver() & 255), (short) (copyto2.MediaBrowserCompat$ItemReceiver() & 255), (short) (copyto2.MediaBrowserCompat$ItemReceiver() & 255)));
                }
            } catch (IOException e) {
                u8.IconCompatParcelizer.add(e.getMessage());
            }
        }
    }
}
