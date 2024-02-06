package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040o.ScriptGroup;
import p040o.setOutput;

/* renamed from: o.TaskUtil */
public final class TaskUtil {
    private rsnScriptFieldIDCreate IconCompatParcelizer;
    private final rsnScriptSetVarI MediaBrowserCompat$CustomActionResultReceiver;

    public TaskUtil() {
    }

    public TaskUtil(rsnScriptSetVarI rsnscriptsetvari) {
        this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptsetvari;
    }

    private float IconCompatParcelizer(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2) {
        float MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver((int) rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver, (int) rsnscriptforeach.read, (int) rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver, (int) rsnscriptforeach2.read);
        float MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver((int) rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver, (int) rsnscriptforeach2.read, (int) rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver, (int) rsnscriptforeach.read);
        if (Float.isNaN(MediaBrowserCompat$ItemReceiver)) {
            return MediaBrowserCompat$ItemReceiver2 / 7.0f;
        }
        return Float.isNaN(MediaBrowserCompat$ItemReceiver2) ? MediaBrowserCompat$ItemReceiver / 7.0f : (MediaBrowserCompat$ItemReceiver + MediaBrowserCompat$ItemReceiver2) / 14.0f;
    }

    private float IconCompatParcelizer(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double sqrt;
        boolean z;
        TaskUtil taskUtil;
        boolean z2 = true;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int i12 = i5 - i7;
        int abs2 = Math.abs(i12);
        int i13 = 2;
        int i14 = (-abs) / 2;
        int i15 = -1;
        int i16 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i15 = 1;
        }
        int i17 = i6 + i16;
        int i18 = i8;
        int i19 = i7;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i9 = i17;
                i10 = i12;
                i11 = i13;
                break;
            }
            int i21 = z3 ? i19 : i18;
            boolean z4 = z3;
            int i22 = z3 ? i18 : i19;
            if (i20 == z2) {
                i9 = i17;
                i10 = i12;
                z = z2;
                taskUtil = this;
            } else {
                taskUtil = this;
                i9 = i17;
                i10 = i12;
                z = false;
            }
            if (z == taskUtil.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i21, i22)) {
                if (i20 == 2) {
                    int i23 = i18 - i8;
                    int i24 = i19 - i7;
                    sqrt = Math.sqrt((double) ((i23 * i23) + (i24 * i24)));
                    break;
                }
                i20++;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (i19 == i5) {
                    i11 = 2;
                    break;
                }
                i19 += i15;
                i14 -= abs;
            }
            i18 += i16;
            i12 = i10;
            i17 = i9;
            z3 = z4;
            z2 = true;
            i13 = 2;
        }
        if (i20 != i11) {
            return Float.NaN;
        }
        int i25 = i9 - i8;
        sqrt = Math.sqrt((double) ((i25 * i25) + (i10 * i10)));
        return (float) sqrt;
    }

    private float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float IconCompatParcelizer2 = IconCompatParcelizer(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else if (i5 >= this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
            f = ((float) ((this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer - 1) - i)) / ((float) (i5 - i));
            i5 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i7 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i7 < 0) {
            f2 = f3 / ((float) (i2 - i7));
        } else if (i7 >= this.MediaBrowserCompat$CustomActionResultReceiver.write) {
            f2 = ((float) ((this.MediaBrowserCompat$CustomActionResultReceiver.write - 1) - i2)) / ((float) (i7 - i2));
            i6 = this.MediaBrowserCompat$CustomActionResultReceiver.write - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (IconCompatParcelizer2 + IconCompatParcelizer(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
    }

    public final isScaleIdentity$MediaBrowserCompat$ItemReceiver write(Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException {
        rsnScriptFieldIDCreate rsnscriptfieldidcreate;
        int i;
        int i2;
        Map<rsnIncContextCreate, ?> map2 = map;
        if (map2 == null) {
            rsnscriptfieldidcreate = null;
        } else {
            rsnscriptfieldidcreate = (rsnScriptFieldIDCreate) map2.get(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK);
        }
        this.IconCompatParcelizer = rsnscriptfieldidcreate;
        setOutput setoutput = new setOutput(this.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptfieldidcreate);
        boolean z = map2 != null && map2.containsKey(rsnIncContextCreate.TRY_HARDER);
        int i3 = setoutput.MediaBrowserCompat$ItemReceiver.write;
        int i4 = setoutput.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        int i5 = (i3 * 3) / 388;
        char c = 3;
        if (i5 < 3 || z) {
            i5 = 3;
        }
        int[] iArr = new int[5];
        int i6 = i5 - 1;
        boolean z2 = false;
        while (i6 < i3 && !z2) {
            for (int i7 = 0; i7 < 5; i7++) {
                iArr[i7] = 0;
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < i4) {
                if (setoutput.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i8, i6)) {
                    if ((i9 & 1) == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else {
                    if ((i9 & 1) == 0) {
                        if (i9 == 4) {
                            if (!setOutput.read(iArr)) {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[c];
                                iArr[2] = iArr[4];
                                iArr[c] = 1;
                                iArr[4] = 0;
                            } else if (setoutput.write(iArr, i6, i8)) {
                                if (setoutput.write) {
                                    z2 = setoutput.MediaBrowserCompat$ItemReceiver();
                                } else {
                                    if (setoutput.IconCompatParcelizer.size() > 1) {
                                        Iterator<getValue> it = setoutput.IconCompatParcelizer.iterator();
                                        getValue getvalue = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            getValue next = it.next();
                                            if (next.IconCompatParcelizer >= 2) {
                                                if (getvalue != null) {
                                                    setoutput.write = true;
                                                    i2 = ((int) (Math.abs(getvalue.MediaBrowserCompat$CustomActionResultReceiver - next.MediaBrowserCompat$CustomActionResultReceiver) - Math.abs(getvalue.read - next.read))) / 2;
                                                    break;
                                                }
                                                getvalue = next;
                                            }
                                        }
                                    }
                                    i2 = 0;
                                    if (i2 > iArr[2]) {
                                        i6 += (i2 - iArr[2]) - 2;
                                        i8 = i4 - 1;
                                    }
                                }
                                for (int i10 = 0; i10 < 5; i10++) {
                                    iArr[i10] = 0;
                                }
                                i9 = 0;
                                i5 = 2;
                            } else {
                                iArr[0] = iArr[2];
                                iArr[1] = iArr[3];
                                iArr[2] = iArr[4];
                                iArr[3] = 1;
                                iArr[4] = 0;
                            }
                            i9 = 3;
                        } else {
                            i9++;
                        }
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
                c = 3;
            }
            if (setOutput.read(iArr) && setoutput.write(iArr, i6, i4)) {
                int i11 = iArr[0];
                if (setoutput.write) {
                    z2 = setoutput.MediaBrowserCompat$ItemReceiver();
                }
                i5 = i11;
            }
            i6 += i5;
            c = 3;
        }
        int size = setoutput.IconCompatParcelizer.size();
        if (size >= 3) {
            float f = BitmapDescriptorFactory.HUE_RED;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (getValue getvalue2 : setoutput.IconCompatParcelizer) {
                    float f4 = getvalue2.write;
                    f2 += f4;
                    f3 += f4 * f4;
                }
                float f5 = (float) size;
                float f6 = f2 / f5;
                Collections.sort(setoutput.IconCompatParcelizer, new setOutput$MediaBrowserCompat$ItemReceiver(f6, (byte) 0));
                float max = Math.max(0.2f * f6, (float) Math.sqrt((double) ((f3 / f5) - (f6 * f6))));
                int i12 = 0;
                while (i12 < setoutput.IconCompatParcelizer.size() && setoutput.IconCompatParcelizer.size() > 3) {
                    if (Math.abs(setoutput.IconCompatParcelizer.get(i12).write - f6) > max) {
                        setoutput.IconCompatParcelizer.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (setoutput.IconCompatParcelizer.size() > 3) {
                for (getValue getvalue3 : setoutput.IconCompatParcelizer) {
                    f += getvalue3.write;
                }
                Collections.sort(setoutput.IconCompatParcelizer, new setOutput.write(f / ((float) setoutput.IconCompatParcelizer.size()), (byte) 0));
                List<getValue> list = setoutput.IconCompatParcelizer;
                i = 3;
                list.subList(3, list.size()).clear();
            } else {
                i = 3;
            }
            getValue[] getvalueArr = new getValue[i];
            getvalueArr[0] = setoutput.IconCompatParcelizer.get(0);
            getvalueArr[1] = setoutput.IconCompatParcelizer.get(1);
            getvalueArr[2] = setoutput.IconCompatParcelizer.get(2);
            rsnScriptForEach.IconCompatParcelizer(getvalueArr);
            return MediaBrowserCompat$CustomActionResultReceiver(new resetOverride(getvalueArr));
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private isScaleIdentity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(resetOverride resetoverride) throws NotFoundException, FormatException {
        int i;
        int i2;
        ScriptGroup.Builder builder;
        float f;
        float f2;
        float f3;
        rsnScriptForEach[] rsnscriptforeachArr;
        int i3;
        float f4;
        int i4;
        int i5;
        int i6;
        rsnScriptFieldIDCreate rsnscriptfieldidcreate;
        ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver;
        int i7;
        rsnScriptSetVarI rsnscriptsetvari;
        int i8;
        ScriptGroup.Builder builder2;
        ScriptGroup.Builder builder3;
        char c;
        int i9;
        int i10;
        ScriptGroup.Builder MediaBrowserCompat$ItemReceiver;
        TaskUtil taskUtil = this;
        resetOverride resetoverride2 = resetoverride;
        getValue getvalue = resetoverride2.MediaBrowserCompat$ItemReceiver;
        getValue getvalue2 = resetoverride2.read;
        getValue getvalue3 = resetoverride2.write;
        float IconCompatParcelizer2 = (taskUtil.IconCompatParcelizer(getvalue, getvalue2) + taskUtil.IconCompatParcelizer(getvalue, getvalue3)) / 2.0f;
        if (IconCompatParcelizer2 >= 1.0f) {
            float IconCompatParcelizer3 = rsnScriptForEach.IconCompatParcelizer(getvalue, getvalue2) / IconCompatParcelizer2;
            float f5 = -0.5f;
            int i11 = (int) (IconCompatParcelizer3 + (IconCompatParcelizer3 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
            float IconCompatParcelizer4 = rsnScriptForEach.IconCompatParcelizer(getvalue, getvalue3) / IconCompatParcelizer2;
            if (IconCompatParcelizer4 >= BitmapDescriptorFactory.HUE_RED) {
                f5 = 0.5f;
            }
            int i12 = ((i11 + ((int) (IconCompatParcelizer4 + f5))) / 2) + 7;
            int i13 = i12 & 3;
            if (i13 == 0) {
                i12++;
            } else if (i13 == 2) {
                i12--;
            } else if (i13 == 3) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            int i14 = i12;
            ScriptGroup.Binding write = ScriptGroup.Binding.write(i14);
            int i15 = (write.read << 2) + 17;
            int i16 = 0;
            int i17 = 1;
            if (write.MediaBrowserCompat$ItemReceiver.length > 0) {
                float f6 = getvalue2.MediaBrowserCompat$CustomActionResultReceiver;
                float f7 = getvalue.MediaBrowserCompat$CustomActionResultReceiver;
                float f8 = getvalue3.MediaBrowserCompat$CustomActionResultReceiver;
                float f9 = getvalue2.read;
                float f10 = getvalue.read;
                float f11 = getvalue3.read;
                float f12 = 1.0f - (3.0f / ((float) (i15 - 7)));
                int i18 = (int) (getvalue.MediaBrowserCompat$CustomActionResultReceiver + ((((f6 - f7) + f8) - getvalue.MediaBrowserCompat$CustomActionResultReceiver) * f12));
                int i19 = (int) (getvalue.read + (f12 * (((f9 - f10) + f11) - getvalue.read)));
                int i20 = 4;
                loop0:
                while (i20 <= 16) {
                    int i21 = (int) (((float) i20) * IconCompatParcelizer2);
                    try {
                        int max = Math.max(i16, i18 - i21);
                        int min = Math.min(taskUtil.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer - i17, i18 + i21) - max;
                        float f13 = IconCompatParcelizer2 * 3.0f;
                        if (((float) min) >= f13) {
                            int max2 = Math.max(i16, i19 - i21);
                            int min2 = Math.min(taskUtil.MediaBrowserCompat$CustomActionResultReceiver.write - i17, i21 + i19) - max2;
                            if (((float) min2) >= f13) {
                                rsnScriptSetVarI rsnscriptsetvari2 = taskUtil.MediaBrowserCompat$CustomActionResultReceiver;
                                i5 = i19;
                                try {
                                    rsnscriptfieldidcreate = taskUtil.IconCompatParcelizer;
                                    rsnScriptSetVarI rsnscriptsetvari3 = rsnscriptsetvari2;
                                    i7 = min2;
                                    rsnscriptsetvari = rsnscriptsetvari3;
                                    i4 = i18;
                                    int i22 = i17;
                                    i8 = i16;
                                    i3 = i14;
                                } catch (NotFoundException unused) {
                                    f4 = IconCompatParcelizer2;
                                    i4 = i18;
                                    i6 = i17;
                                    i3 = i14;
                                    i20 <<= 1;
                                    taskUtil = this;
                                    i17 = i6;
                                    i19 = i5;
                                    i18 = i4;
                                    IconCompatParcelizer2 = f4;
                                    i14 = i3;
                                    i16 = 0;
                                }
                                try {
                                    listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver = new ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver(rsnscriptsetvari, max, max2, min, i7, IconCompatParcelizer2, rsnscriptfieldidcreate);
                                    int i23 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                                    int i24 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                                    int i25 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.RatingCompat + i23;
                                    int i26 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.read;
                                    int i27 = i24 / 2;
                                    int[] iArr = new int[3];
                                    int i28 = i8;
                                    while (true) {
                                        if (i28 < i24) {
                                            if ((i28 & 1) == 0) {
                                                c = 2;
                                                i9 = (i28 + 1) / 2;
                                            } else {
                                                c = 2;
                                                i9 = -((i28 + 1) / 2);
                                            }
                                            int i29 = i9 + i26 + i27;
                                            iArr[i8] = i8;
                                            try {
                                                iArr[1] = i8;
                                                iArr[c] = i8;
                                                int i30 = i23;
                                                while (i30 < i25 && !listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(i30, i29)) {
                                                    i30++;
                                                }
                                                int i31 = 0;
                                                while (i30 < i25) {
                                                    f4 = IconCompatParcelizer2;
                                                    try {
                                                        if (!listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$ItemReceiver(i30, i29)) {
                                                            i10 = i23;
                                                            if (i31 == 1) {
                                                                i31++;
                                                            }
                                                            iArr[i31] = iArr[i31] + 1;
                                                        } else if (i31 == 1) {
                                                            try {
                                                                iArr[1] = iArr[1] + 1;
                                                                i10 = i23;
                                                            } catch (NotFoundException unused2) {
                                                                i6 = 1;
                                                                i20 <<= 1;
                                                                taskUtil = this;
                                                                i17 = i6;
                                                                i19 = i5;
                                                                i18 = i4;
                                                                IconCompatParcelizer2 = f4;
                                                                i14 = i3;
                                                                i16 = 0;
                                                            }
                                                        } else if (i31 == 2) {
                                                            if (listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.read(iArr) && (MediaBrowserCompat$ItemReceiver = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(iArr, i29, i30)) != null) {
                                                                builder3 = MediaBrowserCompat$ItemReceiver;
                                                                i2 = 1;
                                                                break loop0;
                                                            }
                                                            iArr[0] = iArr[2];
                                                            try {
                                                                iArr[1] = 1;
                                                                iArr[2] = 0;
                                                                i10 = i23;
                                                                i31 = 1;
                                                            } catch (NotFoundException unused3) {
                                                                i6 = 1;
                                                                i20 <<= 1;
                                                                taskUtil = this;
                                                                i17 = i6;
                                                                i19 = i5;
                                                                i18 = i4;
                                                                IconCompatParcelizer2 = f4;
                                                                i14 = i3;
                                                                i16 = 0;
                                                            }
                                                        } else {
                                                            i31++;
                                                            i10 = i23;
                                                            i6 = 1;
                                                            try {
                                                                iArr[i31] = iArr[i31] + 1;
                                                            } catch (NotFoundException unused4) {
                                                                i20 <<= 1;
                                                                taskUtil = this;
                                                                i17 = i6;
                                                                i19 = i5;
                                                                i18 = i4;
                                                                IconCompatParcelizer2 = f4;
                                                                i14 = i3;
                                                                i16 = 0;
                                                            }
                                                        }
                                                        i30++;
                                                        IconCompatParcelizer2 = f4;
                                                        i23 = i10;
                                                    } catch (NotFoundException unused5) {
                                                        i6 = 1;
                                                        i20 <<= 1;
                                                        taskUtil = this;
                                                        i17 = i6;
                                                        i19 = i5;
                                                        i18 = i4;
                                                        IconCompatParcelizer2 = f4;
                                                        i14 = i3;
                                                        i16 = 0;
                                                    }
                                                }
                                                float f14 = IconCompatParcelizer2;
                                                int i32 = i23;
                                                i2 = 1;
                                                if (listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.read(iArr) && (builder2 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(iArr, i29, i25)) != null) {
                                                    break loop0;
                                                }
                                                i28++;
                                                IconCompatParcelizer2 = f14;
                                                i23 = i32;
                                                i8 = 0;
                                            } catch (NotFoundException unused6) {
                                                f4 = IconCompatParcelizer2;
                                                i6 = 1;
                                                i20 <<= 1;
                                                taskUtil = this;
                                                i17 = i6;
                                                i19 = i5;
                                                i18 = i4;
                                                IconCompatParcelizer2 = f4;
                                                i14 = i3;
                                                i16 = 0;
                                            }
                                        } else {
                                            float f15 = IconCompatParcelizer2;
                                            i2 = 1;
                                            if (!listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                                                builder2 = listenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.get(0);
                                            } else {
                                                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                                            }
                                        }
                                    }
                                    builder3 = builder2;
                                    builder = builder3;
                                    i = i3;
                                    break loop0;
                                } catch (NotFoundException unused7) {
                                    f4 = IconCompatParcelizer2;
                                    i6 = 1;
                                    i20 <<= 1;
                                    taskUtil = this;
                                    i17 = i6;
                                    i19 = i5;
                                    i18 = i4;
                                    IconCompatParcelizer2 = f4;
                                    i14 = i3;
                                    i16 = 0;
                                }
                            } else {
                                float f16 = IconCompatParcelizer2;
                                int i33 = i19;
                                int i34 = i18;
                                int i35 = i17;
                                int i36 = i14;
                                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                            }
                        } else {
                            float f17 = IconCompatParcelizer2;
                            int i37 = i19;
                            int i38 = i18;
                            int i39 = i17;
                            int i40 = i14;
                            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    } catch (NotFoundException unused8) {
                        f4 = IconCompatParcelizer2;
                        i5 = i19;
                        i4 = i18;
                        i6 = i17;
                        i3 = i14;
                        i20 <<= 1;
                        taskUtil = this;
                        i17 = i6;
                        i19 = i5;
                        i18 = i4;
                        IconCompatParcelizer2 = f4;
                        i14 = i3;
                        i16 = 0;
                    }
                }
            }
            i2 = i17;
            i = i14;
            builder = null;
            float f18 = ((float) i) - 3.5f;
            if (builder != null) {
                f2 = builder.MediaBrowserCompat$CustomActionResultReceiver;
                f = builder.read;
                f3 = f18 - 3.0f;
            } else {
                f2 = (getvalue2.MediaBrowserCompat$CustomActionResultReceiver - getvalue.MediaBrowserCompat$CustomActionResultReceiver) + getvalue3.MediaBrowserCompat$CustomActionResultReceiver;
                f = (getvalue2.read - getvalue.read) + getvalue3.read;
                f3 = f18;
            }
            int i41 = i2;
            rsnScriptSetVarI IconCompatParcelizer5 = rsnScriptReduce.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, i, i, replaceInParent$MediaBrowserCompat$ItemReceiver.write(3.5f, 3.5f, f18, 3.5f, f3, f3, 3.5f, f18, getvalue.MediaBrowserCompat$CustomActionResultReceiver, getvalue.read, getvalue2.MediaBrowserCompat$CustomActionResultReceiver, getvalue2.read, f2, f, getvalue3.MediaBrowserCompat$CustomActionResultReceiver, getvalue3.read));
            if (builder == null) {
                rsnscriptforeachArr = new rsnScriptForEach[3];
                rsnscriptforeachArr[0] = getvalue3;
                rsnscriptforeachArr[i41] = getvalue;
                rsnscriptforeachArr[2] = getvalue2;
            } else {
                rsnScriptForEach[] rsnscriptforeachArr2 = new rsnScriptForEach[4];
                rsnscriptforeachArr2[0] = getvalue3;
                rsnscriptforeachArr2[i41] = getvalue;
                rsnscriptforeachArr2[2] = getvalue2;
                rsnscriptforeachArr2[3] = builder;
                rsnscriptforeachArr = rsnscriptforeachArr2;
            }
            return new isScaleIdentity$MediaBrowserCompat$ItemReceiver(IconCompatParcelizer5, rsnscriptforeachArr);
        }
        TaskUtil taskUtil2 = taskUtil;
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
