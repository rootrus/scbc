package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.RttiBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver */
final class C7033xe208eb3e<T> implements DebitCardMarketConductDeepLinkActivity<List<parseOs>> {
    final /* synthetic */ RttiBillExtractor_Factory IconCompatParcelizer;

    C7033xe208eb3e(RttiBillExtractor_Factory rttiBillExtractor_Factory) {
        this.IconCompatParcelizer = rttiBillExtractor_Factory;
    }

    /* renamed from: o.RttiBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements getAllowReturnTransitionOverlap<parseOs> {
        private /* synthetic */ C7033xe208eb3e MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(C7033xe208eb3e rttiBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = rttiBillExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ boolean write(Object obj) {
            parseOs parseos = (parseOs) obj;
            onGetStartedClick.IconCompatParcelizer((Object) parseos, "item");
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) parseos.write, (Object) this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final isSupportFragmentClass issupportfragmentclass;
        final List list = (List) obj;
        this.IconCompatParcelizer.write = list;
        boolean z = true;
        if (!(this.IconCompatParcelizer.RatingCompat != null)) {
            return;
        }
        if (this.IconCompatParcelizer.MediaDescriptionCompat == null) {
            RttiBillExtractor_Factory rttiBillExtractor_Factory = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r3 = new writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setTitle>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver((List<parseOs>) list);
                }
            };
            if (rttiBillExtractor_Factory.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r3.IconCompatParcelizer(rttiBillExtractor_Factory.RatingCompat);
                return;
            }
            return;
        }
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new IconCompatParcelizer(this)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) issupportfragmentclass, "optionalAccountTargetDisplay");
        if ((issupportfragmentclass.IconCompatParcelizer != null) && RttiBillExtractor_Factory.MediaMetadataCompat(this.IconCompatParcelizer)) {
            RttiBillExtractor_Factory rttiBillExtractor_Factory2 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r32 = new writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setTitle>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    getTopLeftCornerWidth.setTitle settitle = (getTopLeftCornerWidth.setTitle) obj;
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        settitle.MediaBrowserCompat$ItemReceiver((parseOs) t);
                        return;
                    }
                    throw new NoSuchElementException("No value present");
                }
            };
            if (rttiBillExtractor_Factory2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r32.IconCompatParcelizer(rttiBillExtractor_Factory2.RatingCompat);
            }
        } else if (RttiBillExtractor_Factory.MediaMetadataCompat(this.IconCompatParcelizer)) {
            getStreetViewPanoramaAsync getstreetviewpanoramaasync = new getStreetViewPanoramaAsync();
            getstreetviewpanoramaasync.write = this.IconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
            getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaDescriptionCompat.AppCompatDialogFragment;
            Shorts unused = this.IconCompatParcelizer.MediaMetadataCompat;
            final parseOs read = Shorts.read(getstreetviewpanoramaasync, this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker());
            RttiBillExtractor_Factory rttiBillExtractor_Factory3 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r33 = new writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setTitle>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((getTopLeftCornerWidth.setTitle) obj).MediaBrowserCompat$ItemReceiver(read);
                }
            };
            if (rttiBillExtractor_Factory3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r33.IconCompatParcelizer(rttiBillExtractor_Factory3.RatingCompat);
            }
        }
    }
}
