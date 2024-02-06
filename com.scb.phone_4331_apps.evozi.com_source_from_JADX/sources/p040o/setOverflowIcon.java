package p040o;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setOverflowIcon */
class setOverflowIcon extends Resources {
    private final Resources MediaBrowserCompat$CustomActionResultReceiver;

    public setOverflowIcon(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.MediaBrowserCompat$CustomActionResultReceiver = resources;
    }

    public CharSequence getText(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getText(i);
    }

    public CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getQuantityText(i, i2);
    }

    public String getString(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
    }

    public String getString(int i, Object... objArr) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(i, objArr);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getQuantityString(i, i2, objArr);
    }

    public String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getQuantityString(i, i2);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getText(i, charSequence);
    }

    public CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getTextArray(i);
    }

    public String[] getStringArray(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getStringArray(i);
    }

    public int[] getIntArray(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getIntArray(i);
    }

    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.obtainTypedArray(i);
    }

    public float getDimension(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDimensionPixelSize(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDrawable(i);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDrawable(i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDrawableForDensity(i, i2);
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDrawableForDensity(i, i2, theme);
    }

    public Movie getMovie(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getMovie(i);
    }

    public int getColor(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getColorStateList(i);
    }

    public boolean getBoolean(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getBoolean(i);
    }

    public int getInteger(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getLayout(i);
    }

    public XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getAnimation(i);
    }

    public XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getXml(i);
    }

    public InputStream openRawResource(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.openRawResource(i);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.openRawResource(i, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.openRawResourceFd(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.MediaBrowserCompat$CustomActionResultReceiver.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.MediaBrowserCompat$CustomActionResultReceiver.getValueForDensity(i, i2, typedValue, z);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        this.MediaBrowserCompat$CustomActionResultReceiver.getValue(str, typedValue, z);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.obtainAttributes(attributeSet, iArr);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getConfiguration();
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getIdentifier(str, str2, str3);
    }

    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getResourceTypeName(i);
    }

    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getResourceEntryName(i);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.MediaBrowserCompat$CustomActionResultReceiver.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.MediaBrowserCompat$CustomActionResultReceiver.parseBundleExtra(str, attributeSet, bundle);
    }
}
