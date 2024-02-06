package p040o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;

/* renamed from: o.onAlienCardTabClicked$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7297xe1f4fb57 {
    private C7297xe1f4fb57() {
    }

    public /* synthetic */ C7297xe1f4fb57(byte b) {
        this();
    }

    public final onAlienCardTabClicked read(SCBUniversalWebViewActivity_ViewBinding... sCBUniversalWebViewActivity_ViewBindingArr) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBindingArr, "byteStrings");
        if (sCBUniversalWebViewActivity_ViewBindingArr.length == 0) {
            return new onAlienCardTabClicked(new SCBUniversalWebViewActivity_ViewBinding[0], new int[]{0, -1}, (byte) 0);
        }
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBindingArr, "$this$toMutableList");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBindingArr, "$this$asCollection");
        List arrayList = new ArrayList(new NTBPinLoginActivity_ViewBinding(sCBUniversalWebViewActivity_ViewBindingArr, false));
        onGetStartedClick.write((Object) arrayList, "$this$sort");
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        Collection arrayList2 = new ArrayList(sCBUniversalWebViewActivity_ViewBindingArr.length);
        int length = sCBUniversalWebViewActivity_ViewBindingArr.length;
        for (int i = 0; i < length; i++) {
            arrayList2.add(-1);
        }
        Object[] array = ((List) arrayList2).toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            List MediaBrowserCompat$CustomActionResultReceiver = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length2 = sCBUniversalWebViewActivity_ViewBindingArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                MediaBrowserCompat$CustomActionResultReceiver.set(HmlNTBBusinessURLInformationActivity.write(arrayList, sCBUniversalWebViewActivity_ViewBindingArr[i2]), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((SCBUniversalWebViewActivity_ViewBinding) arrayList.get(0)).write() > 0) {
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = (SCBUniversalWebViewActivity_ViewBinding) arrayList.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < arrayList.size()) {
                        SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = (SCBUniversalWebViewActivity_ViewBinding) arrayList.get(i6);
                        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "prefix");
                        if (!PinChangeSuccessActivity.read(sCBUniversalWebViewActivity_ViewBinding2, sCBUniversalWebViewActivity_ViewBinding)) {
                            continue;
                            break;
                        }
                        if (!(sCBUniversalWebViewActivity_ViewBinding2.write() != sCBUniversalWebViewActivity_ViewBinding.write())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("duplicate option: ");
                            sb.append(sCBUniversalWebViewActivity_ViewBinding2);
                            throw new IllegalArgumentException(sb.toString().toString());
                        } else if (((Number) MediaBrowserCompat$CustomActionResultReceiver.get(i6)).intValue() > ((Number) MediaBrowserCompat$CustomActionResultReceiver.get(i4)).intValue()) {
                            arrayList.remove(i6);
                            MediaBrowserCompat$CustomActionResultReceiver.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity = new SCBUniversalWebViewActivity();
                MediaBrowserCompat$CustomActionResultReceiver(0, sCBUniversalWebViewActivity, 0, arrayList, 0, arrayList.size(), MediaBrowserCompat$CustomActionResultReceiver);
                int[] iArr = new int[((int) (sCBUniversalWebViewActivity.read / 4))];
                int i7 = 0;
                while (true) {
                    if (sCBUniversalWebViewActivity.read == 0) {
                        return new onAlienCardTabClicked((SCBUniversalWebViewActivity_ViewBinding[]) sCBUniversalWebViewActivity_ViewBindingArr.clone(), iArr, (byte) 0);
                    }
                    iArr[i7] = sCBUniversalWebViewActivity.mo42948x50fd9e4a();
                    i7++;
                }
            } else {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(long j, SCBUniversalWebViewActivity sCBUniversalWebViewActivity, int i, List<? extends SCBUniversalWebViewActivity_ViewBinding> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2;
        int i7;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity3 = sCBUniversalWebViewActivity;
        int i8 = i;
        List<? extends SCBUniversalWebViewActivity_ViewBinding> list3 = list;
        int i9 = i2;
        int i10 = i3;
        List<Integer> list4 = list2;
        if (i9 < i10) {
            int i11 = i9;
            while (i11 < i10) {
                if (((SCBUniversalWebViewActivity_ViewBinding) list3.get(i11)).write() >= i8) {
                    i11++;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding = (SCBUniversalWebViewActivity_ViewBinding) list.get(i2);
            SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding2 = (SCBUniversalWebViewActivity_ViewBinding) list3.get(i10 - 1);
            if (i8 == sCBUniversalWebViewActivity_ViewBinding.write()) {
                int intValue = list4.get(i9).intValue();
                int i12 = i9 + 1;
                i4 = i12;
                i5 = intValue;
                sCBUniversalWebViewActivity_ViewBinding = (SCBUniversalWebViewActivity_ViewBinding) list3.get(i12);
            } else {
                i5 = -1;
                i4 = i9;
            }
            if (sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i8) != sCBUniversalWebViewActivity_ViewBinding2.IconCompatParcelizer(i8)) {
                int i13 = 1;
                for (int i14 = i4 + 1; i14 < i10; i14++) {
                    if (((SCBUniversalWebViewActivity_ViewBinding) list3.get(i14 - 1)).IconCompatParcelizer(i8) != ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i14)).IconCompatParcelizer(i8)) {
                        i13++;
                    }
                }
                C7297xe1f4fb57 onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver = this;
                long j2 = j + (sCBUniversalWebViewActivity3.read / 4) + 2 + ((long) (i13 << 1));
                sCBUniversalWebViewActivity3.IconCompatParcelizer(i13);
                sCBUniversalWebViewActivity3.IconCompatParcelizer(i5);
                for (int i15 = i4; i15 < i10; i15++) {
                    byte IconCompatParcelizer = ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i15)).IconCompatParcelizer(i8);
                    if (i15 == i4 || IconCompatParcelizer != ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i15 - 1)).IconCompatParcelizer(i8)) {
                        sCBUniversalWebViewActivity3.IconCompatParcelizer((int) IconCompatParcelizer & 255);
                    }
                }
                SCBUniversalWebViewActivity sCBUniversalWebViewActivity4 = new SCBUniversalWebViewActivity();
                while (i4 < i10) {
                    byte IconCompatParcelizer2 = ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i4)).IconCompatParcelizer(i8);
                    int i16 = i4 + 1;
                    int i17 = i16;
                    while (true) {
                        if (i17 < i10) {
                            if (IconCompatParcelizer2 != ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i17)).IconCompatParcelizer(i8)) {
                                i6 = i17;
                                break;
                            }
                            i17++;
                        } else {
                            i6 = i10;
                            break;
                        }
                    }
                    if (i16 == i6 && i8 + 1 == ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i4)).write()) {
                        sCBUniversalWebViewActivity3.IconCompatParcelizer(list4.get(i4).intValue());
                        i7 = i6;
                        sCBUniversalWebViewActivity2 = sCBUniversalWebViewActivity4;
                    } else {
                        sCBUniversalWebViewActivity3.IconCompatParcelizer(-((int) ((sCBUniversalWebViewActivity4.read / 4) + j2)));
                        i7 = i6;
                        sCBUniversalWebViewActivity2 = sCBUniversalWebViewActivity4;
                        onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(j2, sCBUniversalWebViewActivity4, i8 + 1, list, i4, i6, list2);
                    }
                    i4 = i7;
                    sCBUniversalWebViewActivity4 = sCBUniversalWebViewActivity2;
                }
                sCBUniversalWebViewActivity3.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) sCBUniversalWebViewActivity4);
                return;
            }
            int min = Math.min(sCBUniversalWebViewActivity_ViewBinding.write(), sCBUniversalWebViewActivity_ViewBinding2.write());
            int i18 = i8;
            int i19 = 0;
            while (i18 < min && sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i18) == sCBUniversalWebViewActivity_ViewBinding2.IconCompatParcelizer(i18)) {
                i19++;
                i18++;
            }
            C7297xe1f4fb57 onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver2 = this;
            long j3 = j + (sCBUniversalWebViewActivity3.read / 4) + 2 + ((long) i19) + 1;
            sCBUniversalWebViewActivity3.IconCompatParcelizer(-i19);
            sCBUniversalWebViewActivity3.IconCompatParcelizer(i5);
            int i20 = i8 + i19;
            while (i8 < i20) {
                sCBUniversalWebViewActivity3.IconCompatParcelizer((int) sCBUniversalWebViewActivity_ViewBinding.IconCompatParcelizer(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i10) {
                if (i20 == ((SCBUniversalWebViewActivity_ViewBinding) list3.get(i4)).write()) {
                    sCBUniversalWebViewActivity3.IconCompatParcelizer(list4.get(i4).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            SCBUniversalWebViewActivity sCBUniversalWebViewActivity5 = new SCBUniversalWebViewActivity();
            sCBUniversalWebViewActivity3.IconCompatParcelizer(-((int) ((sCBUniversalWebViewActivity5.read / 4) + j3)));
            onaliencardtabclicked_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver(j3, sCBUniversalWebViewActivity5, i20, list, i4, i3, list2);
            sCBUniversalWebViewActivity3.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) sCBUniversalWebViewActivity5);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
