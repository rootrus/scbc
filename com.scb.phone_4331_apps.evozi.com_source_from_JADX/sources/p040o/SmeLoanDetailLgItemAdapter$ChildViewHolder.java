package p040o;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.spongycastle.jce.provider.PKIXNameConstraintValidatorException;

/* renamed from: o.SmeLoanDetailLgItemAdapter$ChildViewHolder */
public final class SmeLoanDetailLgItemAdapter$ChildViewHolder {
    Set IconCompatParcelizer;
    Set MediaBrowserCompat$CustomActionResultReceiver;
    Set MediaBrowserCompat$ItemReceiver = new HashSet();
    private Set MediaBrowserCompat$MediaItem = new HashSet();
    private Set MediaBrowserCompat$SearchResultReceiver = new HashSet();
    Set MediaDescriptionCompat;
    private Set MediaMetadataCompat = new HashSet();
    private Set RatingCompat = new HashSet();
    Set read;
    Set write;

    private static boolean write(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.MediaBrowserCompat$ItemReceiver() <= 0 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.MediaBrowserCompat$ItemReceiver() > hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver()) {
            return false;
        }
        for (int MediaBrowserCompat$ItemReceiver2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.MediaBrowserCompat$ItemReceiver() - 1; MediaBrowserCompat$ItemReceiver2 >= 0; MediaBrowserCompat$ItemReceiver2--) {
            if (!hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.read(MediaBrowserCompat$ItemReceiver2).equals(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(MediaBrowserCompat$ItemReceiver2))) {
                return false;
            }
        }
        return true;
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(Set set, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) throws PKIXNameConstraintValidatorException {
        if (set != null) {
            if (!set.isEmpty() || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() != 0) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder, (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) it.next())) {
                        return;
                    }
                }
                throw new PKIXNameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
            }
        }
    }

    static void read(Set set, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) throws PKIXNameConstraintValidatorException {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder, (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) it.next())) {
                    throw new PKIXNameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    static Set write(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(((AccountDetailsAdapter$ItemViewHolder_ViewBinding) it.next()).write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) it2.next();
                    if (write(MediaBrowserCompat$CustomActionResultReceiver2, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
                        hashSet.add(MediaBrowserCompat$CustomActionResultReceiver2);
                    } else if (write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder, MediaBrowserCompat$CustomActionResultReceiver2)) {
                        hashSet.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
                    }
                }
            } else if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                hashSet.add(MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        return hashSet;
    }

    private static Set MediaBrowserCompat$ItemReceiver(Set set, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2 = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) it.next();
                if (write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2)) {
                    hashSet.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2);
                } else if (write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
                    hashSet.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
                } else {
                    hashSet.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2);
                    hashSet.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
                }
            }
            return hashSet;
        } else if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder == null) {
            return set;
        } else {
            set.add(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
            return set;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set IconCompatParcelizer(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String MediaMetadataCompat2 = InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) ((AccountDetailsAdapter$ItemViewHolder_ViewBinding) it.next()).write.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (MediaMetadataCompat2.indexOf(64) != -1) {
                        String substring = MediaMetadataCompat2.substring(MediaMetadataCompat2.indexOf(64) + 1);
                        if (str.indexOf(64) != -1) {
                            if (MediaMetadataCompat2.equalsIgnoreCase(str)) {
                                hashSet.add(MediaMetadataCompat2);
                            }
                        } else if (str.startsWith(".")) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(substring, str)) {
                                hashSet.add(MediaMetadataCompat2);
                            }
                        } else if (substring.equalsIgnoreCase(str)) {
                            hashSet.add(MediaMetadataCompat2);
                        }
                    } else if (MediaMetadataCompat2.startsWith(".")) {
                        if (str.indexOf(64) != -1) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(str.substring(MediaMetadataCompat2.indexOf(64) + 1), MediaMetadataCompat2)) {
                                hashSet.add(str);
                            }
                        } else if (str.startsWith(".")) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2, str) || MediaMetadataCompat2.equalsIgnoreCase(str)) {
                                hashSet.add(MediaMetadataCompat2);
                            } else if (MediaBrowserCompat$CustomActionResultReceiver(str, MediaMetadataCompat2)) {
                                hashSet.add(str);
                            }
                        } else if (MediaBrowserCompat$CustomActionResultReceiver(str, MediaMetadataCompat2)) {
                            hashSet.add(str);
                        }
                    } else if (str.indexOf(64) != -1) {
                        if (str.substring(str.indexOf(64) + 1).equalsIgnoreCase(MediaMetadataCompat2)) {
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2, str)) {
                            hashSet.add(MediaMetadataCompat2);
                        }
                    } else if (MediaMetadataCompat2.equalsIgnoreCase(str)) {
                        hashSet.add(MediaMetadataCompat2);
                    }
                }
            } else if (MediaMetadataCompat2 != null) {
                hashSet.add(MediaMetadataCompat2);
            }
        }
        return hashSet;
    }

    private Set IconCompatParcelizer(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.indexOf(64) != -1) {
                    String substring = str2.substring(str2.indexOf(64) + 1);
                    if (str.indexOf(64) != -1) {
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(substring, str)) {
                            hashSet.add(str);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (substring.equalsIgnoreCase(str)) {
                        hashSet.add(str);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str2.startsWith(".")) {
                    if (str.indexOf(64) != -1) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(str.substring(str2.indexOf(64) + 1), str2)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(str2, str) || str2.equalsIgnoreCase(str)) {
                            hashSet.add(str);
                        } else if (MediaBrowserCompat$CustomActionResultReceiver(str, str2)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (MediaBrowserCompat$CustomActionResultReceiver(str, str2)) {
                        hashSet.add(str2);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str.indexOf(64) != -1) {
                    if (str.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str2)) {
                        hashSet.add(str2);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str.startsWith(".")) {
                    if (MediaBrowserCompat$CustomActionResultReceiver(str2, str)) {
                        hashSet.add(str);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str2.equalsIgnoreCase(str)) {
                    hashSet.add(str2);
                } else {
                    hashSet.add(str2);
                    hashSet.add(str);
                }
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set read(Set set, Set set2) {
        Set set3;
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(((AccountDetailsAdapter$ItemViewHolder_ViewBinding) it.next()).write.MediaBrowserCompat$CustomActionResultReceiver).write();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    byte[] bArr = (byte[]) it2.next();
                    if (bArr.length != write2.length) {
                        set3 = Collections.EMPTY_SET;
                    } else {
                        int length = bArr.length / 2;
                        byte[] bArr2 = new byte[length];
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                        System.arraycopy(bArr, length, bArr3, 0, length);
                        byte[] bArr4 = new byte[length];
                        byte[] bArr5 = new byte[length];
                        System.arraycopy(write2, 0, bArr4, 0, length);
                        System.arraycopy(write2, length, bArr5, 0, length);
                        byte[][] bArr6 = {bArr2, bArr3, bArr4, bArr5};
                        byte[] bArr7 = bArr6[0];
                        byte[] bArr8 = bArr6[1];
                        byte[] bArr9 = bArr6[2];
                        byte[] bArr10 = bArr6[3];
                        byte[][] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(bArr7, bArr8, bArr9, bArr10);
                        if (MediaBrowserCompat$CustomActionResultReceiver(read(MediaBrowserCompat$CustomActionResultReceiver2[0], MediaBrowserCompat$CustomActionResultReceiver2[2]), write(MediaBrowserCompat$CustomActionResultReceiver2[1], MediaBrowserCompat$CustomActionResultReceiver2[3])) == 1) {
                            set3 = Collections.EMPTY_SET;
                        } else {
                            byte[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2[0], MediaBrowserCompat$CustomActionResultReceiver2[2]);
                            byte[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(bArr8, bArr10);
                            int length2 = MediaBrowserCompat$ItemReceiver2.length;
                            byte[] bArr11 = new byte[(length2 << 1)];
                            System.arraycopy(MediaBrowserCompat$ItemReceiver2, 0, bArr11, 0, length2);
                            System.arraycopy(MediaBrowserCompat$ItemReceiver3, 0, bArr11, length2, length2);
                            set3 = Collections.singleton(bArr11);
                        }
                    }
                    hashSet.addAll(set3);
                }
            } else if (write2 != null) {
                hashSet.add(write2);
            }
        }
        return hashSet;
    }

    private static byte[][] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr5[i] = (byte) (bArr[i] & bArr2[i]);
            bArr6[i] = (byte) ((bArr[i] & bArr2[i]) | (~bArr2[i]));
            bArr7[i] = (byte) (bArr3[i] & bArr4[i]);
            bArr8[i] = (byte) ((bArr3[i] & bArr4[i]) | (~bArr4[i]));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static boolean IconCompatParcelizer(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return C6958xd50139e8.write(bArr4, bArr5);
    }

    private static boolean IconCompatParcelizer(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (!str.equalsIgnoreCase(str2) && !substring.equalsIgnoreCase(str2.substring(1))) {
                return false;
            }
            return true;
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (MediaBrowserCompat$CustomActionResultReceiver(substring, str2)) {
            return true;
        }
        return false;
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] MediaBrowserCompat$ItemReceiver2 = MoneyActionAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver(str2);
        String[] MediaBrowserCompat$ItemReceiver3 = MoneyActionAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver(str);
        if (MediaBrowserCompat$ItemReceiver3.length <= MediaBrowserCompat$ItemReceiver2.length) {
            return false;
        }
        int length = MediaBrowserCompat$ItemReceiver3.length - MediaBrowserCompat$ItemReceiver2.length;
        for (int i = -1; i < MediaBrowserCompat$ItemReceiver2.length; i++) {
            if (i == -1) {
                if (MediaBrowserCompat$ItemReceiver3[i + length].equals("")) {
                    return false;
                }
            } else if (!MediaBrowserCompat$ItemReceiver2[i].equalsIgnoreCase(MediaBrowserCompat$ItemReceiver3[i + length])) {
                return false;
            }
        }
        return true;
    }

    static Set MediaBrowserCompat$ItemReceiver(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String MediaMetadataCompat2 = InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) ((AccountDetailsAdapter$ItemViewHolder_ViewBinding) it.next()).write.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (MediaBrowserCompat$CustomActionResultReceiver(str, MediaMetadataCompat2)) {
                        hashSet.add(str);
                    } else if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2, str)) {
                        hashSet.add(MediaMetadataCompat2);
                    }
                }
            } else if (MediaMetadataCompat2 != null) {
                hashSet.add(MediaMetadataCompat2);
            }
        }
        return hashSet;
    }

    private static Set MediaBrowserCompat$ItemReceiver(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (MediaBrowserCompat$CustomActionResultReceiver(str2, str)) {
                    hashSet.add(str);
                } else if (MediaBrowserCompat$CustomActionResultReceiver(str, str2)) {
                    hashSet.add(str2);
                } else {
                    hashSet.add(str2);
                    hashSet.add(str);
                }
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set MediaBrowserCompat$CustomActionResultReceiver(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String MediaMetadataCompat2 = InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) ((AccountDetailsAdapter$ItemViewHolder_ViewBinding) it.next()).write.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (str.indexOf(64) != -1) {
                        String substring = str.substring(str.indexOf(64) + 1);
                        if (MediaMetadataCompat2.indexOf(64) != -1) {
                            if (str.equalsIgnoreCase(MediaMetadataCompat2)) {
                                hashSet.add(str);
                            }
                        } else if (MediaMetadataCompat2.startsWith(".")) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(substring, MediaMetadataCompat2)) {
                                hashSet.add(str);
                            }
                        } else if (substring.equalsIgnoreCase(MediaMetadataCompat2)) {
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaMetadataCompat2.indexOf(64) != -1) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2.substring(str.indexOf(64) + 1), str)) {
                                hashSet.add(MediaMetadataCompat2);
                            }
                        } else if (MediaMetadataCompat2.startsWith(".")) {
                            if (MediaBrowserCompat$CustomActionResultReceiver(str, MediaMetadataCompat2) || str.equalsIgnoreCase(MediaMetadataCompat2)) {
                                hashSet.add(str);
                            } else if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2, str)) {
                                hashSet.add(MediaMetadataCompat2);
                            }
                        } else if (MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat2, str)) {
                            hashSet.add(MediaMetadataCompat2);
                        }
                    } else if (MediaMetadataCompat2.indexOf(64) != -1) {
                        if (MediaMetadataCompat2.substring(MediaMetadataCompat2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                            hashSet.add(MediaMetadataCompat2);
                        }
                    } else if (MediaMetadataCompat2.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(str, MediaMetadataCompat2)) {
                            hashSet.add(str);
                        }
                    } else if (str.equalsIgnoreCase(MediaMetadataCompat2)) {
                        hashSet.add(str);
                    }
                }
            } else if (MediaMetadataCompat2 != null) {
                hashSet.add(MediaMetadataCompat2);
            }
        }
        return hashSet;
    }

    private Set MediaBrowserCompat$CustomActionResultReceiver(Set set, String str) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.indexOf(64) != -1) {
                    String substring = str2.substring(str2.indexOf(64) + 1);
                    if (str.indexOf(64) != -1) {
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(substring, str)) {
                            hashSet.add(str);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (substring.equalsIgnoreCase(str)) {
                        hashSet.add(str);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str2.startsWith(".")) {
                    if (str.indexOf(64) != -1) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(str.substring(str2.indexOf(64) + 1), str2)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (str.startsWith(".")) {
                        if (MediaBrowserCompat$CustomActionResultReceiver(str2, str) || str2.equalsIgnoreCase(str)) {
                            hashSet.add(str);
                        } else if (MediaBrowserCompat$CustomActionResultReceiver(str, str2)) {
                            hashSet.add(str2);
                        } else {
                            hashSet.add(str2);
                            hashSet.add(str);
                        }
                    } else if (MediaBrowserCompat$CustomActionResultReceiver(str, str2)) {
                        hashSet.add(str2);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str.indexOf(64) != -1) {
                    if (str.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str2)) {
                        hashSet.add(str2);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str.startsWith(".")) {
                    if (MediaBrowserCompat$CustomActionResultReceiver(str2, str)) {
                        hashSet.add(str);
                    } else {
                        hashSet.add(str2);
                        hashSet.add(str);
                    }
                } else if (str2.equalsIgnoreCase(str)) {
                    hashSet.add(str2);
                } else {
                    hashSet.add(str2);
                    hashSet.add(str);
                }
            }
            return hashSet;
        } else if (str == null) {
            return set;
        } else {
            set.add(str);
            return set;
        }
    }

    private static byte[] read(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) > (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] write(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) < (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, byte[] bArr2) {
        if (C6958xd50139e8.write(bArr, bArr2)) {
            return 0;
        }
        return C6958xd50139e8.write(read(bArr, bArr2), bArr) ? 1 : -1;
    }

    private static byte[] MediaBrowserCompat$ItemReceiver(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] | bArr2[i]);
        }
        return bArr3;
    }

    public final int hashCode() {
        int IconCompatParcelizer2 = IconCompatParcelizer((Collection) this.MediaBrowserCompat$ItemReceiver);
        int IconCompatParcelizer3 = IconCompatParcelizer((Collection) this.RatingCompat);
        int IconCompatParcelizer4 = IconCompatParcelizer((Collection) this.MediaMetadataCompat);
        int IconCompatParcelizer5 = IconCompatParcelizer((Collection) this.MediaBrowserCompat$SearchResultReceiver);
        int IconCompatParcelizer6 = IconCompatParcelizer((Collection) this.MediaBrowserCompat$MediaItem);
        int IconCompatParcelizer7 = IconCompatParcelizer((Collection) this.read);
        int IconCompatParcelizer8 = IconCompatParcelizer((Collection) this.MediaBrowserCompat$CustomActionResultReceiver);
        int IconCompatParcelizer9 = IconCompatParcelizer((Collection) this.write);
        return IconCompatParcelizer2 + IconCompatParcelizer3 + IconCompatParcelizer4 + IconCompatParcelizer5 + IconCompatParcelizer6 + IconCompatParcelizer7 + IconCompatParcelizer8 + IconCompatParcelizer9 + IconCompatParcelizer((Collection) this.IconCompatParcelizer) + IconCompatParcelizer((Collection) this.MediaDescriptionCompat);
    }

    private static int IconCompatParcelizer(Collection collection) {
        int i;
        int i2 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object next : collection) {
            if (next instanceof byte[]) {
                i = C6958xd50139e8.read((byte[]) next);
            } else {
                i = next.hashCode();
            }
            i2 += i;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SmeLoanDetailLgItemAdapter$ChildViewHolder)) {
            return false;
        }
        SmeLoanDetailLgItemAdapter$ChildViewHolder smeLoanDetailLgItemAdapter$ChildViewHolder = (SmeLoanDetailLgItemAdapter$ChildViewHolder) obj;
        if (!IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$ItemReceiver, (Collection) this.MediaBrowserCompat$ItemReceiver) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.RatingCompat, (Collection) this.RatingCompat) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaMetadataCompat, (Collection) this.MediaMetadataCompat) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$SearchResultReceiver, (Collection) this.MediaBrowserCompat$SearchResultReceiver) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$MediaItem, (Collection) this.MediaBrowserCompat$MediaItem) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.read, (Collection) this.read) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaBrowserCompat$CustomActionResultReceiver, (Collection) this.MediaBrowserCompat$CustomActionResultReceiver) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.write, (Collection) this.write) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer, (Collection) this.IconCompatParcelizer) || !IconCompatParcelizer((Collection) smeLoanDetailLgItemAdapter$ChildViewHolder.MediaDescriptionCompat, (Collection) this.MediaDescriptionCompat)) {
            return false;
        }
        return true;
    }

    private static boolean IconCompatParcelizer(Collection collection, Collection collection2) {
        boolean z;
        boolean z2;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object next : collection) {
            Iterator it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    continue;
                    break;
                }
                Object next2 = it.next();
                if (next == next2) {
                    z2 = true;
                    continue;
                } else if (next == null || next2 == null) {
                    z2 = false;
                    continue;
                } else if (!(next instanceof byte[]) || !(next2 instanceof byte[])) {
                    z2 = next.equals(next2);
                    continue;
                } else {
                    z2 = C6958xd50139e8.write((byte[]) next, (byte[]) next2);
                    continue;
                }
                if (z2) {
                    z = true;
                    continue;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length / 2; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toString(bArr[i] & 255));
            sb.append(".");
            str = sb.toString();
        }
        String substring = str.substring(0, str.length() - 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(substring);
        sb2.append("/");
        String obj = sb2.toString();
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(Integer.toString(bArr[length] & 255));
            sb3.append(".");
            obj = sb3.toString();
        }
        return obj.substring(0, obj.length() - 1);
    }

    private static String MediaBrowserCompat$ItemReceiver(Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String obj = sb.toString();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(IconCompatParcelizer((byte[]) it.next()));
            sb2.append(",");
            obj = sb2.toString();
        }
        if (obj.length() > 1) {
            obj = obj.substring(0, obj.length() - 1);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append("]");
        return sb3.toString();
    }

    public final String toString() {
        String str = "permitted:\n";
        if (this.read != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("DN:\n");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.read.toString());
            sb2.append("\n");
            str = sb2.toString();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("DNS:\n");
            String obj2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj2);
            sb4.append(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
            sb4.append("\n");
            str = sb4.toString();
        }
        if (this.write != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("Email:\n");
            String obj3 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(obj3);
            sb6.append(this.write.toString());
            sb6.append("\n");
            str = sb6.toString();
        }
        if (this.MediaDescriptionCompat != null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append("URI:\n");
            String obj4 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj4);
            sb8.append(this.MediaDescriptionCompat.toString());
            sb8.append("\n");
            str = sb8.toString();
        }
        if (this.IconCompatParcelizer != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append("IP:\n");
            String obj5 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(obj5);
            sb10.append(MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
            sb10.append("\n");
            str = sb10.toString();
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(str);
        sb11.append("excluded:\n");
        String obj6 = sb11.toString();
        if (!this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append(obj6);
            sb12.append("DN:\n");
            String obj7 = sb12.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(obj7);
            sb13.append(this.MediaBrowserCompat$ItemReceiver.toString());
            sb13.append("\n");
            obj6 = sb13.toString();
        }
        if (!this.RatingCompat.isEmpty()) {
            StringBuilder sb14 = new StringBuilder();
            sb14.append(obj6);
            sb14.append("DNS:\n");
            String obj8 = sb14.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(obj8);
            sb15.append(this.RatingCompat.toString());
            sb15.append("\n");
            obj6 = sb15.toString();
        }
        if (!this.MediaMetadataCompat.isEmpty()) {
            StringBuilder sb16 = new StringBuilder();
            sb16.append(obj6);
            sb16.append("Email:\n");
            String obj9 = sb16.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(obj9);
            sb17.append(this.MediaMetadataCompat.toString());
            sb17.append("\n");
            obj6 = sb17.toString();
        }
        if (!this.MediaBrowserCompat$MediaItem.isEmpty()) {
            StringBuilder sb18 = new StringBuilder();
            sb18.append(obj6);
            sb18.append("URI:\n");
            String obj10 = sb18.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(obj10);
            sb19.append(this.MediaBrowserCompat$MediaItem.toString());
            sb19.append("\n");
            obj6 = sb19.toString();
        }
        if (this.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
            return obj6;
        }
        StringBuilder sb20 = new StringBuilder();
        sb20.append(obj6);
        sb20.append("IP:\n");
        String obj11 = sb20.toString();
        StringBuilder sb21 = new StringBuilder();
        sb21.append(obj11);
        sb21.append(MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver));
        sb21.append("\n");
        return sb21.toString();
    }

    private static boolean read(String str, String str2) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        if (substring3.indexOf(47) != -1) {
            substring3 = substring3.substring(0, substring3.indexOf(47));
        }
        if (!str2.startsWith(".")) {
            if (substring3.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (MediaBrowserCompat$CustomActionResultReceiver(substring3, str2)) {
            return true;
        }
        return false;
    }

    public final void IconCompatParcelizer(AccountDetailsAdapter$ItemViewHolder_ViewBinding accountDetailsAdapter$ItemViewHolder_ViewBinding) {
        CreditCardDetailsAdapter$ItemViewHolder creditCardDetailsAdapter$ItemViewHolder = accountDetailsAdapter$ItemViewHolder_ViewBinding.write;
        int i = creditCardDetailsAdapter$ItemViewHolder.IconCompatParcelizer;
        if (i == 1) {
            this.MediaMetadataCompat = IconCompatParcelizer(this.MediaMetadataCompat, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat());
        } else if (i == 2) {
            this.RatingCompat = MediaBrowserCompat$ItemReceiver(this.RatingCompat, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat());
        } else if (i == 4) {
            this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem());
        } else if (i == 6) {
            this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat());
        } else if (i == 7) {
            Set<byte[]> set = this.MediaBrowserCompat$SearchResultReceiver;
            byte[] write2 = C10905onItemClick.MediaBrowserCompat$ItemReceiver(creditCardDetailsAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver).write();
            if (!set.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (byte[] bArr : set) {
                    HashSet hashSet2 = new HashSet();
                    if (C6958xd50139e8.write(bArr, write2)) {
                        hashSet2.add(bArr);
                    } else {
                        hashSet2.add(bArr);
                        hashSet2.add(write2);
                    }
                    hashSet.addAll(hashSet2);
                }
                set = hashSet;
            } else if (write2 != null) {
                set.add(write2);
            }
            this.MediaBrowserCompat$SearchResultReceiver = set;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.CreditCardDetailsAdapter$ItemViewHolder r4) throws org.spongycastle.jce.provider.PKIXNameConstraintValidatorException {
        /*
            r3 = this;
            int r0 = r4.IconCompatParcelizer
            r1 = 1
            if (r0 == r1) goto L_0x00bd
            r1 = 2
            if (r0 == r1) goto L_0x0085
            r1 = 4
            if (r0 == r1) goto L_0x0075
            r1 = 6
            if (r0 == r1) goto L_0x0043
            r1 = 7
            if (r0 != r1) goto L_0x00ee
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.onItemClick r4 = p040o.C10905onItemClick.MediaBrowserCompat$ItemReceiver(r4)
            byte[] r4 = r4.write()
            java.util.Set r0 = r3.MediaBrowserCompat$SearchResultReceiver
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0042
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            boolean r1 = IconCompatParcelizer((byte[]) r4, (byte[]) r1)
            if (r1 != 0) goto L_0x003a
            goto L_0x0027
        L_0x003a:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "IP is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x0042:
            return
        L_0x0043:
            java.util.Set r0 = r3.MediaBrowserCompat$MediaItem
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r4 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r4)
            java.lang.String r4 = r4.MediaMetadataCompat()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0074
            java.util.Iterator r0 = r0.iterator()
        L_0x0059:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = read((java.lang.String) r4, (java.lang.String) r1)
            if (r1 != 0) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "URI is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x0074:
            return
        L_0x0075:
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$MediaItem()
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r4 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r4)
            java.util.Set r0 = r3.MediaBrowserCompat$ItemReceiver
            read((java.util.Set) r0, (p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r4)
            return
        L_0x0085:
            java.util.Set r0 = r3.RatingCompat
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r4 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r4)
            java.lang.String r4 = r4.MediaMetadataCompat()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00bc
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r4, (java.lang.String) r1)
            if (r2 != 0) goto L_0x00b4
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00b4
            goto L_0x009b
        L_0x00b4:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "DNS is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x00bc:
            return
        L_0x00bd:
            java.util.Set r0 = r3.MediaMetadataCompat
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r4 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r4)
            java.lang.String r4 = r4.MediaMetadataCompat()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00ee
            java.util.Iterator r0 = r0.iterator()
        L_0x00d3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = IconCompatParcelizer((java.lang.String) r4, (java.lang.String) r1)
            if (r1 != 0) goto L_0x00e6
            goto L_0x00d3
        L_0x00e6:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "Email address is from an excluded subtree."
            r4.<init>(r0)
            throw r4
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder.write(o.CreditCardDetailsAdapter$ItemViewHolder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.CreditCardDetailsAdapter$ItemViewHolder r5) throws org.spongycastle.jce.provider.PKIXNameConstraintValidatorException {
        /*
            r4 = this;
            int r0 = r5.IconCompatParcelizer
            r1 = 1
            if (r0 == r1) goto L_0x00d5
            r1 = 2
            if (r0 == r1) goto L_0x0094
            r1 = 4
            if (r0 == r1) goto L_0x0084
            r1 = 6
            if (r0 == r1) goto L_0x0049
            r1 = 7
            if (r0 != r1) goto L_0x010f
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.onItemClick r5 = p040o.C10905onItemClick.MediaBrowserCompat$ItemReceiver(r5)
            byte[] r5 = r5.write()
            java.util.Set r0 = r4.IconCompatParcelizer
            if (r0 == 0) goto L_0x0048
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            boolean r2 = IconCompatParcelizer((byte[]) r5, (byte[]) r2)
            if (r2 == 0) goto L_0x0023
            return
        L_0x0036:
            int r5 = r5.length
            if (r5 != 0) goto L_0x0040
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r5 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "IP is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x0048:
            return
        L_0x0049:
            java.util.Set r0 = r4.MediaDescriptionCompat
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r5 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r5)
            java.lang.String r5 = r5.MediaMetadataCompat()
            if (r0 == 0) goto L_0x0083
            java.util.Iterator r1 = r0.iterator()
        L_0x005b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = read((java.lang.String) r5, (java.lang.String) r2)
            if (r2 == 0) goto L_0x005b
            return
        L_0x006e:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x007b
            int r5 = r0.size()
            if (r5 != 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r5 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "URI is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x0083:
            return
        L_0x0084:
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$MediaItem()
            o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder r5 = p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r5)
            java.util.Set r0 = r4.read
            MediaBrowserCompat$CustomActionResultReceiver((java.util.Set) r0, (p040o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) r5)
            return
        L_0x0094:
            java.util.Set r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r5 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r5)
            java.lang.String r5 = r5.MediaMetadataCompat()
            if (r0 == 0) goto L_0x00d4
            java.util.Iterator r1 = r0.iterator()
        L_0x00a6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r5, (java.lang.String) r2)
            if (r3 != 0) goto L_0x00be
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00a6
        L_0x00be:
            return
        L_0x00bf:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00cc
            int r5 = r0.size()
            if (r5 != 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r5 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "DNS is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x00d4:
            return
        L_0x00d5:
            java.util.Set r0 = r4.write
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder r5 = p040o.InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((java.lang.Object) r5)
            java.lang.String r5 = r5.MediaMetadataCompat()
            if (r0 == 0) goto L_0x010f
            java.util.Iterator r1 = r0.iterator()
        L_0x00e7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fa
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = IconCompatParcelizer((java.lang.String) r5, (java.lang.String) r2)
            if (r2 == 0) goto L_0x00e7
            return
        L_0x00fa:
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0107
            int r5 = r0.size()
            if (r5 != 0) goto L_0x0107
            goto L_0x010f
        L_0x0107:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r5 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            r5.<init>(r0)
            throw r5
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder.IconCompatParcelizer(o.CreditCardDetailsAdapter$ItemViewHolder):void");
    }
}
