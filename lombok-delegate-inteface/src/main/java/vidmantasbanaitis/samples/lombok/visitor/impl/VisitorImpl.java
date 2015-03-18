package vidmantasbanaitis.samples.lombok.visitor.impl;

import lombok.extern.slf4j.Slf4j;
import vidmantasbanaitis.samples.lombok.visitor.Visitor;

@Slf4j
public class VisitorImpl implements Visitor {
    @Override
    public <T> T visit(T object) {
        log.debug("Lets see what we got: {}", object.getClass());
        return object;
    }
}
