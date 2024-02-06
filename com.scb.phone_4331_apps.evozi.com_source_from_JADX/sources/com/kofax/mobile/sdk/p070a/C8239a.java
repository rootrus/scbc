package com.kofax.mobile.sdk.p070a;

import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import java.util.Set;

/* renamed from: com.kofax.mobile.sdk.a.a */
public interface C8239a {

    /* renamed from: sZ */
    public static final String f4353sZ = "ATALABAR";

    /* renamed from: ta */
    public static final String f4354ta = "MANATEE";

    /* renamed from: a */
    Task<BarCodeResult> mo54699a(Image image, Set<BarCodeType> set);
}
