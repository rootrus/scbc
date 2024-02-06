package com.roughike.bottombar;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import com.roughike.bottombar.BottomBarTab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.setLastBaselineToBottomHeight;

final class TabParser {
    private final XmlResourceParser IconCompatParcelizer;
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private final BottomBarTab.write read;
    private List<BottomBarTab> write = null;

    public static class TabParserException extends RuntimeException {
    }

    TabParser(Context context, BottomBarTab.write write2, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = write2;
        this.IconCompatParcelizer = context.getResources().getXml(i);
    }

    public final List<BottomBarTab> write() {
        int next;
        if (this.write == null) {
            this.write = new ArrayList(5);
            do {
                try {
                    next = this.IconCompatParcelizer.next();
                    if (next == 2 && "tab".equals(this.IconCompatParcelizer.getName())) {
                        this.write.add(MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.write.size()));
                    }
                } catch (IOException | XmlPullParserException e) {
                    e.printStackTrace();
                    throw new TabParserException();
                }
            } while (next != 1);
        }
        return this.write;
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, attributeResourceValue);
        }
        try {
            return Color.parseColor(xmlResourceParser.getAttributeValue(i));
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.roughike.bottombar.BottomBarTab MediaBrowserCompat$ItemReceiver(android.content.res.XmlResourceParser r8, int r9) {
        /*
            r7 = this;
            com.roughike.bottombar.BottomBarTab r0 = new com.roughike.bottombar.BottomBarTab
            android.content.Context r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r1)
            com.roughike.bottombar.BottomBarTab$write r1 = r7.read
            float r2 = r1.MediaDescriptionCompat
            r0.setInActiveAlpha(r2)
            float r2 = r1.IconCompatParcelizer
            r0.setActiveAlpha(r2)
            int r2 = r1.RatingCompat
            r0.setInActiveColor(r2)
            int r2 = r1.write
            r0.setActiveColor(r2)
            int r2 = r1.read
            r0.setBarColorWhenSelected(r2)
            int r2 = r1.MediaBrowserCompat$ItemReceiver
            r0.setBadgeBackgroundColor(r2)
            boolean r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r0.setBadgeHidesWhenActive(r2)
            int r2 = r1.MediaBrowserCompat$SearchResultReceiver
            r0.MediaMetadataCompat = r2
            r0.MediaBrowserCompat$ItemReceiver()
            android.graphics.Typeface r1 = r1.MediaMetadataCompat
            r0.setTitleTypeface(r1)
            r0.read = r9
            int r9 = r8.getAttributeCount()
            r1 = 0
            r2 = r1
        L_0x0052:
            if (r2 >= r9) goto L_0x0121
            java.lang.String r3 = r8.getAttributeName(r2)
            int r4 = r3.hashCode()
            r5 = 1
            r6 = -1
            switch(r4) {
                case -1765033179: goto L_0x00b3;
                case -1077332995: goto L_0x00a9;
                case -738071611: goto L_0x009e;
                case -424740686: goto L_0x0094;
                case 3355: goto L_0x008a;
                case 3226745: goto L_0x0080;
                case 110371416: goto L_0x0076;
                case 1110315790: goto L_0x006c;
                case 1162188184: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00bd
        L_0x0062:
            java.lang.String r4 = "inActiveColor"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 3
            goto L_0x00be
        L_0x006c:
            java.lang.String r4 = "badgeHidesWhenActive"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 7
            goto L_0x00be
        L_0x0076:
            java.lang.String r4 = "title"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 2
            goto L_0x00be
        L_0x0080:
            java.lang.String r4 = "icon"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = r5
            goto L_0x00be
        L_0x008a:
            java.lang.String r4 = "id"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = r1
            goto L_0x00be
        L_0x0094:
            java.lang.String r4 = "badgeBackgroundColor"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 6
            goto L_0x00be
        L_0x009e:
            java.lang.String r4 = "iconOnly"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 8
            goto L_0x00be
        L_0x00a9:
            java.lang.String r4 = "activeColor"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 4
            goto L_0x00be
        L_0x00b3:
            java.lang.String r4 = "barColorWhenSelected"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = 5
            goto L_0x00be
        L_0x00bd:
            r3 = r6
        L_0x00be:
            switch(r3) {
                case 0: goto L_0x0116;
                case 1: goto L_0x010f;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00d2;
                case 7: goto L_0x00ca;
                case 8: goto L_0x00c2;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x011d
        L_0x00c2:
            boolean r3 = r8.getAttributeBooleanValue(r2, r1)
            r0.write((boolean) r3)
            goto L_0x011d
        L_0x00ca:
            boolean r3 = r8.getAttributeBooleanValue(r2, r5)
            r0.setBadgeHidesWhenActive(r3)
            goto L_0x011d
        L_0x00d2:
            int r3 = r7.MediaBrowserCompat$CustomActionResultReceiver(r8, r2)
            if (r3 == r6) goto L_0x011d
            r0.setBadgeBackgroundColor(r3)
            goto L_0x011d
        L_0x00dc:
            int r3 = r7.MediaBrowserCompat$CustomActionResultReceiver(r8, r2)
            if (r3 == r6) goto L_0x011d
            r0.setBarColorWhenSelected(r3)
            goto L_0x011d
        L_0x00e6:
            int r3 = r7.MediaBrowserCompat$CustomActionResultReceiver(r8, r2)
            if (r3 == r6) goto L_0x011d
            r0.setActiveColor(r3)
            goto L_0x011d
        L_0x00f0:
            int r3 = r7.MediaBrowserCompat$CustomActionResultReceiver(r8, r2)
            if (r3 == r6) goto L_0x011d
            r0.setInActiveColor(r3)
            goto L_0x011d
        L_0x00fa:
            int r3 = r8.getAttributeResourceValue(r2, r1)
            if (r3 != 0) goto L_0x0105
            java.lang.String r3 = r8.getAttributeValue(r2)
            goto L_0x010b
        L_0x0105:
            android.content.Context r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r4.getString(r3)
        L_0x010b:
            r0.setTitle(r3)
            goto L_0x011d
        L_0x010f:
            int r3 = r8.getAttributeResourceValue(r2, r1)
            r0.write = r3
            goto L_0x011d
        L_0x0116:
            int r3 = r8.getIdAttributeResourceValue(r2)
            r0.setId(r3)
        L_0x011d:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0121:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roughike.bottombar.TabParser.MediaBrowserCompat$ItemReceiver(android.content.res.XmlResourceParser, int):com.roughike.bottombar.BottomBarTab");
    }
}
