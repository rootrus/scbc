package p040o;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: o.setLogLevel$MediaBrowserCompat$ItemReceiver */
public final class setLogLevel$MediaBrowserCompat$ItemReceiver {
    private final rsnScriptSetVarObj MediaBrowserCompat$CustomActionResultReceiver;

    private setLogLevel$MediaBrowserCompat$ItemReceiver() {
    }

    public setLogLevel$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarObj rsnscriptsetvarobj) {
        this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptsetvarobj;
    }

    private int[] MediaBrowserCompat$ItemReceiver(setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver) throws ReedSolomonException {
        int length = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.length - 1;
        int i = 0;
        if (length == 1) {
            int[] iArr = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
            return new int[]{iArr[(iArr.length - 1) - 1]};
        }
        int[] iArr2 = new int[length];
        for (int i2 = 1; i2 < this.MediaBrowserCompat$CustomActionResultReceiver.f2623x50fd9e4a && i < length; i2++) {
            if (setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(i2) == 0) {
                rsnScriptSetVarObj rsnscriptsetvarobj = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i2 != 0) {
                    iArr2[i] = rsnscriptsetvarobj.RatingCompat[(rsnscriptsetvarobj.f2623x50fd9e4a - rsnscriptsetvarobj.MediaSessionCompat$Token[i2]) - 1];
                    i++;
                } else {
                    throw new ArithmeticException();
                }
            }
        }
        if (i == length) {
            return iArr2;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] MediaBrowserCompat$CustomActionResultReceiver(setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (i < length) {
            rsnScriptSetVarObj rsnscriptsetvarobj = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = iArr[i];
            if (i2 != 0) {
                int i3 = rsnscriptsetvarobj.RatingCompat[(rsnscriptsetvarobj.f2623x50fd9e4a - rsnscriptsetvarobj.MediaSessionCompat$Token[i2]) - 1];
                int i4 = 1;
                for (int i5 = 0; i5 < length; i5++) {
                    if (i != i5) {
                        int IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(iArr[i5], i3);
                        i4 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i4, (IconCompatParcelizer & 1) == 0 ? IconCompatParcelizer | 1 : IconCompatParcelizer & -2);
                    }
                }
                rsnScriptSetVarObj rsnscriptsetvarobj2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int IconCompatParcelizer2 = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(i3);
                rsnScriptSetVarObj rsnscriptsetvarobj3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i4 != 0) {
                    iArr2[i] = rsnscriptsetvarobj2.IconCompatParcelizer(IconCompatParcelizer2, rsnscriptsetvarobj3.RatingCompat[(rsnscriptsetvarobj3.f2623x50fd9e4a - rsnscriptsetvarobj3.MediaSessionCompat$Token[i4]) - 1]);
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat != 0) {
                        iArr2[i] = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(iArr2[i], i3);
                    }
                    i++;
                } else {
                    throw new ArithmeticException();
                }
            } else {
                throw new ArithmeticException();
            }
        }
        return iArr2;
    }

    public final void MediaBrowserCompat$ItemReceiver(int[] iArr, int i) throws ReedSolomonException {
        int[] iArr2 = iArr;
        int i2 = i;
        setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver = new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, iArr2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        boolean z = true;
        for (int i4 = 0; i4 < i2; i4++) {
            rsnScriptSetVarObj rsnscriptsetvarobj = this.MediaBrowserCompat$CustomActionResultReceiver;
            int IconCompatParcelizer = setvariable_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(rsnscriptsetvarobj.RatingCompat[rsnscriptsetvarobj.MediaMetadataCompat + i4]);
            iArr3[(i2 - 1) - i4] = IconCompatParcelizer;
            if (IconCompatParcelizer != 0) {
                z = false;
            }
        }
        if (!z) {
            setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver2 = new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, iArr3);
            setVariable$MediaBrowserCompat$CustomActionResultReceiver write = this.MediaBrowserCompat$CustomActionResultReceiver.write(i2, 1);
            if (write.IconCompatParcelizer.length - 1 < setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1) {
                setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver3 = write;
                write = setvariable_mediabrowsercompat_customactionresultreceiver2;
                setvariable_mediabrowsercompat_customactionresultreceiver2 = setvariable_mediabrowsercompat_customactionresultreceiver3;
            }
            setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver4 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
            setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver5 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
            while (setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1 >= i2 / 2) {
                if (!(setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer[0] == 0)) {
                    setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver6 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
                    int[] iArr4 = setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer;
                    int i5 = iArr4[(iArr4.length - 1) - (setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1)];
                    rsnScriptSetVarObj rsnscriptsetvarobj2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (i5 != 0) {
                        int i6 = rsnscriptsetvarobj2.RatingCompat[(rsnscriptsetvarobj2.f2623x50fd9e4a - rsnscriptsetvarobj2.MediaSessionCompat$Token[i5]) - 1];
                        while (write.IconCompatParcelizer.length - 1 >= setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1) {
                            if (write.IconCompatParcelizer[0] == 0) {
                                break;
                            }
                            int length = (write.IconCompatParcelizer.length - 1) - (setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1);
                            rsnScriptSetVarObj rsnscriptsetvarobj3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                            int[] iArr5 = write.IconCompatParcelizer;
                            int IconCompatParcelizer2 = rsnscriptsetvarobj3.IconCompatParcelizer(iArr5[(iArr5.length - 1) - (write.IconCompatParcelizer.length - 1)], i6);
                            setvariable_mediabrowsercompat_customactionresultreceiver6 = setvariable_mediabrowsercompat_customactionresultreceiver6.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.write(length, IconCompatParcelizer2));
                            write = write.IconCompatParcelizer(setvariable_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver(length, IconCompatParcelizer2));
                        }
                        setVariable$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer3 = setvariable_mediabrowsercompat_customactionresultreceiver6.read(setvariable_mediabrowsercompat_customactionresultreceiver5).IconCompatParcelizer(setvariable_mediabrowsercompat_customactionresultreceiver4);
                        if (write.IconCompatParcelizer.length - 1 < setvariable_mediabrowsercompat_customactionresultreceiver2.IconCompatParcelizer.length - 1) {
                            setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver7 = write;
                            write = setvariable_mediabrowsercompat_customactionresultreceiver2;
                            setvariable_mediabrowsercompat_customactionresultreceiver2 = setvariable_mediabrowsercompat_customactionresultreceiver7;
                            setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver8 = setvariable_mediabrowsercompat_customactionresultreceiver5;
                            setvariable_mediabrowsercompat_customactionresultreceiver5 = IconCompatParcelizer3;
                            setvariable_mediabrowsercompat_customactionresultreceiver4 = setvariable_mediabrowsercompat_customactionresultreceiver8;
                        } else {
                            throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                        }
                    } else {
                        throw new ArithmeticException();
                    }
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            }
            int[] iArr6 = setvariable_mediabrowsercompat_customactionresultreceiver5.IconCompatParcelizer;
            int i7 = iArr6[(iArr6.length - 1) - 0];
            if (i7 != 0) {
                rsnScriptSetVarObj rsnscriptsetvarobj4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (i7 != 0) {
                    int i8 = rsnscriptsetvarobj4.RatingCompat[(rsnscriptsetvarobj4.f2623x50fd9e4a - rsnscriptsetvarobj4.MediaSessionCompat$Token[i7]) - 1];
                    setVariable$MediaBrowserCompat$CustomActionResultReceiver[] setvariable_mediabrowsercompat_customactionresultreceiverArr = {setvariable_mediabrowsercompat_customactionresultreceiver5.MediaBrowserCompat$ItemReceiver(i8), setvariable_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$ItemReceiver(i8)};
                    setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver9 = setvariable_mediabrowsercompat_customactionresultreceiverArr[0];
                    setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver10 = setvariable_mediabrowsercompat_customactionresultreceiverArr[1];
                    int[] MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(setvariable_mediabrowsercompat_customactionresultreceiver9);
                    int[] MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(setvariable_mediabrowsercompat_customactionresultreceiver10, MediaBrowserCompat$ItemReceiver);
                    while (i3 < MediaBrowserCompat$ItemReceiver.length) {
                        int length2 = iArr2.length - 1;
                        rsnScriptSetVarObj rsnscriptsetvarobj5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        int i9 = MediaBrowserCompat$ItemReceiver[i3];
                        if (i9 != 0) {
                            int i10 = length2 - rsnscriptsetvarobj5.MediaSessionCompat$Token[i9];
                            if (i10 >= 0) {
                                iArr2[i10] = rsnScriptSetVarObj.read(iArr2[i10], MediaBrowserCompat$CustomActionResultReceiver2[i3]);
                                i3++;
                            } else {
                                throw new ReedSolomonException("Bad error location");
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    return;
                }
                throw new ArithmeticException();
            }
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
    }
}
