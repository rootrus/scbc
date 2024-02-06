package p040o;

import kotlin.TypeCastException;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUserEmailAddress$MediaBrowserCompat$SearchResultReceiver */
public final class setUserEmailAddress$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ int IconCompatParcelizer;
    private /* synthetic */ String read;

    public setUserEmailAddress$MediaBrowserCompat$SearchResultReceiver(String str, int i) {
        this.read = str;
        this.IconCompatParcelizer = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IParameters iParameters = (IParameters) obj;
        String str = this.read;
        int i = this.IconCompatParcelizer;
        if (str != null) {
            String substring = str.substring(0, i);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            iParameters.write(substring);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
