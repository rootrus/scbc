package p040o;

import java.util.List;

/* renamed from: o.DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding */
public final class DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding {
    public final List<String> MediaBrowserCompat$ItemReceiver;

    public DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding() {
    }

    public static boolean MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding(List<String> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
