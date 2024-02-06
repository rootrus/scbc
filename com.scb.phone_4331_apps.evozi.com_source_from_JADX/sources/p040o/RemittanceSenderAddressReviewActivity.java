package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: o.RemittanceSenderAddressReviewActivity */
public final class RemittanceSenderAddressReviewActivity {
    private static final BitSet IconCompatParcelizer = new BitSet(256);
    private static final BitSet MediaBrowserCompat$CustomActionResultReceiver = new BitSet(256);
    private static final BitSet MediaBrowserCompat$ItemReceiver;
    private static final BitSet MediaBrowserCompat$MediaItem = new BitSet(256);
    private static final BitSet MediaBrowserCompat$SearchResultReceiver = new BitSet(256);
    private static final BitSet MediaMetadataCompat = new BitSet(256);
    private static final BitSet RatingCompat = new BitSet(256);
    private static final BitSet read = new BitSet(256);
    private static final BitSet write = new BitSet(256);

    static {
        BitSet bitSet = new BitSet(256);
        MediaBrowserCompat$ItemReceiver = bitSet;
        bitSet.set(47);
        for (int i = 97; i <= 122; i++) {
            MediaMetadataCompat.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            MediaMetadataCompat.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            MediaMetadataCompat.set(i3);
        }
        MediaMetadataCompat.set(95);
        MediaMetadataCompat.set(45);
        MediaMetadataCompat.set(46);
        MediaMetadataCompat.set(42);
        MediaBrowserCompat$MediaItem.or(MediaMetadataCompat);
        MediaMetadataCompat.set(33);
        MediaMetadataCompat.set(126);
        MediaMetadataCompat.set(39);
        MediaMetadataCompat.set(40);
        MediaMetadataCompat.set(41);
        write.set(44);
        write.set(59);
        write.set(58);
        write.set(36);
        write.set(38);
        write.set(43);
        write.set(61);
        RatingCompat.or(MediaMetadataCompat);
        RatingCompat.or(write);
        MediaBrowserCompat$CustomActionResultReceiver.or(MediaMetadataCompat);
        MediaBrowserCompat$CustomActionResultReceiver.set(59);
        MediaBrowserCompat$CustomActionResultReceiver.set(58);
        MediaBrowserCompat$CustomActionResultReceiver.set(64);
        MediaBrowserCompat$CustomActionResultReceiver.set(38);
        MediaBrowserCompat$CustomActionResultReceiver.set(61);
        MediaBrowserCompat$CustomActionResultReceiver.set(43);
        MediaBrowserCompat$CustomActionResultReceiver.set(36);
        MediaBrowserCompat$CustomActionResultReceiver.set(44);
        IconCompatParcelizer.or(MediaBrowserCompat$CustomActionResultReceiver);
        IconCompatParcelizer.set(47);
        read.set(59);
        read.set(47);
        read.set(63);
        read.set(58);
        read.set(64);
        read.set(38);
        read.set(61);
        read.set(43);
        read.set(36);
        read.set(44);
        read.set(91);
        read.set(93);
        MediaBrowserCompat$SearchResultReceiver.or(read);
        MediaBrowserCompat$SearchResultReceiver.or(MediaMetadataCompat);
    }

