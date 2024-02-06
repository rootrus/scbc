package p040o;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: o.onAlienCardTabClicked */
public final class onAlienCardTabClicked extends AbstractList<SCBUniversalWebViewActivity_ViewBinding> implements RandomAccess {
    public static final C7297xe1f4fb57 MediaBrowserCompat$ItemReceiver = new C7297xe1f4fb57((byte) 0);
    final SCBUniversalWebViewActivity_ViewBinding[] IconCompatParcelizer;
    final int[] MediaBrowserCompat$CustomActionResultReceiver;

    public static final onAlienCardTabClicked read(SCBUniversalWebViewActivity_ViewBinding... sCBUniversalWebViewActivity_ViewBindingArr) {
        return MediaBrowserCompat$ItemReceiver.read(sCBUniversalWebViewActivity_ViewBindingArr);
    }

    public /* synthetic */ onAlienCardTabClicked(SCBUniversalWebViewActivity_ViewBinding[] sCBUniversalWebViewActivity_ViewBindingArr, int[] iArr, byte b) {
        this(sCBUniversalWebViewActivity_ViewBindingArr, iArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof SCBUniversalWebViewActivity_ViewBinding;
        } else {
            z = true;
        }
        if (z) {
            return super.contains((SCBUniversalWebViewActivity_ViewBinding) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof SCBUniversalWebViewActivity_ViewBinding;
        } else {
            z = true;
        }
        if (z) {
            return super.indexOf((SCBUniversalWebViewActivity_ViewBinding) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof SCBUniversalWebViewActivity_ViewBinding;
        } else {
            z = true;
        }
        if (z) {
            return super.lastIndexOf((SCBUniversalWebViewActivity_ViewBinding) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof SCBUniversalWebViewActivity_ViewBinding;
        } else {
            z = true;
        }
        if (z) {
            return super.remove((SCBUniversalWebViewActivity_ViewBinding) obj);
        }
        return false;
    }

    private onAlienCardTabClicked(SCBUniversalWebViewActivity_ViewBinding[] sCBUniversalWebViewActivity_ViewBindingArr, int[] iArr) {
        this.IconCompatParcelizer = sCBUniversalWebViewActivity_ViewBindingArr;
        this.MediaBrowserCompat$CustomActionResultReceiver = iArr;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.IconCompatParcelizer[i];
    }

    public final /* bridge */ int size() {
        return this.IconCompatParcelizer.length;
    }
}
