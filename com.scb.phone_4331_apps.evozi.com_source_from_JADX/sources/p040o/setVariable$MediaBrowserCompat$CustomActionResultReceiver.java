package p040o;

/* renamed from: o.setVariable$MediaBrowserCompat$CustomActionResultReceiver */
public final class setVariable$MediaBrowserCompat$CustomActionResultReceiver {
    public final int[] IconCompatParcelizer;
    private final rsnScriptSetVarObj write;

    private setVariable$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public setVariable$MediaBrowserCompat$CustomActionResultReceiver(rsnScriptSetVarObj rsnscriptsetvarobj, int[] iArr) {
        if (iArr.length != 0) {
            this.write = rsnscriptsetvarobj;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.IconCompatParcelizer = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.IconCompatParcelizer = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.IconCompatParcelizer = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver) {
        if (this.write.equals(setvariable_mediabrowsercompat_customactionresultreceiver.write)) {
            boolean z = true;
            if (this.IconCompatParcelizer[0] == 0) {
                return setvariable_mediabrowsercompat_customactionresultreceiver;
            }
            if (setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer[0] != 0) {
                z = false;
            }
            if (z) {
                return this;
            }
            int[] iArr = this.IconCompatParcelizer;
            int[] iArr2 = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = rsnScriptSetVarObj.read(iArr2[i - length], iArr[i]);
            }
            return new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.write, iArr4);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver[] MediaBrowserCompat$ItemReceiver(setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver) {
        if (this.write.equals(setvariable_mediabrowsercompat_customactionresultreceiver.write)) {
            if (!(setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer[0] == 0)) {
                setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver2 = this.write.MediaSessionCompat$QueueItem;
                int[] iArr = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
                int i = iArr[(iArr.length - 1) - (iArr.length - 1)];
                rsnScriptSetVarObj rsnscriptsetvarobj = this.write;
                if (i != 0) {
                    int i2 = rsnscriptsetvarobj.RatingCompat[(rsnscriptsetvarobj.f2623x50fd9e4a - rsnscriptsetvarobj.MediaSessionCompat$Token[i]) - 1];
                    setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver3 = this;
                    while (true) {
                        int[] iArr2 = setvariable_mediabrowsercompat_customactionresultreceiver3.IconCompatParcelizer;
                        if (iArr2.length - 1 >= setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.length - 1) {
                            if (iArr2[0] == 0) {
                                break;
                            }
                            int[] iArr3 = setvariable_mediabrowsercompat_customactionresultreceiver3.IconCompatParcelizer;
                            int length = (iArr3.length - 1) - (setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.length - 1);
                            int IconCompatParcelizer2 = this.write.IconCompatParcelizer(iArr3[(iArr3.length - 1) - (iArr3.length - 1)], i2);
                            setVariable$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = setvariable_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(length, IconCompatParcelizer2);
                            setvariable_mediabrowsercompat_customactionresultreceiver2 = setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer(this.write.write(length, IconCompatParcelizer2));
                            setvariable_mediabrowsercompat_customactionresultreceiver3 = setvariable_mediabrowsercompat_customactionresultreceiver3.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
                        } else {
                            break;
                        }
                    }
                    return new setVariable$MediaBrowserCompat$CustomActionResultReceiver[]{setvariable_mediabrowsercompat_customactionresultreceiver2, setvariable_mediabrowsercompat_customactionresultreceiver3};
                }
                throw new ArithmeticException();
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer(int i) {
        if (i == 0) {
            int[] iArr = this.IconCompatParcelizer;
            return iArr[(iArr.length - 1) - 0];
        } else if (i == 1) {
            int i2 = 0;
            for (int read : this.IconCompatParcelizer) {
                i2 = rsnScriptSetVarObj.read(i2, read);
            }
            return i2;
        } else {
            int[] iArr2 = this.IconCompatParcelizer;
            int i3 = iArr2[0];
            int length = iArr2.length;
            for (int i4 = 1; i4 < length; i4++) {
                i3 = rsnScriptSetVarObj.read(this.write.IconCompatParcelizer(i, i3), this.IconCompatParcelizer[i4]);
            }
            return i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 0) {
            return this.write.MediaSessionCompat$QueueItem;
        }
        if (i == 1) {
            return this;
        }
        int length = this.IconCompatParcelizer.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.write.IconCompatParcelizer(this.IconCompatParcelizer[i2], i);
        }
        return new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.write, iArr);
    }

    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver read(setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver) {
        if (this.write.equals(setvariable_mediabrowsercompat_customactionresultreceiver.write)) {
            if (!(this.IconCompatParcelizer[0] == 0)) {
                if (!(setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer[0] == 0)) {
                    int[] iArr = this.IconCompatParcelizer;
                    int length = iArr.length;
                    int[] iArr2 = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = rsnScriptSetVarObj.read(iArr3[i4], this.write.IconCompatParcelizer(i2, iArr2[i3]));
                        }
                    }
                    return new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.write, iArr3);
                }
            }
            return this.write.MediaSessionCompat$QueueItem;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.write.MediaSessionCompat$QueueItem;
        } else {
            int length = this.IconCompatParcelizer.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.write.IconCompatParcelizer(this.IconCompatParcelizer[i3], i2);
            }
            return new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.write, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.IconCompatParcelizer.length - 1) << 3);
        for (int length = this.IconCompatParcelizer.length - 1; length >= 0; length--) {
            int[] iArr = this.IconCompatParcelizer;
            int i = iArr[(iArr.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    rsnScriptSetVarObj rsnscriptsetvarobj = this.write;
                    if (i != 0) {
                        int i2 = rsnscriptsetvarobj.MediaSessionCompat$Token[i];
                        if (i2 == 0) {
                            sb.append('1');
                        } else if (i2 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i2);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
