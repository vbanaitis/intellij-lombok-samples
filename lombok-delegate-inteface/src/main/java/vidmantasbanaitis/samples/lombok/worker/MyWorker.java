package vidmantasbanaitis.samples.lombok.worker;

import lombok.experimental.Delegate;
import lombok.extern.slf4j.Slf4j;
import vidmantasbanaitis.samples.lombok.visitor.Visitor;

public class MyWorker {

    public String doWork(){
        return "The Work Was done";
    }
}
