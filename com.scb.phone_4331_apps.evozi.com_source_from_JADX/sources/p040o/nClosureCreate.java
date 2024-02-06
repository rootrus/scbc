package p040o;

import com.drew.imaging.tiff.TiffProcessingException;
import com.scb.phone.R;
import java.io.IOException;
import java.util.Collections;

/* renamed from: o.nClosureCreate */
public final class nClosureCreate implements getCarbonStrip {
    public final Iterable<setItemAnimator> MediaBrowserCompat$ItemReceiver() {
        return Collections.singletonList(setItemAnimator.APPE);
    }

    public final void IconCompatParcelizer(Iterable<byte[]> iterable, getSubElementOffsetBytes getsubelementoffsetbytes, setItemAnimator setitemanimator) {
        for (byte[] next : iterable) {
            if (next.length == 12 && "Adobe".equalsIgnoreCase(new String(next, 0, 5))) {
                copyTo copyto = new copyTo(next);
                getIDSafe getidsafe = new getIDSafe();
                getsubelementoffsetbytes.IconCompatParcelizer.add(getidsafe);
                try {
                    copyto.IconCompatParcelizer = false;
                    if (!new String(copyto.IconCompatParcelizer(5)).equals("Adobe")) {
                        getidsafe.IconCompatParcelizer.add("Invalid Adobe JPEG data header.");
                    } else {
                        getidsafe.IconCompatParcelizer(0, Integer.valueOf(copyto.RatingCompat()));
                        getidsafe.IconCompatParcelizer(1, Integer.valueOf(copyto.RatingCompat()));
                        getidsafe.IconCompatParcelizer(2, Integer.valueOf(copyto.RatingCompat()));
                        getidsafe.IconCompatParcelizer(3, Integer.valueOf(copyto.MediaBrowserCompat$ItemReceiver()));
                    }
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("IO exception processing data: ");
                    sb.append(e.getMessage());
                    getidsafe.IconCompatParcelizer.add(sb.toString());
                }
            }
        }
    }

    /* renamed from: o.nClosureCreate$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements getCarbonStrip {
        public static final int[] FlexboxLayout = {R.attr.alignContent, R.attr.alignItems, R.attr.dividerDrawable, R.attr.dividerDrawableHorizontal, R.attr.dividerDrawableVertical, R.attr.flexDirection, R.attr.flexWrap, R.attr.justifyContent, R.attr.maxLine, R.attr.showDivider, R.attr.showDividerHorizontal, R.attr.showDividerVertical};
        public static final int[] FlexboxLayout_Layout = {R.attr.layout_alignSelf, R.attr.layout_flexBasisPercent, R.attr.layout_flexGrow, R.attr.layout_flexShrink, R.attr.layout_maxHeight, R.attr.layout_maxWidth, R.attr.layout_minHeight, R.attr.layout_minWidth, R.attr.layout_order, R.attr.layout_wrapBefore};
        public static final int FlexboxLayout_Layout_layout_alignSelf = 0;
        public static final int FlexboxLayout_Layout_layout_flexBasisPercent = 1;
        public static final int FlexboxLayout_Layout_layout_flexGrow = 2;
        public static final int FlexboxLayout_Layout_layout_flexShrink = 3;
        public static final int FlexboxLayout_Layout_layout_maxHeight = 4;
        public static final int FlexboxLayout_Layout_layout_maxWidth = 5;
        public static final int FlexboxLayout_Layout_layout_minHeight = 6;
        public static final int FlexboxLayout_Layout_layout_minWidth = 7;
        public static final int FlexboxLayout_Layout_layout_order = 8;
        public static final int FlexboxLayout_Layout_layout_wrapBefore = 9;
        public static final int FlexboxLayout_alignContent = 0;
        public static final int FlexboxLayout_alignItems = 1;
        public static final int FlexboxLayout_dividerDrawable = 2;
        public static final int FlexboxLayout_dividerDrawableHorizontal = 3;
        public static final int FlexboxLayout_dividerDrawableVertical = 4;
        public static final int FlexboxLayout_flexDirection = 5;
        public static final int FlexboxLayout_flexWrap = 6;
        public static final int FlexboxLayout_justifyContent = 7;
        public static final int FlexboxLayout_maxLine = 8;
        public static final int FlexboxLayout_showDivider = 9;
        public static final int FlexboxLayout_showDividerHorizontal = 10;
        public static final int FlexboxLayout_showDividerVertical = 11;

        public static void IconCompatParcelizer(C10820Allocation allocation, getSubElementOffsetBytes getsubelementoffsetbytes, int i, createFromBitmapResource createfrombitmapresource) {
            validateIsInt32 validateisint32 = new validateIsInt32(getsubelementoffsetbytes);
            try {
                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(allocation, validateisint32, i);
            } catch (TiffProcessingException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception processing TIFF data: ");
                sb.append(e.getMessage());
                validateisint32.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer.add(sb.toString());
                e.printStackTrace(System.err);
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception processing TIFF data: ");
                sb2.append(e2.getMessage());
                validateisint32.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer.add(sb2.toString());
                e2.printStackTrace(System.err);
            }
        }

        public final Iterable<setItemAnimator> MediaBrowserCompat$ItemReceiver() {
            return Collections.singletonList(setItemAnimator.APP1);
        }

        public final void IconCompatParcelizer(Iterable<byte[]> iterable, getSubElementOffsetBytes getsubelementoffsetbytes, setItemAnimator setitemanimator) {
            for (byte[] next : iterable) {
                if (next.length >= 6 && new String(next, 0, 6).equals("Exif\u0000\u0000")) {
                    IconCompatParcelizer(new StaggeredGridLayoutManager(next), getsubelementoffsetbytes, 6, (createFromBitmapResource) null);
                }
            }
        }
    }
}
