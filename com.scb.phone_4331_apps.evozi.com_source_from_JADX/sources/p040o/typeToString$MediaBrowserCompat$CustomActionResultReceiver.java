package p040o;

import p040o.GoogleMap;
import p040o.getIIdDeserializerOnDevice;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaBrowserCompat$CustomActionResultReceiver */
public final class typeToString$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.SnapshotReadyCallback, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ typeToString MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public typeToString$MediaBrowserCompat$CustomActionResultReceiver(typeToString typetostring, String str) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = typetostring;
        this.write = str;
    }

    /* renamed from: o.typeToString$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
        private /* synthetic */ chain IconCompatParcelizer;
        private /* synthetic */ GoogleMap.SnapshotReadyCallback MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ typeToString$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

        write(chain chain, typeToString$MediaBrowserCompat$CustomActionResultReceiver typetostring_mediabrowsercompat_customactionresultreceiver, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
            this.IconCompatParcelizer = chain;
            this.MediaBrowserCompat$ItemReceiver = typetostring_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = snapshotReadyCallback;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(typeToString.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.write, this.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        GoogleMap.SnapshotReadyCallback snapshotReadyCallback = (GoogleMap.SnapshotReadyCallback) obj;
        onGetStartedClick.write((Object) snapshotReadyCallback, "it");
        typeToString.MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$ItemReceiver);
        chain MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.write;
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            typeToString typetostring = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer write2 = new write(MediaBrowserCompat$ItemReceiver2, this, snapshotReadyCallback);
            if (typetostring.RatingCompat != null) {
                write2.IconCompatParcelizer(typetostring.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
