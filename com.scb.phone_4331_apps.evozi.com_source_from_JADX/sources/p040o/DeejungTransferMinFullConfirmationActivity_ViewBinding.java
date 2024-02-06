package p040o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.StackView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.DeejungTransferMinFullConfirmationActivity_ViewBinding */
public final class DeejungTransferMinFullConfirmationActivity_ViewBinding {
    private static final Map<String, ECouponSuccessfulActivity> read;

    static {
        setTextAppearance settextappearance = new setTextAppearance();
        read = settextappearance;
        settextappearance.put("LinearLayout", new ECouponSuccessfulActivity("LL", false, false, false));
        read.put("TableLayout", new ECouponSuccessfulActivity("TL", false, false, false));
        read.put("RelativeLayout", new ECouponSuccessfulActivity("RL", false, false, false));
        read.put("AbsoluteLayout", new ECouponSuccessfulActivity("AL", false, false, false));
        read.put("FrameLayout", new ECouponSuccessfulActivity("FL", false, false, false));
        read.put("CoordinatorLayout", new ECouponSuccessfulActivity("CL", false, false, false));
        read.put("DrawerLayout", new ECouponSuccessfulActivity(ASN1Encoding.f5569DL, false, false, false));
        read.put("FragmentBreadCrumbs", new ECouponSuccessfulActivity("FBC", false, false, false));
        read.put("GridLayout", new ECouponSuccessfulActivity("GL", false, false, false));
        read.put("LinearLayoutCompat", new ECouponSuccessfulActivity("LLC", false, false, false));
        read.put("PagerTitleStrip", new ECouponSuccessfulActivity("PTS", false, false, false));
        read.put("ShadowOverlayContainer", new ECouponSuccessfulActivity("SOC", false, false, false));
        read.put("SlidingDrawer", new ECouponSuccessfulActivity("SD", false, false, false));
        read.put("SlidingPaneLayout", new ECouponSuccessfulActivity("SPL", false, false, false));
        read.put("SwipeRefreshLayout", new ECouponSuccessfulActivity("SRL", false, false, false));
        read.put("BrowseFrameLayout", new ECouponSuccessfulActivity("BFL", false, false, false));
        read.put("CollapsingToolbarLayout", new ECouponSuccessfulActivity("CTL", false, false, false));
        read.put("ScrollView", new ECouponSuccessfulActivity("SCRV", false, false, false));
        read.put("TabLayout", new ECouponSuccessfulActivity("TAL", false, false, false));
        read.put("SlidingTabStrip", new ECouponSuccessfulActivity("STS", false, false, false));
        read.put("TextInputLayout", new ECouponSuccessfulActivity("TIL", false, false, false));
        read.put("AppBarLayout", new ECouponSuccessfulActivity("ABL", false, false, false));
        read.put("AdapterViewFlipper", new ECouponSuccessfulActivity("AVF", false, false, false));
        read.put("BaseCardView", new ECouponSuccessfulActivity("BCV", false, false, false));
        read.put("CalendarView", new ECouponSuccessfulActivity("CRV", false, false, false));
        read.put("TableRow", new ECouponSuccessfulActivity("TR", false, false, false));
        read.put("ViewSwitcher", new ECouponSuccessfulActivity("VSWI", false, false, false));
        read.put("SearchBar", new ECouponSuccessfulActivity("SB", false, false, false));
        read.put("ImageCardView", new ECouponSuccessfulActivity("ICV", false, false, false));
        read.put("ListRowHoverCardView", new ECouponSuccessfulActivity("LRHCV", false, false, false));
        read.put("ListRowView", new ECouponSuccessfulActivity("LRV", false, false, false));
        read.put("NestedScrollView", new ECouponSuccessfulActivity("NSV", false, false, false));
        read.put("PercentFrameLayout", new ECouponSuccessfulActivity("PFL", false, false, false));
        read.put("PercentRelativeLayout", new ECouponSuccessfulActivity("PRL", false, false, false));
        read.put("HorizontalScrollView", new ECouponSuccessfulActivity("HSV", false, false, false));
        read.put("ScrollingTabContainerView", new ECouponSuccessfulActivity("STCV", false, false, false));
        read.put("AdapterView", new ECouponSuccessfulActivity("AV", true, true, false));
        read.put("ActionMenuView", new ECouponSuccessfulActivity("AMV", true, true, false));
        read.put("ActionMenuItemView", new ECouponSuccessfulActivity("AMIV", true, true, false));
        read.put("AutoCompleteTextView", new ECouponSuccessfulActivity("ACTV", true, false, false, true, "TEXT_FIELD"));
        read.put("AppCompatCheckBox", new ECouponSuccessfulActivity("ACCB", true, false, true, true, "CHECKBOX_RADIO"));
        read.put("AppCompatRadioButton", new ECouponSuccessfulActivity("ACRBTN", true, false, true, true, "CHECKBOX_RADIO"));
        read.put("AppCompatRatingBar", new ECouponSuccessfulActivity("ACRB", true, false, true, true, "DISPLAY_ELEM"));
        read.put("AppCompatSeekBar", new ECouponSuccessfulActivity("ACSB", true, false, true, true, "DISPLAY_ELEM"));
        read.put("Button", new ECouponSuccessfulActivity("BTN", true, false, true, true, "DISPLAY_ELEM"));
        read.put("AppCompatButton", new ECouponSuccessfulActivity("ACB", true, false, true, true, "DISPLAY_ELEM"));
        read.put("CardView", new ECouponSuccessfulActivity("CV", true, true, false));
        read.put("CheckBox", new ECouponSuccessfulActivity("CB", true, false, true, true, "CHECKBOX_RADIO"));
        read.put("CheckedTextView", new ECouponSuccessfulActivity("CTV", true, false, true, true, "CHECKBOX_RADIO"));
        read.put("CompoundButton", new ECouponSuccessfulActivity("CBTN", true, false, true, true, "DISPLAY_ELEM"));
        read.put("DatePicker", new ECouponSuccessfulActivity("DP", true, false, false, true, "DROP_DOWN"));
        read.put("EditText", new ECouponSuccessfulActivity("ET", true, false, false, true, "TEXT_FIELD"));
        read.put("AppCompatEditText", new ECouponSuccessfulActivity("ACET", true, false, false, true, "TEXT_FIELD"));
        read.put("ExpandableListView", new ECouponSuccessfulActivity("ELV", true, true, false));
        read.put("FloatingActionButton", new ECouponSuccessfulActivity("FAB", true, true, false));
        read.put("FragmentTabHost", new ECouponSuccessfulActivity("FTH", true, true, false));
        read.put("GridView", new ECouponSuccessfulActivity("GV", true, true, false));
        read.put("ImageButton", new ECouponSuccessfulActivity("IB", true, true, false));
        read.put("ListView", new ECouponSuccessfulActivity("LV", true, true, false));
        read.put("ListItem", new ECouponSuccessfulActivity("LI", true, true, false));
        read.put("TabItem", new ECouponSuccessfulActivity("TI", true, true, false));
        read.put("SupportTabItem", new ECouponSuccessfulActivity("STI", true, true, false));
        read.put("ScrollingTabContainerView$TabView", new ECouponSuccessfulActivity("STI", true, true, false));
        read.put("MultiAutoCompleteTextView", new ECouponSuccessfulActivity("MACTV", true, false, false, true, "TEXT_FIELD"));
        read.put("NavigationView", new ECouponSuccessfulActivity("NV", true, true, false));
        read.put("NavigationMenuView", new ECouponSuccessfulActivity("NMV", true, true, false));
        read.put("NumberPicker", new ECouponSuccessfulActivity("NP", true, false, false, true, "DROP_DOWN"));
        read.put("RadioButton", new ECouponSuccessfulActivity("RBTN", true, false, true, true, "CHECKBOX_RADIO"));
        read.put("RatingBar", new ECouponSuccessfulActivity("RB", true, false, true, true, "DISPLAY_ELEM"));
        read.put("RecyclerView", new ECouponSuccessfulActivity("RV", true, true, false));
        read.put("SeekBar", new ECouponSuccessfulActivity("SB", true, false, false, true, "DISPLAY_ELEM"));
        read.put("Switch", new ECouponSuccessfulActivity("S", true, false, false, true, "CHECKBOX_RADIO"));
        read.put("SwitchCompat", new ECouponSuccessfulActivity("SC", true, false, false, true, "CHECKBOX_RADIO"));
        read.put("TextView", new ECouponSuccessfulActivity("TV", true, false, false, true, "DISPLAY_ELEM"));
        read.put("AppCompatTextView", new ECouponSuccessfulActivity("APCTV", true, false, false, true, "TEXT_FIELD"));
        read.put("TimePicker", new ECouponSuccessfulActivity("TP", true, false, false, true, "DROP_DOWN"));
        read.put("WebView", new ECouponSuccessfulActivity("WV", true, false, false, true, "DISPLAY_ELEM"));
        read.put("RadioGroup", new ECouponSuccessfulActivity("RG", true, true, true));
        read.put("ViewPager", new ECouponSuccessfulActivity("VP", true, false, false));
        read.put("Toolbar", new ECouponSuccessfulActivity("TB", true, false, false));
        read.put("AbsListView", new ECouponSuccessfulActivity("ALV", true, true, false));
        read.put("Spinner", new ECouponSuccessfulActivity("SP", true, true, false));
        read.put("AppCompatSpinner", new ECouponSuccessfulActivity("ACS", true, true, false));
        read.put("HorizontalGridView", new ECouponSuccessfulActivity("HGV", true, true, false));
        read.put("RecyclerView", new ECouponSuccessfulActivity("RV", true, true, false));
        read.put("ImageSwitcher", new ECouponSuccessfulActivity("ISW", true, false, false));
        read.put("StackView", new ECouponSuccessfulActivity("STAV", true, true, false));
        read.put("TabHost", new ECouponSuccessfulActivity("TH", true, true, false));
        read.put("TabWidget", new ECouponSuccessfulActivity("TAW", false, false, false));
        read.put("VerticalGridView", new ECouponSuccessfulActivity("VGV", true, true, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MediaBrowserCompat$CustomActionResultReceiver(android.view.View r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0017
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ Exception -> 0x0017 }
            if (r1 == 0) goto L_0x0017
            android.content.res.Resources r1 = r2.getResources()     // Catch:{ Exception -> 0x0017 }
            int r2 = r2.getId()     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = r1.getResourceName(r2)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "/"
            java.lang.String[] r2 = r2.split(r0)
            int r0 = r2.length
            int r0 = r0 + -1
            r2 = r2[r0]
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(android.view.View):java.lang.String");
    }

    public static String write(String str) {
        for (Map.Entry next : read.entrySet()) {
            if (((ECouponSuccessfulActivity) next.getValue()).MediaMetadataCompat.equals(str)) {
                return (String) next.getKey();
            }
        }
        return "";
    }

    public static String IconCompatParcelizer(String str) {
        String[] split = str.split("\\.");
        String str2 = split[split.length - 1];
        if (str2 == null) {
            return "";
        }
        ECouponSuccessfulActivity eCouponSuccessfulActivity = read.get(str2);
        return eCouponSuccessfulActivity != null ? eCouponSuccessfulActivity.MediaMetadataCompat : str2;
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length == 0) {
            return -1;
        }
        int MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem(split[split.length - 1]);
        if (MediaBrowserCompat$MediaItem != -1) {
            return MediaBrowserCompat$MediaItem;
        }
        int i = 0;
        while (i < split.length && (MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem(split[i])) == -1) {
            i++;
        }
        return MediaBrowserCompat$MediaItem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int MediaBrowserCompat$MediaItem(java.lang.String r12) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "\\d"
            java.lang.String r1 = r12.replaceAll(r1, r0)
            int r2 = r1.hashCode()
            r3 = 2
            java.lang.String r4 = "STI"
            java.lang.String r5 = "ELV"
            r6 = 3
            java.lang.String r7 = "TI"
            r8 = 1
            r9 = -1
            java.lang.String r10 = "LI"
            r11 = 2429(0x97d, float:3.404E-42)
            if (r2 == r11) goto L_0x0042
            r11 = 2677(0xa75, float:3.751E-42)
            if (r2 == r11) goto L_0x003a
            r11 = 68751(0x10c8f, float:9.634E-41)
            if (r2 == r11) goto L_0x0032
            r11 = 82440(0x14208, float:1.15523E-40)
            if (r2 != r11) goto L_0x004a
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x004a
            r1 = r3
            goto L_0x004b
        L_0x0032:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x004a
            r1 = 0
            goto L_0x004b
        L_0x003a:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x004a
            r1 = r6
            goto L_0x004b
        L_0x0042:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x004a
            r1 = r8
            goto L_0x004b
        L_0x004a:
            r1 = r9
        L_0x004b:
            if (r1 == 0) goto L_0x006f
            if (r1 == r8) goto L_0x0066
            if (r1 == r3) goto L_0x005d
            if (r1 == r6) goto L_0x0054
            goto L_0x0077
        L_0x0054:
            java.lang.String r12 = r12.replace(r7, r0)
            int r9 = java.lang.Integer.parseInt(r12)
            goto L_0x0077
        L_0x005d:
            java.lang.String r12 = r12.replace(r4, r0)
            int r9 = java.lang.Integer.parseInt(r12)
            goto L_0x0077
        L_0x0066:
            java.lang.String r12 = r12.replace(r10, r0)
            int r9 = java.lang.Integer.parseInt(r12)
            goto L_0x0077
        L_0x006f:
            java.lang.String r12 = r12.replace(r5, r0)
            int r9 = java.lang.Integer.parseInt(r12)
        L_0x0077:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$MediaItem(java.lang.String):int");
    }

    public static int MediaBrowserCompat$ItemReceiver(String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length == 0) {
            return -1;
        }
        return MediaBrowserCompat$MediaItem(split[split.length - 1]);
    }

