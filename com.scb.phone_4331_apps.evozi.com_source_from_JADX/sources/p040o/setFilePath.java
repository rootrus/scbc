package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.FirebaseApp;
import p040o.getSmilingProbability;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFilePath */
public final /* synthetic */ class setFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSmilingProbability.read IconCompatParcelizer;
    private final /* synthetic */ getPayload MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setFilePath(getSmilingProbability.read read, getPayload getpayload) {
        this.IconCompatParcelizer = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = getpayload;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSmilingProbability.read read = this.IconCompatParcelizer;
        getPayload getpayload = this.MediaBrowserCompat$CustomActionResultReceiver;
        ConventionBasedJsonIdDeserializer conventionBasedJsonIdDeserializer = (ConventionBasedJsonIdDeserializer) obj;
        uniqueIndex IconCompatParcelizer2 = getSmilingProbability.this.IconCompatParcelizer;
        FirebaseNetworkException MediaBrowserCompat$ItemReceiver = conventionBasedJsonIdDeserializer.MediaBrowserCompat$ItemReceiver();
        FirebaseApp.UserUnlockReceiver userUnlockReceiver = new FirebaseApp.UserUnlockReceiver();
        userUnlockReceiver.MediaBrowserCompat$MediaItem = IconCompatParcelizer2.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(getpayload.MediaDescriptionCompat));
        userUnlockReceiver.read = MediaBrowserCompat$ItemReceiver.RatingCompat;
        userUnlockReceiver.write = getpayload.read;
        userUnlockReceiver.IconCompatParcelizer = getpayload.MediaBrowserCompat$ItemReceiver;
        userUnlockReceiver.MediaBrowserCompat$CustomActionResultReceiver = getpayload.write;
        userUnlockReceiver.MediaBrowserCompat$ItemReceiver = getpayload.MediaBrowserCompat$CustomActionResultReceiver;
        userUnlockReceiver.MediaMetadataCompat = String.format("%s %s", new Object[]{IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id_label), getpayload.MediaBrowserCompat$SearchResultReceiver});
        userUnlockReceiver.RatingCompat = MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        userUnlockReceiver.MediaBrowserCompat$SearchResultReceiver = Double.valueOf(MediaBrowserCompat$ItemReceiver.read.doubleValue() + getpayload.read.doubleValue());
        conventionBasedJsonIdDeserializer.IconCompatParcelizer(userUnlockReceiver);
    }
}
