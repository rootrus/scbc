package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.zzfo;

/* renamed from: o.writeDoubleObject */
public final /* synthetic */ class writeDoubleObject implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setShowCancelButton MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeDoubleObject(setShowCancelButton setshowcancelbutton) {
        this.MediaBrowserCompat$ItemReceiver = setshowcancelbutton;
    }

    public final Object write(Object obj) {
        List<zzfo.zzd> list;
        List<zzfo.zzd> list2;
        List<zzfo.zzd> list3;
        List<zzfo.zzd> list4;
        setShowCancelButton setshowcancelbutton = this.MediaBrowserCompat$ItemReceiver;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        List<zzfo.zzc> list5 = null;
        if ("3000".equals(singleDataEntity.getStatus().write())) {
            zzfo.zzf.read read = new zzfo.zzf.read();
            read.read = true;
            setOnPageChangeListener status = singleDataEntity.getStatus();
            g_$MediaBrowserCompat$ItemReceiver g__mediabrowsercompat_itemreceiver = new g_$MediaBrowserCompat$ItemReceiver();
            g__mediabrowsercompat_itemreceiver.IconCompatParcelizer = status.MediaBrowserCompat$ItemReceiver();
            g__mediabrowsercompat_itemreceiver.read = status.IconCompatParcelizer();
            read.MediaBrowserCompat$ItemReceiver = new C4467g_(g__mediabrowsercompat_itemreceiver, (byte) 0);
            if (((onAnimationUpdate) singleDataEntity.getData()).IconCompatParcelizer != null) {
                list3 = setshowcancelbutton.IconCompatParcelizer(((onAnimationUpdate) singleDataEntity.getData()).IconCompatParcelizer);
            } else {
                list3 = null;
            }
            read.MediaMetadataCompat = list3;
            if (((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver != null) {
                list4 = setshowcancelbutton.IconCompatParcelizer(((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                list4 = null;
            }
            read.MediaBrowserCompat$CustomActionResultReceiver = list4;
            if (((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver != null) {
                list5 = setshowcancelbutton.MediaBrowserCompat$ItemReceiver(((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver);
            }
            read.IconCompatParcelizer = list5;
            return new zzfo.zzf(read, (byte) 0);
        }
        zzfo.zzf.read read2 = new zzfo.zzf.read();
        read2.read = false;
        if (((onAnimationUpdate) singleDataEntity.getData()).IconCompatParcelizer != null) {
            list = setshowcancelbutton.IconCompatParcelizer(((onAnimationUpdate) singleDataEntity.getData()).IconCompatParcelizer);
        } else {
            list = null;
        }
        read2.MediaMetadataCompat = list;
        if (((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver != null) {
            list2 = setshowcancelbutton.IconCompatParcelizer(((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            list2 = null;
        }
        read2.MediaBrowserCompat$CustomActionResultReceiver = list2;
        read2.write = setshowcancelbutton.IconCompatParcelizer(((onAnimationUpdate) singleDataEntity.getData()).read);
        if (((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver != null) {
            list5 = setshowcancelbutton.MediaBrowserCompat$ItemReceiver(((onAnimationUpdate) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver);
        }
        read2.IconCompatParcelizer = list5;
        return new zzfo.zzf(read2, (byte) 0);
    }
}
