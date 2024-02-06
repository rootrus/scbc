package p040o;

import p040o.forceCompat;

/* renamed from: o.loadPerspective */
final class loadPerspective extends forceCompat {
    private final Int2<?> IconCompatParcelizer;
    private final Float4 MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final Int3<?, byte[]> read;
    private final RenderScript write;

    /* synthetic */ loadPerspective(RenderScript renderScript, String str, Int2 int2, Int3 int3, Float4 float4, byte b) {
        this(renderScript, str, int2, int3, float4);
    }

    private loadPerspective(RenderScript renderScript, String str, Int2<?> int2, Int3<?, byte[]> int3, Float4 float4) {
        this.write = renderScript;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = int2;
        this.read = int3;
        this.MediaBrowserCompat$CustomActionResultReceiver = float4;
    }

    public final RenderScript read() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final Int2<?> MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    /* access modifiers changed from: package-private */
    public final Int3<?, byte[]> write() {
        return this.read;
    }

    public final Float4 MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendRequest{transportContext=");
        sb.append(this.write);
        sb.append(", transportName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", event=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transformer=");
        sb.append(this.read);
        sb.append(", encoding=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof forceCompat)) {
            return false;
        }
        forceCompat forcecompat = (forceCompat) obj;
        if (!this.write.equals(forcecompat.read()) || !this.MediaBrowserCompat$ItemReceiver.equals(forcecompat.IconCompatParcelizer()) || !this.IconCompatParcelizer.equals(forcecompat.MediaBrowserCompat$ItemReceiver()) || !this.read.equals(forcecompat.write()) || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(forcecompat.MediaBrowserCompat$CustomActionResultReceiver())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.write.hashCode();
        int hashCode2 = this.MediaBrowserCompat$ItemReceiver.hashCode();
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ this.IconCompatParcelizer.hashCode()) * 1000003) ^ this.read.hashCode()) * 1000003) ^ this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    /* renamed from: o.loadPerspective$write */
    static final class write extends forceCompat.read {
        private Float4 IconCompatParcelizer;
        private Int2<?> MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private RenderScript read;
        private Int3<?, byte[]> write;

        write() {
        }

        public final forceCompat.read read(RenderScript renderScript) {
            if (renderScript != null) {
                this.read = renderScript;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public final forceCompat.read write(String str) {
            if (str != null) {
                this.MediaBrowserCompat$ItemReceiver = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* access modifiers changed from: package-private */
        public final forceCompat.read read(Int2<?> int2) {
            if (int2 != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = int2;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public final forceCompat.read read(Int3<?, byte[]> int3) {
            if (int3 != null) {
                this.write = int3;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* access modifiers changed from: package-private */
        public final forceCompat.read MediaBrowserCompat$ItemReceiver(Float4 float4) {
            if (float4 != null) {
                this.IconCompatParcelizer = float4;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        public final forceCompat MediaBrowserCompat$CustomActionResultReceiver() {
            String str;
            if (this.read == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" transportContext");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" transportName");
                str = sb2.toString();
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" event");
                str = sb3.toString();
            }
            if (this.write == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" transformer");
                str = sb4.toString();
            }
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" encoding");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new loadPerspective(this.read, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.IconCompatParcelizer, (byte) 0);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }
}
