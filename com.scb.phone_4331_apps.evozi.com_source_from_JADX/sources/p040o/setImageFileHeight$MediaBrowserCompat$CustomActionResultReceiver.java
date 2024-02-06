package p040o;

import java.util.Iterator;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;
import p040o.zzin;

/* renamed from: o.setImageFileHeight$MediaBrowserCompat$CustomActionResultReceiver */
final class setImageFileHeight$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.setIcon> {
    private /* synthetic */ zzin.zza IconCompatParcelizer;
    private /* synthetic */ getDeviceState MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ setImageFileHeight read;

    setImageFileHeight$MediaBrowserCompat$CustomActionResultReceiver(setImageFileHeight setimagefileheight, getDeviceState getdevicestate, zzin.zza zza) {
        this.read = setimagefileheight;
        this.MediaBrowserCompat$CustomActionResultReceiver = getdevicestate;
        this.IconCompatParcelizer = zza;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        CheckExtractActivity_MembersInjector.setIcon seticon = (CheckExtractActivity_MembersInjector.setIcon) obj;
        seticon.IconCompatParcelizer(setImageFileHeight.read(this.read).MediaBrowserCompat$CustomActionResultReceiver);
        seticon.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        seticon.MediaBrowserCompat$CustomActionResultReceiver(true);
        setImageFileHeight setimagefileheight = this.read;
        setimagefileheight.f2944x50fd9e4a = setimagefileheight.read;
        setImageFileHeight setimagefileheight2 = this.read;
        setimagefileheight2.ParcelableVolumeInfo = Double.parseDouble(setimagefileheight2.IconCompatParcelizer);
        setImageFileHeight setimagefileheight3 = this.read;
        Iterator it = this.IconCompatParcelizer.IconCompatParcelizer.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((setDataCollectionEnabled) obj2).MediaBrowserCompat$ItemReceiver, (Object) "ANNUAL_INTEREST")) {
                break;
            }
        }
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj2;
        if (setdatacollectionenabled != null) {
            str2 = setdatacollectionenabled.write;
        } else {
            str2 = null;
        }
        setimagefileheight3.MediaBrowserCompat$ItemReceiver = str2;
        setImageFileHeight setimagefileheight4 = this.read;
        Iterator it2 = this.IconCompatParcelizer.IconCompatParcelizer.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((setDataCollectionEnabled) obj3).MediaBrowserCompat$ItemReceiver, (Object) "MONTHLY_PAYMENT")) {
                break;
            }
        }
        setDataCollectionEnabled setdatacollectionenabled2 = (setDataCollectionEnabled) obj3;
        if (setdatacollectionenabled2 != null) {
            str = setdatacollectionenabled2.write;
        }
        setimagefileheight4.MediaBrowserCompat$MediaItem = str;
    }
}
