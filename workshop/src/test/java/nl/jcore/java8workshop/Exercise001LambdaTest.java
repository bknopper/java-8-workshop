package nl.jcore.java8workshop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Exercise001LambdaTest {
    @Test
    public void test001OldSkoolSupplier() {
        assertNotNull(Exercise001Lambda.oldSkoolPredicate());
        assertTrue(Exercise001Lambda.oldSkoolPredicate().test(0));
        assertFalse(Exercise001Lambda.oldSkoolPredicate().test(1));
        assertTrue(Exercise001Lambda.oldSkoolPredicate().test(2));
    }

    @Test
    public void test002Predicate() {
        final String method = "predicateIsEven";
        assertNotNull(pleaseImplement(method), Exercise001Lambda.predicateIsEven());
        assertTrue(pleaseImplement(method), WorkshopUtils.isLambda(Exercise001Lambda.predicateIsEven()));
        assertTrue(Exercise001Lambda.predicateIsEven().test(0));
        assertFalse(Exercise001Lambda.predicateIsEven().test(1));
        assertTrue(Exercise001Lambda.predicateIsEven().test(2));
    }

    @Test
    public void test003Function() {
        final String method = "functionToString";
        assertNotNull(pleaseImplement(method), Exercise001Lambda.functionToString());
        assertTrue(pleaseImplement(method), WorkshopUtils.isLambda(Exercise001Lambda.functionToString()));
        assertEquals("0", Exercise001Lambda.functionToString().apply(0));
        assertEquals("1", Exercise001Lambda.functionToString().apply(1));
        assertEquals("12", Exercise001Lambda.functionToString().apply(12));
    }

    @Test
    public void test004Supplier() {
        final String method = "supplier";
        assertNotNull(pleaseImplement(method), Exercise001Lambda.supplier());
        assertTrue(pleaseImplement(method), WorkshopUtils.isLambda(Exercise001Lambda.supplier()));
        assertEquals("Hello Java 8", Exercise001Lambda.supplier().get());
    }

    @Test
    public void test005Consumer() {
        final String method = "consumer";
        assertNotNull(pleaseImplement(method), Exercise001Lambda.consumer());
        assertTrue(pleaseImplement(method), WorkshopUtils.isLambda(Exercise001Lambda.consumer()));

        /* Arrange. */
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        final String input = "FooBar";

        /* Act. */
        final Consumer consumer = Exercise001Lambda.consumer();
        consumer.accept(input);

        /* Assert. */
        assertEquals(input.trim(), outContent.toString().trim());
    }

    private String pleaseImplement(final String methodStringReference) {
        return "Please implement Exercise001Lambda::" + methodStringReference + " using a Lambda";
    }
}
