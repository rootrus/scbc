package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setLineHeight */
public final class setLineHeight {
    private int IconCompatParcelizer;
    private final Shader read;
    private final ColorStateList write;

    private setLineHeight(Shader shader, ColorStateList colorStateList, int i) {
        this.read = shader;
        this.write = colorStateList;
        this.IconCompatParcelizer = i;
    }

    static setLineHeight IconCompatParcelizer(Shader shader) {
        return new setLineHeight(shader, (ColorStateList) null, 0);
    }

    static setLineHeight IconCompatParcelizer(ColorStateList colorStateList) {
        return new setLineHeight((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    public static setLineHeight read(int i) {
        return new setLineHeight((Shader) null, (ColorStateList) null, i);
    }

    public final Shader IconCompatParcelizer() {
        return this.read;
    }

    public final int read() {
        return this.IconCompatParcelizer;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.IconCompatParcelizer = i;
    }

    public final boolean write() {
        return this.read != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.write;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.read
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.write
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLineHeight.MediaBrowserCompat$ItemReceiver():boolean");
    }

    public final boolean write(int[] iArr) {
        if (MediaBrowserCompat$ItemReceiver()) {
            ColorStateList colorStateList = this.write;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.IconCompatParcelizer) {
                this.IconCompatParcelizer = colorForState;
                return true;
            }
        }
        return false;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return write() || this.IconCompatParcelizer != 0;
    }

    public static setLineHeight IconCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        try {
            return MediaBrowserCompat$CustomActionResultReceiver(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    private static setLineHeight MediaBrowserCompat$CustomActionResultReceiver(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return IconCompatParcelizer(setPrecomputedText.MediaBrowserCompat$CustomActionResultReceiver(resources, xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return IconCompatParcelizer(setTextFuture.MediaBrowserCompat$CustomActionResultReceiver(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
