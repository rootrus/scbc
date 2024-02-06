package p040o;

/* renamed from: o.CGERC */
public final class CGERC extends zzma {
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;

    public CGERC(getIIdDeserializerKta getiiddeserializerkta) {
        super(getiiddeserializerkta);
    }

    public final setFontAssetDelegate$MediaBrowserCompat$ItemReceiver write(rsnIncElementCreate rsnincelementcreate) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            return new setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(new rsnScriptSetVarJ(rsnincelementcreate.IconCompatParcelizer()));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        return new setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(new rsnScriptSetVarJ(rsnincelementcreate));
    }
}
