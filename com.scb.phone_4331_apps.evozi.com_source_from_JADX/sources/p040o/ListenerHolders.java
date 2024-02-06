package p040o;

import p040o.ListenerHolder;

/* renamed from: o.ListenerHolders */
public final class ListenerHolders implements OPRStatusRewardsLandingActivity_ViewBinding<ListenerHolder.Notifier> {
    private static final ListenerHolders read = new ListenerHolders();

    public static ListenerHolders write() {
        return read;
    }

    public final /* synthetic */ Object get() {
        return new ListenerHolder.Notifier();
    }
}
