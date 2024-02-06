package p040o;

import java.util.Arrays;

/* renamed from: o.loadOrthoWindow */
final class loadOrthoWindow extends RenderScript {
    private final Int4 IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final byte[] write;

    /* synthetic */ loadOrthoWindow(String str, byte[] bArr, Int4 int4, byte b) {
        this(str, bArr, int4);
    }

    private loadOrthoWindow(String str, byte[] bArr, Int4 int4) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = bArr;
        this.IconCompatParcelizer = int4;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final Int4 read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RenderScript)) {
            return false;
        }
        RenderScript renderScript = (RenderScript) obj;
        if (this.MediaBrowserCompat$ItemReceiver.equals(renderScript.write())) {
            if (Arrays.equals(this.write, renderScript instanceof loadOrthoWindow ? ((loadOrthoWindow) renderScript).write : renderScript.MediaBrowserCompat$ItemReceiver()) && this.IconCompatParcelizer.equals(renderScript.read())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.MediaBrowserCompat$ItemReceiver.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.write)) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    /* renamed from: o.loadOrthoWindow$IconCompatParcelizer */
    static final class IconCompatParcelizer extends RenderScript$MediaBrowserCompat$ItemReceiver {
        private String IconCompatParcelizer;
        Int4 MediaBrowserCompat$CustomActionResultReceiver;
        private byte[] MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer() {
        }

        public final RenderScript$MediaBrowserCompat$ItemReceiver read(String str) {
            if (str != null) {
                this.IconCompatParcelizer = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final RenderScript$MediaBrowserCompat$ItemReceiver read(byte[] bArr) {
            this.MediaBrowserCompat$ItemReceiver = bArr;
            return this;
        }

        public final RenderScript$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(Int4 int4) {
            if (int4 != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = int4;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        public final RenderScript IconCompatParcelizer() {
            String str;
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" backendName");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" priority");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new loadOrthoWindow(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
