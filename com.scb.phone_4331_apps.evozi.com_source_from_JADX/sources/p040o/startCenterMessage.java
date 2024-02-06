package p040o;

import java.util.List;
import p040o.CheckParameters_MembersInjector;
import p040o.access$2300;

/* renamed from: o.startCenterMessage */
public class startCenterMessage extends writeUInt64NoTag<CheckParameters_MembersInjector.IconCompatParcelizer> {
    public final SquareCap MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final toShortArray read;
    final Ints write;

    @HmlPinActivity
    public startCenterMessage(SquareCap squareCap, Ints ints, RegularImmutableBiMap regularImmutableBiMap, toShortArray toshortarray) {
        super(regularImmutableBiMap);
        this.read = toshortarray;
        this.write = ints;
        this.MediaBrowserCompat$ItemReceiver = squareCap;
    }

    /* renamed from: o.startCenterMessage$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onInfoWindowLongClick>> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(startCenterMessage startcentermessage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            startCenterMessage.write(startCenterMessage.this);
            boolean z = true;
            if (!(startCenterMessage.this.RatingCompat != null)) {
                return;
            }
            if (list == null || list.size() <= 0) {
                startCenterMessage startcentermessage = startCenterMessage.this;
                isMessageDisplayed ismessagedisplayed = isMessageDisplayed.MediaBrowserCompat$ItemReceiver;
                if (startcentermessage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ismessagedisplayed.IconCompatParcelizer(startcentermessage.RatingCompat);
                    return;
                }
                return;
            }
            startCenterMessage startcentermessage2 = startCenterMessage.this;
            C4789ic icVar = new C4789ic(this, list);
            if (startcentermessage2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                icVar.IconCompatParcelizer(startcentermessage2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            startCenterMessage.this.MediaBrowserCompat$ItemReceiver(startCenterMessage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void write(startCenterMessage startcentermessage) {
        if (startcentermessage.RatingCompat != null) {
            startcentermessage.RatingCompat.aj_();
        }
    }
}
