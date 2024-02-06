package p040o;

import p040o.INativeGuidance;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSearchSymbology */
public final /* synthetic */ class getSearchSymbology implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ INativeGuidance.IconCompatParcelizer write;

    public /* synthetic */ getSearchSymbology(INativeGuidance.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector$MediaSessionCompat$Token) obj).read(INativeGuidance.this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer());
    }
}