    public static ECouponSuccessfulActivity read(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ECouponSuccessfulActivity eCouponSuccessfulActivity = read.get(str);
        return eCouponSuccessfulActivity == null ? new ECouponSuccessfulActivity(str, false, false, false, false, "") : eCouponSuccessfulActivity;
    }

    public static ECouponSuccessfulActivity read(View view) {
        String name = view.getClass().getName();
        String[] split = name.split("\\.");
        boolean z = MyQRCoachMarkActivity_ViewBinding.read(view) != null;
        ECouponSuccessfulActivity eCouponSuccessfulActivity = read.get(split[split.length - 1]);
        if (eCouponSuccessfulActivity == null) {
            if (view instanceof CheckedTextView) {
                return read.get("CheckedTextView");
            }
            if (view instanceof TextView) {
                return read.get("TextView");
            }
            if (view instanceof RecyclerView) {
                return read.get("RecyclerView");
            }
            if (view instanceof TabLayout) {
                return read.get("TabLayout");
            }
            if (!(view instanceof AdapterView)) {
                return new ECouponSuccessfulActivity(name, z, false, z, false, "");
            }
            if (view instanceof ExpandableListView) {
                return read.get("ExpandableListView");
            }
            if (view instanceof ListView) {
                return read.get("ListView");
            }
            if (view instanceof GridView) {
                return read.get("GridView");
            }
            if (view instanceof AbsListView) {
                return read.get("AbsListView");
            }
            if (view instanceof AbsSpinner) {
                return read.get("Spinner");
            }
            if ((view instanceof StackView) || (view instanceof AdapterViewAnimator)) {
                return read.get("StackView");
            }
            return read.get("AdapterView");
        } else if (eCouponSuccessfulActivity.MediaBrowserCompat$ItemReceiver || !z) {
            return eCouponSuccessfulActivity;
        } else {
            ECouponSuccessfulActivity eCouponSuccessfulActivity2 = new ECouponSuccessfulActivity(eCouponSuccessfulActivity.MediaMetadataCompat, eCouponSuccessfulActivity.write, eCouponSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, eCouponSuccessfulActivity.MediaBrowserCompat$ItemReceiver, eCouponSuccessfulActivity.read, eCouponSuccessfulActivity.IconCompatParcelizer);
            eCouponSuccessfulActivity2.MediaBrowserCompat$ItemReceiver = true;
            eCouponSuccessfulActivity2.write = true;
            return eCouponSuccessfulActivity2;
        }
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append("/");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str, int i) {
        String[] split = str.split("/");
        int length = split.length - 1;
        while (true) {
            if (length < 0) {
                break;
            } else if (split[length].contains("*")) {
                StringBuilder sb = new StringBuilder();
                sb.append("LI");
                sb.append(i);
                split[length] = sb.toString();
                break;
            } else {
                length--;
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver(split);
    }

    public static DeejungTransferLandingActivity read(DeejungTransferLandingActivity deejungTransferLandingActivity, String[] strArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat);
        sb.append(MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.ParcelableVolumeInfo));
        strArr[i] = sb.toString();
        String MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(strArr);
        FragmentBuilder_BindHmlExternalAuthenticationFragment read2 = FragmentBuilder_BindHmlExternalAuthenticationFragment.read();
        String str = deejungTransferLandingActivity.MediaBrowserCompat$MediaItem;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = read2.write.get(str) != null ? (DeejungTransferLandingActivity) read2.write.get(str).get(MediaBrowserCompat$CustomActionResultReceiver) : null;
        return deejungTransferLandingActivity2 == null ? write(deejungTransferLandingActivity, MediaBrowserCompat$CustomActionResultReceiver) : deejungTransferLandingActivity2;
    }

