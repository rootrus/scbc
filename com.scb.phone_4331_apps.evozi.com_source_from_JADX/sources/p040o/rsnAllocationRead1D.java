package p040o;

import android.animation.ValueAnimator;
import android.os.Build;
import java.io.Serializable;
import p040o.getSubElementOffsetBytes;

/* renamed from: o.rsnAllocationRead1D */
public final class rsnAllocationRead1D {
    private final int IconCompatParcelizer;
    private final createFromBitmapResource MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.rsnAllocationRead1D$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Serializable {
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
        public static final int amu_info_window = 2131493253;
        public static final int amu_text_bubble = 2131493254;
        public static final int amu_webview = 2131493255;
        public static final int custom_dialog = 2131493392;
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
        private final int MediaBrowserCompat$ItemReceiver;
        private final int read;
        public final int write;

        IconCompatParcelizer() {
        }

        public IconCompatParcelizer(int i, int i2, int i3) {
            this.write = i;
            this.read = i2;
            this.MediaBrowserCompat$ItemReceiver = i3;
        }

        public final String toString() {
            return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", new Object[]{Integer.valueOf(this.MediaBrowserCompat$ItemReceiver), Integer.valueOf((this.read >> 4) & 15), Integer.valueOf(this.read & 15)});
        }
    }

    /* renamed from: o.rsnAllocationRead1D$read */
    public static final class read implements getSubElementOffsetBytes.read {
        public static final int action_bar = 2131296304;
        public static final int action_bar_activity_content = 2131296305;
        public static final int action_bar_container = 2131296306;
        public static final int action_bar_root = 2131296307;
        public static final int action_bar_spinner = 2131296308;
        public static final int action_bar_subtitle = 2131296309;
        public static final int action_bar_title = 2131296310;
        public static final int action_container = 2131296313;
        public static final int action_context_bar = 2131296314;
        public static final int action_divider = 2131296315;
        public static final int action_image = 2131296316;
        public static final int action_menu_divider = 2131296317;
        public static final int action_menu_presenter = 2131296318;
        public static final int action_mode_bar = 2131296319;
        public static final int action_mode_bar_stub = 2131296320;
        public static final int action_mode_close_button = 2131296321;
        public static final int action_text = 2131296326;
        public static final int actions = 2131296327;
        public static final int activity_chooser_view_content = 2131296332;
        public static final int add = 2131296335;
        public static final int adjust_height = 2131296358;
        public static final int adjust_width = 2131296359;
        public static final int alertTitle = 2131296375;
        public static final int amu_text = 2131296407;
        public static final int async = 2131296431;
        public static final int auto = 2131296437;
        public static final int blocking = 2131296572;
        public static final int buttonPanel = 2131296807;
        public static final int checkbox = 2131297017;
        public static final int chronometer = 2131297036;
        public static final int content = 2131297129;
        public static final int contentPanel = 2131297130;
        public static final int custom = 2131297227;
        public static final int customPanel = 2131297228;
        public static final int dark = 2131297327;
        public static final int decor_content_parent = 2131297356;
        public static final int default_activity_button = 2131297372;
        public static final int edit_query = 2131297589;
        public static final int expand_activities_button = 2131297713;
        public static final int expanded_menu = 2131297717;
        public static final int forever = 2131297802;
        public static final int group_divider = 2131298047;
        public static final int home = 2131298105;
        public static final int hybrid = 2131298115;
        public static final int icon = 2131298138;
        public static final int icon_group = 2131298145;
        public static final int icon_only = 2131298150;
        public static final int image = 2131298163;
        public static final int info = 2131298278;
        public static final int italic = 2131298360;
        public static final int light = 2131298922;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int listMode = 2131298971;
        public static final int list_item = 2131298972;
        public static final int message = 2131299248;
        public static final int multiply = 2131299319;
        public static final int none = 2131299386;
        public static final int normal = 2131299387;
        public static final int notification_background = 2131299393;
        public static final int notification_main_column = 2131299394;
        public static final int notification_main_column_container = 2131299395;
        public static final int off = 2131299414;

