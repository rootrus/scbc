package p040o;

import p040o.ImagePerfectionProfile;
import p040o.getImageHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUseMRZPassportDetection */
public final /* synthetic */ class getUseMRZPassportDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$1600 read;

    public /* synthetic */ getUseMRZPassportDetection(access$1600 access_1600) {
        this.read = access_1600;
    }

    public final void IconCompatParcelizer(Object obj) {
        ImagePerfectionProfile.UseTargetFrameCrop.write(this.read, (getImageHeight.write) obj);
    }
}