    public static void IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity, ArrayList<String> arrayList, String str) {
        String[] split = str.split("/");
        int length = split.length - 1;
        while (true) {
            if (length >= 0) {
                if (split[length].contains("*")) {
                    break;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length != -1) {
            StringBuilder sb = new StringBuilder(split[0]);
            for (int i = 1; i < length; i++) {
                sb.append("/");
                sb.append(split[i]);
            }
            DeejungTransferLandingActivity write = write(deejungTransferLandingActivity, sb.toString());
            if (write != null) {
                for (int i2 = 0; i2 < write.read.size(); i2++) {
                    DeejungTransferLandingActivity read2 = read(write.read.get(i2), split, length);
                    if (read2 != null) {
                        read2.MediaMetadataCompat = true;
                        arrayList.add(read2.ParcelableVolumeInfo);
                    }
                }
            }
        }
    }

    private static DeejungTransferLandingActivity write(DeejungTransferLandingActivity deejungTransferLandingActivity, String str) {
        if (deejungTransferLandingActivity.ParcelableVolumeInfo.equals(str)) {
            return deejungTransferLandingActivity;
        }
        for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
            DeejungTransferLandingActivity write = write(deejungTransferLandingActivity.read.get(i), str);
            if (write != null) {
                return write;
            }
        }
        return null;
    }

    public static DeejungTransferLandingActivity write(DeejungTransferLandingActivity deejungTransferLandingActivity, View view) {
        if (deejungTransferLandingActivity.IconCompatParcelizer == view) {
            return deejungTransferLandingActivity;
        }
        for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
            DeejungTransferLandingActivity write = write(deejungTransferLandingActivity.read.get(i), view);
            if (write != null) {
                return write;
            }
        }
        return null;
    }

    public static boolean write(String str, String str2) {
        int i;
        String[] split = str2.split("/");
        int length = split.length - 1;
        while (true) {
            if (length < 0) {
                i = -1;
                break;
            } else if (split[length].contains("LI")) {
                i = Integer.parseInt(split[length].replace("LI", ""));
                break;
            } else {
                length--;
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver(str, i).equals(str2);
    }
}
