package p040o;

import p040o.zzct;
import p040o.zzjx;

/* renamed from: o.getDomain */
public final /* synthetic */ class getDomain {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[zzct.zza.values().length];
        read = iArr;
        iArr[zzct.zza.BUSINESS_OWNER.ordinal()] = 1;
        read[zzct.zza.CONSUMER.ordinal()] = 2;
        int[] iArr2 = new int[zzct.zza.values().length];
        IconCompatParcelizer = iArr2;
        iArr2[zzct.zza.BUSINESS_OWNER.ordinal()] = 1;
        IconCompatParcelizer[zzct.zza.CONSUMER.ordinal()] = 2;
        int[] iArr3 = new int[zzjx.zze.IconCompatParcelizer.values().length];
        write = iArr3;
        iArr3[zzjx.zze.IconCompatParcelizer.SUCCESS.ordinal()] = 1;
        write[zzjx.zze.IconCompatParcelizer.PROGRESS.ordinal()] = 2;
        write[zzjx.zze.IconCompatParcelizer.PROGRESS_OFF_HOUR.ordinal()] = 3;
    }
}
