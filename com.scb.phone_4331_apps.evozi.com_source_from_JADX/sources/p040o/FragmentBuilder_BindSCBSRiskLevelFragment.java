package p040o;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.deeplink.C5586x287d9eb4;
import p040o.IFragmentWrapper;
import p040o.IObjectWrapper;
import p040o.ImmutableSortedMap;
import p040o.LocationSource;

/* renamed from: o.FragmentBuilder_BindSCBSRiskLevelFragment */
public final class FragmentBuilder_BindSCBSRiskLevelFragment implements ViewTreeObserver.OnGlobalLayoutListener {
    private final View IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final C6751x58dc786f MediaBrowserCompat$ItemReceiver;
    private final Rect read = new Rect();

    public FragmentBuilder_BindSCBSRiskLevelFragment(View view, C6751x58dc786f fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) view, "activityRootView");
        this.IconCompatParcelizer = view;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindSCBSRiskLevelFragment$read */
    public static final class read implements C6372x3d677cbb {
        public final zaat IconCompatParcelizer;
        public final onConnectionFailed MediaBrowserCompat$CustomActionResultReceiver;
        public final zabk MediaBrowserCompat$ItemReceiver;
        private final FragmentBuilder_BindSSFTabFragment MediaBrowserCompat$SearchResultReceiver;
        private final FragmentBuilder_BindSCBSproductDetailFragment MediaDescriptionCompat;
        private final FragmentBuilder_BindScbsMaritalStatusFragment MediaMetadataCompat;
        private final C5586x287d9eb4 RatingCompat;
        public final zam read;
        public final zabg write;

        private read() {
        }

        @HmlPinActivity
        public read(C5586x287d9eb4 openAccountEtbNoActiveCasaDeepLinkActivity$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindScbsMaritalStatusFragment fragmentBuilder_BindScbsMaritalStatusFragment, FragmentBuilder_BindSSFTabFragment fragmentBuilder_BindSSFTabFragment, FragmentBuilder_BindSCBSproductDetailFragment fragmentBuilder_BindSCBSproductDetailFragment, zaat zaat, zabg zabg, onConnectionFailed onconnectionfailed, zam zam, zabl zabl, zabk zabk) {
            this.RatingCompat = openAccountEtbNoActiveCasaDeepLinkActivity$MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = zaat;
            this.write = zabg;
            this.MediaBrowserCompat$CustomActionResultReceiver = onconnectionfailed;
            this.read = zam;
            this.MediaMetadataCompat = fragmentBuilder_BindScbsMaritalStatusFragment;
            this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindSSFTabFragment;
            this.MediaDescriptionCompat = fragmentBuilder_BindSCBSproductDetailFragment;
            this.MediaBrowserCompat$ItemReceiver = zabk;
        }

        public final void IconCompatParcelizer() {
            this.MediaMetadataCompat.read = null;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.MediaDescriptionCompat.write = null;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            FragmentBuilder_BindSSFTabFragment fragmentBuilder_BindSSFTabFragment = this.MediaBrowserCompat$SearchResultReceiver;
            fragmentBuilder_BindSSFTabFragment.MediaBrowserCompat$ItemReceiver = null;
            fragmentBuilder_BindSSFTabFragment.write = null;
        }

        public final DebitCardResetOtpActivity<useViewLifecycleInFragment> MediaBrowserCompat$ItemReceiver(unsafeComparator unsafecomparator) {
            return this.RatingCompat.read.confirmPayer(unsafecomparator).flatMap(new LifecycleDelegate(this));
        }

        public final DebitCardResetOtpActivity<zoomGesturesEnabled> MediaBrowserCompat$CustomActionResultReceiver(sortEntries sortentries) {
            return this.RatingCompat.read.confirmRequester(sortentries).map(zzfy.IconCompatParcelizer);
        }

        public final DebitCardResetOtpActivity<LocationSource.OnLocationChangedListener> write() {
            SingleDataEntity<setDrawWeb> singleDataEntity = this.MediaMetadataCompat.read;
            if (singleDataEntity == null) {
                return this.RatingCompat.read.getLanding().doOnNext(new PendingResultUtil(this.MediaMetadataCompat)).flatMap(new IFragmentWrapper.Stub.zza(this));
            }
            return DebitCardResetOtpActivity.just(zabl.read(singleDataEntity));
        }

        public final MapView MediaDescriptionCompat() {
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver);
        }

        public final ImmutableSortedMap.C35092 MediaBrowserCompat$SearchResultReceiver() {
            return this.MediaBrowserCompat$SearchResultReceiver.write;
        }

        public final DebitCardResetOtpActivity<deactivate> write(ImmutableSortedMap.SerializedForm serializedForm) {
            return this.RatingCompat.read.newIncomingSummary(serializedForm).flatMap(new IObjectWrapper.Stub(this));
        }

        public final void read() {
            this.MediaMetadataCompat.read = null;
            FragmentBuilder_BindSSFTabFragment fragmentBuilder_BindSSFTabFragment = this.MediaBrowserCompat$SearchResultReceiver;
            fragmentBuilder_BindSSFTabFragment.MediaBrowserCompat$ItemReceiver = null;
            fragmentBuilder_BindSSFTabFragment.write = null;
            this.MediaDescriptionCompat.write = null;
        }

        public final DebitCardResetOtpActivity<onExitAmbient> MediaBrowserCompat$ItemReceiver(ImmutableSortedMap.SerializedForm serializedForm) {
            return this.RatingCompat.read.newOutgoingSummary(serializedForm).flatMap(new unwrap(this));
        }

        public final DebitCardResetOtpActivity<onEnterAmbient> read(ImmutableSortedMap.C35104 r3) {
            SingleDataEntity<CctBackendFactory> singleDataEntity = this.MediaDescriptionCompat.write;
            if (singleDataEntity == null) {
                return this.RatingCompat.read.reviewPayer(r3).doOnNext(new zzff(this.MediaDescriptionCompat)).flatMap(new onDelegateCreated(this));
            }
            return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(singleDataEntity));
        }

        public final DebitCardResetOtpActivity<MapView> MediaBrowserCompat$CustomActionResultReceiver(ImmutableSortedMap.C35092 r3) {
            SingleDataEntity<EventStoreModule> singleDataEntity = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$SearchResultReceiver.write = r3;
            if (singleDataEntity == null) {
                return this.RatingCompat.read.reviewRequester(r3).doOnNext(new zzfp(this.MediaBrowserCompat$SearchResultReceiver)).flatMap(new IObjectWrapper.Stub.zza(this));
            }
            return DebitCardResetOtpActivity.just(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(singleDataEntity));
        }
    }

    public final void onGlobalLayout() {
        Resources resources = this.IconCompatParcelizer.getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "activityRootView.resources");
        boolean z = true;
        int applyDimension = (int) TypedValue.applyDimension(1, 148.0f, resources.getDisplayMetrics());
        this.IconCompatParcelizer.getWindowVisibleDisplayFrame(this.read);
        View rootView = this.IconCompatParcelizer.getRootView();
        onGetStartedClick.IconCompatParcelizer((Object) rootView, "activityRootView.rootView");
        int height = rootView.getHeight() - (this.read.bottom - this.read.top);
        if (height < applyDimension) {
            z = false;
        }
        if (z != this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            if (z) {
                C6751x58dc786f fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
                if (fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver != null) {
                    fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(height);
                    return;
                }
                return;
            }
            C6751x58dc786f fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver;
            if (fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver2 != null) {
                fragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer();
            }
        }
    }
}
