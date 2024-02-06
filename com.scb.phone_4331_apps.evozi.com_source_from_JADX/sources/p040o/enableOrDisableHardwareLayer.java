package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.enableOrDisableHardwareLayer */
public final class enableOrDisableHardwareLayer extends setCurrentItemInternal {
    @SerializedName("limitationFlag")
    public final Boolean IconCompatParcelizer;
    @SerializedName("maximumLimit")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("stock")
    public final Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("quotaLimit")
    public final Integer write;

    public enableOrDisableHardwareLayer() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableOrDisableHardwareLayer)) {
            return false;
        }
        enableOrDisableHardwareLayer enableordisablehardwarelayer = (enableOrDisableHardwareLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) enableordisablehardwarelayer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) enableordisablehardwarelayer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) enableordisablehardwarelayer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) enableordisablehardwarelayer.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.write;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = num3 != null ? num3.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuotaLimitEntity(maximumLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", quotaLimit=");
        sb.append(this.write);
        sb.append(", stock=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", limitationFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ enableOrDisableHardwareLayer(byte b) {
        this(0, 0, 0, Boolean.FALSE);
    }

    private enableOrDisableHardwareLayer(Integer num, Integer num2, Integer num3, Boolean bool) {
        this.MediaBrowserCompat$CustomActionResultReceiver = num;
        this.write = num2;
        this.MediaBrowserCompat$ItemReceiver = num3;
        this.IconCompatParcelizer = bool;
    }
}
