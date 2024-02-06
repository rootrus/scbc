package p040o;

import java.util.LinkedList;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindSuitabilityQuestionsPart1Fragment */
public final class FragmentBuilder_BindSuitabilityQuestionsPart1Fragment implements onImageClicked {
    private static final Object MediaBrowserCompat$CustomActionResultReceiver = new Object();
    private static final List<FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Boolean>> write = new LinkedList();
    private final EditRecipientActivity read;

    public FragmentBuilder_BindSuitabilityQuestionsPart1Fragment(EditRecipientActivity editRecipientActivity) {
        this.read = editRecipientActivity;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        boolean read2;
        synchronized (MediaBrowserCompat$CustomActionResultReceiver) {
            read2 = this.read.read("KEY_OPT_OUT");
        }
        return read2;
    }

    public final void write(boolean z) {
        synchronized (MediaBrowserCompat$CustomActionResultReceiver) {
            this.read.read("KEY_OPT_OUT", z);
            for (FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Boolean> MediaBrowserCompat$CustomActionResultReceiver2 : write) {
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(Boolean.valueOf(z));
            }
        }
    }
}
