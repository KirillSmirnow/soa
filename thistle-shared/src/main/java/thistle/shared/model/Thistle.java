package thistle.shared.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Thistle {

    private final double height;
    private final int qty;
    private final String name;
}
