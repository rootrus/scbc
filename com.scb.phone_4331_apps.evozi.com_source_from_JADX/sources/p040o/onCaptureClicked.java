package p040o;

/* renamed from: o.onCaptureClicked */
public final class onCaptureClicked {

    /* renamed from: o.onCaptureClicked$IconCompatParcelizer */
    public static final class IconCompatParcelizer<S> implements FragmentBuilder_BindLoanDetailFragment<T> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final Object MediaBrowserCompat$CustomActionResultReceiver(final FragmentBuilder_BindJuristicOnboardingLandingFragment<T> fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, Object obj) {
            Object write;
            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
            onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
            onGetStartedClick.write(obj, "action");
            try {
                onSeeInstructionsClicked onseeinstructionsclicked = (onSeeInstructionsClicked) (!(obj instanceof onSeeInstructionsClicked) ? null : obj);
                if (onseeinstructionsclicked == null || (write = onseeinstructionsclicked.write(fragmentBuilder_BindJuristicRequestFormFragment, new FundActionsSuccessActivity<T>() {
                    public final T invoke() {
                        return fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver();
                    }
                })) == null) {
                    return fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(obj);
                }
                return write;
            } catch (ClassCastException e) {
                MyECouponActivity_ViewBinding.read(e, onCoachMarkClicked.CLASS_CAST_EXCEPTION);
                return fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(obj);
            } catch (Exception e2) {
                MyECouponActivity_ViewBinding.read(e2, onCoachMarkClicked.THUNK_MIDDLEWARE_ERROR);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
    }
}
