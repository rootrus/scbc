package p040o;

/* renamed from: o.FragmentBuilder_BindOnboardingAdressInformationFragment$MediaBrowserCompat$ItemReceiver */
final class C6612xfc31d2b6 {
    private C6612xfc31d2b6() {
    }

    public /* synthetic */ C6612xfc31d2b6(byte b) {
        this();
    }

    static String MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment == null || fragmentBuilder_BindHmlOperatingBankFragment == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("remember_me-");
        sb.append(fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read);
        sb.append('-');
        sb.append(fragmentBuilder_BindHmlOperatingBankFragment.write);
        return sb.toString();
    }
}
