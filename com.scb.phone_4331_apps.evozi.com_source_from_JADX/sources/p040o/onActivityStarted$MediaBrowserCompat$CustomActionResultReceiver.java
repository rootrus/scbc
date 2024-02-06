package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;

/* renamed from: o.onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver */
public final class onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver {
    private final int IconCompatParcelizer;
    private final rsnScriptSetVarI MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final int RatingCompat;
    private final int read;
    private final int write;

    private onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver(rsnScriptSetVarI rsnscriptsetvari) throws NotFoundException {
        this(rsnscriptsetvari, 10, rsnscriptsetvari.IconCompatParcelizer / 2, rsnscriptsetvari.write / 2);
    }

    public onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, int i3) throws NotFoundException {
        this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptsetvari;
        this.MediaBrowserCompat$ItemReceiver = rsnscriptsetvari.write;
        int i4 = rsnscriptsetvari.IconCompatParcelizer;
        this.MediaBrowserCompat$SearchResultReceiver = i4;
        int i5 = i / 2;
        int i6 = i2 - i5;
        this.read = i6;
        int i7 = i2 + i5;
        this.write = i7;
        int i8 = i3 - i5;
        this.RatingCompat = i8;
        int i9 = i3 + i5;
        this.IconCompatParcelizer = i9;
        if (i8 < 0 || i6 < 0 || i9 >= this.MediaBrowserCompat$ItemReceiver || i7 >= i4) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    private rsnScriptForEach IconCompatParcelizer(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        int i = (int) (sqrt + (sqrt < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
        float f7 = (float) i;
        float f8 = (f3 - f) / f7;
        float f9 = (f4 - f2) / f7;
        for (int i2 = 0; i2 < i; i2++) {
            float f10 = (float) i2;
            float f11 = (f10 * f8) + f;
            int i3 = (int) (f11 + (f11 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
            float f12 = (f10 * f9) + f2;
            int i4 = (int) (f12 + (f12 < BitmapDescriptorFactory.HUE_RED ? -0.5f : 0.5f));
            if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i3, i4)) {
                return new rsnScriptForEach((float) i3, (float) i4);
            }
        }
        return null;
    }

    public final rsnScriptForEach[] write() throws NotFoundException {
        boolean z;
        int i = this.read;
        int i2 = this.write;
        int i3 = this.RatingCompat;
        int i4 = this.IconCompatParcelizer;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (true) {
            if (!z7) {
                z = false;
                break;
            }
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.MediaBrowserCompat$SearchResultReceiver) {
                    z9 = MediaBrowserCompat$ItemReceiver(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.MediaBrowserCompat$SearchResultReceiver) {
                boolean z10 = true;
                while (true) {
                    if ((z10 || !z4) && i4 < this.MediaBrowserCompat$ItemReceiver) {
                        z10 = MediaBrowserCompat$ItemReceiver(i, i2, i4, true);
                        if (z10) {
                            i4++;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i4++;
                        }
                    }
                }
                if (i4 >= this.MediaBrowserCompat$ItemReceiver) {
                    break;
                }
                boolean z11 = true;
                while (true) {
                    if ((z11 || !z5) && i >= 0) {
                        z11 = MediaBrowserCompat$ItemReceiver(i3, i4, i, false);
                        if (z11) {
                            i--;
                            z5 = true;
                            z8 = true;
                        } else if (!z5) {
                            i--;
                        }
                    }
                }
                if (i < 0) {
                    break;
                }
                z7 = z8;
                boolean z12 = true;
                while (true) {
                    if ((z12 || !z6) && i3 >= 0) {
                        z12 = MediaBrowserCompat$ItemReceiver(i, i2, i3, true);
                        if (z12) {
                            i3--;
                            z7 = true;
                            z6 = true;
                        } else if (!z6) {
                            i3--;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else if (z7) {
                    z3 = true;
                }
            } else {
                break;
            }
        }
        z = true;
        if (z || !z3) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        int i5 = i2 - i;
        rsnScriptForEach rsnscriptforeach = null;
        int i6 = 1;
        rsnScriptForEach rsnscriptforeach2 = null;
        while (rsnscriptforeach2 == null && i6 < i5) {
            rsnscriptforeach2 = IconCompatParcelizer((float) i, (float) (i4 - i6), (float) (i + i6), (float) i4);
            i6++;
        }
        if (rsnscriptforeach2 != null) {
            int i7 = 1;
            rsnScriptForEach rsnscriptforeach3 = null;
            while (rsnscriptforeach3 == null && i7 < i5) {
                rsnscriptforeach3 = IconCompatParcelizer((float) i, (float) (i3 + i7), (float) (i + i7), (float) i3);
                i7++;
            }
            if (rsnscriptforeach3 != null) {
                int i8 = 1;
                rsnScriptForEach rsnscriptforeach4 = null;
                while (rsnscriptforeach4 == null && i8 < i5) {
                    rsnscriptforeach4 = IconCompatParcelizer((float) i2, (float) (i3 + i8), (float) (i2 - i8), (float) i3);
                    i8++;
                }
                if (rsnscriptforeach4 != null) {
                    int i9 = 1;
                    while (rsnscriptforeach == null && i9 < i5) {
                        rsnscriptforeach = IconCompatParcelizer((float) i2, (float) (i4 - i9), (float) (i2 - i9), (float) i4);
                        i9++;
                    }
                    if (rsnscriptforeach != null) {
                        float f = rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver;
                        float f2 = rsnscriptforeach.read;
                        float f3 = rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver;
                        float f4 = rsnscriptforeach2.read;
                        float f5 = rsnscriptforeach4.MediaBrowserCompat$CustomActionResultReceiver;
                        float f6 = rsnscriptforeach4.read;
                        float f7 = rsnscriptforeach3.MediaBrowserCompat$CustomActionResultReceiver;
                        float f8 = rsnscriptforeach3.read;
                        if (f < ((float) this.MediaBrowserCompat$SearchResultReceiver) / 2.0f) {
                            return new rsnScriptForEach[]{new rsnScriptForEach(f7 - 1.0f, f8 + 1.0f), new rsnScriptForEach(f3 + 1.0f, f4 + 1.0f), new rsnScriptForEach(f5 - 1.0f, f6 - 1.0f), new rsnScriptForEach(f + 1.0f, f2 - 1.0f)};
                        }
                        return new rsnScriptForEach[]{new rsnScriptForEach(f7 + 1.0f, f8 + 1.0f), new rsnScriptForEach(f3 + 1.0f, f4 - 1.0f), new rsnScriptForEach(f5 - 1.0f, f6 + 1.0f), new rsnScriptForEach(f - 1.0f, f2 - 1.0f)};
                    }
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
