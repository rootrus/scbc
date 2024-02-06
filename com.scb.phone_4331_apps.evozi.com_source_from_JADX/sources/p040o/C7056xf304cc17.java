package p040o;

import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaSessionCompat$QueueItem */
enum C7056xf304cc17 implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        return true;
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setCaseSensitive(true);
        } else if (ordinal == 1) {
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setCaseSensitive(false);
        } else if (ordinal == 2) {
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setStrict(true);
        } else if (ordinal == 3) {
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setStrict(false);
        }
        return i;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