    /* JADX INFO: finally extract failed */
    public static List<AddAccountsActivity> read(PrepaidResetOtpActivity prepaidResetOtpActivity) throws IOException {
        Charset charset;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetOtpActivity, "HTTP entity");
        FavouriteSelectedActivity write2 = FavouriteSelectedActivity.write(prepaidResetOtpActivity);
        if (write2 == null || !write2.MediaBrowserCompat$ItemReceiver.equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return new ArrayList(0);
        }
        long MediaBrowserCompat$CustomActionResultReceiver2 = prepaidResetOtpActivity.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 <= 2147483647L) {
            if (write2.read != null) {
                charset = write2.read;
            } else {
                charset = CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            }
            InputStream write3 = prepaidResetOtpActivity.write();
            if (write3 == null) {
                return new ArrayList(0);
            }
            try {
                DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(MediaBrowserCompat$CustomActionResultReceiver2 > 0 ? (int) MediaBrowserCompat$CustomActionResultReceiver2 : 1024);
                InputStreamReader inputStreamReader = new InputStreamReader(write3, charset);
                char[] cArr = new char[1024];
                while (true) {
                    int read2 = inputStreamReader.read(cArr);
                    if (read2 == -1) {
                        break;
                    }
                    depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(cArr, 0, read2);
                }
                write3.close();
                if (depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer == 0) {
                    return new ArrayList(0);
                }
                return IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, charset, '&');
            } catch (Throwable th) {
                write3.close();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("HTTP entity is too large");
        }
    }

    private static List<AddAccountsActivity> IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, Charset charset, char... cArr) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        AmountDetailsSuccessAdapter$DetailViewHolder amountDetailsSuccessAdapter$DetailViewHolder = AmountDetailsSuccessAdapter$DetailViewHolder.read;
        BitSet bitSet = new BitSet();
        for (char c : cArr) {
            bitSet.set(c);
        }
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
                return arrayList;
            }
            bitSet.set(61);
            String write2 = AmountDetailsSuccessAdapter$DetailViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, bitSet);
            String str = null;
            if (!(radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read)) {
                char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write);
                radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
                if (charAt == '=') {
                    bitSet.clear(61);
                    str = AmountDetailsSuccessAdapter$DetailViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, bitSet);
                    if (!(radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read)) {
                        radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
                    }
                }
            }
            if (!write2.isEmpty()) {
                arrayList.add(new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(MediaBrowserCompat$CustomActionResultReceiver(write2, charset), MediaBrowserCompat$CustomActionResultReceiver(str, charset)));
            }
        }
    }

    private static List<String> MediaBrowserCompat$ItemReceiver(CharSequence charSequence, BitSet bitSet) {
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, charSequence.length());
        if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
            return Collections.emptyList();
        }
        if (bitSet.get(charSequence.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write))) {
            radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
                arrayList.add(sb.toString());
                return arrayList;
            }
            char charAt = charSequence.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write);
            if (bitSet.get(charAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
            radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        }
    }

    static List<String> write(CharSequence charSequence) {
        return MediaBrowserCompat$ItemReceiver(charSequence, MediaBrowserCompat$ItemReceiver);
    }

    public static List<String> IconCompatParcelizer(CharSequence charSequence, Charset charset) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(charSequence, "Char sequence");
        List<String> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(charSequence, MediaBrowserCompat$ItemReceiver);
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.size(); i++) {
            MediaBrowserCompat$ItemReceiver2.set(i, read(MediaBrowserCompat$ItemReceiver2.get(i), charset != null ? charset : PrepaidRequestProductCatalogActivity.write, false));
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    public static String IconCompatParcelizer(Iterable<String> iterable, Charset charset) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(iterable, "Segments");
        StringBuilder sb = new StringBuilder();
        for (String read2 : iterable) {
            sb.append('/');
            sb.append(read(read2, charset, MediaBrowserCompat$CustomActionResultReceiver, false));
        }
        return sb.toString();
    }

    private static String read(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            byte b = encode.get() & 255;
            if (bitSet.get(b)) {
                sb.append((char) b);
            } else if (!z || b != 32) {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((b >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            } else {
                sb.append('+');
            }
        }
        return sb.toString();
    }

    private static String read(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c = wrap.get();
            if (c == '%' && wrap.remaining() >= 2) {
                char c2 = wrap.get();
                char c3 = wrap.get();
                int digit = Character.digit(c2, 16);
                int digit2 = Character.digit(c3, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c2);
                    allocate.put((byte) c3);
                } else {
                    allocate.put((byte) ((digit << 4) + digit2));
                }
            } else if (!z || c != '+') {
                allocate.put((byte) c);
            } else {
                allocate.put((byte) 32);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = PrepaidRequestProductCatalogActivity.write;
        }
        return read(str, charset, true);
    }

    private static String write(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = PrepaidRequestProductCatalogActivity.write;
        }
        return read(str, charset, MediaBrowserCompat$MediaItem, true);
    }

    static String IconCompatParcelizer(String str, Charset charset) {
        return read(str, charset, RatingCompat, false);
    }

    static String read(String str, Charset charset) {
        return read(str, charset, MediaBrowserCompat$SearchResultReceiver, false);
    }

    public static String MediaBrowserCompat$ItemReceiver(Iterable<? extends AddAccountsActivity> iterable, Charset charset) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (AddAccountsActivity addAccountsActivity : iterable) {
            String write2 = write(addAccountsActivity.IconCompatParcelizer(), charset);
            String write3 = write(addAccountsActivity.MediaBrowserCompat$ItemReceiver(), charset);
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(write2);
            if (write3 != null) {
                sb.append("=");
                sb.append(write3);
            }
        }
        return sb.toString();
    }

    public static List<AddAccountsActivity> MediaBrowserCompat$ItemReceiver(String str, Charset charset) {
        if (str == null) {
            return new ArrayList(0);
        }
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(str.length());
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str);
        return IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, charset, '&', ';');
    }
}
