package p040o;

import p040o.C$Gson$Preconditions;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAsDouble */
public final /* synthetic */ class getAsDouble implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDependencies IconCompatParcelizer;
    private final /* synthetic */ C$Gson$Preconditions.write read;

    public /* synthetic */ getAsDouble(C$Gson$Preconditions.write write, getDependencies getdependencies) {
        this.read = write;
        this.IconCompatParcelizer = getdependencies;
    }

    public final void IconCompatParcelizer(Object obj) {
        C$Gson$Preconditions.write write = this.read;
        getSignatureImage getsignatureimage = (getSignatureImage) obj;
        boolean z = false;
        intoSet intoset = this.IconCompatParcelizer.IconCompatParcelizer.get(0);
        getsignatureimage.write(intoset, write.write.MediaSessionCompat$QueueItem);
        C$Gson$Preconditions _gson_preconditions = C$Gson$Preconditions.this;
        String str = write.write.MediaBrowserCompat$ItemReceiver;
        String str2 = write.write.read;
        Integer num = intoset.PlaybackStateCompat$CustomAction;
        Integer num2 = intoset.ParcelableVolumeInfo;
        Integer num3 = intoset.IconCompatParcelizer;
        Boolean valueOf = Boolean.valueOf(write.write.MediaSessionCompat$ResultReceiverWrapper);
        Double MediaBrowserCompat$CustomActionResultReceiver = C$Gson$Preconditions.MediaBrowserCompat$CustomActionResultReceiver(str2);
        boolean z2 = C$Gson$Preconditions.MediaBrowserCompat$ItemReceiver(str).intValue() >= num.intValue();
        boolean z3 = C$Gson$Preconditions.MediaBrowserCompat$ItemReceiver(str).intValue() >= num2.intValue() && MediaBrowserCompat$CustomActionResultReceiver.doubleValue() >= ((double) num3.intValue());
        getAsBigInteger getasbiginteger = new getAsBigInteger(valueOf, z2, z3, z3 && !z2, z2 || z3);
        if (_gson_preconditions.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getasbiginteger.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
        if (write.write.MediaSessionCompat$ResultReceiverWrapper) {
            getsignatureimage.MediaDescriptionCompat();
            getsignatureimage.MediaBrowserCompat$SearchResultReceiver();
        }
    }
}
