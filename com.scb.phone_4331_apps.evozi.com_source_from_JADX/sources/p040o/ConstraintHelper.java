package p040o;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.scb.phone.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p040o.CheckParameters;

/* renamed from: o.ConstraintHelper */
public final class ConstraintHelper implements ImageHeaderParser {

    /* renamed from: o.ConstraintHelper$read */
    public static final class read {
        public static final int[] ColorStateListItem = {16843173, 16843551, R.attr.alpha};
        public static final int ColorStateListItem_alpha = 2;
        public static final int ColorStateListItem_android_alpha = 1;
        public static final int ColorStateListItem_android_color = 0;
        public static final int[] CoordinatorLayout = {R.attr.keylines, R.attr.statusBarBackground};
        public static final int[] CoordinatorLayout_Layout = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};
        public static final int CoordinatorLayout_Layout_android_layout_gravity = 0;
        public static final int CoordinatorLayout_Layout_layout_anchor = 1;
        public static final int CoordinatorLayout_Layout_layout_anchorGravity = 2;
        public static final int CoordinatorLayout_Layout_layout_behavior = 3;
        public static final int CoordinatorLayout_Layout_layout_dodgeInsetEdges = 4;
        public static final int CoordinatorLayout_Layout_layout_insetEdge = 5;
        public static final int CoordinatorLayout_Layout_layout_keyline = 6;
        public static final int CoordinatorLayout_keylines = 0;
        public static final int CoordinatorLayout_statusBarBackground = 1;
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
        public static final int[] RecyclerView = {16842948, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};
        public static final int RecyclerView_android_descendantFocusability = 1;
        public static final int RecyclerView_android_orientation = 0;
        public static final int RecyclerView_fastScrollEnabled = 2;
        public static final int RecyclerView_fastScrollHorizontalThumbDrawable = 3;
        public static final int RecyclerView_fastScrollHorizontalTrackDrawable = 4;
        public static final int RecyclerView_fastScrollVerticalThumbDrawable = 5;
        public static final int RecyclerView_fastScrollVerticalTrackDrawable = 6;
        public static final int RecyclerView_layoutManager = 7;
        public static final int RecyclerView_reverseLayout = 8;
        public static final int RecyclerView_spanCount = 9;
        public static final int RecyclerView_stackFromEnd = 10;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, CheckParameters.CheckCountry checkCountry) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    public final ImageHeaderParser.ImageType read(InputStream inputStream) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public final ImageHeaderParser.ImageType IconCompatParcelizer(ByteBuffer byteBuffer) throws IOException {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
