package p040o;

import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.HomeActivity */
public final class HomeActivity {

    /* renamed from: o.HomeActivity$write */
    public static final class write<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<S> {
        private /* synthetic */ FragmentBuilder_BindJuristicResetPinLandingFragment[] IconCompatParcelizer;

        public write(FragmentBuilder_BindJuristicResetPinLandingFragment[] fragmentBuilder_BindJuristicResetPinLandingFragmentArr) {
            this.IconCompatParcelizer = fragmentBuilder_BindJuristicResetPinLandingFragmentArr;
        }

        public final S read(S s, Object obj) {
            onGetStartedClick.write((Object) s, "currentState");
            onGetStartedClick.write(obj, "action");
            for (FragmentBuilder_BindJuristicResetPinLandingFragment read : this.IconCompatParcelizer) {
                s = read.read(s, obj);
                onGetStartedClick.IconCompatParcelizer((Object) s, "reducer.reduce(state, action)");
            }
            return s;
        }
    }

    public static final <S> FragmentBuilder_BindJuristicOnboardingLandingFragment.read write(FragmentBuilder_BindJuristicOnboardingLandingFragment<S> fragmentBuilder_BindJuristicOnboardingLandingFragment, C6560xb325287a<S> fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "$this$subscribeAndInvoke");
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver, "subscriber");
        fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver.onStateChange(fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver());
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read = fragmentBuilder_BindJuristicOnboardingLandingFragment.read(fragmentBuilder_BindJuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) read, "subscribe(subscriber)");
        return read;
    }
}
