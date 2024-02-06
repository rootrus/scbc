package p040o;

import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.PreLoadCheckActivity */
public final class PreLoadCheckActivity {

    /* renamed from: o.PreLoadCheckActivity$write */
    public static final class write<S> implements FragmentBuilder_BindLoanRequestorFragment<S> {
        final /* synthetic */ FragmentBuilder_BindLoanDetailFragment[] MediaBrowserCompat$CustomActionResultReceiver;

        public write(FragmentBuilder_BindLoanDetailFragment[] fragmentBuilder_BindLoanDetailFragmentArr) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindLoanDetailFragmentArr;
        }

        public final FragmentBuilder_BindLinkAccountFragment<S> MediaBrowserCompat$CustomActionResultReceiver(final FragmentBuilder_BindLinkAccountFragment<S> fragmentBuilder_BindLinkAccountFragment) {
            onGetStartedClick.write((Object) fragmentBuilder_BindLinkAccountFragment, "next");
            return new FragmentBuilder_BindLinkAccountFragment<S>(this) {
                final /* synthetic */ write MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ FragmentBuilder_BindJuristicOnboardingLandingFragment IconCompatParcelizer(FragmentBuilder_BindJuristicResetPinLandingFragment fragmentBuilder_BindJuristicResetPinLandingFragment, Object obj) {
                    onGetStartedClick.write((Object) fragmentBuilder_BindJuristicResetPinLandingFragment, "reducer");
                    onGetStartedClick.write(obj, "initialState");
                    return new FragmentBuilder_BindJuristicOnboardingLandingFragment<S>(this, fragmentBuilder_BindJuristicResetPinLandingFragment, obj) {
                        private final FragmentBuilder_BindJuristicRequestFormFragment IconCompatParcelizer;
                        private final FragmentBuilder_BindJuristicOnboardingLandingFragment<S> MediaBrowserCompat$ItemReceiver;
                        private /* synthetic */ C69892 write;

                        {
                            this.write = r3;
                            FragmentBuilder_BindJuristicOnboardingLandingFragment<S> IconCompatParcelizer2 = fragmentBuilder_BindLinkAccountFragment.IconCompatParcelizer(r4, r5);
                            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "next.create(reducer, initialState)");
                            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
                            FragmentBuilder_BindLoanDetailFragment[] fragmentBuilder_BindLoanDetailFragmentArr = this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                            FragmentBuilder_BindJuristicOnboardingLandingFragment<S> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
                            if (fragmentBuilder_BindJuristicOnboardingLandingFragment != null) {
                                FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment = fragmentBuilder_BindJuristicOnboardingLandingFragment;
                                onGetStartedClick.write((Object) fragmentBuilder_BindLoanDetailFragmentArr, "$this$lastIndex");
                                for (int length = fragmentBuilder_BindLoanDetailFragmentArr.length - 1; length >= 0; length--) {
                                    fragmentBuilder_BindJuristicRequestFormFragment = new C6991xa5a3f11(fragmentBuilder_BindLoanDetailFragmentArr[length], fragmentBuilder_BindJuristicRequestFormFragment, this);
                                }
                                this.IconCompatParcelizer = fragmentBuilder_BindJuristicRequestFormFragment;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.thunderhead.android.domain.state.Dispatcher");
                        }

                        public final S MediaBrowserCompat$ItemReceiver() {
                            S MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "store.state");
                            return MediaBrowserCompat$ItemReceiver2;
                        }

                        public final Object MediaBrowserCompat$ItemReceiver(Object obj) {
                            onGetStartedClick.write(obj, "action");
                            Object MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(obj);
                            onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, "rootDispatcher.dispatch(action)");
                            return MediaBrowserCompat$ItemReceiver2;
                        }

                        public final FragmentBuilder_BindJuristicOnboardingLandingFragment.read read(C6560xb325287a<S> fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver) {
                            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver, "subscriber");
                            FragmentBuilder_BindJuristicOnboardingLandingFragment.read read = this.MediaBrowserCompat$ItemReceiver.read(fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver);
                            onGetStartedClick.IconCompatParcelizer((Object) read, "store.subscribe(subscriber)");
                            return read;
                        }
                    };
                }
            };
        }
    }
}
