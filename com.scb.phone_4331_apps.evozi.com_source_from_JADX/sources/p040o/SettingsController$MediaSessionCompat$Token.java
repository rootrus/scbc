package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsController$MediaSessionCompat$Token */
public final class SettingsController$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
    private /* synthetic */ String write;

    public SettingsController$MediaSessionCompat$Token(String str) {
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getTopRightCornerHeight gettoprightcornerheight = (getTopRightCornerHeight) obj;
        gettoprightcornerheight.IconCompatParcelizer();
        gettoprightcornerheight.read(this.write);
    }
}
