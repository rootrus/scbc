package p040o;

/* renamed from: o.FragmentBuilder_BindReceiveFragment$MediaSessionCompat$QueueItem */
final class FragmentBuilder_BindReceiveFragment$MediaSessionCompat$QueueItem extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindRegalQuestionnaireFragment, Boolean> {
    public static final FragmentBuilder_BindReceiveFragment$MediaSessionCompat$QueueItem read = new FragmentBuilder_BindReceiveFragment$MediaSessionCompat$QueueItem();

    FragmentBuilder_BindReceiveFragment$MediaSessionCompat$QueueItem() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        FragmentBuilder_BindRegalQuestionnaireFragment fragmentBuilder_BindRegalQuestionnaireFragment = (FragmentBuilder_BindRegalQuestionnaireFragment) obj;
        if (fragmentBuilder_BindRegalQuestionnaireFragment != null) {
            z = fragmentBuilder_BindRegalQuestionnaireFragment.write;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