        /* renamed from: on */
        public static final int f2619on = 2131299417;
        public static final int parentPanel = 2131299493;
        public static final int progress_circular = 2131299616;
        public static final int progress_horizontal = 2131299617;
        public static final int radio = 2131299671;
        public static final int right_icon = 2131299901;
        public static final int right_side = 2131299902;
        public static final int satellite = 2131300020;
        public static final int screen = 2131300061;
        public static final int scrollIndicatorDown = 2131300064;
        public static final int scrollIndicatorUp = 2131300065;
        public static final int scrollView = 2131300066;
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
        public static final int spacer = 2131300247;
        public static final int split_action_bar = 2131300259;
        public static final int src_atop = 2131300273;
        public static final int src_in = 2131300274;
        public static final int src_over = 2131300275;
        public static final int standard = 2131300276;
        public static final int submenuarrow = 2131300304;
        public static final int submit_area = 2131300306;
        public static final int tabMode = 2131300347;
        public static final int tag_transition_group = 2131300355;
        public static final int tag_unhandled_key_event_manager = 2131300356;
        public static final int tag_unhandled_key_listeners = 2131300357;
        public static final int terrain = 2131300377;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int textSpacerNoButtons = 2131300383;
        public static final int textSpacerNoTitle = 2131300384;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public static final int titleDividerNoCustom = 2131300690;
        public static final int title_template = 2131300703;
        public static final int topPanel = 2131300719;
        public static final int uniform = 2131302087;

        /* renamed from: up */
        public static final int f2620up = 2131302096;
        public static final int webview = 2131302343;
        public static final int wide = 2131302348;
        public static final int window = 2131302350;
        public static final int wrap_content = 2131302363;

        public final void write(String str) {
            System.loadLibrary(str);
        }

        public final void read(String str) {
            System.load(str);
        }

        public final String IconCompatParcelizer(String str) {
            if (!str.startsWith("lib") || !str.endsWith(".so")) {
                return System.mapLibraryName(str);
            }
            return str;
        }

        public final String[] write() {
            if (Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0) {
                return Build.SUPPORTED_ABIS;
            }
            String str = Build.CPU_ABI2;
            if (!(str == null || str.length() == 0)) {
                return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
            }
            return new String[]{Build.CPU_ABI};
        }
    }

