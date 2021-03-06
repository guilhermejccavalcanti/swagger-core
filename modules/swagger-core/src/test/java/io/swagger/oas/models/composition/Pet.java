package io.swagger.oas.models.composition;

import io.swagger.oas.annotations.media.Schema;

public interface Pet extends Animal {
    @Schema(required = true, description = "The pet type")
    String getType();

    void setType(String type);

    @Schema(required = true, description = "The name of the pet")
    String getName();

    void setName(String name);

    @Schema(required = true)
    Boolean getIsDomestic();

    void setIsDomestic(Boolean isDomestic);
}
