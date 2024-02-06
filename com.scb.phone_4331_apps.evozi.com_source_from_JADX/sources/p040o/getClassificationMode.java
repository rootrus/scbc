package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.Maps;
import p040o.writeUInt64NoTag;

/* renamed from: o.getClassificationMode */
public final /* synthetic */ class getClassificationMode implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ afterExecute MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ detectVersion$MediaBrowserCompat$CustomActionResultReceiver read;

    public /* synthetic */ getClassificationMode(detectVersion$MediaBrowserCompat$CustomActionResultReceiver detectversion_mediabrowsercompat_customactionresultreceiver, afterExecute afterexecute) {
        this.read = detectversion_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = afterexecute;
    }

    public final void IconCompatParcelizer(Object obj) {
        detectVersion$MediaBrowserCompat$CustomActionResultReceiver detectversion_mediabrowsercompat_customactionresultreceiver = this.read;
        afterExecute afterexecute = this.MediaBrowserCompat$ItemReceiver;
        getAddress4 getaddress4 = (getAddress4) obj;
        getaddress4.aj_();
        transformEntry MediaBrowserCompat$CustomActionResultReceiver = detectversion_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        registerAnalyticsConnectorListener read2 = getaddress4.read();
        boolean itemInvoker = detectversion_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
        registerAnalyticsConnectorListener registeranalyticsconnectorlistener = new registerAnalyticsConnectorListener();
        registeranalyticsconnectorlistener.read = read2.read;
        registeranalyticsconnectorlistener.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        registeranalyticsconnectorlistener.MediaSessionCompat$ResultReceiverWrapper = read2.MediaSessionCompat$ResultReceiverWrapper;
        registeranalyticsconnectorlistener.RatingCompat = read2.RatingCompat;
        registeranalyticsconnectorlistener.MediaMetadataCompat = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(read2.RatingCompat, itemInvoker);
        registeranalyticsconnectorlistener.write = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(afterexecute.IconCompatParcelizer);
        setTvRemark$MediaBrowserCompat$ItemReceiver settvremark_mediabrowsercompat_itemreceiver = afterexecute.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        registeranalyticsconnectorlistener.IconCompatParcelizer = String.format("%s %s", new Object[]{ModifyQuickTopUpReviewActivity.IconCompatParcelizer(settvremark_mediabrowsercompat_itemreceiver.IconCompatParcelizer, "0"), MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.month_label)});
        registeranalyticsconnectorlistener.f2926x50fd9e4a = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(settvremark_mediabrowsercompat_itemreceiver.MediaMetadataCompat);
        registeranalyticsconnectorlistener.MediaSessionCompat$QueueItem = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver);
        registeranalyticsconnectorlistener.MediaSessionCompat$Token = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
        registeranalyticsconnectorlistener.MediaDescriptionCompat = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
        registeranalyticsconnectorlistener.ParcelableVolumeInfo = "";
        String str = afterexecute.MediaBrowserCompat$ItemReceiver.read;
        if (str == null || str.length() == 0) {
            z = true;
        }
        registeranalyticsconnectorlistener.MediaBrowserCompat$SearchResultReceiver = z;
        if (registeranalyticsconnectorlistener.MediaBrowserCompat$SearchResultReceiver) {
            registeranalyticsconnectorlistener.MediaBrowserCompat$ItemReceiver = afterexecute.MediaBrowserCompat$ItemReceiver.write.concat("%");
        } else {
            registeranalyticsconnectorlistener.MediaBrowserCompat$ItemReceiver = afterexecute.MediaBrowserCompat$ItemReceiver.RatingCompat.concat("%");
        }
        registeranalyticsconnectorlistener.Keep = afterexecute.read;
        Maps.AbstractMapWrapper IconCompatParcelizer = detectversion_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.read;
        String IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(afterexecute.MediaBrowserCompat$CustomActionResultReceiver));
        getProjectId getprojectid = new getProjectId();
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id_label));
        sb.append(" ");
        sb.append(afterexecute.write);
        getprojectid.write = sb.toString();
        getprojectid.IconCompatParcelizer = IconCompatParcelizer2;
        getaddress4.write(getprojectid, registeranalyticsconnectorlistener);
    }
}
