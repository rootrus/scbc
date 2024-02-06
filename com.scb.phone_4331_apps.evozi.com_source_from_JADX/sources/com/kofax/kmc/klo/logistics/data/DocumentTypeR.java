package com.kofax.kmc.klo.logistics.data;

import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.klo.logistics.data.DocumentType;
import java.io.Serializable;
import java.util.List;

public interface DocumentTypeR extends Serializable, Cloneable {
    @Deprecated
    BasicSettingsProfile getBasicSettingsProfile();

    String getDisplayName();

    float getDocHeight();

    float getDocWidth();

    List<FieldType> getFieldTypes();

    @Deprecated
    ImagePerfectionProfile getImagePerfectionProfile();

    ImageProcessorConfiguration getImageProcessorConfiguration();

    DocumentType.SourceServer getSourceServer();

    String getTypeName();

    String getVersion();
}
