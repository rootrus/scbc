package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;

/* renamed from: com.kofax.kmc.ken.engines.g */
interface C0443g {
    HorizontalGuidance getHorizontalMovementGuidance();

    TurnGuidance getTurnGuidance();

    VerticalGuidance getVerticalMovementGuidance();

    ZoomGuidance getZoomGuidance();
}
