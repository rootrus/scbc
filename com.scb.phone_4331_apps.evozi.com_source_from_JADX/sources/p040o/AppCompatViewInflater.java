package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import p040o.setExpandedFormat;

/* renamed from: o.AppCompatViewInflater */
class AppCompatViewInflater extends setExpandedFormat {
    private boolean MediaBrowserCompat$ItemReceiver;
    private AppCompatViewInflater$MediaBrowserCompat$ItemReceiver read;

    public boolean isStateful() {
        return true;
    }

    AppCompatViewInflater() {
        this((AppCompatViewInflater$MediaBrowserCompat$ItemReceiver) null, (Resources) null);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int IconCompatParcelizer = this.read.IconCompatParcelizer(iArr);
        if (IconCompatParcelizer < 0) {
            IconCompatParcelizer = this.read.IconCompatParcelizer(StateSet.WILD_CARD);
        }
        return IconCompatParcelizer(IconCompatParcelizer) || onStateChange;
    }

    public void read(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int[] iArr = AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable;
        if (theme == null) {
            typedArray = resources.obtainAttributes(attributeSet, iArr);
        } else {
            typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_visible, true), true);
        MediaBrowserCompat$CustomActionResultReceiver(typedArray);
        write(resources);
        typedArray.recycle();
        write(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(TypedArray typedArray) {
        AppCompatViewInflater$MediaBrowserCompat$ItemReceiver appCompatViewInflater$MediaBrowserCompat$ItemReceiver = this.read;
        if (Build.VERSION.SDK_INT >= 21) {
            appCompatViewInflater$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver |= typedArray.getChangingConfigurations();
        }
        appCompatViewInflater$MediaBrowserCompat$ItemReceiver.ExpandedMenuView = typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_variablePadding, appCompatViewInflater$MediaBrowserCompat$ItemReceiver.ExpandedMenuView);
        appCompatViewInflater$MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction = typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_constantSize, appCompatViewInflater$MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction);
        appCompatViewInflater$MediaBrowserCompat$ItemReceiver.setBackgroundResource = typedArray.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_enterFadeDuration, appCompatViewInflater$MediaBrowserCompat$ItemReceiver.setBackgroundResource);
        appCompatViewInflater$MediaBrowserCompat$ItemReceiver.AppCompatActivity = typedArray.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_exitFadeDuration, appCompatViewInflater$MediaBrowserCompat$ItemReceiver.AppCompatActivity);
        appCompatViewInflater$MediaBrowserCompat$ItemReceiver.setHasDecor = typedArray.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawable_android_dither, appCompatViewInflater$MediaBrowserCompat$ItemReceiver.setHasDecor);
    }

    private void write(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray;
        int next;
        AppCompatViewInflater$MediaBrowserCompat$ItemReceiver appCompatViewInflater$MediaBrowserCompat$ItemReceiver = this.read;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    int[] iArr = AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawableItem;
                    if (theme == null) {
                        typedArray = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    Drawable drawable = null;
                    int resourceId = typedArray.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.StateListDrawableItem_android_drawable, -1);
                    if (resourceId > 0) {
                        drawable = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(context, resourceId);
                    }
                    typedArray.recycle();
                    int[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or ");
                            sb.append("child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (Build.VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    appCompatViewInflater$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, drawable);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int[] MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i++;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.MediaBrowserCompat$ItemReceiver && super.mutate() == this) {
            this.read.MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$ItemReceiver = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: IconCompatParcelizer */
    public AppCompatViewInflater$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
        return new AppCompatViewInflater$MediaBrowserCompat$ItemReceiver(this.read, this, (Resources) null);
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver(setExpandedFormat.read read2) {
        super.MediaBrowserCompat$CustomActionResultReceiver(read2);
        if (read2 instanceof AppCompatViewInflater$MediaBrowserCompat$ItemReceiver) {
            this.read = (AppCompatViewInflater$MediaBrowserCompat$ItemReceiver) read2;
        }
    }

    AppCompatViewInflater(AppCompatViewInflater$MediaBrowserCompat$ItemReceiver appCompatViewInflater$MediaBrowserCompat$ItemReceiver, Resources resources) {
        MediaBrowserCompat$CustomActionResultReceiver((setExpandedFormat.read) new AppCompatViewInflater$MediaBrowserCompat$ItemReceiver(appCompatViewInflater$MediaBrowserCompat$ItemReceiver, this, resources));
        onStateChange(getState());
    }

    AppCompatViewInflater(AppCompatViewInflater$MediaBrowserCompat$ItemReceiver appCompatViewInflater$MediaBrowserCompat$ItemReceiver) {
        if (appCompatViewInflater$MediaBrowserCompat$ItemReceiver != null) {
            MediaBrowserCompat$CustomActionResultReceiver((setExpandedFormat.read) appCompatViewInflater$MediaBrowserCompat$ItemReceiver);
        }
    }
}
