package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nA */
public final class C4995nA extends writeUInt64NoTag<setFaceRightPadding> {
    public final delegate IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final getInheritableThreadLocalsField MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final toLongArray MediaBrowserCompat$MediaItem;
    public final setUserPropertyInternal read;
    String write = "EASYAPP";

    /* renamed from: o.nA$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceRightPadding> {
        private /* synthetic */ C4995nA write;

        public IconCompatParcelizer(C4995nA nAVar) {
            this.write = nAVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setFaceRightPadding) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$MediaItem, (String) null, this.write.write, (String) null, (String) null, true, false, (String) null, 72));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4995nA(delegate delegate, setUserPropertyInternal setuserpropertyinternal, toLongArray tolongarray, getInheritableThreadLocalsField getinheritablethreadlocalsfield, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) delegate, "preActivateCase");
        onGetStartedClick.write((Object) setuserpropertyinternal, "preLoadCheckCase");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        onGetStartedClick.write((Object) getinheritablethreadlocalsfield, "isReferralRegistrationCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = delegate;
        this.read = setuserpropertyinternal;
        this.MediaBrowserCompat$MediaItem = tolongarray;
        this.MediaBrowserCompat$ItemReceiver = getinheritablethreadlocalsfield;
    }

    public static final /* synthetic */ void write(C4995nA nAVar) {
        if (nAVar.RatingCompat != null) {
            nAVar.RatingCompat.aj_();
        }
    }
}
