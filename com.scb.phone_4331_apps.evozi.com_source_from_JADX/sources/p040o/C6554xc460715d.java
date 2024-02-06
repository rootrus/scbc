package p040o;

import android.database.sqlite.SQLiteDatabase;
import cn.wind.smjce.crypto.engines.SM4Engine;
import cn.wind.smjce.crypto.modes.CBCBlockCipher;
import cn.wind.smjce.crypto.paddings.PKCS7Padding;
import cn.wind.smjce.crypto.paddings.PaddedBufferedBlockCipher;
import cn.wind.smjce.crypto.params.KeyParameter;
import cn.wind.smjce.crypto.params.ParametersWithIV;
import p040o.nAllocationGetStride;

/* renamed from: o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$MediaItem */
public final class C6554xc460715d implements nAllocationGetStride.write {
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
    public static final int browser_actions_context_menu_page = 2131493264;
    public static final int browser_actions_context_menu_row = 2131493265;
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
    public static final int notification_media_action = 2131494437;
    public static final int notification_media_cancel_action = 2131494438;
    public static final int notification_template_big_media = 2131494439;
    public static final int notification_template_big_media_custom = 2131494440;
    public static final int notification_template_big_media_narrow = 2131494441;
    public static final int notification_template_big_media_narrow_custom = 2131494442;
    public static final int notification_template_custom_big = 2131494443;
    public static final int notification_template_icon_group = 2131494444;
    public static final int notification_template_lines_media = 2131494445;
    public static final int notification_template_media = 2131494446;
    public static final int notification_template_media_custom = 2131494447;
    public static final int notification_template_part_chronometer = 2131494448;
    public static final int notification_template_part_time = 2131494449;
    public static final int select_dialog_item_material = 2131494469;
    public static final int select_dialog_multichoice_material = 2131494470;
    public static final int select_dialog_singlechoice_material = 2131494471;
    public static final int support_simple_spinner_dropdown_item = 2131494475;
    public static final int th_action_bar_web_view_layout = 2131494476;
    public static final int th_activity_admin_container = 2131494477;
    public static final int th_activity_list_data_attributes = 2131494478;
    public static final int th_activity_login = 2131494479;
    public static final int th_activity_new_data_attribute = 2131494480;
    public static final int th_activity_track_option = 2131494481;
    public static final int th_activity_web_view = 2131494482;
    public static final int th_element_highlight = 2131494483;
    public static final int th_fragment_activity_types_list = 2131494484;
    public static final int th_fragment_activity_types_list_body = 2131494485;
    public static final int th_fragment_capture_point_crud = 2131494486;
    public static final int th_fragment_dialog_alert_no_config = 2131494487;
    public static final int th_fragment_proposition_list = 2131494488;
    public static final int th_fragment_proposition_list_body = 2131494489;
    public static final int th_fragment_propositions_root_list_view_attributes = 2131494490;
    public static final int th_fragment_propositions_root_list_view_attributes_body = 2131494491;
    public static final int th_fragment_top_level_proposition_list = 2131494492;
    public static final int th_fragment_top_level_propositions_list_body = 2131494493;
    public static final int th_fragment_tracking_point_crud = 2131494494;
    public static final int th_full_screen_notification_layout = 2131494495;
    public static final int th_layout_admin_crud_success = 2131494496;
    public static final int th_layout_admin_crud_success_body = 2131494497;
    public static final int th_layout_dialog_alert = 2131494498;
    public static final int th_layout_dialog_alert_body = 2131494499;
    public static final int th_layout_dialog_loading = 2131494500;
    public static final int th_layout_dialog_loading_body = 2131494501;
    public static final int th_layout_popover_point_list_capture_create = 2131494502;
    public static final int th_layout_popover_point_list_capture_update = 2131494503;
    public static final int th_layout_popover_point_list_track_create = 2131494504;
    public static final int th_layout_popover_point_list_track_update = 2131494505;
    public static final int th_layout_popover_region_optimization_create = 2131494506;
    public static final int th_layout_popover_region_optimization_update = 2131494507;
    public static final int th_layout_popover_region_track_create = 2131494508;
    public static final int th_layout_preview_panel_bottom_bar = 2131494509;
    public static final int th_layout_preview_panel_bottom_bar_body = 2131494510;
    public static final int th_layout_preview_panel_top_bar = 2131494511;
    public static final int th_layout_preview_panel_top_bar_body = 2131494512;
    public static final int th_view_list_item_checkable = 2131494513;
    public static final int th_view_list_item_checkable_header = 2131494514;
    public static final int th_view_menu_item_submit = 2131494515;
    public static final int th_view_popover = 2131494516;
    public static final int th_view_search_box = 2131494517;
    private final String write;

    public C6554xc460715d() {
    }

    public static byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            PaddedBufferedBlockCipher paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new SM4Engine()), new PKCS7Padding());
            paddedBufferedBlockCipher.init(true, new ParametersWithIV(new KeyParameter(bArr), bArr3));
            byte[] bArr4 = new byte[paddedBufferedBlockCipher.getOutputSize(bArr2.length)];
            int processBytes = paddedBufferedBlockCipher.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
            int doFinal = processBytes + paddedBufferedBlockCipher.doFinal(bArr4, processBytes);
            byte[] bArr5 = new byte[doFinal];
            System.arraycopy(bArr4, 0, bArr5, 0, doFinal);
            return bArr5;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception in encryptSm4CbcPkcs7, msg=");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public C6554xc460715d(String str) {
        this.write = str;
    }

    public final Object read(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.compileStatement(this.write).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }
}
