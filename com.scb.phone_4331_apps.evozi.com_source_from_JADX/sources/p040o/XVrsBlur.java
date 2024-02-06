package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsBlur */
public final class XVrsBlur extends writeUInt64NoTag<IdWorkflowActivity_MembersInjector> {
    public final getLocalPort MediaBrowserCompat$ItemReceiver;
    final newIdentityHashMap read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public XVrsBlur(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, newIdentityHashMap newidentityhashmap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getlocalport, "cardManagementCase");
        onGetStartedClick.write((Object) newidentityhashmap, "cardTransactionsDtoMapper");
        this.MediaBrowserCompat$ItemReceiver = getlocalport;
        this.read = newidentityhashmap;
    }

    /* renamed from: o.XVrsBlur$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onUpgrade> {
        public IconCompatParcelizer() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            onUpgrade onupgrade = (onUpgrade) obj;
            onGetStartedClick.write((Object) onupgrade, "t");
            XVrsBlur xVrsBlur = XVrsBlur.this;
            writeUInt64NoTag.IconCompatParcelizer xVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver = new XVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver(this, onupgrade);
            if (xVrsBlur.RatingCompat != null) {
                xVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(xVrsBlur.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            XVrsBlur xVrsBlur = XVrsBlur.this;
            writeUInt64NoTag.IconCompatParcelizer xVrsBlur$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver = new C3960xe83734ad(this, th);
            if (xVrsBlur.RatingCompat != null) {
                xVrsBlur$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(xVrsBlur.RatingCompat);
            }
        }

        public final void onComplete() {
            XVrsBlur.read(XVrsBlur.this);
        }
    }

    public static final /* synthetic */ void read(XVrsBlur xVrsBlur) {
        if (xVrsBlur.RatingCompat != null) {
            xVrsBlur.RatingCompat.aj_();
        }
    }
}
