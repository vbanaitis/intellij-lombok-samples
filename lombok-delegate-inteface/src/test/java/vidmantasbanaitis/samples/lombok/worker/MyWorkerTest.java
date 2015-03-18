package vidmantasbanaitis.samples.lombok.worker;

import static org.junit.Assert.*;

import lombok.experimental.Delegate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import vidmantasbanaitis.samples.lombok.visitor.Visitor;
import vidmantasbanaitis.samples.lombok.visitor.impl.VisitorImpl;

@Slf4j
public class MyWorkerTest {

    @Delegate
    private Visitor visitor = new VisitorImpl();

    private MyWorker myWorker;

    @Before
    public void setUp() throws Exception {
        myWorker = new MyWorker();
    }

    @Test
    public void testDoWorkWithDelegation() throws Exception {
        String work = visit(myWorker).doWork();
        assertNotNull(work);
        log.debug("testDoWorkWithDelegation - Work: {}", work);
    }

    @Test
    public void testDoWorkWithoutDelegation() throws Exception {
        String work = visitor.visit(myWorker).doWork();
        assertNotNull(work);
        log.debug("testDoWorkWithoutDelegation - Work: {}", work);
    }
}
