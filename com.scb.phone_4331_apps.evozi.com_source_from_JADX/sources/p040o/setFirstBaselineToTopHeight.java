package p040o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.AppCompatSeekBar;

/* renamed from: o.setFirstBaselineToTopHeight */
public class setFirstBaselineToTopHeight {

    /* renamed from: o.setFirstBaselineToTopHeight$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C1488x49a1d4db {
        private final int IconCompatParcelizer;
        private final setBackgroundDrawable MediaBrowserCompat$ItemReceiver;
        private final int read;

        public IconCompatParcelizer(setBackgroundDrawable setbackgrounddrawable, int i, int i2) {
            this.MediaBrowserCompat$ItemReceiver = setbackgrounddrawable;
            this.read = i;
            this.IconCompatParcelizer = i2;
        }

        public final setBackgroundDrawable IconCompatParcelizer() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public final int read() {
            return this.read;
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }
    }

    /* renamed from: o.setFirstBaselineToTopHeight$read */
    public static final class read {
        private final String IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private int MediaBrowserCompat$ItemReceiver;
        private int MediaDescriptionCompat;
        private boolean read;
        private String write;

        public read(String str, int i, boolean z, String str2, int i2, int i3) {
            this.IconCompatParcelizer = str;
            this.MediaDescriptionCompat = i;
            this.read = z;
            this.write = str2;
            this.MediaBrowserCompat$ItemReceiver = i2;
            this.MediaBrowserCompat$CustomActionResultReceiver = i3;
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.MediaDescriptionCompat;
        }

        public final boolean MediaBrowserCompat$SearchResultReceiver() {
            return this.read;
        }

        public final String MediaBrowserCompat$ItemReceiver() {
            return this.write;
        }

        public final int write() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public final int read() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    /* renamed from: o.setFirstBaselineToTopHeight$write */
    public static final class write implements C1488x49a1d4db {
        private final read[] MediaBrowserCompat$ItemReceiver;

        public write(read[] readArr) {
            this.MediaBrowserCompat$ItemReceiver = readArr;
        }

        public final read[] MediaBrowserCompat$CustomActionResultReceiver() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static p040o.C1488x49a1d4db read(org.xmlpull.p042v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.p042v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000a
            r2 = 1
            if (r0 != r2) goto L_0x0000
        L_0x000a:
            if (r0 != r1) goto L_0x0011
            o.setFirstBaselineToTopHeight$MediaBrowserCompat$CustomActionResultReceiver r3 = write(r3, r4)
            return r3
        L_0x0011:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setFirstBaselineToTopHeight.read(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):o.setFirstBaselineToTopHeight$MediaBrowserCompat$CustomActionResultReceiver");
    }

    private static C1488x49a1d4db write(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return MediaBrowserCompat$CustomActionResultReceiver(xmlPullParser, resources);
        }
        read(xmlPullParser);
        return null;
    }

    private static C1488x49a1d4db MediaBrowserCompat$CustomActionResultReceiver(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AppCompatSeekBar.read.FontFamily);
        String string = obtainAttributes.getString(AppCompatSeekBar.read.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(AppCompatSeekBar.read.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(AppCompatSeekBar.read.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(AppCompatSeekBar.read.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(AppCompatSeekBar.read.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(AppCompatSeekBar.read.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(MediaBrowserCompat$ItemReceiver(xmlPullParser, resources));
                    } else {
                        read(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new write((read[]) arrayList.toArray(new read[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            read(xmlPullParser);
        }
        return new IconCompatParcelizer(new setBackgroundDrawable(string, string2, string3, MediaBrowserCompat$ItemReceiver(resources, resourceId)), integer, integer2);
    }

    private static int read(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static List<List<byte[]>> MediaBrowserCompat$ItemReceiver(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (read(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(MediaBrowserCompat$ItemReceiver(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(MediaBrowserCompat$ItemReceiver(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> MediaBrowserCompat$ItemReceiver(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static read MediaBrowserCompat$ItemReceiver(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AppCompatSeekBar.read.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(AppCompatSeekBar.read.FontFamilyFont_fontWeight) ? AppCompatSeekBar.read.FontFamilyFont_fontWeight : AppCompatSeekBar.read.FontFamilyFont_android_fontWeight, TitleChanger.DEFAULT_ANIMATION_DELAY);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(AppCompatSeekBar.read.FontFamilyFont_fontStyle) ? AppCompatSeekBar.read.FontFamilyFont_fontStyle : AppCompatSeekBar.read.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(AppCompatSeekBar.read.FontFamilyFont_ttcIndex) ? AppCompatSeekBar.read.FontFamilyFont_ttcIndex : AppCompatSeekBar.read.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(AppCompatSeekBar.read.FontFamilyFont_fontVariationSettings) ? AppCompatSeekBar.read.FontFamilyFont_fontVariationSettings : AppCompatSeekBar.read.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(AppCompatSeekBar.read.FontFamilyFont_font) ? AppCompatSeekBar.read.FontFamilyFont_font : AppCompatSeekBar.read.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            read(xmlPullParser);
        }
        return new read(string2, i, z, string, i3, resourceId);
    }

    private static void read(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
