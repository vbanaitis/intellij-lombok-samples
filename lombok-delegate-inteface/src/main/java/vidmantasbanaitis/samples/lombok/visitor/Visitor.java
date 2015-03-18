package vidmantasbanaitis.samples.lombok.visitor;

public interface Visitor {
    <T> T visit(T object);
}
