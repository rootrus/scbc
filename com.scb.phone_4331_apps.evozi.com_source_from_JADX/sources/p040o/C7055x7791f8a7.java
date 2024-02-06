package p040o;

import org.threeten.p041bp.DateTimeException;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C7055x7791f8a7 implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final char padChar;
    private final int padWidth;
    private final SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer printerParser;

    C7055x7791f8a7(SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer iconCompatParcelizer, int i, char c) {
        this.printerParser = iconCompatParcelizer;
        this.padWidth = i;
        this.padChar = c;
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        int length = sb.length();
        if (!this.printerParser.print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        if (length2 <= this.padWidth) {
            for (int i = 0; i < this.padWidth - length2; i++) {
                sb.insert(length, this.padChar);
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot print as output of ");
        sb2.append(length2);
        sb2.append(" characters exceeds pad width of ");
        sb2.append(this.padWidth);
        throw new DateTimeException(sb2.toString());
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        boolean isStrict = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict();
        boolean isCaseSensitive = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isCaseSensitive();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        } else if (i == charSequence.length()) {
            return ~i;
        } else {
            int i2 = this.padWidth + i;
            if (i2 > charSequence.length()) {
                if (isStrict) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2) {
                if (!isCaseSensitive) {
                    if (!giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charSequence.charAt(i3), this.padChar)) {
                        break;
                    }
                } else if (charSequence.charAt(i3) != this.padChar) {
                    break;
                }
                i3++;
            }
            int parse = this.printerParser.parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence.subSequence(0, i2), i3);
            return (parse == i2 || !isStrict) ? parse : ~(i + i3);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Pad(");
        sb.append(this.printerParser);
        sb.append(",");
        sb.append(this.padWidth);
        if (this.padChar == ' ') {
            str = ")";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(",'");
            sb2.append(this.padChar);
            sb2.append("')");
            str = sb2.toString();
        }
        sb.append(str);
        return sb.toString();
    }
}
