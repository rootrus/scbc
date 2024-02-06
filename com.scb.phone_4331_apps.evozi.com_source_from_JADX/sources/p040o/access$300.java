package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.access$300 */
public final class access$300 {
    private static final Object IconCompatParcelizer = new Object();
    private static final Object[][] MediaBrowserCompat$CustomActionResultReceiver;
    private static final Object[][] MediaBrowserCompat$ItemReceiver;
    private static final Object[][] read;
    private static final Object[][] write;

    static {
        Object[] objArr = {"21", IconCompatParcelizer, 20};
        Object[] objArr2 = {"22", IconCompatParcelizer, 29};
        Object obj = IconCompatParcelizer;
        Object[] objArr3 = {"90", IconCompatParcelizer, 30};
        Object[] objArr4 = {"91", IconCompatParcelizer, 30};
        Object obj2 = IconCompatParcelizer;
        Object obj3 = IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", IconCompatParcelizer, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, objArr, objArr2, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, objArr3, objArr4, new Object[]{"92", obj2, 30}, new Object[]{"93", obj2, 30}, new Object[]{"94", obj3, 30}, new Object[]{"95", obj3, 30}, new Object[]{"96", obj3, 30}, new Object[]{"97", obj3, 30}, new Object[]{"98", obj3, 30}, new Object[]{"99", obj3, 30}};
        MediaBrowserCompat$ItemReceiver = new Object[][]{new Object[]{"240", obj3, 30}, new Object[]{"241", obj3, 30}, new Object[]{"242", obj3, 6}, new Object[]{"250", obj3, 30}, new Object[]{"251", obj3, 30}, new Object[]{"253", obj3, 17}, new Object[]{"254", obj3, 20}, new Object[]{"400", obj3, 30}, new Object[]{"401", obj3, 30}, new Object[]{"402", 17}, new Object[]{"403", obj3, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj3, 20}, new Object[]{"421", obj3, 15}, new Object[]{"422", 3}, new Object[]{"423", obj3, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        read = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj3, 15}, new Object[]{"391", obj3, 18}, new Object[]{"392", obj3, 15}, new Object[]{"393", obj3, 18}, new Object[]{"703", obj3, 30}};
        write = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj3, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj3, 20}, new Object[]{"8003", obj3, 30}, new Object[]{"8004", obj3, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj3, 30}, new Object[]{"8008", obj3, 12}, new Object[]{"8018", 18}, new Object[]{"8020", IconCompatParcelizer, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", IconCompatParcelizer, 70}, new Object[]{"8200", IconCompatParcelizer, 70}};
    }

    public static String IconCompatParcelizer(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            Object[][] objArr = MediaBrowserCompat$CustomActionResultReceiver;
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object[] objArr2 = objArr[i];
                if (!objArr2[0].equals(substring)) {
                    i++;
                } else if (objArr2[1] == IconCompatParcelizer) {
                    return MediaBrowserCompat$ItemReceiver(2, ((Integer) objArr2[2]).intValue(), str);
                } else {
                    return IconCompatParcelizer(2, ((Integer) objArr2[1]).intValue(), str);
                }
            }
            if (str.length() >= 3) {
                String substring2 = str.substring(0, 3);
                Object[][] objArr3 = MediaBrowserCompat$ItemReceiver;
                int length2 = objArr3.length;
                int i2 = 0;
                while (i2 < length2) {
                    Object[] objArr4 = objArr3[i2];
                    if (!objArr4[0].equals(substring2)) {
                        i2++;
                    } else if (objArr4[1] == IconCompatParcelizer) {
                        return MediaBrowserCompat$ItemReceiver(3, ((Integer) objArr4[2]).intValue(), str);
                    } else {
                        return IconCompatParcelizer(3, ((Integer) objArr4[1]).intValue(), str);
                    }
                }
                Object[][] objArr5 = read;
                int length3 = objArr5.length;
                int i3 = 0;
                while (i3 < length3) {
                    Object[] objArr6 = objArr5[i3];
                    if (!objArr6[0].equals(substring2)) {
                        i3++;
                    } else if (objArr6[1] == IconCompatParcelizer) {
                        return MediaBrowserCompat$ItemReceiver(4, ((Integer) objArr6[2]).intValue(), str);
                    } else {
                        return IconCompatParcelizer(4, ((Integer) objArr6[1]).intValue(), str);
                    }
                }
                if (str.length() >= 4) {
                    String substring3 = str.substring(0, 4);
                    Object[][] objArr7 = write;
                    int length4 = objArr7.length;
                    int i4 = 0;
                    while (i4 < length4) {
                        Object[] objArr8 = objArr7[i4];
                        if (!objArr8[0].equals(substring3)) {
                            i4++;
                        } else if (objArr8[1] == IconCompatParcelizer) {
                            return MediaBrowserCompat$ItemReceiver(4, ((Integer) objArr8[2]).intValue(), str);
                        } else {
                            return IconCompatParcelizer(4, ((Integer) objArr8[1]).intValue(), str);
                        }
                    }
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static String IconCompatParcelizer(int i, int i2, String str) throws NotFoundException {
        if (str.length() >= i) {
            String substring = str.substring(0, i);
            int i3 = i2 + i;
            if (str.length() >= i3) {
                String substring2 = str.substring(i, i3);
                String substring3 = str.substring(i3);
                StringBuilder sb = new StringBuilder("(");
                sb.append(substring);
                sb.append(')');
                sb.append(substring2);
                String obj = sb.toString();
                String IconCompatParcelizer2 = IconCompatParcelizer(substring3);
                if (IconCompatParcelizer2 == null) {
                    return obj;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(IconCompatParcelizer2);
                return sb2.toString();
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static String MediaBrowserCompat$ItemReceiver(int i, int i2, String str) throws NotFoundException {
        String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            i3 = str.length();
        }
        String substring2 = str.substring(i, i3);
        String substring3 = str.substring(i3);
        StringBuilder sb = new StringBuilder("(");
        sb.append(substring);
        sb.append(')');
        sb.append(substring2);
        String obj = sb.toString();
        String IconCompatParcelizer2 = IconCompatParcelizer(substring3);
        if (IconCompatParcelizer2 == null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(IconCompatParcelizer2);
        return sb2.toString();
    }
}
