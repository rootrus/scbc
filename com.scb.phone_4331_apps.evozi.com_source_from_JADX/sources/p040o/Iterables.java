package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.TypeCastException;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jmrtd.lds.ImageInfo;
import p040o.nAllocationGetStride;
import p040o.nAllocationRead2D;
import p040o.nAllocationSetSurface;

/* renamed from: o.Iterables */
public final class Iterables {
    @SerializedName("transferId")
    public String MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.Iterables$12 */
    public interface C352212 {
        String IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(String str);

        String write();
    }

    /* renamed from: o.Iterables$8 */
    public final /* synthetic */ class C35328 {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getShortName.values().length];
            write = iArr;
            iArr[getShortName.TYPE_SAVING.ordinal()] = 1;
            write[getShortName.TYPE_CURRENT.ordinal()] = 2;
            write[getShortName.TYPE_FIXED.ordinal()] = 3;
            write[getShortName.TYPE_LONG_TERM.ordinal()] = 4;
            write[getShortName.TYPE_UNKNOWN.ordinal()] = 5;
        }
    }

    /* renamed from: o.Iterables$IterableWithToString */
    public final class IterableWithToString implements Comparator<String> {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return write((String) obj, (String) obj2);
        }

        public static int write(String str, String str2) {
            boolean z = false;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) str2)) {
                return 0;
            }
            if (str2 != null) {
                if (!(str2.length() == 0)) {
                    if (str != null) {
                        if (str.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            return str.compareTo(str2);
                        }
                    }
                    return 1;
                }
            }
            return -1;
        }
    }

    /* renamed from: o.Iterables$10 */
    public class C351810 {
        public final String IconCompatParcelizer;
        public final String write;

        private C351810() {
        }

        public static final MultipartBody.Part MediaBrowserCompat$ItemReceiver(String str, String str2) {
            String str3;
            MediaType mediaType;
            onGetStartedClick.write((Object) str, "apiParameterName");
            onGetStartedClick.write((Object) str2, "imagePath");
            File file = new File(str2);
            RequestBody.Companion companion = RequestBody.Companion;
            int MediaBrowserCompat$ItemReceiver = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str2, '.', 0, 6) + 1;
            if (MediaBrowserCompat$ItemReceiver >= str2.length()) {
                str3 = "";
            } else if (str2 != null) {
                str3 = str2.substring(MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) str3, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            int hashCode = str3.hashCode();
            if (hashCode != 105441) {
                if (hashCode != 111145) {
                    if (hashCode == 114833 && str3.equals("tif")) {
                        mediaType = MediaType.Companion.parse("image/tiff");
                        return MultipartBody.Part.Companion.createFormData(str, read(file), companion.create(mediaType, file));
                    }
                } else if (str3.equals("png")) {
                    mediaType = MediaType.Companion.parse("image/png");
                    return MultipartBody.Part.Companion.createFormData(str, read(file), companion.create(mediaType, file));
                }
            } else if (str3.equals("jpg")) {
                mediaType = MediaType.Companion.parse(ImageInfo.JPEG_MIME_TYPE);
                return MultipartBody.Part.Companion.createFormData(str, read(file), companion.create(mediaType, file));
            }
            mediaType = MediaType.Companion.parse("application/pdf");
            return MultipartBody.Part.Companion.createFormData(str, read(file), companion.create(mediaType, file));
        }

        private static String read(File file) {
            String name = file.getName();
            onGetStartedClick.write((Object) file, "$this$extension");
            String name2 = file.getName();
            onGetStartedClick.IconCompatParcelizer((Object) name2, "name");
            String MediaBrowserCompat$ItemReceiver = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(name2, '.', "");
            if (!GoodToKnowActivity.read(MediaBrowserCompat$ItemReceiver)) {
                StringBuilder sb = new StringBuilder();
                sb.append(".");
                sb.append(MediaBrowserCompat$ItemReceiver);
                MediaBrowserCompat$ItemReceiver = sb.toString();
                onGetStartedClick.IconCompatParcelizer((Object) name, "fileName");
                name = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(name, MediaBrowserCompat$ItemReceiver, name);
            }
            int i = 0;
            int length = name.length();
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt = name.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                }
            }
            name = "temp";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(MediaBrowserCompat$ItemReceiver);
            return sb2.toString();
        }

        public static final RequestBody MediaBrowserCompat$CustomActionResultReceiver(String str) {
            onGetStartedClick.write((Object) str, "filePath");
            File file = new File(str);
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType parse = MediaType.Companion.parse("text/plain");
            String name = file.getName();
            onGetStartedClick.IconCompatParcelizer((Object) name, "file.name");
            return companion.create(parse, name);
        }

        public C351810(String str, String str2) {
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    /* renamed from: o.Iterables$9 */
    public class C35339 {
        public final ChequeInquiryDeepLinkActivity MediaBrowserCompat$ItemReceiver;

        public C35339() {
            this((byte) 0);
        }

        public /* synthetic */ C35339(byte b) {
            this(new ChequeInquiryDeepLinkActivity());
        }

        private C35339(ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity) {
            onGetStartedClick.write((Object) chequeInquiryDeepLinkActivity, "disposables");
            this.MediaBrowserCompat$ItemReceiver = chequeInquiryDeepLinkActivity;
        }

        public void IconCompatParcelizer() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final <R, P extends C4602xca7af99c> void IconCompatParcelizer(frequency<R, ? super P> frequency, FundFactSheetActivity<? super R, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity2, P p) {
            onGetStartedClick.write((Object) frequency, "useCase");
            onGetStartedClick.write((Object) fundFactSheetActivity, "onSuccess");
            onGetStartedClick.write((Object) fundFactSheetActivity2, "onError");
            onGetStartedClick.write((Object) p, "params");
            frequency.IconCompatParcelizer(fundFactSheetActivity, fundFactSheetActivity2, p, this.MediaBrowserCompat$ItemReceiver);
        }

        public final <R, P extends C4602xca7af99c, D> void MediaBrowserCompat$ItemReceiver(frequency<R, ? super P> frequency, FundFactSheetActivity<? super D, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity2, P p, FundFactSheetActivity<? super R, ? extends D> fundFactSheetActivity3) {
            onGetStartedClick.write((Object) frequency, "useCase");
            onGetStartedClick.write((Object) fundFactSheetActivity, "onSuccess");
            onGetStartedClick.write((Object) fundFactSheetActivity2, "onError");
            onGetStartedClick.write((Object) p, "params");
            onGetStartedClick.write((Object) fundFactSheetActivity3, "transform");
            frequency.read(fundFactSheetActivity, fundFactSheetActivity2, p, fundFactSheetActivity3, this.MediaBrowserCompat$ItemReceiver);
        }

        public final <P extends C4602xca7af99c> void MediaBrowserCompat$ItemReceiver(any<? super P> any, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, P p) {
            onGetStartedClick.write((Object) any, "useCase");
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "onComplete");
            onGetStartedClick.write((Object) fundFactSheetActivity, "onError");
            onGetStartedClick.write((Object) p, "params");
            any.MediaBrowserCompat$ItemReceiver(fundActionsSuccessActivity, fundFactSheetActivity, p, this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.Iterables$ConsumingQueueIterator */
    public final class ConsumingQueueIterator extends C35339 {
        public final NullsFirstOrdering IconCompatParcelizer;
        public final setActive MediaBrowserCompat$CustomActionResultReceiver;
        private final onDone read;
        public final EngineManager write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public ConsumingQueueIterator(EngineManager engineManager, onDone ondone, setActive setactive, NullsFirstOrdering nullsFirstOrdering) {
            super((byte) 0);
            onGetStartedClick.write((Object) engineManager, "useCase");
            onGetStartedClick.write((Object) ondone, "poseUseCase");
            onGetStartedClick.write((Object) setactive, "featureUseCase");
            onGetStartedClick.write((Object) nullsFirstOrdering, "featureAccountDisplayMapper");
            this.write = engineManager;
            this.read = ondone;
            this.MediaBrowserCompat$CustomActionResultReceiver = setactive;
            this.IconCompatParcelizer = nullsFirstOrdering;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(FundFactSheetActivity<? super Boolean, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity2, clearValue clearvalue) {
            onGetStartedClick.write((Object) fundFactSheetActivity, "onSuccess");
            onGetStartedClick.write((Object) fundFactSheetActivity2, "onError");
            onGetStartedClick.write((Object) clearvalue, "request");
            IconCompatParcelizer(this.read, fundFactSheetActivity, fundFactSheetActivity2, new onDone$MediaBrowserCompat$ItemReceiver(clearvalue));
        }
    }

    /* renamed from: o.Iterables$3 */
    public final class C35273 implements nAllocationRead2D.write {
        private final ZHPR2 write;

        /* renamed from: o.Iterables$3$read */
        public static final class read implements nAllocationGetStride.write {
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
            public static final int belt_gray = 2131099682;
            public static final int black = 2131099683;
            public static final int black80 = 2131099684;
            public static final int black_alpha_10 = 2131099685;
            public static final int black_alpha_30 = 2131099686;
            public static final int black_transparent = 2131099688;
            public static final int black_transparent_alpha75 = 2131099689;
            public static final int bottom_bar_background = 2131099690;
            public static final int bright_foreground_disabled_material_dark = 2131099691;
            public static final int bright_foreground_disabled_material_light = 2131099692;
            public static final int bright_foreground_inverse_material_dark = 2131099693;
            public static final int bright_foreground_inverse_material_light = 2131099694;
            public static final int bright_foreground_material_dark = 2131099695;
            public static final int bright_foreground_material_light = 2131099696;
            public static final int button_material_dark = 2131099701;
            public static final int button_material_light = 2131099702;
            public static final int calendar_day_text_color = 2131099703;
            public static final int cardview_dark_background = 2131099705;
            public static final int cardview_light_background = 2131099706;
            public static final int cardview_shadow_end_color = 2131099707;
            public static final int cardview_shadow_start_color = 2131099708;
            public static final int colorAccent = 2131099711;
            public static final int colorGray01 = 2131099712;
            public static final int colorGray02 = 2131099713;
            public static final int colorGray03 = 2131099714;
            public static final int colorPrimary = 2131099715;
            public static final int colorPrimaryDark = 2131099716;
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
            public static final int crop_document_green = 2131099729;
            public static final int crop_grey = 2131099730;
            public static final int dark_gray = 2131099731;
            public static final int dark_gray_accent = 2131099732;
            public static final int dark_purple = 2131099733;
            public static final int dark_purple_alpha_40 = 2131099734;
            public static final int dark_red = 2131099735;
            public static final int dark_unlink_red = 2131099736;
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
            public static final int detect_document_green = 2131099751;
            public static final int dialog_text_color = 2131099752;
            public static final int dim_foreground_disabled_material_dark = 2131099753;
            public static final int dim_foreground_disabled_material_light = 2131099754;
            public static final int dim_foreground_material_dark = 2131099755;
            public static final int dim_foreground_material_light = 2131099756;
            public static final int disabled_text_grey = 2131099757;
            public static final int discover_grey = 2131099758;
            public static final int empty_accounts_red = 2131099759;
            public static final int end_point_light_gray = 2131099760;
            public static final int error = 2131099761;
            public static final int error_color_material_dark = 2131099762;
            public static final int error_color_material_light = 2131099763;
            public static final int fake_black = 2131099764;
            public static final int fake_black_alpha_30 = 2131099765;
            public static final int fake_black_alpha_40 = 2131099766;
            public static final int fake_black_alpha_85 = 2131099767;
            public static final int fake_white = 2131099768;
            public static final int fake_white_alpha_40 = 2131099769;
            public static final int font_point_purple = 2131099770;
            public static final int foreground_material_dark = 2131099771;
            public static final int foreground_material_light = 2131099772;
            public static final int gray = 2131099773;
            public static final int gray_darker = 2131099774;
            public static final int grey = 2131099776;
            public static final int highlighted_text_material_dark = 2131099777;
            public static final int highlighted_text_material_light = 2131099778;
            public static final int in_dark_blue = 2131099779;
            public static final int in_light_blue = 2131099780;
            public static final int in_light_green = 2131099781;
            public static final int in_red = 2131099782;
            public static final int in_yellow = 2131099783;
            public static final int insights = 2131099784;
            public static final int insurance_indicator_select = 2131099785;
            public static final int insurance_indicator_unselected = 2131099786;
            public static final int justforyou_insight_header_bubble_background = 2131099787;
            public static final int justforyou_profile_border_active_high = 2131099788;
            public static final int justforyou_profile_border_active_low = 2131099789;
            public static final int justforyou_profile_border_active_medium = 2131099790;
            public static final int justforyou_profile_border_inactive_high = 2131099791;
            public static final int justforyou_profile_border_inactive_low = 2131099792;
            public static final int justforyou_profile_border_inactive_medium = 2131099793;
            public static final int justforyou_today_insights_background_bottom = 2131099794;
            public static final int justforyou_today_insights_background_top = 2131099795;
            public static final int light_gray = 2131099796;
            public static final int light_gray_alpha_40 = 2131099797;
            public static final int light_green = 2131099798;
            public static final int light_grey = 2131099799;
            public static final int light_purple = 2131099800;
            public static final int light_red = 2131099801;
            public static final int lighter_gray = 2131099802;
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
            public static final int mcv_border_color = 2131099815;
            public static final int mcv_text_date_dark = 2131099816;
            public static final int mcv_text_date_light = 2131099817;
            public static final int middle_point_dark = 2131099818;
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
            public static final int mw_gray_icon = 2131099845;
            public static final int mw_success_green = 2131099846;
            public static final int new_badge_red = 2131099847;
            public static final int notification_action_color_filter = 2131099848;
            public static final int notification_icon_bg_color = 2131099849;
            public static final int notification_material_background_media_default_color = 2131099850;
            public static final int ntb_image_background_coach_mark = 2131099851;
            public static final int order_cheque_contact = 2131099852;
            public static final int point_bottom_gray_50 = 2131099859;
            public static final int point_left_gray_75 = 2131099860;
            public static final int point_right_gray_25 = 2131099861;
            public static final int point_top_purple = 2131099862;
            public static final int primary_dark_material_dark = 2131099863;
            public static final int primary_dark_material_light = 2131099864;
            public static final int primary_material_dark = 2131099865;
            public static final int primary_material_light = 2131099866;
            public static final int primary_text_default_material_dark = 2131099867;
            public static final int primary_text_default_material_light = 2131099868;
            public static final int primary_text_disabled_material_dark = 2131099869;
            public static final int primary_text_disabled_material_light = 2131099870;
            public static final int red = 2131099871;
            public static final int red_alpha_20 = 2131099872;
            public static final int relative_qr_background = 2131099873;
            public static final int remittance_request_yellow = 2131099874;
            public static final int ripple_material_dark = 2131099875;
            public static final int ripple_material_light = 2131099876;
            public static final int risk_green = 2131099877;
            public static final int risk_red = 2131099878;
            public static final int risk_yellow = 2131099879;
            public static final int scb_light_purple = 2131099880;
            public static final int scb_purple = 2131099881;
            public static final int scb_purple_alpha_20 = 2131099882;
            public static final int scb_purple_alpha_60 = 2131099883;
            public static final int scb_yellow = 2131099884;
            public static final int scbs_green = 2131099885;
            public static final int scbs_investment_grey = 2131099886;
            public static final int scbs_other_investment_blue = 2131099887;
            public static final int secondaryColorAccent = 2131099888;
            public static final int secondaryColorPrimary = 2131099889;
            public static final int secondaryColorPrimaryDark = 2131099890;
            public static final int secondary_text_default_material_dark = 2131099891;
            public static final int secondary_text_default_material_light = 2131099892;
            public static final int secondary_text_disabled_material_dark = 2131099893;
            public static final int secondary_text_disabled_material_light = 2131099894;
            public static final int submission_dark_grey = 2131099895;
            public static final int success = 2131099896;
            public static final int switch_thumb_disabled_material_dark = 2131099897;
            public static final int switch_thumb_disabled_material_light = 2131099898;
            public static final int switch_thumb_material_dark = 2131099899;
            public static final int switch_thumb_material_light = 2131099900;
            public static final int switch_thumb_normal_material_dark = 2131099901;
            public static final int switch_thumb_normal_material_light = 2131099902;
            public static final int text_color = 2131099903;
            public static final int text_color_button_accept_decline = 2131099904;
            public static final int text_color_button_outline = 2131099905;
            public static final int tooltip_background_dark = 2131100252;
            public static final int tooltip_background_light = 2131100253;
            public static final int transparent = 2131100254;
            public static final int warm_yellow = 2131100255;
            public static final int warning = 2131100256;
            public static final int white = 2131100257;
            public static final int white_alpha_40 = 2131100258;
            public static final int white_alpha_60 = 2131100259;
            public static final int white_alpha_75 = 2131100260;
            public static final int white_alpha_90 = 2131100261;
            public static final int yellow = 2131100262;
            public static final int zxing_custom_possible_result_points = 2131100263;
            public static final int zxing_custom_result_view = 2131100264;
            public static final int zxing_custom_viewfinder_laser = 2131100265;
            public static final int zxing_custom_viewfinder_mask = 2131100266;
            public static final int zxing_possible_result_points = 2131100267;
            public static final int zxing_result_view = 2131100268;
            public static final int zxing_status_text = 2131100269;
            public static final int zxing_transparent = 2131100270;
            public static final int zxing_viewfinder_laser = 2131100271;
            public static final int zxing_viewfinder_mask = 2131100272;
            private final RenderScript IconCompatParcelizer;
            private final nAllocationGetStride write;

            public read() {
            }

            public static PorterDuff.Mode read(int i) {
                if (i == 3) {
                    return PorterDuff.Mode.SRC_OVER;
                }
                if (i == 5) {
                    return PorterDuff.Mode.SRC_IN;
                }
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    case 16:
                        return PorterDuff.Mode.ADD;
                    default:
                        return null;
                }
            }

            public read(nAllocationGetStride nallocationgetstride, RenderScript renderScript) {
                this.write = nallocationgetstride;
                this.IconCompatParcelizer = renderScript;
            }

            public final Object read(Object obj) {
                nAllocationGetStride nallocationgetstride = this.write;
                RenderScript renderScript = this.IconCompatParcelizer;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ArrayList arrayList = new ArrayList();
                Long MediaBrowserCompat$CustomActionResultReceiver = nAllocationGetStride.MediaBrowserCompat$CustomActionResultReceiver(sQLiteDatabase, renderScript);
                if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    nAllocationGetStride.MediaBrowserCompat$ItemReceiver(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{MediaBrowserCompat$CustomActionResultReceiver.toString()}, (String) null, (String) null, (String) null, String.valueOf(nallocationgetstride.MediaBrowserCompat$CustomActionResultReceiver.read())), new RttiJsonBill_MembersInjector(nallocationgetstride, arrayList, renderScript));
                }
                return nAllocationGetStride.MediaBrowserCompat$CustomActionResultReceiver((List<nAllocationIoReceive>) arrayList, nAllocationGetStride.write(sQLiteDatabase, (List<nAllocationIoReceive>) arrayList));
            }
        }

        public C35273() {
        }

        public static void read(AnimatorSet animatorSet, List<Animator> list) {
            int size = list.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                Animator animator = list.get(i);
                j = Math.max(j, animator.getStartDelay() + animator.getDuration());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
            ofInt.setDuration(j);
            list.add(0, ofInt);
            animatorSet.playTogether(list);
        }

        /* renamed from: o.Iterables$3$RatingCompat */
        public static final class RatingCompat {
            private static final Iterables$3$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver = new Iterables$3$MediaBrowserCompat$CustomActionResultReceiver();
            private static final Iterables$3$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new Iterables$3$MediaBrowserCompat$ItemReceiver();
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
            public static final int activity_blank_dummy = 2131492906;
            public static final int amu_info_window = 2131493253;
            public static final int amu_text_bubble = 2131493254;
            public static final int amu_webview = 2131493255;
            public static final int custom_dialog = 2131493392;
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
            public static final int layout_bulk_transfer_individual_screenshot = 2131494335;
            public static final int layout_bulk_transfer_individual_screenshot_content = 2131494336;
            public static final int layout_bulk_transfer_summary_screenshot = 2131494338;
            public static final int layout_bulk_transfer_summary_screenshot_content = 2131494339;
            public static final int layout_bulk_transfer_summary_screenshot_item = 2131494340;
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
            public static final int zxing_barcode_scanner = 2131494525;
            public static final int zxing_capture = 2131494526;
            public Iterables$3$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
            public Iterables$3$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
            public Iterables$3$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
            public Iterables$3$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
            public Iterables$3$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
            public Iterables$3$MediaBrowserCompat$CustomActionResultReceiver RatingCompat;
            public Iterables$3$MediaBrowserCompat$ItemReceiver read;
            public Iterables$3$MediaBrowserCompat$ItemReceiver write;

            public RatingCompat() {
                Iterables$3$MediaBrowserCompat$ItemReceiver iterables$3$MediaBrowserCompat$ItemReceiver = MediaMetadataCompat;
                this.MediaDescriptionCompat = iterables$3$MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$MediaItem = iterables$3$MediaBrowserCompat$ItemReceiver;
                this.write = iterables$3$MediaBrowserCompat$ItemReceiver;
                this.read = iterables$3$MediaBrowserCompat$ItemReceiver;
                Iterables$3$MediaBrowserCompat$CustomActionResultReceiver iterables$3$MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$SearchResultReceiver;
                this.RatingCompat = iterables$3$MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$ItemReceiver = iterables$3$MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = iterables$3$MediaBrowserCompat$CustomActionResultReceiver;
                this.IconCompatParcelizer = iterables$3$MediaBrowserCompat$CustomActionResultReceiver;
            }
        }

        public C35273(ZHPR2 zhpr2) {
            this.write = zhpr2;
        }

        /* renamed from: o.Iterables$3$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements nAllocationGetStride.IconCompatParcelizer {
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
            public static final int abc_tooltip_enter = 2130771978;
            public static final int abc_tooltip_exit = 2130771979;
            public static final int animation_localization_activity_transition_in = 2130771980;
            public static final int animation_localization_activity_transition_out = 2130771981;
            public static final int design_bottom_sheet_slide_in = 2130771985;
            public static final int design_bottom_sheet_slide_out = 2130771986;
            public static final int design_snackbar_in = 2130771987;
            public static final int design_snackbar_out = 2130771988;
            public static final int[] write = {16843848};
            private final nAllocationIoSend MediaBrowserCompat$ItemReceiver;

            IconCompatParcelizer() {
            }

            public static void write(View view, float f) {
                int integer = view.getResources().getInteger(nAllocationSetSurface.MediaMetadataCompat.app_bar_elevation_anim_duration);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = (long) integer;
                stateListAnimator.addState(new int[]{16842766, nAllocationSetSurface.read.state_liftable, -nAllocationSetSurface.read.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
                stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
                view.setStateListAnimator(stateListAnimator);
            }

            public IconCompatParcelizer(nAllocationIoSend nallocationiosend) {
                this.MediaBrowserCompat$ItemReceiver = nallocationiosend;
            }

            public final Object MediaBrowserCompat$ItemReceiver() {
                return this.MediaBrowserCompat$ItemReceiver.getWritableDatabase();
            }
        }

        /* renamed from: o.Iterables$3$write */
        public static final class write implements nAllocationGetStride.write {
            private static final ThreadLocal<RectF> MediaBrowserCompat$CustomActionResultReceiver = new ThreadLocal<>();
            public static final int environment_dev_base_assets_url = 2130903044;
            public static final int environment_dev_base_static_url = 2130903045;
            public static final int environment_dev_base_url = 2130903046;
            public static final int hml_occupation_months = 2130903051;
            public static final int hml_occupation_years = 2130903052;
            public static final int months = 2130903061;
            public static final int months_number = 2130903062;
            private static final ThreadLocal<Matrix> write = new ThreadLocal<>();
            private final long IconCompatParcelizer;
            private final RenderScript read;

            public write() {
            }

            private static void read(ViewParent viewParent, View view, Matrix matrix) {
                ViewParent parent = view.getParent();
                if ((parent instanceof View) && parent != viewParent) {
                    View view2 = (View) parent;
                    read(viewParent, view2, matrix);
                    matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                }
                matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
                if (!view.getMatrix().isIdentity()) {
                    matrix.preConcat(view.getMatrix());
                }
            }

            public static void read(ViewGroup viewGroup, View view, Rect rect) {
                Matrix matrix = write.get();
                if (matrix == null) {
                    matrix = new Matrix();
                    write.set(matrix);
                } else {
                    matrix.reset();
                }
                read((ViewParent) viewGroup, view, matrix);
                RectF rectF = MediaBrowserCompat$CustomActionResultReceiver.get();
                if (rectF == null) {
                    rectF = new RectF();
                    MediaBrowserCompat$CustomActionResultReceiver.set(rectF);
                }
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            }

            public write(long j, RenderScript renderScript) {
                this.IconCompatParcelizer = j;
                this.read = renderScript;
            }

            public final Object read(Object obj) {
                long j = this.IconCompatParcelizer;
                RenderScript renderScript = this.read;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{renderScript.write(), String.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read()))}) <= 0) {
                    contentValues.put("backend_name", renderScript.write());
                    contentValues.put("priority", Integer.valueOf(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(renderScript.read())));
                    sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                return null;
            }
        }

        public final Object MediaBrowserCompat$ItemReceiver() {
            ZHPR2 zhpr2 = this.write;
            for (RenderScript IconCompatParcelizer2 : zhpr2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                zhpr2.read.IconCompatParcelizer(IconCompatParcelizer2, 1);
            }
            return null;
        }
    }
}
