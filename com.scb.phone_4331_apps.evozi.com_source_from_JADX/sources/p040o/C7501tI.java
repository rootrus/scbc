package p040o;

import java.util.List;
import p040o.AbstractIdleService;
import p040o.AppMeasurementSdk;
import p040o.access$2300;

/* renamed from: o.tI */
public class C7501tI extends writeUInt64NoTag<isUndefined> {
    public boolean IconCompatParcelizer = false;
    public final onInfoWindowLongClick MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final AbstractIdleService.C29991 MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver = true;
    /* access modifiers changed from: private */
    public setUuidFromUtf8Bytes MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public final wrapList read;
    public parseEventApp write;

    @HmlPinActivity
    public C7501tI(wrapList wraplist, AppMeasurementSdk.OnEventListener onEventListener, AbstractIdleService.C29991 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = onEventListener.read.write();
        this.read = wraplist;
        this.MediaBrowserCompat$MediaItem = r3;
    }

    public final void read() {
        parseEventApp parseeventapp = this.write;
        boolean z = false;
        if (parseeventapp == null || !this.IconCompatParcelizer) {
            startActivityForResult_aroundBody3$advice startactivityforresult_aroundbody3_advice = startActivityForResult_aroundBody3$advice.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                startactivityforresult_aroundbody3_advice.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        String str = parseeventapp.MediaBrowserCompat$CustomActionResultReceiver;
        if (!(str == null || str.length() == 0)) {
            C7497tE tEVar = C7497tE.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                tEVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        startActivityForResult_aroundBody3$advice startactivityforresult_aroundbody3_advice2 = startActivityForResult_aroundBody3$advice.write;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            startactivityforresult_aroundbody3_advice2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.tI$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setIndoorLevelPickerEnabled> {
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        final IGoogleMapDelegate read;

        public final /* synthetic */ void onNext(Object obj) {
            setIndoorLevelPickerEnabled setindoorlevelpickerenabled = (setIndoorLevelPickerEnabled) obj;
            super.onNext(setindoorlevelpickerenabled);
            C7501tI tIVar = C7501tI.this;
            startActivityForResult_aroundBody4 startactivityforresult_aroundbody4 = startActivityForResult_aroundBody4.write;
            boolean z = true;
            if (tIVar.RatingCompat != null) {
                startactivityforresult_aroundbody4.IconCompatParcelizer(tIVar.RatingCompat);
            }
            C7501tI tIVar2 = C7501tI.this;
            setUuidFromUtf8Bytes unused = tIVar2.MediaDescriptionCompat = tIVar2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(setindoorlevelpickerenabled, this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, C7501tI.this.read.write.setItemInvoker());
            C7501tI tIVar3 = C7501tI.this;
            ProcessActivity processActivity = new ProcessActivity(this);
            if (tIVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                processActivity.IconCompatParcelizer(tIVar3.RatingCompat);
            }
        }

        public read(IGoogleMapDelegate iGoogleMapDelegate, String str, onInfoWindowLongClick oninfowindowlongclick) {
            String str2;
            this.read = iGoogleMapDelegate;
            this.IconCompatParcelizer = str;
            if (oninfowindowlongclick != null) {
                str2 = oninfowindowlongclick.AppCompatDialogFragment;
            } else {
                str2 = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        public final void onError(Throwable th) {
            super.onError(th);
            C7501tI tIVar = C7501tI.this;
            startActivityForResult_aroundBody4 startactivityforresult_aroundbody4 = startActivityForResult_aroundBody4.write;
            boolean z = true;
            if (tIVar.RatingCompat != null) {
                startactivityforresult_aroundbody4.IconCompatParcelizer(tIVar.RatingCompat);
            }
            access$2200 MediaBrowserCompat$ItemReceiver2 = C7501tI.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            C7501tI tIVar2 = C7501tI.this;
            inject_store inject_store = new inject_store(MediaBrowserCompat$ItemReceiver2);
            if (tIVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                inject_store.IconCompatParcelizer(tIVar2.RatingCompat);
            }
        }
    }

    public static long MediaBrowserCompat$ItemReceiver(List<parseEventExecutionException> list) {
        if (list == null) {
            return 0;
        }
        show show = new show(list);
        return new show(show.write, new getNextTransition(show.IconCompatParcelizer, C7498tF.IconCompatParcelizer)).write();
    }
}
