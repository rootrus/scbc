package p040o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.zzma */
public class zzma implements rsnScriptFieldIDCreate {
    public List<rsnScriptForEach> IconCompatParcelizer;
    private getIIdDeserializerKta write;

    public zzma() {
    }

    /* renamed from: o.zzma$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public byte[] IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public Rect MediaBrowserCompat$ItemReceiver;
        public int MediaDescriptionCompat;
        public int read;
        public int write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(byte[] bArr, int i, int i2, int i3, int i4) {
            this.IconCompatParcelizer = bArr;
            this.write = i;
            this.read = i2;
            this.MediaDescriptionCompat = i4;
            this.MediaBrowserCompat$CustomActionResultReceiver = i3;
            if (i * i2 > bArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Image data does not match the resolution. ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append(" > ");
                sb.append(bArr.length);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public zzma(getIIdDeserializerKta getiiddeserializerkta) {
        this.IconCompatParcelizer = new ArrayList();
        this.write = getiiddeserializerkta;
    }

    private getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer.clear();
        getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = null;
        try {
            if (this.write instanceof rsnSamplerCreate) {
                rsnSamplerCreate rsnsamplercreate = (rsnSamplerCreate) this.write;
                if (rsnsamplercreate.read == null) {
                    rsnsamplercreate.MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) null);
                }
                getlayers_mediabrowsercompat_customactionresultreceiver = rsnsamplercreate.MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver);
            } else {
                getlayers_mediabrowsercompat_customactionresultreceiver = this.write.read(setfontassetdelegate_mediabrowsercompat_itemreceiver);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver();
            throw th;
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
        return getlayers_mediabrowsercompat_customactionresultreceiver;
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(rsnIncElementCreate rsnincelementcreate) {
        return MediaBrowserCompat$CustomActionResultReceiver(write(rsnincelementcreate));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(rsnScriptForEach rsnscriptforeach) {
        this.IconCompatParcelizer.add(rsnscriptforeach);
    }

    /* access modifiers changed from: protected */
    public setFontAssetDelegate$MediaBrowserCompat$ItemReceiver write(rsnIncElementCreate rsnincelementcreate) {
        return new setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(new rsnScriptSetVarJ(rsnincelementcreate));
    }
}
