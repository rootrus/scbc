package com.kofax.mobile.sdk.p070a;

import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import java.util.Set;

/* renamed from: com.kofax.mobile.sdk.a.b */
public interface C8240b {
    /* renamed from: a */
    Task<BarCodeResult> mo54700a(Image image, String str, String str2, Set<BarCodeType> set);
}
