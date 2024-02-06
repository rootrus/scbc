package p040o;

import com.thunderhead.android.domain.state.IllegalReducerDispatchException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.onPageClick */
public final class onPageClick {

    /* renamed from: o.onPageClick$read */
    static final class read<S> implements FragmentBuilder_BindLinkAccountFragment<S> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ FragmentBuilder_BindJuristicOnboardingLandingFragment IconCompatParcelizer(FragmentBuilder_BindJuristicResetPinLandingFragment fragmentBuilder_BindJuristicResetPinLandingFragment, Object obj) {
            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicResetPinLandingFragment, "nextReducer");
            onGetStartedClick.write(obj, "newState");
            return new FragmentBuilder_BindJuristicOnboardingLandingFragment<S>(fragmentBuilder_BindJuristicResetPinLandingFragment, obj) {
                private FragmentBuilder_BindJuristicResetPinLandingFragment<S> IconCompatParcelizer;
                private boolean MediaBrowserCompat$CustomActionResultReceiver;
                private S MediaBrowserCompat$ItemReceiver;
                /* access modifiers changed from: private */
                public List<? extends C6560xb325287a<S>> write = HmlNationalIdActivity.IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                    this.MediaBrowserCompat$ItemReceiver = r2;
                }

                public final S MediaBrowserCompat$ItemReceiver() {
                    return this.MediaBrowserCompat$ItemReceiver;
                }

                public final Object MediaBrowserCompat$ItemReceiver(Object obj) {
                    onGetStartedClick.write(obj, "action");
                    if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                        List<C6560xb325287a> MediaBrowserCompat$CustomActionResultReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write);
                        try {
                            this.MediaBrowserCompat$CustomActionResultReceiver = true;
                            S read = this.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver, obj);
                            onGetStartedClick.IconCompatParcelizer((Object) read, "storeReducer.reduce(state, action)");
                            this.MediaBrowserCompat$ItemReceiver = read;
                        } catch (Exception e) {
                            MyECouponActivity_ViewBinding.read(e, closeMoneyOutTutorial.DISPATCH_ERROR);
                        } catch (Throwable th) {
                            this.MediaBrowserCompat$CustomActionResultReceiver = false;
                            throw th;
                        }
                        this.MediaBrowserCompat$CustomActionResultReceiver = false;
                        for (C6560xb325287a onStateChange : MediaBrowserCompat$CustomActionResultReceiver2) {
                            onStateChange.onStateChange(this.MediaBrowserCompat$ItemReceiver);
                        }
                        return obj;
                    }
                    throw new IllegalReducerDispatchException();
                }

                public final FragmentBuilder_BindJuristicOnboardingLandingFragment.read read(C6560xb325287a<S> fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver) {
                    onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver, "subscriber");
                    this.write = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(this.write, fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver);
                    return new IconCompatParcelizer(this, fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver);
                }

                /* renamed from: o.onPageClick$read$1$IconCompatParcelizer */
                static final class IconCompatParcelizer implements FragmentBuilder_BindJuristicOnboardingLandingFragment.read {
                    private /* synthetic */ C6560xb325287a MediaBrowserCompat$CustomActionResultReceiver;
                    private /* synthetic */ C73261 write;

                    IconCompatParcelizer(C73261 r1, C6560xb325287a fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver) {
                        this.write = r1;
                        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver;
                    }

                    public final void read() {
                        C73261 r0 = this.write;
                        Iterable write2 = r0.write;
                        C6560xb325287a fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.write((Object) write2, "$this$minus");
                        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
                        ArrayList arrayList = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
                        boolean z = false;
                        for (Object next : write2) {
                            boolean z2 = true;
                            if (!z && onGetStartedClick.MediaBrowserCompat$ItemReceiver(next, (Object) fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver)) {
                                z = true;
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(next);
                            }
                        }
                        r0.write = arrayList;
                    }
                }
            };
        }
    }
}
