package p040o;

import java.io.IOException;

/* renamed from: o.nAllocationSetSurface$MediaBrowserCompat$CustomActionResultReceiver */
public final class C1390x230a8146 {
    public static final int design_appbar_state_list_animator = 2130837504;
    public static final int design_fab_hide_motion_spec = 2130837505;
    public static final int design_fab_show_motion_spec = 2130837506;
    public static final int mtrl_btn_state_list_anim = 2130837509;
    public static final int mtrl_btn_unelevated_state_list_anim = 2130837510;
    public static final int mtrl_chip_state_list_anim = 2130837511;
    public static final int mtrl_fab_hide_motion_spec = 2130837512;
    public static final int mtrl_fab_show_motion_spec = 2130837513;
    public static final int mtrl_fab_transformation_sheet_collapse_spec = 2130837514;
    public static final int mtrl_fab_transformation_sheet_expand_spec = 2130837515;
    public final createFromBitmap IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public C1390x230a8146() {
    }

    public static void IconCompatParcelizer(copy1DRangeFromUnchecked copy1drangefromunchecked, getSubElementOffsetBytes getsubelementoffsetbytes) {
        copy1drangefromunchecked.IconCompatParcelizer = false;
        try {
            if (copy1drangefromunchecked.RatingCompat() != 0) {
                U16_3 u16_3 = new U16_3();
                u16_3.IconCompatParcelizer.add("Invalid header bytes");
                getsubelementoffsetbytes.IconCompatParcelizer.add(u16_3);
                return;
            }
            int RatingCompat = copy1drangefromunchecked.RatingCompat();
            if (RatingCompat == 1 || RatingCompat == 2) {
                int RatingCompat2 = copy1drangefromunchecked.RatingCompat();
                if (RatingCompat2 == 0) {
                    U16_3 u16_32 = new U16_3();
                    u16_32.IconCompatParcelizer.add("Image count cannot be zero");
                    getsubelementoffsetbytes.IconCompatParcelizer.add(u16_32);
                    return;
                }
                for (int i = 0; i < RatingCompat2; i++) {
                    U16_3 u16_33 = new U16_3();
                    try {
                        u16_33.IconCompatParcelizer(1, Integer.valueOf(RatingCompat));
                        u16_33.IconCompatParcelizer(2, Integer.valueOf((short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255)));
                        u16_33.IconCompatParcelizer(3, Integer.valueOf((short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255)));
                        u16_33.IconCompatParcelizer(4, Integer.valueOf((short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255)));
                        copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                        if (RatingCompat == 1) {
                            u16_33.IconCompatParcelizer(5, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                            u16_33.IconCompatParcelizer(7, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                        } else {
                            u16_33.IconCompatParcelizer(6, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                            u16_33.IconCompatParcelizer(8, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
                        }
                        u16_33.IconCompatParcelizer(9, Long.valueOf(copy1drangefromunchecked.MediaMetadataCompat()));
                        u16_33.IconCompatParcelizer(10, Long.valueOf(copy1drangefromunchecked.MediaMetadataCompat()));
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception reading ICO file metadata: ");
                        sb.append(e.getMessage());
                        u16_33.IconCompatParcelizer.add(sb.toString());
                    }
                    getsubelementoffsetbytes.IconCompatParcelizer.add(u16_33);
                }
                return;
            }
            U16_3 u16_34 = new U16_3();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid type ");
            sb2.append(RatingCompat);
            sb2.append(" -- expecting 1 or 2");
            u16_34.IconCompatParcelizer.add(sb2.toString());
            getsubelementoffsetbytes.IconCompatParcelizer.add(u16_34);
        } catch (IOException e2) {
            U16_3 u16_35 = new U16_3();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception reading ICO file metadata: ");
            sb3.append(e2.getMessage());
            u16_35.IconCompatParcelizer.add(sb3.toString());
            getsubelementoffsetbytes.IconCompatParcelizer.add(u16_35);
        }
    }

    public C1390x230a8146(String str, createFromBitmap createfrombitmap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = createfrombitmap;
    }
}
