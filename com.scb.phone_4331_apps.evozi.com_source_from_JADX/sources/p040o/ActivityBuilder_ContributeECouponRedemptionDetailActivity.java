package p040o;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.fragment.landingpage.LandingFragment;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import p040o.CustomConcurrentHashMap;
import p040o.IAccountAccessor;
import p040o.StreetViewPanorama;
import p040o.getProcessName;

/* renamed from: o.ActivityBuilder_ContributeECouponRedemptionDetailActivity */
public final class ActivityBuilder_ContributeECouponRedemptionDetailActivity extends ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity {
    private WeakReference<ImageView> MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityBuilder_ContributeECouponRedemptionDetailActivity(LandingFragment landingFragment, RecyclerView recyclerView, ImageView imageView) {
        super(landingFragment, recyclerView);
        onGetStartedClick.write((Object) landingFragment, "landingFragment");
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        onGetStartedClick.write((Object) imageView, "staticLoadingImageView");
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(imageView);
    }

    /* renamed from: o.ActivityBuilder_ContributeECouponRedemptionDetailActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements LocalProjectProvider_MembersInjector {
        private final getProcessName.read IconCompatParcelizer;
        public final getChimeraLifecycleFragmentImpl read;
        private final FragmentBuilder_BindPurchaseDepositInputFragment write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(getProcessName.read read2, FragmentBuilder_BindPurchaseDepositInputFragment fragmentBuilder_BindPurchaseDepositInputFragment, getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
            this.IconCompatParcelizer = read2;
            this.read = getchimeralifecyclefragmentimpl;
            this.write = fragmentBuilder_BindPurchaseDepositInputFragment;
        }

        public final DebitCardResetOtpActivity<setZoomGesturesEnabled> write(unsetEntry unsetentry) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.confirmGift(unsetentry).map(zzfu.IconCompatParcelizer).map(new PlatformVersion(this.read));
        }

        public final DebitCardResetOtpActivity<setZoomGesturesEnabled> IconCompatParcelizer(unsetEntry unsetentry) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.confirmGiftPresent(unsetentry).map(zzfu.IconCompatParcelizer).map(new PlatformVersion(this.read));
        }

        public final DebitCardResetOtpActivity<onStreetViewPanoramaCameraChange> MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getGifts().flatMap(new deserializeIterableFromIntentExtra(this));
        }

        public final DebitCardResetOtpActivity<StreetViewPanorama.OnStreetViewPanoramaClickListener> MediaBrowserCompat$ItemReceiver() {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getSharingMomentConfig().flatMap(new serializeIterableToBundle(this));
        }

        public final closePinLocation$MediaBrowserCompat$ItemReceiver IconCompatParcelizer() {
            return this.write.write;
        }

        public final DebitCardResetOtpActivity<StreetViewPanorama.OnStreetViewPanoramaChangeListener> MediaBrowserCompat$CustomActionResultReceiver(String str) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getReceivedGifting(str).flatMap(new deserializeIterableFromBundle(this));
        }

        public final DebitCardResetOtpActivity<StreetViewPanorama.OnStreetViewPanoramaChangeListener> write(String str, String str2) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getSentGifting(str).flatMap(new deserializeFromIntentExtra(this, str2));
        }

        public final void read() {
            this.write.write = null;
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.Segment.C32981 r2) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.putOpenGift(r2).flatMap(serializeIterableToIntentExtra.write);
        }

        public final DebitCardResetOtpActivity<setStreetNamesEnabled> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.Segment.EvictionQueue evictionQueue) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.reviewPresent(evictionQueue).map(new deserializeFromString(this));
        }

        public final void MediaBrowserCompat$ItemReceiver(closePinLocation$MediaBrowserCompat$ItemReceiver closepinlocation_mediabrowsercompat_itemreceiver) {
            this.write.write = closepinlocation_mediabrowsercompat_itemreceiver;
        }

        public final DebitCardResetOtpActivity<setPanningGesturesEnabled> IconCompatParcelizer(tryExpireEntries tryexpireentries) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.verifyMoneyGift(tryexpireentries).map(new IAccountAccessor.Stub(this.read));
        }

        public final DebitCardResetOtpActivity<setOnStreetViewPanoramaLongClickListener> read(unsetLiveEntry unsetliveentry) {
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.validatePresent(unsetliveentry).map(new writeDoubleList(this.read));
        }
    }

    public final boolean read() {
        return super.read() && this.MediaBrowserCompat$CustomActionResultReceiver.get() != null;
    }

    public final void run() {
        ImageView imageView;
        if ((super.read() && this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) && (imageView = this.MediaBrowserCompat$CustomActionResultReceiver.get()) != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = IconCompatParcelizer();
                imageView.setLayoutParams(layoutParams2);
                imageView.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{0.3f, 1.0f, 0.3f});
                onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "animator");
                ofFloat.setDuration(1500);
                ofFloat.setRepeatCount(-1);
                ofFloat.start();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}
