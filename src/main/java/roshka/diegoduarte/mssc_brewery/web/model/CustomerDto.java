package roshka.diegoduarte.mssc_brewery.web.model;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID ID;
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;
}
