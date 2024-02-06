package p040o;

import android.database.Cursor;
import android.util.Base64;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.nAllocationGetStride;

/* renamed from: o.ZGERC */
public final class ZGERC implements nAllocationGetStride.write {
    public static final ZGERC MediaBrowserCompat$CustomActionResultReceiver = new ZGERC();

    /* renamed from: o.ZGERC$read */
    public static final class read {
        public static final int[] ColorStateListItem = {16843173, 16843551, R.attr.alpha};
        public static final int ColorStateListItem_alpha = 2;
        public static final int ColorStateListItem_android_alpha = 1;
        public static final int ColorStateListItem_android_color = 0;
        public static final int[] FontFamily = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery};
        public static final int[] FontFamilyFont = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};
        public static final int FontFamilyFont_android_font = 0;
        public static final int FontFamilyFont_android_fontStyle = 2;
        public static final int FontFamilyFont_android_fontVariationSettings = 4;
        public static final int FontFamilyFont_android_fontWeight = 1;
        public static final int FontFamilyFont_android_ttcIndex = 3;
        public static final int FontFamilyFont_font = 5;
        public static final int FontFamilyFont_fontStyle = 6;
        public static final int FontFamilyFont_fontVariationSettings = 7;
        public static final int FontFamilyFont_fontWeight = 8;
        public static final int FontFamilyFont_ttcIndex = 9;
        public static final int FontFamily_fontProviderAuthority = 0;
        public static final int FontFamily_fontProviderCerts = 1;
        public static final int FontFamily_fontProviderFetchStrategy = 2;
        public static final int FontFamily_fontProviderFetchTimeout = 3;
        public static final int FontFamily_fontProviderPackage = 4;
        public static final int FontFamily_fontProviderQuery = 5;
        public static final int[] GradientColor = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};
        public static final int[] GradientColorItem = {16843173, 16844052};
        public static final int GradientColorItem_android_color = 0;
        public static final int GradientColorItem_android_offset = 1;
        public static final int GradientColor_android_centerColor = 7;
        public static final int GradientColor_android_centerX = 3;
        public static final int GradientColor_android_centerY = 4;
        public static final int GradientColor_android_endColor = 1;
        public static final int GradientColor_android_endX = 10;
        public static final int GradientColor_android_endY = 11;
        public static final int GradientColor_android_gradientRadius = 5;
        public static final int GradientColor_android_startColor = 0;
        public static final int GradientColor_android_startX = 8;
        public static final int GradientColor_android_startY = 9;
        public static final int GradientColor_android_tileMode = 6;
        public static final int GradientColor_android_type = 2;
        public static final int[] PageIndicatorView = {R.attr.piv_animationDuration, R.attr.piv_animationType, R.attr.piv_autoVisibility, R.attr.piv_count, R.attr.piv_dynamicCount, R.attr.piv_fadeOnIdle, R.attr.piv_idleDuration, R.attr.piv_interactiveAnimation, R.attr.piv_orientation, R.attr.piv_padding, R.attr.piv_radius, R.attr.piv_rtl_mode, R.attr.piv_scaleFactor, R.attr.piv_select, R.attr.piv_selectedColor, R.attr.piv_strokeWidth, R.attr.piv_unselectedColor, R.attr.piv_viewPager};
        public static final int PageIndicatorView_piv_animationDuration = 0;
        public static final int PageIndicatorView_piv_animationType = 1;
        public static final int PageIndicatorView_piv_autoVisibility = 2;
        public static final int PageIndicatorView_piv_count = 3;
        public static final int PageIndicatorView_piv_dynamicCount = 4;
        public static final int PageIndicatorView_piv_fadeOnIdle = 5;
        public static final int PageIndicatorView_piv_idleDuration = 6;
        public static final int PageIndicatorView_piv_interactiveAnimation = 7;
        public static final int PageIndicatorView_piv_orientation = 8;
        public static final int PageIndicatorView_piv_padding = 9;
        public static final int PageIndicatorView_piv_radius = 10;
        public static final int PageIndicatorView_piv_rtl_mode = 11;
        public static final int PageIndicatorView_piv_scaleFactor = 12;
        public static final int PageIndicatorView_piv_select = 13;
        public static final int PageIndicatorView_piv_selectedColor = 14;
        public static final int PageIndicatorView_piv_strokeWidth = 15;
        public static final int PageIndicatorView_piv_unselectedColor = 16;
        public static final int PageIndicatorView_piv_viewPager = 17;
    }

    private ZGERC() {
    }

    public final Object read(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            RenderScript$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = RenderScript.IconCompatParcelizer().read(cursor.getString(1)).IconCompatParcelizer(ZHPR2.IconCompatParcelizer(cursor.getInt(2)));
            String string = cursor.getString(3);
            arrayList.add(IconCompatParcelizer.read(string == null ? null : Base64.decode(string, 0)).IconCompatParcelizer());
        }
        return arrayList;
    }
}