    /* renamed from: o.rsnAllocationRead1D$write */
    public static final class write {
        public static final int AlertDialog_AppCompat = 2131820545;
        public static final int AlertDialog_AppCompat_Light = 2131820546;
        public static final int Animation_AppCompat_Dialog = 2131820547;
        public static final int Animation_AppCompat_DropDownUp = 2131820548;
        public static final int Animation_AppCompat_Tooltip = 2131820549;
        public static final int Base_AlertDialog_AppCompat = 2131820578;
        public static final int Base_AlertDialog_AppCompat_Light = 2131820579;
        public static final int Base_Animation_AppCompat_Dialog = 2131820580;
        public static final int Base_Animation_AppCompat_DropDownUp = 2131820581;
        public static final int Base_Animation_AppCompat_Tooltip = 2131820582;
        public static final int Base_DialogWindowTitleBackground_AppCompat = 2131820585;
        public static final int Base_DialogWindowTitle_AppCompat = 2131820584;
        public static final int Base_TextAppearance_AppCompat = 2131820586;
        public static final int Base_TextAppearance_AppCompat_Body1 = 2131820587;
        public static final int Base_TextAppearance_AppCompat_Body2 = 2131820588;
        public static final int Base_TextAppearance_AppCompat_Button = 2131820589;
        public static final int Base_TextAppearance_AppCompat_Caption = 2131820590;
        public static final int Base_TextAppearance_AppCompat_Display1 = 2131820591;
        public static final int Base_TextAppearance_AppCompat_Display2 = 2131820592;
        public static final int Base_TextAppearance_AppCompat_Display3 = 2131820593;
        public static final int Base_TextAppearance_AppCompat_Display4 = 2131820594;
        public static final int Base_TextAppearance_AppCompat_Headline = 2131820595;
        public static final int Base_TextAppearance_AppCompat_Inverse = 2131820596;
        public static final int Base_TextAppearance_AppCompat_Large = 2131820597;
        public static final int Base_TextAppearance_AppCompat_Large_Inverse = 2131820598;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2131820599;
        public static final int Base_TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2131820600;
        public static final int Base_TextAppearance_AppCompat_Medium = 2131820601;
        public static final int Base_TextAppearance_AppCompat_Medium_Inverse = 2131820602;
        public static final int Base_TextAppearance_AppCompat_Menu = 2131820603;
        public static final int Base_TextAppearance_AppCompat_SearchResult = 2131820604;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Subtitle = 2131820605;
        public static final int Base_TextAppearance_AppCompat_SearchResult_Title = 2131820606;
        public static final int Base_TextAppearance_AppCompat_Small = 2131820607;
        public static final int Base_TextAppearance_AppCompat_Small_Inverse = 2131820608;
        public static final int Base_TextAppearance_AppCompat_Subhead = 2131820609;
        public static final int Base_TextAppearance_AppCompat_Subhead_Inverse = 2131820610;
        public static final int Base_TextAppearance_AppCompat_Title = 2131820611;
        public static final int Base_TextAppearance_AppCompat_Title_Inverse = 2131820612;
        public static final int Base_TextAppearance_AppCompat_Tooltip = 2131820613;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Menu = 2131820614;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2131820615;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2131820616;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title = 2131820617;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2131820618;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2131820619;
        public static final int Base_TextAppearance_AppCompat_Widget_ActionMode_Title = 2131820620;
        public static final int Base_TextAppearance_AppCompat_Widget_Button = 2131820621;
        public static final int Base_TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2131820622;
        public static final int Base_TextAppearance_AppCompat_Widget_Button_Colored = 2131820623;
        public static final int Base_TextAppearance_AppCompat_Widget_Button_Inverse = 2131820624;
        public static final int Base_TextAppearance_AppCompat_Widget_DropDownItem = 2131820625;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Header = 2131820626;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Large = 2131820627;
        public static final int Base_TextAppearance_AppCompat_Widget_PopupMenu_Small = 2131820628;
        public static final int Base_TextAppearance_AppCompat_Widget_Switch = 2131820629;
        public static final int Base_TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2131820630;
        public static final int Base_TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2131820631;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2131820632;
        public static final int Base_TextAppearance_Widget_AppCompat_Toolbar_Title = 2131820633;
        public static final int Base_ThemeOverlay_AppCompat = 2131820665;
        public static final int Base_ThemeOverlay_AppCompat_ActionBar = 2131820666;
        public static final int Base_ThemeOverlay_AppCompat_Dark = 2131820667;
        public static final int Base_ThemeOverlay_AppCompat_Dark_ActionBar = 2131820668;
        public static final int Base_ThemeOverlay_AppCompat_Dialog = 2131820669;
        public static final int Base_ThemeOverlay_AppCompat_Dialog_Alert = 2131820670;
        public static final int Base_ThemeOverlay_AppCompat_Light = 2131820671;
        public static final int Base_Theme_AppCompat = 2131820634;
        public static final int Base_Theme_AppCompat_CompactMenu = 2131820635;
        public static final int Base_Theme_AppCompat_Dialog = 2131820636;
        public static final int Base_Theme_AppCompat_DialogWhenLarge = 2131820640;
        public static final int Base_Theme_AppCompat_Dialog_Alert = 2131820637;
        public static final int Base_Theme_AppCompat_Dialog_FixedSize = 2131820638;
        public static final int Base_Theme_AppCompat_Dialog_MinWidth = 2131820639;
        public static final int Base_Theme_AppCompat_Light = 2131820641;
        public static final int Base_Theme_AppCompat_Light_DarkActionBar = 2131820642;
        public static final int Base_Theme_AppCompat_Light_Dialog = 2131820643;
        public static final int Base_Theme_AppCompat_Light_DialogWhenLarge = 2131820647;
        public static final int Base_Theme_AppCompat_Light_Dialog_Alert = 2131820644;
        public static final int Base_Theme_AppCompat_Light_Dialog_FixedSize = 2131820645;
        public static final int Base_Theme_AppCompat_Light_Dialog_MinWidth = 2131820646;
        public static final int Base_V21_ThemeOverlay_AppCompat_Dialog = 2131820687;
        public static final int Base_V21_Theme_AppCompat = 2131820683;
        public static final int Base_V21_Theme_AppCompat_Dialog = 2131820684;
        public static final int Base_V21_Theme_AppCompat_Light = 2131820685;
        public static final int Base_V21_Theme_AppCompat_Light_Dialog = 2131820686;
        public static final int Base_V22_Theme_AppCompat = 2131820688;
        public static final int Base_V22_Theme_AppCompat_Light = 2131820689;
        public static final int Base_V23_Theme_AppCompat = 2131820690;
        public static final int Base_V23_Theme_AppCompat_Light = 2131820691;
        public static final int Base_V26_Theme_AppCompat = 2131820692;
        public static final int Base_V26_Theme_AppCompat_Light = 2131820693;
        public static final int Base_V26_Widget_AppCompat_Toolbar = 2131820694;
        public static final int Base_V28_Theme_AppCompat = 2131820695;
        public static final int Base_V28_Theme_AppCompat_Light = 2131820696;
        public static final int Base_V7_ThemeOverlay_AppCompat_Dialog = 2131820701;
        public static final int Base_V7_Theme_AppCompat = 2131820697;
        public static final int Base_V7_Theme_AppCompat_Dialog = 2131820698;
        public static final int Base_V7_Theme_AppCompat_Light = 2131820699;
        public static final int Base_V7_Theme_AppCompat_Light_Dialog = 2131820700;
        public static final int Base_V7_Widget_AppCompat_AutoCompleteTextView = 2131820702;
        public static final int Base_V7_Widget_AppCompat_EditText = 2131820703;
        public static final int Base_V7_Widget_AppCompat_Toolbar = 2131820704;
        public static final int Base_Widget_AppCompat_ActionBar = 2131820705;
        public static final int Base_Widget_AppCompat_ActionBar_Solid = 2131820706;
        public static final int Base_Widget_AppCompat_ActionBar_TabBar = 2131820707;
        public static final int Base_Widget_AppCompat_ActionBar_TabText = 2131820708;
        public static final int Base_Widget_AppCompat_ActionBar_TabView = 2131820709;
        public static final int Base_Widget_AppCompat_ActionButton = 2131820710;
        public static final int Base_Widget_AppCompat_ActionButton_CloseMode = 2131820711;
        public static final int Base_Widget_AppCompat_ActionButton_Overflow = 2131820712;
        public static final int Base_Widget_AppCompat_ActionMode = 2131820713;
        public static final int Base_Widget_AppCompat_ActivityChooserView = 2131820714;
        public static final int Base_Widget_AppCompat_AutoCompleteTextView = 2131820715;
        public static final int Base_Widget_AppCompat_Button = 2131820716;
        public static final int Base_Widget_AppCompat_ButtonBar = 2131820722;
        public static final int Base_Widget_AppCompat_ButtonBar_AlertDialog = 2131820723;
        public static final int Base_Widget_AppCompat_Button_Borderless = 2131820717;
        public static final int Base_Widget_AppCompat_Button_Borderless_Colored = 2131820718;
        public static final int Base_Widget_AppCompat_Button_ButtonBar_AlertDialog = 2131820719;
        public static final int Base_Widget_AppCompat_Button_Colored = 2131820720;
        public static final int Base_Widget_AppCompat_Button_Small = 2131820721;
        public static final int Base_Widget_AppCompat_CompoundButton_CheckBox = 2131820724;
        public static final int Base_Widget_AppCompat_CompoundButton_RadioButton = 2131820725;
        public static final int Base_Widget_AppCompat_CompoundButton_Switch = 2131820726;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle = 2131820727;
        public static final int Base_Widget_AppCompat_DrawerArrowToggle_Common = 2131820728;
        public static final int Base_Widget_AppCompat_DropDownItem_Spinner = 2131820729;
        public static final int Base_Widget_AppCompat_EditText = 2131820730;
        public static final int Base_Widget_AppCompat_ImageButton = 2131820731;
        public static final int Base_Widget_AppCompat_Light_ActionBar = 2131820732;
        public static final int Base_Widget_AppCompat_Light_ActionBar_Solid = 2131820733;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabBar = 2131820734;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText = 2131820735;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2131820736;
        public static final int Base_Widget_AppCompat_Light_ActionBar_TabView = 2131820737;
        public static final int Base_Widget_AppCompat_Light_PopupMenu = 2131820738;
        public static final int Base_Widget_AppCompat_Light_PopupMenu_Overflow = 2131820739;
        public static final int Base_Widget_AppCompat_ListMenuView = 2131820740;
        public static final int Base_Widget_AppCompat_ListPopupWindow = 2131820741;
        public static final int Base_Widget_AppCompat_ListView = 2131820742;
        public static final int Base_Widget_AppCompat_ListView_DropDown = 2131820743;
        public static final int Base_Widget_AppCompat_ListView_Menu = 2131820744;
        public static final int Base_Widget_AppCompat_PopupMenu = 2131820745;
        public static final int Base_Widget_AppCompat_PopupMenu_Overflow = 2131820746;
        public static final int Base_Widget_AppCompat_PopupWindow = 2131820747;
        public static final int Base_Widget_AppCompat_ProgressBar = 2131820748;
        public static final int Base_Widget_AppCompat_ProgressBar_Horizontal = 2131820749;
        public static final int Base_Widget_AppCompat_RatingBar = 2131820750;
        public static final int Base_Widget_AppCompat_RatingBar_Indicator = 2131820751;
        public static final int Base_Widget_AppCompat_RatingBar_Small = 2131820752;
        public static final int Base_Widget_AppCompat_SearchView = 2131820753;
        public static final int Base_Widget_AppCompat_SearchView_ActionBar = 2131820754;
        public static final int Base_Widget_AppCompat_SeekBar = 2131820755;
        public static final int Base_Widget_AppCompat_SeekBar_Discrete = 2131820756;
        public static final int Base_Widget_AppCompat_Spinner = 2131820757;
        public static final int Base_Widget_AppCompat_Spinner_Underlined = 2131820758;
        public static final int Base_Widget_AppCompat_TextView_SpinnerItem = 2131820759;
        public static final int Base_Widget_AppCompat_Toolbar = 2131820760;
        public static final int Base_Widget_AppCompat_Toolbar_Button_Navigation = 2131820761;
        public static final int Platform_AppCompat = 2131820822;
        public static final int Platform_AppCompat_Light = 2131820823;
        public static final int Platform_ThemeOverlay_AppCompat = 2131820828;
        public static final int Platform_ThemeOverlay_AppCompat_Dark = 2131820829;
        public static final int Platform_ThemeOverlay_AppCompat_Light = 2131820830;
        public static final int Platform_V21_AppCompat = 2131820831;
        public static final int Platform_V21_AppCompat_Light = 2131820832;
        public static final int Platform_V25_AppCompat = 2131820833;
        public static final int Platform_V25_AppCompat_Light = 2131820834;
        public static final int Platform_Widget_AppCompat_Spinner = 2131820835;
        public static final int RtlOverlay_DialogWindowTitle_AppCompat = 2131820841;
        public static final int RtlOverlay_Widget_AppCompat_ActionBar_TitleItem = 2131820842;
        public static final int RtlOverlay_Widget_AppCompat_DialogTitle_Icon = 2131820843;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem = 2131820844;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_InternalGroup = 2131820845;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Shortcut = 2131820846;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_SubmenuArrow = 2131820847;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Text = 2131820848;
        public static final int RtlOverlay_Widget_AppCompat_PopupMenuItem_Title = 2131820849;
        public static final int RtlOverlay_Widget_AppCompat_SearchView_MagIcon = 2131820855;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown = 2131820850;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon1 = 2131820851;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Icon2 = 2131820852;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Query = 2131820853;
        public static final int RtlOverlay_Widget_AppCompat_Search_DropDown_Text = 2131820854;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton = 2131820856;
        public static final int RtlUnderlay_Widget_AppCompat_ActionButton_Overflow = 2131820857;
        public static final int TextAppearance_AppCompat = 2131820893;
        public static final int TextAppearance_AppCompat_Body1 = 2131820894;
        public static final int TextAppearance_AppCompat_Body2 = 2131820895;
        public static final int TextAppearance_AppCompat_Button = 2131820896;
        public static final int TextAppearance_AppCompat_Caption = 2131820897;
        public static final int TextAppearance_AppCompat_Display1 = 2131820898;
        public static final int TextAppearance_AppCompat_Display2 = 2131820899;
        public static final int TextAppearance_AppCompat_Display3 = 2131820900;
        public static final int TextAppearance_AppCompat_Display4 = 2131820901;
        public static final int TextAppearance_AppCompat_Headline = 2131820902;
        public static final int TextAppearance_AppCompat_Inverse = 2131820903;
        public static final int TextAppearance_AppCompat_Large = 2131820904;
        public static final int TextAppearance_AppCompat_Large_Inverse = 2131820905;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Subtitle = 2131820906;
        public static final int TextAppearance_AppCompat_Light_SearchResult_Title = 2131820907;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Large = 2131820908;
        public static final int TextAppearance_AppCompat_Light_Widget_PopupMenu_Small = 2131820909;
        public static final int TextAppearance_AppCompat_Medium = 2131820910;
        public static final int TextAppearance_AppCompat_Medium_Inverse = 2131820911;
        public static final int TextAppearance_AppCompat_Menu = 2131820912;
        public static final int TextAppearance_AppCompat_SearchResult_Subtitle = 2131820913;
        public static final int TextAppearance_AppCompat_SearchResult_Title = 2131820914;
        public static final int TextAppearance_AppCompat_Small = 2131820915;
        public static final int TextAppearance_AppCompat_Small_Inverse = 2131820916;
        public static final int TextAppearance_AppCompat_Subhead = 2131820917;
        public static final int TextAppearance_AppCompat_Subhead_Inverse = 2131820918;
        public static final int TextAppearance_AppCompat_Title = 2131820919;
        public static final int TextAppearance_AppCompat_Title_Inverse = 2131820920;
        public static final int TextAppearance_AppCompat_Tooltip = 2131820921;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Menu = 2131820922;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle = 2131820923;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Subtitle_Inverse = 2131820924;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title = 2131820925;
        public static final int TextAppearance_AppCompat_Widget_ActionBar_Title_Inverse = 2131820926;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle = 2131820927;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Subtitle_Inverse = 2131820928;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title = 2131820929;
        public static final int TextAppearance_AppCompat_Widget_ActionMode_Title_Inverse = 2131820930;
        public static final int TextAppearance_AppCompat_Widget_Button = 2131820931;
        public static final int TextAppearance_AppCompat_Widget_Button_Borderless_Colored = 2131820932;
        public static final int TextAppearance_AppCompat_Widget_Button_Colored = 2131820933;
        public static final int TextAppearance_AppCompat_Widget_Button_Inverse = 2131820934;
        public static final int TextAppearance_AppCompat_Widget_DropDownItem = 2131820935;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Header = 2131820936;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Large = 2131820937;
        public static final int TextAppearance_AppCompat_Widget_PopupMenu_Small = 2131820938;
        public static final int TextAppearance_AppCompat_Widget_Switch = 2131820939;
        public static final int TextAppearance_AppCompat_Widget_TextView_SpinnerItem = 2131820940;
        public static final int TextAppearance_Compat_Notification = 2131820941;
        public static final int TextAppearance_Compat_Notification_Info = 2131820942;
        public static final int TextAppearance_Compat_Notification_Line2 = 2131820944;
        public static final int TextAppearance_Compat_Notification_Time = 2131820947;
        public static final int TextAppearance_Compat_Notification_Title = 2131820949;
        public static final int TextAppearance_Widget_AppCompat_ExpandedMenu_Item = 2131820977;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Subtitle = 2131820978;
        public static final int TextAppearance_Widget_AppCompat_Toolbar_Title = 2131820979;
        public static final int ThemeOverlay_AppCompat = 2131821174;
        public static final int ThemeOverlay_AppCompat_ActionBar = 2131821175;
        public static final int ThemeOverlay_AppCompat_Dark = 2131821176;
        public static final int ThemeOverlay_AppCompat_Dark_ActionBar = 2131821177;
        public static final int ThemeOverlay_AppCompat_Dialog = 2131821178;
        public static final int ThemeOverlay_AppCompat_Dialog_Alert = 2131821179;
        public static final int ThemeOverlay_AppCompat_Light = 2131821180;
        public static final int Theme_AppCompat = 2131821125;
        public static final int Theme_AppCompat_CompactMenu = 2131821126;
        public static final int Theme_AppCompat_DayNight = 2131821127;
        public static final int Theme_AppCompat_DayNight_DarkActionBar = 2131821128;
        public static final int Theme_AppCompat_DayNight_Dialog = 2131821129;
        public static final int Theme_AppCompat_DayNight_DialogWhenLarge = 2131821132;
        public static final int Theme_AppCompat_DayNight_Dialog_Alert = 2131821130;
        public static final int Theme_AppCompat_DayNight_Dialog_MinWidth = 2131821131;
        public static final int Theme_AppCompat_DayNight_NoActionBar = 2131821133;
        public static final int Theme_AppCompat_Dialog = 2131821134;
        public static final int Theme_AppCompat_DialogWhenLarge = 2131821137;
        public static final int Theme_AppCompat_Dialog_Alert = 2131821135;
        public static final int Theme_AppCompat_Dialog_MinWidth = 2131821136;
        public static final int Theme_AppCompat_Light = 2131821138;
        public static final int Theme_AppCompat_Light_DarkActionBar = 2131821139;
        public static final int Theme_AppCompat_Light_Dialog = 2131821140;
        public static final int Theme_AppCompat_Light_DialogWhenLarge = 2131821143;
        public static final int Theme_AppCompat_Light_Dialog_Alert = 2131821141;
        public static final int Theme_AppCompat_Light_Dialog_MinWidth = 2131821142;
        public static final int Theme_AppCompat_Light_NoActionBar = 2131821144;
        public static final int Theme_AppCompat_NoActionBar = 2131821145;
        public static final int Widget_AppCompat_ActionBar = 2131821262;
        public static final int Widget_AppCompat_ActionBar_Solid = 2131821263;
        public static final int Widget_AppCompat_ActionBar_TabBar = 2131821264;
        public static final int Widget_AppCompat_ActionBar_TabText = 2131821265;
        public static final int Widget_AppCompat_ActionBar_TabView = 2131821266;
        public static final int Widget_AppCompat_ActionButton = 2131821267;
        public static final int Widget_AppCompat_ActionButton_CloseMode = 2131821268;
        public static final int Widget_AppCompat_ActionButton_Overflow = 2131821269;
        public static final int Widget_AppCompat_ActionMode = 2131821270;
        public static final int Widget_AppCompat_ActivityChooserView = 2131821271;
        public static final int Widget_AppCompat_AutoCompleteTextView = 2131821272;
        public static final int Widget_AppCompat_Button = 2131821273;
        public static final int Widget_AppCompat_ButtonBar = 2131821279;
        public static final int Widget_AppCompat_ButtonBar_AlertDialog = 2131821280;
        public static final int Widget_AppCompat_Button_Borderless = 2131821274;
        public static final int Widget_AppCompat_Button_Borderless_Colored = 2131821275;
        public static final int Widget_AppCompat_Button_ButtonBar_AlertDialog = 2131821276;
        public static final int Widget_AppCompat_Button_Colored = 2131821277;
        public static final int Widget_AppCompat_Button_Small = 2131821278;
        public static final int Widget_AppCompat_CompoundButton_CheckBox = 2131821281;
        public static final int Widget_AppCompat_CompoundButton_RadioButton = 2131821282;
        public static final int Widget_AppCompat_CompoundButton_Switch = 2131821283;
        public static final int Widget_AppCompat_DrawerArrowToggle = 2131821284;
        public static final int Widget_AppCompat_DropDownItem_Spinner = 2131821285;
        public static final int Widget_AppCompat_EditText = 2131821286;
        public static final int Widget_AppCompat_ImageButton = 2131821287;
        public static final int Widget_AppCompat_Light_ActionBar = 2131821288;
        public static final int Widget_AppCompat_Light_ActionBar_Solid = 2131821289;
        public static final int Widget_AppCompat_Light_ActionBar_Solid_Inverse = 2131821290;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar = 2131821291;
        public static final int Widget_AppCompat_Light_ActionBar_TabBar_Inverse = 2131821292;
        public static final int Widget_AppCompat_Light_ActionBar_TabText = 2131821293;
        public static final int Widget_AppCompat_Light_ActionBar_TabText_Inverse = 2131821294;
        public static final int Widget_AppCompat_Light_ActionBar_TabView = 2131821295;
        public static final int Widget_AppCompat_Light_ActionBar_TabView_Inverse = 2131821296;
        public static final int Widget_AppCompat_Light_ActionButton = 2131821297;
        public static final int Widget_AppCompat_Light_ActionButton_CloseMode = 2131821298;
        public static final int Widget_AppCompat_Light_ActionButton_Overflow = 2131821299;
        public static final int Widget_AppCompat_Light_ActionMode_Inverse = 2131821300;
        public static final int Widget_AppCompat_Light_ActivityChooserView = 2131821301;
        public static final int Widget_AppCompat_Light_AutoCompleteTextView = 2131821302;
        public static final int Widget_AppCompat_Light_DropDownItem_Spinner = 2131821303;
        public static final int Widget_AppCompat_Light_ListPopupWindow = 2131821304;
        public static final int Widget_AppCompat_Light_ListView_DropDown = 2131821305;
        public static final int Widget_AppCompat_Light_PopupMenu = 2131821306;
        public static final int Widget_AppCompat_Light_PopupMenu_Overflow = 2131821307;
        public static final int Widget_AppCompat_Light_SearchView = 2131821308;
        public static final int Widget_AppCompat_Light_Spinner_DropDown_ActionBar = 2131821309;
        public static final int Widget_AppCompat_ListMenuView = 2131821310;
        public static final int Widget_AppCompat_ListPopupWindow = 2131821311;
        public static final int Widget_AppCompat_ListView = 2131821312;
        public static final int Widget_AppCompat_ListView_DropDown = 2131821313;
        public static final int Widget_AppCompat_ListView_Menu = 2131821314;
        public static final int Widget_AppCompat_PopupMenu = 2131821315;
        public static final int Widget_AppCompat_PopupMenu_Overflow = 2131821316;
        public static final int Widget_AppCompat_PopupWindow = 2131821317;
        public static final int Widget_AppCompat_ProgressBar = 2131821318;
        public static final int Widget_AppCompat_ProgressBar_Horizontal = 2131821319;
        public static final int Widget_AppCompat_RatingBar = 2131821320;
        public static final int Widget_AppCompat_RatingBar_Indicator = 2131821321;
        public static final int Widget_AppCompat_RatingBar_Small = 2131821322;
        public static final int Widget_AppCompat_SearchView = 2131821323;
        public static final int Widget_AppCompat_SearchView_ActionBar = 2131821324;
        public static final int Widget_AppCompat_SeekBar = 2131821325;
        public static final int Widget_AppCompat_SeekBar_Discrete = 2131821326;
        public static final int Widget_AppCompat_Spinner = 2131821327;
        public static final int Widget_AppCompat_Spinner_DropDown = 2131821328;
        public static final int Widget_AppCompat_Spinner_DropDown_ActionBar = 2131821329;
        public static final int Widget_AppCompat_Spinner_Underlined = 2131821330;
        public static final int Widget_AppCompat_TextView_SpinnerItem = 2131821331;
        public static final int Widget_AppCompat_Toolbar = 2131821332;
        public static final int Widget_AppCompat_Toolbar_Button_Navigation = 2131821333;
        public static final int Widget_Compat_NotificationActionContainer = 2131821334;
        public static final int Widget_Compat_NotificationActionText = 2131821335;
        public static final int amu_Bubble_TextAppearance_Dark = 2131821383;
        public static final int amu_Bubble_TextAppearance_Light = 2131821384;
        public static final int amu_ClusterIcon_TextAppearance = 2131821385;
        public float IconCompatParcelizer = 1.0f;
        public ValueAnimator.AnimatorUpdateListener MediaBrowserCompat$CustomActionResultReceiver;
        public float MediaBrowserCompat$ItemReceiver = 1.0f;

        public write() {
        }

        public write(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.MediaBrowserCompat$CustomActionResultReceiver = animatorUpdateListener;
        }
    }

    public rsnAllocationRead1D() {
    }

    public static byte[] IconCompatParcelizer(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >>> (56 - (i2 << 3)));
        }
        return bArr;
    }

    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) ((j >>> (56 - (i << 3))) & 255));
        }
        return bArr;
    }

    public rsnAllocationRead1D(int i, createFromBitmapResource createfrombitmapresource) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = createfrombitmapresource;
    }

    public final String toString() {
        createFromBitmapResource createfrombitmapresource = this.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver2 = createfrombitmapresource.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer));
            sb.append(" (unable to formulate description)");
            MediaBrowserCompat$CustomActionResultReceiver2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
        sb2.append("] ");
        sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(this.IconCompatParcelizer));
        sb2.append(" - ");
        sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
        return sb2.toString();
    }
}
