package p040o;

import p040o.PreLoadCheckActivity;

/* renamed from: o.PreLoadCheckActivity$write$2$1$MediaBrowserCompat$CustomActionResultReceiver */
final class C6991xa5a3f11 implements FragmentBuilder_BindJuristicRequestFormFragment {
    private /* synthetic */ PreLoadCheckActivity.write.C69892.C69901 IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindLoanDetailFragment MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FragmentBuilder_BindJuristicRequestFormFragment read;

    C6991xa5a3f11(FragmentBuilder_BindLoanDetailFragment fragmentBuilder_BindLoanDetailFragment, FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, PreLoadCheckActivity.write.C69892.C69901 r3) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindLoanDetailFragment;
        this.read = fragmentBuilder_BindJuristicRequestFormFragment;
        this.IconCompatParcelizer = r3;
    }

    public final Object MediaBrowserCompat$ItemReceiver(Object obj) {
        onGetStartedClick.write(obj, "action");
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, this.read, obj);
    }
}
